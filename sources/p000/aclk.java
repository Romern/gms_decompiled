package p000;

import android.content.ComponentName;
import java.util.zip.CRC32;

/* renamed from: aclk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aclk {

    /* renamed from: a */
    private static CRC32 f60093a;

    private aclk() {
    }

    /* renamed from: a */
    private static long m49386a(String str) {
        long value;
        synchronized (aclk.class) {
            if (f60093a == null) {
                f60093a = new CRC32();
            }
            f60093a.reset();
            f60093a.update(str.getBytes());
            value = f60093a.getValue();
        }
        return value;
    }

    /* renamed from: a */
    public static String m49387a(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (flattenToShortString.length() <= 256) {
            return flattenToShortString;
        }
        String packageName = componentName.getPackageName();
        String className = componentName.getClassName();
        String valueOf = String.valueOf(m49386a(packageName));
        String valueOf2 = String.valueOf(m49386a(className));
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(packageName);
        sb.append("/");
        sb.append(valueOf2);
        String sb2 = sb.toString();
        if (sb2.length() > 256) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(className).length());
            sb3.append(valueOf);
            sb3.append("/");
            sb3.append(className);
            sb2 = sb3.toString();
            if (sb2.length() > 256) {
                bmxy.m108600b((valueOf.length() + 1) + valueOf2.length() <= 256);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
                sb4.append(valueOf);
                sb4.append("/");
                sb4.append(valueOf2);
                return sb4.toString();
            }
        }
        return sb2;
    }
}
