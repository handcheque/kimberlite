(defproject kimberlite "0.1.0-SNAPSHOT"
  :description "An auditable immutable datastore with focus on write performance"
  :url "https://github.com/handcheque/kimberlite"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [environ "1.1.0"]
                 [cc.qbits/alia-all "3.2.0"]
                 [cc.qbits/hayt "3.2.0"]]
  :plugins [[lein-ring "0.9.7"]
            [lein-environ "1.1.0"]]
  :ring {:handler kimberlite.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
