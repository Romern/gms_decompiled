package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: swo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swo {

    /* renamed from: j */
    private static final Charset f45291j = Charset.forName("UTF-8");

    /* renamed from: a */
    public int f45292a;

    /* renamed from: b */
    public int f45293b = -1;

    /* renamed from: c */
    public final int f45294c;

    /* renamed from: d */
    public String f45295d;

    /* renamed from: e */
    public String f45296e;

    /* renamed from: f */
    public final String f45297f;

    /* renamed from: g */
    public String f45298g;

    /* renamed from: h */
    public String f45299h;

    /* renamed from: i */
    public final String f45300i;

    public swo(Context context, String str, String str2) {
        ApplicationInfo applicationInfo;
        String packageName = context.getPackageName();
        try {
            this.f45293b = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(packageName);
            Log.wtf("DeviceContext", valueOf.length() == 0 ? new String("Our own package not found: ") : "Our own package not found: ".concat(valueOf), e);
        }
        try {
            this.f45292a = context.getPackageManager().getPackageInfo(str, 0).versionCode;
            this.f45299h = context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf2 = String.valueOf(str);
            Log.e("DeviceContext", valueOf2.length() == 0 ? new String("Caller package not found: ") : "Caller package not found: ".concat(valueOf2), e2);
        }
        this.f45294c = Build.VERSION.SDK_INT;
        if (context.getContentResolver() != null) {
            this.f45295d = aymn.m84265a(context.getContentResolver(), "device_country", "");
        }
        Locale locale = Locale.getDefault();
        if (locale != null) {
            this.f45296e = locale.toString();
        }
        this.f45297f = str2;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
        } catch (PackageManager.NameNotFoundException e3) {
            String valueOf3 = String.valueOf(str);
            Log.e("DeviceContext", valueOf3.length() == 0 ? new String("Cannot retrieve application info for package: ") : "Cannot retrieve application info for package: ".concat(valueOf3), e3);
            applicationInfo = null;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            String string = bundle.getString("com.google.android.gms.games.APP_ID");
            if (!TextUtils.isEmpty(string)) {
                this.f45298g = string;
            }
        }
        this.f45300i = TimeZone.getDefault().getID();
    }

    /* renamed from: a */
    public static byte[] m36531a(swo swo) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update((byte) 0);
            instance.update(new Integer(swo.f45292a).toString().getBytes(f45291j));
            instance.update((byte) 0);
            instance.update(new Integer(swo.f45293b).toString().getBytes(f45291j));
            instance.update((byte) 0);
            instance.update(new Integer(swo.f45294c).toString().getBytes(f45291j));
            instance.update((byte) 0);
            String str = swo.f45295d;
            if (str != null) {
                instance.update(str.getBytes(f45291j));
                instance.update((byte) 0);
            }
            String str2 = swo.f45296e;
            if (str2 != null) {
                instance.update(str2.getBytes(f45291j));
                instance.update((byte) 0);
            }
            String str3 = swo.f45297f;
            if (str3 != null) {
                instance.update(str3.getBytes(f45291j));
                instance.update((byte) 0);
            }
            String str4 = swo.f45298g;
            if (str4 != null) {
                instance.update(str4.getBytes(f45291j));
                instance.update((byte) 0);
            }
            String str5 = swo.f45299h;
            if (str5 != null) {
                instance.update(str5.getBytes(f45291j));
                instance.update((byte) 0);
            }
            String str6 = swo.f45300i;
            if (str6 != null) {
                instance.update(str6.getBytes(f45291j));
                instance.update((byte) 0);
            }
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
