package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ntm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ntm extends aeaa {

    /* renamed from: a */
    final /* synthetic */ ntn f36434a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ntm(ntn ntn, String str) {
        super(str);
        this.f36434a = ntn;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        bnsi b = ntn.f36435a.mo68387b();
        b.mo68432a("ntm", "a", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Car IME died.");
        ntn ntn = this.f36434a;
        ntn.f36436b = null;
        ntn.mo21047a();
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        obs obs;
        bnsn bnsn = ntn.f36435a;
        ntn ntn = this.f36434a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.input.ICarProjectionInputService");
            obs = queryLocalInterface instanceof obs ? (obs) queryLocalInterface : new obs(iBinder);
        } else {
            obs = null;
        }
        ntn.f36436b = obs;
        this.f36434a.mo21564e();
    }
}
