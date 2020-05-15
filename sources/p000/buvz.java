package p000;

import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;

/* renamed from: buvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvz implements bvbr {

    /* renamed from: a */
    final /* synthetic */ buwa f155111a;

    public buvz(buwa buwa) {
        this.f155111a = buwa;
    }

    /* renamed from: a */
    public final void mo73116a() {
        BluetoothServerSocket bluetoothServerSocket = this.f155111a.f155117f;
        if (bluetoothServerSocket != null) {
            try {
                bluetoothServerSocket.close();
            } catch (IOException e) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("buwa", "a", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("BluetoothRfcommAccept: Error closing connection");
            }
        }
        this.f155111a.f155116e.set(true);
    }

    public final void run() {
        String str;
        if (this.f155111a.f155113b.mo73231e()) {
            try {
                buwa buwa = this.f155111a;
                buwa.f155117f = buwa.f155112a.listenUsingInsecureRfcommWithServiceRecord("Nearby", buwe.f155136a);
                while (!this.f155111a.f155116e.get()) {
                    try {
                        srn srn = bvcm.f155598a;
                        BluetoothSocket accept = this.f155111a.f155117f.accept();
                        buwa buwa2 = this.f155111a;
                        synchronized (buwa2.f155115d) {
                            buwd buwd = new buwd(accept);
                            buwa2.f155115d.add(buwd);
                            buwa2.f155114c.mo73278a(buwd);
                            bxvd da = buyn.f155316e.mo74144da();
                            bxvd da2 = buzt.f155423f.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            buzt buzt = (buzt) da2.f164949b;
                            buzt.f155426b = 1;
                            buzt.f155425a |= 1;
                            buzx h = buwd.mo73170h();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            buzt buzt2 = (buzt) da2.f164949b;
                            h.getClass();
                            buzt2.f155427c = h;
                            buzt2.f155425a |= 2;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            buyn buyn = (buyn) da.f164949b;
                            buzt buzt3 = (buzt) da2.mo74062i();
                            buzt3.getClass();
                            buyn.f155320c = buzt3;
                            buyn.f155318a |= 2;
                            bxvd da3 = buzw.f155438d.mo74144da();
                            bxtx a = bxtx.m123261a(bvau.m120846a(buwd.mo73169g()));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            buzw buzw = (buzw) da3.f164949b;
                            a.getClass();
                            buzw.f155440a = 1 | buzw.f155440a;
                            buzw.f155441b = a;
                            BluetoothSocket bluetoothSocket = buwd.f155133c;
                            if (bluetoothSocket == null) {
                                str = buwd.f155132b.mo73171a().getName();
                            } else {
                                str = bluetoothSocket.getRemoteDevice().getName();
                            }
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            buzw buzw2 = (buzw) da3.f164949b;
                            str.getClass();
                            buzw2.f155440a |= 2;
                            buzw2.f155442c = str;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            buyn buyn2 = (buyn) da.f164949b;
                            buzw buzw3 = (buzw) da3.mo74062i();
                            buzw3.getClass();
                            buyn2.f155321d = buzw3;
                            buyn2.f155318a |= 4;
                            buwa2.f155118g.mo36284a((buyn) da.mo74062i());
                        }
                    } catch (IOException e) {
                        srn srn2 = bvcm.f155598a;
                        return;
                    }
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("Failed to enable bluetooth");
        }
    }
}
