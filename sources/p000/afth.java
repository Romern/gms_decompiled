package p000;

/* renamed from: afth */
final /* synthetic */ class afth implements bqeh {

    /* renamed from: a */
    static final bqeh f64710a = new afth();

    private afth() {
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Exception exc = (Exception) obj;
        if (!(exc instanceof InterruptedException) && !(exc instanceof RuntimeException)) {
            exc = new afya(exc);
        }
        return bqga.m112777a((Throwable) exc);
    }
}
