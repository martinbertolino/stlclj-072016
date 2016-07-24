(defproject stlclj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [instaparse "1.4.2"]
                 [rhizome "0.2.7"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/data.csv "0.1.3"]
                 [org.clojure/data.xml "0.0.8"]
                 [cheshire "5.6.3"]
                 [cljfmt "0.3.0"]]
  :plugins [[cljfmt "0.3.0"]]
  :main ^:skip-aot stlclj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
