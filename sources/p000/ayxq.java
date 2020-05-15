package p000;

/* renamed from: ayxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayxq {

    /* renamed from: a */
    public final ayvu f98686a;

    /* renamed from: b */
    public final ayxt f98687b;

    /* renamed from: c */
    public final ayxh f98688c = new ayxp(this);

    /* renamed from: d */
    public int f98689d = 0;

    /* renamed from: e */
    public Runnable f98690e = null;

    /* renamed from: f */
    public int f98691f = 0;

    /* renamed from: g */
    public Runnable f98692g = null;

    public ayxq(ayvu ayvu) {
        this.f98686a = ayvu;
        this.f98687b = new ayxt();
    }

    /* renamed from: a */
    public final void mo54516a() {
        if (this.f98690e == null) {
            ayxl ayxl = new ayxl(this);
            this.f98690e = ayxl;
            int i = this.f98689d;
            if (i > 0) {
                beel.m91853a(ayxl, (long) i);
            } else {
                beel.m91852a(ayxl);
            }
        }
    }

    /* renamed from: b */
    public final void mo54517b() {
        this.f98690e = null;
        ayxt ayxt = this.f98687b;
        if (!ayxt.f98704c.isEmpty() || !ayxt.f98702a.isEmpty() || !ayxt.f98703b.isEmpty() || !ayxt.f98706e.isEmpty()) {
            bljb a = blkh.m107281a("GIL:AutoProcessBatch");
            try {
                this.f98686a.mo54457a(new ayxm(this));
                if (a != null) {
                    a.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }
}
