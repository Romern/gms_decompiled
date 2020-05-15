package p000;

import android.content.Context;

/* renamed from: iss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iss {

    /* renamed from: a */
    public long f21624a;

    /* renamed from: b */
    public int f21625b;

    /* renamed from: c */
    public long f21626c;

    /* renamed from: d */
    public int f21627d = 1;

    /* renamed from: e */
    private final Context f21628e;

    /* renamed from: f */
    private final int f21629f;

    /* renamed from: g */
    private final int f21630g;

    public iss(Context context, int i, int i2) {
        this.f21628e = context;
        this.f21629f = i;
        this.f21630g = i2;
    }

    /* renamed from: a */
    public final void mo13321a(int i, long j) {
        bxvd da = bodt.f132731j.mo74144da();
        int i2 = this.f21625b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bodt bodt = (bodt) da.f164949b;
        int i3 = bodt.f132733a | 8;
        bodt.f132733a = i3;
        bodt.f132738f = i2;
        int i4 = this.f21627d;
        if (i4 != 0) {
            bodt.f132740h = i4;
            int i5 = i3 | 32;
            bodt.f132733a = i5;
            bodt.f132739g = this.f21630g;
            bodt.f132733a = i5 | 16;
            int a = ist.m16059a(this.f21628e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodt bodt2 = (bodt) da.f164949b;
            int i6 = bodt2.f132733a | 4;
            bodt2.f132733a = i6;
            bodt2.f132737e = a;
            int i7 = this.f21629f;
            int i8 = i6 | 2;
            bodt2.f132733a = i8;
            bodt2.f132736d = i7;
            long j2 = this.f21624a;
            bodt2.f132733a = i8 | 1;
            bodt2.f132734b = j2;
            if (ccfd.f178855a.mo6606a().mo75847a() && j > 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bodt bodt3 = (bodt) da.f164949b;
                bodt3.f132733a |= 64;
                bodt3.f132741i = j;
            }
            bxvd da2 = body.f132751e.mo74144da();
            long j3 = this.f21626c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            body body = (body) da2.f164949b;
            int i9 = body.f132753a | 2;
            body.f132753a = i9;
            body.f132755c = j3;
            body.f132754b = i - 1;
            body.f132753a = i9 | 1;
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
            bodt bodt4 = (bodt) da.f164949b;
            body3.getClass();
            if (!bodt4.f132735c.mo73666a()) {
                bodt4.f132735c = bxvk.m124021a(bodt4.f132735c);
            }
            bodt4.f132735c.add(body3);
            bxvd da3 = boct.f132600I.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            boct boct = (boct) da3.f164949b;
            boct.f132612c = 34;
            boct.f132610a |= 1;
            bodt bodt5 = (bodt) da.mo74062i();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            boct boct2 = (boct) da3.f164949b;
            bodt5.getClass();
            boct2.f132633x = bodt5;
            boct2.f132611b |= 1;
            ist.m16060a(this.f21628e, (boct) da3.mo74062i());
            return;
        }
        throw null;
    }
}
