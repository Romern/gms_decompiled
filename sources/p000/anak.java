package p000;

/* renamed from: anak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anak {

    /* renamed from: a */
    public Thread f76484a;

    /* renamed from: b */
    public final anai f76485b;

    /* renamed from: c */
    public final anaq f76486c;

    /* renamed from: d */
    public final amvm f76487d;

    public anak(anai anai, amvm amvm, anaq anaq) {
        this.f76485b = anai;
        this.f76487d = amvm;
        this.f76486c = anaq;
    }

    /* renamed from: a */
    public final void mo41594a() {
        Thread thread = this.f76484a;
        if (thread != null) {
            amdk.m62658a("FSA2_AsyncDataPopulator", "Thread was not removed correctly: %d", Long.valueOf(thread.getId()));
            this.f76484a = null;
        }
        this.f76485b.getClass().getSimpleName();
        Thread thread2 = new Thread(new anaj(this));
        this.f76484a = thread2;
        thread2.getId();
        this.f76487d.mo41391a(this.f76484a);
        this.f76484a.start();
    }
}
