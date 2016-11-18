frostwire-jlibtorrent[![Build Status](https://travis-ci.org/APKPure/frostwire-jlibtorrent.svg?branch=gradle_openSSL_master)](https://travis-ci.org/APKPure/frostwire-jlibtorrent)
=====================
当前版本:1.2.0.4 <br />
frostwire-jlibtorrent下载地址: <br />
    <a href="https://s3-ap-southeast-1.amazonaws.com/apkpure-travis-ci/jar/jlibtorrent-1.2.0.4.jar">jlibtorrent-1.2.0.4.jar</a>
    <br />
    <a href="https://s3-ap-southeast-1.amazonaws.com/apkpure-travis-ci/jar/jlibtorrent-android-arm-1.2.0.4.jar">
    jlibtorrent-android-arm-1.2.0.4.jar
    </a>
<hr/>
<hr/>
<hr/>



<h3>使用方法</h3>
<ol>
    <li>将主干代码合拼到分支
        <ol>
            <li>
                合并release_openSSL_master<br/>
                需要注意将主干master代码一步步合拼到release_openSSL_master，此处没什么不同，就不说了<br/>
                修改readme.me文件中版本号（建议修改）<br/>
            </li>
            <li>
                合并gradle_openSSL_master<br/>
                此处需要注意的是，gradle_openSSL_master删除了里面的测试文件test，所以不用管test文件<br/>
                除了上诉一步步合拼之外，还有个简单方法就是直接删除里面的src文件和他的Swig下文件+build.gradle文件，从原项目下copy下来即可(关键是Travis-CI文件不做维护不用管它)<br/>
                修改readme.me文件中版本号和下载链接，只用修改版本号（版本号和buil.gradle中version是一一对应的，这样便于下载）<br/>
            </li>
        </ol>
    </li>
    <li>提交的github（先提交release_openSSL_master再提交gradle_openSSL_master，没有时间限制）</li>
    <li>大约等20分钟，Travis-CI会往之前设置的邮箱发送是否成消息，就能下载了（如果想往自己邮箱发的话，给gradle_openSSL_master中email再添加一个邮箱即可）</li>
</ol>
