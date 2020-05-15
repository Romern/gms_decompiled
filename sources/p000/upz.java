package p000;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: upz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class upz extends Service implements upo, upy, upt, uqa {
    static {
        new sbw("DriveEventService", "");
    }

    /* renamed from: a */
    public static Intent m39219a(String str) {
        Intent intent = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        intent.setPackage(str);
        return intent;
    }

    /* renamed from: a */
    public final void mo27831a() {
        throw null;
    }

    /* renamed from: b */
    public final void mo27837b() {
        throw null;
    }

    /* renamed from: c */
    public final void mo27849c() {
        throw null;
    }

    public final synchronized IBinder onBind(Intent intent) {
        throw null;
    }

    public final synchronized void onDestroy() {
        throw null;
    }

    public final boolean onUnbind(Intent intent) {
        throw null;
    }
}
