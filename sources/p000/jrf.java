package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import com.google.android.gms.auth.proximity.firstparty.SyncedDevicesUpdateSubscription;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: jrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jrf extends aaab {

    /* renamed from: a */
    private final rnt f23122a;

    /* renamed from: b */
    private final PendingIntent f23123b;

    /* renamed from: c */
    private final DeviceFilter f23124c;

    /* renamed from: d */
    private final String f23125d;

    static {
        jsy.m17256a("UnregisterDeviceUpdates");
    }

    public jrf(rnt rnt, PendingIntent pendingIntent, DeviceFilter deviceFilter, String str) {
        super(142, "UnregisterForSyncedDevicesUpdates");
        this.f23122a = rnt;
        this.f23123b = pendingIntent;
        this.f23124c = deviceFilter;
        this.f23125d = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!jqd.m17109a(this.f23123b, this.f23125d)) {
            this.f23122a.mo11797a(Status.f30109c);
            return;
        }
        try {
            this.f23122a.mo11797a((Status) jqw.m17133a().mo14005b(new SyncedDevicesUpdateSubscription(this.f23123b, this.f23124c, this.f23125d, -1)).get());
        } catch (InterruptedException e) {
            throw new aaaj(14, "Interrupted while executing operation.");
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23122a.mo11797a(status);
    }
}
