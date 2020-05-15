package p000;

import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.Comparator;

/* renamed from: aelq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aelq implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return -Float.compare(((PlaceLikelihoodEntity) obj).f79559b, ((PlaceLikelihoodEntity) obj2).f79559b);
    }
}
