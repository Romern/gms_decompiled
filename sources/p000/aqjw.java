package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* renamed from: aqjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjw {

    /* renamed from: a */
    public static final sek f86247a = new sek("SetupServices", "AuditHelper");

    /* renamed from: a */
    public static aucb m71743a(Context context, Account account) {
        if (account == null) {
            return aucu.m76778a((Object) null);
        }
        aucf aucf = new aucf();
        new aqjt(context, account, aucf).start();
        return aucf.f91388a;
    }

    /* renamed from: a */
    public static aucb m71744a(Context context, ggp ggp, byte[] bArr) {
        ggk a = ggh.m13102a(context);
        bxvd da = bsqx.f146703c.mo74144da();
        bxtx a2 = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqx bsqx = (bsqx) da.f164949b;
        a2.getClass();
        bsqx.f146705a |= 1;
        bsqx.f146706b = a2;
        ggp.f18145d = ((bsqx) da.mo74062i()).mo73642k();
        LogAuditRecordsRequest a3 = ggp.mo11799a();
        sek sek = f86247a;
        String valueOf = String.valueOf(a3);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Audit request=");
        sb.append(valueOf);
        sek.mo25412b(sb.toString(), new Object[0]);
        return a.mo11796a(a3);
    }

    /* renamed from: a */
    public static bsqw m71745a(Context context, String str, boolean z, aqjv aqjv) {
        bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
        bxvd da = bsre.f146739d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsre bsre = (bsre) da.f164949b;
        bsre.f146742b = 1;
        bsre.f146741a |= 1;
        bsrc a = m71746a(context, str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsre bsre2 = (bsre) da.f164949b;
        a.getClass();
        bsre2.f146743c = a;
        bsre2.f146741a |= 2;
        bsqv.mo70706a((bsre) da.mo74062i());
        bxvd da2 = bsre.f146739d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsre bsre3 = (bsre) da2.f164949b;
        bsre3.f146742b = 2;
        bsre3.f146741a |= 1;
        bsrc a2 = m71746a(context, str);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsre bsre4 = (bsre) da2.f164949b;
        a2.getClass();
        bsre4.f146743c = a2;
        bsre4.f146741a |= 2;
        bsqv.mo70706a((bsre) da2.mo74062i());
        bxvd da3 = bssm.f146877d.mo74144da();
        bsmx bsmx = z ? aqjv.f86245e : aqjv.f86246f;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bssm bssm = (bssm) da3.f164949b;
        bssm.f146880b = bsmx.f145962iC;
        bssm.f146879a |= 1;
        bssi bssi = bssi.f146862i;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bssm bssm2 = (bssm) da3.f164949b;
        bssi.getClass();
        bssm2.f146881c = bssi;
        bssm2.f146879a |= 8;
        bssm bssm3 = (bssm) da3.mo74062i();
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw = (bsqw) bsqv.f164949b;
        bssm3.getClass();
        bsqw.f146702f = bssm3;
        bsqw.f146697a |= 8;
        bxvd da4 = bsrf.f146744d.mo74144da();
        bsmz bsmz = aqjv.f86244d;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsrf bsrf = (bsrf) da4.f164949b;
        bsrf.f146747b = bsmz.f146213dO;
        bsrf.f146746a |= 1;
        bsrg bsrg = bsrg.f146749m;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsrf bsrf2 = (bsrf) da4.f164949b;
        bsrg.getClass();
        bsrf2.f146748c = bsrg;
        bsrf2.f146746a |= 2;
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw2 = (bsqw) bsqv.f164949b;
        bsrf bsrf3 = (bsrf) da4.mo74062i();
        bsrf3.getClass();
        bsqw2.f146701e = bsrf3;
        bsqw2.f146697a |= 4;
        return (bsqw) bsqv.mo74062i();
    }

    /* renamed from: a */
    private static bsrc m71746a(Context context, String str) {
        bxvd da = bsrc.f146733d.mo74144da();
        if (str != null) {
            bxvd da2 = bsrb.f146729c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsrb bsrb = (bsrb) da2.f164949b;
            str.getClass();
            bsrb.f146731a |= 1;
            bsrb.f146732b = str;
            bsrb bsrb2 = (bsrb) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsrc bsrc = (bsrc) da.f164949b;
            bsrb2.getClass();
            bsrc.f146736b = bsrb2;
            bsrc.f146735a |= 1;
        }
        bxvd da3 = bsra.f146725c.mo74144da();
        String hexString = Long.toHexString(spn.m35843a(context));
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsra bsra = (bsra) da3.f164949b;
        hexString.getClass();
        bsra.f146727a |= 1;
        bsra.f146728b = hexString;
        bsra bsra2 = (bsra) da3.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrc bsrc2 = (bsrc) da.f164949b;
        bsra2.getClass();
        bsrc2.f146737c = bsra2;
        bsrc2.f146735a |= 2;
        return (bsrc) da.mo74062i();
    }
}
