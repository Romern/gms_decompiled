package p000;

import android.security.keystore.recovery.InternalRecoveryServiceException;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import javax.crypto.SecretKey;

/* renamed from: nbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbl {
    /* renamed from: a */
    private static bmxv m25889a(myo myo, mbx mbx, String str) {
        try {
            return myo.mo20314a().mo19713b(str);
        } catch (InternalRecoveryServiceException | UnrecoverableKeyException e) {
            mbx.mo19838b(26, 4);
            String valueOf = String.valueOf(str);
            throw new ncu(valueOf.length() == 0 ? new String("Could not retrieve key:") : "Could not retrieve key:".concat(valueOf), e);
        }
    }

    /* renamed from: a */
    public static SecretKey m25890a(myo myo, mbx mbx, String str, mde mde) {
        bmxv a = m25889a(myo, mbx, str);
        if (!a.mo66813a()) {
            mbx.mo19838b(14, 4);
            String valueOf = String.valueOf(str);
            String str2 = valueOf.length() == 0 ? new String("No key:") : "No key:".concat(valueOf);
            if (!ccnu.f179578a.mo6606a().mo76496f()) {
                throw new ncu(str2);
            }
            throw new nct(str2);
        }
        try {
            return lwu.m24577a(((lwp) a.mo66814b()).f33124b, mde);
        } catch (InvalidKeyException e) {
            mbx.mo19838b(25, 4);
            throw new ncw(e);
        }
    }
}
