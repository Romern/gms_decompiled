package p000;

import java.util.Arrays;

/* renamed from: bfat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfat implements Comparable {

    /* renamed from: a */
    public final bfas f113259a;

    /* renamed from: b */
    public final bfav f113260b;

    public bfat(int i, int i2, bfav bfav) {
        this.f113259a = new bfas(i, i2);
        this.f113260b = bfav;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bfat bfat = (bfat) obj;
        return bneu.f131545b.mo67473a(this.f113259a, bfat.f113259a).mo67473a(this.f113260b, bfat.f113260b).mo67470a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfat) {
            bfat bfat = (bfat) obj;
            if (!this.f113259a.equals(bfat.f113259a) || !this.f113260b.equals(bfat.f113260b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f113259a, this.f113260b});
    }
}
