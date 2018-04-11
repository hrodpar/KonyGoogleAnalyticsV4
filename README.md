# KonyGoogleAnalyticsV4

This repo is for integration of Google Analytics v4 with a Kony Project v6.5

Now, there's an exception with the Application Class setted into de Kony Project:

--------- beginning of crash
04-11 03:11:22.809 11500-11500/com.orgname.PruebaAnalytics E/AndroidRuntime: FATAL EXCEPTION: main
Process: com.orgname.PruebaAnalytics, PID: 11500
java.lang.RuntimeException: Unable to instantiate application info.androidhive.googleanalytics.app.MyApplication: java.lang.ClassNotFoundException: Didn't find class "info.androidhive.googleanalytics.app.MyApplication" on path: DexPathList[[zip file "/data/app/com.orgname.PruebaAnalytics-1/base.apk"],nativeLibraryDirectories=[/data/app/com.orgname.PruebaAnalytics-1/lib/arm, /system/fake-libs, /data/app/com.orgname.PruebaAnalytics-1/base.apk!/lib/armeabi, /system/lib, /vendor/lib]]
at android.app.LoadedApk.makeApplication(LoadedApk.java:846)
at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5859)
at android.app.ActivityThread.-wrap3(ActivityThread.java)
at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1703)
at android.os.Handler.dispatchMessage(Handler.java:102)
at android.os.Looper.loop(Looper.java:154)
at android.app.ActivityThread.main(ActivityThread.java:6692)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:1468)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1358)
Caused by: java.lang.ClassNotFoundException: Didn't find class "info.androidhive.googleanalytics.app.MyApplication" on path: DexPathList[[zip file "/data/app/com.orgname.PruebaAnalytics-1/base.apk"],nativeLibraryDirectories=[/data/app/com.orgname.PruebaAnalytics-1/lib/arm, /system/fake-libs, /data/app/com.orgname.PruebaAnalytics-1/base.apk!/lib/armeabi, /system/lib, /vendor/lib]]
at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:56)
at java.lang.ClassLoader.loadClass(ClassLoader.java:380)
at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
at android.app.Instrumentation.newApplication(Instrumentation.java:1000)
at android.app.LoadedApk.makeApplication(LoadedApk.java:835)
at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5859) 
at android.app.ActivityThread.-wrap3(ActivityThread.java) 
at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1703) 
at android.os.Handler.dispatchMessage(Handler.java:102) 
at android.os.Looper.loop(Looper.java:154) 
at android.app.ActivityThread.main(ActivityThread.java:6692) 
at java.lang.reflect.Method.invoke(Native Method) 
at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:1468) 
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1358) 
