package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.wallet.p097ui.common.FormEditText;
import java.util.regex.Pattern;

/* renamed from: bkgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkgi implements TextWatcher {

    /* renamed from: a */
    private final EditText f124205a;

    /* renamed from: b */
    private final bjwj f124206b;

    /* renamed from: c */
    private final bjwk f124207c;

    /* renamed from: d */
    private final Pattern f124208d;

    public bkgi(EditText editText, bjwj bjwj, bjwk bjwk) {
        bmnc bmnc;
        String str;
        bmnc bmnc2;
        bmnb bmnb;
        bmnb bmnb2;
        this.f124205a = editText;
        this.f124206b = bjwj;
        this.f124207c = bjwk;
        bmne bmne = bjwj.f123509a;
        if (bmne.f130091a == 2) {
            bmnc = (bmnc) bmne.f130092b;
        } else {
            bmnc = bmnc.f130080d;
        }
        Pattern pattern = null;
        if ((bmnc.f130082a & 1) == 0) {
            if (bmne.f130091a == 6) {
                bmnb = (bmnb) bmne.f130092b;
            } else {
                bmnb = bmnb.f130075d;
            }
            if ((bmnb.f130077a & 1) != 0) {
                if (bmne.f130091a == 6) {
                    bmnb2 = (bmnb) bmne.f130092b;
                } else {
                    bmnb2 = bmnb.f130075d;
                }
                bmmw bmmw = bmnb2.f130078b;
                str = (bmmw == null ? bmmw.f130060c : bmmw).f130063b;
            } else {
                str = null;
            }
        } else {
            if (bmne.f130091a == 2) {
                bmnc2 = (bmnc) bmne.f130092b;
            } else {
                bmnc2 = bmnc.f130080d;
            }
            bmmw bmmw2 = bmnc2.f130083b;
            str = (bmmw2 == null ? bmmw.f130060c : bmmw2).f130063b;
        }
        this.f124208d = str != null ? Pattern.compile(str) : pattern;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f124208d != null) {
            if (this.f124208d.matcher(((FormEditText) this.f124205a).mo71937m()).matches()) {
                this.f124207c.mo65590a(this.f124206b);
                return;
            }
            return;
        }
        this.f124207c.mo65590a(this.f124206b);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
