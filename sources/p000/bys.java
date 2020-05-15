package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: bys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bys {

    /* renamed from: c */
    public final bzc f6227c;

    /* renamed from: d */
    public final bze f6228d;

    /* renamed from: e */
    public final byte[] f6229e;

    public bys(bze bze, byte[] bArr, bzc bzc) {
        this.f6228d = bze;
        this.f6229e = (byte[]) bArr.clone();
        this.f6227c = bzc;
    }

    /* renamed from: a */
    public static int m3809a(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream.available() > 0) {
            int read = byteArrayInputStream.read();
            if (read != 255) {
                return read;
            }
            if (byteArrayInputStream.available() >= 2) {
                return new cbj(new byte[]{(byte) byteArrayInputStream.read(), (byte) byteArrayInputStream.read()}).mo3652b();
            }
            throw new IllegalArgumentException("No data to parse 3 byte length");
        }
        throw new IllegalArgumentException("No data to parse length");
    }

    /* renamed from: a */
    public abstract boolean mo3615a(bpo bpo);

    /* renamed from: j */
    public byte[] mo3616j() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(this.f6228d.mo3622a());
            byteArrayOutputStream.write(m3810a(this.f6229e.length));
            byteArrayOutputStream.write(this.f6229e);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: k */
    public byte[] mo3617k() {
        return this.f6229e;
    }

    /* renamed from: a */
    public static byte[] m3810a(int i) {
        if (i > 65534) {
            throw new IllegalArgumentException("size is too big");
        } else if (i > 254) {
            return new byte[]{-1, (byte) (i >> 8), (byte) i};
        } else {
            return new byte[]{(byte) i};
        }
    }
}
