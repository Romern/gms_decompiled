package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Map;

/* renamed from: aoyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoyh {

    /* renamed from: b */
    private static final Map f83842b = new HashMap();

    /* renamed from: a */
    public final String f83843a;

    private aoyh(String str) {
        this.f83843a = str.length() > 23 ? str.substring(0, 23) : str;
    }

    /* renamed from: a */
    public static aoyh m69805a(String str) {
        aoyh aoyh;
        synchronized (f83842b) {
            aoyh = (aoyh) f83842b.get(str);
            if (aoyh == null) {
                aoyh = new aoyh(str);
                f83842b.put(str, aoyh);
            }
        }
        return aoyh;
    }

    /* renamed from: f */
    public static String m69806f(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e) {
            return "";
        }
    }

    /* renamed from: g */
    private static String m69807g(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e) {
            return "";
        }
    }

    /* renamed from: b */
    public final void mo46981b(String str) {
        if (Log.isLoggable(this.f83843a, 4)) {
            Log.i(this.f83843a, str);
        }
    }

    /* renamed from: c */
    public final void mo46983c(String str) {
        if (Log.isLoggable(this.f83843a, 5)) {
            Log.w(this.f83843a, str);
        }
    }

    /* renamed from: d */
    public final void mo46985d(String str) {
        if (Log.isLoggable(this.f83843a, 6)) {
            Log.e(this.f83843a, str);
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void mo46987e(String str, Object... objArr) {
        if (Log.isLoggable(this.f83843a, 6)) {
            Log.e(this.f83843a, m69806f(str, objArr));
        }
    }

    /* renamed from: b */
    public final void mo46982b(String str, Object... objArr) {
        if (Log.isLoggable(this.f83843a, 5)) {
            Log.w(this.f83843a, m69807g(str, objArr));
        }
    }

    @Deprecated
    /* renamed from: c */
    public final void mo46984c(String str, Object... objArr) {
        if (Log.isLoggable(this.f83843a, 5)) {
            Log.w(this.f83843a, m69806f(str, objArr));
        }
    }

    /* renamed from: d */
    public final void mo46986d(String str, Object... objArr) {
        if (Log.isLoggable(this.f83843a, 6)) {
            Log.e(this.f83843a, m69807g(str, objArr));
        }
    }

    /* renamed from: a */
    public final void mo46979a(String str, Object... objArr) {
        if (Log.isLoggable(this.f83843a, 4)) {
            Log.i(this.f83843a, m69807g(str, objArr));
        }
    }

    /* renamed from: a */
    public final void mo46980a(Throwable th, String str) {
        if (Log.isLoggable(this.f83843a, 6)) {
            Log.e(this.f83843a, str, th);
        }
    }
}
