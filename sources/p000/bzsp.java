package p000;

import java.io.UnsupportedEncodingException;

/* renamed from: bzsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzsp implements bzrx {

    /* renamed from: a */
    private final byte[] f171283a;

    /* renamed from: b */
    private int f171284b;

    /* renamed from: c */
    private int f171285c;

    public bzsp(String str) {
        try {
            this.f171283a = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        return 0;
     */
    /* renamed from: a */
    public final synchronized int mo20316a(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        int length;
        if (bArr.length - i >= i2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Buffer length too small.");
        if (i2 != 0 && (i3 = this.f171284b) != (length = this.f171283a.length)) {
            int min = Math.min(i2, length - i3);
            for (int i4 = 0; i4 < min; i4++) {
                byte[] bArr2 = this.f171283a;
                int i5 = this.f171284b;
                bArr[i + i4] = bArr2[i5];
                this.f171284b = i5 + 1;
            }
            return min;
        }
    }

    /* renamed from: b */
    public final synchronized void mo20320b() {
        this.f171285c = this.f171284b;
    }

    /* renamed from: c */
    public final synchronized long mo20321c() {
        return (long) this.f171285c;
    }

    public final synchronized void close() {
    }

    /* renamed from: d */
    public final synchronized long mo20323d() {
        return (long) this.f171284b;
    }

    /* renamed from: e */
    public final synchronized long mo20324e() {
        return Long.MAX_VALUE;
    }

    /* renamed from: f */
    public final synchronized void mo20325f() {
        this.f171284b = this.f171285c;
    }

    /* renamed from: g */
    public final synchronized long mo20326g() {
        return (long) this.f171283a.length;
    }

    /* renamed from: h */
    public final synchronized boolean mo20327h() {
        return this.f171284b < this.f171283a.length;
    }

    /* renamed from: a */
    public final synchronized long mo20317a(long j) {
        long min;
        min = Math.min(j, (long) (this.f171283a.length - this.f171284b));
        this.f171284b = (int) (((long) this.f171284b) + min);
        return min;
    }
}
