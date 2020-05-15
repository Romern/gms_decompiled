package p000;

import android.app.PendingIntent;
import android.util.Log;

/* renamed from: aekk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aekk extends aejx {

    /* renamed from: a */
    private rlf f63470a;

    public aekk(rlf rlf) {
        this.f63470a = rlf;
    }

    /* renamed from: a */
    private final void m52048a(int i) {
        if (this.f63470a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.f63470a.mo9482a((Object) aeil.m51882b(aeil.m51881a(i)));
        this.f63470a = null;
    }

    /* renamed from: b */
    public final void mo34205b(int i, String[] strArr) {
        m52048a(i);
    }

    /* renamed from: a */
    public final void mo34203a(int i, PendingIntent pendingIntent) {
        m52048a(i);
    }

    /* renamed from: a */
    public final void mo34204a(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }
}
