package p000;

import android.view.autofill.AutofillValue;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* renamed from: kqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqp extends kqk {

    /* renamed from: a */
    private final String f24808a;

    /* renamed from: b */
    private final String f24809b;

    /* renamed from: c */
    private final bngx f24810c;

    /* renamed from: d */
    private final bngx f24811d;

    /* renamed from: e */
    private final String f24812e;

    public kqp(String str, lrc lrc) {
        this.f24812e = str;
        this.f24808a = lrc.mo15386b(C0126R.string.autofill_gender_male).toString();
        this.f24809b = lrc.mo15386b(C0126R.string.autofill_gender_female).toString();
        this.f24810c = bngx.m109359a(lrc.mo15386b(C0126R.string.autofill_gender_male).toString(), lrc.mo15386b(C0126R.string.autofill_gender_male_man).toString(), lrc.mo15386b(C0126R.string.autofill_gender_male_boy).toString(), lrc.mo15386b(C0126R.string.autofill_gender_male_m).toString());
        this.f24811d = bngx.m109360a(lrc.mo15386b(C0126R.string.autofill_gender_female).toString(), lrc.mo15386b(C0126R.string.autofill_gender_female_woman).toString(), lrc.mo15386b(C0126R.string.autofill_gender_female_girl).toString(), lrc.mo15386b(C0126R.string.autofill_gender_female_w).toString(), lrc.mo15386b(C0126R.string.autofill_gender_female_f).toString());
    }

    /* renamed from: a */
    public final AutofillValue mo14776a(String str) {
        if (!this.f24812e.isEmpty()) {
            Locale locale = Locale.getDefault();
            String lowerCase = this.f24812e.toLowerCase(locale);
            String lowerCase2 = str.toLowerCase(locale);
            if ((this.f24808a.equals(lowerCase) && this.f24810c.contains(lowerCase2)) || (this.f24809b.equals(lowerCase) && this.f24811d.contains(lowerCase2))) {
                return AutofillValue.forToggle(true);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Object mo14778a() {
        return this.f24812e;
    }

    /* renamed from: c */
    public final AutofillValue mo14780c() {
        if (!this.f24812e.isEmpty()) {
            return AutofillValue.forText(this.f24812e);
        }
        return null;
    }
}
