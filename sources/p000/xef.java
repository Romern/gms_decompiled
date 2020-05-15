package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;

/* renamed from: xef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xef implements xdm {

    /* renamed from: a */
    private static final sek f52063a = new sek(new String[]{"SoftwareKeyCryptoHelper"}, (short[]) null);

    /* renamed from: b */
    static xee m42758b(byte[] bArr) {
        xlu xlu;
        if (bArr != null) {
            try {
                bnim bnim = bypx.m125087b(bArr).mo74447f().f167361a;
                byps a = bypx.m125083a(1);
                byps a2 = bypx.m125083a(2);
                if (!bnim.containsKey(a) || !bnim.containsKey(a2)) {
                    throw new xma("Missing required map values in decoding keys from storage.");
                }
                KeyFactory instance = KeyFactory.getInstance("EC");
                KeyPair keyPair = new KeyPair(instance.generatePublic(new X509EncodedKeySpec(((bypx) bnim.get(a2)).mo74445d().f167357a.mo73780k())), instance.generatePrivate(new PKCS8EncodedKeySpec(((bypx) bnim.get(a)).mo74445d().f167357a.mo73780k())));
                byps a3 = bypx.m125083a(3);
                if (bnim.containsKey(a3)) {
                    xlu = xlu.m43152a((bypx) bnim.get(a3));
                } else {
                    xlu = null;
                }
                return new xee(keyPair, xlu);
            } catch (bypq | bypw | InvalidKeySpecException e) {
                throw new xma("Unable to decode key data from storage.", e);
            } catch (NoSuchAlgorithmException e2) {
                throw new xma("Provider error in decoding key data.", e2);
            }
        } else {
            throw new xma("Unable to decode key data (data was null).");
        }
    }

    /* renamed from: a */
    public final xlu mo29648a(byte[] bArr) {
        return m42758b(bArr).f52062b;
    }

    /* renamed from: a */
    public final void mo29649a(xjx xjx) {
    }

    /* renamed from: c */
    public final Signature mo29653c(xjx xjx, byte[] bArr) {
        try {
            Signature instance = Signature.getInstance("SHA256withECDSA");
            instance.initSign(m42758b(bArr).f52061a.getPrivate());
            return instance;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new xma("Provider error when creating signature object.", e);
        }
    }

    /* renamed from: a */
    public final boolean mo29650a(xjx xjx, byte[] bArr) {
        try {
            m42758b(bArr);
            return true;
        } catch (xma e) {
            f52063a.mo25418e("Unable to decode keyData for software security key", new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public final byte[] mo29651a(xjx xjx, boolean z) {
        xlu xlu;
        try {
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            if (z) {
                xlu = xlu.m43153a(new SecureRandom());
            } else {
                xlu = null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new bypt(bypx.m125083a(1), bypx.m125082a(generateKeyPair.getPrivate().getEncoded())));
            arrayList.add(new bypt(bypx.m125083a(2), bypx.m125082a(generateKeyPair.getPublic().getEncoded())));
            if (xlu != null) {
                arrayList.add(new bypt(bypx.m125083a(3), xlu.mo29922a()));
            }
            return bypx.m125086b(arrayList).mo74444c();
        } catch (bypm | bypr e) {
            throw new xma("Unable to encode key data", e);
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e2) {
            throw new xma("Could not generateKeyPair for software security key", e2);
        }
    }

    /* renamed from: b */
    public final PublicKey mo29652b(xjx xjx, byte[] bArr) {
        return m42758b(bArr).f52061a.getPublic();
    }
}
