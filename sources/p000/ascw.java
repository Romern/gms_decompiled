package p000;

import android.bluetooth.BluetoothAdapter;

/* renamed from: ascw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascw extends ascv {

    /* renamed from: a */
    public final BluetoothAdapter f88713a = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: b */
    public final boolean mo49047b() {
        return this.f88713a.isEnabled();
    }

    /* renamed from: c */
    public final boolean mo49048c() {
        return this.f88713a.enable();
    }

    /* renamed from: d */
    public final String mo49049d() {
        return this.f88713a.getAddress();
    }

    /* renamed from: e */
    public final void mo49050e() {
        this.f88713a.disable();
    }
}
