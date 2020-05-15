package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: apuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apuh {

    /* renamed from: a */
    private static final String f84918a = apuh.class.getSimpleName();

    /* renamed from: a */
    public static int m71020a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m71027b(Context context) {
        apgy apgy = new apgy(context);
        return apgy.mo47203b() && apgy.m70270b(apgy.f84364a);
    }

    /* renamed from: c */
    public static boolean m71029c(Context context, String str) {
        try {
            rfz.m33557a(context).mo24605a(str);
            return true;
        } catch (SecurityException e) {
            Log.e(f84918a, String.format("%s: %s", e.getMessage(), e.getCause()));
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m71028b(Context context, String str) {
        if (rfy.m33549f(context) || "com.android.vending".equals(str) || "com.google.android.gms".equals(str)) {
            return m71029c(context, str);
        }
        return false;
    }

    /* renamed from: a */
    public static Intent m71021a(Context context, Class cls) {
        return new Intent().setClassName(context, m71023a(cls));
    }

    /* renamed from: a */
    public static Intent m71022a(Context context, String str) {
        return new Intent().setClassName(context, str);
    }

    /* renamed from: a */
    public static String m71023a(Class cls) {
        return cls.getCanonicalName().replace("Chimera", "");
    }

    /* renamed from: a */
    public static Map m71024a(byte[] bArr) {
        MessageDigest b = spn.m35868b("SHA-256");
        if (b == null) {
            return null;
        }
        String encodeToString = Base64.encodeToString(b.digest(bArr), 2);
        HashMap hashMap = new HashMap();
        hashMap.put("contentBinding", encodeToString);
        return hashMap;
    }

    /* renamed from: a */
    public static void m71025a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static byte[] m71026a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            m71025a();
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read < 0) {
                    return instance.digest();
                }
                instance.update(bArr, 0, read);
            }
        } finally {
            fileInputStream.close();
        }
    }
}
