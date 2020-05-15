package p000;

import java.util.Comparator;

/* renamed from: caxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caxw implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
    }
}
