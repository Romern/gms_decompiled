package p000;

import android.text.TextUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.DateEditText;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: bkcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkcl extends bkgj {

    /* renamed from: a */
    private static final TimeZone f124009a = TimeZone.getTimeZone("UTC");

    /* renamed from: e */
    private final DateEditText f124010e;

    /* renamed from: f */
    private final bjvf f124011f;

    /* renamed from: g */
    private final GregorianCalendar f124012g;

    /* renamed from: h */
    private final GregorianCalendar f124013h;

    /* renamed from: i */
    private final CharSequence f124014i = this.f124010e.mo71936l();

    /* renamed from: j */
    private final String f124015j;

    /* renamed from: k */
    private final String f124016k;

    public bkcl(DateEditText dateEditText, blxc blxc, blxc blxc2) {
        this.f124010e = dateEditText;
        this.f124011f = dateEditText.f151943l;
        this.f124015j = this.f124011f.mo65561a(blxc.f128042d, blxc.f128041c, blxc.f128040b);
        this.f124016k = this.f124011f.mo65561a(blxc2.f128042d, blxc2.f128041c, blxc2.f128040b);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(blxc.f128040b, blxc.f128041c - 1, blxc.f128042d);
        this.f124012g = gregorianCalendar;
        gregorianCalendar.setTimeZone(f124009a);
        this.f124012g.setLenient(false);
        try {
            this.f124012g.getTime();
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(blxc2.f128040b, blxc2.f128041c - 1, blxc2.f128042d);
            this.f124013h = gregorianCalendar2;
            gregorianCalendar2.setTimeZone(f124009a);
            this.f124013h.setLenient(false);
            try {
                this.f124013h.getTime();
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid maximum date, check the date component order?", e);
            }
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Invalid minimum date, check the date component order?", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015a  */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        int i;
        char c;
        if (TextUtils.isEmpty(textView.getText())) {
            return true;
        }
        int g = this.f124010e.mo66001g();
        int h = this.f124010e.mo66002h();
        int i2 = this.f124010e.mo66003i();
        char c2 = 4;
        if (!TextUtils.isEmpty(this.f124010e.f151936e)) {
            if (this.f124011f.f123380d != 4) {
                c = 0;
                i = 0;
            } else if (i2 < 1000) {
                c = 10;
            } else {
                c = 0;
                i = 0;
            }
            if (!TextUtils.isEmpty(this.f124010e.f151935d)) {
                i++;
                c = 2;
            } else if (h <= 0 || h > 12) {
                i++;
                c = 5;
            }
            if (TextUtils.isEmpty(this.f124010e.f151934c)) {
                i++;
                c = 1;
            }
            if (i <= 1 && !TextUtils.isEmpty(this.f124014i)) {
                c2 = 7;
            } else if (i == 1) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i2, h - 1, 1);
                gregorianCalendar.setTimeZone(f124009a);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(5, g);
                try {
                    gregorianCalendar.get(5);
                    c2 = gregorianCalendar.compareTo(this.f124012g) >= 0 ? gregorianCalendar.compareTo(this.f124013h) > 0 ? (char) 9 : 0 : 8;
                } catch (IllegalArgumentException e) {
                }
            } else {
                c2 = c;
            }
            switch (c2) {
                case 0:
                    this.f124209b = null;
                    return true;
                case 1:
                    this.f124209b = this.f124010e.getContext().getString(C0126R.string.wallet_uic_error_day_must_not_be_empty);
                    return false;
                case 2:
                    this.f124209b = this.f124010e.getContext().getString(C0126R.string.wallet_uic_error_month_must_not_be_empty);
                    return false;
                case 3:
                    this.f124209b = this.f124010e.getContext().getString(C0126R.string.wallet_uic_error_year_must_not_be_empty);
                    return false;
                case 4:
                    this.f124209b = this.f124010e.getContext().getString(C0126R.string.wallet_uic_error_day_invalid);
                    return false;
                case 5:
                    this.f124209b = this.f124010e.getContext().getString(C0126R.string.wallet_uic_error_month_invalid);
                    return false;
                case 6:
                    this.f124209b = this.f124010e.getContext().getString(C0126R.string.wallet_uic_error_year_invalid);
                    return false;
                case 7:
                    this.f124209b = this.f124010e.getContext().getString(C0126R.string.wallet_uic_error_date_invalid, this.f124014i);
                    return false;
                case 8:
                    this.f124209b = this.f124010e.getContext().getString(C0126R.string.wallet_uic_error_date_before_min_date, this.f124015j);
                    return false;
                case 9:
                    this.f124209b = this.f124010e.getContext().getString(C0126R.string.wallet_uic_error_date_after_max_date, this.f124016k);
                    return false;
                default:
                    this.f124209b = this.f124010e.getContext().getString(C0126R.string.wallet_uic_error_year_length);
                    return false;
            }
        } else {
            c = 3;
        }
        i = 1;
        if (!TextUtils.isEmpty(this.f124010e.f151935d)) {
        }
        if (TextUtils.isEmpty(this.f124010e.f151934c)) {
        }
        if (i <= 1) {
        }
        if (i == 1) {
        }
        switch (c2) {
        }
    }
}
