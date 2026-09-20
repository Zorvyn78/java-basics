# Java 基础语法练习

学习 Java 基础语法时的课堂演示与课后练习代码（配套黑马程序员 Java 入门课程）。

## 环境要求

- **JDK 8+**（全部代码为标准语法，任意版本可编译运行；开发使用 JDK 25）
- **IntelliJ IDEA**（推荐）或其他任意 IDE

## 项目结构

代码按学习主题分成了 7 个包（文件夹），每个包对应一个 Java `package`：

```
untitled/
├── src/
│   ├── basics/     # 入门：第一个程序、顺序结构
│   ├── variables/  # 字面量、数据类型、变量
│   ├── operators/  # 运算符（算术、赋值、比较、逻辑、三元）
│   ├── scanner/    # 键盘录入（Scanner）
│   ├── ifelse/     # 分支（if / else if / switch）
│   ├── loop/       # 循环（for、while）
│   ├── array/      # 数组（定义、索引、遍历、练习）
│   └── exercises/  # 综合练习
├── README.md
└── .gitignore
```

## 如何运行

方式一：命令行编译运行

```bash
# 编译 src 下所有文件
javac -d out $(find src -name "*.java")

# 运行某个类（注意要带包名）
java -cp out basics.HelloWorld
java -cp out variables.VariableTest
java -cp out operators.LogicoperatorDemo1
```

方式二：用 IntelliJ IDEA 直接打开项目，在任意文件里点击 `main` 方法左侧的绿色三角运行。

> 部分程序需要键盘输入（`Scanner`），请在控制台输入数字后回车。

## 内容清单

### basics —— 入门

| 文件 | 内容 |
|:---|:---|
| `HelloWorld.java` | 第一个程序：main 方法入口 + 输出语句 |
| `OrderDemo.java` | 顺序结构：代码从上往下依次执行 |

### variables —— 字面量、数据类型、变量

| 文件 | 内容 |
|:---|:---|
| `ValueDemo1.java` | 字面量的分类（整数、小数、字符串、字符、布尔、空） |
| `ValueDemo2.java` | 制表符 `\t` 的用法 |
| `ValueDemo3.java` | 基本数据类型（8 种）的定义与输出 |
| `VariableDemo1.java` | 变量定义格式：`数据类型 变量名 = 数据值;` |
| `VariableDemo2.java` | 变量基本用法、重新赋值、一条语句定义多个变量 |
| `VariableTest.java` | 练习：公交车到站乘客计数 |
| `VariableTest2.java` | 练习：个人信息（姓名/年龄/性别/身高） |
| `VariableTest3.java` | 练习：电影信息输出 |
| `VariableTest4.java` | 练习：手机价格与品牌 |

### operators —— 运算符

| 文件 | 内容 |
|:---|:---|
| `ArithmeticoperatorDemo1.java` | `+` `-` `*` 运算，小数参与计算可能不精确 |
| `ArithmeticoperatorDemo2.java` | `/` 除法（整数相除得整数）和 `%` 取余 |
| `ArithmeticoperatorDemo5.java` | `++` `--` 自增自减 |
| `AssigningoperatorDemo1.java` | `+=` 赋值运算符（底层隐含强制转换） |
| `CompareoperatorDemo1.java` | `==` 和 `!=` 比较运算符 |
| `LogicoperatorDemo1.java` | `&` 逻辑与、`\|` 逻辑或 |
| `LogicoperatorDemo2.java` | `^` 异或、`!` 取反 |
| `LogicoperatorDemo3.java` | `&&` `\|\|` 短路效果 |
| `TernaryoperatorDemo1.java` | 三元运算符求两个数的较大值 |

### scanner —— 键盘录入

| 文件 | 内容 |
|:---|:---|
| `ScannerDemo1.java` | Scanner 使用三步：导包、创建对象、接收数据 |
| `ScannerTest.java` | 练习：键盘录入两个数并求和 |

### ifelse —— 分支（if / switch）

| 文件 | 内容 |
|:---|:---|
| `IfDemo.java` | 练习：女婿酒量判断 |
| `Test6.java` | 练习：排名判断 |
| `Test7.java` | 练习：红绿灯判断（多个独立 if） |
| `Test8.java` | 练习：根据身上钱数选择餐厅（if-else） |
| `Test9.java` | 练习：付款金额判断 |
| `Test10.java` | 练习：按票号奇偶决定坐左边还是右边 |
| `Test11.java` | 练习：成绩奖励（嵌套 if 判断成绩是否合法） |
| `Test12.java` | 练习：会员等级折扣（if-else if） |
| `SwitchDemo1.java` | switch 的基本用法：按面食种类决定吃什么 |
| `Test13.java` | 练习：switch 按星期几决定运动项目 |

### loop —— 循环（for / while）

| 文件 | 内容 |
|:---|:---|
| `ForDemo1.java` | for 循环：重复打印 10 次 |
| `WhileDemo1.java` | while 循环：打印 1~100 |
| `Test14.java` | 练习：for 正序 1~5 + 倒序 5~1 |
| `Test15.java` | 练习：倒计时（5 秒后自动重连） |
| `Test16.java` | 练习：1~5 累加求和（累加变量要定义在循环外） |
| `Test17.java` | 练习：1~100 的偶数和 |
| `Test18.java` | 练习：统计范围内同时是 3 和 5 的倍数的个数 |
| `Test19.java` | 练习：纸张对折多少次能超过珠穆朗玛峰高度 |
| `Test20.java` | 练习：回文数判断（数字反转） |
| `Test21.java` | 练习：用减法实现除法（统计能减几次） |
| `InfiniteloopDemo1.java` | 无限循环：`while(true)` 永远执行 |
| `SkipLoopDemo1.java` | `continue`：跳过某一次循环（跳过第 3 个包子） |
| `SkipLoopDemo2.java` | `break`：结束整个循环（吃到第 3 个就停） |
| `LoopTest1.java` | 练习：逢 7 过（含 7 或 7 的倍数输出「过」，continue） |
| `LoopTest2.java` | 练习：求一个数的平方根（break 提前结束） |
| `LoopTest3.java` | 练习：判断一个数是否为质数（flag + break） |
| `LoopTest5.java` | 练习：Random 生成随机数（0~100） |
| `LoopTest6.java` | 练习：生成任意区间随机数的技巧（包头不包尾） |
| `LoopTest7.java` | 练习：猜数字游戏（while 无限循环 + break） |

### array —— 数组

| 文件 | 内容 |
|:---|:---|
| `ArrayDemo1.java` | 数组的两种定义格式 + 地址值含义（`[D@776ec8df` 解读） |
| `ArrayDemo2.java` | 用索引访问数组元素（获取 `arr[0]`、修改 `arr[0]=100`） |
| `ArrayDemo3.java` | 用 for 循环遍历数组（`arr.length`） |
| `ArrTest1.java` | 练习：数组求和 |
| `ArrTest2.java` | 练习：统计数组中 3 的倍数的个数 |
| `ArrTest3.java` | 练习：偶数 ÷2、奇数 ×2 后再输出（两个循环分开写） |

### exercises —— 综合练习

| 文件 | 内容 |
|:---|:---|
| `Test1.java` | 强制转换 + 键盘录入三位数，拆出个位/十位/百位 |
| `Test2.java` | 练习：比较衣服时髦度（boolean 结果） |
| `Test3.java` | 练习：判断两个整数是否满足 6 的倍数条件 |
| `Test4.java` | 练习：两只老虎体重是否相同（三元运算符） |
| `Test5.java` | 练习：三个人的身高，求最大值 |

## 学习路线

基础语法（本仓库）→ 流程控制（分支、循环）→ 数组 → 面向对象 → 常用 API → 集合 → IO 流 → 多线程 → 网络编程
