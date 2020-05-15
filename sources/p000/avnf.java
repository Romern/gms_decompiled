package p000;

import android.app.Notification;
import android.content.Context;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avnf {

    /* renamed from: b */
    public static final Logger f93496b = avpq.m79017d("NotificationControl");

    /* renamed from: c */
    public static final avtl f93497c = new avtl("control.notification.notified_at");

    /* renamed from: d */
    public static final avtg f93498d = new avtg("control.notification.last_notified_status", -1);

    /* renamed from: e */
    public static final avsz f93499e = new avne();

    /* renamed from: a */
    private final skc f93500a;

    /* renamed from: f */
    protected final Context f93501f;

    /* renamed from: g */
    public final sex f93502g;

    /* renamed from: h */
    public final avtn f93503h;

    /* renamed from: i */
    public final avng f93504i;

    protected avnf(Context context) {
        this.f93501f = context;
        sex a = sex.m35104a(context);
        if (a != null) {
            this.f93502g = a;
            this.f93500a = new skc(context);
            this.f93503h = (avtn) avtn.f93892a.mo51589b();
            this.f93504i = new avng(context);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Notification mo51388a(SystemUpdateStatus systemUpdateStatus, boolean z);

    /* renamed from: a */
    public final void mo51428a() {
        this.f93502g.mo25444a("com.google.android.gms.update.control.NotificationControl", 1);
    }

    /* renamed from: a */
    public final void mo51429a(long j) {
        this.f93500a.mo25675a("NotificationControl-Alarm", 1, j, avnh.m78871a(this.f93501f, 1), (String) null);
    }
}
