package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: aipf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aipf {

    /* renamed from: a */
    public final int f69418a;

    /* renamed from: b */
    public final int f69419b;

    /* renamed from: c */
    public final boolean f69420c;

    /* renamed from: d */
    public final byte[] f69421d;

    /* renamed from: e */
    public final byte[] f69422e;

    /* renamed from: f */
    private final byte[] f69423f;

    public aipf(int i, int i2, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f69418a = i;
        this.f69419b = i2;
        this.f69420c = z;
        if (!z) {
            this.f69421d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f69421d = null;
        }
        this.f69423f = Arrays.copyOf(bArr2, bArr2.length);
        this.f69422e = bArr3;
    }

    /* renamed from: a */
    private static int m57641a(int i, int i2, boolean z) {
        return (!z ? i + 8 : i + 2) + i2;
    }

    /* renamed from: a */
    private static boolean m57643a(int i) {
        return i == 2;
    }

    /* renamed from: b */
    private static int m57645b(byte[] bArr) {
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m57646b(int i) {
        return i == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aipf) {
            aipf aipf = (aipf) obj;
            if (cfnv.m140800x()) {
                if (this.f69418a != aipf.f69418a || this.f69419b != aipf.f69419b || !Arrays.equals(this.f69421d, aipf.f69421d) || !Arrays.equals(this.f69423f, aipf.f69423f) || !Arrays.equals(this.f69422e, aipf.f69422e)) {
                    return false;
                }
                return true;
            } else if (this.f69418a != aipf.f69418a || this.f69419b != aipf.f69419b || !Arrays.equals(this.f69421d, aipf.f69421d) || !Arrays.equals(this.f69423f, aipf.f69423f)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (cfnv.m140800x()) {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f69418a), Integer.valueOf(this.f69419b), Integer.valueOf(Arrays.hashCode(this.f69421d)), Integer.valueOf(Arrays.hashCode(this.f69423f)), Integer.valueOf(Arrays.hashCode(this.f69422e))});
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f69418a), Integer.valueOf(this.f69419b), Integer.valueOf(Arrays.hashCode(this.f69421d)), Integer.valueOf(Arrays.hashCode(this.f69423f))});
    }

    public final String toString() {
        if (cfnv.m140800x()) {
            return String.format(Locale.US, "BleAdvertisement { version=%d, socketVersion=%d, serviceIdHash=%s, data=%s, deviceToken=%s }", Integer.valueOf(this.f69418a), Integer.valueOf(this.f69419b), ails.m57438a(this.f69421d), ails.m57438a(this.f69423f), ails.m57438a(this.f69422e));
        }
        return String.format(Locale.US, "BleAdvertisement { version=%d, socketVersion=%d, serviceIdHash=%s, data=%s }", Integer.valueOf(this.f69418a), Integer.valueOf(this.f69419b), ails.m57438a(this.f69421d), ails.m57438a(this.f69423f));
    }

    /* renamed from: a */
    public static aipf m57642a(byte[] bArr) {
        int i;
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        byte[] bArr4 = bArr;
        if (bArr4 == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aipf", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Cannot deserialize BleAdvertisement: null bytes passed in.");
            return null;
        }
        int length = bArr4.length;
        if (length > 0) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            int i2 = (b & 224) >> 5;
            if (m57643a(i2)) {
                int i3 = (b & 28) >> 2;
                if (m57646b(i3)) {
                    int i4 = (b & 2) >> 1;
                    if (i4 == 0) {
                        i = 8;
                    } else {
                        i = 2;
                    }
                    if (length < i) {
                        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl2.mo68432a("aipf", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68411a("Cannot deserialize BleAdvertisement: expecting min %d raw bytes, got %d", i, length);
                        return null;
                    }
                    if (i4 == 0) {
                        byte[] bArr5 = new byte[3];
                        wrap.get(bArr5);
                        bArr2 = bArr5;
                    } else {
                        bArr2 = null;
                    }
                    int i5 = i4 == 0 ? wrap.getInt() : wrap.get();
                    if (i5 < 0) {
                        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl3.mo68432a("aipf", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68409a("Cannot deserialize BleAdvertisement: negative data size %d", i5);
                        return null;
                    } else if (wrap.remaining() < i5) {
                        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl4.mo68432a("aipf", "a", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68411a("Cannot deserialize BleAdvertisement: expected data to be %d bytes, but only %d bytes remain.", i5, wrap.remaining());
                        return null;
                    } else {
                        byte[] bArr6 = new byte[i5];
                        wrap.get(bArr6);
                        if (!cfnv.m140800x() || wrap.remaining() < 2) {
                            bArr3 = null;
                        } else {
                            byte[] bArr7 = new byte[2];
                            wrap.get(bArr7);
                            bArr3 = bArr7;
                        }
                        if (i4 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        return new aipf(i2, i3, z, bArr2, bArr6, bArr3);
                    }
                } else {
                    bnsl bnsl5 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl5.mo68432a("aipf", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68409a("Cannot deserialize BleAdvertisement: unsupported SocketVersion %d", i3);
                    return null;
                }
            } else {
                bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
                bnsl6.mo68432a("aipf", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68409a("Cannot deserialize BleAdvertisement: unsupported Version %d", i2);
                return null;
            }
        } else {
            bnsl bnsl7 = (bnsl) ailf.f69111a.mo68390d();
            bnsl7.mo68432a("aipf", "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68411a("Cannot deserialize BleAdvertisement: expecting min %d raw bytes to parse the version, got %d", 1, 0);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo37806b() {
        return m57644a(this.f69418a, this.f69419b, this.f69421d, this.f69423f, this.f69422e, this.f69420c);
    }

    /* renamed from: a */
    public static byte[] m57644a(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) {
        int i3;
        int length;
        int length2;
        if (!m57643a(i)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aipf", "a", (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Cannot serialize BleAdvertisement: unsupported Version %d", i);
            return null;
        } else if (!m57646b(i2)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aipf", "a", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68409a("Cannot serialize BleAdvertisement: unsupported SocketVersion %d", i2);
            return null;
        } else if (bArr == null || (length2 = bArr.length) == 3) {
            if (!cfnv.m140800x()) {
                i3 = m57641a(bArr2.length, m57645b((byte[]) null), z);
            } else if (bArr3 == null || (length = bArr3.length) == 2) {
                i3 = m57641a(bArr2.length, m57645b(bArr3), z);
            } else {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                bnsl3.mo68432a("aipf", "a", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68411a("Cannot serialize BleAdvertisement: expected a deviceToken of %d bytes but got %d", 2, length);
                return null;
            }
            int i4 = !z ? 512 : 27;
            if (i3 <= i4) {
                ByteBuffer allocate = ByteBuffer.allocate(i3);
                allocate.put((byte) (((byte) (((byte) ((i << 5) & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD)) | ((i2 << 2) & 28))) | (((z ? 1 : 0) + z) & 2)));
                if (!z) {
                    allocate.put(bArr);
                    allocate.putInt(bArr2.length);
                } else {
                    allocate.put((byte) bArr2.length);
                }
                allocate.put(bArr2);
                if (cfnv.m140800x() && bArr3 != null) {
                    allocate.put(bArr3);
                }
                return allocate.array();
            }
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
            bnsl4.mo68432a("aipf", "a", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68411a("Cannot serialize BleAdvertisement: expected total advertisement length of at most %d bytes but got %d", i4, i3);
            return null;
        } else {
            bnsl bnsl5 = (bnsl) ailf.f69111a.mo68390d();
            bnsl5.mo68432a("aipf", "a", (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68411a("Cannot serialize BleAdvertisement: expected a serviceIdHash of %d bytes but got %d", 3, length2);
            return null;
        }
    }

    /* renamed from: a */
    public final byte[] mo37805a() {
        byte[] bArr = this.f69423f;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
