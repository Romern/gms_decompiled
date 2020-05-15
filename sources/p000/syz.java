package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

/* renamed from: syz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class syz {

    /* renamed from: a */
    private static WeakReference f45461a = new WeakReference(null);

    /* renamed from: b */
    private static final Logger f45462b = tea.m36798a("auth_util");

    /* renamed from: c */
    private final tds f45463c;

    public syz(Context context) {
        this.f45463c = tds.m36774a(context);
    }

    /* renamed from: a */
    private static final int m36619a(Exception exc) {
        if (exc instanceof NoSuchAlgorithmException) {
            return 31;
        }
        if (exc instanceof NoSuchProviderException) {
            return 32;
        }
        if (exc instanceof InvalidKeySpecException) {
            return 35;
        }
        if (!(exc instanceof InvalidKeyException)) {
            return exc instanceof SignatureException ? 34 : 39;
        }
        return 33;
    }

    /* renamed from: b */
    private final PrivateKey m36621b(tdx tdx, szq szq) {
        String string = szq.f45525b.getString("private_key", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                return KeyFactory.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(string, 0)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                this.f45463c.mo26410a(tdx, 22, e);
                f45462b.mo25417e("Couldn't read stored keypair: ", e, new Object[0]);
                throw new tdw("Stored private key deleted", m36619a(e), false);
            }
        } else {
            this.f45463c.mo26407a(tdx, 22, 36);
            throw new tdw("Stored private key deleted", 36, false);
        }
    }

    /* renamed from: a */
    protected static syz m36620a(Context context) {
        syz syz = (syz) f45461a.get();
        if (syz != null) {
            return syz;
        }
        syz syz2 = new syz(context);
        f45461a = new WeakReference(syz2);
        return syz2;
    }

    /* renamed from: a */
    public final KeyPair mo26249a(tdx tdx, szq szq) {
        try {
            KeyPair generateKeyPair = KeyPairGenerator.getInstance("EC", "GmsCore_OpenSSL").generateKeyPair();
            String encodeToString = Base64.encodeToString(generateKeyPair.getPrivate().getEncoded(), 2);
            String encodeToString2 = Base64.encodeToString(generateKeyPair.getPublic().getEncoded(), 2);
            SharedPreferences.Editor edit = szq.f45525b.edit();
            edit.putString("private_key", encodeToString);
            edit.apply();
            SharedPreferences.Editor edit2 = szq.f45525b.edit();
            edit2.putString("public_key", encodeToString2);
            edit2.apply();
            return generateKeyPair;
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            this.f45463c.mo26410a(tdx, 20, e);
            f45462b.mo25417e("Couldn't generate KeyPair: ", e, new Object[0]);
            throw new tdw("Error generating KeyPair", m36619a(e), false, e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo26250a(tdx tdx, szq szq, String str) {
        PrivateKey b = m36621b(tdx, szq);
        if (b != null) {
            try {
                int i = Build.VERSION.SDK_INT;
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                Signature instance = Signature.getInstance("SHA256withECDSA", "GmsCore_OpenSSL");
                instance.initSign(b);
                instance.update(bytes);
                return instance.sign();
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException e) {
                this.f45463c.mo26410a(tdx, 21, e);
                f45462b.mo25417e("Couldn't sign string: ", e, new Object[0]);
                throw new tdw("Couldn't sign: ", m36619a(e), false, e);
            }
        } else {
            this.f45463c.mo26407a(tdx, 22, 36);
            throw new tdw("Stored private key deleted", 36, false);
        }
    }
}
