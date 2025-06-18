import getData from "./getData.js";

const btnQuote = document.querySelector(".btn-quote");
const cardDescription = document.getElementById("card-description");

function loadInfoSerie() {
    getData(`/series/quotes`)
        .then((data) => {
            cardDescription.innerHTML = `
              <img src="${data.poster}" alt="${data.title}" />
              <div>
                  <h2>${data.title}</h2>
                  <div class="description-text">
                      <p><i>"${data.quote}"</i></p>
                      <p><b>Quote by:</b> ${data.character}</p>
                  </div>
              </div>
          `;
        })
        .catch((error) => {
            console.error("Error getting series information:", error);
        });
}

window.onload = loadInfoSerie();
btnQuote.addEventListener("click", loadInfoSerie);
