package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: ggt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ggt extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
        if (queryLocalInterface instanceof ggw) {
            return (ggw) queryLocalInterface;
        }
        return new ggu(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.audit.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.audit.internal.IAuditService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12200000;
    }

    public ggt(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, MfiClientException.TYPE_MFICLIENT_NOT_STARTED, sat, rjz, rka);
    }
}
