package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atmc extends C1251oq {

    /* renamed from: b */
    final /* synthetic */ atme f90467b;

    public atmc(atme atme) {
        this.f90467b = atme;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        String str;
        String str2;
        super.mo345a(view, qmVar);
        if (!this.f90467b.mo50038e()) {
            atme atme = this.f90467b;
            int i = atme.f90473f.f1754c;
            if (!atme.f90476i.isEmpty()) {
                if (i != this.f90467b.f90476i.size()) {
                    str2 = this.f90467b.f90469b.getString(C0126R.string.tp_token_selector_hint_not_at_end);
                } else {
                    str2 = this.f90467b.f90469b.getString(C0126R.string.tp_token_selector_hint_at_end);
                }
                qmVar.mo15770d(str2);
            }
            if (i != this.f90467b.f90476i.size()) {
                atme atme2 = this.f90467b;
                str = atme2.f90469b.getString(C0126R.string.tp_token_selector_item_description, new Object[]{((CardInfo) atme2.f90476i.get(i)).f108343d, Integer.valueOf(i + 1), Integer.valueOf(this.f90467b.f90476i.size())});
            } else {
                str = this.f90467b.f90469b.getString(C0126R.string.tp_add_payment_method);
            }
            qmVar.mo15766c(str);
            if (i == this.f90467b.f90476i.size()) {
                qmVar.mo15757a(C1298qj.f26862c);
                qmVar.mo15777f(true);
            }
        }
    }
}
