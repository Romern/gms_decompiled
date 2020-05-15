package p000;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ytz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ytz implements Comparable {

    /* renamed from: a */
    public static final ytz f54629a = m44830a(0, 0, 0);

    /* renamed from: b */
    private static final srn f54630b = zvt.m46581a();

    /* renamed from: a */
    public static ytz m44830a(int i, int i2, int i3) {
        return new ytx(i, i2, i3);
    }

    /* renamed from: a */
    public abstract int mo30774a();

    /* renamed from: b */
    public abstract int mo30775b();

    /* renamed from: c */
    public abstract int mo30776c();

    public final String toString() {
        return String.format(Locale.ENGLISH, "%d.%d.%d", Integer.valueOf(mo30774a()), Integer.valueOf(mo30775b()), Integer.valueOf(mo30776c()));
    }

    /* renamed from: a */
    public static ytz m44831a(String str) {
        int i;
        int i2;
        Matcher matcher = Pattern.compile("([0-9]+)(.([0-9]+)(.([0-9]+))?)?").matcher(str);
        if (!matcher.matches()) {
            ((bnsl) f54630b.mo68388c()).mo68420a("Invalid SDK Version [%s]", bryx.m114908a(str));
            return f54629a;
        }
        try {
            String group = matcher.group(1);
            String group2 = matcher.group(3);
            String group3 = matcher.group(5);
            int i3 = 0;
            if (group != null) {
                i = Integer.parseInt(group);
            } else {
                i = 0;
            }
            if (group2 != null) {
                i2 = Integer.parseInt(group2);
            } else {
                i2 = 0;
            }
            if (group3 != null) {
                i3 = Integer.parseInt(group3);
            }
            return m44830a(i, i2, i3);
        } catch (NumberFormatException e) {
            bnsl bnsl = (bnsl) f54630b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Invalid SDK Version [%s]", bryx.m114908a(str));
            return f54629a;
        }
    }

    /* renamed from: a */
    public final int compareTo(ytz ytz) {
        int compare = Integer.compare(mo30774a(), ytz.mo30774a());
        return (compare == 0 && (compare = Integer.compare(mo30775b(), ytz.mo30775b())) == 0) ? Integer.compare(mo30776c(), ytz.mo30776c()) : compare;
    }
}
