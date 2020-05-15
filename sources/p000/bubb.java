package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: bubb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bubb implements buaz {

    /* renamed from: a */
    public static final bubb f153203a = new bubb();

    /* renamed from: b */
    private static final Charset f153204b = Charset.forName("UTF-8");

    private bubb() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo61974a(Object obj) {
        String str = (String) obj;
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo61975a(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new String(bArr, f153204b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo61976a(ByteBuffer byteBuffer, Object obj) {
        byteBuffer.put(((String) obj).getBytes(f153204b));
    }
}
