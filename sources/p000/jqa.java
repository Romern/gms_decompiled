package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import com.google.android.gms.auth.proximity.firstparty.SyncedDevicesUpdateSubscription;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: jqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jqa extends aaab {

    /* renamed from: a */
    private final rnt f23032a;

    /* renamed from: b */
    private final PendingIntent f23033b;

    /* renamed from: c */
    private final DeviceFilter f23034c;

    /* renamed from: d */
    private final String f23035d;

    static {
        jsy.m17256a("RegisterDeviceUpdates");
    }

    public jqa(rnt rnt, PendingIntent pendingIntent, DeviceFilter deviceFilter, String str) {
        super(142, "RegisterForSyncedDevicesUpdates");
        this.f23032a = rnt;
        this.f23033b = pendingIntent;
        this.f23034c = deviceFilter;
        this.f23035d = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i;
        if (jqd.m17109a(this.f23033b, this.f23035d)) {
            List b = jpx.m17092b(context);
            if (b != null) {
                i = SyncedDevicesUpdateSubscription.m6812a(b, this.f23034c);
            } else {
                i = -1;
            }
            try {
                this.f23032a.mo11797a((Status) jqw.m17133a().mo14002a(new SyncedDevicesUpdateSubscription(this.f23033b, this.f23034c, this.f23035d, i)).get());
            } catch (InterruptedException e) {
                throw new aaaj(14, "Interrupted while executing operation.");
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2.getCause());
            }
        } else {
            this.f23032a.mo11797a(Status.f30109c);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23032a.mo11797a(status);
    }
}
