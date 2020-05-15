package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: fbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum fbs {
    INSTANT(0, 0),
    PUSH(C0126R.anim.as_slide_in_from_end, C0126R.anim.as_stay_put, true),
    POP(0, C0126R.anim.as_slide_out_to_end),
    OPEN(C0126R.anim.as_slide_in_from_below, C0126R.anim.as_stay_put, true),
    CLOSE(0, C0126R.anim.as_slide_out_to_below),
    PAN_START(C0126R.anim.as_slide_in_from_start, C0126R.anim.as_slide_out_to_end),
    PAN_END(C0126R.anim.as_slide_in_from_end, C0126R.anim.as_slide_out_to_start),
    FADE_IN(C0126R.anim.as_fade_in, C0126R.anim.as_stay_put),
    CROSS_FADE(C0126R.anim.as_fade_in, C0126R.anim.as_fade_out);
    

    /* renamed from: j */
    public final int f16234j;

    /* renamed from: k */
    public final int f16235k;

    /* renamed from: l */
    public final boolean f16236l;

    private fbs(int i, int i2) {
        this(i, i2, false);
    }

    private fbs(int i, int i2, boolean z) {
        this.f16234j = i;
        this.f16235k = i2;
        this.f16236l = z;
    }
}
