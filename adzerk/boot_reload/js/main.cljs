(ns adzerk.boot-reload.js.main (:require [adzerk.boot-reload.client :as client] nilt.ui.main))
(client/connect "ws://localhost:42373" {:ws-host nil, :asset-host nil, :on-jsload (fn* [] (nilt.ui.main/init!))})