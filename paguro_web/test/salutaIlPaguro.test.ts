import * as testMain from "../src/main"

test('Saluta il paguro', () => {
  expect(testMain.salutaIlPaguro()).toBe("Ciao paguro!");
});

test('Saluta il paguro personalizzato', () => {
  expect(testMain.salutaIlPaguroPersonalizzato("bel")).toBe("Ciao bel paguro!");
});