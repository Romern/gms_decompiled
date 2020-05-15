package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: aips */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aips {

    /* renamed from: a */
    static final byte[] f69457a = {0, 0, 0};

    /* renamed from: d */
    public static final /* synthetic */ int f69458d = 0;

    /* renamed from: b */
    public final byte[] f69459b;

    /* renamed from: c */
    public final byte[] f69460c;

    public aips(byte[] bArr, byte[] bArr2) {
        this.f69459b = bArr;
        this.f69460c = bArr2;
    }

    /* renamed from: a */
    public static aips m57682a(byte[] bArr) {
        if (bArr == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aips", "a", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Cannot deserialize BlePacket: null bytes passed in.");
            return null;
        }
        int length = bArr.length;
        if (length >= 3) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte[] bArr2 = new byte[3];
            wrap.get(bArr2);
            byte[] bArr3 = new byte[(length - 3)];
            wrap.get(bArr3);
            return new aips(bArr2, bArr3);
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aips", "a", 36, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68411a("Cannot deserialize BlePacket: expecting min %d raw bytes, got %d", 3, length);
        return null;
    }

    /* renamed from: a */
    public static byte[] m57683a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != 3) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aips", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68411a("Cannot serialize BlePacket: expected a serviceIdHash of %d bytes but got %d", 3, length);
            return null;
        }
        int length2 = bArr2.length;
        if (length2 > 2147483644) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aips", "a", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68411a("Cannot serialize BlePacket: expected data of at most %d bytes but got %d", 2147483644, length2);
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length2 + 3);
        allocate.put(bArr);
        allocate.put(bArr2);
        return allocate.array();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo37831a() {
        return Arrays.equals(this.f69459b, f69457a);
    }
}
