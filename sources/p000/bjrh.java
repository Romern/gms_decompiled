package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.wallet.bender3.impl.p096ui.common.selector.dropdown.DropDownAutoCompleteTextView;

/* renamed from: bjrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjrh extends bjjm implements bjgz {

    /* renamed from: m */
    public bxaj f123175m;

    /* renamed from: o */
    TextInputLayout f123176o;

    /* renamed from: p */
    DropDownAutoCompleteTextView f123177p;

    /* renamed from: q */
    bjrc f123178q;

    public bjrh(bjgv bjgv) {
        super(bjgv, bjqr.class);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: SimpleMethodDetails{com.google.android.wallet.bender3.impl.ui.common.selector.dropdown.DropDownAutoCompleteTextView.setText(java.lang.CharSequence, boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.widget.EditText.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void}
      ClspMth{android.widget.TextView.setText(int, android.widget.TextView$BufferType):void}
      ClspMth{android.widget.TextView.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void}
      SimpleMethodDetails{com.google.android.wallet.bender3.impl.ui.common.selector.dropdown.DropDownAutoCompleteTextView.setText(java.lang.CharSequence, boolean):void} */
    /* renamed from: E */
    private final void m104426E() {
        bwxl bwxl;
        bjqy bjqy = (bjqy) ((bjhy) ((bjqr) ((bjjm) this).f122830n)).f122754m;
        bjrc bjrc = this.f123178q;
        bjre bjre = bjrc.f123163d;
        if (bjre != null && !bjre.mo65174h()) {
            bjrc.mo65469a(bjrc.f123163d);
        }
        String str = null;
        bjrc.f123163d = null;
        if (bjqy.mo65464e()) {
            long j = bjqy.f123154d;
            int size = bjrc.f123160a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    bwxl = null;
                    break;
                }
                bwxl = (bwxl) bjrc.f123160a.get(i);
                if (bwxl.f161388d == j) {
                    break;
                }
                i++;
            }
            if (bwxl != null) {
                bjgt a = bjrc.f123162c.f122694c.mo65205a(bwxl.f161386b);
                if (a != null) {
                    bjrc.f123163d = (bjre) a;
                } else {
                    bjrc.f123163d = bjrc.mo65467a(bwxl);
                }
            }
        }
        bjre bjre2 = this.f123178q.f123163d;
        if (bjre2 != null) {
            str = ((bjrd) ((bjjm) bjre2).f122830n).mo65122h();
        }
        this.f123177p.setText((CharSequence) str, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104426E();
    }

    /* renamed from: a */
    public final void mo65210a(View view) {
    }

    /* renamed from: a */
    public final void mo65211a(View view, int i) {
    }

    /* renamed from: a */
    public final void mo65212a(bjgt bjgt, View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        mo65177j(this.f123176o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        this.f123178q.mo65470a(bnkn.m109663a((Iterable) this.f122681f));
        mo65192w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final bjha mo65190u() {
        return bjha.m103465a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bxaj.f161698e;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bxaj bxaj = (bxaj) b;
        this.f123175m = bxaj;
        int a = bwut.m122326a(bxaj.f161701b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        this.f123176o = (TextInputLayout) this.f122676a.f122692a.mo65227a().inflate(i != 2 ? i != 3 ? C0126R.C0128layout.wallet_view_drop_down_selector_filled : C0126R.C0128layout.wallet_view_drop_down_selector_legacy : C0126R.C0128layout.wallet_view_drop_down_selector_outline, (ViewGroup) null);
        bxwc bxwc = this.f123175m.f161700a;
        this.f123178q = new bjrc(this.f122676a, this, bxwc);
        DropDownAutoCompleteTextView dropDownAutoCompleteTextView = (DropDownAutoCompleteTextView) this.f123176o.findViewById(C0126R.C0129id.exposed_dropdown);
        this.f123177p = dropDownAutoCompleteTextView;
        dropDownAutoCompleteTextView.setAdapter(this.f123178q);
        DropDownAutoCompleteTextView dropDownAutoCompleteTextView2 = this.f123177p;
        dropDownAutoCompleteTextView2.f151791c = this.f122676a;
        dropDownAutoCompleteTextView2.setOnItemClickListener(new bjrf(this, bxwc));
        int i2 = Build.VERSION.SDK_INT;
        this.f123177p.f151789a.add(new bjrg(this));
        this.f123178q.notifyDataSetChanged();
        String str = ((bjqr) ((bjjm) this).f122830n).f123147q.f161653a;
        if (!str.isEmpty()) {
            this.f123176o.mo71259a(str);
        }
        m104426E();
    }
}
