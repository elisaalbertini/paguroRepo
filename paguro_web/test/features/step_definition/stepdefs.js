const assert = require('assert');
const { Given, When, Then } = require('@cucumber/cucumber');

function amIAPaguro(isPaguro){
	return isPaguro;
}

Given('I\'m not a paguro', function () {
	this.isPaguro = "Nope";
});

When('I ask if I am a paguro', function () {
	this.actualAnswer = amIAPaguro(this.isPaguro);
  });

  Then('I should be told {string}', function (expectedAnswer) {
	assert.strictEqual(this.actualAnswer, expectedAnswer) //la expectedAnswer la prende dalla feature
  });
