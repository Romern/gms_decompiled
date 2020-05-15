package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: hwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hwt extends sbm {

    /* renamed from: a */
    private final Bundle f20482a;

    public hwt(Context context, Looper looper, sat sat, hvc hvc, rlz rlz, rof rof) {
        super(context, looper, BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, sat, rlz, rof);
        sdo.m34959a(hvc);
        Bundle bundle = new Bundle();
        bundle.putString("session_id", hvc.f20472a);
        this.f20482a = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo12105F() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
        if (queryLocalInterface instanceof hwi) {
            return (hwi) queryLocalInterface;
        }
        return new hwg(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.api.identity.service.gis_internal.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        return this.f20482a;
    }
}
