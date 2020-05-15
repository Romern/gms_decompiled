package p000;

import android.app.Notification;
import com.google.android.chimera.Service;

/* renamed from: mgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mgp {

    /* renamed from: a */
    public final sex f33650a;

    /* renamed from: b */
    private final Service f33651b;

    public mgp(Service service) {
        this.f33651b = service;
        this.f33650a = sex.m35104a(service);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19997a() {
        this.f33651b.stopForeground(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19998a(Notification notification) {
        this.f33651b.startForeground(1, notification);
    }
}
