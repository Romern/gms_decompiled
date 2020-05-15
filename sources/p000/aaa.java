package p000;

import android.util.SparseIntArray;

/* renamed from: aaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aaa {

    /* renamed from: a */
    final SparseIntArray f0a = new SparseIntArray();

    /* renamed from: b */
    final SparseIntArray f1b = new SparseIntArray();

    /* renamed from: c */
    public boolean f2c = false;

    /* renamed from: a */
    public abstract int mo8a(int i);

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[RETURN] */
    /* renamed from: a */
    public int mo9a(int i, int i2) {
        int i3;
        int i4;
        int a = mo8a(i);
        if (a == i2) {
            return 0;
        }
        if (this.f2c) {
            SparseIntArray sparseIntArray = this.f0a;
            int i5 = -1;
            int size = sparseIntArray.size() - 1;
            int i6 = 0;
            while (i6 <= size) {
                int i7 = (i6 + size) >>> 1;
                if (sparseIntArray.keyAt(i7) >= i) {
                    size = i7 - 1;
                } else {
                    i6 = i7 + 1;
                }
            }
            int i8 = i6 - 1;
            if (i8 >= 0 && i8 < sparseIntArray.size()) {
                i5 = sparseIntArray.keyAt(i8);
            }
            if (i5 >= 0) {
                i4 = this.f0a.get(i5) + mo8a(i5);
                i3 = i5 + 1;
                while (i3 < i) {
                    int a2 = mo8a(i3);
                    int i9 = i4 + a2;
                    if (i9 == i2) {
                        i9 = 0;
                    } else if (i9 > i2) {
                        i9 = a2;
                    }
                    i3++;
                }
                if (a + i4 <= i2) {
                    return 0;
                }
                return i4;
            }
        }
        i4 = 0;
        i3 = 0;
        while (i3 < i) {
        }
        if (a + i4 <= i2) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo11b(int i, int i2) {
        if (!this.f2c) {
            return mo9a(i, i2);
        }
        int i3 = this.f0a.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int a = mo9a(i, i2);
        this.f0a.put(i, a);
        return a;
    }

    /* renamed from: c */
    public final int mo13c(int i, int i2) {
        int a = mo8a(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int a2 = mo8a(i5);
            i3 += a2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = a2;
            }
        }
        return i3 + a > i2 ? i4 + 1 : i4;
    }

    /* renamed from: b */
    public final void mo12b() {
        this.f1b.clear();
    }

    /* renamed from: a */
    public final void mo10a() {
        this.f0a.clear();
    }
}
