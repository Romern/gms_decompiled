package p000;

import android.bluetooth.BluetoothDevice;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;

/* renamed from: aidu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aidu extends aidy {

    /* renamed from: a */
    final /* synthetic */ OnEndpointFoundParams f68811a;

    public aidu(OnEndpointFoundParams onEndpointFoundParams) {
        this.f68811a = onEndpointFoundParams;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11649a(Object obj) {
        ahin ahin = (ahin) obj;
        if (!aidx.m57058b(this.f68811a)) {
            String str = this.f68811a.f80590a;
            ahii ahii = new ahii();
            OnEndpointFoundParams onEndpointFoundParams = this.f68811a;
            ahii.f67238a = onEndpointFoundParams.f80591b;
            ahii.f67239b = onEndpointFoundParams.f80592c;
            ahii.f67240c = onEndpointFoundParams.f80594e;
            ahin.mo20147a(str, ahii.mo36533a());
            return;
        }
        ahii ahii2 = new ahii();
        OnEndpointFoundParams onEndpointFoundParams2 = this.f68811a;
        ahii2.f67238a = onEndpointFoundParams2.f80591b;
        BluetoothDevice bluetoothDevice = onEndpointFoundParams2.f80593d;
        ahii2.f67239b = "__UNRECOGNIZED_BLUETOOTH_DEVICE__";
        ahii2.f67240c = "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
        ahin.mo20147a("__UNRECOGNIZED_BLUETOOTH_DEVICE__", ahii2.mo36533a());
    }
}
