package p000;

/* renamed from: jls */
final /* synthetic */ class jls implements Runnable {

    /* renamed from: a */
    private final jma f22765a;

    /* renamed from: b */
    private final int f22766b;

    /* renamed from: c */
    private final jnz f22767c;

    public jls(jma jma, int i, jnz jnz) {
        this.f22765a = jma;
        this.f22766b = i;
        this.f22767c = jnz;
    }

    public final void run() {
        jma jma = this.f22765a;
        int i = this.f22766b;
        jnz jnz = this.f22767c;
        synchronized (jma.f22789c) {
            jma.f22804r.add(new jlz(i, jnz));
        }
        jma.mo13873h();
    }
}
