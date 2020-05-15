package p000;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: ajbg */
final /* synthetic */ class ajbg implements ajbm {

    /* renamed from: a */
    static final ajbm f70320a = new ajbg();

    private ajbg() {
    }

    /* renamed from: a */
    public final Message mo38441a(Object obj, NearbyDevice nearbyDevice) {
        return new Message(new aiww((String) obj).f69963a.toString().getBytes(), "__reserved_namespace", "__eddystone_url", nearbyDevice);
    }
}
