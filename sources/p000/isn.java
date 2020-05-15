package p000;

import android.content.Context;

/* renamed from: isn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class isn {

    /* renamed from: a */
    public int f21612a;

    /* renamed from: b */
    public int f21613b;

    /* renamed from: c */
    private final Context f21614c;

    /* renamed from: a */
    public final void mo13317a() {
        bxvd da = bodw.f132744e.mo74144da();
        int i = this.f21613b;
        if (i != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodw bodw = (bodw) da.f164949b;
            bodw.f132747b = i;
            bodw.f132746a |= 1;
        }
        bxvd da2 = boct.f132600I.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boct boct = (boct) da2.f164949b;
        boct.f132612c = 35;
        boct.f132610a |= 1;
        int i2 = this.f21612a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bodw bodw2 = (bodw) da.f164949b;
        if (i2 != 0) {
            bodw2.f132748c = i2;
            bodw2.f132746a |= 2;
            int a = ist.m16059a(this.f21614c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodw bodw3 = (bodw) da.f164949b;
            bodw3.f132746a |= 4;
            bodw3.f132749d = a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boct boct2 = (boct) da2.f164949b;
            bodw bodw4 = (bodw) da.mo74062i();
            bodw4.getClass();
            boct2.f132634y = bodw4;
            boct2.f132611b |= 2;
            ist.m16060a(this.f21614c, (boct) da2.mo74062i());
            return;
        }
        throw null;
    }

    public isn(Context context) {
        this.f21614c = context;
    }
}
