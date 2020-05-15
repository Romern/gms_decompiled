package p000;

/* renamed from: mlu */
final /* synthetic */ class mlu implements Runnable {

    /* renamed from: a */
    private final mlx f33974a;

    public mlu(mlx mlx) {
        this.f33974a = mlx;
    }

    public final void run() {
        mlx mlx = this.f33974a;
        int a = mlx.f33979e.mo20152a();
        for (int i = 0; ((long) i) < ((Long) mlx.f33980f.mo6606a()).longValue() && a != 0 && a != 1 && a != 2; i++) {
            a = mlx.f33979e.mo20152a();
        }
        mlx.f33842b.execute(new mlv(mlx, a));
        synchronized (mlx) {
            mlx.f33981g = null;
        }
    }
}
