package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.utils.bluetooth.BluetoothController$1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ascx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascx {

    /* renamed from: b */
    public static final /* synthetic */ int f88714b = 0;

    /* renamed from: c */
    private static final sek f88715c = ascp.m73787a("Utils", "Bluetooth", "BluetoothController");

    /* renamed from: a */
    public final ascv f88716a;

    /* renamed from: d */
    private final Context f88717d;

    /* renamed from: e */
    private boolean f88718e = false;

    /* renamed from: a */
    public static void m73806a(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            f88715c.mo25410a((Throwable) e);
        }
    }

    /* renamed from: b */
    public final void mo49052b() {
        ascv ascv = this.f88716a;
        if (ascv != null && this.f88718e) {
            this.f88718e = false;
            ascv.mo49050e();
        }
    }

    public ascx(Context context, ascv ascv) {
        this.f88717d = context;
        this.f88716a = ascv;
    }

    /* renamed from: a */
    public final Status mo49051a() {
        ascv ascv = this.f88716a;
        if (ascv == null) {
            this.f88718e = false;
            f88715c.mo25418e("btAdapter was null: Bluetooth unavailable.", new Object[0]);
            return new Status(10550);
        } else if (ascv.mo49047b()) {
            return Status.f30107a;
        } else {
            this.f88718e = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            BluetoothController$1 bluetoothController$1 = new BluetoothController$1(this, "smartdevice", countDownLatch);
            this.f88717d.registerReceiver(bluetoothController$1, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            if (this.f88716a.mo49048c()) {
                try {
                    if (countDownLatch.await(10, TimeUnit.SECONDS)) {
                        if (this.f88716a.mo49047b()) {
                            return Status.f30107a;
                        }
                        return new Status(10550);
                    }
                } catch (InterruptedException e) {
                    f88715c.mo25408a("Interrupted", e, new Object[0]);
                }
                f88715c.mo25409a("Bluetooth initialization took longer than %d seconds", 10);
                m73806a(this.f88717d, bluetoothController$1);
                return new Status(10550);
            }
            m73806a(this.f88717d, bluetoothController$1);
            return new Status(10550);
        }
    }
}
