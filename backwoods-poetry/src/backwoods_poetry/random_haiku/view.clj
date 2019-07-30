(ns backwoods-poetry.random-haiku.view
  (:use [hiccup.page] [hiccup.element] [hiccup.form])
  (:require
   [backwoods-poetry.random-haiku.middleware :refer [first-line second-line third-line line-generator]]
   [backwoods-poetry.views :refer [footer]]))

(defn random-haiku
  [word-list]
  [:div {:id "content"}
   [:h1 {:class "text-success"} "shitty random haikus"]
   [:p {:class "haiku-line"} (line-generator (first-line word-list))]
   [:p {:class "haiku-line"} (line-generator (second-line word-list))]
   [:p {:class "haiku-line"} (line-generator (third-line word-list))]
   (link-to {:class "btn btn-primary"} "/random-haiku" "inspire me more")
   (footer)
   ])
