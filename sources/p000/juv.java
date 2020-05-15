package p000;

import android.app.PendingIntent;
import android.content.SharedPreferences;
import com.google.android.gms.auth.setup.notification.PersistentNotificationIntentOperation;

@Deprecated
/* renamed from: juv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class juv {

    /* renamed from: a */
    private final sex f23274a;

    /* renamed from: b */
    private final skc f23275b;

    public juv(sex sex, skc skc) {
        sdo.m34959a(sex);
        this.f23274a = sex;
        sdo.m34959a(skc);
        this.f23275b = skc;
    }

    /* renamed from: a */
    public static SharedPreferences m17363a() {
        return rpr.m34216b().getSharedPreferences("PersistentNotificationManager", 0);
    }

    /* renamed from: a */
    private static String m17364a(int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo14121a(String str, int i) {
        this.f23274a.mo25444a(str, i);
        m17363a().edit().remove(m17364a(i, str)).commit();
    }

    /* renamed from: a */
    public final void mo14122a(String str, int i, juw juw) {
        m17363a().edit().putString(m17364a(i, str), juw.mo14123a()).commit();
        this.f23274a.mo25445a(str, i, juw.f23277a.mo13629b());
        rpr b = rpr.m34216b();
        this.f23275b.mo25675a("PersistentNotificationManager", 1, juw.mo14129b() + juw.mo14133c(), PendingIntent.getService(b, 0, PersistentNotificationIntentOperation.m6901a(b, str, i), 134217728), "com.google.android.gms");
    }
}
