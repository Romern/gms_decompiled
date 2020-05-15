package p000;

import android.content.Context;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;
import java.security.SecureRandom;
import javax.crypto.SecretKey;

/* renamed from: lwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwr {

    /* renamed from: a */
    private RecoveryController f33126a;

    /* renamed from: b */
    private final Context f33127b;

    /* renamed from: c */
    private final SecureRandom f33128c;

    public lwr(Context context, SecureRandom secureRandom) {
        this.f33126a = null;
        bmxy.m108581a(context);
        this.f33127b = context;
        bmxy.m108581a(secureRandom);
        this.f33128c = secureRandom;
    }

    /* renamed from: a */
    public static lwr m24571a(Context context) {
        if (cclp.m130473c()) {
            return new lwr(context, new SecureRandom());
        }
        return new lwr(RecoveryController.getInstance(context), context, new SecureRandom());
    }

    /* renamed from: b */
    private final RecoveryController m24572b() {
        if (cclp.m130473c()) {
            return RecoveryController.getInstance(this.f33127b);
        }
        if (this.f33126a == null) {
            this.f33126a = RecoveryController.getInstance(this.f33127b);
        }
        return this.f33126a;
    }

    public lwr(RecoveryController recoveryController, Context context, SecureRandom secureRandom) {
        this.f33126a = recoveryController;
        bmxy.m108581a(context);
        this.f33127b = context;
        bmxy.m108581a(secureRandom);
        this.f33128c = secureRandom;
    }

    /* renamed from: b */
    public final bmxv mo19713b(String str) {
        return bmxv.m108567c((SecretKey) m24572b().getKey(str)).mo66810a((bmxj) new lwq(str));
    }

    /* renamed from: a */
    public final lwp mo19711a() {
        byte[] bArr = new byte[16];
        this.f33128c.nextBytes(bArr);
        String valueOf = String.valueOf(boan.f132472f.mo68794a(bArr));
        String str = valueOf.length() == 0 ? new String("com.google.android.gms.backup/folsom/") : "com.google.android.gms.backup/folsom/".concat(valueOf);
        RecoveryController b = m24572b();
        b.generateKey(str);
        SecretKey secretKey = (SecretKey) b.getKey(str);
        if (secretKey != null) {
            return new lwp(str, secretKey);
        }
        throw new InternalRecoveryServiceException(String.format("Generated key %s but then could not get it back immediately afterwards.", str));
    }

    /* renamed from: a */
    public final void mo19712a(String str) {
        m24572b().removeKey(str);
    }
}
