package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: bjqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqh extends bjqb {
    public bjqh() {
        super(bwwp.f161276e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        bwwp bwwp = (bwwp) bxxc;
        mo65262a(bwwp.f161279b);
        mo65247a((Collection) bwwp.f161280c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo65251d() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwwp.f161275d.mo74144da();
        String str = this.f122753d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwwp bwwp = (bwwp) da.f164949b;
        str.getClass();
        bwwp.f161278a |= 1;
        bwwp.f161279b = str;
        List list = this.f123133e;
        if (!bwwp.f161280c.mo73666a()) {
            bwwp.f161280c = bxvk.m124019a(bwwp.f161280c);
        }
        bxsy.m123078a(list, bwwp.f161280c);
        return (bwwp) da.mo74062i();
    }
}
