package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mdl extends aeaa {

    /* renamed from: a */
    final /* synthetic */ D2dSourceChimeraActivity f33484a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mdl(D2dSourceChimeraActivity d2dSourceChimeraActivity) {
        super("backup");
        this.f33484a = d2dSourceChimeraActivity;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f33484a.f29018b = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        mfy mfy;
        D2dSourceChimeraActivity d2dSourceChimeraActivity = this.f33484a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.backup.d2d.migrate.service.IBoundD2dSourceService");
            mfy = queryLocalInterface instanceof mfy ? (mfy) queryLocalInterface : new mfw(iBinder);
        } else {
            mfy = null;
        }
        d2dSourceChimeraActivity.f29018b = mfy;
        this.f33484a.mo17223a(new mdk(this));
    }
}
