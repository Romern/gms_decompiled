package p000;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: bjow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjow extends bjht {

    /* renamed from: b */
    private final Pattern f123060b;

    /* renamed from: c */
    private final Pattern f123061c;

    public bjow(bjhw bjhw, String str, bwuq bwuq, int i) {
        super(bjhw, str, i);
        Pattern pattern;
        Pattern pattern2;
        String str2 = bwuq.f161056b;
        if (!TextUtils.isEmpty(str2)) {
            pattern = Pattern.compile(str2);
        } else {
            pattern = null;
        }
        this.f123061c = pattern;
        String str3 = bwuq.f161055a;
        if (!TextUtils.isEmpty(str3)) {
            pattern2 = Pattern.compile(str3);
        } else {
            pattern2 = this.f123061c;
        }
        this.f123060b = pattern2;
        boolean z = true;
        if (this.f123061c == null && pattern2 == null) {
            z = false;
        }
        bmxy.m108589a(z, "terminal_regex and validity_regex cannot both be empty.");
    }

    /* renamed from: a */
    public final boolean mo65090a() {
        return this.f123060b.matcher(((bjhw) this.f122747a).f122753d).matches();
    }

    /* renamed from: c */
    public final boolean mo65092c() {
        Pattern pattern = this.f123061c;
        return pattern != null && pattern.matcher(((bjhw) this.f122747a).f122753d).matches();
    }

    public bjow(bjhw bjhw, String str, String str2, int i) {
        super(bjhw, str, i);
        bmxy.m108589a(!TextUtils.isEmpty(str2), "Regex cannot be empty for RegexValidator.");
        this.f123060b = Pattern.compile(str2);
        this.f123061c = null;
    }
}
