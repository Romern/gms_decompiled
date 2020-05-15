package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ausp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ausp {

    /* renamed from: a */
    public static final aunx f92434a = new aunx("TrustAgent", "BondedDeviceEidChecker");

    /* renamed from: b */
    public final Object f92435b = new Object();

    /* renamed from: c */
    public final Map f92436c = new HashMap();

    /* renamed from: d */
    public final List f92437d = new ArrayList();

    /* renamed from: e */
    public final ausm f92438e;

    /* renamed from: f */
    public final AtomicBoolean f92439f;

    /* renamed from: g */
    public final bedj f92440g;

    /* renamed from: h */
    private final aupn f92441h;

    public ausp(Context context, ausm ausm) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        aupj aupj = new aupj(aupo.m77578a(rpr.m34216b()));
        bedj bedj = new bedj(context, aysk.m84701b());
        this.f92438e = ausm;
        this.f92439f = atomicBoolean;
        this.f92441h = aupj;
        this.f92440g = bedj;
    }

    /* renamed from: b */
    public static boolean m77772b(BluetoothDevice bluetoothDevice) {
        return (cgzt.m147781f() && auuj.m77862c(bluetoothDevice)) || cgzt.m147780e();
    }

    /* renamed from: a */
    public final boolean mo50882a() {
        return this.f92439f.get();
    }

    /* renamed from: a */
    public final boolean mo50883a(BluetoothDevice bluetoothDevice) {
        if (!this.f92441h.mo50729a(auuj.m77863d(bluetoothDevice))) {
            return m77772b(bluetoothDevice);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo50884a(bede bede) {
        if (!mo50883a(bede.mo58565a().f98419a)) {
            f92434a.mo50711a("EID check is not needed", new Object[0]);
            return false;
        }
        bedy.m91843a(bede);
        return true;
    }
}
