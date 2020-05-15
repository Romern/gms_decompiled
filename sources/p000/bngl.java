package p000;

/* renamed from: bngl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bngl {
    /* renamed from: a */
    static int m109321a(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    /* renamed from: b */
    public abstract void mo67629b(Object obj);

    /* renamed from: a */
    public void mo67626a(Iterable iterable) {
        for (Object obj : iterable) {
            mo67629b(obj);
        }
    }
}
