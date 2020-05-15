package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* renamed from: ptx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ptx {

    /* renamed from: a */
    public static boolean f40218a = false;

    /* renamed from: b */
    protected final String f40219b;

    /* renamed from: c */
    public boolean f40220c;

    /* renamed from: d */
    public String f40221d;

    /* renamed from: e */
    private final boolean f40222e;

    public ptx(String str) {
        this(str, f40218a);
    }

    /* renamed from: a */
    public final void mo23669a(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = String.format("[%s] ", str);
        } else {
            str2 = null;
        }
        this.f40221d = str2;
    }

    /* renamed from: a */
    public final boolean mo23672a() {
        if (!this.f40220c) {
            return !this.f40222e ? false : false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo23673b(String str, Object... objArr) {
        Log.i(this.f40219b, mo23678e(str, objArr));
    }

    /* renamed from: c */
    public final void mo23675c(String str, Object... objArr) {
        Log.w(this.f40219b, mo23678e(str, objArr));
    }

    /* renamed from: d */
    public final void mo23677d(String str, Object... objArr) {
        Log.e(this.f40219b, mo23678e(str, objArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo23678e(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.f40221d)) {
            return str;
        }
        String valueOf = String.valueOf(this.f40221d);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: f */
    public final void mo23679f(String str, Object... objArr) {
        if (mo23672a() || f40218a) {
            mo23678e(str, objArr);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public ptx(String str, boolean z) {
        sdo.m34969a(str, (Object) "The log tag cannot be null or empty.");
        this.f40219b = str;
        this.f40222e = str.length() <= 23;
        this.f40220c = z;
    }

    /* renamed from: a */
    public final void mo23670a(String str, Object... objArr) {
        if (mo23672a() || f40218a) {
            mo23678e(str, objArr);
        }
    }

    /* renamed from: b */
    public final void mo23674b(Throwable th, String str, Object... objArr) {
        Log.w(this.f40219b, mo23678e(str, objArr), th);
    }

    /* renamed from: c */
    public final void mo23676c(Throwable th, String str, Object... objArr) {
        Log.e(this.f40219b, mo23678e(str, objArr), th);
    }

    /* renamed from: a */
    public final void mo23671a(Throwable th, String str, Object... objArr) {
        Log.i(this.f40219b, mo23678e(str, objArr), th);
    }
}
