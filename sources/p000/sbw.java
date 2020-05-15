package p000;

import android.util.Log;

/* renamed from: sbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbw {

    /* renamed from: a */
    public final String f44039a;

    /* renamed from: b */
    private final String f44040b;

    public sbw(String str) {
        this(str, null);
    }

    /* renamed from: c */
    private final String m34881c(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.f44040b;
        return str2 != null ? str2.concat(format) : format;
    }

    /* renamed from: a */
    public final String mo25365a(String str) {
        String str2 = this.f44040b;
        return str2 != null ? str2.concat(str) : str;
    }

    /* renamed from: b */
    public final void mo25371b(String str) {
        if (mo25370a(3)) {
            mo25365a(str);
        }
    }

    /* renamed from: d */
    public final void mo25379d(String str) {
        if (mo25370a(2)) {
            mo25365a(str);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public sbw(String str, String str2) {
        boolean z;
        sdo.m34966a((Object) str, (Object) "log tag cannot be null");
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34976b(z, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f44039a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f44040b = null;
        } else {
            this.f44040b = str2;
        }
    }

    /* renamed from: a */
    public final void mo25366a(String str, String str2) {
        if (mo25370a(4)) {
            Log.i(str, mo25365a(str2));
        }
    }

    /* renamed from: b */
    public final void mo25372b(String str, String str2) {
        if (mo25370a(5)) {
            Log.w(str, mo25365a(str2));
        }
    }

    /* renamed from: d */
    public final void mo25380d(String str, String str2, Throwable th) {
        if (mo25370a(7)) {
            Log.e(str, mo25365a(str2), th);
            Log.wtf(str, mo25365a(str2), th);
        }
    }

    /* renamed from: a */
    public final void mo25367a(String str, String str2, Throwable th) {
        if (mo25370a(4)) {
            Log.i(str, mo25365a(str2), th);
        }
    }

    /* renamed from: b */
    public final void mo25373b(String str, String str2, Throwable th) {
        if (mo25370a(5)) {
            Log.w(str, mo25365a(str2), th);
        }
    }

    /* renamed from: c */
    public final void mo25376c(String str) {
        if (mo25370a(3)) {
            mo25365a(str);
        }
    }

    /* renamed from: a */
    public final void mo25368a(String str, String str2, Object... objArr) {
        if (mo25370a(4)) {
            Log.i(str, m34881c(str2, objArr));
        }
    }

    /* renamed from: b */
    public final void mo25374b(String str, String str2, Object... objArr) {
        if (mo25370a(6)) {
            Log.e(str, m34881c(str2, objArr));
        }
    }

    /* renamed from: c */
    public final void mo25377c(String str, String str2) {
        if (mo25370a(6)) {
            Log.e(str, mo25365a(str2));
        }
    }

    /* renamed from: a */
    public final void mo25369a(String str, Object... objArr) {
        if (mo25370a(3)) {
            m34881c(str, objArr);
        }
    }

    /* renamed from: b */
    public final void mo25375b(String str, Object... objArr) {
        if (mo25370a(5)) {
            Log.w(this.f44039a, m34881c(str, objArr));
        }
    }

    /* renamed from: c */
    public final void mo25378c(String str, String str2, Throwable th) {
        if (mo25370a(6)) {
            Log.e(str, mo25365a(str2), th);
        }
    }

    /* renamed from: a */
    public final boolean mo25370a(int i) {
        return Log.isLoggable(this.f44039a, i);
    }
}
