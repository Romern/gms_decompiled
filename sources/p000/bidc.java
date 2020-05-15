package p000;

import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import java.util.Comparator;

/* renamed from: bidc */
final /* synthetic */ class bidc implements Comparator {

    /* renamed from: a */
    static final Comparator f120287a = new bidc();

    private bidc() {
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((HierarchicalPlaceLikelihoodEntity) obj2).f79529c, ((HierarchicalPlaceLikelihoodEntity) obj).f79529c);
    }
}
