package p000;

import android.content.Context;

/* renamed from: isq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class isq {

    /* renamed from: a */
    private final Context f21623a;

    /* renamed from: a */
    public final void mo13319a(int i) {
        bxvd da = bodq.f132725c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bodq bodq = (bodq) da.f164949b;
        bodq.f132728b = i - 1;
        bodq.f132727a |= 1;
        bodq bodq2 = (bodq) da.mo74062i();
        bxvd da2 = boct.f132600I.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boct boct = (boct) da2.f164949b;
        boct.f132612c = 46;
        boct.f132610a |= 1;
        bodq2.getClass();
        boct.f132607F = bodq2;
        boct.f132611b |= 4096;
        ist.m16060a(this.f21623a, (boct) da2.mo74062i());
    }

    public isq(Context context) {
        this.f21623a = context;
    }

    /* renamed from: a */
    public final void mo13320a(isp isp) {
        bxvd da = bodo.f132717f.mo74144da();
        int i = isp.f21622d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bodo bodo = (bodo) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            bodo.f132723e = i2;
            int i3 = bodo.f132719a | 8;
            bodo.f132719a = i3;
            String str = isp.f21619a;
            if (str != null) {
                str.getClass();
                i3 |= 1;
                bodo.f132719a = i3;
                bodo.f132720b = str;
            }
            int i4 = isp.f21620b;
            if (i4 > 0) {
                bodo.f132719a = i3 | 4;
                bodo.f132722d = i4;
            }
            bxvd da2 = body.f132751e.mo74144da();
            int i5 = isp.f21621c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            body body = (body) da2.f164949b;
            body.f132754b = i5 - 1;
            body.f132753a |= 1;
            long currentTimeMillis = System.currentTimeMillis();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            body body2 = (body) da2.f164949b;
            body2.f132753a |= 4;
            body2.f132756d = currentTimeMillis;
            body body3 = (body) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodo bodo2 = (bodo) da.f164949b;
            body3.getClass();
            bodo2.f132721c = body3;
            bodo2.f132719a |= 2;
            bxvd da3 = boct.f132600I.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            boct boct = (boct) da3.f164949b;
            boct.f132612c = 44;
            boct.f132610a |= 1;
            bodo bodo3 = (bodo) da.mo74062i();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            boct boct2 = (boct) da3.f164949b;
            bodo3.getClass();
            boct2.f132605D = bodo3;
            boct2.f132611b |= 1024;
            ist.m16060a(this.f21623a, (boct) da3.mo74062i());
            return;
        }
        throw null;
    }
}
