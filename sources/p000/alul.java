package p000;

import java.util.Arrays;

/* renamed from: alul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alul {

    /* renamed from: a */
    public final String f74307a;

    /* renamed from: b */
    public final String f74308b;

    /* renamed from: c */
    public final int f74309c;

    /* renamed from: d */
    public final String f74310d;

    public alul(String str, String str2, int i, String str3) {
        this.f74307a = str;
        this.f74308b = str2;
        this.f74309c = i;
        this.f74310d = str3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo40797a(int i) {
        String str;
        String str2 = this.f74310d;
        if (str2 == null) {
            return null;
        }
        if (i >= 2) {
            StringBuilder sb = new StringBuilder(13);
            sb.append(" x");
            sb.append(i);
            str = sb.toString();
        } else {
            str = "";
        }
        if (str2.length() + str.length() > 50000) {
            String substring = str2.substring(0, 50000 - (str.length() + 1));
            StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(str).length());
            sb2.append(substring);
            sb2.append(8230);
            sb2.append(str);
            return sb2.toString();
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alul) {
            alul alul = (alul) obj;
            if (!sdg.m34949a(this.f74307a, alul.f74307a) || !sdg.m34949a(this.f74308b, alul.f74308b) || !sdg.m34949a(Integer.valueOf(this.f74309c), Integer.valueOf(alul.f74309c)) || !sdg.m34949a(this.f74310d, alul.f74310d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f74307a, this.f74308b, Integer.valueOf(this.f74309c), this.f74310d});
    }
}
