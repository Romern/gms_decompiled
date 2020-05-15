package p000;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: adfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfs {

    /* renamed from: a */
    public final String f61571a = "InstantApps";

    /* renamed from: b */
    private final String f61572b;

    public adfs(String str) {
        this.f61572b = String.valueOf(str).concat(": ");
    }

    /* renamed from: b */
    private static String m50320b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        bqye.m113760a(th, printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: a */
    public final void mo33423a(String str, Object... objArr) {
        Log.i(this.f61571a, mo33431e(str, objArr));
    }

    /* renamed from: c */
    public final String mo33428c(Throwable th, String str, Object... objArr) {
        StringWriter stringWriter = new StringWriter();
        stringWriter.append((CharSequence) this.f61572b);
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        stringWriter.append((CharSequence) str);
        if (th != null) {
            stringWriter.append(10).append((CharSequence) m50320b(th));
        }
        return stringWriter.toString();
    }

    /* renamed from: d */
    public final void mo33430d(String str, Object... objArr) {
        Log.wtf(this.f61571a, mo33431e(str, objArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo33431e(String str, Object... objArr) {
        return mo33428c(null, str, objArr);
    }

    /* renamed from: a */
    public final void mo33424a(Throwable th) {
        Log.e(this.f61571a, m50320b(th));
    }

    /* renamed from: b */
    public final void mo33426b(String str, Object... objArr) {
        Log.e(this.f61571a, mo33431e(str, objArr));
    }

    /* renamed from: a */
    public final void mo33425a(Throwable th, String str, Object... objArr) {
        Log.e(this.f61571a, mo33428c(th, str, objArr));
    }

    /* renamed from: b */
    public final void mo33427b(Throwable th, String str, Object... objArr) {
        Log.w(this.f61571a, mo33428c(th, str, objArr));
    }

    /* renamed from: c */
    public final void mo33429c(String str, Object... objArr) {
        Log.w(this.f61571a, mo33431e(str, objArr));
    }
}
