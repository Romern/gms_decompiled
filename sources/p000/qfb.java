package p000;

/* renamed from: qfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfb {

    /* renamed from: a */
    private final qfc f41109a;

    /* renamed from: b */
    private qfa f41110b = null;

    /* renamed from: c */
    private Boolean f41111c = null;

    /* renamed from: d */
    private long f41112d = System.currentTimeMillis();

    public qfb(qfc qfc) {
        this.f41109a = qfc;
        qfc.mo24005a(this);
        this.f41112d = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final synchronized void mo24001a() {
        this.f41112d = 0;
    }

    /* renamed from: a */
    public final synchronized void mo24002a(qfa qfa) {
        Boolean bool = this.f41111c;
        if (bool != null) {
            qfa.mo23901a(bool.booleanValue());
        } else {
            this.f41110b = qfa;
        }
    }

    /* renamed from: a */
    public final synchronized void mo24003a(boolean z, long j) {
        if (j >= this.f41112d) {
            this.f41111c = Boolean.valueOf(z);
            this.f41109a.mo24007b(this);
            qfa qfa = this.f41110b;
            if (qfa != null) {
                qfa.mo23901a(z);
            }
        }
    }
}
