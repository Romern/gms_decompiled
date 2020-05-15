package p000;

import java.util.HashMap;

/* renamed from: dpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpp {

    /* renamed from: a */
    public dph f13784a;

    /* renamed from: b */
    public boolean f13785b;

    /* renamed from: c */
    public int f13786c;

    /* renamed from: d */
    public int f13787d;

    /* renamed from: e */
    public final bxvd f13788e;

    public dpp(long j) {
        bxvd da = bxhl.f163417d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhl bxhl = (bxhl) da.f164949b;
        int i = bxhl.f163419a | 1;
        bxhl.f163419a = i;
        bxhl.f163420b = j;
        bxhl.f163419a = i | 2;
        bxhl.f163421c = Long.MAX_VALUE;
        this.f13788e = da;
        this.f13784a = new dph();
        this.f13785b = true;
        this.f13786c = 0;
        this.f13787d = 0;
    }

    /* renamed from: a */
    public final void mo9404a() {
        this.f13787d++;
    }

    /* renamed from: b */
    public final bxhj mo9405b() {
        if (this.f13785b) {
            return null;
        }
        bxvd da = bxhj.f163405f.mo74144da();
        bxvd bxvd = this.f13788e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhj bxhj = (bxhj) da.f164949b;
        bxhl bxhl = (bxhl) bxvd.mo74062i();
        bxhl.getClass();
        bxhj.f163409c = bxhl;
        bxhj.f163407a |= 1;
        int i = this.f13786c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhj bxhj2 = (bxhj) da.f164949b;
        int i2 = bxhj2.f163407a | 2;
        bxhj2.f163407a = i2;
        bxhj2.f163410d = i;
        int i3 = this.f13787d;
        bxhj2.f163407a = i2 | 4;
        bxhj2.f163411e = i3;
        int i4 = 0;
        for (HashMap hashMap : this.f13784a.f13741a.values()) {
            i4 += hashMap.size();
        }
        if (i4 == 0) {
            return (bxhj) da.mo74062i();
        }
        for (HashMap hashMap2 : this.f13784a.mo9381b()) {
            for (dpg dpg : hashMap2.values()) {
                bxvd bxvd2 = dpg.f13739c;
                bxhl bxhl2 = (bxhl) dpg.f13740d.mo74062i();
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bxhc bxhc = (bxhc) bxvd2.f164949b;
                bxhc bxhc2 = bxhc.f163338e;
                bxhl2.getClass();
                bxhc.f163343d = bxhl2;
                bxhc.f163340a |= 4;
                bxhc bxhc3 = (bxhc) bxvd2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxhj bxhj3 = (bxhj) da.f164949b;
                bxhc3.getClass();
                if (!bxhj3.f163408b.mo73666a()) {
                    bxhj3.f163408b = GeneratedMessageLite.m124021a(bxhj3.f163408b);
                }
                bxhj3.f163408b.add(bxhc3);
            }
        }
        return (bxhj) da.mo74062i();
    }
}
