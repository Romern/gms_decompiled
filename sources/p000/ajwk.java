package p000;

import java.util.Locale;

/* renamed from: ajwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajwk {

    /* renamed from: a */
    public int f71419a;

    /* renamed from: b */
    public int f71420b;

    /* renamed from: c */
    public ajwm f71421c;

    public ajwk(int i, int i2, ajwm ajwm) {
        this.f71419a = i;
        this.f71420b = i2;
        this.f71421c = ajwm;
    }

    public final String toString() {
        return String.format(Locale.US, "SightedAdvertisement<version: %s, type: %s, state: %s>", Integer.valueOf(this.f71419a), ajwo.m59134d(this.f71420b), this.f71421c);
    }
}
