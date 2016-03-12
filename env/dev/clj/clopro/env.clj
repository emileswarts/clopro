(ns clopro.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [clopro.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clopro started successfully using the development profile]=-"))
   :middleware wrap-dev})
