/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
    if (obj === null || obj === undefined || typeof classFunction !== 'function') {
        return false;
    }

    // If obj is a primitive, box it (e.g. 5 → new Number(5))
    if (typeof obj !== 'object' && typeof obj !== 'function') {
        obj = Object(obj);
    }

    let proto = Object.getPrototypeOf(obj);

    while (proto !== null) {
        if (proto === classFunction.prototype) return true;
        proto = Object.getPrototypeOf(proto);
    }

    return false;
};
