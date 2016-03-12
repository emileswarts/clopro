(ns user
  (:require [mount.core :as mount]
            clopro.core))

(defn start []
  (mount/start-without #'clopro.core/repl-server))

(defn stop []
  (mount/stop-except #'clopro.core/repl-server))

(defn restart []
  (stop)
  (start))


