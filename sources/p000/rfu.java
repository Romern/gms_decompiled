package p000;

import java.util.concurrent.Callable;

/* renamed from: rfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class rfu {

    /* renamed from: a */
    public static final rfu f42885a = new rfu(true, null, null);

    /* renamed from: b */
    final boolean f42886b;

    /* renamed from: c */
    final String f42887c;

    /* renamed from: d */
    final Throwable f42888d;

    public rfu(boolean z, String str, Throwable th) {
        this.f42886b = z;
        this.f42887c = str;
        this.f42888d = th;
    }

    /* renamed from: a */
    static String m33526a(String str, rfl rfl, boolean z, boolean z2) {
        String str2;
        if (!z2) {
            str2 = "not whitelisted";
        } else {
            str2 = "debug cert rejected";
        }
        StringBuilder sb = new StringBuilder(17);
        sb.append("201515033.true");
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, srv.m36160a(spo.m35903a("SHA-1").digest(((rfm) rfl).f42877a)), Boolean.valueOf(z), sb.toString());
    }

    /* renamed from: a */
    public String mo24602a() {
        return this.f42887c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24603b() {
        if (!this.f42886b) {
            String a = mo24602a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 35);
            sb.append("GoogleCertificatesRslt: ");
            sb.append(a);
            sb.append(" (go/gsrlt)");
            String sb2 = sb.toString();
            Throwable th = this.f42888d;
            if (th != null) {
                throw new SecurityException(sb2, th);
            }
            throw new SecurityException(sb2);
        }
    }

    /* renamed from: a */
    static rfu m33527a(String str) {
        return new rfu(false, str, null);
    }

    /* renamed from: a */
    static rfu m33528a(String str, Throwable th) {
        return new rfu(false, str, th);
    }

    /* renamed from: a */
    static rfu m33529a(Callable callable) {
        return new rft(callable);
    }
}
