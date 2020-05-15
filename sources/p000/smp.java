package p000;

import com.google.android.gms.common.stats.radio.NetworkLatencyEvent;
import java.util.Comparator;

/* renamed from: smp */
final /* synthetic */ class smp implements Comparator {

    /* renamed from: a */
    static final Comparator f44770a = new smp();

    private smp() {
    }

    public final int compare(Object obj, Object obj2) {
        String str = smr.f44772a;
        return (((NetworkLatencyEvent) obj).latencyMillis > ((NetworkLatencyEvent) obj2).latencyMillis ? 1 : (((NetworkLatencyEvent) obj).latencyMillis == ((NetworkLatencyEvent) obj2).latencyMillis ? 0 : -1));
    }
}
