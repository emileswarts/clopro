(ns clopro.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [clopro.layout :refer [error-page]]
            [clopro.routes.home :refer [home-routes]]
            [compojure.route :as route]
            [clopro.middleware :as middleware]))

(def app-routes
  (routes
    (wrap-routes #'home-routes middleware/wrap-csrf)
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))

(def app (middleware/wrap-base #'app-routes))
