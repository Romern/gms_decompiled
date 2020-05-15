package p000;

import android.util.Pair;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.Comparator;

/* renamed from: azcr */
final /* synthetic */ class azcr implements Comparator {
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        LocalEntityId localEntityId = azcv.f99014b;
        if (pair.first == null || pair2.first == null || pair.second == null || pair2.second == null) {
            return 0;
        }
        if (!((String) pair.second).equals(pair2.second)) {
            return ((String) pair.second).compareTo((String) pair2.second);
        }
        return Integer.compare(((LocalEntityId) pair2.first).f111075b, ((LocalEntityId) pair.first).f111075b);
    }
}
