package p000;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.p088ui.component.instrument.creditcard.CvcHintImageView;
import com.google.android.wallet.p097ui.creditcard.CreditCardNumberEditText;
import java.util.List;

/* renamed from: bkhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkhn implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ CreditCardNumberEditText f124226a;

    public bkhn(CreditCardNumberEditText creditCardNumberEditText) {
        this.f124226a = creditCardNumberEditText;
    }

    public final void afterTextChanged(Editable editable) {
        List list;
        CreditCardNumberEditText creditCardNumberEditText = this.f124226a;
        String str = creditCardNumberEditText.f152257b;
        Pair pair = creditCardNumberEditText.f152266k;
        if (pair != null) {
            list = ((bmhs) pair.second).f129485d;
        } else {
            list = CreditCardNumberEditText.f152256a;
        }
        StringBuilder sb = new StringBuilder((creditCardNumberEditText.mo71885j() + list.size()) - 1);
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (((Integer) list.get(i)).intValue() == i2) {
                sb.append(' ');
                i++;
                i2 = 0;
            }
            i2++;
            sb.append(str.charAt(i3));
        }
        String sb2 = sb.toString();
        if (!sb2.equals(editable.toString())) {
            editable.replace(0, editable.length(), sb2);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        bmno bmno;
        bmhu h = this.f124226a.mo66002h();
        CreditCardNumberEditText creditCardNumberEditText = this.f124226a;
        String a = bjyw.m104938a((CharSequence) creditCardNumberEditText.getText().toString());
        if (!(creditCardNumberEditText.f152266k == null && creditCardNumberEditText.f152268m == null) && !a.startsWith(creditCardNumberEditText.f152257b)) {
            creditCardNumberEditText.f152266k = null;
            creditCardNumberEditText.f152268m = null;
        }
        if (creditCardNumberEditText.f152266k == null && creditCardNumberEditText.f152264i != null) {
            creditCardNumberEditText.f152265j.clear();
            int size = creditCardNumberEditText.f152264i.size();
            for (int i5 = 0; i5 < size; i5++) {
                bmhu bmhu = (bmhu) creditCardNumberEditText.f152264i.get(i5);
                bxwc bxwc = bmhu.f129492b;
                int size2 = bxwc.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        break;
                    }
                    bmhs bmhs = (bmhs) bxwc.get(i6);
                    int min = Math.min(bmhs.f129482a.length(), a.length());
                    String substring = a.substring(0, min);
                    String substring2 = bmhs.f129482a.substring(0, min);
                    String substring3 = bmhs.f129483b.substring(0, min);
                    if (substring.compareTo(substring2) >= 0 && substring.compareTo(substring3) <= 0) {
                        creditCardNumberEditText.f152265j.add(bmhu);
                        break;
                    }
                    i6++;
                }
            }
            if (creditCardNumberEditText.f152265j.size() == 1) {
                bmhu bmhu2 = (bmhu) creditCardNumberEditText.f152265j.get(0);
                bmhs a2 = CreditCardNumberEditText.m118783a(bmhu2.f129492b, a);
                if (a2 != null) {
                    creditCardNumberEditText.f152266k = Pair.create(bmhu2, a2);
                }
            }
        }
        if (creditCardNumberEditText.f152268m == null) {
            creditCardNumberEditText.f152268m = CreditCardNumberEditText.m118783a(creditCardNumberEditText.f152267l, a);
        }
        int j = creditCardNumberEditText.mo71885j();
        if (a.length() > j) {
            a = a.substring(0, j);
        }
        creditCardNumberEditText.f152257b = a;
        if (creditCardNumberEditText.f152261f && creditCardNumberEditText.mo65775cO() && !creditCardNumberEditText.mo65798cL()) {
            creditCardNumberEditText.setTextColor(creditCardNumberEditText.getResources().getColor(C0126R.color.wallet_uic_error_color));
            bkfr.m105593b(creditCardNumberEditText.getContext(), creditCardNumberEditText);
        } else {
            creditCardNumberEditText.setTextColor(creditCardNumberEditText.f152258c);
        }
        bmhu h2 = this.f124226a.mo66002h();
        boolean z = !bjvn.m104717a(h, h2);
        bkho bkho = this.f124226a.f152263h;
        if (bkho != null) {
            if (z) {
                if (h2 != null) {
                    i4 = h2.f129494d;
                } else {
                    i4 = 4;
                }
                axbe axbe = (axbe) bkho;
                axbe.f95657d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i4)});
                if (!TextUtils.isEmpty(axbe.f95657d.getText())) {
                    axbe.f95657d.mo65799cM();
                }
                if (!axbe.f95671r) {
                    CvcHintImageView cvcHintImageView = axbe.f95669p;
                    if (h2 != null) {
                        String str = h2.f129498h;
                        String str2 = h2.f129497g;
                        if ((h2.f129491a & 8) != 0) {
                            bmno = h2.f129496f;
                            if (bmno == null) {
                                bmno = bmno.f130138m;
                            }
                        } else {
                            bmno = null;
                        }
                        cvcHintImageView.mo60106a(str, str2, bmno);
                    } else {
                        cvcHintImageView.mo60106a((String) null, (String) null, (bmno) null);
                    }
                }
            } else if (h2 != null) {
                return;
            }
            CreditCardNumberEditText creditCardNumberEditText2 = this.f124226a;
            ((axbe) creditCardNumberEditText2.f152263h).f95656c.mo60100a(creditCardNumberEditText2.f152265j);
        }
    }
}
