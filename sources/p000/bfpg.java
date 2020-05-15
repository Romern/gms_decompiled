package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

/* renamed from: bfpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfpg extends bfph implements PendingIntent.OnFinished {

    /* renamed from: q */
    private final PendingIntent f114759q;

    /* renamed from: r */
    private final asfb f114760r;

    public bfpg(Context context, int i, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, bfpd bfpd, PendingIntent pendingIntent) {
        super(context, i, str, locationRequestInternal, z, z2, bfpd);
        this.f114759q = pendingIntent;
        asfb asfb = new asfb(context, 1, "GCoreFlp", "FlpClientPendingIntent", "com.google.android.gms");
        this.f114760r = asfb;
        asfb.mo49115a(true);
        if (stx.m36339a(context)) {
            this.f114760r.mo49121c(saq.m34797a(this.f114767c.f79421c));
        }
    }

    /* renamed from: a */
    private final int m97479a(List list, LocationAvailability locationAvailability) {
        String str;
        Intent intent = new Intent();
        int i = this.f114770f;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            if (i >= 7323000) {
                intent.putExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT", LocationResult.m66865a(list));
            }
            intent.putExtra("com.google.android.location.LOCATION", (Location) list.get(list.size() - 1));
            z = true;
        }
        if (locationAvailability != null && i >= 7323000) {
            intent.putExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY", locationAvailability);
        } else if (!z) {
            return 1;
        }
        this.f114760r.mo49111a(10000);
        try {
            if (!this.f114768d) {
                str = "android.permission.ACCESS_COARSE_LOCATION";
            } else {
                str = "android.permission.ACCESS_FINE_LOCATION";
            }
            sse.m36203a(this.f114759q, this.f114778n, intent, this, str);
            return 1;
        } catch (PendingIntent.CanceledException e) {
            m97480d();
            return 3;
        }
    }

    /* renamed from: d */
    private final void m97480d() {
        synchronized (this.f114760r) {
            if (this.f114760r.mo49124e()) {
                try {
                    this.f114760r.mo49120c();
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("exception when releasing wakelock ");
                    sb.append(valueOf);
                    Log.e("GCoreFlp", sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo62086a() {
        return true;
    }

    /* renamed from: b */
    public final void mo62087b() {
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        m97480d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo62084a(LocationAvailability locationAvailability) {
        return m97479a(null, locationAvailability);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo62085a(List list) {
        return m97479a(list, null);
    }
}
