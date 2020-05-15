package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: akbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akbf extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return new Feature[]{ahca.f66970a};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (queryLocalInterface instanceof ajyq) {
            return (ajyq) queryLocalInterface;
        }
        return new ajyo(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.nearby.sharing.START_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.nearby.sharing.internal.INearbySharingService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 15000000;
    }

    /* renamed from: r */
    public final boolean mo25303r() {
        return ahcb.m55443d(this.f43948r);
    }

    public akbf(Context context, Looper looper, rjz rjz, rka rka, sat sat) {
        super(context, looper, 194, sat, rjz, rka);
    }

    /* renamed from: a */
    public final void mo25292a(int i) {
        if (i == 1) {
            akbj.m59294a().mo39152b();
            akbe.m59276a().mo39147b();
        }
        super.mo25292a(i);
    }
}
