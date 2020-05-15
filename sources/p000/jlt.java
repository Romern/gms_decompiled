package p000;

/* renamed from: jlt */
final /* synthetic */ class jlt implements Runnable {

    /* renamed from: a */
    private final jma f22768a;

    /* renamed from: b */
    private final int f22769b;

    /* renamed from: c */
    private final jnz f22770c;

    /* renamed from: d */
    private final int f22771d;

    public jlt(jma jma, int i, jnz jnz, int i2) {
        this.f22768a = jma;
        this.f22769b = i;
        this.f22770c = jnz;
        this.f22771d = i2;
    }

    public final void run() {
        jma jma = this.f22768a;
        int i = this.f22769b;
        jnz jnz = this.f22770c;
        int i2 = this.f22771d;
        synchronized (jma.f22789c) {
            jma.f22804r.add(new jlz(i, jnz, i2));
        }
        jma.mo13873h();
    }
}
