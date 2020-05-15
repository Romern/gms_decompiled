package p000;

import android.view.autofill.AutofillValue;

/* renamed from: kdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kdm {
    /* renamed from: a */
    static int m17671a(int i) {
        return i < 100 ? i + 2000 : i;
    }

    /* renamed from: b */
    static kdj m17674b(bngm bngm) {
        String a = m17672a(bngm);
        if (a != null) {
            return new kdj(a);
        }
        return null;
    }

    /* renamed from: a */
    static String m17672a(bngm bngm) {
        String a;
        bnrd a2 = bngm.iterator();
        while (a2.hasNext()) {
            AutofillValue autofillValue = ((kef) a2.next()).f23923b;
            if (autofillValue != null && autofillValue.isText() && (a = m17673a(autofillValue.getTextValue())) != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    static String m17673a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        return charSequence.toString();
    }
}
