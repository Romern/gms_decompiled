package p000;

import android.bluetooth.BluetoothAdapter;
import java.io.IOException;
import java.util.Map;

/* renamed from: aikj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aikj extends airo {

    /* renamed from: a */
    public final aipr f69042a;

    public aikj(BluetoothAdapter bluetoothAdapter, Map map, aiqm aiqm) {
        super(33);
        this.f69042a = new aipr(bluetoothAdapter, map, aiqm);
    }

    /* renamed from: a */
    public final void mo37566a() {
        this.f69042a.mo37830c();
    }

    /* renamed from: b */
    public final int mo37568b() {
        aipr aipr = this.f69042a;
        try {
            aipr.f69451d = aipr.f69453f.listenUsingInsecureL2capChannel();
            aipr.f69448a = aipr.f69451d.getPsm();
            new soa(9, new aipm(aipr)).start();
            return 2;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aipr", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to listen incoming L2CAP socket.");
            return 3;
        }
    }
}
