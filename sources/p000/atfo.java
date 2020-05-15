package p000;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.felicanetworks.mfc.FSC;
import com.felicanetworks.mfc.Felica;

/* renamed from: atfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atfo {

    /* renamed from: a */
    public final Handler f90248a;

    /* renamed from: b */
    public final Handler f90249b;

    /* renamed from: c */
    public Felica f90250c;

    /* renamed from: d */
    public FSC f90251d;

    public atfo(Context context) {
        this.f90248a = new adzt(context.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("DirectFelicaCF");
        handlerThread.start();
        this.f90249b = new adzt(handlerThread.getLooper());
    }

    /* renamed from: a */
    public final brfg mo49927a(brff brff) {
        return new atfk(this, brff);
    }

    /* renamed from: b */
    public final brfg mo49928b(brff brff) {
        return new atfn(this, brff);
    }
}
