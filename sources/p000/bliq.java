package p000;

import java.util.UUID;

/* renamed from: bliq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bliq extends blij {

    /* renamed from: a */
    private final bljf f126634a;

    public bliq(String str, bljg bljg, bljf bljf) {
        super(str, bljg);
        bmxy.m108588a(bljf.f126671c);
        this.f126634a = bljf;
    }

    /* renamed from: a */
    public final bljc mo66578a(bljd bljd) {
        return bljf.m107236a(bljd, this.f126634a, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
    }

    public bliq(String str, UUID uuid, bljf bljf) {
        super(str, uuid);
        bmxy.m108588a(bljf.f126671c);
        this.f126634a = bljf;
    }
}
