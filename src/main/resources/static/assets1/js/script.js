function printTable() {
    // Get the table element
    var el = document.getElementById("toPrint");
    el.setAttribute('border', '1px');
    el.setAttribute('cellpadding', '5');
    
    // Create the print window
    newPrint = window.open("");
    
    // Write the document with proper headers and styling
    newPrint.document.write('<html><head><title>MoWIMS Device Report</title>');
    newPrint.document.write('<style>');
    newPrint.document.write('@media print { table, th, td { border: 1px solid black; border-collapse: collapse; } th, td { padding: 8px; } }');
    newPrint.document.write('.print-header { position: relative; height: 100px; margin-bottom: 20px; }');
    newPrint.document.write('.logo-left { position: absolute; left: 0; top: 0; width: 100px; }');
    newPrint.document.write('.logo-right { position: absolute; right: 0; top: 0; width: 100px; }');
    newPrint.document.write('h1, h3 { text-align: center; margin: 5px 0; }');
    newPrint.document.write('</style>');
    newPrint.document.write('</head><body>');
    
    // Add the header with logos
    newPrint.document.write('<div class="print-header">');
    newPrint.document.write('<img src="assets/img/emblem.png" alt="Logo Left" class="logo-left" onload="this.onload=null; this.src=\'assets/img/emblem.png\';">');
    newPrint.document.write('<img src="assets/img/drop.png" alt="Logo Right" class="logo-right" onload="this.onload=null; this.src=\'assets/img/drop.png\';">');
    newPrint.document.write('<h1>Ministry of Water</h1>');
    newPrint.document.write('<h3>ICT Department</h3>');
    newPrint.document.write('</div>');
    
    // Add the table content
    newPrint.document.write(el.outerHTML);
    
    // Add footer with date
    var date = new Date();
    var formattedDate = date.toLocaleDateString();
    newPrint.document.write('<footer style="margin-top: 20px; text-align: center;">Printed on: ' + formattedDate + '</footer>');
    
    newPrint.document.write('</body></html>');
    newPrint.document.close();
    
    // Wait for images to load before printing
    setTimeout(function() {
        newPrint.print();
        // Don't close the window immediately to allow proper printing
    }, 500);
}
