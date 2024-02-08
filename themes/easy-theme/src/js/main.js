/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

/*
 * This function gets loaded when all the HTML, not including the portlets, is
 * loaded.
 */
AUI().ready(function () {});

/*
 * This function gets loaded after each and every portlet on the page.
 *
 * portletId: the current portlet's id
 * node: the Alloy Node object of the current portlet
 */
Liferay.Portlet.ready(function (_portletId, _node) {});

/*
 * This function gets loaded when everything, including the portlets, is on
 * the page.
 */
Liferay.on('allPortletsReady', function () {});


function showChat(){
    console.log("showing");
    document.getElementById("chatArea").style.display="block";
}
function hideChat(){
    console.log("hiding");
    document.getElementById("chatArea").style.display="none";
}
window.onload = function () {


    const CHATGPT_API_KEY = "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";
    const CHATGPT_API_URL = "https://api.openai.com/v1/chat/completions";

    var sendBtnElem = document.getElementById("sendBtn");
    var chatMessageElem = document.getElementById("chatMessage");
    var chatOutputElem = document.getElementById("chatOutput");
    var loadingContainerElem = document.getElementById("loadingContainer");

    sendBtnElem.addEventListener("click", function () {
        var message = chatMessageElem.value;
        if (message != null && message != "") {
            generateUserChatBubble(message);
            loadingContainerElem.classList.remove("d-none");
            sendChatGPTMessage(message, generateAIChatBubble);
            chatMessageElem.value = "";
        } else {
            alert("Please enter a message.");
        }
    });

    function generateUserChatBubble(message) {
        // Create a new chat bubble wrapper.
        var chatBubbleElem = document.createElement("div");
        chatBubbleElem.classList.add("container");
        chatBubbleElem.classList.add("user-container");

        // Create the message container.
        var chatMessageElem = document.createElement("p");
        chatMessageElem.innerHTML = message;
        chatBubbleElem.appendChild(chatMessageElem);

        chatOutputElem.append(chatBubbleElem);
    }

    function generateAIChatBubble(message) {
        // Create a new chat bubble wrapper.
        var chatBubbleElem = document.createElement("div");
        chatBubbleElem.classList.add("container");
        chatBubbleElem.classList.add("darker");

        // Create the message container.
        var chatMessageElem = document.createElement("p");
        chatMessageElem.innerHTML = message;
        chatBubbleElem.appendChild(chatMessageElem);

        chatOutputElem.append(chatBubbleElem);
        loadingContainerElem.classList.add("d-none");
    }

    function sendChatGPTMessage(message, onSuccessCallback) {
        var messageBody = {
            "model": "gpt-3.5-turbo",
            "messages": [{
                "role": "user",
                "content": message.trim()
            }]
        };

        const xhttp = new XMLHttpRequest();
        xhttp.onload = function () {
            // Parse the response body into JSON object.
            var responseBodyObj = JSON.parse(this.responseText);
            // I'm cheating a little as I know which property I need. I recommend making this more robust.
            // If you want to see the response object itself then log it to the console and learn!
            onSuccessCallback(responseBodyObj.choices[0].message.content);
        }
        xhttp.open("POST", CHATGPT_API_URL, true);
        // Some simple headers are required for this to work properly with their API.
        xhttp.setRequestHeader("Content-Type", "application/json");
        xhttp.setRequestHeader("Authorization", "Bearer " + CHATGPT_API_KEY);
        xhttp.send(JSON.stringify(messageBody));
    }
};









