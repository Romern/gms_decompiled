package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bkeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkeo {

    /* renamed from: e */
    private static final Pattern f124094e = Pattern.compile("%[1-9%]");

    /* renamed from: a */
    public final bmnw f124095a;

    /* renamed from: b */
    public String[] f124096b;

    /* renamed from: c */
    public final HashSet f124097c = new HashSet();

    /* renamed from: d */
    final int[] f124098d;

    public bkeo(bmnw bmnw) {
        this.f124095a = bmnw;
        bxvw bxvw = bmnw.f130185b;
        int size = bxvw.size();
        for (int i = 0; i < size; i++) {
            this.f124097c.add(Long.valueOf(((Long) bxvw.get(i)).longValue()));
        }
        this.f124096b = new String[bmnw.f130185b.size()];
        String str = bmnw.f130184a;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f124094e.matcher(str);
        for (int i2 = 0; matcher.find(i2); i2 = matcher.end()) {
            arrayList.add(Integer.valueOf(matcher.start()));
        }
        this.f124098d = bjyu.m104930a(arrayList);
    }

    /* renamed from: a */
    public final void mo65910a(long j, String str) {
        int i;
        long[] a = bqcr.m112597a(this.f124095a.f130185b);
        int i2 = 0;
        if (a != null) {
            i = a.length;
        } else {
            i = 0;
        }
        while (true) {
            if (i2 < i) {
                if (a[i2] == j) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            this.f124097c.remove(Long.valueOf(j));
            this.f124096b[i2] = str;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* renamed from: b */
    public final String mo65913b() {
        if (!mo65911a()) {
            throw new IllegalStateException("Attempting to construct message before all values have been populated.");
        } else if (this.f124098d.length == 0) {
            return this.f124095a.f130184a;
        } else {
            StringBuilder sb = new StringBuilder();
            bmnw bmnw = this.f124095a;
            String str = bmnw.f130184a;
            int size = bmnw.f130185b.size();
            int length = str.length();
            int[] iArr = this.f124098d;
            int i = 0;
            for (int i2 : iArr) {
                sb.append((CharSequence) str, i, i2);
                int i3 = i2 + 1;
                i = i3 + 1;
                char charAt = str.charAt(i3);
                if (charAt != '%') {
                    int i4 = charAt - '1';
                    if (i4 < size) {
                        sb.append(this.f124096b[i4]);
                    } else {
                        StringBuilder sb2 = new StringBuilder(38);
                        sb2.append("No reference provided for parameter %");
                        sb2.append(charAt);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    sb.append('%');
                }
            }
            sb.append((CharSequence) str, i, length);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public final boolean mo65911a() {
        return this.f124097c.isEmpty() || this.f124098d.length == 0;
    }

    /* renamed from: a */
    public final boolean mo65912a(long j) {
        return this.f124097c.contains(Long.valueOf(j));
    }
}
