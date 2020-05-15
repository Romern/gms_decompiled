package p000;

import android.os.Build;
import android.util.Log;
import java.util.Locale;

/* renamed from: asco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asco extends sek {

    /* renamed from: b */
    public final String f88711b;

    /* renamed from: c */
    private final String f88712c;

    public asco(String str, String... strArr) {
        super(str, strArr);
        String str2;
        this.f88711b = str;
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
        this.f88712c = str2;
    }

    /* renamed from: a */
    public static final boolean m73782a() {
        return "user".equals(Build.TYPE);
    }

    /* renamed from: b */
    public final void mo25412b(String str, Object... objArr) {
        if (mo19637a(3) || !m73782a()) {
            Log.d(this.f88711b, mo49046h(str, objArr));
        }
    }

    /* renamed from: h */
    public final String mo49046h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f88712c.concat(str);
    }

    /* renamed from: a */
    public final void mo25408a(String str, Throwable th, Object... objArr) {
        if (mo19637a(2) || !m73782a()) {
            Log.v(this.f88711b, mo49046h(str, objArr), th);
        }
    }

    /* renamed from: a */
    public final void mo25409a(String str, Object... objArr) {
        if (mo19637a(2) || !m73782a()) {
            Log.v(this.f88711b, mo49046h(str, objArr));
        }
    }
}
