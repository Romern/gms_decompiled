package p000;

import java.util.Random;

/* renamed from: bbvv */
final /* synthetic */ class bbvv implements bmxj {

    /* renamed from: a */
    private final Random f103546a;

    public bbvv(Random random) {
        this.f103546a = random;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(this.f103546a.nextInt(((Integer) obj).intValue()));
    }
}
