package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: beye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beye {

    /* renamed from: a */
    private static long f113006a = 0;

    /* renamed from: b */
    private static final Map f113007b = new HashMap();

    /* renamed from: a */
    public static synchronized void m96084a(long j) {
        synchronized (beye.class) {
            long j2 = j - f113006a;
            if (j2 > 600000) {
                f113006a = j;
                for (String str : f113007b.keySet()) {
                    beyd beyd = (beyd) f113007b.get(str);
                    String[] split = str.split("/");
                    if (split.length != 3) {
                        String valueOf = String.valueOf(str);
                        if (valueOf.length() == 0) {
                            new String("Bad key: ");
                        } else {
                            "Bad key: ".concat(valueOf);
                        }
                    } else {
                        beyc.m96083a(split[0], split[1], split[2], beyd.f113005a);
                    }
                }
                f113007b.clear();
                return;
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Not ready for upload, ");
            sb.append((600000 - j2) / 1000);
            sb.append(" seconds left.");
            sb.toString();
        }
    }

    /* renamed from: a */
    public static synchronized void m96085a(String str, String str2, String str3, long j) {
        synchronized (beye.class) {
            StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            sb.append("/");
            sb.append(str3);
            String sb2 = sb.toString();
            beyd beyd = (beyd) f113007b.get(sb2);
            if (beyd == null) {
                f113007b.put(sb2, new beyd(j));
            } else {
                beyd.f113005a += j;
            }
        }
    }
}
