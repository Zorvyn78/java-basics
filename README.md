# Java 基础语法练习

学习 Java 基础语法时的课堂演示、课后练习与算法题（配套黑马程序员 Java 入门课程）。

## 环境要求

- **JDK 8+**（全部代码为标准语法，任意版本可编译运行；开发使用 JDK 25）
- **IntelliJ IDEA**（推荐）或其他任意 IDE

## 项目结构

代码分为「课程章节包」和「算法专题包」两部分，每个文件夹对应一个 Java `package`：

```
untitled/
├── src/
│   ├── basics/       # 入门：第一个程序、顺序结构
│   ├── variables/    # 字面量、数据类型、变量
│   ├── operators/    # 运算符（算术、赋值、比较、逻辑、三元）
│   ├── scanner/      # 键盘录入（Scanner）
│   ├── ifelse/       # 分支（if / else if / switch）
│   ├── loop/         # 循环（for、while、break、continue）
│   ├── method/       # 方法（定义、调用、重载、传值/传引用）
│   ├── array/        # 数组（定义、索引、遍历、二维数组）
│   ├── oop/          # 面向对象（类、对象、属性、方法）
│   ├── exercises/    # 综合练习
│   └── algorithm/    # 算法专题：按算法类型归档
│       ├── number/        # 数值算法
│       ├── digit/         # 数字拆解与编解码
│       ├── array/         # 数组算法
│       ├── pattern/       # 图形打印
│       ├── simulation/    # 模拟与递推
│       ├── random/        # 随机数应用
│       └── comprehensive/ # 综合算法
├── README.md
└── .gitignore
```

> **两套分类的分工**：`loop` / `array` / `exercises` 等按**课程章节**组织，保留语法演示和基础练习；
> `algorithm` 按**算法类型**组织，收录需要设计解题步骤的题（质数、回文、加解密、双指针反转、洗牌、图形打印等）。
> 同一道题只放一处，避免重复。

## 如何运行

方式一：命令行编译运行

```bash
# 编译 src 下所有文件
javac -d out $(find src -name "*.java")

# 运行某个类（注意要带包名）
java -cp out basics.HelloWorld
java -cp out variables.VariableTest
java -cp out algorithm.number.LoopTest3      # 判断质数
java -cp out algorithm.pattern.TriangleTest  # 打印等腰三角形
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
| `SwapTest.java` | 练习：交换两个变量的值（第三方变量，空杯子思路） |

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
| `InfiniteloopDemo1.java` | 无限循环：`while(true)` 永远执行 |
| `SkipLoopDemo1.java` | `continue`：跳过某一次循环（跳过第 3 个包子） |
| `SkipLoopDemo2.java` | `break`：结束整个循环（吃到第 3 个就停） |
| `LoopTest5.java` | 练习：Random 生成随机数（0~100） |
| `LoopTest6.java` | 练习：生成任意区间随机数的技巧（包头不包尾） |

### method —— 方法

| 文件 | 内容 |
|:---|:---|
| `MethodDemo1.java` | 方法的定义与多次调用（模拟打游戏流程） |
| `MethodDemo2.java` | 方法练习：打印女朋友信息 |
| `MethodDemo3.java` | 方法练习：求两个数的和并输出 |
| `MethodDemo4.java` | 方法带参数：求两个整数的和 |
| `MethodDemo5.java` | 方法带返回值：求三个小数的和（三种调用方式） |
| `MethodTest1.java` | 练习：方法求长方形周长 |
| `MethodTest2.java` | 练习：方法求圆面积（π取3.14） |
| `MethodTest3.java` | 练习：方法求面积并比较两个长方形（方法抽取思想） |
| `MethodTest4.java` | 练习：方法重载——compare 的 byte/short/int/long 四个版本 |
| `MethodTest5.java` | 练习：方法遍历数组并打印为 `[11,22,33]` 格式 |
| `MethodTest6.java` | 练习：方法求数组最大值（参数为数组） |
| `MethodTest7.java` | 练习：方法判断数组是否包含指定元素（返回 boolean） |
| `MethodTest8.java` | 练习：方法拷贝数组区间（copyOfRange，包头不包尾，双下标） |
| `MethodTest9.java` | 练习：方法传值（基本类型拷贝值，方法内修改不影响实参） |
| `MethodTest10.java` | 练习：方法传引用（数组传地址，方法内修改影响原数组） |

### array —— 数组

| 文件 | 内容 |
|:---|:---|
| `ArrayDemo1.java` | 数组的两种定义格式 + 地址值含义（`[D@776ec8df` 解读） |
| `ArrayDemo2.java` | 用索引访问数组元素（获取 `arr[0]`、修改 `arr[0]=100`） |
| `ArrayDemo3.java` | 用 for 循环遍历数组（`arr.length`） |
| `ArrayDemo4.java` | 数组默认初始化值的规律（整数0/小数0.0/字符空格/布尔false/引用null） |
| `ArrayDemo5.java` | 索引越界异常：原因与避免（索引范围 0~长度-1） |
| `TwoDimensionDemo1.java` | 二维数组：静态初始化（完整格式/简写格式）+ 嵌套 for 遍历（每行长度可不同） |
| `TwoDimensionDemo2.java` | 二维数组：动态初始化 `new int[3][5]` + 默认值规律 |
| `TwoDimensionDemo3.java` | 二维数组练习：四个季度营业额求和（外层取行、内层用方法求和） |
| `ArrTest1.java` | 练习：数组求和 |
| `ArrTest2.java` | 练习：统计数组中 3 的倍数的个数 |
| `ArrTest3.java` | 练习：偶数 ÷2、奇数 ×2 后再输出（两个循环分开写） |
| `ArrTest4.java` | 练习：求数组最大值（max 初始值必须是数组中的值） |
| `ArrTest5.java` | 练习：随机数数组求和、平均值、统计比平均小的个数 |
| `ArrTest7.java` | 练习：交换首尾元素（0索引和最大索引，第三方变量） |
| `RandomArrayTest.java` | 练习：生成 10 个 1~100 随机数存入数组并打印（写/读两个循环） |
| `ZhlxTest4.java` | 综合练习：把数组内容复制到新数组（遍历逐个赋值） |

### oop —— 面向对象

| 文件 | 内容 |
|:---|:---|
| `Phone.java` | 类的定义：属性（brand/price）+ 方法（call/PlayGame） |
| `PhoneTest.java` | 创建对象、给属性赋值、调用方法（一个类可以创建多个互不干扰的对象） |
| `GirlFriend.java` | 类的定义：属性（name/age/gender）+ 方法（eat/sleep） |
| `GirlFriendTest2.java` | 练习：创建两个 GirlFriend 对象，分别赋值并调用方法 |

### exercises —— 综合练习

| 文件 | 内容 |
|:---|:---|
| `Test2.java` | 练习：比较衣服时髦度（boolean 结果） |
| `Test3.java` | 练习：判断两个整数是否满足 6 的倍数条件 |
| `Test4.java` | 练习：两只老虎体重是否相同（三元运算符） |
| `Test5.java` | 练习：三个人的身高，求最大值 |
| `ZhlxTest1.java` | 综合练习：机票淡旺季折扣计算（分支 + 方法带返回值） |

### algorithm —— 算法专题（按算法类型归档）

> 以下题目原先分散在 `loop` / `array` / `exercises` 中，现按考察的算法类型重新归类。

#### `algorithm/number` —— 数值算法（质数判定、质数统计、回文数、开平方、用减法实现除法）

| 文件 | 内容 |
|:---|:---|
| `LoopTest3.java` | 练习：判断一个数是否为质数（flag + break，上界优化到 √n） |
| `ZhlxTest2.java` | 综合练习：统计 101~200 之间质数的个数并打印 |
| `Test20.java` | 练习：回文数判断（数字反转） |
| `LoopTest2.java` | 练习：求一个数的平方根（break 提前结束） |
| `Test21.java` | 练习：用减法实现除法（统计能减几次） |

#### `algorithm/digit` —— 数字拆解与编解码（按位拆分、数组化拆位、加密与解密互为逆运算）

| 文件 | 内容 |
|:---|:---|
| `Test1.java` | 强制转换 + 键盘录入三位数，拆出个位/十位/百位 |
| `ZhlxTest7.java` | 综合练习：数字拆位（数字 → 数组，先算位数再按 `arr.length-1` 倒着填） |
| `ZhlxTest6.java` | 综合练习：数字加密（每位+5 → %10 → 反转 → 拼接） |
| `ZhlxTest8.java` | 综合练习：数字解密（`ZhlxTest6` 的逆运算：反转 → ≤4 补回10 → 每位-5 → 拼接） |

#### `algorithm/array` —— 数组算法（双指针反转、随机洗牌、抽奖打乱）

| 文件 | 内容 |
|:---|:---|
| `ArrayReverseTest.java` | 练习：反转数组（双指针 i++/j-- 对称交换） |
| `ArrTest9.java` | 练习：随机打乱数组顺序（洗牌，随机索引交换） |
| `ZhlxTest9.java` | 综合练习：抽奖/洗牌（随机索引交换打乱奖品顺序） |

#### `algorithm/pattern` —— 图形打印（等腰三角形、洛谷 B2005 字符三角形）

| 文件 | 内容 |
|:---|:---|
| `TriangleTest.java` | 练习：打印等腰三角形（嵌套循环，先空格后星号） |
| `CharTriangleTest.java` | 练习（洛谷 B2005）：给定字符构造底 5 高 3 的等腰字符三角形 |

#### `algorithm/simulation` —— 模拟与递推（逢 7 过、纸张对折、猜数字游戏）

| 文件 | 内容 |
|:---|:---|
| `LoopTest1.java` | 练习：逢 7 过（含 7 或 7 的倍数输出「过」，continue） |
| `Test19.java` | 练习：纸张对折多少次能超过珠穆朗玛峰高度 |
| `LoopTest7.java` | 练习：猜数字游戏（while 无限循环 + break） |

#### `algorithm/random` —— 随机数应用（随机验证码生成）

| 文件 | 内容 |
|:---|:---|
| `ZhlxTest3.java` | 综合练习：生成 7 位随机验证码（6 字母 + 1 数字） |

#### `algorithm/comprehensive` —— 综合算法（双色球开奖、评委打分）

| 文件 | 内容 |
|:---|:---|
| `ZhlxTest11.java` | 综合练习：双色球（生成开奖号码 + 键盘输入比对 + 中奖等级判断） |
| `ZhlxTest5.java` | 综合练习：评委打分去最高最低求平均（if 分号陷阱 + 整数除法） |

## 学习路线

基础语法（basics → variables → operators → scanner）→ 流程控制（ifelse → loop）→ 方法（method）→ 数组（array）→ 面向对象（oop）→ 常用 API → 集合 → IO 流 → 多线程 → 网络编程

算法专题（algorithm）建议穿插复习：学完循环后做 `number` / `pattern`，学完数组后做 `array` / `digit`，最后挑战 `simulation` / `random` / `comprehensive`。
