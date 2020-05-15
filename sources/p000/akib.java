package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.sharing.utils.BluetoothUtils$1;
import java.util.concurrent.Callable;

/* renamed from: akib */
final /* synthetic */ class akib implements Callable {

    /* renamed from: a */
    private final Context f72048a;

    /* renamed from: b */
    private final BluetoothAdapter f72049b;

    public akib(Context context, BluetoothAdapter bluetoothAdapter) {
        this.f72048a = context;
        this.f72049b = bluetoothAdapter;
    }

    public final Object call() {
        Context context = this.f72048a;
        BluetoothAdapter bluetoothAdapter = this.f72049b;
        bqgy c = bqgy.m112818c();
        BluetoothUtils$1 bluetoothUtils$1 = new BluetoothUtils$1("nearby", c);
        context.registerReceiver(bluetoothUtils$1, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        if (!bluetoothAdapter.enable()) {
            c.mo69136a((Throwable) new Exception("Bluetooth Service denied the enable request."));
        }
        boolean b = ahhf.m55777b("enableBluetooth", c, 3000);
        ahhd.m55766a(context, bluetoothUtils$1);
        if (b || bluetoothAdapter.isEnabled()) {
            return null;
        }
        throw new Exception("Got exception when turning on bluetooth.");
    }
}
