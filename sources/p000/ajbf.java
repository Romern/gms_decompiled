package p000;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: ajbf */
final /* synthetic */ class ajbf implements ajbm {

    /* renamed from: a */
    static final ajbm f70319a = new ajbf();

    private ajbf() {
    }

    /* renamed from: a */
    public final Message mo38441a(Object obj, NearbyDevice nearbyDevice) {
        byys byys = (byys) obj;
        int a = bzaj.m125580a(byys.f169005b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return new Message(new aiwx(byys.f169006c.getKey()).f69964a.f70352a, "__reserved_namespace", "__i_beacon_id", nearbyDevice);
        }
        if (i != 2) {
            return null;
        }
        return new Message(new aiwv(byys.f169006c.getKey()).f69962a.f70352a, "__reserved_namespace", "__eddystone_uid", nearbyDevice);
    }
}
