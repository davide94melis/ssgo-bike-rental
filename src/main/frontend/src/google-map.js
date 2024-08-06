import { Loader } from "@googlemaps/js-api-loader";

window.initMap = function() {
  const loader = new Loader({
    apiKey: "AIzaSyDvp9nPnbzGgyuTY64t9rqaF3XwvLxJFOA",
    version: "weekly",
  });

  loader.load().then(() => {
    const map = new google.maps.Map(document.getElementById("map"), {
      center: { lat: -34.397, lng: 150.644 },
      zoom: 8,
    });
  });
};
