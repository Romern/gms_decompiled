package p000;

import java.io.Serializable;

/* renamed from: bnza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnza extends bnzb implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final long f132391a;

    public bnza(long j) {
        this.f132391a = j;
    }

    /* renamed from: a */
    public final int mo68738a() {
        return 64;
    }

    /* renamed from: b */
    public final byte[] mo68740b() {
        long j = this.f132391a;
        return new byte[]{(byte) ((int) j), (byte) ((int) (j >> 8)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 56))};
    }

    /* renamed from: c */
    public final int mo68741c() {
        return (int) this.f132391a;
    }

    /* renamed from: d */
    public final long mo68742d() {
        return this.f132391a;
    }

    /* renamed from: a */
    public final boolean mo68739a(bnzb bnzb) {
        return this.f132391a == bnzb.mo68742d();
    }
}
