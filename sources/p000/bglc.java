package p000;

/* renamed from: bglc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bglc {

    /* renamed from: a */
    public int f116748a = 0;

    /* renamed from: b */
    private int f116749b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo62972a(long j, bgkf[] bgkfArr) {
        int length;
        int i = this.f116748a;
        int i2 = 0;
        if (i != 0) {
            return i != 1;
        }
        if (bgkfArr == null || (length = bgkfArr.length) == 0) {
            return true;
        }
        if (i == 0) {
            this.f116749b++;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                bgkf bgkf = bgkfArr[i2];
                if (bgkf != null) {
                    long j2 = bgkf.f116697a;
                    if (j2 != 0 && j2 != -1) {
                        if (Math.abs(j - j2) > 3600000) {
                            this.f116748a = 1;
                            break;
                        } else if (this.f116749b > 6) {
                            this.f116748a = 2;
                        }
                    } else {
                        this.f116748a = 1;
                    }
                }
                i2++;
            }
        }
        return mo62972a(j, null);
    }
}
