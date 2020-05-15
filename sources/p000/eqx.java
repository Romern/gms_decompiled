package p000;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: eqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eqx {

    /* renamed from: a */
    public final Logger f15540a;

    /* renamed from: b */
    public final ffk f15541b;

    /* renamed from: c */
    public final ExecutorService f15542c;

    /* renamed from: d */
    public final erg f15543d;

    /* renamed from: e */
    public final bmzi f15544e;

    /* renamed from: f */
    public final eor f15545f;

    /* renamed from: g */
    public final ffv f15546g;

    public eqx(Context context, ffk ffk, ExecutorService executorService, erg erg, eor eor) {
        equ equ = new equ(context);
        ffv a = ffv.m11622a(context, ffk);
        Logger a2 = ffw.m11631a("RemoteResourceProducer");
        this.f15541b = ffk;
        this.f15542c = executorService;
        this.f15543d = erg;
        this.f15544e = equ;
        this.f15545f = eor;
        this.f15546g = a;
        this.f15540a = a2;
    }

    /* renamed from: a */
    public final ern mo10424a(bsxk bsxk, long j, String str, boolean z, esr esr) {
        bsxn bsxn;
        epq epq = new epq(bsxk, j);
        String str2 = this.f15541b.f16458a;
        bsxn bsxn2 = epq.f15491a.f147583d;
        if (bsxn2 != null) {
            bsxn = bsxn2;
        } else {
            bsxn = bsxn.f147586d;
        }
        return new ern(str2, str, bsxn, z, esr.f15638a, epq);
    }
}
