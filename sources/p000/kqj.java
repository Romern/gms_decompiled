package p000;

import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: kqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqj {
    /* renamed from: a */
    public static FillForm m18328a(kjp kjp, bmxv bmxv, int i) {
        FillField fillField;
        bngs b = bngx.m109371b(kjp.f24265b.size());
        bnre i2 = kjp.f24265b.listIterator();
        while (i2.hasNext()) {
            b.mo67668c(kqh.m18327a((kjl) i2.next(), i));
        }
        if (kjp.f24267d.mo66813a()) {
            kjj kjj = (kjj) kjp.f24267d.mo66814b();
            kom a = kjj.mo14510a();
            kqg a2 = FillField.m7129a();
            a2.mo14801a((AutofillId) a.f24609h);
            kpb kpb = kpb.SUBMIT;
            new kpb[1][0] = kpb;
            a2.mo14804a(kpb);
            a2.f24795b = kjj.mo14512c();
            a2.mo14805a(kjj.mo14511b());
            a2.f24796c = i;
            fillField = a2.mo14800a();
        } else {
            fillField = null;
        }
        return new FillForm(kjp.f24269f, b.mo67664a(), bmxv.m108567c(fillField), kjp.f24264a, bmxv);
    }
}
