package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: grk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class grk {

    /* renamed from: a */
    private final qws f18885a;

    public grk(Context context) {
        this.f18885a = new qws(context, "ANDROID_AUTH", null);
    }

    /* renamed from: a */
    public final void mo12133a(int i) {
        if (((double) new Random().nextFloat()) < gnv.m13543ap()) {
            bxvd da = bofk.f132917c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bofk bofk = (bofk) da.f164949b;
            bofk.f132920b = i - 1;
            bofk.f132919a |= 1;
            bofk bofk2 = (bofk) da.mo74062i();
            bxvd da2 = boct.f132600I.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boct boct = (boct) da2.f164949b;
            boct.f132612c = 29;
            int i2 = boct.f132610a | 1;
            boct.f132610a = i2;
            bofk2.getClass();
            boct.f132632w = bofk2;
            boct.f132610a = 134217728 | i2;
            this.f18885a.mo24335a(((boct) da2.mo74062i()).mo73642k()).mo24327b();
        }
    }
}
