package p000;

import android.text.TextUtils;

/* renamed from: bjpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpp extends bjhw {

    /* renamed from: e */
    public bjpo f123101e;

    /* renamed from: f */
    public long f123102f = -1;

    /* renamed from: g */
    public int[] f123103g;

    public bjpp() {
        super(bwvr.f161166e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        bwvr bwvr = (bwvr) bxxc;
        mo65262a(bwvr.f161169b);
        this.f123102f = (bwvr.f161168a & 2) != 0 ? bwvr.f161170c : -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo65438e() {
        return this.f123102f != -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bwvr.f161165d.mo74144da();
        String str = this.f122753d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwvr bwvr = (bwvr) da.f164949b;
        str.getClass();
        bwvr.f161168a |= 1;
        bwvr.f161169b = str;
        if (mo65438e()) {
            long j = this.f123102f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwvr bwvr2 = (bwvr) da.f164949b;
            bwvr2.f161168a |= 2;
            bwvr2.f161170c = j;
        }
        return (bwvr) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo65263a(String str, bjgf bjgf) {
        String str2 = this.f122753d;
        if (this.f123101e != null && !TextUtils.equals(str, str2)) {
            this.f123101e.mo65436a(str, str2);
        }
        super.mo65263a(str, bjgf);
    }
}
