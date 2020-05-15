package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: avqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avqi {

    /* renamed from: a */
    public static final sek f93783a = avpq.m79022i("DelayedBatchMessageQueue");

    /* renamed from: b */
    public final List f93784b = new ArrayList();

    /* renamed from: c */
    public final Handler f93785c = new adzt(Looper.getMainLooper(), new avqh(this));

    /* renamed from: d */
    public final long f93786d;

    /* renamed from: e */
    private final avqg f93787e;

    public avqi(long j, avqg avqg) {
        this.f93787e = avqg;
        this.f93786d = j;
    }

    /* renamed from: a */
    public final void mo51502a() {
        bngx a = bngx.m109368a((Collection) this.f93784b);
        this.f93784b.clear();
        this.f93787e.mo51500a(bngx.m109368a((Collection) a));
    }
}
