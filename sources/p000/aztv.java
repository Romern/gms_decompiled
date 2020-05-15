package p000;

/* renamed from: aztv */
final /* synthetic */ class aztv implements bmxj {

    /* renamed from: a */
    private final int f100031a;

    public aztv(int i) {
        this.f100031a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f100031a;
        Boolean bool = (Boolean) obj;
        boolean z = true;
        Boolean bool2 = true;
        if (i == 4) {
            bool2 = Boolean.valueOf(cfeo.m138890u());
        } else if (i == 5) {
            bool2 = Boolean.valueOf(cfgs.m139410p());
        } else if (i == 8) {
            bool2 = Boolean.valueOf(cfgs.m139411q());
        }
        if (!bool.booleanValue() || !bool2.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
