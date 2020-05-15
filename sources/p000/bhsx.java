package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bhsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhsx {

    /* renamed from: a */
    private final SecretKeySpec f119522a;

    /* renamed from: b */
    private Cipher f119523b;

    /* renamed from: c */
    private Cipher f119524c;

    public bhsx(SecretKeySpec secretKeySpec) {
        this.f119522a = secretKeySpec;
    }

    /* renamed from: a */
    public static final int m101497a(int i) {
        return (i + 16) & -16;
    }

    /* renamed from: b */
    public final byte[] mo64248b(byte[] bArr) {
        try {
            if (this.f119524c == null) {
                this.f119524c = m101498a(2, this.f119522a);
            }
            return this.f119524c.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            this.f119524c = null;
            throw e;
        }
    }

    /* renamed from: a */
    private static Cipher m101498a(int i, SecretKeySpec secretKeySpec) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, new IvParameterSpec(new byte[16]));
        return instance;
    }

    /* renamed from: a */
    public final byte[] mo64247a(byte[] bArr) {
        try {
            if (this.f119523b == null) {
                this.f119523b = m101498a(1, this.f119522a);
            }
            return this.f119523b.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            this.f119523b = null;
            throw e;
        }
    }
}
