package p000;

import android.app.Notification;
import android.content.Context;
import android.os.Build;

/* renamed from: sey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sey {

    /* renamed from: a */
    public final C1114jq f44106a;

    /* renamed from: b */
    public final sex f44107b;

    public sey(C1114jq jqVar, sex sex) {
        this.f44106a = jqVar;
        this.f44107b = sex;
    }

    /* renamed from: a */
    public static sey m35126a(Context context) {
        return new sey(new C1114jq(context), sex.m35104a(context));
    }

    /* renamed from: a */
    public final void mo25456a(int i) {
        this.f44106a.mo13982a(null, i);
        if (!sex.m35105h()) {
            this.f44107b.mo25450c();
        }
    }

    /* renamed from: a */
    public final void mo25457a(int i, Notification notification) {
        if (!sex.m35105h()) {
            mo25459a(null, i, notification);
        } else {
            this.f44106a.mo13983a(null, i, notification);
        }
    }

    /* renamed from: a */
    public final void mo25458a(String str, int i) {
        this.f44106a.mo13982a(str, i);
        if (!sex.m35105h()) {
            this.f44107b.mo25450c();
        }
    }

    /* renamed from: a */
    public final void mo25459a(String str, int i, Notification notification) {
        if (sex.m35105h()) {
            this.f44106a.mo13983a(str, i, notification);
        } else if (!sew.m35103a(this.f44107b.f44100b)) {
            this.f44107b.f44101c.mo25435c();
        } else {
            this.f44106a.mo13983a(str, i, this.f44107b.mo25436a(notification));
            this.f44107b.f44101c.mo25433a();
        }
    }

    /* renamed from: a */
    public final boolean mo25460a() {
        C1114jq jqVar = this.f44106a;
        int i = Build.VERSION.SDK_INT;
        return jqVar.f23030a.areNotificationsEnabled();
    }
}
