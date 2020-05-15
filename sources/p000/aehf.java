package p000;

import com.google.android.gms.location.internal.ParcelableGeofence;

/* renamed from: aehf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aehf {

    /* renamed from: a */
    public String f63388a = null;

    /* renamed from: b */
    public int f63389b = 0;

    /* renamed from: c */
    public long f63390c = Long.MIN_VALUE;

    /* renamed from: d */
    public int f63391d = 0;

    /* renamed from: e */
    public int f63392e = -1;

    /* renamed from: f */
    private short f63393f = -1;

    /* renamed from: g */
    private double f63394g;

    /* renamed from: h */
    private double f63395h;

    /* renamed from: i */
    private float f63396i;

    /* renamed from: a */
    public final ParcelableGeofence mo34145a() {
        String str = this.f63388a;
        if (str != null) {
            int i = this.f63389b;
            if (i == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else if ((i & 4) != 0 && this.f63392e < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            } else {
                long j = this.f63390c;
                if (j == Long.MIN_VALUE) {
                    throw new IllegalArgumentException("Expiration not set.");
                } else if (this.f63393f != -1) {
                    int i2 = this.f63391d;
                    if (i2 >= 0) {
                        return new ParcelableGeofence(str, i, 1, this.f63394g, this.f63395h, this.f63396i, j, i2, this.f63392e);
                    }
                    throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                } else {
                    throw new IllegalArgumentException("Geofence region not set.");
                }
            }
        } else {
            throw new IllegalArgumentException("Request ID not set.");
        }
    }

    /* renamed from: a */
    public final void mo34146a(double d, double d2, float f) {
        this.f63393f = 1;
        this.f63394g = d;
        this.f63395h = d2;
        this.f63396i = f;
    }

    /* renamed from: b */
    public final void mo34147b() {
        this.f63390c = -1;
    }
}
