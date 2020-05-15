package p000;

import java.io.Serializable;
import java.util.Random;

/* renamed from: bsgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgh implements Serializable {

    /* renamed from: a */
    private final Random f144527a;

    public bsgh(bsgg bsgg) {
        this.f144527a = new Random(bsgg.f144526a);
    }

    /* renamed from: c */
    public static bsgg m115730c() {
        return new bsgg();
    }

    /* renamed from: a */
    public final long mo70529a() {
        return this.f144527a.nextLong();
    }

    /* renamed from: b */
    public final Random mo70530b() {
        return new Random(mo70529a());
    }
}
