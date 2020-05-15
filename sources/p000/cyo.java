package p000;

/* renamed from: cyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cyo implements cwe {

    /* renamed from: a */
    final /* synthetic */ int f12396a;

    /* renamed from: b */
    final /* synthetic */ int f12397b;

    public cyo(int i, int i2) {
        this.f12396a = i;
        this.f12397b = i2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8353a(Object obj) {
        double parseLong = (double) (Long.parseLong(cvz.m7733h((byte[]) obj)) * ((long) this.f12396a));
        double pow = Math.pow(10.0d, (double) this.f12397b);
        Double.isNaN(parseLong);
        return Long.valueOf((long) (parseLong * pow));
    }
}
