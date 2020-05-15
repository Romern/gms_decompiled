package p000;

import android.util.Log;

/* renamed from: aunx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunx {

    /* renamed from: a */
    public final String f92181a;

    /* renamed from: b */
    private final String f92182b;

    /* renamed from: c */
    private final int f92183c;

    public aunx(String str, String... strArr) {
        String str2;
        int length = strArr.length;
        if (length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        sdo.m34977c(str);
        this.f92181a = str;
        sdo.m34959a((Object) str2);
        this.f92182b = str2;
        String str4 = this.f92181a;
        int i = 2;
        while (i <= 7 && !Log.isLoggable(str4, i)) {
            i++;
        }
        this.f92183c = i;
    }

    /* renamed from: b */
    private final String m77415b(String str, Object[] objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return this.f92182b.concat(str);
    }

    /* renamed from: a */
    public final aunw mo50710a(String str, Throwable th, Object... objArr) {
        return new aunw(this, m77415b(str, objArr), th);
    }

    /* renamed from: a */
    public final boolean mo50712a(int i) {
        return this.f92183c <= i;
    }

    /* renamed from: a */
    public final aunw mo50711a(String str, Object... objArr) {
        return new aunw(this, m77415b(str, objArr), null);
    }
}
