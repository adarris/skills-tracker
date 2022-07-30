// Write your helper functions here!
// require('isomorphic-fetch');

function addDestinationInfo(document, name, diameter, star, distance, moons, imageUrl) {
   // Here is the HTML formatting for our mission target div.
   /*
                <h2>Mission Destination</h2>
                <ol>
                    <li>Name: </li>
                    <li>Diameter: </li>
                    <li>Star: ${star}</li>
                    <li>Distance from Earth: </li>
                    <li>Number of Moons: </li>
                </ol>
                <img src="">
   */
}


function validateInput(testInput) {
   if (testInput === '') {
    return 'Empty';
   } else if (isNaN(testInput)){
    return 'Not a Number';
   } else if (!isNaN(testInput)) {
    return 'Is a Number';
   }
}

function formSubmission(document, list, pilot, copilot, fuelLevel, cargoLevel) {
    let form = document.getElementById("testForm");
    form.addEventListener("submit", function(event) {
        let pilotNameInput = document.querySelector("input[name=pilotName]");
        let copilotNameInput = document.querySelector("input[name=copilotName");
        let fuelLevelInput = document.querySelector("input[name=fuelLevel");
        let cargoMassInput = document.querySelector("input[name=cargoMass");
        let changePilot = document.getElementById("pilotStatus");
        let changeCopilot = document.getElementById("copilotStatus");
        let changeFuelLevel = document.getElementById("fuelStatus");
        let changeCargoLevel = document.getElementById("cargoStatus");
        let changeFaultyItems = document.getElementById("faultyItems");
        let statusOfLaunch = document.getElementById("launchStatus");
            if (pilotNameInput === '' || copilotNameInput === '' || fuelLevelInput === '' || cargoMassInput === ''){
            alert('All fields required.');
            event.preventDefault();
            } else if (validateInput(pilot) === 'Empty' || validateInput(pilot)==='Is a Number') {
                alert("Please use letters only for the Pilot's name");
                event.preventDefault();
            } else if (validateInput(copilot) === 'Empty' || validateInput(copilot) === 'Is a Number'){
                alert("Please use letters only for the Co-pilot's name");
                event.preventDefault();
            } else if (validateInput(fuelLevel) === 'Empty' || validateInput(fuelLevel) === 'Not a Number'){
                alert("Please use numbers only for the Fuel Level");
                event.preventDefault();
            } else if (validateInput(cargoLevel) === 'Empty' || validateInput(cargoLevel) === 'Not a Number'){
                alert("Please use numbers only for the Cargo Level");
                event.preventDefault();
            } else {
                changePilot.innerHTML = `${pilot} Ready`;
                changeCopilot.innerHTML = `${copilot} Ready`;
                if (fuelLevel < 10000) {
                    changeFaultyItems = makevisible
                    changeFuelLevel.innerHTML = 'Not enough fuel for the journey.';
                    statusOfLaunch.innerHTML = 'Shuttle not ready for launch';
                    statusOfLaunch.style.color = "red";
                } else if (cargoLevel > 10000) {
                    changeFaultyItems = makevisible
                    changeCargoLevel.innerHTML = 'Too much mass for the shuttle to take off';
                    statusOfLaunch.innerHTML = 'Shuttle not ready for launch';
                    statusOfLaunch.style.color = "red";
                } else {
                    statusOfLaunch.innerHTML = 'Shuttle is ready for launch';
                    statusOfLaunch.style.color = "green";
                }
            }
    });
    
 

    changeFaultyItems.addDestinationInfo


    //formSubmission() will take in a document parameter and strings representing the pilot, co-pilot, fuel level, and cargo mass. Using the values in those strings and the document parameter for your HTML document, update the shuttle requirements as described below. Make sure to call your formSubmission() function at the appropriate time in your script.js file!
    //make list visible if meets requirements
   //need to use validate input function here
   //be sure to call formSubmission in script.js file
}

async function myFetch() {
    let planetsReturned;

    planetsReturned = await fetch().then( function(response) {
        });

    return planetsReturned;
}

function pickPlanet(planets) {
}

//module.exports.addDestinationInfo = addDestinationInfo;
//module.exports.validateInput = validateInput;
//module.exports.formSubmission = formSubmission;
//module.exports.pickPlanet = pickPlanet; 
//module.exports.myFetch = myFetch;
