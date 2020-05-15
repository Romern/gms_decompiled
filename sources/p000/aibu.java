package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: aibu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aibu extends buqn {

    /* renamed from: a */
    final /* synthetic */ int f68636a;

    /* renamed from: b */
    final /* synthetic */ BluetoothDevice f68637b;

    /* renamed from: c */
    final /* synthetic */ int f68638c;

    /* renamed from: d */
    final /* synthetic */ aics f68639d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aibu(aics aics, String str, int i, BluetoothDevice bluetoothDevice, int i2) {
        super(str);
        this.f68639d = aics;
        this.f68636a = i;
        this.f68637b = bluetoothDevice;
        this.f68638c = i2;
    }

    public final void run() {
        switch (this.f68636a) {
            case 10:
                if (cfoj.f184966a.mo6606a().mo82184q() || this.f68638c == 12) {
                    aics aics = this.f68639d;
                    BluetoothDevice bluetoothDevice = this.f68637b;
                    ahyz a = aics.f68705b.mo37033a(bluetoothDevice.getAddress());
                    if (a != null) {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: RemoveBond: Handle remove bond event");
                        snp.m35704b(10).execute(new ahui(aics.f68708e, aics.f68710g, a));
                    } else {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: RemoveBond: Not Fast Pair 2.0 device (%s)", bluetoothDevice.getAddress());
                    }
                    aics aics2 = this.f68639d;
                    BluetoothDevice bluetoothDevice2 = this.f68637b;
                    if (cfoj.m141575y()) {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: remove ble address from retroactive manager for %s", bluetoothDevice2);
                        aics2.f68713j.mo37217a(bluetoothDevice2);
                    }
                }
                if (cfoj.m141562l()) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairEventStream: Destroy event stream for %s (NONE)", this.f68637b);
                    this.f68639d.mo37401a(this.f68637b);
                    return;
                }
                return;
            case 11:
                if (cfos.m141991e()) {
                    aics aics3 = this.f68639d;
                    BluetoothDevice bluetoothDevice3 = this.f68637b;
                    for (ahsu ahsu : aics3.f68705b.mo37048c()) {
                        if (bluetoothDevice3.getAddress().equals(ahsu.mo37088m())) {
                            aics3.f68709f.mo37012a(bvin.BLUETOOTH_BONDING, ahsu);
                        }
                    }
                }
                if (!this.f68639d.f68721r) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Received BONDING state, temporarily disabling notifications.");
                    aics aics4 = this.f68639d;
                    aics4.f68704a.mo72989e(aics4.f68723t);
                    aicq aicq = aics4.f68720q;
                    if (aicq != null) {
                        aicq.mo37397a(false);
                    }
                    aics4.f68704a.mo72983a(aics4.f68723t, cfog.f184854a.mo6606a().mo81939A());
                    return;
                }
                return;
            case 12:
                if (cfoj.m141562l() && !cfoj.m141529J()) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairEventStream: Establish event stream for %s (BONDED)", this.f68637b);
                    aics aics5 = this.f68639d;
                    BluetoothDevice bluetoothDevice4 = this.f68637b;
                    aics5.mo37402a(bluetoothDevice4, aics5.f68705b.mo37033a(bluetoothDevice4.getAddress()));
                }
                if (!this.f68639d.f68721r) {
                    ahur.m56675a(new aibt(this, this.f68637b));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
