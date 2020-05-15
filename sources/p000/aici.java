package p000;

import android.accounts.Account;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aici */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aici extends buqn {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f68678a;

    /* renamed from: b */
    final /* synthetic */ aics f68679b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aici(aics aics, String str, AtomicReference atomicReference) {
        super(str);
        this.f68679b = aics;
        this.f68678a = atomicReference;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.lang.Object, java.lang.Object):bngx
     arg types: [int, int]
     candidates:
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.lang.Object, java.lang.Object):bngx */
    public final void run() {
        bngx bngx;
        Set<BluetoothDevice> bondedDevices;
        aics aics = this.f68679b;
        if (cfoj.f184966a.mo6606a().mo82127ay()) {
            ahzt.m56928b(aics.f68708e);
        }
        aics aics2 = this.f68679b;
        if (!cfoj.m141562l() || !cfoj.m141528I()) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68435a("FastPairEventStream: Skip initialize event stream, flagConnect=%s, flagInitialize=%s", cfoj.m141562l(), cfoj.m141528I());
        } else {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairEventStream: Skip initialize event stream, adapter is null");
            } else {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairEventStream: Initialize event stream");
                for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                    if (aics2.f68716m.mo73090a(bluetoothDevice.getAddress(), bngx.m109357a((Object) 2, (Object) 1)) != null) {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairEventStream: Establish event stream for %s (init)", bluetoothDevice);
                        aics2.mo37402a(bluetoothDevice, aics2.f68705b.mo37033a(bluetoothDevice.getAddress()));
                    }
                }
            }
        }
        Context context = this.f68679b.f68708e;
        if (cfoj.m141551af() && cfoj.f184966a.mo6606a().mo82188u()) {
            int i = Build.VERSION.SDK_INT;
            if (!(BluetoothAdapter.getDefaultAdapter() == null || (bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices()) == null || bondedDevices.isEmpty())) {
                ahst ahst = (ahst) ahgz.m55754a(context, ahst.class);
                bnha h = bnhe.m109414h();
                for (BluetoothDevice bluetoothDevice2 : bondedDevices) {
                    ahyz a = ahst.mo37033a(bluetoothDevice2.getAddress());
                    if (!(a == null || (a.f68427a & 1024) == 0)) {
                        h.mo67695b(bluetoothDevice2, a);
                    }
                }
                ahur.m56675a(new ahuc(context, h));
            }
        }
        AtomicReference atomicReference = this.f68678a;
        aics aics3 = this.f68679b;
        if (cfoj.m141553c()) {
            bngs bngs = new bngs();
            Context context2 = aics3.f68708e;
            for (Account account : soz.m35801d(context2, context2.getPackageName())) {
                bngs.mo67668c(aics3.f68710g.mo73056a(new aicr(aics3, account), account));
            }
            bngx = bngs.mo67664a();
        } else {
            bngx = bngx.m109376e();
        }
        atomicReference.set(bngx);
    }
}
