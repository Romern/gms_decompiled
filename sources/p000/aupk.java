package p000;

import android.content.Context;

/* renamed from: aupk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aupk {
    /* renamed from: a */
    public static String m77566a(String str, String str2) {
        return String.format("<from>%s</from><target>%s</target>", str, str2);
    }

    /* renamed from: a */
    public static final void m77567a(Context context, bohi bohi) {
        bxvd da = boct.f132600I.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boct boct = (boct) da.f164949b;
        boct.f132612c = 4;
        int i = boct.f132610a | 1;
        boct.f132610a = i;
        bohi.getClass();
        boct.f132616g = bohi;
        boct.f132610a = i | 16;
        new qws(context, "ANDROID_AUTH", null).mo24333a((boct) da.mo74062i()).mo24327b();
    }
}
