package p000;

import java.util.List;
import java.util.stream.Collectors;

/* renamed from: kjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kjo {

    /* renamed from: a */
    public bngs f24259a = bngx.m109377j();

    /* renamed from: b */
    public kjl f24260b;

    /* renamed from: c */
    public kjj f24261c;

    /* renamed from: d */
    public kka f24262d;

    /* renamed from: e */
    private final kcv f24263e;

    public kjo(kcv kcv) {
        bmxy.m108581a(kcv);
        this.f24263e = kcv;
    }

    /* renamed from: a */
    public final kjp mo14537a() {
        int i;
        bngx a = this.f24259a.mo67664a();
        List list = (List) a.stream().map(kjm.f24257a).map(kjn.f24258a).collect(Collectors.toList());
        if (!list.isEmpty()) {
            i = bnzi.m110895a(list).mo68741c();
        } else {
            i = 0;
        }
        return new kjp(this.f24263e, a, bmxv.m108567c(this.f24260b), bmxv.m108567c(this.f24261c), bmxv.m108567c(this.f24262d), i);
    }
}
