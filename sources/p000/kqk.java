package p000;

import android.app.PendingIntent;
import android.view.autofill.AutofillValue;
import com.google.android.gms.autofill.fill.FillField;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* renamed from: kqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class kqk {
    /* renamed from: a */
    public static AutofillValue m18329a(FillField fillField, kqk kqk) {
        int i = fillField.f11632b;
        if (i == 1) {
            return kqk.mo14780c();
        }
        if (i == 3) {
            return kqk.mo14777a(fillField.f11633c);
        }
        if (i == 4) {
            return kqk.mo14811d();
        }
        if (!ccji.m130072c() || fillField.f11632b != 2) {
            return null;
        }
        return kqk.mo14776a(fillField.f11639i);
    }

    /* renamed from: b */
    public static final kqt m18332b(String str) {
        return new kqt(str);
    }

    /* renamed from: a */
    public abstract Object mo14778a();

    /* renamed from: b */
    public PendingIntent mo14779b() {
        return null;
    }

    /* renamed from: c */
    public abstract AutofillValue mo14780c();

    /* renamed from: d */
    public AutofillValue mo14811d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass().equals(obj.getClass())) {
            return mo14778a().equals(((kqk) obj).mo14778a());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(mo14778a());
    }

    public final String toString() {
        return String.format("FillValue[value=%s]", mo14778a());
    }

    /* renamed from: b */
    public static final kqu m18333b(int i) {
        return new kqu(i, 1);
    }

    /* renamed from: a */
    public static final kpz m18330a(PendingIntent pendingIntent) {
        return new kpz(pendingIntent);
    }

    /* renamed from: a */
    public static final kqr m18331a(int i) {
        return new kqr(i);
    }

    /* renamed from: a */
    public AutofillValue mo14776a(String str) {
        CharSequence textValue;
        AutofillValue c = mo14780c();
        if (!(c == null || (textValue = c.getTextValue()) == null)) {
            Locale locale = Locale.getDefault();
            if (str.toLowerCase(locale).equals(textValue.toString().toLowerCase(locale))) {
                return AutofillValue.forToggle(true);
            }
        }
        return null;
    }

    /* renamed from: a */
    public AutofillValue mo14777a(List list) {
        CharSequence textValue;
        String str;
        AutofillValue c = mo14780c();
        if (c == null || (textValue = c.getTextValue()) == null) {
            return null;
        }
        Locale locale = Locale.getDefault();
        boolean n = ccip.f179070a.mo6606a().mo76051n();
        if (!n) {
            str = textValue.toString();
        } else {
            str = textValue.toString().toLowerCase(locale);
        }
        for (int i = 0; i < list.size(); i++) {
            CharSequence charSequence = (CharSequence) list.get(i);
            if (charSequence != null) {
                if (n) {
                    if (str.contentEquals(charSequence.toString().toLowerCase(locale))) {
                        return AutofillValue.forList(i);
                    }
                } else if (str.contentEquals(charSequence)) {
                    return AutofillValue.forList(i);
                }
            }
        }
        return null;
    }
}
