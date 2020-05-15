package p000;

import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;

/* renamed from: ndz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ndz extends neb {

    /* renamed from: a */
    private final lvn f35380a = new lvn("PostPEncryptionSnapshotLogHelper");

    /* renamed from: b */
    private final Context f35381b;

    /* renamed from: c */
    private final lvr f35382c;

    /* renamed from: d */
    private final lwc f35383d;

    /* renamed from: e */
    private final RecoveryController f35384e;

    public ndz(Context context, lwc lwc) {
        this.f35381b = context;
        this.f35382c = lvr.f33060a;
        this.f35383d = lwc;
        this.f35384e = RecoveryController.getInstance(context);
    }

    /* renamed from: a */
    public final Boolean mo20509a() {
        return Boolean.valueOf(lwb.m24518a(this.f35381b).mo19690b());
    }

    /* renamed from: b */
    public final Boolean mo20510b() {
        return Boolean.valueOf(this.f35382c.mo19662g(this.f35381b));
    }

    /* renamed from: c */
    public final int mo20511c() {
        bmxv a = this.f35383d.mo19691a();
        if (!a.mo66813a()) {
            return 3;
        }
        try {
            int recoveryStatus = this.f35384e.getRecoveryStatus((String) a.mo66814b());
            if (recoveryStatus != 0) {
                return recoveryStatus != 1 ? 6 : 5;
            }
            return 4;
        } catch (InternalRecoveryServiceException e) {
            this.f35380a.mo25417e("Exception getting recovery status", e, new Object[0]);
            return 2;
        }
    }
}
