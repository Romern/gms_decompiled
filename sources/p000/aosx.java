package p000;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: aosx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aosx {
    /* renamed from: a */
    public static String m69486a(int[] iArr) {
        if (iArr == null || (r0 = iArr.length) == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return TextUtils.join(",", arrayList);
    }
}
