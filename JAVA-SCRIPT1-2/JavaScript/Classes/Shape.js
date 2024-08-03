class Shape {

    static PI = 3.14

    constructor() {
        document.write('this is default constructor.....');
    }

    setColor(color) {
        this.color = color;
    }

    getColor() {
        return this.color
    }

    setBorderWidth(bw) {
        this.borderWidth = bw;
    }

    getBorderWidth() {
        return this.borderWidth;
    }

    area() {

        document.write('area method.......');

    }
}