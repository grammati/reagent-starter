(ns reagent-starter.core
    (:require [reagent.core :as reagent]))


(defonce app-state (reagent/atom {:title "Hello World!"
                                  :thing {:counter 0}}))

(defn thing [state]
  [:div
   [:span.foo (str "Counter is " (:counter @state))]
   [:input {:type     "button"
            :value    "Inc!"
            :on-click #(swap! state update-in [:counter] inc)}]])

(defn my-app []
  [:div
   [:h1 (:title @app-state)]
   [thing (reagent/cursor app-state [:thing])]])

(defn mount-root []
  (reagent/render [my-app] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
