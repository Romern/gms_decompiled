package p000;

import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.security.EncryptedAccountData;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: acxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxx {

    /* renamed from: a */
    public final SecureRandom f61060a;

    /* renamed from: b */
    private final SecretKey f61061b;

    /* renamed from: c */
    private final SecretKey f61062c;

    /* renamed from: d */
    private final acya f61063d;

    /* renamed from: e */
    private final acyb f61064e;

    public acxx(acya acya, SecretKey secretKey, acyb acyb, SecretKey secretKey2, SecureRandom secureRandom) {
        sdo.checkIfNull(acya, "Cipher must not be null.");
        sdo.checkIfNull(secretKey, "Message key must not be null.");
        sdo.checkIfNull(acyb, "MAC must not be null.");
        sdo.checkIfNull(secretKey2, "MAC key must not be null.");
        sdo.checkIfNull(secureRandom, "Random must not be null.");
        this.f61063d = acya;
        this.f61062c = secretKey2;
        this.f61061b = secretKey;
        this.f61064e = acyb;
        this.f61060a = secureRandom;
    }

    /* renamed from: a */
    public final boolean mo33223a(EncryptedAccountData encryptedAccountData) {
        byte[] bArr = encryptedAccountData.f79106c;
        byte[] bArr2 = encryptedAccountData.f79105b;
        try {
            this.f61064e.mo33233a(this.f61062c);
            this.f61064e.mo33234a(bArr);
            return MessageDigest.isEqual(encryptedAccountData.f79107d, this.f61064e.mo33235b(bArr2));
        } catch (InvalidKeyException e) {
            throw new IllegalStateException("The key didn't match the MAC supplied.", e);
        }
    }

    /* renamed from: b */
    public final AccountData mo33226b(EncryptedAccountData encryptedAccountData) {
        byte[] bArr = encryptedAccountData.f79106c;
        byte[] bArr2 = encryptedAccountData.f79105b;
        try {
            this.f61063d.mo33231a(2, this.f61061b, new IvParameterSpec(bArr), this.f61060a);
            try {
                return (AccountData) sef.m35069a(this.f61063d.mo33232a(bArr2), AccountData.CREATOR);
            } catch (IllegalBlockSizeException e) {
                throw new IllegalStateException("Your cipher algorithm should request unpadding.");
            } catch (BadPaddingException e2) {
                return null;
            }
        } catch (InvalidKeyException e3) {
            throw new IllegalStateException("The key didn't match the cipher supplied.", e3);
        } catch (InvalidAlgorithmParameterException e4) {
            return null;
        }
    }

    /* renamed from: a */
    public final byte[] mo33224a(AccountData accountData, byte[] bArr) {
        byte[] a = sef.m35074a(accountData);
        try {
            this.f61063d.mo33231a(1, this.f61061b, new IvParameterSpec(bArr), this.f61060a);
            try {
                return this.f61063d.mo33232a(a);
            } catch (IllegalBlockSizeException e) {
                throw new IllegalStateException("Your cipher algorithm should request padding.");
            } catch (BadPaddingException e2) {
                return null;
            }
        } catch (InvalidAlgorithmParameterException e3) {
            return null;
        } catch (InvalidKeyException e4) {
            throw new IllegalStateException("The key didn't match the cipher supplied.", e4);
        }
    }

    /* renamed from: a */
    public final byte[] mo33225a(byte[] bArr, byte[] bArr2) {
        try {
            this.f61064e.mo33233a(this.f61062c);
            this.f61064e.mo33234a(bArr);
            return this.f61064e.mo33235b(bArr2);
        } catch (InvalidKeyException e) {
            throw new IllegalStateException("The key didn't match the MAC supplied.", e);
        }
    }
}
