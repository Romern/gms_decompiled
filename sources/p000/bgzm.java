package p000;

import java.io.PrintWriter;
import java.util.Map;

/* renamed from: bgzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzm {

    /* renamed from: a */
    public static final String[] f118162a = {"key", "value"};

    /* renamed from: a */
    public static void m100453a(Map map, PrintWriter printWriter) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String valueOf = String.valueOf(entry.getValue());
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            printWriter.println(sb.toString());
        }
    }
}
