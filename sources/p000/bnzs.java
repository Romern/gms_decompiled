package p000;

import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: bnzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnzs extends bnyo {

    /* renamed from: a */
    private final MessageDigest f132416a;

    /* renamed from: b */
    private final int f132417b;

    /* renamed from: c */
    private boolean f132418c;

    public bnzs(MessageDigest messageDigest, int i) {
        this.f132416a = messageDigest;
        this.f132417b = i;
    }

    /* renamed from: b */
    private final void m110925b() {
        bmxy.m108601b(!this.f132418c, "Cannot re-use a Hasher after calling hash() on it");
    }

    /* renamed from: a */
    public final bnzb mo68729a() {
        m110925b();
        this.f132418c = true;
        return this.f132417b == this.f132416a.getDigestLength() ? bnzb.m110872b(this.f132416a.digest()) : bnzb.m110872b(Arrays.copyOf(this.f132416a.digest(), this.f132417b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68710a(byte b) {
        m110925b();
        this.f132416a.update(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68715a(byte[] bArr, int i, int i2) {
        m110925b();
        this.f132416a.update(bArr, i, i2);
    }
}
