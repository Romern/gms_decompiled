package p000;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

/* renamed from: bjof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjof extends bjjm {

    /* renamed from: m */
    ImageView f123045m;

    /* renamed from: o */
    private bwtf f123046o;

    public bjof(bjgv bjgv) {
        super(bjgv, bjoe.class);
    }

    /* renamed from: E */
    private final void m104141E() {
        ImageView imageView = this.f123045m;
        bwtd bwtd = ((bjoe) ((bjjm) this).f122830n).f123044l.f160947a;
        if (bwtd == null) {
            bwtd = bwtd.f160938d;
        }
        ImageLoader imageLoader = this.f122676a.f122692a.f122728e;
        bwtg bwtg = this.f123046o.f160952a;
        if (bwtg == null) {
            bwtg = bwtg.f160954e;
        }
        bjrs.m104482a(imageView, bwtd, imageLoader, bwtg);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104141E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bwtf.f160950c;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123046o = (bwtf) b;
        bwtd bwtd = ((bjoe) ((bjjm) this).f122830n).f123044l.f160947a;
        if (bwtd == null) {
            bwtd = bwtd.f160938d;
        }
        int b2 = bwtc.m122283b(bwtd.f160940a);
        int i = b2 - 1;
        if (b2 != 0) {
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("The provided image uri is invalid.");
                        }
                    }
                }
                this.f123045m = new ImageView(this.f122676a.f122692a.f122732i);
                m104141E();
                return;
            }
            this.f123045m = new NetworkImageView(this.f122676a.f122692a.f122732i);
            m104141E();
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        bjkk bjkk = this.f122686k;
        ImageView imageView = (ImageView) view;
        bjkp.m103790a(bjkk, imageView);
        bjka a = bjkk.f122859d.mo65318a();
        int i = bjkk.f122860e;
        if (bjkk.mo65338a(a, 12) && a.mo65327a(12, i)) {
            C1329rn.m20096a(imageView, ColorStateList.valueOf(a.mo65330c(12, i)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65304c(String str) {
        if (str == null) {
            bwtd bwtd = ((bjoe) ((bjjm) this).f122830n).f123044l.f160947a;
            if (bwtd == null) {
                bwtd = bwtd.f160938d;
            }
            str = bwtd.f160942c;
        }
        super.mo65304c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        mo65177j(this.f123045m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        mo65192w();
    }
}
