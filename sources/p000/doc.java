package p000;

/* renamed from: doc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class doc implements Comparable {

    /* renamed from: e */
    public static final doc f13674e = new doc();

    /* renamed from: a */
    public final String f13675a;

    /* renamed from: b */
    public final String f13676b;

    /* renamed from: c */
    public final String f13677c;

    /* renamed from: d */
    public final boolean f13678d;

    private doc() {
        this.f13675a = "DEFAULT";
        this.f13676b = "";
        this.f13677c = null;
        this.f13678d = false;
    }

    public final int compareTo(Object obj) {
        return ((doc) obj).f13676b.compareTo(this.f13676b);
    }

    public doc(String str, String str2) {
        int i;
        this.f13675a = str;
        String[] split = doe.f13679a.split(str2);
        if (split.length != 0) {
            boolean z = false;
            this.f13676b = split[0];
            String str3 = null;
            int i2 = 1;
            while (true) {
                int length = split.length;
                if (i2 < length) {
                    String lowerCase = split[i2].toLowerCase();
                    if (lowerCase.equals("rewrite") && (i = i2 + 1) < length) {
                        str3 = split[i];
                        i2 += 2;
                    } else if (!lowerCase.equals("block")) {
                        throw new dod(str2.length() == 0 ? new String("Illegal rule: ") : "Illegal rule: ".concat(str2));
                    } else {
                        i2++;
                        z = true;
                    }
                } else {
                    this.f13677c = str3;
                    this.f13678d = z;
                    return;
                }
            }
        } else {
            throw new dod("Empty rule");
        }
    }
}
