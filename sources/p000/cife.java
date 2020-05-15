package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: cife */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cife {

    /* renamed from: a */
    private static final Logger f189996a = Logger.getLogger(cife.class.getName());

    /* renamed from: b */
    private static final byte[] f189997b = "-bin".getBytes(bmwy.f131156a);

    private cife() {
    }

    /* renamed from: a */
    private static boolean m150160a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r5 = new java.lang.String(r3, p000.bmwy.f131156a);
        r3 = p000.cife.f189996a;
        r6 = java.util.logging.Level.WARNING;
        r4 = java.util.Arrays.toString(r4);
        r9 = new java.lang.StringBuilder((r5.length() + 55) + java.lang.String.valueOf(r4).length());
        r9.append("Metadata key=");
        r9.append(r5);
        r9.append(", value=");
        r9.append(r4);
        r9.append(" contains invalid ASCII characters");
        r3.logp(r6, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", r9.toString());
     */
    /* renamed from: a */
    public static byte[][] m150161a(chtr chtr) {
        int length;
        byte[][] a = chsg.m149483a(chtr);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = a.length;
            if (i >= length) {
                break;
            }
            byte[] bArr = a[i];
            byte[] bArr2 = a[i + 1];
            if (!m150160a(bArr, f189997b)) {
                int length2 = bArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        a[i2] = bArr;
                        a[i2 + 1] = bArr2;
                        i2 += 2;
                        break;
                    }
                    byte b = bArr2[i3];
                    if (b >= 32 && b <= 126) {
                        i3++;
                    }
                }
            } else {
                a[i2] = bArr;
                a[i2 + 1] = chsg.f189091b.mo68794a(bArr2).getBytes(bmwy.f131156a);
                i2 += 2;
            }
            i += 2;
        }
        return i2 != length ? (byte[][]) Arrays.copyOfRange(a, 0, i2) : a;
    }

    /* renamed from: a */
    public static byte[][] m150162a(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (m150160a(bArr2, f189997b)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr4 = bArr[i];
                            byte[] bArr5 = bArr[i + 1];
                            if (m150160a(bArr4, f189997b)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr5.length;
                                    if (i4 > length) {
                                        break;
                                    }
                                    if (i4 == length || bArr5[i4] == 44) {
                                        byte[] b2 = boan.f132470d.mo68796b(new String(bArr5, i5, i4 - i5, bmwy.f131156a));
                                        arrayList.add(bArr4);
                                        arrayList.add(b2);
                                        i5 = i4 + 1;
                                    }
                                    i4++;
                                }
                            } else {
                                arrayList.add(bArr4);
                                arrayList.add(bArr5);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i2] = boan.f132470d.mo68796b(new String(bArr3, bmwy.f131156a));
            }
            i += 2;
        }
        return bArr;
    }
}
