package p000;

/* renamed from: bsbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bsbd extends bsbb {

    /* renamed from: d */
    private long f143930d = 0;

    /* renamed from: e */
    private long f143931e = -1;

    /* renamed from: f */
    private long f143932f = -1;

    /* renamed from: a */
    public final synchronized void mo70159a(long j) {
        boolean z = true;
        bsbe.m115042a("delay", j >= 0);
        if (this.f143932f != -1) {
            z = false;
        }
        bsbe.m115042a("scheduled", z);
        this.f143930d = j;
    }

    /* renamed from: b */
    public final synchronized void mo70160b(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        bsbe.m115042a("deadline", z);
        long j2 = this.f143932f;
        if (j2 != -1) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("values not equal, expected [-1] but got [");
            sb.append(j2);
            sb.append("]");
            bsbe.m115041a("scheduled", sb.toString());
        }
        this.f143931e = j;
    }

    /* renamed from: c */
    public final void mo70152c() {
        synchronized (this) {
            this.f143932f = -1;
        }
        super.mo70152c();
        this.f143921a.mo70155a(this);
    }

    /* renamed from: d */
    public final synchronized void mo70153d() {
        if (this.f143921a.mo70156b(this) || this.f143932f != -1) {
            this.f143932f = -1;
        }
    }

    /* renamed from: e */
    public final synchronized void mo70154e() {
        if (this.f143932f != -1) {
            bsbc bsbc = this.f143921a;
            synchronized (bsbc.f143926c) {
                bsbe.m115044b(bsbc.f143925b.contains(this));
                long g = mo70162g();
                int size = bsbc.f143925b.size();
                int i = 0;
                while (i < size) {
                    int i2 = (i + size) / 2;
                    if (g >= ((bsbd) bsbc.f143925b.elementAt(i2)).mo70162g()) {
                        i = i2 + 1;
                    } else {
                        size = i2;
                    }
                }
                bsbc.f143925b.insertElementAt(this, i);
                this.f143923c = 1;
                bsbc.f143926c.notifyAll();
            }
        }
    }

    /* renamed from: f */
    public final void mo70161f() {
        synchronized (this) {
            if (this.f143932f == -1) {
                long j = this.f143931e;
                if (j != -1) {
                    this.f143932f = j + this.f143930d;
                } else {
                    this.f143932f = System.currentTimeMillis() + this.f143930d;
                }
            }
        }
        this.f143921a.mo70155a(this);
    }

    /* renamed from: g */
    public final synchronized long mo70162g() {
        return this.f143932f;
    }

    public bsbd(bsbc bsbc, Runnable runnable) {
        super(bsbc, runnable);
    }
}
