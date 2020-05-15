package p000;

import android.app.PendingIntent;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;

/* renamed from: avwk */
public final /* synthetic */ class avwk implements roo {

    /* renamed from: a */
    private final avwu f94026a;

    /* renamed from: b */
    private final UserLocationNearbyAlertRequest f94027b;

    /* renamed from: c */
    private final PendingIntent f94028c;

    /* renamed from: d */
    private final PendingIntent f94029d;

    public avwk(avwu avwu, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.f94026a = avwu;
        this.f94027b = userLocationNearbyAlertRequest;
        this.f94028c = pendingIntent;
        this.f94029d = pendingIntent2;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        avwu avwu = this.f94026a;
        ((avxk) ((avxm) obj).mo25289B()).mo51694a(avwu.f94046a, new avws((aucf) obj2), this.f94027b, this.f94028c, this.f94029d);
    }
}
