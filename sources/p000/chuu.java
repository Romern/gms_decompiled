package p000;

import java.nio.ByteBuffer;

/* renamed from: chuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chuu implements chtq {

    /* renamed from: a */
    private static final byte[] f189213a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: a */
    private static boolean m149604a(byte b) {
        return b < 32 || b >= 126 || b == 37;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85644a(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length) {
                return new String(bArr, 0);
            }
            byte b = bArr[i];
            if (b >= 32 && b < 126 && (b != 37 || i + 2 >= length)) {
                i++;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        int i2 = 0;
        while (true) {
            int length2 = bArr.length;
            if (i2 >= length2) {
                return new String(allocate.array(), 0, allocate.position(), bmwy.f131158c);
            }
            if (bArr[i2] == 37 && i2 + 2 < length2) {
                try {
                    allocate.put((byte) Integer.parseInt(new String(bArr, i2 + 1, 2, bmwy.f131156a), 16));
                    i2 += 3;
                } catch (NumberFormatException e) {
                }
            }
            allocate.put(bArr[i2]);
            i2++;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ byte[] mo85645a(Object obj) {
        byte[] bytes = ((String) obj).getBytes(bmwy.f131158c);
        int i = 0;
        while (true) {
            int length = bytes.length;
            if (i >= length) {
                return bytes;
            }
            if (m149604a(bytes[i])) {
                byte[] bArr = new byte[(((length - i) * 3) + i)];
                if (i != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i);
                }
                int i2 = i;
                while (i < bytes.length) {
                    byte b = bytes[i];
                    if (m149604a(b)) {
                        bArr[i2] = 37;
                        byte[] bArr2 = f189213a;
                        bArr[i2 + 1] = bArr2[(b >> 4) & 15];
                        bArr[i2 + 2] = bArr2[b & 15];
                        i2 += 3;
                    } else {
                        bArr[i2] = b;
                        i2++;
                    }
                    i++;
                }
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, 0, bArr3, 0, i2);
                return bArr3;
            }
            i++;
        }
    }
}
