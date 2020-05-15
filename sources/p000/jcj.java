package p000;

import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.LockScreenRequiredException;
import android.security.keystore.recovery.RecoveryController;
import java.security.UnrecoverableKeyException;
import java.util.List;
import java.util.UUID;
import javax.crypto.SecretKey;

/* renamed from: jcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jcj {

    /* renamed from: a */
    public static final imn f22155a = new jci();

    /* renamed from: c */
    private static final sek f22156c = jdh.m16547a("WrappingKeyManager");

    /* renamed from: b */
    public final RecoveryController f22157b;

    public jcj(RecoveryController recoveryController) {
        this.f22157b = recoveryController;
    }

    /* renamed from: a */
    public static boolean m16493a(String str) {
        return str.startsWith("com.google.android.gms.auth.folsom/v1/");
    }

    /* renamed from: c */
    private final void m16494c(String str) {
        try {
            this.f22157b.removeKey(str);
        } catch (InternalRecoveryServiceException e) {
            f22156c.mo25417e("InternalRecoveryServiceException during attempt to remove key", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final SecretKey mo13579b(String str) {
        try {
            return (SecretKey) this.f22157b.getKey(str);
        } catch (InternalRecoveryServiceException e) {
            f22156c.mo25417e("InternalRecoveryServiceException getKey call", e, new Object[0]);
            return null;
        } catch (UnrecoverableKeyException e2) {
            f22156c.mo25411b("UnrecoverableKeyException during getKey call", e2, new Object[0]);
            m16494c(str);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.List, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final List mo13578a() {
        return bngx.m109355a(bnjd.m109586b((Iterable) this.f22157b.getAliases(), jcg.f22153a));
    }

    /* renamed from: b */
    public final void mo13580b() {
        try {
            for (String str : mo13578a()) {
                if (this.f22157b.getRecoveryStatus(str) != 3) {
                    return;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            String uuid = UUID.randomUUID().toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uuid).length() + 59);
            sb.append("com.google.android.gms.auth.folsom/v1/");
            sb.append(currentTimeMillis);
            sb.append("/");
            sb.append(uuid);
            this.f22157b.generateKey(sb.toString());
        } catch (LockScreenRequiredException e) {
            f22156c.mo25414c("Can't generate wrapping key - missing lock screeen", new Object[0]);
        } catch (InternalRecoveryServiceException e2) {
            f22156c.mo25411b("InternalRecoveryServiceException during wrapping key generation", e2, new Object[0]);
        }
    }
}
