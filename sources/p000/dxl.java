package p000;

import android.content.Context;
import java.util.Set;

/* renamed from: dxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxl extends dxd {

    /* renamed from: f */
    private final Set f14361f;

    public dxl(Context context, doh doh, Set set, dwu dwu, dqb dqb) {
        super(context, "WriteInterestRecordTask", doh, "writeinterestrecords", 12546, 3, bxjv.f163686d, cdhr.m133452b(), dwu, dqb, null);
        this.f14361f = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxjd mo9827a(bxxc bxxc) {
        bxjd bxjd = ((bxjv) bxxc).f163688a;
        return bxjd == null ? bxjd.f163616c : bxjd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo9830c() {
        bxvd da = bxju.f163681d.mo74144da();
        bxjc a = dwv.m9720a(this.f14340c, this.f14341d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxju bxju = (bxju) da.f164949b;
        a.getClass();
        bxju.f163684b = a;
        bxju.f163683a |= 1;
        Set set = this.f14361f;
        if (!bxju.f163685c.mo73666a()) {
            bxju.f163685c = GeneratedMessageLite.m124021a(bxju.f163685c);
        }
        bxsy.m123078a(set, bxju.f163685c);
        bxju bxju2 = (bxju) da.mo74062i();
        new Object[1][0] = bxju2;
        return bxju2;
    }
}
