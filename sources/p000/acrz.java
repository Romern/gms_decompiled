package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: acrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acrz {

    /* renamed from: c */
    private static acrz f60656c;

    /* renamed from: a */
    bynf f60657a;

    /* renamed from: b */
    bynw f60658b;

    private acrz() {
    }

    /* renamed from: a */
    public static synchronized acrz m49786a(Context context) {
        acrz acrz;
        synchronized (acrz.class) {
            if (f60656c == null) {
                Context applicationContext = context.getApplicationContext();
                f60656c = new acrz();
                acrq acrq = new acrq();
                acsa acsa = new acsa(applicationContext);
                cazf.m127594a(acsa);
                acrq.f60635a = acsa;
                cazf.m127595a(acrq.f60635a, acsa.class);
                acrr acrr = new acrr(acrq.f60635a);
                acrz acrz2 = f60656c;
                acrz2.f60657a = (bynf) acrr.f60636a.mo6445a();
                acrz2.f60658b = (bynw) acrr.f60637b.mo6445a();
            }
            acrz = f60656c;
        }
        return acrz;
    }

    /* renamed from: b */
    public static acry m49787b(Context context) {
        acry acry;
        if (!celx.m137222b()) {
            return null;
        }
        acry acry2 = (acry) acsf.f60663a.get();
        if (acry2 != null) {
            acry = new acry(acry2.f60652a);
            acry2.f60652a.mo74397a(acry2.f60653b, acry.f60653b);
        } else {
            acry = null;
        }
        if (acry != null) {
            return acry;
        }
        String str = (String) abzt.f58926bN.mo58455c();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        acrz a = m49786a(context);
        bynf bynf = a.f60657a;
        bmxy.m108581a(str);
        if (!bynf.mo74403a(str)) {
            bynf bynf2 = a.f60657a;
            bync bync = new bync();
            bync.f167103a = str;
            bynf2.mo74402a(new bynd(bync.f167103a));
        }
        return new acry(a.f60657a.mo74404b(str));
    }

    /* renamed from: a */
    public final void mo33051a() {
        bynw bynw = this.f60658b;
        bqgy c = bqgy.m112818c();
        aucb a = bynw.f167142c.mo25234a(bynw.f167140a, bynw.f167141b, new String[]{"SHERLOG"}, (byte[]) null);
        if (a == null) {
            c.mo69138b(bynu.TIMEOUT);
        } else {
            a.mo50371a(new acrv(c));
        }
    }
}
