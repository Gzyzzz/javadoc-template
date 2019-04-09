# Javadoc

**20190403 - GuoZhiYong - Javadoc**

## 一、Javadoc标签（JDK1.5）

- 块标签：`@tag`
    - `@author author-info`：注释作者信息。
    - `@deprecated`：表示此API已废弃。
    - `@exception exception-class exception-description`：注释异常信息（可能出现的）。
    - `@param param-name param-description`：注释参数信息。
    - `@return description`：注释返回信息。
    - `@see reference`：引用注释（文本、链接、包、类等等）。
    - `@serial field-description|include|exclude`：序列化注释。
    - `@serialData data-description`：序列化数据注释。
    - `@serialField field-name field-type field-description`：序列化字段注释。
    - `@since datatime-text|version-text`：注释已存在的时间
    - `@throws exception-class exception-description`：注释异常信息（方法声明的）。
    - `@version version-info`：注释版本信息。
- 内联标签：`{@tag}`
    - `{@code code-text}`：注释代码文本
    - `{@docRoot}`：表示从任何生成的页面到生成的文档（目标）根目录的相对路径。
    - `{@inheritDoc}`：从最近的可继承类或实现接口复制注释文档到当前注释。
    - `{@link package.class#member label}`：链接引用文档。
    - `{@linkplain package.class#member label}`：链接引用文档。
    - `{@literal text}`：注释文本不需要转义HTML的<>。
    - `{@value package.class#field}`：注释常量值。

## 二、标签顺序

```java
/**
 * @author
 * @version
 * @param
 * @return
 * @throws
 * @exception
 * @see
 * @since
 * @serial
 * @serialField
 * @seriaData
 * @deprecated
 */
```

## 三、Javadoc模板

### 1. 包

```java
/**
 * package simple description.
 *
 * package detailed description.
 *
 * @author（必须）
 * @version（必须）
 * @see（可选）
 * @since（可选）
 */
```

### 2. 类和接口

```java
/**
 * type simple description.
 *
 * type detailed description.
 *
 * @author（必须）
 * @version（必须）
 * @param（可选）
 * @see（可选）
 * @since（可选）
 * @serial（可选）
 * @deprecated（可选）
 */
```

### 3. 字段

```java
/**
 * field simple description.
 *
 * field detailed description.
 *
 * @see（可选）
 * @since（可选）
 * @serialField | @serial（可选）
 * @deprecated（可选）
 */
```

### 4. 方法

```java
/**
 * method simple description.
 *
 * method detailed description.
 *
 * @author（可选）
 * @param（可选）
 * @return（可选）
 * @throws（可选）
 * @exception（可选）
 * @see（可选）
 * @since（可选）
 * @serialData（可选）
 * @deprecated（可选）
 */
```

**参考资料**

1. [How to Write Doc Comments for the Javadoc Tool](https://www.oracle.com/technetwork/java/javase/documentation/index-137868.html#tag)
