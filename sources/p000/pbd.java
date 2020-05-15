package p000;

import android.content.ComponentName;
import android.os.IBinder;

/* renamed from: pbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pbd extends aeaa {

    /* renamed from: a */
    final /* synthetic */ pbm f38753a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pbd(pbm pbm, String str) {
        super(str);
        this.f38753a = pbm;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        pbm pbm = this.f38753a;
        bnsn bnsn = pbm.f38775a;
        pbm.f38780f.post(new pbc(this, componentName));
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        bnsi d = pbm.f38775a.mo68390d();
        d.mo68432a("pbd", "a", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Service available");
        this.f38753a.f38780f.post(new pbb(this, componentName, iBinder));
    }
}
