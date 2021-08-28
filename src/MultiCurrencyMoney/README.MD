# Chapter 1 Multi-Currency Money

> Test-Driven Development cycle:
> 1. Add a little test.
> 2. Run all tests and fail.
> 3. Make a little change.
> 4. Run the tests and succeed.
> 5. Refactor to remove duplication.

## Task

Generate a report with multi-currency. Suppose we have a report like this:

|Instrument|Shares|Price|Total|
|:---:|:---:|:---:|:---:|
|IBM|1000|25|25000|
|GE|400|100|40000|
| | |Total|65000|

To make a multi-currency report, we need to add currencies:

|Instrument|Shares|Price|Total|
|:---:|:---:|:---:|:---:|
|IBM|1000|25 USD|25000 USD|
|GE|400|150 CHF|60000 CHF|
| | |Total|65000 USD|

We also need to specify exchange rates:

|From|To|Rate|
|:---:|:---:|:---:|
|CHF|USD|1.5|


## Problem abstraction

- $5 + 10 CHF = $10 if rate is 2:1
- $5 × 2 = $10

In conclusion:

- need to be able to add amounts in two different currencies and convert the result given a set of exchange rates.
- need to be able to multiply an amount (price per share) by a number (number of shares) and receive an amount.

## Tasking List

- $5+ 10 CHF = $10 if rate is 2:1
- ~~$5 * 2 = $10~~
- Make "amount" private
- Dollar side effects?
- Money rounding?