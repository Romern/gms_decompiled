package p000;

import java.util.Comparator;

/* renamed from: bhru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhru implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        bhqh bhqh = (bhqh) obj;
        bhqh bhqh2 = (bhqh) obj2;
        int compare = Integer.compare(bhqh.f119314h, bhqh2.f119314h);
        return compare == 0 ? -Float.compare(bhqh.f119312f, bhqh2.f119312f) : -compare;
    }
}
