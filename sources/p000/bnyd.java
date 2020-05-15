package p000;

import java.util.List;

/* renamed from: bnyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnyd extends bnyj {

    /* renamed from: a */
    private final int[] f132367a;

    /* renamed from: b */
    public final int mo68697b(int i) {
        return this.f132367a[i];
    }

    /* renamed from: d */
    public final int mo68698d() {
        return this.f132367a.length;
    }

    public bnyd(bnxk bnxk, List list, int i, int i2) {
        super(bnxk);
        this.f132367a = new int[(i2 - i)];
        int i3 = 0;
        while (true) {
            int[] iArr = this.f132367a;
            if (i3 < iArr.length) {
                iArr[i3] = ((bnxo) list.get(i3 + i)).f132338a.f132343b;
                i3++;
            } else {
                return;
            }
        }
    }
}
