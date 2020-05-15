package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aues */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aues {

    /* renamed from: a */
    public int f91579a = 1;

    /* renamed from: b */
    private auek f91580b;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    public aues(String str) {
        char c;
        int i;
        Matcher matcher = Pattern.compile("tn-validation-(\\w+)").matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            int hashCode = group.hashCode();
            if (hashCode != -1281977283) {
                if (hashCode == -995381136 && group.equals("passed")) {
                    c = 0;
                    if (c != 0) {
                        i = c == 1 ? 3 : i;
                    } else {
                        i = 2;
                    }
                    this.f91579a = i;
                }
            } else if (group.equals("failed")) {
                c = 1;
                if (c != 0) {
                }
                this.f91579a = i;
            }
            c = 65535;
            if (c != 0) {
            }
            this.f91579a = i;
        }
        Matcher matcher2 = Pattern.compile("@(\\S[^\\>\\;]+)").matcher(str);
        if (matcher2.find()) {
            auek auek = new auek(matcher2.group(1));
            this.f91580b = auek;
            if (!auek.mo50489a().isEmpty()) {
                this.f91580b.mo50489a();
            }
        }
    }
}
