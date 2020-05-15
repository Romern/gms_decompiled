package p000;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: ajbh */
final /* synthetic */ class ajbh implements ajbm {

    /* renamed from: a */
    static final ajbm f70321a = new ajbh();

    private ajbh() {
    }

    /* renamed from: a */
    public final Message mo38441a(Object obj, NearbyDevice nearbyDevice) {
        return new Message(((aizv) obj).f70191c, "__reserved_namespace", "__ble_record", nearbyDevice);
    }
}
