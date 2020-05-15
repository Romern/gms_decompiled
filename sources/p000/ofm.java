package p000;

import android.os.IBinder;
import android.util.ArrayMap;

/* renamed from: ofm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ofm implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ ofn f37515a;

    /* renamed from: b */
    final nrm f37516b;

    /* renamed from: c */
    private volatile boolean f37517c = true;

    public ofm(ofn ofn, nrm nrm) {
        this.f37515a = ofn;
        this.f37516b = nrm;
    }

    /* renamed from: a */
    public final void mo22096a() {
        if (this.f37517c) {
            this.f37516b.f12819a.unlinkToDeath(this, 0);
            this.f37517c = false;
        }
    }

    /* renamed from: a */
    public final boolean mo22097a(IBinder iBinder) {
        return this.f37516b.f12819a == iBinder;
    }

    public final void binderDied() {
        mo22096a();
        ofn ofn = this.f37515a;
        synchronized (ofn.f37519a) {
            for (int i = 0; i < ofn.f37520b.size(); i++) {
                ((ArrayMap) ofn.f37520b.valueAt(i)).remove(this);
            }
            for (int i2 = 0; i2 < ofn.f37521c.size(); i2++) {
                ((ArrayMap) ofn.f37521c.valueAt(i2)).remove(this);
            }
            ofn.f37522d = null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ofm) && this.f37516b.f12819a == ((ofm) obj).f37516b.f12819a;
    }

    public final int hashCode() {
        return this.f37516b.f12819a.hashCode();
    }
}
