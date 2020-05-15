package p000;

import android.view.autofill.AutofillValue;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Locale;

/* renamed from: kqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqs extends kqk {

    /* renamed from: a */
    private final YearMonth f24814a;

    public kqs(YearMonth yearMonth) {
        this.f24814a = yearMonth;
    }

    /* renamed from: a */
    public final Object mo14778a() {
        return this.f24814a;
    }

    /* renamed from: c */
    public final AutofillValue mo14780c() {
        return AutofillValue.forText(String.format(Locale.getDefault(), "%02d/%02d", Integer.valueOf(this.f24814a.getMonthValue()), Integer.valueOf(this.f24814a.getYear() % 100)));
    }

    /* renamed from: d */
    public final AutofillValue mo14811d() {
        return AutofillValue.forDate(this.f24814a.atDay(1).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }
}
