package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.p097ui.common.FormEditText;

/* renamed from: bkdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkdp implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ FormEditText f124053a;

    /* renamed from: b */
    private StringBuilder f124054b;

    /* renamed from: c */
    private int f124055c;

    public bkdp(FormEditText formEditText) {
        this.f124053a = formEditText;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.b(java.lang.CharSequence, boolean):void
     arg types: [java.lang.StringBuilder, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.b(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.b(java.lang.CharSequence, boolean):void */
    public final void afterTextChanged(Editable editable) {
        this.f124053a.mo71927b((CharSequence) this.f124054b, false);
        int i = this.f124055c;
        if (i < 0 || i > this.f124053a.f152001U.size()) {
            this.f124055c = this.f124053a.f152001U.size();
        }
        this.f124053a.mo71932d(this.f124055c);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f124054b = new StringBuilder(charSequence.length());
        this.f124055c = -1;
        if (this.f124053a.mo71922a(i2, i3)) {
            int size = this.f124053a.f152001U.size();
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = ((Integer) this.f124053a.f152001U.get(i4)).intValue();
                if (this.f124055c < 0 && intValue >= i + 1) {
                    if (this.f124054b.length() > 0) {
                        int length = this.f124054b.length() - 1;
                        this.f124055c = length;
                        this.f124054b.deleteCharAt(length);
                    } else {
                        this.f124055c = 0;
                    }
                }
                if (intValue >= charSequence.length()) {
                    break;
                }
                this.f124054b.append(charSequence.charAt(intValue));
            }
            if (this.f124055c < 0) {
                int length2 = this.f124054b.length() - 1;
                this.f124055c = length2;
                this.f124054b.deleteCharAt(length2);
                return;
            }
            return;
        }
        int size2 = this.f124053a.f152001U.size();
        for (int i5 = 0; i5 < size2; i5++) {
            int intValue2 = ((Integer) this.f124053a.f152001U.get(i5)).intValue();
            if (intValue2 < i) {
                this.f124054b.append(charSequence.charAt(intValue2));
            } else {
                if (this.f124055c < 0) {
                    this.f124055c = this.f124054b.length();
                }
                if (intValue2 >= charSequence.length()) {
                    return;
                }
                if (intValue2 >= i + i2) {
                    this.f124054b.append(charSequence.charAt(intValue2));
                }
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f124055c;
        if (i4 >= 0) {
            this.f124054b.insert(i4, charSequence, i, i + i3);
            this.f124055c += i3;
        }
    }
}
