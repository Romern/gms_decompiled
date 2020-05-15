package p000;

/* renamed from: bwaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bwaw implements bwbd {

    /* renamed from: a */
    private static final String f158682a = bwaw.class.getSimpleName();

    /* renamed from: b */
    private int f158683b;

    /* renamed from: c */
    volatile long f158684c = 0;

    /* renamed from: h */
    private final String m121669h() {
        int a = mo73402a();
        if (a == 7) {
            return "BILLING_POINT_REQUEST";
        }
        if (a == 15) {
            return "COOKIE_REQUEST";
        }
        if (a == 36) {
            return "LAYER_TILE_REQUEST";
        }
        if (a == 45) {
            return "STREET_VIEW_REPORT";
        }
        if (a == 50) {
            return "REVERSE_GEOCODE_REQUEST";
        }
        if (a == 62) {
            return "CLIENT_PROPERTIES_2_REQUEST";
        }
        if (a == 75) {
            return "CLIENT_PARAMETERS_REQUEST";
        }
        if (a == 108) {
            return "MAP_TILE_4_REQUEST";
        }
        if (a == 118) {
            return "INDOOR_BUILDING_REQUEST";
        }
        if (a == 132) {
            return "API_TOKEN_REQUEST";
        }
        if (a == 39) {
            return "RESOURCE_REQUEST";
        }
        if (a == 40) {
            return "STREETVIEW_REQUEST";
        }
        if (a == 147) {
            return "API_QUOTA_EVENT_REQUEST";
        }
        if (a == 148) {
            return "LAYER_METADATA_REQUEST";
        }
        StringBuilder sb = new StringBuilder(24);
        sb.append("UNKNOWN_TYPE ");
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: b */
    public boolean mo73405b() {
        throw null;
    }

    /* renamed from: c */
    public void mo73406c() {
        mo73417a("onComplete");
    }

    /* renamed from: d */
    public boolean mo73418d() {
        boolean z;
        mo73417a("onRetry");
        synchronized (this) {
            if (this.f158683b < 3) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final synchronized void mo73419e() {
        this.f158683b++;
    }

    /* renamed from: f */
    public final void mo73420f() {
        mo73417a("onPermanentFailure");
    }

    /* renamed from: g */
    public final void mo73421g() {
        if (bwam.m121655a(f158682a, 3)) {
            String valueOf = String.valueOf(m121669h());
            if (valueOf.length() == 0) {
                new String("REQUEST  type = ");
            } else {
                "REQUEST  type = ".concat(valueOf);
            }
        }
        this.f158684c = System.currentTimeMillis();
    }

    public String toString() {
        return m121669h();
    }

    public bwaw() {
        synchronized (this) {
            this.f158683b = 0;
        }
    }

    /* renamed from: a */
    public final void mo73417a(String str) {
        long currentTimeMillis = System.currentTimeMillis() - this.f158684c;
        if (this.f158684c > 0) {
            if (bwam.m121655a(f158682a, 3)) {
                String h = m121669h();
                StringBuilder sb = new StringBuilder(str.length() + 44 + String.valueOf(h).length());
                sb.append(str);
                sb.append(", ");
                sb.append(h);
                sb.append(", elapsed time (ms) = ");
                sb.append(currentTimeMillis);
                sb.toString();
            }
        } else if (bwam.m121655a(f158682a, 3)) {
            String h2 = m121669h();
            StringBuilder sb2 = new StringBuilder(str.length() + 19 + String.valueOf(h2).length());
            sb2.append(str);
            sb2.append(", ");
            sb2.append(h2);
            sb2.append(", no request time");
            sb2.toString();
        }
    }
}
