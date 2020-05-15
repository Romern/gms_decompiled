package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Message;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.contextmanager.controller.EventHandler$AlarmSetter;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: drv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class drv extends dwm implements dqb {

    /* renamed from: a */
    public final Context f13904a;

    /* renamed from: b */
    public final sns f13905b;

    /* renamed from: c */
    public final drt f13906c;

    /* renamed from: d */
    public final EventHandler$AlarmSetter f13907d;

    /* renamed from: e */
    public final boolean f13908e;

    /* renamed from: f */
    public volatile boolean f13909f = false;

    /* renamed from: g */
    public final Lock f13910g = new ReentrantLock();

    public drv(Context context, boolean z) {
        this.f13904a = context;
        sns sns = new sns("CMEventHandler", 10);
        this.f13905b = sns;
        sns.start();
        this.f13906c = new drt(this, context, this.f13905b);
        EventHandler$AlarmSetter eventHandler$AlarmSetter = new EventHandler$AlarmSetter(this);
        this.f13907d = eventHandler$AlarmSetter;
        eventHandler$AlarmSetter.f7700f.f13904a.registerReceiver(eventHandler$AlarmSetter, new IntentFilter(eventHandler$AlarmSetter.f7698d));
        this.f13908e = z;
    }

    /* renamed from: a */
    public final Executor mo9432a(dqx dqx) {
        return new drq(this, dqx);
    }

    /* renamed from: b */
    public final boolean mo9512b() {
        soc soc = this.f13905b.f44811a;
        soc.f44846d.lock();
        try {
            return soc.f44844b.contains(Thread.currentThread());
        } finally {
            soc.f44846d.unlock();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo9511a() {
        sdo.m34971a(mo9512b(), (Object) "This method must run in the EventHandler's thread.");
    }

    /* renamed from: a */
    public final void mo9433a(Runnable runnable) {
        if (mo9512b()) {
            this.f13907d.mo6254a(runnable);
        } else {
            mo9435a(new drr(this, runnable), dqy.m9123a("EventHandler#cancel"));
        }
    }

    /* renamed from: a */
    public final void mo9434a(Runnable runnable, long j, dqx dqx) {
        if (j >= 31536000000L) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("drv", "a", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("[EventHandler] Dropping runnable, delay=%s, runnable=%s, workInfo=%s", Long.valueOf(j), runnable, dqx);
        } else if (mo9512b()) {
            this.f13907d.mo6255a(runnable, j, dqx);
        } else {
            mo9435a(new drp(this, runnable, j, dqx), dqy.m9123a("EventHandler#postDelayed"));
        }
    }

    /* renamed from: a */
    public final void mo9435a(Runnable runnable, dqx dqx) {
        drt drt = this.f13906c;
        int i = drt.f13896b;
        sdo.m34959a(runnable);
        sdo.m34959a(dqx);
        egr D = dwq.m9647D();
        drt.mo9507a(D, dqx);
        Message message = new Message();
        message.obj = new dru(runnable, dqx, dqx.f13844e);
        drv drv = drt.f13897a;
        if (drv.f13908e) {
            drv.f13910g.lock();
            try {
                if (!drt.f13897a.f13909f) {
                    drt.sendMessage(message);
                }
            } finally {
                drt.f13897a.f13910g.unlock();
            }
        } else if (!drt.sendMessage(message)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("drt", "a", 362, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[EventHandler] Failed to send message %s", dqx.f13840a);
            if (D != null) {
                String valueOf = String.valueOf(dqx.f13840a);
                D.mo10109c(dqy.m9123a(valueOf.length() == 0 ? new String("Failed-") : "Failed-".concat(valueOf)));
            }
            drt.mo9506a(dqx);
        } else {
            D.mo10106a(dqx);
        }
    }
}
