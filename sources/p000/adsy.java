package p000;

/* renamed from: adsy */
final /* synthetic */ class adsy implements Runnable {

    /* renamed from: a */
    private final adta f62675a;

    public adsy(adta adta) {
        this.f62675a = adta;
    }

    public final void run() {
        adta adta = this.f62675a;
        if (!adta.f62689g) {
            int i = adta.m51157f(adta.f62686d).getInt("db_version", -1);
            new Object[1][0] = Integer.valueOf(i);
            if (i != 3) {
                adta.m51157f(adta.f62686d).edit().putInt("db_version", 3).apply();
                new Object[1][0] = 3;
            }
            adsu.m51140a(adta.f62686d);
            adta.f62689g = true;
            adta.mo33799f();
        }
    }
}
