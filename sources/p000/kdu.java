package p000;

import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.HashSet;
import java.util.Set;

/* renamed from: kdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdu extends kee {
    public kdu() {
        super(kdf.class, bnic.m109491a(kpb.PHONE_NUMBER, kpb.PHONE_COUNTRY_CODE, kpb.PHONE_NATIONAL));
    }

    /* renamed from: a */
    private static void m17705a(bnha bnha, FillField fillField, String str, CharSequence charSequence, Set set) {
        if (fillField == null || set.add(fillField)) {
            kdn.m17675a(bnha, fillField, str, charSequence, (CharSequence) null, (kcz) null);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnhe mo14409a(Object obj, FillForm fillForm) {
        kdf kdf = (kdf) obj;
        String str = kdf.f23867b;
        bnha h = bnhe.m109414h();
        HashSet hashSet = new HashSet();
        bnre i = fillForm.mo7950b(kpb.PHONE_NUMBER).listIterator();
        while (i.hasNext()) {
            m17705a(h, (FillField) i.next(), kdf.f23866a, str, hashSet);
        }
        bnre i2 = fillForm.mo7950b(kpb.PHONE_COUNTRY_CODE).listIterator();
        while (i2.hasNext()) {
            m17705a(h, (FillField) i2.next(), kdf.f23869d, str, hashSet);
        }
        bnre i3 = fillForm.mo7950b(kpb.PHONE_NATIONAL).listIterator();
        while (i3.hasNext()) {
            m17705a(h, (FillField) i3.next(), kdf.f23870e, str, hashSet);
        }
        return h.mo67618b();
    }
}
