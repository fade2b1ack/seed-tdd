# seed-tdd
tdd





练习题目
=================

tdd-train-measure


 * 实现一个库: 通过这个库,用户可以以Mile为单位来表示一个长度, 精度为1。 并且,可以对比两个长度的相等性.

 * 用户除了可以使用Mile为单位来表示长度之外,还可以使用Yard为单位来表示长 度,其中:
    * 当以Mile为单位来表示一个长度时;
    * 当以Yard为单位来表示一个长度时;
    * 能够对比任意两个长度的相等性 :

        * 1 Mile == 1760 Yard
        * 3 Yard == 3 Yard
        * 1 Mile != 1761 Yard o 3 Yard != 4 Yard

 * 增加两个新的长度单位,Feet和Inch,用户可以使用它们为单位来表现一个长度。 其中:

    * 1 Yard == 3 Feet
    * 1 Feet == 12 Inch
    * 当用Feet为单位来表示长度的时候。
    * 当用Inch为单位来表示长度的时候。

 * 并实现单位之间的加减换算.
