package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aueb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aueb extends auej {

    /* renamed from: a */
    String f91470a = "";

    /* renamed from: b */
    boolean f91471b = false;

    public aueb(String str) {
        super(str);
        String str2;
        int i = 0;
        while (Pattern.compile("index").matcher(str).find()) {
            i++;
        }
        if (i == 1) {
            if (!str.contains("cause")) {
                this.f91471b = false;
                return;
            }
        } else if (i == 0) {
            mo50487b();
            return;
        }
        this.f91471b = true;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            str2 = split[split.length - 2];
        } else if (str.contains(";")) {
            str2 = str.split(";", -1)[0];
        } else {
            mo50487b();
            return;
        }
        Matcher matcher = Pattern.compile("sip\\D*(\\+\\d+)").matcher(str2);
        if (matcher.find()) {
            this.f91470a = matcher.group(1);
        }
        Matcher matcher2 = Pattern.compile("cause\\D*(\\d+)").matcher(str2);
        if (matcher2.find()) {
            try {
                Integer.parseInt(matcher2.group(1));
            } catch (NumberFormatException e) {
                mo50487b();
            }
        }
        Matcher matcher3 = Pattern.compile("@(\\S[^\\>\\;]+)").matcher(str2);
        if (matcher3.find()) {
            matcher3.group(1);
        }
        Matcher matcher4 = Pattern.compile("rn\\D*(\\d+)").matcher(str2);
        if (matcher4.find()) {
            matcher4.group(1);
        }
    }
}
