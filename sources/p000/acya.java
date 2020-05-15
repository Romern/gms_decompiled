package p000;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: acya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acya {

    /* renamed from: a */
    private final Cipher f61070a;

    public acya() {
        this.f61070a = null;
    }

    /* renamed from: a */
    public final void mo33231a(int i, SecretKey secretKey, IvParameterSpec ivParameterSpec, SecureRandom secureRandom) {
        this.f61070a.init(i, secretKey, ivParameterSpec, secureRandom);
    }

    public acya(Cipher cipher) {
        this.f61070a = cipher;
    }

    /* renamed from: a */
    public final byte[] mo33232a(byte[] bArr) {
        return this.f61070a.doFinal(bArr);
    }
}
