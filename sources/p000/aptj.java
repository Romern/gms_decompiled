package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aptj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aptj {

    /* renamed from: a */
    private static final String f84852a = aptj.class.getSimpleName();

    /* renamed from: a */
    public static Intent m70970a(Context context, Class cls) {
        return new Intent().setClassName(context, cls.getCanonicalName().replace("Chimera", ""));
    }

    /* renamed from: a */
    public static Map m70971a(byte[] bArr) {
        MessageDigest a = spo.m35903a("SHA-256");
        if (a == null) {
            return null;
        }
        String encodeToString = Base64.encodeToString(a.digest(bArr), 2);
        HashMap hashMap = new HashMap();
        hashMap.put("contentBinding", encodeToString);
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m70972a(Context context, String str) {
        try {
            rfz.m33557a(context).mo24605a(str);
            return true;
        } catch (SecurityException e) {
            Log.e(f84852a, String.format("%s: %s", e.getMessage(), e.getCause()));
            return false;
        }
    }

    /* renamed from: a */
    public static byte[] m70973a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read < 0) {
                        return instance.digest();
                    }
                    instance.update(bArr, 0, read);
                }
            } else {
                throw new IllegalStateException();
            }
        } finally {
            fileInputStream.close();
        }
    }
}
