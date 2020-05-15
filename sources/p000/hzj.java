package p000;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: hzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hzj implements hzs {

    /* renamed from: a */
    private static final Logger f20590a = new Logger("OtpMessageDetector");

    /* renamed from: b */
    private static final Pattern f20591b = Pattern.compile("(^|[\\s:;!\\.,\\\"'\\(]|[a-zA-Z]-|[^\\u0000-\\u007F])(?=[a-zA-Z]*[0-9]+)([a-zA-Z0-9]{4,10})($|[\\s:;!\\.,\\\"'\\)]|[^\\u0000-\\u007F])");

    /* renamed from: a */
    public final bngx mo12829a(String str) {
        if (TextUtils.isEmpty(str)) {
            f20590a.mo25416d("Message body is empty.", new Object[0]);
            return bngx.m109376e();
        }
        bngs bngs = new bngs();
        Matcher matcher = f20591b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(2);
            if (group != null) {
                f20590a.mo25412b("Found OTP: %s", group);
                bngs.mo67668c(group);
            }
        }
        return bngs.mo67664a();
    }
}
