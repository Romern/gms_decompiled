package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.contextmanager.acl.UserConsentManager$1;
import com.google.android.gms.location.reporting.ReportingState;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: dpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpe extends dwm {

    /* renamed from: a */
    public final Context f13732a;

    /* renamed from: b */
    public final BroadcastReceiver f13733b = new UserConsentManager$1(this, "contextmanager");

    /* renamed from: c */
    protected final Map f13734c = new HashMap();

    /* renamed from: d */
    private final rjx f13735d;

    public dpe(Context context) {
        rjx a = aeqc.m52384a(context);
        this.f13732a = context;
        this.f13735d = a;
    }

    /* renamed from: e */
    private final int m9004e(doh doh) {
        try {
            return ((ReportingState) aucu.m76783a(this.f13735d.mo24736c(doh.mo9337a()), 30000, TimeUnit.MILLISECONDS)).mo43732c() ? 1 : 2;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("dpe", "e", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[UserConsentManager] Unable to retrieve ULR status.");
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9367a(Intent intent) {
        if (TextUtils.equals(intent.getAction(), "com.google.android.gms.udc.action.SETTING_CHANGED")) {
            if (TextUtils.isEmpty(intent.getStringExtra("com.google.android.gms.udc.extra.accountName"))) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dpe", "a", 135, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[UserConsentManager] Account name from UDC Api is empty or null.");
                return;
            }
            dwq.m9681y();
            mo9371d(dof.m8924b(intent.getStringExtra("com.google.android.gms.udc.extra.accountName")));
        } else if (TextUtils.equals(intent.getAction(), "com.google.android.gms.location.reporting.SETTINGS_CHANGED")) {
            for (doh doh : dwq.m9681y().mo9331a()) {
                mo9370c(doh);
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public final boolean mo9369b(doh doh) {
        if (cdgp.f180782a.mo6606a().mo77525Q()) {
            return false;
        }
        if (this.f13734c.get(doh) == null || ((dpd) this.f13734c.get(doh)).f13730b == 0) {
            mo9371d(doh);
            if (this.f13734c.get(doh) == null || ((dpd) this.f13734c.get(doh)).f13730b != 1) {
                return false;
            }
            return true;
        } else if (((dpd) this.f13734c.get(doh)).f13730b == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo9370c(doh doh) {
        int e = m9004e(doh);
        if (!this.f13734c.containsKey(doh)) {
            this.f13734c.put(doh, new dpd());
        }
        ((dpd) this.f13734c.get(doh)).f13729a = e;
    }

    /* renamed from: d */
    public final void mo9371d(doh doh) {
        if (!this.f13734c.containsKey(doh)) {
            this.f13734c.put(doh, new dpd());
        }
        Context context = this.f13732a;
        auzx auzx = new auzx();
        auzx.mo51098a(doh.f13690b);
        auzz.m78131a(context, auzx.mo51097a()).mo24671C().mo50378a(dwq.m9667k().mo9432a(dqy.m9123a("UserConsentManager_retrieveUdcConsents")), new dpc(this, "[UserConsentManager] retrieve UDC consents", new Object[0], doh));
    }

    /* renamed from: a */
    public final boolean mo9368a(doh doh) {
        if (this.f13734c.get(doh) != null && ((dpd) this.f13734c.get(doh)).f13729a != 0) {
            return ((dpd) this.f13734c.get(doh)).f13729a == 1;
        }
        mo9370c(doh);
        return this.f13734c.get(doh) != null && ((dpd) this.f13734c.get(doh)).f13729a == 1;
    }
}
