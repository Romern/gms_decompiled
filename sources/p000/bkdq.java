package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.p097ui.common.FormEditText;

/* renamed from: bkdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkdq implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ FormEditText f124056a;

    /* renamed from: b */
    private int f124057b = -1;

    /* renamed from: c */
    private String f124058c = null;

    /* renamed from: d */
    private Character f124059d = null;

    public bkdq(FormEditText formEditText) {
        this.f124056a = formEditText;
    }

    public final void afterTextChanged(Editable editable) {
        int i;
        int indexOf;
        String a = this.f124056a.f152000T.mo65914a(editable);
        if (!editable.toString().equals(a)) {
            int i2 = 0;
            this.f124056a.mo71930c(a, false);
            bkeq bkeq = this.f124056a.f152000T;
            String str = this.f124058c;
            int i3 = this.f124057b;
            Character ch = this.f124059d;
            int length = a.length();
            bmnl bmnl = bkeq.f124099a;
            if (bmnl.f130122d && a.startsWith(bmnl.f130121c)) {
                i = bkeq.f124099a.f130121c.length();
            } else {
                bmnl bmnl2 = bkeq.f124099a;
                if (bmnl2.f130122d || !a.endsWith(bmnl2.f130121c)) {
                    i = 0;
                } else {
                    length -= bkeq.f124099a.f130121c.length();
                    i = 0;
                }
            }
            int length2 = str.length();
            while (i2 <= i3 && i2 < length2 && i < length) {
                Character valueOf = Character.valueOf(str.charAt(i2));
                Character valueOf2 = Character.valueOf(a.charAt(i));
                if (ch == null || i2 != i3 || !ch.equals(valueOf2)) {
                    if (Character.isDigit(valueOf.charValue())) {
                        Character valueOf3 = Character.valueOf(a.charAt(i));
                        while (valueOf3 != null && !bkeq.mo65915a(valueOf3)) {
                            i++;
                            valueOf3 = i < length ? Character.valueOf(a.charAt(i)) : null;
                        }
                    } else if (valueOf.equals(bkeq.f124101c) && (indexOf = a.indexOf(bkeq.f124101c.charValue(), i)) >= i) {
                        i = indexOf;
                    }
                    if (i >= length) {
                        break;
                    }
                    if (valueOf.equals(Character.valueOf(a.charAt(i))) && i2 != i3) {
                        i++;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            this.f124056a.setSelection(i);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f124059d = this.f124056a.mo71922a(i2, i3) ? Character.valueOf(charSequence.charAt(i)) : null;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f124057b = i + i3;
        this.f124058c = charSequence.toString();
    }
}
