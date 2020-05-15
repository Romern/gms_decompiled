package p000;

import android.bluetooth.BluetoothDevice;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSighting;
import java.util.Iterator;

/* renamed from: buwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buwh extends buqn {

    /* renamed from: a */
    final /* synthetic */ BleSighting f155142a;

    /* renamed from: b */
    final /* synthetic */ buwk f155143b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buwh(buwk buwk, String str, BleSighting bleSighting) {
        super(str);
        this.f155143b = buwk;
        this.f155142a = bleSighting;
    }

    public final void run() {
        BluetoothDevice bluetoothDevice;
        buwo buwo = this.f155143b.f155148a;
        BleSighting bleSighting = this.f155142a;
        if (buwo.f155163j) {
            if (bleSighting != null && (bluetoothDevice = bleSighting.f29271a) != null && bluetoothDevice.getAddress() != null) {
                if (bleSighting.f29272b != null) {
                    for (buwm buwm : buwo.f155158e.keySet()) {
                        Iterator it = ((buwn) buwo.f155158e.get(buwm)).f155151a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((BleFilter) it.next()).mo17292a(bleSighting)) {
                                    buwm.mo73154a(bleSighting);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                } else {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl.mo68437a(new IllegalStateException());
                    bnsl.mo68432a("buwo", "a", 658, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("BackgroundBleScanner: Scan record with null bytes: %s", bleSighting);
                }
            } else {
                bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
                bnsl2.mo68437a(new IllegalStateException());
                bnsl2.mo68432a("buwo", "a", 645, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("BackgroundBleScanner: Invalid scan result: %s", bleSighting);
            }
        }
        if (buwo.m120595b(this.f155143b.f155148a.mo73187f().f155153c) && !this.f155143b.f155148a.mo73186e()) {
            buwo buwo2 = this.f155143b.f155148a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long b = cfoa.f184773a.mo6606a().mo81861b();
            long a = cfoa.f184773a.mo6606a().mo81860a();
            long j = buwo2.f155166m;
            if (j + b < elapsedRealtime) {
                buwo2.f155166m = elapsedRealtime;
            } else if (!buwo2.f155164k && j + a < elapsedRealtime) {
                bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68390d();
                bnsl3.mo68432a("buwo", "a", (int) ErrorInfo.TYPE_FSC_OTHER_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68417a("BackgroundBleScanner: Wake up rate too high, pausing for %tM:%tS.", b, b);
                buwo2.f155164k = true;
                buwo2.f155159f.mo25674a("NearbyDirect_BackgroundBleScanner_Unpause", 2, elapsedRealtime + b, buwo2.mo73184c(), buwo2.mo73187f().f155152b);
                buwo2.mo73185d();
            }
        }
    }
}
