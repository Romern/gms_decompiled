package p000;

import java.util.List;

/* renamed from: bxzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxzo {
    /* renamed from: a */
    public static int[] m124571a(List list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((bxvp) list.get(i)).mo3214a();
        }
        return iArr;
    }

    /* renamed from: a */
    public static int[] m124572a(bxvp[] bxvpArr) {
        int[] iArr = new int[bxvpArr.length];
        for (int i = 0; i < bxvpArr.length; i++) {
            iArr[i] = bxvpArr[i].mo3214a();
        }
        return iArr;
    }
}
