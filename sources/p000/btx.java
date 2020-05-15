package p000;

import java.io.ByteArrayOutputStream;

/* renamed from: btx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btx implements bqp {

    /* renamed from: a */
    public byte[] f5591a = new byte[2];

    /* renamed from: b */
    public byte[] f5592b = new byte[16];

    /* renamed from: a */
    public final byte[] mo3419a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = this.f5591a;
            byteArrayOutputStream.write(bArr, 0, bArr.length);
            bxe.m3750a(byteArrayOutputStream, this.f5592b);
            bxe.m3750a(byteArrayOutputStream, new byte[0]);
            return byteArrayOutputStream.toByteArray();
        } finally {
            cbn.m3898a(byteArrayOutputStream);
        }
    }

    /* renamed from: b */
    public final byte[] mo3420b() {
        return this.f5591a;
    }
}
