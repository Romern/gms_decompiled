package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bgui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgui {

    /* renamed from: a */
    private SecretKeySpec f117563a;

    /* renamed from: b */
    private Cipher f117564b;

    /* renamed from: c */
    private Cipher f117565c;

    public bgui(SecretKeySpec secretKeySpec) {
        this.f117563a = secretKeySpec;
    }

    /* renamed from: a */
    private static Cipher m99981a(int i, SecretKeySpec secretKeySpec) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, new IvParameterSpec(new byte[16]));
        return instance;
    }

    /* renamed from: b */
    public final byte[] mo63205b(byte[] bArr) {
        try {
            if (this.f117565c == null) {
                this.f117565c = m99981a(2, this.f117563a);
            }
            return this.f117565c.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            this.f117565c = null;
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo63203a(SecretKeySpec secretKeySpec) {
        this.f117563a = secretKeySpec;
        try {
            this.f117564b = m99981a(1, secretKeySpec);
            this.f117565c = m99981a(2, this.f117563a);
        } catch (GeneralSecurityException e) {
            this.f117564b = null;
            this.f117565c = null;
        }
    }

    /* renamed from: a */
    public final byte[] mo63204a(byte[] bArr) {
        try {
            if (this.f117564b == null) {
                this.f117564b = m99981a(1, this.f117563a);
            }
            return this.f117564b.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            this.f117564b = null;
            throw e;
        }
    }
}
