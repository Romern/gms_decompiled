package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.util.Date;

/* renamed from: xcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xcq extends aaab {

    /* renamed from: f */
    private static final sek f51951f = new sek(new String[]{"GenerateKeyOperation"}, (short[]) null);

    /* renamed from: a */
    private final xcm f51952a = ((xcm) xcm.f51937d.mo33309a());

    /* renamed from: b */
    private final xde f51953b = new xde(rpr.m34216b());

    /* renamed from: c */
    private final xmy f51954c;

    /* renamed from: d */
    private final String f51955d;

    /* renamed from: e */
    private final xmq f51956e;

    public xcq(xmy xmy, String str, xmq xmq) {
        super(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, "GenerateKey");
        this.f51954c = xmy;
        this.f51955d = str;
        this.f51956e = xmq;
    }

    /* renamed from: a */
    private static KeyPair m42673a() {
        try {
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            return instance.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Failed to generate key pair for software key";
            throw a.mo33301a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        KeyData keyData;
        try {
            String str = this.f51955d;
            xmq xmq = this.f51956e;
            bmxy.m108582a(str, "rpId cannot be null");
            bmxy.m108589a(!str.trim().isEmpty(), "rpId cannot be empty");
            sek sek = f51951f;
            int i = xmq.f52779d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
            sb.append("generateKey with rpId ");
            sb.append(str);
            sb.append(" with keyType ");
            sb.append(i);
            sek.mo25412b(sb.toString(), new Object[0]);
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            bmxy.m108582a(xmq, "keyStorageType cannot be null");
            bmxy.m108582a(bArr, "keyId cannot be null");
            bmxy.m108582a(str, "rpId cannot be null");
            String a = bmxr.m108543a('.').mo66875a(Integer.valueOf(xmq.f52779d), boan.f132470d.mo68794a(bArr), str);
            xmq xmq2 = xmq.KEYSTORE;
            int ordinal = xmq.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    KeyPair a2 = m42673a();
                    xcv xcv = new xcv(a, a2.getPublic());
                    this.f51952a.mo29634a(a, new Date(System.currentTimeMillis()), bmxv.m108566b(a2));
                    keyData = KeyData.m23438a(xcv.mo29646b(), a2, a, (byte[]) null, (byte[]) null);
                    this.f51954c.mo29955a(Status.f30107a, keyData);
                    return;
                } else if (ordinal != 2) {
                    throw new IllegalStateException("Not supported key storage type");
                }
            }
            this.f51953b.mo29647a(a, xmq);
            PublicKey c = xde.m42697c(a);
            if (c != null) {
                xcv xcv2 = new xcv(a, c);
                this.f51952a.mo29634a(a, new Date(System.currentTimeMillis()), bmvz.f131120a);
                keyData = KeyData.m23437a(xmq.f52779d, xcv2.mo29646b(), a, (byte[]) null, (byte[]) null);
                this.f51954c.mo29955a(Status.f30107a, keyData);
                return;
            }
            adbd a3 = adbe.m50105a();
            a3.f61234c = 8;
            a3.f61232a = "Failed to get public key from Android keystore";
            throw a3.mo33301a();
        } catch (adbe e) {
            this.f51954c.mo29955a(e.mo33302b(), null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f51954c.mo29955a(status, null);
    }
}
