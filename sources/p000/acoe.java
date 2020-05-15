package p000;

/* renamed from: acoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acoe {

    /* renamed from: b */
    private static acoe f60324b;

    /* renamed from: a */
    public final snf f60325a;

    public acoe(snf snf) {
        this.f60325a = snf;
    }

    /* renamed from: a */
    public static synchronized acoe m49588a() {
        acoe acoe;
        synchronized (acoe.class) {
            if (f60324b == null) {
                f60324b = new acoe(snp.m35703a(1, 10));
            }
            acoe = f60324b;
        }
        return acoe;
    }

    /* renamed from: a */
    public static Runnable m49589a(String str, Runnable runnable) {
        return new acod(runnable, str);
    }

    /* renamed from: a */
    public final void mo32944a(Runnable runnable) {
        this.f60325a.execute(runnable);
    }
}
