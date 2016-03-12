(ns clopro.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[clopro started successfully]=-"))
   :middleware identity})
