(defproject datomic-tutorial "0.1.0-SNAPSHOT"
  :description "Cubic Zirconia Tutorials - Small, detailed, clear and cheap.  The Datomic Tutorial"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha19"]
                 [com.datomic/datomic-free "0.9.5561" :exclusions [joda-time org.slf4j/slf4j-nop]]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
