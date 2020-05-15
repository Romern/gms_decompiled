package p000;

import android.content.Context;

/* renamed from: ndt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ndt extends ndr {

    /* renamed from: b */
    private final mro f35363b;

    /* renamed from: a */
    public final void mo20499a(Context context) {
        bxvd a = lyu.m24685a();
        mro mro = this.f35363b;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mqk mqk2 = mqk.f34276G;
        mro.getClass();
        mqk.f34288e = mro;
        mqk.f34284a |= 4;
        mo20495a(context, a, mqj.GET_DEVICES);
    }

    public ndt(int i, int i2, int i3) {
        bxvd da = mro.f34456e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mro mro = (mro) da.f164949b;
        int i4 = mro.f34458a | 1;
        mro.f34458a = i4;
        mro.f34459b = i;
        int i5 = i4 | 2;
        mro.f34458a = i5;
        mro.f34460c = i2;
        mro.f34458a = i5 | 4;
        mro.f34461d = i3;
        this.f35363b = (mro) da.mo74062i();
    }
}
