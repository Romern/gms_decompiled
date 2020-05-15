package p000;

import java.util.List;

/* renamed from: yue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yue {
    /* renamed from: a */
    public static int m44849a(Object obj, List list) {
        if (obj == null) {
            return -1;
        }
        int indexOf = list.indexOf(obj);
        if (indexOf >= 0) {
            return indexOf;
        }
        list.add(obj);
        return list.size() - 1;
    }
}
