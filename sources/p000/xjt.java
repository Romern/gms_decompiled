package p000;

import android.accounts.Account;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: xjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xjt {

    /* renamed from: a */
    public static final byte[] f52459a = "FIDO caBLE v1 sessionPreKey".getBytes(StandardCharsets.UTF_8);

    /* renamed from: b */
    public static final byte[] f52460b = "FIDO caBLE v1 handshakeKey".getBytes(StandardCharsets.UTF_8);

    /* renamed from: c */
    public static final byte[] f52461c = "client".getBytes(StandardCharsets.UTF_8);

    /* renamed from: d */
    public static final byte[] f52462d = "authenticator".getBytes(StandardCharsets.UTF_8);

    /* renamed from: e */
    public static final byps f52463e = bypx.m125083a(0);

    /* renamed from: f */
    public static final byps f52464f = bypx.m125083a(1);

    /* renamed from: g */
    public static final bypv f52465g = bypx.m125085a("caBLE v1 client hello");

    /* renamed from: h */
    public static final bypv f52466h = bypx.m125085a("caBLE v1 authenticator hello");

    /* renamed from: i */
    private static final byte[] f52467i = "FIDO caBLE v1 sessionKey".getBytes(StandardCharsets.UTF_8);

    /* renamed from: j */
    private static final sek f52468j = new sek(new String[]{"CableCryptoOps"}, (short[]) null);

    /* renamed from: a */
    public static bqgg m43057a(Context context, byte[] bArr, Account account, xka xka, String str) {
        int length = bArr.length;
        if (length == 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 8);
            ios a = inl.m15759a(context);
            aucb a2 = a.mo13179a(account, str.concat("_cable_irk"), "HmacSHA256", sqc.m35959a(copyOf, f52461c));
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            AtomicReference atomicReference3 = new AtomicReference();
            bqgg a3 = bqdx.m112674a(bqdx.m112674a(adbb.m50100a(a2), new xjo(atomicReference, copyOf, a, account, str), bqfb.INSTANCE), new xjp(atomicReference2, a, account, str, copyOf), bqfb.INSTANCE);
            if (cdvq.f181813a.mo6606a().mo78375a()) {
                return bqdx.m112673a(bqdx.m112674a(a3, new xjq(atomicReference3, a, str, account), bqfb.INSTANCE), new xjr(xka, copyOf, atomicReference, atomicReference2, atomicReference3, account), bqfb.INSTANCE);
            }
            return bqdx.m112673a(a3, new xjs(copyOf, atomicReference, atomicReference2, account), bqfb.INSTANCE);
        }
        sek sek = f52468j;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Unexpected client EID length: ");
        sb.append(length);
        sek.mo25416d(sb.toString(), new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static SecretKey m43058a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            return new SecretKeySpec(byst.m125284a(new SecretKeySpec(bArr, "AES"), bArr2, bArr3), "AES");
        } catch (Exception e) {
            throw new xju("Unable to derive key", e);
        }
    }

    /* renamed from: a */
    public static xjm m43059a(xjn xjn, byte[] bArr) {
        xlu xlu = xjn.f52432a;
        byte[] bArr2 = xlu.f52696a;
        byte[] bArr3 = xlu.f52697b;
        try {
            byte[] a = bqce.m112562a(bArr, m43062a(sqc.m35959a(bArr, f52461c), bArr2, 8));
            return new xjm(bArr, a, m43062a(sqc.m35959a(a, f52462d), bArr2, 16), m43058a(bArr3, bArr, f52459a).getEncoded(), xjn.f52433b, xjn.f52434c.name);
        } catch (xju e) {
            f52468j.mo25417e("Error generating session data", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static xjm m43060a(byte[] bArr, xjn xjn) {
        int length = bArr.length;
        if (length != 16) {
            sek sek = f52468j;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Unexpected client EID length: ");
            sb.append(length);
            sek.mo25416d(sb.toString(), new Object[0]);
            return null;
        }
        xjm a = m43059a(xjn, Arrays.copyOf(bArr, 8));
        if (a == null || !MessageDigest.isEqual(a.f52427b, bArr)) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public static byte[] m43061a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: a */
    public static final byte[] m43062a(byte[] bArr, byte[] bArr2, int i) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr2, "HmacSHA256"));
            byte[] doFinal = instance.doFinal(bArr);
            if (doFinal.length >= i) {
                return Arrays.copyOf(doFinal, i);
            }
            StringBuilder sb = new StringBuilder(42);
            sb.append("Expected hash length (");
            sb.append(i);
            sb.append(" too long");
            throw new xju(sb.toString());
        } catch (Exception e) {
            throw new xju("Unable to perform HMAC", e);
        }
    }

    /* renamed from: a */
    public static byte[] m43063a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return m43058a(bArr, xid.m42997a().digest(sqc.m35959a(bArr2, bArr3, bArr4)), f52467i).getEncoded();
    }
}
