(ns kimberlite.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [qbits.alia :as alia]
            [qbits.hayt :as hayt]
            [environ.core :refer [env]]))

(def cassandra-cluster (alia/cluster {:contact-points [(env :contact-points)]}))
(def session (alia/connect cassandra-cluster))

(alia/execute session (hayt/create-keyspace "kimberlite" (hayt/if-exists false) (hayt/with {:replication
                           {:class "SimpleStrategy"
                            :replication_factor 1}})))

(defroutes app-routes
  (GET "/" [] "Kimberlite Server")
  (GET "/status" [] (str "Contact Points: " (env :contact-points)))
  (POST "/data" [] "OK"))
  (GET "/data" [] "")
  (route/not-found "Not Found")

(def app
  (wrap-defaults app-routes site-defaults))
