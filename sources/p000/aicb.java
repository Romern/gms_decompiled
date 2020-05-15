package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aicb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aicb extends buqn {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f68661a;

    /* renamed from: b */
    final /* synthetic */ aics f68662b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aicb(aics aics, String str, BluetoothDevice bluetoothDevice) {
        super(str);
        this.f68662b = aics;
        this.f68661a = bluetoothDevice;
    }

    public final void run() {
        int a = buqx.m120256a(this.f68661a.getAddress());
        String b = buqx.m120261b(this.f68661a.getAddress());
        if (cfoj.f184966a.mo6606a().mo82157bn() && b != null && a >= 0 && a <= 100) {
            Context context = this.f68662b.f68708e;
            Toast.makeText(context, context.getString(C0126R.string.fast_pair_battery_remaining, b, Integer.valueOf(a)), (int) cfog.f184854a.mo6606a().mo82030h()).show();
            this.f68662b.f68709f.mo37011a(bvin.BLUETOOTH_BATTERY_LEVEL_TOAST_SHOWN);
        }
    }
}
