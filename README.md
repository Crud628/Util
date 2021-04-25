# Util
 常用工具类集合



1、[POI->Java对Office系列操作的工具类](POI)   

> Apache POI是Apache软件基金会的开源项目，由Java编写的免费开源的跨平台的 Java API，Apache POI提供API 给Java语言操作Microsoft Office的功能。
>
> 应用场景
>
> 1. 数据报表生成 2. 数据备份 3. 数据批量上传

环境搭建

```xml
<dependencies>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi</artifactId>
        <version>4.0.1</version>
    </dependency>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>4.0.1</version>
    </dependency>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml-schemas</artifactId>
        <version>4.0.1</version>
    </dependency>
</dependencies>

```

结构说明

> HSSF提供读写Microsoft Excel XLS格式档案的功能。 
>
> XSSF提供读写Microsoft Excel OOXML XLSX格式档案的功能。 
>
> HWPF提供读写Microsoft Word DOC格式档案的功能。 
>
> HSLF提供读写Microsoft PowerPoint格式档案的功能。 
>
> HDGF提供读Microsoft Visio格式档案的功能。
>
>  HPBF提供读Microsoft Publisher格式档案的功能。 
>
> HSMF提供读Microsoft Outlook格式档案的功能。

API

| API名称   |                                                              |
| --------- | ------------------------------------------------------------ |
| Workbook  | Excle的文档对象，针对不同的Excle类型分为：HSSFWorkbook（2003）和XSSFWorkbook |
| Sheet     | 表单                                                         |
| Row       | 行                                                           |
| Cell      | 单元格                                                       |
| Font      | Excle字体                                                    |
| CellStyle | 单元格样式                                                   |

