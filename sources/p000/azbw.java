package p000;

import android.content.Context;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.UUID;

/* renamed from: azbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azbw {
    /* renamed from: a */
    public static civt m85223a() {
        if (!cfeo.f183719a.mo6606a().mo80951aK()) {
            return civq.m151051a();
        }
        try {
            return civq.m151051a();
        } catch (NullPointerException e) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m85231b(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        return new UUID(wrap.getLong(), wrap.getLong()).toString();
    }

    /* renamed from: a */
    public static civt m85224a(Context context, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr == null) {
            azph.m85998a(context).mo55126a(1655, 62);
            return null;
        }
        try {
            return new civt(civq.m151054b(bArr), civq.m151050a(bArr2));
        } catch (civg e) {
            azph.m85998a(context).mo55126a(1655, 61);
            azoj.m85931a("Crypto", e, "Failed to parse key pair", new Object[0]);
            return null;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static KeyPair m85225a(byte[] bArr, byte[] bArr2) {
        try {
            KeyFactory instance = KeyFactory.getInstance("EC");
            return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(bArr)), instance.generatePrivate(new PKCS8EncodedKeySpec(bArr2)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            azoj.m85931a("Crypto", e, "couldn't restore keypair", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m85226a(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i);
        return allocate.array();
    }

    /* renamed from: a */
    public static byte[] m85227a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong(j);
        return allocate.array();
    }

    @Deprecated
    /* renamed from: a */
    public static byte[] m85228a(String str, KeyPair keyPair) {
        byte[] a = azpi.m86073a(str);
        try {
            PrivateKey privateKey = keyPair.getPrivate();
            Signature instance = Signature.getInstance("SHA256withECDSA", "GmsCore_OpenSSL");
            instance.initSign(privateKey);
            instance.update(a);
            return instance.sign();
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException e) {
            azoj.m85931a("Crypto", e, "failed to signBytes", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m85229a(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return new byte[]{0, 0, 0, 0};
        }
        return ByteBuffer.allocate(length + 4).put(m85226a(length)).put(bArr).array();
    }

    /* renamed from: a */
    public static byte[] m85230a(byte[] bArr, civt civt) {
        try {
            byte[] a = civq.m151052a(civt.f191541b, bArr);
            bmxy.m108581a(a);
            return a;
        } catch (civg e) {
            azoj.m85931a("Crypto", e, "Failed to signBytes", new Object[0]);
            return null;
        }
    }
}
