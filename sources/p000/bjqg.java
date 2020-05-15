package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: bjqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqg extends bjqb {
    public bjqg() {
        super(bwwo.f161270e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        bwwo bwwo = (bwwo) bxxc;
        mo65262a(bwwo.f161273b);
        mo65247a((Collection) bwwo.f161274c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwwo.f161269d.mo74144da();
        String str = this.f122753d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwwo bwwo = (bwwo) da.f164949b;
        str.getClass();
        bwwo.f161272a |= 1;
        bwwo.f161273b = str;
        List list = this.f123133e;
        if (!bwwo.f161274c.mo73666a()) {
            bwwo.f161274c = bxvk.m124019a(bwwo.f161274c);
        }
        bxsy.m123078a(list, bwwo.f161274c);
        return (bwwo) da.mo74062i();
    }
}
