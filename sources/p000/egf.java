package p000;

import java.io.PrintWriter;

/* renamed from: egf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egf {
    /* renamed from: a */
    public static boolean m10351a(PrintWriter printWriter, String str, String str2, boolean z, String str3, boolean z2) {
        if (!z) {
            return false;
        }
        if (z2) {
            printWriter.print(str3);
        }
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        printWriter.print(sb.toString());
        return true;
    }
}
