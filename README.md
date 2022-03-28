# HackerRank

解いた問題を貼り付けるリポジトリ

[HackerRankのプロフィール](https://www.hackerrank.com/Tatsumi0000?h_r=internal-search&hr_r=1)

## 問題文

### Algorithms

- [Warmup](https://www.hackerrank.com/domains/algorithms?filters%5Bsubdomains%5D%5B%5D=warmup)
- [Implementation](https://www.hackerrank.com/domains/algorithms?filters%5Bsubdomains%5D%5B%5D=implementation)

## メモ

### Kotlin

- 標準出力は、printを使うよりもPrintWriterを使うほうが圧倒的に速い[^1]。

> 出力 print/println() vs java.io.PrintWriter
>
>呼び出し回数が多い場合はPrintWriterの圧勝です。
>
>少ない場合は大差ないため、print/println()を使いたい派の場合はStringBuilderやjoinToString(),buildString()でStringにまとめてから呼び出すようにするとよいです。
>
>StringBuilderとPrintWriterを比較比較すると、おおよそのケースにおいて前者のほうが少し早く、後者のほうがメモリ消費量が少ないです。

```kotlin
import java.io.PrintWriter

fun main(args: Array<String>) {
  val fp = PrintWriter(System.out)
  fp.print("Hello, World!") // 改行なし
  fp.println() // 改行
  fp.close()
}
```
[^1]: [【WIP】【競プロ】AtCoderでKotlinを使う上での注意点とかTipsとか(キャッシュより](https://webcache.googleusercontent.com/search?q=cache:SDOvZnWIXdIJ:https://qiita.com/da_louis/items/3c5a2e834c3d8cd01753+&cd=1&hl=ja&ct=clnk&gl=jp&client=firefox-b-d)
