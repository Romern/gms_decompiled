package p000;

import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.Comparator;

/* renamed from: aygi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aygi implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        NodeParcelable nodeParcelable = (NodeParcelable) obj;
        NodeParcelable nodeParcelable2 = (NodeParcelable) obj2;
        int compareTo = nodeParcelable.f110950a.compareTo(nodeParcelable2.f110950a);
        if (compareTo == 0) {
            return !nodeParcelable.f110953d ? nodeParcelable2.f110953d ? -1 : 0 : nodeParcelable2.f110953d ? 0 : 1;
        }
        return compareTo;
    }
}
