package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: arow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arow implements arok {

    /* renamed from: a */
    public final Queue f88038a = new LinkedList();

    /* renamed from: b */
    public arok f88039b;

    /* renamed from: c */
    private final Handler f88040c;

    public arow(Looper looper) {
        this.f88040c = new adzt(looper);
    }

    /* renamed from: a */
    public final void mo48723a(arok arok) {
        Object obj;
        this.f88039b = arok;
        C1240of ofVar = (C1240of) this.f88038a.poll();
        if (arok != null && ofVar != null && (obj = ofVar.f26798a) != null && ofVar.f26799b != null) {
            mo48724a(arok, ((Integer) obj).intValue(), (Bundle) ofVar.f26799b);
        }
    }

    /* renamed from: b */
    public final void mo48707b(int i, Bundle bundle) {
        arok arok = this.f88039b;
        if (arok == null) {
            this.f88038a.add(C1240of.m19758a(Integer.valueOf(i), bundle));
        } else {
            arok.mo48707b(i, bundle);
        }
    }

    /* renamed from: a */
    public final void mo48724a(arok arok, int i, Bundle bundle) {
        this.f88040c.post(new arov(this, arok, i, bundle));
    }
}
