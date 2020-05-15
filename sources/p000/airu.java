package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: airu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class airu {

    /* renamed from: a */
    public final byte[] f69600a;

    /* renamed from: b */
    private final byte[] f69601b;

    public airu(byte[] bArr, byte[] bArr2) {
        this.f69600a = bArr;
        this.f69601b = bArr2;
    }

    /* renamed from: a */
    public static airu m57825a() {
        return m57826a(new byte[0]);
    }

    /* renamed from: b */
    public static airu m57827b() {
        return new airu(new byte[0], airv.f69603b);
    }

    /* renamed from: d */
    public final byte[] mo37912d() {
        ByteBuffer allocate = ByteBuffer.allocate(this.f69600a.length + this.f69601b.length);
        allocate.put(this.f69600a);
        allocate.put(this.f69601b);
        return allocate.array();
    }

    /* renamed from: a */
    public static airu m57826a(byte[] bArr) {
        return new airu(bArr, airv.f69602a);
    }

    /* renamed from: b */
    public static airu m57828b(byte[] bArr) {
        int length = bArr.length;
        if (length < 2) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("airu", "b", 254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to parse response %s because the byte array was too short", ails.m57438a(bArr));
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[(length - 2)];
        wrap.get(bArr2);
        byte[] bArr3 = new byte[2];
        wrap.get(bArr3);
        return new airu(bArr2, bArr3);
    }

    /* renamed from: c */
    public final boolean mo37911c() {
        return !Arrays.equals(airv.f69602a, this.f69601b);
    }
}
