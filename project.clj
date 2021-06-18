(defproject com.walmartlabs/lacinia-pedestal "0.16"
  :description "Pedestal infrastructure supporting Lacinia GraphQL"
  :url "https://github.com/walmartlabs/pedestal-lacinia"
  :license {:name "Apache Software License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [com.walmartlabs/lacinia "0.38.0"]
                 [com.fasterxml.jackson.core/jackson-core "2.12.3"]
                 [io.pedestal/pedestal.service "0.5.8"]
                 [io.pedestal/pedestal.jetty "0.5.8"]
                 [org.clojure/data.json "2.3.1"]]
  :profiles
  {:dev {:dependencies [[clj-http "3.11.0"]
                        [com.walmartlabs/test-reporting "1.0.0"]
                        [com.stuartsierra/component "1.0.0"]
                        [expound "0.8.9"]
                        [stylefruits/gniazdo "1.2.0"
                         :exclusions [org.eclipse.jetty.websocket/websocket-client]]
                        [io.aviso/logging "1.0"]]}}
  :jvm-opts ["-Xmx500m"]
  :plugins [[lein-codox "0.10.7"]
            [test2junit "1.3.0"]
            [lein-shell "0.5.0"]]
  :shell {:dir "resources/graphiql"}
  :prep-tasks [["shell" "./build"]]
  :jar-exclusions [#"graphiql/node_.*"
                   #"graphiql/build"
                   #"graphiql/package.json"
                   #".*/\.DS_Store"]
  :codox {:source-uri "https://github.com/walmartlabs/pedestal-lacinia/blob/master/{filepath}#L{line}"
          :metadata {:doc/format :markdown}})
