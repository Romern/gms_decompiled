package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.card.CardNumberEditText;

/* renamed from: bkay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkay implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ CardNumberEditText f123906a;

    public bkay(CardNumberEditText cardNumberEditText) {
        this.f123906a = cardNumberEditText;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.card.CardNumberEditText.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.util.List, java.lang.String):int
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.lang.String, boolean):void */
    public final void afterTextChanged(Editable editable) {
        CardNumberEditText cardNumberEditText = this.f123906a;
        boolean z = true;
        cardNumberEditText.mo71833a(cardNumberEditText.mo71937m(), true);
        CardNumberEditText cardNumberEditText2 = this.f123906a;
        int i = 0;
        if (cardNumberEditText2.f151885j || cardNumberEditText2.f151886k != null) {
            if (!cardNumberEditText2.mo65775cO()) {
                z = false;
            } else if (this.f123906a.mo65798cL()) {
                z = false;
            }
        }
        CardNumberEditText cardNumberEditText3 = this.f123906a;
        if (cardNumberEditText3.f151878c && z) {
            cardNumberEditText3.setTextColor(cardNumberEditText3.getResources().getColor(C0126R.color.wallet_uic_error_color));
            bkfr.m105593b(this.f123906a.getContext(), this.f123906a);
        } else {
            cardNumberEditText3.setTextColor(cardNumberEditText3.f151877b);
        }
        CardNumberEditText cardNumberEditText4 = this.f123906a;
        View view = cardNumberEditText4.f151894s;
        if (view != null) {
            view.setVisibility(cardNumberEditText4.f151874a.length() > 0 ? 8 : 0);
        }
        CardNumberEditText cardNumberEditText5 = this.f123906a;
        View view2 = cardNumberEditText5.f151895t;
        if (view2 != null) {
            if (cardNumberEditText5.f151874a.length() > 0) {
                i = 8;
            }
            view2.setVisibility(i);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
