package p000;

import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.stats.AlarmEvent;
import com.google.android.gms.common.stats.StatsEvent;
import com.google.android.gms.common.stats.WakeLockEvent;

/* renamed from: skp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class skp extends snr {

    /* renamed from: a */
    private final slf f44640a = slf.m35566a();

    public skp(sns sns) {
        super(sns);
    }

    public final void handleMessage(Message message) {
        if (message.what == 0) {
            SafeParcelable safeParcelable = (SafeParcelable) ((Intent) message.obj).getParcelableExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT");
            if (safeParcelable == null) {
                Log.w("GmsCoreStatsService", "Unable to get StatsEventParcelable.");
            } else if (safeParcelable instanceof StatsEvent) {
                StatsEvent statsEvent = (StatsEvent) safeParcelable;
                slf slf = this.f44640a;
                if (statsEvent instanceof WakeLockEvent) {
                    slf.mo25705a((WakeLockEvent) statsEvent);
                }
            } else if (safeParcelable instanceof AlarmEvent) {
                this.f44640a.mo25704a((AlarmEvent) safeParcelable);
            }
        }
    }
}
