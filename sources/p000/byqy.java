package p000;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: byqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class byqy {
    protected byqy() {
    }

    /* renamed from: a */
    static byri m125143a(byte[] bArr, int i) {
        bxvd da = byri.f167474d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byri byri = (byri) da.f164949b;
        byri.f167476a |= 2;
        byri.f167478c = i;
        ByteString a = ByteString.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byri byri2 = (byri) da.f164949b;
        a.getClass();
        byri2.f167476a |= 1;
        byri2.f167477b = a;
        return (byri) da.mo74062i();
    }

    /* renamed from: c */
    public static byqy m125145c(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            throw new IllegalArgumentException("savedSessionInfo null or too short");
        }
        byte b = bArr[0] & 255;
        if (b != 0) {
            if (b != 1) {
                StringBuilder sb = new StringBuilder(60);
                sb.append("Cannot rebuild context, unkown protocol version: ");
                sb.append((int) b);
                throw new IllegalArgumentException(sb.toString());
            } else if (length == 73) {
                return new byra(new SecretKeySpec(Arrays.copyOfRange(bArr, 9, 41), "AES"), new SecretKeySpec(Arrays.copyOfRange(bArr, 41, 73), "AES"), m125146d(Arrays.copyOfRange(bArr, 1, 5)), m125146d(Arrays.copyOfRange(bArr, 5, 9)));
            } else {
                throw new IllegalArgumentException("Incorrect data length for v1 protocol");
            }
        } else if (length == 37) {
            return new byqz(new SecretKeySpec(Arrays.copyOfRange(bArr, 5, 37), "AES"), m125146d(Arrays.copyOfRange(bArr, 1, 5)));
        } else {
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Incorrect data length (");
            sb2.append(length);
            sb2.append(") for v0 protocol");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: d */
    static int m125146d(byte[] bArr) {
        int length = bArr.length;
        if (length == 4) {
            return (bArr[3] & 255) | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280);
        }
        StringBuilder sb = new StringBuilder(58);
        sb.append("Expected 4 bytes to encode int, but got: ");
        sb.append(length);
        sb.append(" bytes");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public abstract byte[] mo74475a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo74477b();

    /* renamed from: b */
    public final byte[] mo74478b(byte[] bArr) {
        try {
            byrz a = byrb.m125174a(bArr, mo74483g());
            if (bysa.DEVICE_TO_DEVICE_MESSAGE.equals(a.f167530a)) {
                byri byri = (byri) GeneratedMessageLite.m124014a(byri.f167474d, a.f167531b);
                mo74479c();
                if (byri.f167478c == mo74481e()) {
                    return byri.f167477b.getKey();
                }
                throw new SignatureException("Incorrect sequence number");
            }
            throw new SignatureException("wrong message type in device-to-device message");
        } catch (InvalidKeyException e) {
            throw new SignatureException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (bxwf e3) {
            throw new SignatureException(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo74479c();

    /* renamed from: d */
    public abstract int mo74480d();

    /* renamed from: e */
    public abstract int mo74481e();

    /* renamed from: f */
    public abstract SecretKey mo74482f();

    /* renamed from: g */
    public abstract SecretKey mo74483g();

    /* renamed from: h */
    public abstract byte[] mo74484h();

    /* renamed from: a */
    static byte[] m125144a(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    /* renamed from: a */
    public final byte[] mo74476a(byte[] bArr) {
        mo74477b();
        try {
            return byrb.m125177a(new byrz(bysa.DEVICE_TO_DEVICE_MESSAGE, m125143a(bArr, mo74480d()).serializeToBytes()), mo74482f());
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
