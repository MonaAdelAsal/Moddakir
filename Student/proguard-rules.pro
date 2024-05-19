## Add project specific ProGuard rules here.
## You can control the set of applied configuration files using the
## proguardFiles setting in build.gradle.
##
## For more details, see
##   http://developer.android.com/guide/developing/tools/proguard.html
#
## If your project uses WebView with JS, uncomment the following
## and specify the fully qualified class name to the JavaScript interface
## class:
##-keepclassmembers class fqcn.of.javascript.interface.for.webview {
##   public *;
##}
#
## Uncomment this to preserve the line number information for
## debugging stack traces.
#-keepattributes SourceFile,LineNumberTable
#
## If you keep the line number information, uncomment this to
## hide the original source file name.
#
##-keep class com.crashlytics.** { *; }
##-keep class com.crashlytics.android.**
##-keepattributes SourceFile,LineNumberTable
#-keep public enum com.bumptech.glide.load.ImageHeaderParser$** {
#  **[] $VALUES;
#  public *;
#}
## Retrofit does reflection on generic parameters. InnerClasses is required to use Signature and
## EnclosingMethod is required to use InnerClasses.
#-keepattributes Signature, InnerClasses, EnclosingMethod
#
## Retrofit does reflection on method and parameter annotations.
#-keepattributes RuntimeVisibleAnnotations, RuntimeVisibleParameterAnnotations
#
## Retain service method parameters when optimizing.
#-keepclassmembers,allowshrinking,allowobfuscation interface * {
#    @retrofit2.http.* <methods>;
#}
#
## Ignore annotation used for build tooling.
#-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
#
## Ignore JSR 305 annotations for embedding nullability information.
#-dontwarn javax.annotation.**
## With R8 full mode, it sees no subtypes of Retrofit interfaces since they are created with a Proxy
## and replaces all potential values with null. Explicitly keeping the interfaces prevents this.
#-if interface * { @retrofit2.http.* <methods>; }
#-keep,allowobfuscation interface <1>
#-keep class com.moddakir.common.Model** {
#   *;
#}
#-keep class com.moddakir.moddakir.Model** {
#   *;
#}
#-keepattributes Signature
#-keepclassmembers class com.moddakir.moddakir.Model.* {
#  *;
#}
##keep any class extends view
#-keep public class * extends android.view.View {
#    public <init>(android.content.Context);
#    public <init>(android.content.Context, android.util.AttributeSet);
#    public <init>(android.content.Context, android.util.AttributeSet, int);
#    public void set*(...);
#}
#-keepclasseswithmembernames class * { native <methods>; }
## add all classes to root directory
#-repackageclasses
#
#-keep class cn.pedant.SweetAlert.Rotate3dAnimation {
#    public <init>(...);
# }
# -keep class com.opentok.android.v3.* {  *;}
#
# -keep class org.webrtc.** { *; }
# -dontwarn com.opentok.*
# -keep class com.opentok.** { *; }
# -keepclassmembers class com.opentok.{ *; }
#
# -dontwarn com.opentok.*
# -keepclassmembers class com.opentok.* { *; }

-keep class io.agora.**{*;}
-keep class com.google.android.gms.** { *; }
-ignorewarnings
-keepattributes *Annotation*
-keepattributes Exceptions
-keepattributes InnerClasses
-keepattributes Signature
-keepattributes SourceFile,LineNumberTable