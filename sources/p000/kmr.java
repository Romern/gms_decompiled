package p000;

import java.util.ArrayDeque;

/* renamed from: kmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmr implements klq {

    /* renamed from: a */
    public static final kjy f24479a = new kjy();

    /* renamed from: b */
    public static final kjy f24480b = new kjy(0, 0, 1, 1);

    /* renamed from: c */
    public final boolean f24481c;

    public kmr(boolean z) {
        this.f24481c = z;
    }

    /* renamed from: a */
    public static void m18175a(kjy kjy) {
        kjy.f24286b = 0;
        kjy.f24288d = 1;
    }

    /* renamed from: a */
    public static boolean m18176a(kom kom, kmq kmq) {
        Boolean bool = (Boolean) kmq.f24478a.get(kom);
        boolean z = false;
        if (bool != null && bool.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z).booleanValue();
    }

    /* renamed from: a */
    public final klp mo14682a(koq koq) {
        kom kom = koq.f24634b;
        kmq kmq = new kmq();
        ArrayDeque arrayDeque = new ArrayDeque();
        kmo kmo = new kmo(arrayDeque);
        kow.m18271a(kom, new kov(kmo, kmq), new kmp(arrayDeque));
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        bngs j3 = bngx.m109377j();
        kow.m18270a(koq.f24634b, new kmn(this, j, kmq, j2, j3));
        return new klp(j2.mo67664a(), j.mo67664a(), j3.mo67664a());
    }
}
