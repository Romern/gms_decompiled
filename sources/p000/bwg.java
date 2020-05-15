package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: bwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwg extends bwz {

    /* renamed from: a */
    public static final byte[] f5873a = {-127};

    /* renamed from: b */
    public static final bzu f5874b;

    /* renamed from: c */
    public static final int f5875c = 3;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "3DS Cryptogram";
        bzv.f6287b = "3DS Cryptogram";
        bzv.f6293h = f5875c;
        bzv.f6288c = f5873a;
        f5874b = bzv.mo3629a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bwg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(r0.toByteArray(), f5874b);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (bArr.length + bArr2.length + bArr3.length + bArr4.length + bArr5.length == 32) {
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(bArr3);
                byteArrayOutputStream.write(bArr4);
                byteArrayOutputStream.write(bArr5);
                return;
            }
            throw new bon(bop.f5263c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
