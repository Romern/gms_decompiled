package p000;

/* renamed from: avvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvj {

    /* renamed from: a */
    private final String f93972a;

    public avvj(String str) {
        this.f93972a = str;
    }

    /* renamed from: a */
    public final void mo51639a(String str, String str2) {
        if (chdz.f188510a.mo6606a().mo85159c() && !str.isEmpty()) {
            String[] split = str.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                if (!split[i].equals(this.f93972a)) {
                    i++;
                } else {
                    return;
                }
            }
            String str3 = this.f93972a;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 23 + str2.length());
            sb.append(str3);
            sb.append(" is not authorized for ");
            sb.append(str2);
            throw new SecurityException(sb.toString());
        }
    }
}
