# Annotation 
## Introduction
Annotation 是一種在程式碼中嵌入metadata的機制，它讓你能在類別、方法、變數等程式元素上附加額外資訊。
這些資料不會直接影響程式的執行邏輯，但卻能被編譯器、開發工具、框架或運行時（透過反射）讀取，以實現各種動態行為或生成輔助程式碼。

## Use to 
- 編譯檢查 Ex. @Override
- 代碼產生和配置 Ex. @Autowired
- 測試驅動 Ex. @Test, @SpringBootTest

## Use it we can 
- 元數據敘述
- 減少配置負擔
- 自動生成與工具支援
- 靈活應用

## Lifecycle with Annotation (@Retention)
- SOURCE : 只存在於源代碼階段，編譯器處理後會被丟棄
- CLASS : 存在編譯後的class文件中，運行時不會被JVM加載
- RUNTIME : 適合動態處理，運行時也存在

## Who can use
- TYPE : 類別、介面
- FIELD : 欄位
- METHOD : 方法
- PARAMETER : 方法參數
- CONSTRUCTOR : 建構子
- LOCAL_VARIABLE : 區域變數
- ANNOTATION_TYPE : 用於另一個Annotation
- PACKAGE : 套件
- TYPE_PARAMETER : 泛型類型參數 Java 8+
- TYPE_USE : 幾乎所有可使用型別的位置(更泛用)
- MODULE : 模組 Java 9+
- RECORD_COMPONENT : Java record組件 Java 14+

## 自定義Annotation如何建立
1. 建立Annotation類
```java

@Documented
@Inherited
@Constraint()
@Target()
@Retention()
public @interface AnnotationName{
} 
```
2. 如果需要驗證的話需自行建立驗證器
```java
public class AnnotationValidator implements ConstraintValidator<AnnotationName, FieldType>{
  @Override
	public boolean isValid(FieldType value, ConstraintValidatorContext context) {
		return 驗證條件;
	}
}
```
4. 使用在想要的地方上 Ex.
```
public class Student{
  private Integer id;
  private String name;
  @Age
  private Integer age;
  
}
```
