package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: bqvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvn implements bqng {

    /* renamed from: a */
    private final bqwb f141687a;

    /* renamed from: b */
    private final bqnw f141688b;

    public bqvn(bqwb bqwb, bqnw bqnw) {
        this.f141687a = bqwb;
        this.f141688b = bqnw;
    }

    /* renamed from: a */
    public final byte[] mo69281a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.f141687a.mo69330a(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return bqup.m113434a(a, this.f141688b.mo69311a(bqup.m113434a(bArr2, a, copyOf)));
    }

    /* renamed from: b */
    public final byte[] mo69282b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
