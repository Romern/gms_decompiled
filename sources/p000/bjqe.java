package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: bjqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqe extends bjqb {
    public bjqe() {
        super(bwwj.f161252e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        bwwj bwwj = (bwwj) bxxc;
        mo65262a(bwwj.f161255b);
        mo65247a((Collection) bwwj.f161256c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwwj.f161251d.mo74144da();
        String str = this.f122753d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwwj bwwj = (bwwj) da.f164949b;
        str.getClass();
        bwwj.f161254a |= 1;
        bwwj.f161255b = str;
        List list = this.f123133e;
        if (!bwwj.f161256c.mo73666a()) {
            bwwj.f161256c = GeneratedMessageLite.m124019a(bwwj.f161256c);
        }
        bxsy.m123078a(list, bwwj.f161256c);
        return (bwwj) da.mo74062i();
    }
}
