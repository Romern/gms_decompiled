package p000;

import android.bluetooth.BluetoothDevice;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aice */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aice extends buqn {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f68670a;

    /* renamed from: b */
    final /* synthetic */ String f68671b;

    /* renamed from: c */
    final /* synthetic */ int f68672c;

    /* renamed from: d */
    final /* synthetic */ aics f68673d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aice(aics aics, String str, BluetoothDevice bluetoothDevice, String str2, int i) {
        super(str);
        this.f68673d = aics;
        this.f68670a = bluetoothDevice;
        this.f68671b = str2;
        this.f68672c = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahwk.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      ahwk.a(bxtx, java.lang.String):void
      ahwk.a(java.lang.String, boolean):void */
    public final void run() {
        aics aics = this.f68673d;
        BluetoothDevice bluetoothDevice = this.f68670a;
        String str = this.f68671b;
        int i = this.f68672c;
        Set set = (Set) aics.f68717n.get(bluetoothDevice);
        if (set == null) {
            set = new HashSet();
            aics.f68717n.put(bluetoothDevice, set);
        }
        if (i == 0) {
            set.remove(str);
            if (!set.isEmpty()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("FastPairEventStream: %s is still connected for %s", set.toArray(), bluetoothDevice);
                return;
            }
            if (cfoj.m141529J() && cfoj.m141562l()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairEventStream: Destroy event stream for %s (Profile)", bluetoothDevice);
                aics.mo37401a(bluetoothDevice);
            }
            aics.f68714k.mo37235a(bluetoothDevice.getAddress(), false);
        } else if (i == 2) {
            set.add(str);
            if (cfoj.m141529J() && cfoj.m141562l()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairEventStream: Establish event stream for %s (Profile)", bluetoothDevice);
                aics.mo37402a(bluetoothDevice, aics.f68705b.mo37033a(bluetoothDevice.getAddress()));
            }
            aics.f68714k.mo37235a(bluetoothDevice.getAddress(), true);
        }
    }
}
