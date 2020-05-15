package p000;

import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: kdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class kdn {

    /* renamed from: a */
    public static final srn f23894a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    protected static void m17675a(bnha bnha, FillField fillField, String str, CharSequence charSequence, CharSequence charSequence2, kcz kcz) {
        if (str != null && !str.isEmpty()) {
            m17676a(bnha, fillField, kqk.m18332b(str), charSequence, charSequence2, kcz);
        }
    }

    /* renamed from: a */
    public abstract bnhe mo14409a(Object obj, FillForm fillForm);

    /* renamed from: a */
    public abstract Class mo14410a();

    /* renamed from: a */
    public abstract Object mo14411a(bnht bnht);

    /* renamed from: a */
    public abstract boolean mo14412a(bnic bnic);

    /* renamed from: a */
    protected static final void m17676a(bnha bnha, FillField fillField, kqk kqk, CharSequence charSequence, CharSequence charSequence2, kcz kcz) {
        kqc kqc = new kqc(kqk, charSequence, charSequence2, kcz);
        if (fillField != null) {
            bnha.mo67695b(fillField, kqc);
        }
    }
}
