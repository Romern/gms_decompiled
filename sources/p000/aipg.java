package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: aipg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aipg {

    /* renamed from: a */
    public static final Charset f69424a = Charset.forName("UTF-8");

    /* renamed from: b */
    public final int f69425b;

    /* renamed from: c */
    public final byte[] f69426c;

    /* renamed from: d */
    public final int f69427d;

    /* renamed from: e */
    private final int f69428e;

    /* renamed from: f */
    private final byte[] f69429f;

    public aipg(int i, int i2, byte[] bArr, byte[] bArr2, int i3) {
        this.f69428e = i;
        this.f69425b = i2;
        this.f69426c = bArr;
        this.f69429f = bArr2;
        this.f69427d = i3;
    }

    /* renamed from: a */
    public static aipg m57649a(byte[] bArr) {
        int i;
        try {
            byte[] a = sqd.m35967a(bArr);
            if (a == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("aipg", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Cannot deserialize BleAdvertisementHeader: null bytes passed in.");
                return null;
            }
            int length = a.length;
            if (length >= 15) {
                ByteBuffer wrap = ByteBuffer.wrap(a);
                byte b = wrap.get();
                int i2 = (b & 224) >> 5;
                if (i2 == 2) {
                    byte b2 = b & 31;
                    byte[] bArr2 = new byte[10];
                    wrap.get(bArr2);
                    byte[] bArr3 = new byte[4];
                    wrap.get(bArr3);
                    byte[] bArr4 = new byte[2];
                    if (wrap.remaining() >= 2) {
                        wrap.get(bArr4);
                        i = airk.m57793a(bArr4);
                    } else {
                        i = 0;
                    }
                    return new aipg(2, b2, bArr2, bArr3, i);
                }
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aipg", "a", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("Cannot deserialize BleAdvertisementHeader: unsupported Version %d", i2);
                return null;
            }
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aipg", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68411a("Cannot deserialize BleAdvertisementHeader: expecting at least %d raw bytes, got %d", 15, length);
            return null;
        } catch (IllegalArgumentException e) {
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
            bnsl4.mo68432a("aipg", "a", 67, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Cannot deserialize BleAdvertisementHeader: failed Base64 decoding.");
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aipg) {
            aipg aipg = (aipg) obj;
            if (this.f69428e == aipg.f69428e && this.f69425b == aipg.f69425b && Arrays.equals(this.f69426c, aipg.f69426c) && Arrays.equals(this.f69429f, aipg.f69429f) && this.f69427d == aipg.f69427d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f69428e), Integer.valueOf(this.f69425b), Integer.valueOf(Arrays.hashCode(this.f69426c)), Integer.valueOf(Arrays.hashCode(this.f69429f)), Integer.valueOf(this.f69427d)});
    }

    public final String toString() {
        return String.format(Locale.US, "BleAdvertisementHeader { version=%d, numSlots=%d, serviceIdBloomFilter=%s, advertisementHash=%s, psm=%s}", Integer.valueOf(this.f69428e), Integer.valueOf(this.f69425b), ails.m57438a(this.f69426c), ails.m57438a(this.f69429f), Integer.valueOf(this.f69427d));
    }

    /* renamed from: a */
    public static byte[] m57650a(int i, int i2, byte[] bArr, byte[] bArr2, int i3) {
        if (i != 2) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aipg", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Cannot serialize BleAdvertisementHeader: unsupported Version %d", i);
            return null;
        }
        int length = bArr.length;
        if (length != 10) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aipg", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68411a("Cannot serialize BleAdvertisementHeader: expected serviceIdBloomFilter to be length %d but got %d instead", 10, length);
            return null;
        }
        int length2 = bArr2.length;
        if (length2 != 4) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aipg", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68411a("Cannot serialize BleAdvertisementHeader: expected advertisementHash to be length %d but got %d instead", 4, length2);
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(17);
        allocate.put((byte) ((i2 & 31) | 64));
        allocate.put(bArr);
        allocate.put(bArr2);
        allocate.put(airk.m57796b(i3));
        return sqd.m35972d(allocate.array()).getBytes(f69424a);
    }
}
