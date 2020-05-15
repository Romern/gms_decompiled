package p000;

import android.bluetooth.BluetoothSocket;
import android.os.Build;
import java.io.IOException;

/* renamed from: buwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buwd implements bvbw {

    /* renamed from: d */
    private static final bvcl f155130d = bvcl.m120913b();

    /* renamed from: a */
    public final boolean f155131a;

    /* renamed from: b */
    public final buwf f155132b;

    /* renamed from: c */
    public BluetoothSocket f155133c;

    /* renamed from: e */
    private final String f155134e;

    /* renamed from: f */
    private bvcw f155135f;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public buwd(BluetoothSocket bluetoothSocket) {
        this.f155131a = false;
        this.f155134e = ((bvci) f155130d).mo73313a();
        this.f155132b = null;
        sdo.m34959a(bluetoothSocket);
        this.f155133c = bluetoothSocket;
    }

    /* renamed from: a */
    public final String mo73141a() {
        return this.f155134e;
    }

    /* renamed from: b */
    public final byte[] mo73143b() {
        return this.f155135f.mo73143b();
    }

    /* renamed from: c */
    public final synchronized void mo73144c() {
        if (!mo73146d()) {
            if (this.f155131a) {
                buwf buwf = this.f155132b;
                this.f155133c = buwf.mo73171a().createInsecureRfcommSocketToServiceRecord(buwf.f155138a);
            }
            if (!this.f155133c.isConnected()) {
                try {
                    this.f155133c.connect();
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("buwd", "c", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("BluetoothRfcommConnection failed to connect");
                }
            }
            BluetoothSocket bluetoothSocket = this.f155133c;
            bvdb bvdb = new bvdb(this.f155131a, bluetoothSocket.getInputStream(), bluetoothSocket.getOutputStream());
            this.f155135f = bvdb;
            bvdb.mo73144c();
        }
    }

    public final void close() {
        bvcw bvcw = this.f155135f;
        if (bvcw != null) {
            bvcw.close();
        }
    }

    /* renamed from: d */
    public final boolean mo73146d() {
        bvcw bvcw;
        BluetoothSocket bluetoothSocket = this.f155133c;
        return bluetoothSocket != null && bluetoothSocket.isConnected() && (bvcw = this.f155135f) != null && ((bvdb) bvcw).f155629a;
    }

    /* renamed from: e */
    public final buzo mo73147e() {
        bxvd da = buzo.f155407d.mo74144da();
        String str = this.f155134e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzo buzo = (buzo) da.f164949b;
        str.getClass();
        buzo.f155409a |= 1;
        buzo.f155410b = str;
        bxvf bxvf = (bxvf) buzp.f155413c.mo74144da();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        buzp buzp = (buzp) bxvf.f164949b;
        buzp.f155416b = 0;
        buzp.f155415a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzo buzo2 = (buzo) da.f164949b;
        buzp buzp2 = (buzp) bxvf.mo74062i();
        buzp2.getClass();
        buzo2.f155411c = buzp2;
        buzo2.f155409a |= 2;
        return (buzo) da.mo74062i();
    }

    /* renamed from: f */
    public final boolean mo73148f() {
        return this.f155131a;
    }

    /* renamed from: g */
    public final String mo73169g() {
        BluetoothSocket bluetoothSocket = this.f155133c;
        if (bluetoothSocket == null) {
            return this.f155132b.mo73171a().getAddress();
        }
        return bluetoothSocket.getRemoteDevice().getAddress();
    }

    /* renamed from: h */
    public final buzx mo73170h() {
        bxvd da = buzx.f155443c.mo74144da();
        String str = this.f155134e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzx buzx = (buzx) da.f164949b;
        str.getClass();
        buzx.f155445a |= 1;
        buzx.f155446b = str;
        return (buzx) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo73142a(byte[] bArr) {
        this.f155135f.mo73142a(bArr);
    }

    public buwd(buwf buwf) {
        this.f155131a = true;
        this.f155134e = ((bvci) f155130d).mo73313a();
        sdo.m34959a(buwf);
        this.f155132b = buwf;
        this.f155133c = null;
    }
}
