package p000;

import android.os.Build;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.fill.FillField;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: kqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqh {
    /* renamed from: a */
    public static bngx m18326a(Iterable iterable, int i) {
        bngs bngs = new bngs();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bngs.mo67668c(m18327a((kjl) it.next(), i));
        }
        return bngs.mo67664a();
    }

    /* renamed from: a */
    public static FillField m18327a(kjl kjl, int i) {
        String str;
        kom a = kjl.mo14516a();
        kqg a2 = FillField.m7129a();
        a2.mo14801a((AutofillId) a.f24609h);
        a2.f24794a = a.f24607f;
        a2.mo14808b((Collection) kjl.mo14517b());
        a2.f24795b = kjl.mo14519d();
        a2.mo14805a(kjl.mo14518c());
        a2.mo14807b((Iterable) kjl.mo14520e().values());
        a2.f24796c = i;
        CharSequence[] charSequenceArr = a.f24608g;
        if (charSequenceArr != null) {
            a2.mo14806a(charSequenceArr);
        }
        if (ccji.m130072c() && (str = a.f24606e) != null) {
            a2.f24798e = str;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = a.f24618q;
        if (i3 > 0) {
            a2.f24797d = i3;
        }
        return a2.mo14800a();
    }
}
