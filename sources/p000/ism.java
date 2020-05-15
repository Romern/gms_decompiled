package p000;

import android.content.Context;

/* renamed from: ism */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ism {

    /* renamed from: a */
    private final Context f21611a;

    /* renamed from: a */
    public final void mo13316a(int i) {
        bxvd da = bodm.f132712c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bodm bodm = (bodm) da.f164949b;
        bodm.f132715b = i - 1;
        bodm.f132714a |= 1;
        bodm bodm2 = (bodm) da.mo74062i();
        bxvd da2 = boct.f132600I.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boct boct = (boct) da2.f164949b;
        boct.f132612c = 45;
        boct.f132610a |= 1;
        bodm2.getClass();
        boct.f132606E = bodm2;
        boct.f132611b |= 2048;
        ist.m16060a(this.f21611a, (boct) da2.mo74062i());
    }

    public ism(Context context) {
        this.f21611a = context;
    }
}
