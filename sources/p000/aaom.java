package p000;

import java.util.Locale;

/* renamed from: aaom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaom implements Comparable {

    /* renamed from: d */
    public static final aaom f28701d = new aaom();

    /* renamed from: a */
    public final String f28702a;

    /* renamed from: b */
    public final String f28703b;

    /* renamed from: c */
    public final boolean f28704c;

    private aaom() {
        this.f28702a = "";
        this.f28703b = null;
        this.f28704c = false;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ((aaom) obj).f28702a.compareTo(this.f28702a);
    }

    public aaom(String str) {
        int i;
        String[] split = aaoo.f28705a.split(str);
        int length = split.length;
        if (length != 0) {
            boolean z = false;
            this.f28702a = split[0];
            String str2 = null;
            int i2 = 1;
            while (i2 < length) {
                String lowerCase = split[i2].toLowerCase(Locale.US);
                if (lowerCase.equals("rewrite") && (i = i2 + 1) < length) {
                    str2 = split[i];
                    i2 += 2;
                } else if (!lowerCase.equals("block")) {
                    throw new aaon(str.length() == 0 ? new String("Illegal rule: ") : "Illegal rule: ".concat(str));
                } else {
                    i2++;
                    z = true;
                }
            }
            this.f28703b = str2;
            this.f28704c = z;
            return;
        }
        throw new aaon("Empty rule");
    }
}
