CodeLibs Struts (cl-struts)
=============

## CodeLibs Struts(cl-struts)とは

[Apache Struts 1.x](http://struts.apache.org/struts1eol-announcement.html)がEOLを迎え、Apacheによるサポートがなくなりました。
とはいえ、[Seasar Project](http://www.seasar.org/)の[SAStruts](http://sastruts.seasar.org/)はStruts 1.2.9を利用しており、利用者からはStruts 1.xのEOLの懸念が挙げられてきています。
Struts自体はオープンソースで提供されているプロダクトですので、Apacheに代わり、CodeLibsがSAStrutsで利用するStruts 1.2.9を継続サポートしていくことにしました。

CodeLibs StrutsはSAStrutsがEOLを迎えるまでサポートする予定です。

## 利用方法

### Mavenリポジトリ登録

Mavenを利用しているプロジェクトであれば、pom.xmlに以下のMavenリポジトリを追加してください。
Mavenプロジェクトでない場合は http://maven.codelibs.org/org/codelibs/struts/cl-struts/ よりjarファイルをダウンロード可能です。

    <repositories>
      <repository>
        <id>codelibs.org</id>
        <name>CodeLibs Repository</name>
        <url>http://maven.codelibs.org/</url>
      </repository>
    </repositories>

### dependencyの修正

pom.xmlの依存関係を以下のように修正します。
(cl-strutsを追加し、strutsをexclusionとして追加する)

    <dependency>
      <groupId>org.codelibs.struts</groupId>
      <artifactId>cl-struts</artifactId>
      <version>1.2.9.1</version>
    </dependency>
    <!-- SAStrutsを利用している場合 -->
    <dependency>
      <groupId>org.seasar.sastruts</groupId>
      <artifactId>sa-struts</artifactId>
      <version>1.0.4-sp9</version>
      <exclusions>
        <exclusion>
          <groupId>struts</groupId>
          <artifactId>struts</artifactId>
        </exclusion>
      </exclusions>
    </dependency>

上記によりstrutsのjarファイルがcl-strutsのjarファイルに置き換わります。
(commons-beanutils 1.8.0 以上が必要です)

## その他

### 利用しているプロジェクト

* [Fess](http://fess.codelibs.org/)

利用していることを公開可能なプロジェクトがありましたら、お知らせください。

### 商用サポート

CodeLibs Strutsは今までのApache Strutsと同様にオープンソースとして自由にご利用いただけます。
Apache Strutsのように商用サポートは必要ないケースが多いかと思います。
しかしながら、もし政治な理由等により、やむにやまれぬ様々な事情から、どうしても商用のサポートが必要な場合は[N2SM, Inc.](http://www.n2sm.net/)までご相談ください。


