package p000;

import android.bluetooth.BluetoothGattService;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;

/* renamed from: ayra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayra extends ayta {

    /* renamed from: a */
    final /* synthetic */ ayri f98317a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayra(ayri ayri, Object... objArr) {
        super(objArr);
        this.f98317a = ayri;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54308b() {
        boolean z;
        BluetoothGattService a;
        BluetoothGattService a2;
        if (this.f98317a.f98339g) {
            return null;
        }
        try {
            this.f98317a.mo54314b();
            z = false;
        } catch (BluetoothException e) {
            int i = Build.VERSION.SDK_INT;
            if (e instanceof BluetoothGattException) {
                int i2 = ((BluetoothGattException) e).f111041a;
                if (i2 == 133 || i2 == 129) {
                    Log.e(ayri.f98333a, String.valueOf(e.getMessage()).concat("\n Ignore the gatt error for post MNC apis and force a refresh"));
                    z = true;
                } else {
                    throw e;
                }
            } else {
                throw e;
            }
        }
        ayri ayri = this.f98317a;
        if (ayri.f98336d.mo54358a().mo54349a() == 12 && (z || !(((a = ayri.f98336d.mo54357a(aync.f98003a)) == null || a.getCharacteristic(ayna.f98001a) == null) && ((a2 = ayri.f98336d.mo54357a(aymz.f97999a)) == null || a2.getCharacteristic(aymz.f98000b) == null)))) {
            Log.i(ayri.f98333a, "Forcing a refresh of local cache of GATT services");
            if (ayri.f98336d.mo54367d()) {
                ayri.mo54314b();
            } else {
                throw new BluetoothException("gatt.refresh returned false.");
            }
        }
        this.f98317a.f98339g = true;
        return null;
    }
}
