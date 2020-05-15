package p000;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;

/* renamed from: pjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pjw implements pik {

    /* renamed from: a */
    final /* synthetic */ pjx f39399a;

    public pjw(pjx pjx) {
        this.f39399a = pjx;
    }

    /* renamed from: a */
    public final void mo23181a(int i) {
        pjx pjx = this.f39399a;
        if (pjx.f39413p == 4) {
            pjx.f39400c.mo23856a("Failed to reconnecting to the endpoint of %s", this.f39399a.f39230a);
            this.f39399a.mo23284a(i);
            return;
        }
        pjx.f39409l.f39236e.mo23181a(i);
        this.f39399a.f39413p = 1;
    }

    /* renamed from: b */
    public final void mo23192b(int i) {
        pjx.f39400c.mo23677d("CastSessionController.onConnectionSuspended() should never be called", new Object[0]);
    }

    /* renamed from: bm */
    public final void mo23194bm() {
        this.f39399a.f39409l.f39236e.mo23194bm();
    }

    /* renamed from: c */
    public final void mo23195c(int i) {
        if (i == 0) {
            this.f39399a.mo23289k();
            pjx pjx = this.f39399a;
            pjx.f39413p = 1;
            pjx.mo23286h();
            this.f39399a.f39409l.f39236e.mo23195c(0);
            return;
        }
        pjx pjx2 = this.f39399a;
        pjc pjc = pjx2.f39404g;
        if (pjc != null) {
            CastDevice castDevice = pjc.f39230a;
            pjx2.mo23286h();
            pjx2.f39413p = 4;
            pjx2.f39409l.f39236e.mo23192b(i);
            pjx2.mo23285a(castDevice, castDevice.f29723k);
            return;
        }
        pjx.f39400c.mo23675c("No active connection. Suspension should not happen.", new Object[0]);
    }

    /* renamed from: d */
    public final void mo23196d(int i) {
        pjx pjx = this.f39399a;
        if (pjx.f39413p == 4) {
            pjx.f39400c.mo23857a("%s failed to join the app on the new endpoint device. Error: %d ", this.f39399a.f39230a, Integer.valueOf(i));
            this.f39399a.mo23284a(i);
            return;
        }
        pjx.f39409l.f39236e.mo23196d(i);
    }

    /* renamed from: e */
    public final void mo23197e(int i) {
        this.f39399a.f39409l.f39236e.mo23197e(i);
    }

    /* renamed from: b */
    public final void mo23193b(String str, String str2) {
        this.f39399a.f39409l.f39236e.mo23193b(str, str2);
    }

    /* renamed from: a */
    public final void mo23182a(int i, String str) {
        this.f39399a.mo23289k();
        this.f39399a.f39409l.f39236e.mo23182a(i, str);
    }

    /* renamed from: a */
    public final void mo23183a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        pjx pjx = this.f39399a;
        pjx.f39411n = applicationMetadata.f29706a;
        pjx.f39412o = str2;
        pjx.f39401d.mo23457a(str2, pjx, pjx.f39411n);
        pjx pjx2 = this.f39399a;
        if (pjx2.f39413p == 4) {
            pjx.f39400c.mo23856a("%s successfully joined the app on the new endpoint device.", this.f39399a.f39230a);
            this.f39399a.mo23287i();
            this.f39399a.f39409l.f39236e.mo23191a(true);
            this.f39399a.f39413p = 3;
            return;
        }
        pjx2.f39409l.f39236e.mo23183a(applicationMetadata, str, str2, z);
    }

    /* renamed from: a */
    public final void mo23184a(ApplicationStatus applicationStatus) {
        this.f39399a.f39409l.f39236e.mo23184a(applicationStatus);
    }

    /* renamed from: a */
    public final void mo23185a(DeviceStatus deviceStatus) {
        pjx pjx = this.f39399a;
        if (pjx.f39413p == 4) {
            ApplicationMetadata applicationMetadata = deviceStatus.f29891d;
            if (applicationMetadata != null && applicationMetadata.f29706a.equals(pjx.f39411n)) {
                pjx.f39400c.mo23856a(" %s's endpoint device is running the desired app now. Connecting to it", this.f39399a.f39230a);
                JoinOptions joinOptions = new JoinOptions();
                joinOptions.mo17516a(2);
                pjx pjx2 = this.f39399a;
                pjx2.f39404g.mo23205a(pjx2.f39411n, pjx2.f39412o, joinOptions);
                return;
            }
            return;
        }
        pjx.f39409l.f39236e.mo23185a(deviceStatus);
    }

    /* renamed from: a */
    public final void mo23186a(String str, double d, boolean z) {
        this.f39399a.f39409l.f39236e.mo23186a(str, d, z);
    }

    /* renamed from: a */
    public final void mo23187a(String str, long j) {
        this.f39399a.f39409l.f39236e.mo23187a(str, j);
    }

    /* renamed from: a */
    public final void mo23188a(String str, long j, int i) {
        this.f39399a.f39409l.f39236e.mo23188a(str, j, i);
    }

    /* renamed from: a */
    public final void mo23189a(String str, String str2) {
        this.f39399a.f39409l.f39236e.mo23189a(str, str2);
    }

    /* renamed from: a */
    public final void mo23190a(String str, byte[] bArr) {
        this.f39399a.f39409l.f39236e.mo23190a(str, bArr);
    }

    /* renamed from: a */
    public final void mo23191a(boolean z) {
        pjx pjx = this.f39399a;
        if (pjx.f39413p == 4) {
            for (String str : pjx.f39408k) {
                this.f39399a.f39404g.mo23200a(str);
            }
            this.f39399a.f39404g.mo23216f();
            pjx pjx2 = this.f39399a;
            if (pjx2.f39412o == null && pjx2.f39411n == null) {
                pjx2.f39409l.f39236e.mo23191a(z);
                this.f39399a.f39413p = 3;
                return;
            }
            return;
        }
        pjx.f39409l.f39236e.mo23191a(z);
        this.f39399a.f39413p = 3;
    }
}
