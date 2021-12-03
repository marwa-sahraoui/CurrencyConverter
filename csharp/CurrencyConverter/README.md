# CurrencyConverter

## Installer l'extension Specflow à Visual Studio

Menu : Extensions\Manage Extensions\
Chercher "specflow" 

## Installer le client specflow

```` dotnet tool install --global SpecFlow.Plus.LivingDoc.CLI ````

## Pour générer le rapport specflow :

- lancer le rapport sans le statut

```` livingdoc feature-folder C:\DEV\JamCode\CurrencyConverter\csharp\CurrencyConverter\CurrencyConverter.Tests ````

- lancer le rapport avec le statut des execusions des tests 

```` livingdoc feature-folder C:\DEV\JamCode\CurrencyConverter\csharp\CurrencyConverter\CurrencyConverter.Tests -t C:\DEV\JamCode\CurrencyConverter\csharp\CurrencyConverter\CurrencyConverter.Tests\bin\Debug\netcoreapp3.1\TestExecution.json ````
