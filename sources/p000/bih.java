package p000;

/* renamed from: bih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bih {

    /* renamed from: a */
    public byte[] f3298a;

    /* renamed from: b */
    public byte[] f3299b;

    /* renamed from: c */
    public byte[] f3300c;

    /* renamed from: d */
    public int f3301d;

    /* renamed from: e */
    public byte f3302e;

    /* renamed from: f */
    public long f3303f;

    /* renamed from: g */
    public byte[] f3304g;

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1 A[RETURN] */
    /* renamed from: a */
    public final boolean mo3162a(byte[] bArr, boolean z, boolean z2) {
        int a;
        int length = bArr.length;
        bjg bjg = new bjg();
        int i = 0;
        boolean z3 = false;
        while (i < length && (a = bjh.m3191a(bArr, i, length, bjg)) != 0) {
            int i2 = bjg.f3363b;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, bjg.f3364c + i, bArr2, 0, i2);
            if (a != 135) {
                if (a != 136) {
                    switch (a) {
                        case 128:
                            if (bjg.f3363b == 2) {
                                this.f3301d = bji.m3195a(bArr2, 0);
                                z3 |= true;
                                break;
                            } else {
                                return false;
                            }
                        case 129:
                            if (bjg.f3363b == 16) {
                                if (!z) {
                                    this.f3300c = bArr2;
                                } else {
                                    this.f3298a = bArr2;
                                }
                                z3 |= true;
                                break;
                            } else {
                                return false;
                            }
                        case 130:
                            if (bjg.f3363b == 3) {
                                this.f3299b = bArr2;
                                z3 |= true;
                                break;
                            } else {
                                return false;
                            }
                        case 131:
                            if (bjg.f3363b == 1) {
                                this.f3302e = bArr2[0];
                                z3 |= true;
                                break;
                            } else {
                                return false;
                            }
                    }
                } else {
                    if (z2) {
                        this.f3303f = bji.m3207b(bArr2, 0);
                    } else if (bjg.f3363b != 5) {
                        return false;
                    } else {
                        this.f3303f = bji.m3206b(bArr2);
                    }
                    z3 |= true;
                }
            } else if (bjg.f3363b != 16) {
                return false;
            } else {
                this.f3304g = bArr2;
                z3 |= true;
            }
            i += bjg.f3364c;
            if (!bjg.f3365d) {
                i += bjg.f3363b;
            }
        }
        if (!z) {
            return z3 || z3;
        }
        if (!z3 && !z3) {
            return false;
        }
    }
}
