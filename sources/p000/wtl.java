package p000;

import android.accounts.Account;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: wtl */
final /* synthetic */ class wtl implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wts f51302a;

    public wtl(wts wts) {
        this.f51302a = wts;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        wts wts = this.f51302a;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothDevice bluetoothDevice = null;
        if (defaultAdapter == null || (str = wts.f51316c) == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a("wts", "h", 354, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DeviceDetail: getRemoteBluetoothDevice with null variable, return null.");
        } else {
            try {
                bluetoothDevice = defaultAdapter.getRemoteDevice(str);
            } catch (IllegalArgumentException e) {
            }
        }
        if (!wts.mo29402e() || bluetoothDevice == null) {
            bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
            bnsl2.mo68432a("wts", "d", 343, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("DeviceDetail: Forget device %s (should be null) by FootprintsDeviceManager.forgetDevice", wts.f51316c);
            buru buru = wts.f51323j.f51252a;
            byte[] bArr = wts.f51315b;
            List a = buru.m120318a(buru.f154791b);
            int size = a.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Account account = (Account) a.get(i2);
                try {
                    ahza a2 = buru.m120317a((List) buru.mo73055a(account).get(), bArr);
                    if (a2 == null) {
                        i2++;
                    } else if ((a2.f68443a & 4) == 0) {
                        bnsl bnsl3 = (bnsl) busr.f154819a.mo68388c();
                        bnsl3.mo68432a("buru", "a", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("FastPair: fail to forget footprints because device has no sha256.");
                    } else {
                        buru.mo73060a(account, bArr, a2.f68446d.getKey());
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    bnsl bnsl4 = (bnsl) busr.f154819a.mo68388c();
                    bnsl4.mo68437a(e2);
                    bnsl4.mo68432a("buru", "a", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("FastPair: fail to forget footprints.");
                }
            }
        } else {
            bnsl bnsl5 = (bnsl) wtw.f51331a.mo68390d();
            bnsl5.mo68432a("wts", "d", 329, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68420a("DeviceDetail: Forget device %s by BluetoothDevice.removeBond", wts.f51316c);
            wts.m42240g().execute(new wtm(wts, bluetoothDevice));
        }
        wts.getActivity().onBackPressed();
    }
}
