
var Subject = function () {
    this.observers = [];

    this.addObserver = function(observer) {
        this.observers.push(observer);
    };

    this.notifyObservers = function() {
        for (let i in this.observers) {
            this.observers[i].notify();
        }
    }
}


var Observer = function() {

    // Override this
    function notify() {
        throw "Not implemented.";
    }
}


// FLOW:

// A subject for the data
var subject = new Subject();

var a = new Observer();
a.notify = function() {
    console.log("DO something...");
}


var b = new Observer();
b.notify = function() {
    console.log("DO something different...");
}

// Register the observers
subject.addObserver(a);
subject.addObserver(b);


// Notify observers
subject.notifyObservers();