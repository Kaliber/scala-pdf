# Scala PDF module

This module helps in generating PDF documents dynamically from your Scala application.
It simply renders your HTML- and CSS-based templates to PDF.

It is based on the Flying Saucer library, which in turn uses iText for PDF generation.

## Installation
```
libraryDependencies += "net.kaliber" %% "scala-pdf" % "0.12"

resolvers += "Kaliber Repository" at "https://jars.kaliber.io/artifactory/libs-release-local"
```

## Usage

```
val body = /* some xhtml string */
val renderer = new PdfRenderer(classLoader)
val bytes = renderer.toBytes(body)
```

Please see the `Test.scala` file for an example of loading.

## Releases

<table>
  <tr>
    <td>0.12</td>
    <td>2018-04-12</td>
    <td>Upgrade to Scala 2.12.x</td>
    <td>Change test framework to org.scalatest</td>
    <td></td>
  <tr>
  <tr>
    <td>0.11</td>
    <td>2016-04-29</td>
    <td>Changed organisation</td>
    <td></td>
  <tr>
    <td>0.10</td>
    <td>29.04.2016</td>
    <td>Radical rewrite</td>
    <td></td>
  </tr>
  <tr>
    <td>0.9</td>
    <td>29.01.2016</td>
    <td>Set sharedContext on userAgent</td>
    <td></td>
  </tr>
  <tr>
    <td>0.8</td>
    <td>27.04.2015</td>
    <td>Removed Play framework dependencies</td>
    <td></td>
  </tr>
  <tr>
    <td>0.7</td>
    <td>19.02.2015</td>
    <td>Java => Scala</td>
    <td></td>
  </tr>
  <tr>
    <td>0.6</td>
    <td>07.01.2015</td>
    <td>Play 2.3</td>
    <td></td>
  </tr>
  <tr>
    <td>0.5</td>
    <td>11.06.2013</td>
    <td>Fix with higher UTF-8 codes, documentBaseURL</td>
    <td>Thanks Wolfert de Kraker</td>
  </tr>
  <tr>
    <td>0.4</td>
    <td>08.02.2013</td>
    <td>Play 2.1</td>
    <td></td>
  </tr>
  <tr>
    <td>0.4</td>
    <td>04.02.2013</td>
    <td>Play 2.1.RC4, remote images</td>
    <td></td>
  </tr>
  <tr>
    <td>0.3</td>
    <td>15.06.2012</td>
    <td>CSS handling</td>
    <td></td>
  </tr>
  <tr>
    <td>0.2</td>
    <td>21.05.2012</td>
    <td>Font handling</td>
    <td></td>
  </tr>
  <tr>
    <td>0.1</td>
    <td>18.05.2012</td>
    <td>Initial release</td>
    <td></td>
  </tr>
</table>
