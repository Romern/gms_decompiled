package p000;

/* renamed from: bda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bda implements bea {

    /* renamed from: a */
    public static final bda f3023a = new bda();

    /* renamed from: b */
    private static final bed f3024b = bed.m2754a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private bda() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2999a(bef bef, float f) {
        bef.mo3024c();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i = 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        while (bef.mo3026e()) {
            switch (bef.mo3019a(f3024b)) {
                case 0:
                    str = bef.mo3029h();
                    break;
                case 1:
                    str2 = bef.mo3029h();
                    break;
                case 2:
                    d = bef.mo3031j();
                    break;
                case 3:
                    int k = bef.mo3032k();
                    if (k > 2 || k < 0) {
                        i = 3;
                        break;
                    } else {
                        i = new int[]{1, 2, 3}[k];
                        break;
                    }
                case 4:
                    i2 = bef.mo3032k();
                    break;
                case 5:
                    d2 = bef.mo3031j();
                    break;
                case 6:
                    d3 = bef.mo3031j();
                    break;
                case 7:
                    i3 = bdi.m2727a(bef);
                    break;
                case 8:
                    i4 = bdi.m2727a(bef);
                    break;
                case 9:
                    d4 = bef.mo3031j();
                    break;
                case 10:
                    z = bef.mo3030i();
                    break;
                default:
                    bef.mo3028g();
                    bef.mo3033l();
                    break;
            }
        }
        bef.mo3025d();
        return new bar(str, str2, d, i, i2, d2, d3, i3, i4, d4, z);
    }
}
