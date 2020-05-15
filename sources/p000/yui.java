package p000;

import android.content.ComponentName;
import android.os.IBinder;

/* renamed from: yui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yui extends aeaa {

    /* renamed from: a */
    final /* synthetic */ yuj f54641a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yui(yuj yuj) {
        super("fitness");
        this.f54641a = yuj;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        synchronized (this.f54641a.f54642a) {
            this.f54641a.f54642a.set(null);
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        this.f54641a.f54643b.mo69138b(iBinder);
    }
}
