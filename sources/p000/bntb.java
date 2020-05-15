package p000;

import java.lang.reflect.InvocationTargetException;

/* renamed from: bntb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bntb {

    /* renamed from: a */
    public static final bntd f132118a = m110364a(bntd.f132122d);

    /* renamed from: a */
    private static bntd m110364a(String[] strArr) {
        bntd bntd;
        try {
            bntd = bnte.m110380a();
        } catch (NoClassDefFoundError e) {
            bntd = null;
        }
        if (bntd != null) {
            return bntd;
        }
        StringBuilder sb = new StringBuilder();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                return (bntd) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(10);
                sb.append(str);
                sb.append(": ");
                sb.append(th);
                i++;
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
