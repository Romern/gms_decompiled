package p000;

import android.content.Context;

/* renamed from: aloh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aloh extends amqd {

    /* renamed from: a */
    private final String f73939a;

    /* renamed from: b */
    private final String f73940b;

    /* renamed from: c */
    private final String f73941c;

    /* renamed from: d */
    private final long f73942d;

    /* renamed from: e */
    private final boolean f73943e;

    /* renamed from: f */
    private final boolean f73944f;

    /* renamed from: g */
    private final boolean f73945g = cfyx.m143985b();

    /* renamed from: b */
    public final void mo40603b(Context context) {
        boolean z;
        almh almh;
        int i;
        almh almh2;
        altq a = altq.m61806a(context);
        String str = this.f73939a;
        if (altn.m61774a(a.f74246b).mo40738a(str, null) < 0) {
            a.mo40774g();
            if (altn.m61774a(a.f74246b).mo40738a(str, null) < 0) {
                if (this.f73945g && (almh2 = this.f75735r) != null) {
                    almh2.mo40510b(3, 0);
                    return;
                }
                return;
            }
        }
        amea a2 = amea.m62724a(context);
        if (this.f73943e) {
            if (this.f73945g) {
                z = a2.mo41144a(this.f73939a, this.f73940b, this.f73941c, this.f75728i, this.f73944f, "by client (ua)");
            } else {
                a2.mo41144a(this.f73939a, this.f73940b, this.f73941c, this.f75728i, this.f73944f, "by client (ua)");
                z = false;
            }
        } else if (this.f73945g) {
            z = a2.mo41143a(this.f73939a, this.f73940b, this.f73942d, this.f73941c, this.f75728i, this.f73944f, "by client (non-ua)");
        } else {
            a2.mo41143a(this.f73939a, this.f73940b, this.f73942d, this.f73941c, this.f75728i, this.f73944f, "by client (non-ua)");
            z = false;
        }
        if (this.f73945g && (almh = this.f75735r) != null) {
            if (!z) {
                i = 8;
            } else {
                i = 2;
            }
            almh.mo40510b(i, 0);
        }
    }

    public aloh(String str, int i, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        super(str, i, str3, "RequestSync", null);
        this.f73939a = str3;
        this.f73940b = str4;
        this.f73941c = str2;
        this.f73942d = j;
        this.f73943e = z;
        this.f73944f = z2;
    }
}
