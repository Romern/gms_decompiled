package p000;

import android.bluetooth.BluetoothDevice;
import java.util.List;

/* renamed from: nyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nyl implements nyj {

    /* renamed from: a */
    public static final bnsn f36952a = odk.m28481a("CAR.BT");

    /* renamed from: b */
    public final boolean f36953b = ccpm.f179688a.mo6606a().mo76591g();

    /* renamed from: c */
    public final nxy f36954c;

    /* renamed from: d */
    public BluetoothDevice f36955d;

    /* renamed from: e */
    public final Runnable f36956e;

    /* renamed from: f */
    public nyi f36957f;

    /* renamed from: g */
    public boolean f36958g;

    public nyl(nxy nxy, BluetoothDevice bluetoothDevice, Runnable runnable) {
        this.f36954c = nxy;
        this.f36955d = bluetoothDevice;
        this.f36956e = runnable;
    }

    /* renamed from: a */
    public final boolean mo21843a() {
        bmxy.m108581a(this.f36957f);
        return this.f36957f.mo21840a(this.f36955d) == 1;
    }

    /* renamed from: b */
    public final boolean mo21844b() {
        bmxy.m108581a(this.f36957f);
        return this.f36957f.mo21840a(this.f36955d) == 2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nyi.a(android.bluetooth.BluetoothDevice, boolean):boolean
     arg types: [android.bluetooth.BluetoothDevice, int]
     candidates:
      nyi.a(android.bluetooth.BluetoothDevice, int):void
      nyi.a(android.bluetooth.BluetoothDevice, boolean):boolean */
    /* renamed from: c */
    public final void mo21845c() {
        bmxy.m108581a(this.f36957f);
        List<BluetoothDevice> connectedDevices = this.f36957f.f36950a.getConnectedDevices();
        if (connectedDevices != null) {
            for (BluetoothDevice bluetoothDevice : connectedDevices) {
                bmxy.m108581a(this.f36957f);
                this.f36957f.mo21842a(bluetoothDevice, false);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nyi.a(android.bluetooth.BluetoothDevice, boolean):boolean
     arg types: [android.bluetooth.BluetoothDevice, int]
     candidates:
      nyi.a(android.bluetooth.BluetoothDevice, int):void
      nyi.a(android.bluetooth.BluetoothDevice, boolean):boolean */
    /* renamed from: d */
    public final boolean mo21846d() {
        bmxy.m108581a(this.f36957f);
        this.f36957f.mo21841a(this.f36955d, 100);
        return this.f36957f.mo21842a(this.f36955d, true);
    }

    /* renamed from: e */
    public final void mo21849e() {
        this.f36958g = true;
        nyi nyi = this.f36957f;
        if (nyi != null) {
            nxy nxy = this.f36954c;
            nxy.f36908a.closeProfileProxy(1, nyi.f36950a);
            this.f36957f = null;
        }
    }
}
