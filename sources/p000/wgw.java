package p000;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: wgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgw {
    /* renamed from: a */
    public static String m41936a(String str, int i) {
        StringBuilder sb = new StringBuilder(12);
        sb.append("s");
        sb.append(i);
        return ryx.m34684a(TextUtils.join("-", Arrays.asList(sb.toString(), "cc", "mo", "rp")), str).toString();
    }
}
