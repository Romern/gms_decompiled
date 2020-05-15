package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: auof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auof extends aeaa {

    /* renamed from: a */
    final /* synthetic */ auol f92189a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public auof(auol auol, String str) {
        super(str);
        this.f92189a = auol;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        synchronized (this.f92189a.f92195b) {
            this.f92189a.f92198e = null;
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        auob auob;
        synchronized (this.f92189a.f92195b) {
            auol.f92192a.mo50711a("service connected", new Object[0]);
            auol auol = this.f92189a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.trustagent.common.service.IPreferenceService");
                auob = !(queryLocalInterface instanceof auob) ? new aunz(iBinder) : (auob) queryLocalInterface;
            } else {
                auob = null;
            }
            auol.f92198e = auob;
        }
        this.f92189a.mo50738e();
    }
}
