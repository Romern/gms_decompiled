package p000;

import android.text.TextUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.DateEditText;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: bkdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkdc extends bkgj {

    /* renamed from: a */
    private static final TimeZone f124034a = TimeZone.getTimeZone("UTC");

    /* renamed from: e */
    private final DateEditText f124035e;

    /* renamed from: f */
    private final GregorianCalendar f124036f;

    /* renamed from: g */
    private final GregorianCalendar f124037g;

    public bkdc(DateEditText dateEditText, blxc blxc, blxc blxc2) {
        this.f124035e = dateEditText;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(blxc.f128040b, blxc.f128041c - 1, 1);
        this.f124036f = gregorianCalendar;
        gregorianCalendar.setTimeZone(f124034a);
        this.f124036f.setLenient(false);
        try {
            this.f124036f.getTime();
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(blxc2.f128040b, blxc2.f128041c - 1, 1);
            this.f124037g = gregorianCalendar2;
            gregorianCalendar2.setTimeZone(f124034a);
            this.f124037g.setLenient(false);
            try {
                this.f124037g.getTime();
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid maximum date, check the date component order?", e);
            }
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Invalid minimum date, check the date component order?", e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        char c;
        if (TextUtils.isEmpty(textView.getText())) {
            return true;
        }
        int h = this.f124035e.mo66002h();
        int i = this.f124035e.mo66003i();
        if (h <= 0 || h > 12) {
            c = 2;
        } else if (i != 0) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, h - 1, 1);
            gregorianCalendar.setTimeZone(f124034a);
            c = gregorianCalendar.compareTo(this.f124036f) >= 0 ? gregorianCalendar.compareTo(this.f124037g) > 0 ? (char) 1 : 0 : 65535;
        } else {
            c = 3;
        }
        if (c == 65535) {
            this.f124209b = this.f124035e.getContext().getString(C0126R.string.wallet_uic_error_expired_credit_card);
            return false;
        } else if (c == 0) {
            this.f124209b = null;
            return true;
        } else if (c == 1) {
            this.f124209b = this.f124035e.getContext().getString(C0126R.string.wallet_uic_error_year_invalid);
            return false;
        } else if (c != 2) {
            this.f124209b = this.f124035e.getContext().getString(C0126R.string.wallet_uic_error_year_must_not_be_empty);
            return false;
        } else {
            this.f124209b = this.f124035e.getContext().getString(C0126R.string.wallet_uic_error_month_invalid);
            return false;
        }
    }
}
