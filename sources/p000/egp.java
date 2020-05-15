package p000;

import android.os.Build;
import android.util.SparseIntArray;

/* renamed from: egp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egp {

    /* renamed from: a */
    private static final SparseIntArray f14870a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f14870a = sparseIntArray;
        sparseIntArray.put(26, 18);
    }

    /* renamed from: a */
    public static boolean m10365a(int i) {
        return f14870a.indexOfKey(i) < 0 || Build.VERSION.SDK_INT >= f14870a.get(i);
    }
}
