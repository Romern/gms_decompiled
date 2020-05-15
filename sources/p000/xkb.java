package p000;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: xkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xkb {

    /* renamed from: a */
    public final byte[] f52490a;

    public xkb(xka xka, byte[] bArr) {
        bmxy.m108581a(bArr);
        if (bArr.length == 32) {
            ByteBuffer allocate = ByteBuffer.allocate(33);
            allocate.put(xka.f52489d);
            allocate.put(bArr);
            this.f52490a = allocate.array();
            return;
        }
        this.f52490a = bArr;
    }

    /* renamed from: a */
    public static byte[] m43079a(byte b, byte[] bArr, String str, PublicKey publicKey) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA256");
            instance.update(str.getBytes("UTF-8"));
            instance.update(publicKey.getEncoded());
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 1 + instance.getDigestLength());
            allocate.put(b);
            allocate.put(bArr);
            allocate.put(instance.digest());
            return allocate.array();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new RuntimeException("Error encoding keyHandle, broken crypto provider?", e);
        }
    }

    /* renamed from: b */
    public final xka mo29856b() {
        byte[] bArr = this.f52490a;
        int length = bArr.length;
        if (length == 65 || length == 33) {
            try {
                return xka.m43078a(bArr[0]);
            } catch (IllegalArgumentException e) {
                throw new xma("Invalid key handle type", e);
            }
        } else {
            throw new xma("Invalid key handle");
        }
    }

    /* renamed from: c */
    public final byte[] mo29857c() {
        byte[] bArr = this.f52490a;
        int length = bArr.length;
        if (length == 33) {
            return Arrays.copyOfRange(bArr, 1, 33);
        }
        return Arrays.copyOf(bArr, length);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof xkb) && Arrays.equals(this.f52490a, ((xkb) obj).f52490a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f52490a))});
    }

    public xkb(byte[] bArr) {
        this(xka.SOFTWARE_KEY, bArr);
    }

    /* renamed from: a */
    public final byte[] mo29855a() {
        byte[] bArr = this.f52490a;
        int length = bArr.length;
        if (length == 65 || length == 33) {
            return Arrays.copyOfRange(bArr, 1, 33);
        }
        throw new xma("Invalid key handle");
    }
}
