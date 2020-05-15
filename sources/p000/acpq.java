package p000;

import java.util.Comparator;
import java.util.Map;

/* renamed from: acpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acpq implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.signum(((acpt) ((Map.Entry) obj2).getValue()).f60448a - ((acpt) ((Map.Entry) obj).getValue()).f60448a);
    }
}
