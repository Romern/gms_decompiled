package p000;

import android.view.View;
import android.widget.TextView;

/* renamed from: bjrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjrp extends bjjm {

    /* renamed from: m */
    TextView f123188m;

    public bjrp(bjgv bjgv) {
        super(bjgv, bjrn.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo65299E() {
        this.f123188m.setText(((bjrn) ((bjjm) this).f122830n).mo65122h());
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
        this.f123188m = new TextView(this.f122676a.f122692a.f122732i);
        mo65299E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        bjkn.m103783a(this.f122686k, (TextView) view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        mo65177j(this.f123188m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        mo65192w();
    }
}
