package p000;

/* renamed from: ahcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahcs {

    /* renamed from: a */
    final /* synthetic */ ahct f67005a;

    /* renamed from: b */
    private final long f67006b;

    /* renamed from: c */
    private boolean f67007c;

    /* renamed from: d */
    private final Runnable f67008d = new ahcr(this);

    public ahcs(ahct ahct, long j) {
        this.f67005a = ahct;
        this.f67006b = j;
        this.f67007c = false;
    }

    /* renamed from: a */
    public final synchronized void mo36312a() {
        bnsp bnsp = ahct.f67009a;
        if (this.f67005a.mo36321c()) {
            ahct ahct = this.f67005a;
            if (ahct.f67013e == 2) {
                ahct.f67017i.postDelayed(this.f67008d, this.f67006b);
            }
        }
        this.f67007c = true;
    }

    /* renamed from: b */
    public final synchronized void mo36313b() {
        bnsp bnsp = ahct.f67009a;
        if (this.f67007c) {
            if (this.f67005a.mo36321c()) {
                ahct ahct = this.f67005a;
                if (ahct.f67013e == 2) {
                    ahct.f67017i.removeCallbacks(this.f67008d);
                }
            }
            this.f67007c = false;
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo36314c() {
        return this.f67007c;
    }
}
