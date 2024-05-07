const helmet = require('helmet');
const app = helmet();

export function salutaIlPaguro() : string {
    return "Ciao paguro!";
}

export function salutaIlPaguroPersonalizzato(personalizzazione : string) : string {
    return "Ciao " + personalizzazione + " paguro!";
}

export function complimentaIlPaguro() : string {
    return "Bel paguro!";
}