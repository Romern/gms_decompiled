package p000;

import java.util.logging.Level;

/* renamed from: srn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class srn extends bnsn {

    /* renamed from: a */
    public static final bnsj f45045a = bnsj.m110325a("service_id", Integer.class);

    /* renamed from: d */
    private final sgj f45046d;

    public srn(bnsx bnsx, sgj sgj) {
        super(bnsx);
        this.f45046d = sgj;
    }

    @Deprecated
    /* renamed from: a */
    public static srn m36124a() {
        return new srn(bntd.m110367a(bntd.m110368a().mo68473a(srn.class)), sgj.UNKNOWN);
    }

    /* renamed from: a */
    public static srn m36125a(String str) {
        return new srn(bntd.m110367a(str), sgj.UNKNOWN);
    }

    /* renamed from: a */
    public static srn m36126a(String str, sgj sgj) {
        return new srn(bntd.m110367a(str), sgj);
    }

    @Deprecated
    /* renamed from: a */
    public static srn m36127a(sgj sgj) {
        return new srn(bntd.m110367a(bntd.m110368a().mo68473a(srn.class)), sgj);
    }

    /* renamed from: a */
    public final bnsl mo26019b(Level level) {
        sgj sgj;
        if (!mo68389c(level)) {
            return bnsn.f132081c;
        }
        Integer num = null;
        if (this.f45046d != sgj.UNKNOWN) {
            sgj = this.f45046d;
        } else {
            sgj = null;
        }
        srm srm = new srm(this, level);
        bnsj bnsj = f45045a;
        if (sgj != null) {
            num = Integer.valueOf(sgj.mo3214a());
        }
        bnuy.m110474a(bnsj, "metadata key");
        if (num != null) {
            srm.mo68403a(bnsj, num);
        }
        return srm;
    }
}
