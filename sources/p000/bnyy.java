package p000;

import java.io.Serializable;

/* renamed from: bnyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnyy extends bnzb implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final byte[] f132389a;

    public bnyy(byte[] bArr) {
        this.f132389a = (byte[]) bmxy.m108581a(bArr);
    }

    /* renamed from: a */
    public final int mo68738a() {
        return this.f132389a.length * 8;
    }

    /* renamed from: b */
    public final byte[] mo68740b() {
        return (byte[]) this.f132389a.clone();
    }

    /* renamed from: c */
    public final int mo68741c() {
        boolean z;
        int length = this.f132389a.length;
        if (length >= 4) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108602b(z, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.f132389a;
        int i = (bArr[1] & 255) << 8;
        return ((bArr[3] & 255) << 24) | i | (bArr[0] & 255) | ((bArr[2] & 255) << 16);
    }

    /* renamed from: d */
    public final long mo68742d() {
        boolean z;
        int length = this.f132389a.length;
        if (length >= 8) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108602b(z, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = (long) (this.f132389a[0] & 255);
        for (int i = 1; i < Math.min(this.f132389a.length, 8); i++) {
            j |= (((long) this.f132389a[i]) & 255) << (i * 8);
        }
        return j;
    }

    /* renamed from: e */
    public final byte[] mo68743e() {
        return this.f132389a;
    }

    /* renamed from: a */
    public final boolean mo68739a(bnzb bnzb) {
        if (this.f132389a.length != bnzb.mo68743e().length) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (true) {
            byte[] bArr = this.f132389a;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == bnzb.mo68743e()[i];
            i++;
        }
    }
}
