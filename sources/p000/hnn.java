package p000;

import java.io.IOException;

/* renamed from: hnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hnn extends bmxe {

    /* renamed from: a */
    private final bxxk f20078a;

    public hnn(bxxk bxxk) {
        this.f20078a = bxxk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12636a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        return bmxv.mo66813a() ? sqd.m35968b(((bxxc) bmxv.mo66814b()).mo73642k()) : "<<absent>>";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        String str = (String) obj;
        try {
            return !"<<absent>>".equals(str) ? bmxv.m108566b((bxxc) this.f20078a.mo73662b(sqd.m35966a(str), bxus.m123744c())) : bmvz.f131120a;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
