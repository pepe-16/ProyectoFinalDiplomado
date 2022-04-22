// Cambia el selector si es necesario
var $table = $('table.scroll'),
    $bodyCells = $table.find('tbody tr:first').children(),
    colWidth;

// Ajusta el ancho de las celdas de la celda cuando la ventana cambia de tamaño
$(window).resize(function() {
    // Obtiene la matriz de ancho de las columnas tbody
    colWidth = $bodyCells.map(function() {
        return $(this).width();
    }).get();

    // Establece el ancho de las columnas
    $table.find('thead tr').children().each(function(i, v) {
        $(v).width(colWidth[i]);
    });    
}).resize(); // Controlador de cambio de tamaño del disparador