package p000;

import android.bluetooth.BluetoothServerSocket;
import java.io.IOException;

/* renamed from: aiiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiiz extends soa {

    /* renamed from: a */
    final /* synthetic */ BluetoothServerSocket f68931a;

    /* renamed from: b */
    final /* synthetic */ String f68932b;

    /* renamed from: c */
    final /* synthetic */ aijh f68933c;

    /* renamed from: d */
    final /* synthetic */ ahoa f68934d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiiz(aijh aijh, int i, BluetoothServerSocket bluetoothServerSocket, ahoa ahoa, String str) {
        super(i);
        this.f68933c = aijh;
        this.f68931a = bluetoothServerSocket;
        this.f68934d = ahoa;
        this.f68932b = str;
    }

    public final void run() {
        while (true) {
            try {
                aipa aipa = new aipa(this.f68931a.accept());
                String str = aipa.f69126a;
                airo airo = new airo(24);
                if (aijh.m57293a(this.f68933c.f68961b.mo37908b(airo))) {
                    aipa.mo37637a(new aiix(this, airo));
                    this.f68934d.f67647a.mo36866a(aipa);
                } else {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                    bnsl.mo68432a("aiiz", "run", 375, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to create a BluetoothClassicSocket because we were unable to register the MediumOperation.");
                    ails.m57440a(aipa, "BluetoothClassic", str);
                }
            } catch (IOException e) {
                BluetoothServerSocket bluetoothServerSocket = this.f68931a;
                String str2 = this.f68932b;
                if (bluetoothServerSocket != null) {
                    try {
                        bluetoothServerSocket.close();
                        srn srn = ailf.f69111a;
                        return;
                    } catch (IOException e2) {
                        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("ails", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68424a("Failed to close %sSocket %s", "BluetoothClassic", str2);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
