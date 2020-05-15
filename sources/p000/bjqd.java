package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: bjqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqd extends bjqb {
    public bjqd() {
        super(bwwd.f161221e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        bwwd bwwd = (bwwd) bxxc;
        mo65262a(bwwd.f161224b);
        mo65247a((Collection) bwwd.f161225c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwwd.f161220d.mo74144da();
        String str = this.f122753d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwwd bwwd = (bwwd) da.f164949b;
        str.getClass();
        bwwd.f161223a |= 1;
        bwwd.f161224b = str;
        List list = this.f123133e;
        if (!bwwd.f161225c.mo73666a()) {
            bwwd.f161225c = GeneratedMessageLite.m124019a(bwwd.f161225c);
        }
        bxsy.m123078a(list, bwwd.f161225c);
        return (bwwd) da.mo74062i();
    }
}
