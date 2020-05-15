package p000;

import android.content.Context;
import android.database.Cursor;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;
import java.io.IOException;
import java.util.Locale;
import javax.crypto.SecretKey;

/* renamed from: lxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lxf {

    /* renamed from: a */
    private static final lvn f33142a = new lvn("RotateSecondaryKeyTask");

    /* renamed from: b */
    private final Context f33143b;

    /* renamed from: c */
    private final lwr f33144c;

    /* renamed from: d */
    private final lwj f33145d;

    /* renamed from: e */
    private final lwc f33146e;

    /* renamed from: f */
    private final RecoveryController f33147f;

    public lxf(Context context, lwr lwr, lwj lwj, lwc lwc, RecoveryController recoveryController) {
        this.f33143b = context;
        sdo.m34959a(lwr);
        this.f33144c = lwr;
        sdo.m34959a(lwc);
        this.f33146e = lwc;
        sdo.m34959a(lwj);
        this.f33145d = lwj;
        sdo.m34959a(recoveryController);
        this.f33147f = recoveryController;
    }

    /* renamed from: a */
    private final void m24591a(Exception exc) {
        mab.m24748a(this.f33143b, exc, cclp.m130475e());
    }

    /* renamed from: a */
    private final void m24592a(lwp lwp) {
        Cursor query;
        Throwable th;
        bnhe bnhe;
        lwp lwp2 = lwp;
        bmxv a = this.f33146e.mo19691a();
        if (a.mo66813a()) {
            String str = (String) a.mo66814b();
            bmxv b = this.f33144c.mo19713b(str);
            if (b.mo66813a()) {
                lwp lwp3 = (lwp) b.mo66814b();
                String str2 = lwp3.f33123a;
                String str3 = lwp2.f33123a;
                if (str3.equals(str2)) {
                    f33142a.mo25414c("%s was already the active alias.", str2);
                    return;
                }
                lwv a2 = lwv.m24579a(this.f33143b, lwp3);
                try {
                    lxa a3 = a2.f33130b.mo19714a();
                    String str4 = a2.f33129a.f33123a;
                    bnha h = bnhe.m109414h();
                    query = a3.f33135a.mo19717b().query("tertiary_keys", new String[]{"_id", "secondary_key_alias", "package_name", "wrapped_key_bytes"}, "secondary_key_alias = ?", new String[]{str4}, null, null, null);
                    while (query.moveToNext()) {
                        String string = query.getString(query.getColumnIndexOrThrow("package_name"));
                        h.mo67695b(string, new lwz(str4, string, query.getBlob(query.getColumnIndexOrThrow("wrapped_key_bytes"))));
                    }
                    if (query != null) {
                        query.close();
                    }
                    bnhe b2 = h.mo67618b();
                    a2.f33130b.mo19715b();
                    bnha h2 = bnhe.m109414h();
                    bnrd a4 = b2.keySet().iterator();
                    while (a4.hasNext()) {
                        String str5 = (String) a4.next();
                        byte[] bArr = ((lwz) b2.get(str5)).f33134c;
                        bxus b3 = bxus.m123743b();
                        h2.mo67695b(str5, lwu.m24577a(a2.f33129a.f33124b, (mde) GeneratedMessageLite.m124016a(mde.f33472f, bArr, b3)));
                    }
                    bnhe b4 = h2.mo67618b();
                    if (!b4.isEmpty()) {
                        bnha h3 = bnhe.m109414h();
                        bnrd a5 = b4.keySet().iterator();
                        while (a5.hasNext()) {
                            String str6 = (String) a5.next();
                            h3.mo67695b(str6, lwu.m24578a(lwp2.f33124b, (SecretKey) b4.get(str6)));
                        }
                        bnhe = h3.mo67618b();
                        lwv a6 = lwv.m24579a(this.f33143b, lwp2);
                        lxa a7 = a6.f33130b.mo19714a();
                        try {
                            for (String str7 : bnhe.keySet()) {
                                if (a7.mo19719a(new lwz(a6.f33129a.f33123a, str7, ((mde) bnhe.get(str7)).serializeToBytes())) == -1) {
                                    throw new IOException("Failed to commit to db");
                                }
                            }
                        } finally {
                            a6.f33130b.mo19715b();
                        }
                    } else {
                        bnhe = bnoj.f131912b;
                    }
                    this.f33145d.mo19705a(str3, bnhe);
                    this.f33146e.mo19693a(str3);
                    this.f33146e.mo19699d();
                    try {
                        this.f33147f.removeKey(str2);
                        return;
                    } catch (InternalRecoveryServiceException e) {
                        f33142a.mo25417e("Error removing old secondary key from RecoverableKeyStoreLoader", e, new Object[0]);
                        m24591a((Exception) e);
                        return;
                    }
                } catch (Throwable th2) {
                    a2.f33130b.mo19715b();
                    throw th2;
                }
            } else {
                throw new lxb(String.format(Locale.US, "Had local active Folsom key alias of %s but key was not in user's keychain.", str));
            }
        } else {
            f33142a.mo25414c("Was asked to rotate secondary key, but local config did not have a secondary key alias set.", new Object[0]);
            throw new lxe("No local active secondary key set.");
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo19721a() {
        bmxv bmxv;
        try {
            bmxv b = this.f33146e.mo19695b();
            if (b.mo66813a()) {
                bmxv = this.f33144c.mo19713b((String) b.mo66814b());
            } else {
                bmxv = bmvz.f131120a;
            }
            if (!bmxv.mo66813a()) {
                f33142a.mo25412b("No secondary key rotation task pending. Exiting.", new Object[0]);
                return;
            }
            lwp lwp = (lwp) bmxv.mo66814b();
            try {
                String str = lwp.f33123a;
                f33142a.mo25414c("Key rotation to %s is pending. Checking key sync status.", str);
                int recoveryStatus = this.f33147f.getRecoveryStatus(str);
                if (recoveryStatus == 3) {
                    f33142a.mo25418e("Permanent failure to sync %s. Cannot possibly rotate to it.", str);
                    this.f33146e.mo19699d();
                    m24591a(new Exception("Permanent failure to sync secondary key."));
                    return;
                }
                if (recoveryStatus != 0) {
                    f33142a.mo25414c("Sync still pending for %s", str);
                    if (recoveryStatus != 0) {
                        return;
                    }
                } else {
                    f33142a.mo25414c("Secondary key %s has now synced! Commencing rotation", str);
                }
                try {
                    m24592a(lwp);
                } catch (Exception e) {
                    f33142a.mo25417e("Error trying to rotate to new secondary key", e, new Object[0]);
                    m24591a(e);
                }
            } catch (InternalRecoveryServiceException e2) {
                f33142a.mo25417e("Error encountered checking whether next secondary key is synced", e2, new Object[0]);
                m24591a((Exception) e2);
            }
        } catch (Exception e3) {
            f33142a.mo25417e("Error checking for next key", e3, new Object[0]);
            m24591a(e3);
        }
    }
}
