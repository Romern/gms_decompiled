package p000;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.Locale;

/* renamed from: bfed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfed extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bfee f113559a;

    protected bfed(bfee bfee) {
        this.f113559a = bfee;
    }

    public final void onReceive(Context context, Intent intent) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bhdb bhdb = this.f113559a.f113804g;
        Locale locale = Locale.US;
        new Object[1][0] = intent;
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            bfee bfee = this.f113559a;
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
            Locale locale2 = Locale.US;
            Object[] objArr = {Integer.valueOf(intExtra), Integer.valueOf(intExtra2)};
            bfee.f113805h.f113606a.mo61587a(bfee.m96492a(intExtra), bfee.m96492a(intExtra2), elapsedRealtime);
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (parcelableExtra != null) {
            int i = Build.VERSION.SDK_INT;
            bgny bgny = new bgny((BluetoothDevice) parcelableExtra);
            if ("android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction())) {
                this.f113559a.mo61528a(bgny, 1, elapsedRealtime);
            } else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
                this.f113559a.mo61528a(bgny, 2, elapsedRealtime);
            } else if ("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED".equals(intent.getAction())) {
                this.f113559a.mo61528a(bgny, 3, elapsedRealtime);
            } else {
                bhdb bhdb2 = this.f113559a.f113804g;
                String action = intent.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 31);
                sb.append("Received unknown event ");
                sb.append(action);
                sb.append(", ignore");
                sb.toString();
            }
        }
    }
}
