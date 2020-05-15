package p000;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.wallet.bender3.impl.p096ui.common.input.TransformEditText;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bjpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpq extends bjjk implements bjpm, bjpa, bjop {

    /* renamed from: o */
    public ViewGroup f123104o;

    /* renamed from: p */
    FlexboxLayout f123105p;

    /* renamed from: q */
    TextInputLayout f123106q;

    /* renamed from: r */
    TransformEditText f123107r;

    /* renamed from: s */
    private bwvq f123108s;

    /* renamed from: t */
    private ViewGroup f123109t;

    /* renamed from: u */
    private bjgt f123110u;

    /* renamed from: v */
    private bjgt f123111v;

    public bjpq(bjgv bjgv) {
        super(bjgv, bjpn.class);
    }

    /* renamed from: I */
    private final void m104248I() {
        String str = ((bjpp) ((bjhy) ((bjpn) ((bjjm) this).f122830n)).f122754m).f122753d;
        if (!TextUtils.equals(this.f123107r.getText().toString(), str)) {
            this.f123107r.mo71769a(str);
        }
    }

    /* renamed from: J */
    private final void m104249J() {
        bjgt bjgt = this.f123111v;
        if (bjgt != null) {
            bjgt.mo65180m();
            mo65167b(this.f123111v);
            this.f123111v = null;
        }
        bjpn bjpn = (bjpn) ((bjjm) this).f122830n;
        int length = bjpn.f123097t.length;
        boolean z = false;
        if (bjpn.f123096s == null) {
            bjpn.f123096s = new ArrayList(length);
            long j = ((bjpp) ((bjhy) bjpn).f122754m).f123102f;
            if (j != -1) {
                bjpn.f123096s.add(Long.valueOf(bjpn.mo65437e(j).f123093l.f161124d));
            } else {
                for (int i = 0; i < length; i++) {
                    if (bjpn.f123097t[i] >= 0) {
                        bjpn.f123096s.add(Long.valueOf(((bjpl) bjpn.f123095r.get(i)).f123093l.f161124d));
                    }
                }
            }
        }
        ArrayList arrayList = bjpn.f123096s;
        boolean e = ((bjpp) ((bjhy) ((bjpn) ((bjjm) this).f122830n)).f122754m).mo65438e();
        int a = bwvn.m122348a(this.f123108s.f161161e);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                ArrayList arrayList2 = this.f122681f;
                int size = arrayList2.size();
                boolean z2 = false;
                for (int i3 = 0; i3 < size; i3++) {
                    bjgt bjgt2 = (bjgt) arrayList2.get(i3);
                    if (!(bjgt2 == this.f123110u || bjgt2 == this.f123111v)) {
                        boolean contains = arrayList.contains(Long.valueOf(bjgt2.f122677b.f161388d));
                        bjgt2.mo65163a(!contains);
                        z2 = z2 || contains;
                    }
                }
                if (e && !z2) {
                    this.f123111v = m104251a(((Long) arrayList.get(0)).longValue(), this.f123108s.f161159c);
                }
                bjgt bjgt3 = this.f123110u;
                if (e) {
                    z = true;
                } else if (z2) {
                    z = true;
                }
                bjgt3.mo65163a(z);
            }
        } else if (m104250K()) {
            bwxl bwxl = this.f123108s.f161160d;
            if (bwxl == null) {
                bwxl = bwxl.f161383i;
            }
            if (e) {
                bwxl = bjhp.m103509a(((Long) arrayList.get(0)).longValue(), this.f123108s.f161159c);
            }
            m104253b(bwxl);
        } else {
            this.f123110u.mo65163a(e);
            if (e) {
                long longValue = ((Long) arrayList.get(0)).longValue();
                bjgt a2 = m104251a(longValue, this.f123108s.f161158b);
                this.f123111v = a2;
                if (a2 == null) {
                    this.f123111v = m104251a(longValue, this.f123108s.f161159c);
                }
            }
        }
    }

    /* renamed from: K */
    private final boolean m104250K() {
        int a = bwvp.m122350a(this.f123108s.f161162f);
        return a != 0 && a == 4;
    }

    /* renamed from: a */
    private final bjgt m104251a(long j, List list) {
        bwxl a = bjhp.m103509a(j, list);
        if (a == null) {
            return null;
        }
        m104254c(a);
        return mo65158a(a);
    }

    /* renamed from: b */
    private final void m104253b(bwxl bwxl) {
        boae boae;
        String str;
        int a;
        bxvj bxvj = bwtf.f160950c;
        bwxl.mo74135a(bxvj);
        Object b = bwxl.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bjoe bjoe = (bjoe) this.f122676a.f122693b.mo65131a(bwxl.f161388d, bjoe.class);
        bwtg bwtg = ((bwtf) b).f160952a;
        if (bwtg == null) {
            bwtg = bwtg.f160954e;
        }
        bwtd bwtd = bjoe.f123044l.f160947a;
        if (bwtd == null) {
            bwtd = bwtd.f160938d;
        }
        int b2 = bwtc.m122283b(bwtd.f160940a);
        int i = b2 - 1;
        Drawable drawable = null;
        if (b2 == 0) {
            throw null;
        } else if (i == 0) {
            if (bwtd.f160940a == 2) {
                boae = (boae) bwtd.f160941b;
            } else {
                boae = boae.f132446b;
            }
            mo65194x(boaf.m110964a(boae).f132445a);
        } else if (i == 2) {
            this.f123106q.mo71264b(bjrs.m104479a(this.f122676a.f122692a.f122732i.getResources(), bwtd));
        } else if (i != 3) {
            int i2 = 1;
            if (i != 4) {
                mo65169b(String.format("Unsupported source type %s", bwtc.m122282a(bwtc.m122283b(bwtd.f160940a))));
                return;
            }
            TextInputLayout textInputLayout = this.f123106q;
            if (bwtd.f160940a == 6 && (a = bwtb.m122281a(((Integer) bwtd.f160941b).intValue())) != 0) {
                i2 = a;
            }
            int a2 = bjrs.m104477a(i2);
            if (a2 != 0) {
                drawable = C1391tv.m20459b(textInputLayout.getContext(), a2);
            }
            textInputLayout.mo71264b(drawable);
        } else {
            if (bwtd.f160940a == 5) {
                str = (String) bwtd.f160941b;
            } else {
                str = "";
            }
            mo65194x(bjrs.m104481a(str, bwtg));
        }
    }

    /* renamed from: c */
    private static void m104254c(bwxl bwxl) {
        bxvj bxvj = bwtf.f160950c;
        bwxl.mo74135a(bxvj);
        bmxy.m108589a(bwxl.f164952m.mo73911a(bxvj.f164958d), String.format("Node does not contain image extension: %s", Long.valueOf(bwxl.f161388d)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo65155B() {
        super.mo65155B();
        TextInputLayout textInputLayout = this.f123106q;
        if (textInputLayout != null) {
            textInputLayout.setImportantForAccessibility(mo65196z());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo65156C() {
        super.mo65156C();
        TextInputLayout textInputLayout = this.f123106q;
        if (textInputLayout != null) {
            textInputLayout.setEnabled(mo65195y());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final ViewGroup mo65299E() {
        int a = bwut.m122326a(this.f123108s.f161157a);
        if (a == 0) {
            a = 1;
        }
        ViewGroup viewGroup = (ViewGroup) this.f122676a.f122692a.mo65227a().inflate(bjoq.m104173a(a, this), (ViewGroup) null);
        this.f123104o = viewGroup;
        TextInputLayout textInputLayout = (TextInputLayout) viewGroup.findViewById(C0126R.C0129id.pan_text_input_layout);
        this.f123106q = textInputLayout;
        textInputLayout.mo71276d((ColorStateList) null);
        this.f123107r = (TransformEditText) this.f123106q.f151297a;
        ViewGroup viewGroup2 = this.f123104o;
        int a2 = bwvn.m122348a(this.f123108s.f161161e);
        if (a2 == 0 || a2 != 4) {
            this.f123105p = (FlexboxLayout) this.f123104o.findViewById(C0126R.C0129id.card_icons_holder);
            int a3 = bwvp.m122350a(this.f123108s.f161162f);
            if (a3 == 0) {
                a3 = 1;
            }
            int i = a3 - 1;
            if (i == 0) {
                mo65169b("Unknown enum for LogoUiPlacement");
            } else if (i == 1) {
                m104252a(this.f123106q, 3, C0126R.C0129id.card_icons_holder);
                viewGroup2 = this.f123105p;
            } else if (i == 2) {
                m104252a(this.f123105p, 3, C0126R.C0129id.pan_text_input_layout);
                viewGroup2 = this.f123105p;
            } else if (i != 3) {
                this.f123106q.mo71254a((Drawable) null);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f123105p.getLayoutParams();
                float dimension = this.f122676a.f122692a.f122732i.getResources().getDimension(C0126R.dimen.wallet_pan_entry_logo_ui_end_placement_end_margin);
                float dimension2 = this.f122676a.f122692a.f122732i.getResources().getDimension(C0126R.dimen.wallet_pan_entry_logo_ui_end_placement_bottom_margin);
                C1260oz.m19823b(marginLayoutParams, (int) dimension);
                marginLayoutParams.bottomMargin = (int) dimension2;
                this.f123105p.setLayoutParams(marginLayoutParams);
                this.f123105p.mo6307d(1);
                int i2 = Build.VERSION.SDK_INT;
                m104252a(this.f123105p, 19, C0126R.C0129id.pan_text_input_layout);
                m104252a(this.f123105p, 8, C0126R.C0129id.pan_text_input_layout);
                viewGroup2 = this.f123105p;
            }
        }
        this.f123109t = viewGroup2;
        return this.f123104o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final ViewGroup mo65300F() {
        return this.f123109t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104248I();
    }

    /* renamed from: a */
    public final int mo65417a() {
        return C0126R.C0128layout.wallet_view_pan_entry_filled;
    }

    /* renamed from: b */
    public final int mo65418b() {
        return C0126R.C0128layout.wallet_view_pan_entry_outline;
    }

    /* renamed from: c */
    public final int mo65419c() {
        return C0126R.C0128layout.wallet_view_pan_entry_legacy;
    }

    /* renamed from: d */
    public final void mo65434d() {
        m104249J();
        this.f123107r.mo71770a(((bjpn) ((bjjm) this).f122830n).mo65435J());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo65306e(String str) {
        this.f123106q.mo71272c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        this.f122685j.mo65355a(this.f123107r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        this.f122685j.mo65358b(this.f123107r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo65186r() {
        super.mo65186r();
        ArrayList arrayList = ((bjpn) ((bjjm) this).f122830n).f123094q;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        this.f123110u = null;
        this.f123111v = null;
    }

    /* renamed from: a */
    private static void m104252a(ViewGroup viewGroup, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.addRule(i, i2);
        viewGroup.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65159a(Bitmap bitmap) {
        this.f123106q.mo71264b(new BitmapDrawable(this.f122676a.f122692a.f122732i.getResources(), bitmap));
    }

    /* renamed from: a */
    public final void mo65212a(bjgt bjgt, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        bjkk bjkk = bjgt.f122686k;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        }
        bjko.m103789a(bjkk, bjkk.f122859d.mo65320b(), marginLayoutParams);
        view.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        bxvj bxvj = bwvq.f161155h;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123108s = (bwvq) b;
        super.mo65162a(bwxl, bwxl2);
        bjpn bjpn = (bjpn) ((bjjm) this).f122830n;
        if (bjpn.f123094q == null) {
            bjpn.f123094q = new ArrayList(1);
        }
        bjpn.f123094q.add(this);
        bjoq.m104174a(this.f123106q, this.f123107r, (bjon) ((bjjm) this).f122830n);
        this.f123107r.setInputType(2);
        TransformEditText transformEditText = this.f123107r;
        transformEditText.f151773a = this;
        transformEditText.mo71770a(((bjpn) ((bjjm) this).f122830n).mo65435J());
        bwxl bwxl3 = this.f123108s.f161160d;
        if (bwxl3 == null) {
            bwxl3 = bwxl.f161383i;
        }
        int a = bwvn.m122348a(this.f123108s.f161161e);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 0) {
            mo65169b("Unknown enum for LogoDisplayStrategy");
        } else if (i != 1) {
            if (i == 2) {
                m104254c(bwxl3);
                this.f123110u = mo65158a(bwxl3);
                bxwc bxwc = this.f123108s.f161158b;
                int size = bxwc.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bwxl bwxl4 = (bwxl) bxwc.get(i2);
                    m104254c(bwxl4);
                    mo65158a(bwxl4);
                }
            }
        } else if (m104250K()) {
            m104253b(bwxl3);
        } else {
            m104254c(bwxl3);
            this.f123110u = mo65158a(bwxl3);
        }
        m104249J();
        m104248I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        bjkm.m103781a(this.f122686k, this.f123106q);
    }

    /* renamed from: a */
    public final void mo65426a(String str) {
        if (!TextUtils.equals(str, ((bjpp) ((bjhy) ((bjpn) ((bjjm) this).f122830n)).f122754m).f122753d)) {
            ((bjpp) ((bjhy) ((bjpn) ((bjjm) this).f122830n)).f122754m).mo65263a(str, this);
        }
    }
}
