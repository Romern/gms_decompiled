package p000;

import java.io.Serializable;

/* renamed from: bnyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnyz extends bnzb implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final int f132390a;

    public bnyz(int i) {
        this.f132390a = i;
    }

    /* renamed from: a */
    public final int mo68738a() {
        return 32;
    }

    /* renamed from: b */
    public final byte[] mo68740b() {
        int i = this.f132390a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    /* renamed from: c */
    public final int mo68741c() {
        return this.f132390a;
    }

    /* renamed from: d */
    public final long mo68742d() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    /* renamed from: a */
    public final boolean mo68739a(bnzb bnzb) {
        return this.f132390a == bnzb.mo68741c();
    }
}
