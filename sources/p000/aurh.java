package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.Felica;
import com.google.android.gms.trustagent.trustlet.InactivityTracker$1;

/* renamed from: aurh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurh {

    /* renamed from: a */
    public static final aunx f92308a = new aunx("TrustAgent", "InactivityTracker");

    /* renamed from: b */
    public static final String f92309b;

    /* renamed from: c */
    public static final String f92310c;

    /* renamed from: d */
    public final PendingIntent f92311d;

    /* renamed from: e */
    public final Context f92312e;

    /* renamed from: f */
    public final aurg f92313f;

    /* renamed from: g */
    public final skc f92314g;

    /* renamed from: h */
    public int f92315h;

    /* renamed from: i */
    public boolean f92316i;

    /* renamed from: j */
    public final BroadcastReceiver f92317j = new InactivityTracker$1(this, "trustagent");

    static {
        String valueOf = String.valueOf(aurh.class.getPackage());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append(valueOf);
        sb.append(".INACTIVITY_TRIGGERED");
        f92309b = sb.toString();
        String valueOf2 = String.valueOf(aurh.class.getPackage());
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
        sb2.append(valueOf2);
        sb2.append(".INACTIVITY_NOTIFICATION");
        f92310c = sb2.toString();
    }

    public aurh(Context context, aurg aurg) {
        this.f92312e = context;
        this.f92313f = aurg;
        this.f92311d = PendingIntent.getBroadcast(context, 0, new Intent(f92309b), 0);
        this.f92314g = new skc(context);
    }

    /* renamed from: a */
    public final void mo50820a() {
        if (!this.f92316i) {
            this.f92316i = true;
            this.f92314g.mo25675a("Coffee-InactivityTracker", 0, System.currentTimeMillis() + ((long) (this.f92315h * Felica.MAX_TIMEOUT)), this.f92311d, "com.google.android.gms");
        }
    }
}
