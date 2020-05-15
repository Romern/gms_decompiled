package p000;

import com.google.android.gms.autofill.fill.FillField;
import java.util.function.Consumer;

/* renamed from: kzb */
final /* synthetic */ class kzb implements Consumer {

    /* renamed from: a */
    private final bnhp f25440a;

    public kzb(bnhp bnhp) {
        this.f25440a = bnhp;
    }

    public final void accept(Object obj) {
        FillField fillField = (FillField) obj;
        this.f25440a.mo67730b(Integer.valueOf(fillField.f11637g), fillField);
    }
}
