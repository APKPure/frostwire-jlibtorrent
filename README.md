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
					<li>此处需要注意的是，gradle_openSSL_master删除了里面的测试文件test，所以不用管test文件</li>
					<li>除了上诉一步步合拼之外，还有个简单方法就是直接删除里面的src文件和他的Swig下文件+build.gradle文件，从原项目下copy下来即可(关键是Travis-CI文件不做维护不用管它)</li>
					<li>修改readme.me文件中版本号和下载链接，只用修改版本号（版本号和buil.gradle中version是一一对应的，这样便于下载）</li>
				</ul>
			</li>
		</ol>
		<p>二.提交的github（先提交release_openSSL_master再提交gradle_openSSL_master，没有时间限制）</p>
		<p>三.大约等20分钟，Travis-CI会往之前设置的邮箱发送是否成消息，就能下载了（如果想往自己邮箱发的话，给gradle_openSSL_master中email再添加一个邮箱即可）</p>
	</body>
</html>
