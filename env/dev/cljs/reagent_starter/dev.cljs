(ns ^:figwheel-no-load reagent-starter.dev
  (:require [reagent-starter.core :as core]
            [figwheel.client :as figwheel :include-macros true]))


(enable-console-print!)

(figwheel/watch-and-reload
  :websocket-url "ws://localhost:3449/figwheel-ws"
  :jsload-callback core/mount-root)

(core/init!)
