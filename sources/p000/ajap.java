package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: ajap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajap {

    /* renamed from: a */
    public final ajar f70261a = new ajak(this);

    /* renamed from: b */
    public final C1223np f70262b = new C1223np();

    /* renamed from: c */
    public final ajar f70263c = new ajal(this);

    /* renamed from: d */
    public final C1223np f70264d = new C1223np();

    /* renamed from: e */
    public final buqh f70265e;

    /* renamed from: f */
    private final Context f70266f;

    public ajap(Context context) {
        this.f70265e = (buqh) ahgz.m55754a(context, buqh.class);
        this.f70266f = context;
    }

    /* renamed from: a */
    public final void mo38398a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.f70266f, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        intent.setAction("com.google.android.gms.nearby.messages.service.STOP_SERVICE_IF_IDLE");
        this.f70266f.startService(intent);
    }

    /* renamed from: a */
    public final void mo38399a(ajao ajao) {
        buqn buqn = (buqn) this.f70264d.remove(ajao);
        if (buqn != null) {
            this.f70265e.mo72989e(buqn);
        }
        this.f70263c.mo38407b(ajao);
    }

    /* renamed from: a */
    public final void mo38400a(ajao ajao, int i, ajco ajco) {
        if (ajco != null && i != Integer.MAX_VALUE) {
            this.f70263c.mo38405a(ajao, ajco);
            String valueOf = String.valueOf(ajao);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("PublishSubscribeCallbackCache.subscribe:");
            sb.append(valueOf);
            this.f70265e.mo72983a(new ajan(this, sb.toString(), ajao), (long) (i * 1000));
        }
    }

    /* renamed from: a */
    public final void mo38401a(PendingIntent pendingIntent) {
        mo38399a(new ajao(pendingIntent));
    }

    /* renamed from: a */
    public final void mo38402a(String str) {
        srn srn = ahfq.f67120a;
        buqn buqn = (buqn) this.f70262b.remove(str);
        if (buqn != null) {
            this.f70265e.mo72989e(buqn);
        }
        this.f70261a.mo38407b(str);
    }
}
