package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: hxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hxn extends sbm {

    /* renamed from: a */
    private final Bundle f20530a;

    public hxn(Context context, Looper looper, sat sat, gsu gsu, rlz rlz, rof rof) {
        super(context, looper, 16, sat, rlz, rof);
        Bundle bundle;
        if (gsu == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(gsu.f18973a);
        }
        this.f20530a = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof hxt) {
            return (hxt) queryLocalInterface;
        }
        return new hxr(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        return this.f20530a;
    }

    /* renamed from: g */
    public final boolean mo12787g() {
        sat sat = this.f44003H;
        return !TextUtils.isEmpty(sat.mo25318a()) && !sat.mo25319a(gss.f18969a).isEmpty();
    }
}
