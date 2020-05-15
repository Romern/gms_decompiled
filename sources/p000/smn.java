package p000;

import android.content.ContentValues;
import com.google.android.gms.common.stats.radio.NetworkLatencyContract;
import com.google.android.gms.common.stats.radio.NetworkLatencyEvent;

/* renamed from: smn */
final /* synthetic */ class smn implements sqh {

    /* renamed from: a */
    static final sqh f44768a = new smn();

    private smn() {
    }

    /* renamed from: a */
    public final void mo25757a(Object obj, ContentValues contentValues) {
        NetworkLatencyEvent networkLatencyEvent = (NetworkLatencyEvent) obj;
        contentValues.put("event_time_ms", Long.valueOf(networkLatencyEvent.eventTimeMillis));
        contentValues.put(NetworkLatencyContract.NetworkLatencyColumns.LATENCY, Long.valueOf(networkLatencyEvent.latencyMillis));
        contentValues.put("network_type", Integer.valueOf(networkLatencyEvent.networkType));
        contentValues.put("tag", Integer.valueOf(networkLatencyEvent.tag));
        contentValues.put("device_state", Integer.valueOf(networkLatencyEvent.deviceState));
        contentValues.put(NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL, Boolean.valueOf(networkLatencyEvent.successful));
    }
}
