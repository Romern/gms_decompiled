package p000;

import android.content.ComponentName;
import android.os.IBinder;

/* renamed from: apip */
final /* synthetic */ class apip implements Runnable {

    /* renamed from: a */
    private final apir f84486a;

    /* renamed from: b */
    private final ComponentName f84487b;

    /* renamed from: c */
    private final IBinder f84488c;

    public apip(apir apir, ComponentName componentName, IBinder iBinder) {
        this.f84486a = apir;
        this.f84487b = componentName;
        this.f84488c = iBinder;
    }

    public final void run() {
        this.f84486a.mo47314b(this.f84487b, this.f84488c);
    }
}
