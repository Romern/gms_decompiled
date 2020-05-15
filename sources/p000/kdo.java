package p000;

import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: kdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdo extends kee {
    public kdo() {
        super(kcy.class, bnic.m109489a(kpb.EMAIL_ADDRESS));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnhe mo14409a(Object obj, FillForm fillForm) {
        kcy kcy = (kcy) obj;
        bnha h = bnhe.m109414h();
        bnre i = fillForm.mo7950b(kpb.EMAIL_ADDRESS).listIterator();
        while (i.hasNext()) {
            String str = kcy.f23845b;
            kdn.m17675a(h, (FillField) i.next(), str, str, (CharSequence) null, (kcz) null);
        }
        return h.mo67618b();
    }
}
