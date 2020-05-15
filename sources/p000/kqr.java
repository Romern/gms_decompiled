package p000;

import android.view.autofill.AutofillValue;
import java.util.List;

/* renamed from: kqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqr extends kqq {
    public kqr(int i) {
        super(i);
    }

    /* renamed from: a */
    public final AutofillValue mo14777a(List list) {
        int i = this.f24813a;
        if (i > 0 && i <= 12) {
            if (list.size() == 13) {
                return AutofillValue.forList(this.f24813a);
            }
            if (list.size() == 12) {
                return AutofillValue.forList(this.f24813a - 1);
            }
        }
        return super.mo14777a(list);
    }
}
