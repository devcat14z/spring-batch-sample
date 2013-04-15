■SampleJobの実行方法

0.共通の手順

・simple-batch--sampleプロジェクトを選択
・メニューの[実行] ＞ [実行構成] を選択
・実行構成ウィンドウにて、Javaアプリケーションを選択、右クリックで「新規」

1.Job1の登録

  [メイン]タブ
    名前：Job1
    プロジェクト：simple-batch-sample
    メイン・クラス：org.springframework.batch.core.launch.support.CommandLineJobRunner

  [引数]タブ
    プログラムの引数：classpath:/META-INF/spring/job1.xml job

2.Job2の登録

  [メイン]タブ
    名前：Job2
    プロジェクト：simple-batch-sample
    メイン・クラス：org.springframework.batch.core.launch.support.CommandLineJobRunner

  [引数]タブ
    プログラムの引数：classpath:/META-INF/spring/job2.xml job file=step2Input.csv bizDate(date)=2010/04/03


3. あとは、それぞれを「実行」すれば サンプルバッチが起動します。
