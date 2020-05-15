package p000;

import android.view.autofill.AutofillValue;
import java.util.List;

/* renamed from: kqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqu extends kqq {

    /* renamed from: b */
    private final int f24816b;

    public kqu(int i, int i2) {
        super(i);
        this.f24816b = i2;
    }

    /* renamed from: a */
    public final AutofillValue mo14777a(List list) {
        int i = 0;
        while (i < list.size()) {
            try {
                if (this.f24813a % 2000 == Integer.parseInt((String) list.get(i)) % 2000) {
                    return AutofillValue.forList(i);
                }
                i++;
            } catch (NumberFormatException e) {
                if (i != 0) {
                    break;
                }
            }
        }
        return super.mo14777a(list);
    }

    /* renamed from: c */
    public final AutofillValue mo14780c() {
        if (this.f24816b != 1) {
            return AutofillValue.forText(String.valueOf(this.f24813a % 100));
        }
        return AutofillValue.forText(String.valueOf(this.f24813a));
    }
}
