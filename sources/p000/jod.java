package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.proximity.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.ToggleEasyUnlockRequestEntity;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: jod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jod {

    /* renamed from: b */
    private static final Logger f22923b = jsy.m17256a("DeviceSyncRequester");

    /* renamed from: a */
    public final jrm f22924a;

    /* renamed from: c */
    private final Context f22925c;

    public jod(Context context) {
        shj shj = new shj(context, cchl.f178991a.mo6606a().mo75964b(), "cryptauth/v1/", false, true, null, null, 25345);
        sdo.m34959a(context);
        this.f22925c = context;
        this.f22924a = new jrm(shj);
    }

    /* renamed from: a */
    public final ClientContext mo13931a(String str) {
        Account account = new Account(str, "com.google");
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = "com.google.android.gms";
        clientContext.f30216f = "com.google.android.gms";
        clientContext.f30212b = this.f22925c.getApplicationInfo().uid;
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        clientContext.mo17806d(cchl.f178991a.mo6606a().mo75963a());
        return clientContext;
    }

    /* renamed from: a */
    public final jrk mo13932a() {
        jrj jrj = new jrj();
        jrj.f23130a = (long) Build.VERSION.SDK_INT;
        jrj.f23134e.add(2);
        jrj.f23131b = this.f22925c.getPackageName();
        jrj.f23134e.add(3);
        jrj.f23132c = 201515033;
        jrj.f23134e.add(4);
        jrj.f23133d = "android";
        jrj.f23134e.add(5);
        return new DeviceClassifierEntity(jrj.f23134e, jrj.f23130a, jrj.f23131b, jrj.f23132c, jrj.f23133d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x009f, code lost:
        if (r19 != p000.bsni.EASY_UNLOCK_HOST) goto L_0x00a4;
     */
    /* renamed from: a */
    public final void mo13933a(String str, bsni bsni, boolean z, boolean z2) {
        jta a = jsz.m17257a();
        Context context = this.f22925c;
        bsni.name();
        byte[] b = jpt.m17081b(context);
        if (b == null) {
            f22923b.mo25418e("There was an error retrieving public key.", new Object[0]);
            a.mo14056l(1);
            return;
        }
        String c = sqd.m35970c(b);
        if (cchu.m129747c()) {
            f22923b.mo25416d("Trying to make v1 ToggleEasyUnlockRequest even though v1 is off!", new Object[0]);
            return;
        }
        f22923b.mo25414c("Making v1 ToggleEasyUnlockRequest. Feature: %s Enabled: %s isExclusive: %s", bsni.name(), Boolean.valueOf(z), Boolean.valueOf(z2));
        jrs jrs = new jrs();
        jrs.f23144e = c;
        jrs.f23145f.add(7);
        jrs.f23141b = z;
        jrs.f23145f.add(4);
        jrs.f23143d = z2;
        jrs.f23145f.add(6);
        jrs.f23140a = (DeviceClassifierEntity) mo13932a();
        jrs.f23145f.add(3);
        if (ccig.f179039a.mo6606a().mo76020q()) {
        }
        jrs.f23142c = jkq.m16851a(bsni);
        jrs.f23145f.add(5);
        jta a2 = jsz.m17257a();
        try {
            jrm jrm = this.f22924a;
            ClientContext a3 = mo13931a(str);
            ToggleEasyUnlockRequestEntity toggleEasyUnlockRequestEntity = new ToggleEasyUnlockRequestEntity(jrs.f23145f, false, jrs.f23140a, jrs.f23141b, jrs.f23142c, jrs.f23143d, jrs.f23144e);
            jrm.f23135a.mo25539a(a3, 1, new StringBuilder("deviceSync/toggleeasyunlock").toString(), toggleEasyUnlockRequestEntity);
            a2.mo14056l(0);
        } catch (VolleyError e) {
            f22923b.mo25417e("VolleyError setting feature enabled", e, new Object[0]);
            a2.mo14056l(2);
            throw e;
        } catch (gid e2) {
            f22923b.mo25417e("GoogleAuthException setting feature enabled", e2, new Object[0]);
            a2.mo14056l(3);
            throw e2;
        }
    }
}
