package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.LockScreenRequiredException;
import java.security.UnrecoverableKeyException;

/* renamed from: lxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lxg {

    /* renamed from: a */
    private static final lvn f33148a = new lvn("StartSecondaryKeyRotationTask");

    /* renamed from: b */
    private final Context f33149b;

    /* renamed from: c */
    private final lwc f33150c;

    /* renamed from: d */
    private final lwr f33151d;

    /* renamed from: e */
    private final lwb f33152e;

    public lxg(Context context, lwb lwb, lwc lwc, lwr lwr, sqv sqv) {
        sdo.m34959a(context);
        this.f33149b = context;
        sdo.m34959a(lwb);
        this.f33152e = lwb;
        sdo.m34959a(lwc);
        this.f33150c = lwc;
        sdo.m34959a(lwr);
        this.f33151d = lwr;
        sdo.m34959a(sqv);
    }

    /* renamed from: a */
    private final void m24594a(Exception exc) {
        mab.m24748a(this.f33149b, exc, cclp.m130475e());
    }

    /* renamed from: a */
    public final void mo19722a() {
        if (this.f33152e.mo19689a()) {
            f33148a.mo25414c("Attempting to initiate a secondary key rotation.", new Object[0]);
            this.f33150c.mo19692a(System.currentTimeMillis());
            bmxv a = this.f33150c.mo19691a();
            if (!a.mo66813a()) {
                f33148a.mo25416d("No active current alias. Cannot trigger a secondary rotation.", new Object[0]);
                return;
            }
            String str = (String) a.mo66814b();
            bmxv b = this.f33150c.mo19695b();
            if (b.mo66813a()) {
                String str2 = (String) b.mo66814b();
                if (str2.equals(str)) {
                    Exception exc = new Exception("Was already trying to rotate to what is already the active key.");
                    f33148a.mo25418e(exc.getMessage(), new Object[0]);
                    m24594a(exc);
                } else {
                    f33148a.mo25416d("Was already rotating to another key. Cancelling that.", new Object[0]);
                    try {
                        this.f33151d.mo19712a(str2);
                    } catch (Exception e) {
                        f33148a.mo25419f("Could not remove old key", e, new Object[0]);
                        m24594a(e);
                    }
                }
                this.f33150c.mo19699d();
            }
            try {
                String str3 = this.f33151d.mo19711a().f33123a;
                f33148a.mo25414c("Generated a new secondary key with alias '%s'", str3);
                try {
                    lwc lwc = this.f33150c;
                    lwc.mo19697b(str3);
                    SharedPreferences.Editor edit = lwc.f33100c.edit();
                    edit.putString("nextSecondary", str3);
                    edit.apply();
                    f33148a.mo25414c("Successfully set '%s' as next key to rotate to", str3);
                } catch (lwg e2) {
                    f33148a.mo25417e("Unexpected error setting next alias", e2, new Object[0]);
                    m24594a(e2);
                    try {
                        this.f33151d.mo19712a(str3);
                    } catch (Exception e3) {
                        f33148a.mo25419f("Failed to remove generated key after encountering error", e3, new Object[0]);
                        m24594a(e3);
                    }
                }
            } catch (LockScreenRequiredException e4) {
                f33148a.mo25417e("No lock screen is set - cannot generate a new key to rotate to.", e4, new Object[0]);
                m24594a(e4);
            } catch (InternalRecoveryServiceException e5) {
                f33148a.mo25417e("Internal error in Recovery Controller, failed to rotate key.", e5, new Object[0]);
                m24594a(e5);
            } catch (UnrecoverableKeyException e6) {
                f33148a.mo25417e("Failed to get key after generating, failed to rotate", e6, new Object[0]);
                m24594a(e6);
            }
        }
    }
}
