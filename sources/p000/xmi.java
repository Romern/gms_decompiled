package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidParameterException;
import java.util.Arrays;

/* renamed from: xmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xmi extends xmk {

    /* renamed from: a */
    public final byte f52742a;

    /* renamed from: b */
    public final int f52743b;

    public xmi(int i, xmf xmf, byte[] bArr, int i2) {
        super(bArr);
        bmxy.m108581a(bArr);
        this.f52750d = i;
        this.f52742a = xmf.f52733i;
        this.f52743b = i2;
        int length = bArr.length;
        if (length > 57) {
            throw new InvalidParameterException("Data size is greater than maximum of 57");
        } else if (length > i2) {
            throw new InvalidParameterException("Payload length cannot be less than data size");
        }
    }

    /* renamed from: a */
    public final byte[] mo29940a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(this.f52750d).array());
            byteArrayOutputStream.write(this.f52742a);
            byteArrayOutputStream.write(this.f52743b >>> 8);
            byteArrayOutputStream.write(this.f52743b);
            byteArrayOutputStream.write(this.f52749c);
            byteArrayOutputStream.write(new byte[(64 - byteArrayOutputStream.size())]);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new xml("Failed to serialize HidInitPacket", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xmi) {
            xmi xmi = (xmi) obj;
            if (super.equals(obj) && xmi.f52750d == this.f52750d && xmi.f52743b == this.f52743b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f52743b), Byte.valueOf(this.f52742a), Integer.valueOf(Arrays.hashCode(this.f52749c)), Integer.valueOf(this.f52750d)});
    }

    public xmi(byte[] bArr) {
        bmxy.m108581a(bArr);
        if (bArr.length <= 64) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[4];
                byteArrayInputStream.read(bArr2);
                this.f52750d = ByteBuffer.wrap(bArr2).getInt();
                this.f52742a = (byte) byteArrayInputStream.read();
                int read = (byteArrayInputStream.read() << 8) | byteArrayInputStream.read();
                this.f52743b = read;
                this.f52749c = new byte[Math.min(read, 57)];
                byteArrayInputStream.read(this.f52749c);
            } catch (IOException e) {
                throw new xml("HidInitPacket failed to parse from byte array provided.", e);
            }
        } else {
            throw new InvalidParameterException("Data size is greater than maximum of 64");
        }
    }
}
