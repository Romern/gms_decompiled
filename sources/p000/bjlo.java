package p000;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.button.MaterialButton;

/* renamed from: bjlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjlo extends bjjm {

    /* renamed from: m */
    MaterialButton f122937m;

    /* renamed from: o */
    private bwnf f122938o;

    /* renamed from: p */
    private int f122939p = -1;

    public bjlo(bjgv bjgv) {
        super(bjgv, bjlm.class);
    }

    /* renamed from: E */
    private final void m103849E() {
        boae boae;
        String str;
        int a;
        int i = 1;
        if (!m103850F() && (((bjlm) ((bjjm) this).f122830n).f122936p.f160341a & 1) == 0) {
            mo65169b("At least one of text or icon field must exist for button");
        }
        bwnb bwnb = ((bjlm) ((bjjm) this).f122830n).f122936p;
        Drawable drawable = null;
        if ((bwnb.f160341a & 1) == 0) {
            this.f122937m.mo71044b((Drawable) null);
        } else {
            bwtd bwtd = bwnb.f160342b;
            if (bwtd == null) {
                bwtd = bwtd.f160938d;
            }
            int b = bwtc.m122283b(bwtd.f160940a);
            int i2 = b - 1;
            if (b != 0) {
                if (i2 == 0) {
                    if (bwtd.f160940a == 2) {
                        boae = (boae) bwtd.f160941b;
                    } else {
                        boae = boae.f132446b;
                    }
                    mo65194x(boaf.m110964a(boae).f132445a);
                } else if (i2 == 2) {
                    this.f122937m.mo71044b(bjrs.m104479a(this.f122676a.f122692a.f122732i.getResources(), bwtd));
                } else if (i2 == 3) {
                    if (bwtd.f160940a == 5) {
                        str = (String) bwtd.f160941b;
                    } else {
                        str = "";
                    }
                    bwtg bwtg = this.f122938o.f160353b;
                    if (bwtg == null) {
                        bwtg = bwtg.f160954e;
                    }
                    mo65194x(bjrs.m104481a(str, bwtg));
                } else if (i2 != 4) {
                    mo65169b(String.format("Unsupported source type %s", bwtc.m122282a(bwtc.m122283b(bwtd.f160940a))));
                } else {
                    MaterialButton materialButton = this.f122937m;
                    if (bwtd.f160940a == 6 && (a = bwtb.m122281a(((Integer) bwtd.f160941b).intValue())) != 0) {
                        i = a;
                    }
                    int a2 = bjrs.m104477a(i);
                    if (a2 != 0) {
                        drawable = C1391tv.m20459b(materialButton.getContext(), a2);
                    }
                    materialButton.mo71044b(drawable);
                }
                if (!m103850F()) {
                    MaterialButton materialButton2 = this.f122937m;
                    if (materialButton2.f151122f != 2) {
                        materialButton2.f151122f = 2;
                        materialButton2.mo71046cj();
                    }
                    this.f122937m.mo71043b(0);
                }
            } else {
                throw null;
            }
        }
        this.f122937m.setText(((bjln) ((bjhy) ((bjlm) ((bjjm) this).f122830n)).f122754m).f122753d);
    }

    /* renamed from: F */
    private final boolean m103850F() {
        return !TextUtils.isEmpty(((bjln) ((bjhy) ((bjlm) ((bjjm) this).f122830n)).f122754m).f122753d);
    }

    /* renamed from: D */
    public final boolean mo65157D() {
        return m103850F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m103849E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65159a(Bitmap bitmap) {
        this.f122937m.mo71044b(new BitmapDrawable(this.f122676a.f122692a.f122732i.getResources(), bitmap));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        ColorStateList valueOf;
        bjkk bjkk = this.f122686k;
        MaterialButton materialButton = (MaterialButton) view;
        bjjz bjjz = bjkk.f122859d;
        bjka b = bjjz.mo65320b();
        bjka a = bjjz.mo65318a();
        bjkp.m103791a(bjkk, b, materialButton);
        bjkn.m103785a(bjkk, b, materialButton, 49);
        bjkp.m103793b(bjkk, a, materialButton);
        bjkn.m103786b(bjkk, a, materialButton);
        if (bjkk.mo65338a(a, 1) && a.mo65327a(1, bjkk.f122860e)) {
            materialButton.setBackgroundColor(a.mo65330c(1, bjkk.f122860e));
        }
        ColorStateList a2 = bjkf.m103765a(bjkk, a);
        if (materialButton.mo71048e()) {
            bhfu bhfu = materialButton.f151120d;
            if (bhfu.f118497l != a2) {
                bhfu.f118497l = a2;
                if (bhfu.f118486a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) bhfu.f118486a.getBackground()).setColor(bhlg.m101096b(a2));
                }
            }
        }
        if (bjkk.mo65338a(a, 4, 3, 2, 5)) {
            int i = bjkk.f122860e;
            int a3 = bjkl.m103778a(a, 2, i);
            if (materialButton.mo71048e()) {
                bhfu bhfu2 = materialButton.f151120d;
                if (!bhfu2.f118500o || bhfu2.f118492g != a3) {
                    bhfu2.f118492g = a3;
                    bhfu2.f118500o = true;
                    bhfu2.mo63673a(bhfu2.f118487b.mo63978a((float) a3));
                }
            }
            ColorStateList valueOf2 = ColorStateList.valueOf(a.mo65330c(3, i));
            if (materialButton.mo71048e()) {
                bhfu bhfu3 = materialButton.f151120d;
                if (bhfu3.f118496k != valueOf2) {
                    bhfu3.f118496k = valueOf2;
                    bhfu3.mo63674b();
                }
            }
            int a4 = bjkl.m103778a(a, 5, i);
            if (materialButton.mo71048e()) {
                bhfu bhfu4 = materialButton.f151120d;
                if (bhfu4.f118493h != a4) {
                    bhfu4.f118493h = a4;
                    bhfu4.mo63674b();
                }
            }
        }
        int i2 = bjkk.f122860e;
        if (bjkk.mo65338a(a, 12) && a.mo65327a(12, i2) && materialButton.f151121e != (valueOf = ColorStateList.valueOf(a.mo65330c(12, i2)))) {
            materialButton.f151121e = valueOf;
            materialButton.mo71045c(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65304c(String str) {
        if (TextUtils.isEmpty(((bjln) ((bjhy) ((bjlm) ((bjjm) this).f122830n)).f122754m).f122753d) && TextUtils.isEmpty(str)) {
            bwnb bwnb = ((bjlm) ((bjjm) this).f122830n).f122936p;
            if ((bwnb.f160341a & 1) != 0) {
                MaterialButton materialButton = this.f122937m;
                bwtd bwtd = bwnb.f160342b;
                if (bwtd == null) {
                    bwtd = bwtd.f160938d;
                }
                materialButton.setContentDescription(bwtd.f160942c);
                return;
            }
        }
        super.mo65304c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        mo65177j(this.f122937m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        mo65192w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        int i;
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bwnf.f160350d;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122938o = (bwnf) b;
        boolean z = false;
        if ((((bjlm) ((bjjm) this).f122830n).f122936p.f160341a & 1) != 0 && m103850F()) {
            z = true;
        }
        int a = bwne.m122127a(this.f122938o.f160352a);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 0 || i2 == 1) {
            i = z ? C0126R.C0128layout.wallet_view_button_filled_icon : C0126R.C0128layout.wallet_view_button_filled;
        } else {
            i = i2 != 2 ? z ? C0126R.C0128layout.wallet_view_button_text_icon : C0126R.C0128layout.wallet_view_button_text : z ? C0126R.C0128layout.wallet_view_button_hairline_icon : C0126R.C0128layout.wallet_view_button_hairline;
        }
        if (i != this.f122939p) {
            this.f122939p = i;
            this.f122937m = (MaterialButton) this.f122676a.f122692a.mo65227a().inflate(this.f122939p, (ViewGroup) null);
        }
        m103849E();
    }
}
