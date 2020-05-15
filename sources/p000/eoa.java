package p000;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: eoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eoa {

    /* renamed from: a */
    public static final /* synthetic */ int f15378a = 0;

    /* renamed from: b */
    private static final String f15379b = eoa.class.getName();

    private eoa() {
    }

    /* renamed from: a */
    public static String m10821a(Object obj, boolean z) {
        String valueOf = String.valueOf(obj);
        if (obj == null || TextUtils.isEmpty(valueOf) || z) {
            return valueOf;
        }
        String a = m10823a(valueOf.getBytes());
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2);
        sb.append("[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public static void m10826b(String str, String str2, Object... objArr) {
        Log.i(str, m10822a(str2, objArr));
    }

    /* renamed from: c */
    public static void m10828c(String str, String str2, Object... objArr) {
        Log.w(str, m10822a(str2, objArr));
    }

    /* renamed from: d */
    public static void m10829d(String str, String str2, Object... objArr) {
        Log.wtf(str, m10822a(str2, objArr), new eob());
    }

    /* renamed from: b */
    public static void m10827b(String str, Throwable th, String str2, Object... objArr) {
        Log.w(str, m10822a(str2, objArr), th);
    }

    /* renamed from: a */
    private static String m10822a(String str, Object... objArr) {
        String str2;
        try {
            if (objArr.length != 0) {
                str = String.format(Locale.US, str, objArr);
            }
        } catch (IllegalFormatException e) {
            String arrays = Arrays.toString(objArr);
            Log.wtf("Blog", m10822a("msg: \"%s\" args: %s", str, arrays), new eob(e));
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(arrays).length());
            sb.append(str);
            sb.append(" ");
            sb.append(arrays);
            str = sb.toString();
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            if (!className.equals(f15379b) && !className.endsWith("Log")) {
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String methodName = stackTraceElement.getMethodName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(methodName).length());
                sb2.append(substring);
                sb2.append(".");
                sb2.append(methodName);
                str2 = sb2.toString();
                break;
            }
            i++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* renamed from: a */
    public static String m10823a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m10824a(String str, String str2, Object... objArr) {
        Log.e(str, m10822a(str2, objArr));
    }

    /* renamed from: a */
    public static void m10825a(String str, Throwable th, String str2, Object... objArr) {
        Log.e(str, m10822a(str2, objArr), th);
    }
}
