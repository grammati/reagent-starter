(ns reagent-starter.prod
  (:require [reagent-starter.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
