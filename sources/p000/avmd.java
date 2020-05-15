package p000;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: avmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmd {

    /* renamed from: a */
    public static final Logger f93376a = avpq.m79016c("Ui");

    /* renamed from: b */
    public static final Pattern f93377b = Pattern.compile(String.format(Locale.US, "^%d$", 0));

    /* renamed from: c */
    public static final Pattern f93378c = Pattern.compile(String.format(Locale.US, "^%d,(\\d+)$", 1));

    /* renamed from: a */
    public static int m78785a(long j) {
        return m78786a(cfro.f185519a.mo6606a().mo82574a(), j);
    }

    /* renamed from: b */
    public static int m78787b(long j) {
        return m78786a(cfte.f185678a.mo6606a().mo82699b(), j);
    }

    /* renamed from: c */
    public static int m78788c(long j) {
        return m78786a(cfss.f185661a.mo6606a().mo82685a(), j);
    }

    /* renamed from: a */
    private static int m78786a(String str, long j) {
        if (bmxx.m108577a(str)) {
            return 0;
        }
        long j2 = 0;
        int i = 0;
        for (String str2 : bmyx.m108640a(',').mo66918a((CharSequence) str)) {
            try {
                j2 += Long.parseLong(str2.trim());
                if (j < j2) {
                    break;
                }
                i++;
            } catch (NumberFormatException e) {
                f93376a.mo25412b("Malformed elapsed time string: %s.", str2);
            }
        }
        return i;
    }
}
