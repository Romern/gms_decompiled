package p000;

import android.app.PendingIntent;
import android.os.Binder;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import com.google.android.gms.auth.proximity.firstparty.DeviceSyncApiChimeraService;

/* renamed from: jos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jos extends jrw implements aaai {

    /* renamed from: a */
    private final DeviceSyncApiChimeraService f22945a;

    /* renamed from: b */
    private final aaag f22946b;

    /* renamed from: c */
    private final String f22947c;

    public jos(DeviceSyncApiChimeraService deviceSyncApiChimeraService, aaag aaag, String str) {
        this.f22945a = deviceSyncApiChimeraService;
        this.f22946b = aaag;
        this.f22947c = str;
    }

    /* renamed from: a */
    private final void m17034a() {
        if (C1145kt.m18541a(this.f22945a, "android.permission.GET_ACCOUNTS", Binder.getCallingPid(), Binder.getCallingUid(), null) == -1) {
            throw new SecurityException("Missing permission android.permission.GET_ACCOUNTS");
        }
    }

    /* renamed from: b */
    public final void mo13957b(rnt rnt, PendingIntent pendingIntent, DeviceFilter deviceFilter) {
        this.f22946b.mo16659a(this.f22945a, new jrf(rnt, pendingIntent, deviceFilter, this.f22947c));
    }

    /* renamed from: b */
    public final void mo13958b(rnt rnt, PendingIntent pendingIntent, String str) {
        this.f22946b.mo16659a(this.f22945a, new jqb(rnt, pendingIntent, str, false, this.f22947c));
    }

    /* renamed from: b */
    public final void mo13959b(rnt rnt, String str, boolean z, String str2) {
        m17034a();
        this.f22946b.mo16659a(this.f22945a, new jqj(rnt, str, z, str2));
    }

    /* renamed from: a */
    public final void mo13949a(jsa jsa, String str, String str2) {
        m17034a();
        this.f22946b.mo16659a(this.f22945a, new jps(jsa, str, str2));
    }

    /* renamed from: a */
    public final void mo13950a(jsd jsd) {
        m17034a();
        this.f22946b.mo16659a(this.f22945a, new jpt(jsd));
    }

    /* renamed from: a */
    public final void mo13951a(jsg jsg, String str) {
        m17034a();
        this.f22946b.mo16659a(this.f22945a, new jpv(jsg, str, false));
    }

    /* renamed from: a */
    public final void mo13952a(jsj jsj) {
        m17034a();
        this.f22946b.mo16659a(this.f22945a, new jpx(jsj));
    }

    /* renamed from: a */
    public final void mo13953a(rnt rnt, PendingIntent pendingIntent, DeviceFilter deviceFilter) {
        this.f22946b.mo16659a(this.f22945a, new jqa(rnt, pendingIntent, deviceFilter, this.f22947c));
    }

    /* renamed from: a */
    public final void mo13954a(rnt rnt, PendingIntent pendingIntent, String str) {
        this.f22946b.mo16659a(this.f22945a, new jqb(rnt, pendingIntent, str, true, this.f22947c));
    }

    /* renamed from: a */
    public final void mo13955a(rnt rnt, String str) {
        m17034a();
        this.f22946b.mo16659a(this.f22945a, new jpr(rnt, str));
    }

    /* renamed from: a */
    public final void mo13956a(rnt rnt, String str, boolean z, String str2) {
        m17034a();
        aaag aaag = this.f22946b;
        DeviceSyncApiChimeraService deviceSyncApiChimeraService = this.f22945a;
        aaag.mo16659a(deviceSyncApiChimeraService, new jql(rnt, str, z, str2, inl.m15759a(deviceSyncApiChimeraService), false));
    }
}
