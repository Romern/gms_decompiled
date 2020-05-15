package p000;

import android.view.autofill.AutofillValue;

/* renamed from: kqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kqt extends kqk {

    /* renamed from: a */
    private final String f24815a;

    public kqt(String str) {
        this.f24815a = str;
    }

    /* renamed from: a */
    public final Object mo14778a() {
        return this.f24815a;
    }

    /* renamed from: c */
    public final AutofillValue mo14780c() {
        if (!this.f24815a.isEmpty()) {
            return AutofillValue.forText(this.f24815a);
        }
        return null;
    }
}
