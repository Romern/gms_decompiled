package p000;

import java.util.Random;

/* renamed from: bsfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfp extends bsgd {

    /* renamed from: a */
    private final Random f144492a;

    public bsfp(bsgh bsgh) {
        this.f144492a = bsgh.mo70530b();
    }

    /* renamed from: a */
    public final void mo70512a(bsft bsft) {
        bsft.f144501b[2] = this.f144492a.nextDouble() * 6.283185307179586d;
    }
}
