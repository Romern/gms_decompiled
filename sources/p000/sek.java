package p000;

import android.util.Log;
import java.util.Locale;

/* renamed from: sek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class sek {

    /* renamed from: a */
    public final String f44092a;

    /* renamed from: b */
    private final String f44093b;

    /* renamed from: c */
    private final int f44094c;

    public sek(String str) {
        this("SmsRetriever", str);
    }

    /* renamed from: a */
    public static final String m35081a(Object obj) {
        if (obj == null) {
            return "<NULL>";
        }
        String trim = obj.toString().trim();
        if (trim.isEmpty()) {
            return "<EMPTY>";
        }
        return String.format("<ELLIDED:%s>", Integer.valueOf(trim.hashCode()));
    }

    /* renamed from: a */
    public boolean mo19637a(int i) {
        return this.f44094c <= i;
    }

    /* renamed from: b */
    public final void mo25411b(String str, Throwable th, Object... objArr) {
        if (mo19637a(3)) {
            Log.d(this.f44092a, mo25421g(str, objArr), th);
        }
    }

    /* renamed from: c */
    public final void mo25413c(String str, Throwable th, Object... objArr) {
        Log.i(this.f44092a, mo25421g(str, objArr), th);
    }

    /* renamed from: d */
    public final void mo25415d(String str, Throwable th, Object... objArr) {
        Log.w(this.f44092a, mo25421g(str, objArr), th);
    }

    /* renamed from: e */
    public final void mo25417e(String str, Throwable th, Object... objArr) {
        Log.e(this.f44092a, mo25421g(str, objArr), th);
    }

    /* renamed from: f */
    public final void mo25419f(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f44092a, mo25421g(str, objArr), th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo25421g(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f44093b.concat(str);
    }

    public sek(String str, String... strArr) {
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
        this.f44093b = str2;
        this.f44092a = str;
        new sbw(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f44092a, i)) {
            i++;
        }
        this.f44094c = i;
    }

    /* renamed from: b */
    public void mo25412b(String str, Object... objArr) {
        if (mo19637a(3)) {
            Log.d(this.f44092a, mo25421g(str, objArr));
        }
    }

    /* renamed from: c */
    public final void mo25414c(String str, Object... objArr) {
        Log.i(this.f44092a, mo25421g(str, objArr));
    }

    /* renamed from: d */
    public final void mo25416d(String str, Object... objArr) {
        Log.w(this.f44092a, mo25421g(str, objArr));
    }

    /* renamed from: e */
    public final void mo25418e(String str, Object... objArr) {
        Log.e(this.f44092a, mo25421g(str, objArr));
    }

    /* renamed from: f */
    public final void mo25420f(String str, Object... objArr) {
        Log.wtf(this.f44092a, mo25421g(str, objArr));
    }

    /* renamed from: a */
    public void mo25408a(String str, Throwable th, Object... objArr) {
        if (mo19637a(2)) {
            Log.v(this.f44092a, mo25421g(str, objArr), th);
        }
    }

    /* renamed from: a */
    public void mo25409a(String str, Object... objArr) {
        if (mo19637a(2)) {
            Log.v(this.f44092a, mo25421g(str, objArr));
        }
    }

    /* renamed from: a */
    public final void mo25410a(Throwable th) {
        Log.w(this.f44092a, th);
    }

    public sek(String... strArr) {
        this("Authzen", strArr);
    }

    public sek(String[] strArr, byte... bArr) {
        this("CryptauthV2", strArr);
    }

    public sek(String[] strArr, char... cArr) {
        this("EasyUnlock", strArr);
    }

    public sek(String[] strArr, int... iArr) {
        this("MagicTether", strArr);
    }

    public sek(String[] strArr, short... sArr) {
        this("Fido", strArr);
    }
}
