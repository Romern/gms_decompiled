package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: xug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xug {

    /* renamed from: c */
    public static final Logger f53149c = new Logger(new String[]{"PolluxNotificationManager"}, (short[]) null);

    /* renamed from: a */
    public final Context f53150a;

    /* renamed from: b */
    public final sey f53151b;

    public xug(Context context) {
        bmxy.m108581a(context);
        Context applicationContext = context.getApplicationContext();
        sey a = sey.m35126a(context);
        this.f53150a = applicationContext;
        this.f53151b = a;
    }

    /* renamed from: a */
    public final void mo30152a() {
        f53149c.mo25412b("dismissNotification", new Object[0]);
        sey sey = this.f53151b;
        sey.f44106a.f23030a.cancelAll();
        int i = Build.VERSION.SDK_INT;
        if (!sex.m35105h()) {
            sey.f44107b.mo25450c();
        }
    }
}
