package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: cwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cwr {

    /* renamed from: a */
    private static final cwq f12270a = new cwq(Collections.emptyList());

    /* renamed from: b */
    private static final cwr f12271b = new cwp();

    /* renamed from: a */
    public static cwr m7787a(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr2 != null) {
            try {
                if (bArr2.length != 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                    ArrayList arrayList = new ArrayList(byteArrayInputStream.read());
                    while (byteArrayInputStream.available() > 0) {
                        int read = byteArrayInputStream.read();
                        byte[] bArr3 = new byte[read];
                        if (byteArrayInputStream.read(bArr3) != read) {
                            return f12271b;
                        }
                        cwv a = cwv.m7794a(bArr3[0]);
                        int a2 = cwy.m7798a(bArr3[0]);
                        byte[] bArr4 = new byte[2];
                        System.arraycopy(bArr3, 1, bArr4, 0, 2);
                        cwx a3 = cwx.m7797a(bArr3[3]);
                        byte a4 = (byte) cwy.m7798a(bArr3[3]);
                        cww a5 = cww.m7796a(bArr3[4], a4);
                        cww a6 = cww.m7796a(bArr3[5], a4);
                        byte[] a7 = cvz.m7713a(bArr3, 6, a2);
                        byte b = bArr3[a2 + 6];
                        ArrayList arrayList2 = new ArrayList(b);
                        int i = a2 + 7;
                        int i2 = 0;
                        while (i2 < b) {
                            byte[] bArr5 = new byte[a2];
                            System.arraycopy(bArr3, i + (i2 * a2), bArr5, 0, a2);
                            arrayList2.add(bArr5);
                            i2++;
                            byteArrayInputStream = byteArrayInputStream;
                        }
                        arrayList.add(new cwy(a, a2, bArr4, a3, a7, arrayList2, a5, a6));
                        byteArrayInputStream = byteArrayInputStream;
                    }
                    return new cwq(arrayList);
                }
            } catch (IOException e) {
                return f12271b;
            }
        }
        return f12270a;
    }

    /* renamed from: a */
    public abstract cwu mo8369a(cvt cvt);

    /* renamed from: a */
    public abstract boolean mo8370a();
}
