package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: hib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hib extends sbm {

    /* renamed from: a */
    private final Bundle f19826a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
        if (queryLocalInterface instanceof hil) {
            return (hil) queryLocalInterface;
        }
        return new hij(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.api.credentials.internal_service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        return this.f19826a;
    }

    public hib(Context context, Looper looper, hid hid, sat sat, rjz rjz, rka rka) {
        super(context, looper, 179, sat, rjz, rka);
        Bundle bundle = new Bundle();
        bundle.putString("log_session_id", hid.f19828a);
        this.f19826a = bundle;
    }
}
