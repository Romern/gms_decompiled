package p000;

import android.content.Context;

/* renamed from: mgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mgx {

    /* renamed from: a */
    public static final lvn f33674a = new lvn("SourceWakeLockManager");

    /* renamed from: b */
    public final asfb f33675b;

    private mgx(asfb asfb) {
        sdo.m34967a("Wake lock must be created on the main thread.");
        this.f33675b = asfb;
    }

    /* renamed from: a */
    public static mgx m25092a(Context context) {
        return new mgx(new asfb(context, 1, "com.google.android.gms.backup.component.D2dSourceService.wakelock_tag"));
    }

    /* renamed from: a */
    public final boolean mo20007a() {
        sdo.m34967a("Wake lock must be released from the main thread.");
        if (!this.f33675b.mo49124e()) {
            f33674a.mo25409a("releaseWakeLockIfHeld(): wake lock not held so not releasing", new Object[0]);
            return false;
        }
        f33674a.mo25409a("releaseWakeLockIfHeld(): wake lock held so releasing", new Object[0]);
        this.f33675b.mo49122c("migrate_transfer");
        return true;
    }
}
