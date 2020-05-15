package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;

/* renamed from: hmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hmc {

    /* renamed from: a */
    public static final sek f20015a = ght.m13172b("ChromeSyncApiHelper");

    /* renamed from: b */
    public final Intent f20016b;

    private hmc(Context context) {
        this.f20016b = new Intent().setPackage(context.getPackageName()).putExtra("component_name", "auth_api_credentials");
    }

    /* renamed from: a */
    public static hmc m14599a(Context context) {
        return new hmc(context);
    }

    /* renamed from: b */
    public final bqgg mo12617b(acyr acyr) {
        qqa qqa = (qqa) qqs.m32662b().mo24210a(acyr.mo33252a());
        return qqk.m32658a(qqa, this.f20016b, new hly(qqa));
    }

    /* renamed from: a */
    public final bqgg mo12612a(acyr acyr) {
        qqa qqa = (qqa) qqs.m32663c().mo24210a(acyr.mo33252a());
        qqa qqa2 = (qqa) qqs.m32662b().mo24210a(acyr.mo33252a());
        if (((Boolean) hfa.f19632a.mo58455c()).booleanValue()) {
            return bqdx.m112674a(bqdx.m112673a(bqdx.m112673a(mo12614a(acyr, bnic.m109491a("credentials_enable_sync", "credentials_enable_service", "credentials_need_first_time_welcome")), hlo.f19986a, bqfb.INSTANCE), hlt.f19993a, bqfb.INSTANCE), new hlu(this, acyr, qqa2), bqfb.INSTANCE);
        }
        return bqga.m112786c(adbb.m50100a(qqa.mo24202b(this.f20016b)), adbb.m50100a(qqa2.mo24202b(this.f20016b))).mo69216a(bqel.m112709a(), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public final bqgg mo12618b(acyr acyr, qun qun) {
        qqa qqa = (qqa) qqs.m32662b().mo24210a(acyr.mo33252a());
        return adax.m50093a(qqk.m32658a(qqa, this.f20016b, new hlp(qqa, qun)), qun);
    }

    /* renamed from: a */
    public final bqgg mo12613a(acyr acyr, String str) {
        String a = qqt.m32667a(str);
        return bqdx.m112674a(bqdf.m112619a(adbb.m50100a(qqs.m32665e().mo24210a(acyr.mo33252a()).mo24693a(a, Bundle.EMPTY)), rjp.class, hlz.f20002a, bqfb.INSTANCE), new hma(this, a, (qqa) qqs.m32662b().mo24210a(acyr.mo33252a())), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo12614a(acyr acyr, Set set) {
        qqa qqa = (qqa) qqs.m32663c().mo24210a(acyr.mo33252a());
        return bqdx.m112673a(qqk.m32658a(qqa, this.f20016b, new hlv(qqa)), new hlw(set), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo12615a(acyr acyr, qun qun) {
        qqa qqa = (qqa) qqs.m32662b().mo24210a(acyr.mo33252a());
        return adax.m50093a(qqk.m32658a(qqa, this.f20016b, new hmb(qqa, qun)), qun);
    }

    /* renamed from: a */
    public final bqgg mo12616a(acyr acyr, quo quo) {
        qqa qqa = (qqa) qqs.m32663c().mo24210a(acyr.mo33252a());
        return adax.m50093a(qqk.m32658a(qqa, this.f20016b, new hlx(qqa, quo)), quo);
    }
}
