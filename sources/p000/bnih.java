package p000;

import java.util.Comparator;
import java.util.Map;

/* renamed from: bnih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnih implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Comparator f131661a;

    public bnih(Comparator comparator) {
        this.f131661a = comparator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.f131661a.compare(((Map.Entry) obj).getKey(), ((Map.Entry) obj2).getKey());
    }
}
