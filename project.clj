(defproject reagent-starter "0.1.0-SNAPSHOT"
  
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license "MIT License"

  :source-paths ["src/clj" "src/cljs"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3211"]
                 [reagent "0.5.0"]]

  :plugins [[lein-cljsbuild "1.0.5"]
            [lein-figwheel "0.3.1"]]

  :clean-targets ^{:protect false} ["resources/public/js"]

  :profiles {:dev {:source-paths ["dev/clj"]}}

  :cljsbuild {:builds
              {:dev  {:source-paths ["src/cljs" "dev/cljs"]
                      :compiler {:output-to     "resources/public/js/dev.js"
                                 :output-dir    "resources/public/js/out"
                                 :asset-path    "js/out"
                                 :optimizations :none
                                 :pretty-print  true
                                 :source-map    true
                                 :main          "reagent-starter.dev"
                                 }}
               :prod {:source-paths ["src/cljs" "prod/cljs"]
                      :compiler {:output-to     "resources/public/js/prod.js"
                                 :optimizations :advanced
                                 :pretty-print  false
                                 :main          "reagent-starter.prod"
                                 }}}}

  :figwheel {:http-server-root "public"
             :server-port      3449
             :nrepl-port       7888
             :css-dirs         ["resources/public/css"]}

  ) 
