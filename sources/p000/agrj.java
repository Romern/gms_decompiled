package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.Feature;

/* renamed from: agrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrj extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return agnu.f66156d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService");
        if (queryLocalInterface instanceof agri) {
            return (agri) queryLocalInterface;
        }
        return new agrg(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.mobiledataplan.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12600000;
    }

    public agrj(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, sat, rjz, rka);
    }
}
