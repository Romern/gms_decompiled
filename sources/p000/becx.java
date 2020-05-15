package p000;

import android.bluetooth.BluetoothGattService;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;

/* renamed from: becx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class becx extends ayta {

    /* renamed from: a */
    final /* synthetic */ bede f106921a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public becx(bede bede, Object... objArr) {
        super(objArr);
        this.f106921a = bede;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54308b() {
        boolean z;
        BluetoothGattService a;
        BluetoothGattService a2;
        if (this.f106921a.f106937c) {
            return null;
        }
        try {
            this.f106921a.mo58568b();
            z = false;
        } catch (BluetoothException e) {
            int i = Build.VERSION.SDK_INT;
            if (e instanceof BluetoothGattException) {
                int i2 = ((BluetoothGattException) e).f111041a;
                if (i2 == 133 || i2 == 129) {
                    Log.e("Coffee-BluetoothGattConnection", String.valueOf(e.getMessage()).concat("\n Ignore the gatt error for post MNC apis and force a refresh"));
                    z = true;
                } else {
                    throw e;
                }
            } else {
                throw e;
            }
        }
        bede bede = this.f106921a;
        if (bede.f106939e.mo54358a().mo54349a() == 12) {
            StringBuilder sb = new StringBuilder(19);
            sb.append("forceRefresh: ");
            sb.append(z);
            sb.toString();
            if (z || !(((a = bede.f106939e.mo54357a(aync.f98003a)) == null || a.getCharacteristic(ayna.f98001a) == null) && ((a2 = bede.f106939e.mo54357a(aymz.f97999a)) == null || a2.getCharacteristic(aymz.f98000b) == null))) {
                Log.i("Coffee-BluetoothGattConnection", "Forcing a refresh of local cache of GATT services");
                if (bede.f106939e.mo54367d()) {
                    int i3 = Build.VERSION.SDK_INT;
                    Log.i("Coffee-BluetoothGattConnection", "sleep 1 sec");
                    SystemClock.sleep(1000);
                    bede.mo58568b();
                } else {
                    throw new BluetoothException("gatt.refresh returned false.");
                }
            }
        }
        this.f106921a.f106937c = true;
        return null;
    }
}
