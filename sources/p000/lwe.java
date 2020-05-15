package p000;

import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;

/* renamed from: lwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwe implements lwd {

    /* renamed from: a */
    private static final lvn f33103a = new lvn("CryptoStatusFetcher");

    /* renamed from: b */
    private final RecoveryController f33104b;

    /* renamed from: c */
    private final lwb f33105c;

    /* renamed from: d */
    private final lwc f33106d;

    /* renamed from: e */
    private final lyt f33107e;

    public lwe(RecoveryController recoveryController, lwb lwb, lwc lwc, lyt lyt) {
        sdo.m34959a(lyt);
        this.f33107e = lyt;
        sdo.m34959a(recoveryController);
        this.f33104b = recoveryController;
        sdo.m34959a(lwb);
        this.f33105c = lwb;
        sdo.m34959a(lwc);
        this.f33106d = lwc;
    }

    /* renamed from: a */
    public static lwd m24540a(Context context) {
        return new lwe(RecoveryController.getInstance(context), lwb.m24518a(context), lwc.m24524a(context), new lyt(context));
    }

    /* renamed from: b */
    public final boolean mo19701b() {
        f33103a.mo25412b("Checking whether any secondary key is synced.", new Object[0]);
        bmxv a = this.f33106d.mo19691a();
        bmxv b = this.f33106d.mo19695b();
        if (m24542a(a) || m24542a(b)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo19702c() {
        bmxv a = this.f33106d.mo19691a();
        if (!a.mo66813a()) {
            f33103a.mo25412b("Alias not present.", new Object[0]);
            return false;
        }
        try {
            return m24541a(1, (String) a.mo66814b());
        } catch (InternalRecoveryServiceException e) {
            f33103a.mo25417e("Exception getting recovery status for active secondary key.", e, new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m24541a(int i, String str) {
        int recoveryStatus = this.f33104b.getRecoveryStatus(str);
        if (recoveryStatus == 0) {
            f33103a.mo25412b("Secondary key synced.", new Object[0]);
        } else if (recoveryStatus != 1) {
            f33103a.mo25418e("Secondary key has bad sync status %d.", Integer.valueOf(recoveryStatus));
            this.f33107e.mo19760a(4);
        } else {
            f33103a.mo25412b("Secondary key sync in progress.", new Object[0]);
            this.f33107e.mo19760a(3);
        }
        return recoveryStatus == i;
    }

    /* renamed from: a */
    private final boolean m24542a(bmxv bmxv) {
        if (!bmxv.mo66813a()) {
            f33103a.mo25412b("Alias not present.", new Object[0]);
            return false;
        }
        try {
            return m24541a(0, (String) bmxv.mo66814b());
        } catch (InternalRecoveryServiceException e) {
            f33103a.mo25417e("Exception getting recovery status for active secondary key.", e, new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo19700a() {
        if (!lwb.m24519c()) {
            f33103a.mo25412b("Android not crypto capable so no need to unlock", new Object[0]);
            return false;
        } else if (!this.f33105c.mo19689a()) {
            f33103a.mo25412b("Encryption not initialized so no need to unlock", new Object[0]);
            return false;
        } else {
            bmxv a = this.f33106d.mo19691a();
            if (!a.mo66813a()) {
                f33103a.mo25412b("Initialized but no secondary key, user needs to unlock", new Object[0]);
                this.f33107e.mo19760a(2);
                return true;
            }
            try {
                if (!m24541a(0, (String) a.mo66814b())) {
                    return true;
                }
                return false;
            } catch (InternalRecoveryServiceException e) {
                f33103a.mo25417e("Exception getting recovery status so no need to unlock", e, new Object[0]);
                return false;
            }
        }
    }
}
