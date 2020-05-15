package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: hzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hzu {

    /* renamed from: a */
    final /* synthetic */ hzw f20607a;

    public hzu(hzw hzw) {
        this.f20607a = hzw;
    }

    /* renamed from: a */
    public final long mo12840a(long j) {
        long currentTimeMillis;
        Logger Logger = hzw.f20609a;
        long currentTimeMillis2 = System.currentTimeMillis() + j;
        Context context = (Context) this.f20607a.f20611c.get();
        if (context == null) {
            return currentTimeMillis2;
        }
        Intent intent = new Intent("com.google.android.gms.auth.api.phone.action.ON_ALARM").setPackage(context.getPackageName());
        synchronized (hzv.class) {
            hzw hzw = this.f20607a;
            int i = hzw.f20613e;
            hzw.f20613e = i + 1;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, 0);
            currentTimeMillis = j + System.currentTimeMillis();
            new skc(context).mo25675a("SmsRetrieverCore", 1, currentTimeMillis, broadcast, (String) null);
        }
        hzw.f20609a.mo25412b("componentHelper.setAlarm. Expecting trigger at: %d", Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    /* renamed from: a */
    public final Context mo12841a() {
        return (Context) this.f20607a.f20611c.get();
    }

    /* renamed from: a */
    public final void mo12842a(Intent intent) {
        Context context = (Context) this.f20607a.f20611c.get();
        if (context != null) {
            context.sendBroadcast(intent);
        }
    }
}
