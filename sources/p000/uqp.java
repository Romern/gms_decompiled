package p000;

import android.content.Context;
import com.google.android.gms.drive.events.DriveEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: uqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uqp {

    /* renamed from: a */
    private final Context f48552a;

    /* renamed from: b */
    private final HashMap f48553b = new HashMap();

    /* renamed from: c */
    private final ScheduledExecutorService f48554c;

    /* renamed from: d */
    private final Runnable f48555d = new uqo(this);

    public uqp(Context context) {
        ScheduledExecutorService a = adzl.f62962b.mo25877a(1, 2);
        this.f48552a = context;
        this.f48554c = a;
    }

    /* renamed from: a */
    private final void m39254a() {
        this.f48554c.schedule(this.f48555d, ((Long) twy.f46810U.mo58455c()).longValue(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized uqk mo27883a(String str) {
        return (uqk) this.f48553b.get(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uqp.a(boolean, java.lang.String):void
     arg types: [int, java.lang.String]
     candidates:
      uqp.a(java.lang.String, com.google.android.gms.drive.events.DriveEvent):void
      uqp.a(boolean, java.lang.String):void */
    /* renamed from: a */
    public final synchronized void mo27884a(String str, DriveEvent driveEvent) {
        sdo.m34970a(!this.f48554c.isShutdown());
        uqk a = mo27883a(str);
        if (a == null) {
            if (this.f48553b.isEmpty()) {
                m39254a();
            } else {
                mo27885a(false, str);
            }
            a = new uqk(this.f48552a, str);
            this.f48553b.put(str, a);
        }
        a.mo27870a(driveEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo27885a(boolean z, String str) {
        Iterator it = this.f48553b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((String) entry.getKey()).equals(str) && ((uqk) entry.getValue()).mo27871a()) {
                it.remove();
            }
        }
        if (z && !this.f48553b.isEmpty()) {
            m39254a();
        }
    }
}
