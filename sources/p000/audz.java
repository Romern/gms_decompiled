package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: audz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audz extends auej {

    /* renamed from: a */
    public boolean f91467a;

    public audz(String str) {
        super(str);
        if (str.contains("3gpp-service.ims.icsi.mmtel")) {
            this.f91467a = true;
        }
        str.contains("video");
        str.contains("+g.gsma.rcs.telephony");
        if (str.contains("mobility")) {
            Matcher matcher = Pattern.compile("mobility\\W+(\\w+)").matcher(str);
            if (matcher.find()) {
                matcher.group(1);
            }
        }
    }
}
