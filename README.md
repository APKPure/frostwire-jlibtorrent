<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
	</head>
	<body>
		<h2>frostwire-jlibtorrent 下载地址 <img src="https://travis-ci.org/APKPure/frostwire-jlibtorrent.svg?branch=gradle_openSSL_master"></h2>
		<h4 style="color: crimson;">版本号:1.2.0.4</h4>
		<a href="https://s3-ap-southeast-1.amazonaws.com/apkpure-travis-ci/jar/jlibtorrent-1.2.0.4.jar" >jlibtorrent-1.2.0.4.jar</a>
		<br />
		<a href="https://s3-ap-southeast-1.amazonaws.com/apkpure-travis-ci/jar/jlibtorrent-android-arm-1.2.0.4.jar">jlibtorrent-android-arm-1.2.0.4.jar</a>
		<hr />
		<h2>frostwire-jlibtorrent 使用方法</h2>
		<p>一.将主干代码合并到分支</p>
		<ol>
			<li>合并release_openSSL_master
				 <ul>
				 	<li>需要注意将主干master代码一步步合拼到release_openSSL_master，此处没什么不同，就不说了</li>
				 	<li>修改readme.me文件中版本号（建议修改）</li>
				 </ul>
			</li>
			<li>合并gradle_openSSL_master
				<ul>
					<li>此处需要注意的是，gradle_openSSL_master删除了里面的测试文件test，所以不用管test文件,然后一步步合并代码到分支</li>
					<li>除了上诉一步步合并之外，还有个简单方法就是直接删除里面的src文件和他的Swig下文件+build.gradle文件，从原项目下copy下来即可(关键是Travis-CI文件不做维护不用管它)</li>
					<li>修改readme.me文件中版本号和下载链接，只用修改版本号（版本号和buil.gradle中version是一一对应的，这样便于下载）</li>
				</ul>
			</li>
		</ol>
		<p>二.提交的github（先提交release_openSSL_master再提交gradle_openSSL_master，没有时间限制）</p>
		<p>三.大约等20分钟，Travis-CI会往之前设置的邮箱发送是否成消息，就能下载了（如果想往自己邮箱发的话，给gradle_openSSL_master中email再添加一个邮箱即可）</p>
		<h2>升级frostwire-jlibtorrent库</h2>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;由于原版frostwire-jlibtorrent库在1.4版本后不支持HTTPS请求，所以才会升级.
		（此处我建了2个分支release，gradle分支，一个产生so库，一个产生jar文件）
		<p>一.初期准备</p>
		<ul>
			<li>github上fork一份代码到自己的工程中去</li>
			<li>开启Travis-CI和github的项目同步</li>
		</ul>
		<p>二.修改配置代码</p>
		<ul>
			<li>修改JamFile文件和Travis-CI文件.<a href="https://github.com/aldenml/frostwire-jlibtorrent/commit/44c06a9c7482c38a25c8db117df186e12c2d441c">点此链接</a></li>
			<li>我用的S3账户，所以只用配置S3账户就可以了，参数配置在环境变量中.<a href="https://docs.travis-ci.com/user/environment-variables/">如何配置环境变量</a></li>
			<li>一般来说到这一步提交github就OK了(本地将so文件放在项目build.gradle标明的路径中，运行就产生jar文件了)，可是要想更加自动化的话还有方法。
				<ol>
					<li>新建最新master代码到分支gradle_master中</li>
					<li>其他代码不变，删掉作者的test测试文件</li>
					<li>构建自己Travis-CI文件，按照安卓的编译环境来写.<a href="https://docs.travis-ci.com/user/languages/android/">如何在Travis-CI下搭建Android环境</a>(也可以直接copy我的，具体不做阐述了)</li>
					<li>写好之后，提交到github,看到Travis-CI编译成功就OK了</li>
				</ol>
			</li>
		</ul>
		<p>三.大工告成，提交github，15分钟后检查S3账户是否存在so文件和jar文件</p>
	</body>
</html>
