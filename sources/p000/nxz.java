package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: nxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nxz {

    /* renamed from: b */
    private static final bnsn f36909b = odk.m28481a("CAR.BT.DeviceWrapper");

    /* renamed from: a */
    public final BluetoothDevice f36910a;

    public nxz(BluetoothDevice bluetoothDevice) {
        this.f36910a = bluetoothDevice;
    }

    /* renamed from: a */
    public final int mo21822a() {
        return this.f36910a.getBondState();
    }

    /* renamed from: b */
    public final boolean mo21824b() {
        try {
            return ((Boolean) BluetoothDevice.class.getMethod("removeBond", null).invoke(this.f36910a, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e) {
            bnsi b = f36909b.mo68387b();
            b.mo68437a(e);
            b.mo68432a("nxz", "b", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("%s", e.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo21825c() {
        try {
            return ((Boolean) BluetoothDevice.class.getMethod("cancelBondProcess", null).invoke(this.f36910a, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e) {
            bnsi b = f36909b.mo68387b();
            b.mo68437a(e);
            b.mo68432a("nxz", "c", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("%s", e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo21826d() {
        try {
            return ((Boolean) BluetoothDevice.class.getMethod("setPhonebookAccessPermission", Integer.TYPE).invoke(this.f36910a, 1)).booleanValue();
        } catch (ReflectiveOperationException e) {
            bnsi d = f36909b.mo68390d();
            d.mo68437a(e);
            d.mo68432a("nxz", "d", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Failed to set phone book access permission.");
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo21827e() {
        try {
            return ((Boolean) BluetoothDevice.class.getMethod("setPhonebookAccessPermission", Integer.TYPE).invoke(this.f36910a, 2)).booleanValue();
        } catch (ReflectiveOperationException e) {
            bnsi d = f36909b.mo68390d();
            d.mo68437a(e);
            d.mo68432a("nxz", "e", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Failed to set phone book access permission.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo21828f() {
        try {
            if (((Integer) BluetoothDevice.class.getMethod("getPhonebookAccessPermission", null).invoke(this.f36910a, new Object[0])).intValue() == 1) {
                return true;
            }
            return false;
        } catch (ReflectiveOperationException e) {
            bnsi d = f36909b.mo68390d();
            d.mo68437a(e);
            d.mo68432a("nxz", "f", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Failed to get phone book access permission state.");
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo21823a(boolean z) {
        return this.f36910a.setPairingConfirmation(z);
    }
}
