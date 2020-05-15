package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService;

/* renamed from: aeuk */
public final /* synthetic */ class aeuk implements Runnable {

    /* renamed from: a */
    private final GcmReceiverChimeraService f63839a;

    /* renamed from: b */
    private final PendingIntent f63840b;

    /* renamed from: c */
    private final BroadcastReceiver f63841c;

    public aeuk(GcmReceiverChimeraService gcmReceiverChimeraService, PendingIntent pendingIntent, BroadcastReceiver broadcastReceiver) {
        this.f63839a = gcmReceiverChimeraService;
        this.f63840b = pendingIntent;
        this.f63841c = broadcastReceiver;
    }

    public final void run() {
        GcmReceiverChimeraService gcmReceiverChimeraService = this.f63839a;
        PendingIntent pendingIntent = this.f63840b;
        BroadcastReceiver broadcastReceiver = this.f63841c;
        gcmReceiverChimeraService.f79677e.mo24679a(pendingIntent);
        gcmReceiverChimeraService.unregisterReceiver(broadcastReceiver);
    }
}
