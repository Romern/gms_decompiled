package p000;

import android.content.Context;

/* renamed from: dxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxi extends dxd {

    /* renamed from: f */
    private final tnj f14358f;

    public dxi(Context context, doh doh, tnj tnj, dwu dwu, dqb dqb) {
        super(context, "RegisterDeviceTask", doh, "registerdevice", 12545, 2, bxjb.f163601b, cdhr.m133452b(), dwu, dqb, null);
        this.f14358f = tnj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxjd mo9827a(bxxc bxxc) {
        bxjd bxjd = ((bxjb) bxxc).f163603a;
        return bxjd == null ? bxjd.f163616c : bxjd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo9830c() {
        bxvd da = bxja.f163596d.mo74144da();
        bxjc a = dwv.m9720a(this.f14340c, this.f14341d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxja bxja = (bxja) da.f164949b;
        a.getClass();
        bxja.f163599b = a;
        bxja.f163598a |= 1;
        bxvd da2 = bxix.f163580d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxix bxix = (bxix) da2.f164949b;
        bxix.f163583b = 2;
        bxix.f163582a |= 1;
        bxvd da3 = bxil.f163533c.mo74144da();
        String str = this.f14358f.f46295c;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bxil bxil = (bxil) da3.f164949b;
        str.getClass();
        bxil.f163535a |= 1;
        bxil.f163536b = str;
        bxil bxil2 = (bxil) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxix bxix2 = (bxix) da2.f164949b;
        bxil2.getClass();
        bxix2.f163584c = bxil2;
        bxix2.f163582a |= 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxja bxja2 = (bxja) da.f164949b;
        bxix bxix3 = (bxix) da2.mo74062i();
        bxix3.getClass();
        bxja2.f163600c = bxix3;
        bxja2.f163598a |= 2;
        return (bxja) da.mo74062i();
    }
}
