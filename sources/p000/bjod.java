package p000;

import android.net.Uri;

/* renamed from: bjod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjod extends bjjm implements bjxz {

    /* renamed from: m */
    bjxw f123043m;

    public bjod(bjgv bjgv) {
        super(bjgv, bjob.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo65299E() {
        this.f123043m.loadDataWithBaseURL(null, ((bjob) ((bjjm) this).f122830n).f123042p.f160930a, "text/html", null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        mo65299E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bjya bjya = new bjya();
        bjya.f123618a = this;
        bjxw bjxw = new bjxw(this.f122676a.f122692a.f122732i);
        this.f123043m = bjxw;
        bjxw.mo65617a(bjya);
        mo65299E();
    }

    /* renamed from: f */
    public final void mo65408f(String str) {
        ((bjoc) ((bjhy) ((bjob) ((bjjm) this).f122830n)).f122754m).mo65262a(Uri.parse(str).getQuery());
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        mo65177j(this.f123043m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        if (this.f122682g != null) {
            mo65192w();
        }
    }
}
