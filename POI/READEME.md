Excle版本说明

|               | 2003                                     | 2007                                |
| ------------- | ---------------------------------------- | ----------------------------------- |
| 后缀          | xls                                      | xlsx                                |
| 结构          | 二进制格式，核心结构是符合文档类型的结构 | XML类型结构                         |
| 单sheet数据量 | 行：65535；列：256                       | 行：1048576；列：16384              |
| 特点          | 存储容量有限                             | 基于XML压缩，占用空间小，操作效率高 |



## 代码电梯

#### 入门

1.[新建Excle](poi-demo\src\test\java\cn\itcast\poi\test\PoiTest01.java)

2.[写入内容](poi-demo\src\test\java\cn\itcast\poi\test\PoiTest02.java)

3.[单元格样式](poi-demo\src\test\java\cn\itcast\poi\test\PoiTest03.java)

4.[添加图片](poi-demo\src\test\java\cn\itcast\poi\test\PoiTest04.java)

5.[读取并解析](poi-demo\src\test\java\cn\itcast\poi\test\PoiTest05.java)



#### 实例

百万数据的导出与读取

[源码和文件](工具类\big_data_test_file)

