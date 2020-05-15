package p000;

import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: becy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class becy extends aysz {

    /* renamed from: a */
    final /* synthetic */ bede f106922a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public becy(bede bede, Object... objArr) {
        super(objArr);
        this.f106922a = bede;
    }

    /* renamed from: a */
    public final void mo54307a() {
        if (!this.f106922a.f106939e.mo54366c()) {
            throw new BluetoothException("gatt.discoverServices returned false.");
        }
    }
}
