package p000;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ciwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwc implements ciwa {

    /* renamed from: a */
    public final int f191555a;

    /* renamed from: b */
    public final int f191556b;

    /* renamed from: c */
    public final byte[] f191557c;

    /* renamed from: d */
    public final byte[] f191558d;

    /* renamed from: e */
    public final civs f191559e;

    public ciwc(int i, SecretKeySpec secretKeySpec, civs civs, int i2, int i3, byte[] bArr, cive cive, cive cive2) {
        byte[] bArr2 = {cixd.m151106a(i)};
        bxvd da = ciwe.f191569f.mo74144da();
        ByteString a = ByteString.m123261a(civs.mo86595a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwe ciwe = (ciwe) da.f164949b;
        a.getClass();
        int i4 = ciwe.f191571a | 1;
        ciwe.f191571a = i4;
        ciwe.f191572b = a;
        int i5 = i4 | 2;
        ciwe.f191571a = i5;
        ciwe.f191573c = i2;
        ciwe.f191571a = i5 | 4;
        ciwe.f191574d = i3;
        ByteString a2 = ByteString.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwe ciwe2 = (ciwe) da.f164949b;
        a2.getClass();
        ciwe2.f191571a |= 8;
        ciwe2.f191575e = a2;
        byte[] k = ((ciwe) da.mo74062i()).serializeToBytes();
        this.f191558d = cixd.m151108a(bArr2, k, m151069a(i, cive, cive2, secretKeySpec, cixd.m151108a(bArr2, k)));
        this.f191559e = civs;
        this.f191556b = i2;
        this.f191557c = bArr;
        this.f191555a = i;
    }

    /* renamed from: a */
    public static final byte[] m151069a(int i, cive cive, cive cive2, SecretKeySpec secretKeySpec, byte[] bArr) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(secretKeySpec);
            if (i >= 3) {
                instance.update(cive.f191525a.mo86595a());
                instance.update(cive2.f191525a.mo86595a());
            }
            byte[] bArr2 = new byte[8];
            System.arraycopy(instance.doFinal(bArr), 0, bArr2, 0, 8);
            return bArr2;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final byte[] mo86602a() {
        return this.f191558d;
    }

    /* renamed from: b */
    public final int mo86603b() {
        return 2;
    }

    public ciwc(byte[] bArr) {
        try {
            byte[][] a = cixd.m151110a(bArr, 1, bArr.length - 9, 8);
            byte b = a[0][0];
            byte[] bArr2 = a[1];
            byte[] bArr3 = a[2];
            if (cixd.m151107a(b) <= 1) {
                StringBuilder sb = new StringBuilder(27);
                sb.append("Legacy message: ");
                sb.append(cixd.m151107a(b));
                throw new civk(sb.toString());
            } else if (cixd.m151107a(b) <= 3) {
                ciwe ciwe = (ciwe) GeneratedMessageLite.m124014a(ciwe.f191569f, bArr2);
                int i = ciwe.f191571a;
                if ((i & 8) == 0 || (i & 2) == 0 || (1 & i) == 0) {
                    throw new civi("Incomplete message.");
                }
                this.f191558d = bArr;
                this.f191559e = civq.m151054b(ciwe.f191572b.getKey());
                this.f191555a = cixd.m151107a(b);
                this.f191556b = ciwe.f191573c;
                this.f191557c = ciwe.f191575e.getKey();
            } else {
                StringBuilder sb2 = new StringBuilder(28);
                sb2.append("Unknown version: ");
                sb2.append(cixd.m151107a(b));
                throw new civi(sb2.toString());
            }
        } catch (bxwf | civg | ParseException e) {
            throw new civi(e);
        }
    }
}
