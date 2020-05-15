package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.location.internal.PendingIntentCallbackChimeraService;
import com.google.android.location.movement.ActivityDetector$Receiver;
import java.util.Collection;

/* renamed from: bgev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgev {

    /* renamed from: a */
    public volatile boolean f116299a = false;

    /* renamed from: b */
    public final Context f116300b;

    /* renamed from: c */
    public final int f116301c;

    /* renamed from: d */
    public final String f116302d;

    /* renamed from: e */
    public final String f116303e;

    /* renamed from: f */
    final ActivityDetector$Receiver f116304f = new ActivityDetector$Receiver(this);

    /* renamed from: g */
    public final bgfa f116305g;

    /* renamed from: h */
    public final Object f116306h = new Object();

    /* renamed from: i */
    public bfkw f116307i;

    /* renamed from: j */
    public int f116308j = -1;

    /* renamed from: k */
    public Collection f116309k = null;

    /* renamed from: l */
    private final PendingIntent f116310l;

    /* renamed from: m */
    private final bfyx f116311m;

    public bgev(Context context, bgey bgey, bfyx bfyx, String str) {
        this.f116300b = context;
        this.f116311m = bfyx;
        this.f116305g = new bgfa(bgey, this.f116311m);
        this.f116301c = context.getApplicationInfo().uid;
        this.f116302d = context.getPackageName();
        this.f116303e = str;
        Intent a = PendingIntentCallbackChimeraService.m117262a(context);
        a.setPackage(this.f116300b.getPackageName());
        a.setAction("com.google.android.location.internal.action.GEOFENCER_AR_RESULT");
        this.f116310l = PendingIntent.getService(this.f116300b, 0, a, 134217728);
        this.f116300b.getApplicationContext().registerReceiver(this.f116304f, new IntentFilter("com.google.android.location.internal.server.ACTION_RESTARTED"));
        aki.m919a(context).mo873a(this.f116304f, new IntentFilter(bvpm.m121348a("com.google.android.location.internal.action.GEOFENCER_AR_RESULT")));
    }

    /* renamed from: a */
    public static void m98710a(Context context, PendingIntent pendingIntent) {
        bxbi bxbi = new bxbi(context.getPackageName());
        bxbi.mo73555b(pendingIntent);
        bxbi.mo73549a(context);
    }

    /* renamed from: a */
    public final void mo62720a() {
        synchronized (this.f116306h) {
            if (this.f116308j != -1) {
                this.f116305g.mo62738a(false);
                this.f116311m.mo62451a();
                this.f116308j = -1;
                this.f116309k = null;
            }
            PendingIntent pendingIntent = this.f116310l;
            if (pendingIntent != null) {
                m98710a(this.f116300b, pendingIntent);
            }
        }
    }

    /* renamed from: a */
    public final void mo62721a(int i, boolean z, Collection collection) {
        PendingIntent pendingIntent = this.f116310l;
        if (pendingIntent != null) {
            m98710a(this.f116300b, pendingIntent);
        }
        aefy aefy = new aefy();
        WorkSource a = saq.m34797a(collection);
        aefy.mo34115a(((long) i) * 1000);
        aefy.f63346c = z;
        aefy.f63348e = "movement.ActivityDetector";
        aefy.f63347d = a;
        bxbi bxbi = new bxbi(this.f116300b.getPackageName());
        bxbi.mo73552a(a);
        bxbi.mo73553a(aefy.mo34113a(), this.f116310l);
        if (bxbi.mo73549a(this.f116300b) == null) {
            Log.w("ActivityDetector", "Unable to bind to GMS NLP");
        }
    }
}
