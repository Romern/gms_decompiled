package p000;

import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;
import javax.crypto.SecretKey;

/* renamed from: lwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwp {

    /* renamed from: c */
    private static final lvn f33122c = new lvn("FolsomSecondaryKey");

    /* renamed from: a */
    public final String f33123a;

    /* renamed from: b */
    public final SecretKey f33124b;

    public lwp(String str, SecretKey secretKey) {
        sdo.m34959a((Object) str);
        this.f33123a = str;
        sdo.m34959a(secretKey);
        this.f33124b = secretKey;
    }

    /* renamed from: a */
    public static String m24569a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Error" : "Destroyed" : "Synced" : "Not synced";
    }

    /* renamed from: a */
    public final int mo19710a(Context context) {
        try {
            int recoveryStatus = RecoveryController.getInstance(context).getRecoveryStatus(this.f33123a);
            if (recoveryStatus == 3) {
                return 3;
            }
            if (recoveryStatus == 0) {
                return 2;
            }
            if (recoveryStatus == 1) {
                return 1;
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("Unexpected status from getRecoveryStatus: ");
            sb.append(recoveryStatus);
            throw new InternalRecoveryServiceException(sb.toString());
        } catch (InternalRecoveryServiceException e) {
            f33122c.mo25419f("Internal error getting recovery status", e, new Object[0]);
            mab.m24748a(context, e, cclp.m130474d());
            return 4;
        }
    }
}
