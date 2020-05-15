package p000;

import com.google.android.gms.common.stats.radio.NetworkActivityEvent;
import java.util.Comparator;

/* renamed from: smq */
final /* synthetic */ class smq implements Comparator {

    /* renamed from: a */
    static final Comparator f44771a = new smq();

    private smq() {
    }

    public final int compare(Object obj, Object obj2) {
        String str = smr.f44772a;
        return (((NetworkActivityEvent) obj).eventTimeMillis > ((NetworkActivityEvent) obj2).eventTimeMillis ? 1 : (((NetworkActivityEvent) obj).eventTimeMillis == ((NetworkActivityEvent) obj2).eventTimeMillis ? 0 : -1));
    }
}
