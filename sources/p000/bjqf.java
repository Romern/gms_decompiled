package p000;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.wallet.bender3.impl.p096ui.common.input.TransformEditText;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bjqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqf extends bjjm implements bjop, bjpa {

    /* renamed from: m */
    TextInputLayout f123135m;

    /* renamed from: o */
    TransformEditText f123136o;

    /* renamed from: p */
    private bwwh f123137p;

    public bjqf(bjgv bjgv) {
        super(bjgv, bjqc.class);
    }

    /* renamed from: E */
    private final void m104322E() {
        if (!TextUtils.equals(this.f123136o.getText().toString(), ((bjhw) ((bjhy) ((bjqc) ((bjjm) this).f122830n)).f122754m).f122753d)) {
            this.f123136o.mo71769a(((bjhw) ((bjhy) ((bjqc) ((bjjm) this).f122830n)).f122754m).f122753d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104322E();
    }

    /* renamed from: a */
    public final int mo65417a() {
        return C0126R.C0128layout.wallet_view_edit_text_filled;
    }

    /* renamed from: b */
    public final int mo65418b() {
        return C0126R.C0128layout.wallet_view_edit_text_outline;
    }

    /* renamed from: c */
    public final int mo65419c() {
        return C0126R.C0128layout.wallet_view_edit_text_legacy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo65306e(String str) {
        this.f123135m.mo71272c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo65181n() {
        return this.f123136o.isFocusable() && this.f122683h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo65182o() {
        return this.f123136o.requestFocus();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        mo65177j(this.f123135m);
        this.f122685j.mo65355a(this.f123136o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        mo65192w();
        this.f122685j.mo65358b(this.f123136o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        bwwe bwwe;
        bwwi bwwi;
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bwwh.f161233f;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bwwh bwwh = (bwwh) b;
        this.f123137p = bwwh;
        int a = bwut.m122326a(bwwh.f161237c);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        TextInputLayout textInputLayout = (TextInputLayout) this.f122676a.f122692a.mo65227a().inflate(bjoq.m104173a(a, this), (ViewGroup) null);
        this.f123135m = textInputLayout;
        TransformEditText transformEditText = (TransformEditText) textInputLayout.f151297a;
        this.f123136o = transformEditText;
        bjoq.m104174a(textInputLayout, transformEditText, (bjon) ((bjjm) this).f122830n);
        bwwh bwwh2 = this.f123137p;
        TransformEditText transformEditText2 = this.f123136o;
        int a2 = bwwg.m122367a(bwwh2.f161238d);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        int i3 = 3;
        if (i2 == 2) {
            if (bwwh2.f161235a == 5) {
                bwwe = (bwwe) bwwh2.f161236b;
            } else {
                bwwe = bwwe.f161226c;
            }
            i3 = !bwwe.f161228a ? 2 : FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
            if (bwwe.f161229b) {
                i3 |= 4096;
            }
        } else if (i2 != 3) {
            if (bwwh2.f161235a == 4) {
                bwwi = (bwwi) bwwh2.f161236b;
            } else {
                bwwi = bwwi.f161240i;
            }
            if (bwwi.f161242a) {
                i = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
            }
            if (bwwi.f161243b) {
                i |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            }
            if (bwwi.f161244c) {
                i |= 8192;
            }
            if (bwwi.f161245d) {
                i |= 32;
            }
            if (bwwi.f161246e) {
                i |= 96;
            }
            if (bwwi.f161247f) {
                i |= AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
            }
            if (bwwi.f161248g) {
                i |= 16;
            }
            i3 = i;
            if (bwwi.f161249h) {
                i3 |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            }
        }
        transformEditText2.setInputType(i3);
        TransformEditText transformEditText3 = this.f123136o;
        transformEditText3.f151773a = this;
        transformEditText3.mo71770a(((bjqc) ((bjjm) this).f122830n).f123134q.f161218e);
        m104322E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        bjkm.m103781a(this.f122686k, (TextInputLayout) view);
    }

    /* renamed from: a */
    public final void mo65426a(String str) {
        if (!TextUtils.equals(str, ((bjhw) ((bjhy) ((bjqc) ((bjjm) this).f122830n)).f122754m).f122753d)) {
            ((bjhw) ((bjhy) ((bjqc) ((bjjm) this).f122830n)).f122754m).mo65263a(str, this);
        }
    }
}
