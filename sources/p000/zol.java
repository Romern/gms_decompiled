package p000;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* renamed from: zol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zol extends RemoteCallbackList {

    /* renamed from: a */
    final /* synthetic */ zon f55607a;

    public zol(zon zon) {
        this.f55607a = zon;
    }

    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface) {
        zon zon = this.f55607a;
        srn srn = zon.f55609d;
        zon.f55614i.post(new zok(this, (yxh) iInterface));
    }
}
