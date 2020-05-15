package p000;

import android.location.Location;
import java.util.Comparator;

/* renamed from: bfqn */
final /* synthetic */ class bfqn implements Comparator {

    /* renamed from: a */
    static final Comparator f114900a = new bfqn();

    private bfqn() {
    }

    public final int compare(Object obj, Object obj2) {
        int i = bfqs.f114909h;
        long elapsedRealtimeNanos = ((Location) obj).getElapsedRealtimeNanos();
        long elapsedRealtimeNanos2 = ((Location) obj2).getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos >= elapsedRealtimeNanos2) {
            return elapsedRealtimeNanos != elapsedRealtimeNanos2 ? 1 : 0;
        }
        return -1;
    }
}
