package p000;

import java.util.Comparator;
import java.util.Map;

/* renamed from: azpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azpx implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Long) ((Map.Entry) obj).getValue()).compareTo((Long) ((Map.Entry) obj2).getValue());
    }
}
