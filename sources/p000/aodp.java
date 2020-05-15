package p000;

import java.util.Formatter;

/* renamed from: aodp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aodp extends shd {

    /* renamed from: a */
    public final shj f78226a;

    public aodp(shj shj) {
        this.f78226a = shj;
        shj.f44447g = 6400;
    }

    /* renamed from: a */
    public static String m65835a(shc shc, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("people/%1$s", shd.m35267a(str));
        if (shc != null) {
            shc.mo25531a(sb);
        }
        if (str2 != null) {
            shd.m35269a(sb, "onBehalfOf", shd.m35267a(str2));
        }
        return sb.toString();
    }
}
