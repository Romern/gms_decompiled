package p000;

/* renamed from: bgqa */
final /* synthetic */ class bgqa implements Runnable {

    /* renamed from: a */
    private final bgqc f117259a;

    /* renamed from: b */
    private final long f117260b;

    /* renamed from: c */
    private final bgqb f117261c;

    public bgqa(bgqc bgqc, long j, bgqb bgqb) {
        this.f117259a = bgqc;
        this.f117260b = j;
        this.f117261c = bgqb;
    }

    public final void run() {
        bgqc bgqc = this.f117259a;
        long j = this.f117260b;
        bgqb bgqb = this.f117261c;
        String d = ayvd.m84918d(j);
        bgqc.mo63095d();
        bgqc.mo25556a("x-goog-skey", d);
        try {
            bgqb.mo63091a();
        } catch (chuw | gid e) {
        } catch (Throwable th) {
            bgqc.mo63095d();
            throw th;
        }
        bgqc.mo63095d();
    }
}
