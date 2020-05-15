package p000;

import java.util.List;

/* renamed from: ld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1156ld {

    /* renamed from: a */
    final int[] f25824a;

    /* renamed from: b */
    final float[] f25825b;

    public C1156ld(int i, int i2) {
        this.f25824a = new int[]{i, i2};
        this.f25825b = new float[]{0.0f, 1.0f};
    }

    public C1156ld(int i, int i2, int i3) {
        this.f25824a = new int[]{i, i2, i3};
        this.f25825b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C1156ld(List list, List list2) {
        int size = list.size();
        this.f25824a = new int[size];
        this.f25825b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f25824a[i] = ((Integer) list.get(i)).intValue();
            this.f25825b[i] = ((Float) list2.get(i)).floatValue();
        }
    }
}
