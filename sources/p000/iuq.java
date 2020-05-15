package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.crypto.SecretKey;

/* renamed from: iuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iuq {

    /* renamed from: a */
    public static final sek f21814a = new sek(new String[]{"ChallengeDecryptor"}, (char[]) null);

    /* renamed from: b */
    private final ios f21815b;

    /* renamed from: c */
    private final ExecutorService f21816c;

    public iuq(Context context) {
        ios a = inl.m15759a(context);
        bqgj b = snp.m35704b(9);
        this.f21815b = a;
        this.f21816c = b;
    }

    /* renamed from: a */
    private static final PublicKey m16175a(bxtx bxtx) {
        return bysu.m125293a((bytb) bxvk.m124007a(bytb.f167639f, bxtx));
    }

    /* renamed from: a */
    public static final byte[] m16176a(byti byti, SecretKey secretKey, byte[] bArr) {
        try {
            byte[] k = byti.f167675c.mo73780k();
            bytd a = bysw.m125311a((byti) bxvk.m124007a(byti.f167671d, byti.f167674b), secretKey, byss.HMAC_SHA256, secretKey, bysr.AES_256_CBC);
            if ((a.f167660a & 2) != 0) {
                bytd bytd = (bytd) bxvk.m124007a(bytd.f167658d, a.f167662c);
                int i = bytd.f167660a;
                if ((i & 1) == 0 || (i & 2) == 0) {
                    throw new iuk("Missing header or body in decrypted message");
                }
                bytc bytc = bytd.f167661b;
                if (bytc == null) {
                    bytc = bytc.f167647i;
                }
                if ((bytc.f167649a & 4) != 0) {
                    bysw.m125313a((byti) bxvk.m124014a(byti.f167671d, k), m16175a(bytc.f167652d), byss.RSA2048_SHA256, bArr);
                    return bytd.f167662c.mo73780k();
                }
                throw new iuk("Missing verification key in decrypted message");
            }
            throw new iuk("Missing body in encrypted message");
        } catch (bxwf | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e) {
            throw new iuk("Error when decrypting the message.", e);
        }
    }

    /* renamed from: a */
    public final bqgg mo13342a(byte[] bArr, byte[] bArr2) {
        try {
            byti byti = (byti) bxvk.m124014a(byti.f167671d, bArr);
            int i = byti.f167673a;
            if ((i & 1) == 0) {
                throw new iuk("Missing header and body in encrypted message wrapper");
            } else if ((i & 2) != 0) {
                bytc a = bysw.m125309a((byti) bxvk.m124007a(byti.f167671d, byti.f167674b));
                if ((a.f167649a & 8) != 0) {
                    PublicKey a2 = m16175a(a.f167653e);
                    bqgy c = bqgy.m112818c();
                    byte[] a3 = byrr.m125226a(a2);
                    bqgy c2 = bqgy.m112818c();
                    List d = soz.m35801d(rpr.m34216b(), rpr.m34216b().getPackageName());
                    if (!d.isEmpty()) {
                        ClientPublicKey clientPublicKey = new ClientPublicKey(a3);
                        this.f21815b.mo13181a("PublicKey", (Account) d.get(0), clientPublicKey).mo50378a(this.f21816c, new iun(c2));
                        bqga.m112781a(c2, new iuo(byti, bArr2, c), bqfb.INSTANCE);
                        return c;
                    }
                    throw new iuk("No account found.");
                }
                throw new iuk("Missing decryptionKeyId in encrypted message");
            } else {
                throw new iuk("Missing transport binding signature");
            }
        } catch (bxwf | InvalidKeySpecException e) {
            throw new iuk("Error parsing the message.", e);
        }
    }
}
