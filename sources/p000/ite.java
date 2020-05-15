package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: ite */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ite {

    /* renamed from: a */
    public static final aebo f21677a;

    /* renamed from: b */
    public final Logger f21678b = new Logger(new String[]{"EnrollmentScheduler"}, (byte[]) null);

    /* renamed from: c */
    private final Context f21679c;

    static {
        aebn aebn = new aebn();
        aebn.f63074a = 0;
        aebn.f63075b = (int) TimeUnit.MILLISECONDS.toSeconds(((Long) ipl.f21491a.mo58455c()).longValue());
        aebn.f63076c = (int) TimeUnit.MILLISECONDS.toSeconds(((Long) ipl.f21492b.mo58455c()).longValue());
        f21677a = aebn.mo34011a();
    }

    public ite(Context context) {
        this.f21679c = context;
    }

    /* renamed from: a */
    public static int m16093a(String str) {
        if (str.startsWith("OneTimeTag_")) {
            return 3;
        }
        if (!str.startsWith("NonImmediateTag_")) {
            return str.startsWith("ClientDirectiveTag_") ? 2 : 1;
        }
        return 5;
    }

    /* renamed from: a */
    public final void mo13334a(String str, long j, long j2, aebo aebo) {
        String valueOf = String.valueOf(str);
        String str2 = valueOf.length() == 0 ? new String("ClientDirectiveTag_") : "ClientDirectiveTag_".concat(valueOf);
        this.f21678b.mo25412b("scheduleServerDirective with server : start=%d, end=%d", Long.valueOf(j), Long.valueOf(j2));
        mo13335a(str2, str, aebo, j, j2, true);
    }

    /* renamed from: a */
    public final void mo13335a(String str, String str2, aebo aebo, long j, long j2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("account", str2);
        ipk.m15815a(this.f21679c, "com.google.android.gms.auth.cryptauth.register.ReEnrollmentService", str, aebo, j, j2, bundle, z);
    }
}
