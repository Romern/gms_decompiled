package p000;

import android.content.ContentValues;
import com.google.android.gms.common.stats.radio.NetworkActivityContract;
import com.google.android.gms.common.stats.radio.NetworkActivityEvent;

/* renamed from: sml */
final /* synthetic */ class sml implements sqh {

    /* renamed from: a */
    static final sqh f44766a = new sml();

    private sml() {
    }

    /* renamed from: a */
    public final void mo25757a(Object obj, ContentValues contentValues) {
        NetworkActivityEvent networkActivityEvent = (NetworkActivityEvent) obj;
        contentValues.put("event_time_ms", Long.valueOf(networkActivityEvent.eventTimeMillis));
        contentValues.put("network_type", Integer.valueOf(networkActivityEvent.networkType));
        contentValues.put("tag", Integer.valueOf(networkActivityEvent.tag));
        contentValues.put("device_state", Integer.valueOf(networkActivityEvent.deviceState));
        contentValues.put(NetworkActivityContract.NetworkActivityColumns.IS_NETWORK_ACTIVE, Boolean.valueOf(networkActivityEvent.isNetworkActive));
    }
}
