package p000;

import android.util.Log;
import com.google.android.gms.gcm.DataMessageManager$BroadcastDoneReceiver;

/* renamed from: aajr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aajr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DataMessageManager$BroadcastDoneReceiver f28297a;

    public aajr(DataMessageManager$BroadcastDoneReceiver dataMessageManager$BroadcastDoneReceiver) {
        this.f28297a = dataMessageManager$BroadcastDoneReceiver;
    }

    public final void run() {
        DataMessageManager$BroadcastDoneReceiver dataMessageManager$BroadcastDoneReceiver = this.f28297a;
        dataMessageManager$BroadcastDoneReceiver.f32769a.mo50393b((Object) null);
        if (dataMessageManager$BroadcastDoneReceiver.mo19552a()) {
            Log.w("GCM", "Force release of GOOGLE_C2DM lock");
        }
    }
}
