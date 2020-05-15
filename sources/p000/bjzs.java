package p000;

import java.util.Comparator;

/* renamed from: bjzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjzs implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj.toString(), obj2.toString());
    }
}
