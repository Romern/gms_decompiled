package p000;

import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: ayrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayrb extends aysz {

    /* renamed from: a */
    final /* synthetic */ ayri f98318a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayrb(ayri ayri, Object... objArr) {
        super(objArr);
        this.f98318a = ayri;
    }

    /* renamed from: a */
    public final void mo54307a() {
        if (!this.f98318a.f98336d.mo54366c()) {
            throw new BluetoothException("gatt.discoverServices returned false.");
        }
    }
}
