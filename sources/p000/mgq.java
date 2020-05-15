package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.chimera.Service;

/* renamed from: mgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mgq {

    /* renamed from: a */
    public final Handler f33652a = new adzt(Looper.getMainLooper());

    /* renamed from: b */
    public final mgp f33653b;

    /* renamed from: c */
    public final mgo f33654c;

    /* renamed from: d */
    public int f33655d;

    public mgq(Service service) {
        mgo mgo = new mgo(service);
        mgp mgp = new mgp(service);
        this.f33654c = mgo;
        this.f33653b = mgp;
        this.f33655d = 1;
    }

    /* renamed from: a */
    public final void mo19999a() {
        this.f33652a.post(new mgl(this));
    }
}
