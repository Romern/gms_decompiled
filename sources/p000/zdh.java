package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.internal.ClientIdentity;
import java.util.List;

/* renamed from: zdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class zdh implements PendingIntent.OnFinished, zgg {

    /* renamed from: c */
    public static final srn f54945c = zvt.m46581a();

    /* renamed from: a */
    private final Handler f54946a;

    /* renamed from: d */
    public final zcz f54947d;

    /* renamed from: e */
    public final PendingIntent f54948e;

    /* renamed from: f */
    public final Context f54949f;

    /* renamed from: g */
    public final asfb f54950g;

    /* renamed from: h */
    public final zdf f54951h;

    /* renamed from: i */
    public final ytt f54952i;

    /* renamed from: j */
    public final ssh f54953j;

    public zdh(Context context, zcz zcz, PendingIntent pendingIntent, zdf zdf, ytt ytt, Handler handler) {
        this.f54947d = zcz;
        this.f54948e = pendingIntent;
        this.f54949f = context;
        this.f54952i = ytt;
        this.f54946a = handler;
        if (pendingIntent != null) {
            int i = Build.VERSION.SDK_INT;
            asfb asfb = new asfb(context, 1, "FitnessUnderlyingListener", null, pendingIntent.getCreatorPackage());
            this.f54950g = asfb;
            asfb.mo49115a(true);
            this.f54950g.mo49121c(saq.m34797a(bngx.m109356a(new ClientIdentity(ytt.f54618b, ytt.f54617a))));
        } else {
            this.f54950g = null;
        }
        this.f54951h = zdf;
        this.f54953j = ssh.m36213a(this.f54949f);
    }

    /* renamed from: a */
    public abstract void mo30942a();

    /* renamed from: a */
    public final void mo30949a(List list) {
        if (list.isEmpty()) {
            ((bnsl) f54945c.mo68388c()).mo68405a("Ignoring empty event.");
        } else if (!this.f54946a.post(new zdg(this, ywd.m44934a(list, this.f54952i.f54617a)))) {
            ((bnsl) f54945c.mo68388c()).mo68420a("Could not schedule data point handler. Proceeding to unregister the client %s to avoid any runaway registrations.", this.f54952i.f54617a);
            mo30943b();
        }
    }

    /* renamed from: b */
    public abstract void mo30943b();

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        this.f54950g.mo49120c();
    }

    public final String toString() {
        return String.format("UnderlyingListener{%s} Timeout: %s", bmxu.m108565a(this.f54947d, this.f54948e), Long.valueOf(this.f54951h.f54938a));
    }
}
