package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: anll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anll extends sbm {

    /* renamed from: a */
    final Handler f77055a = new adzt();

    /* renamed from: b */
    private final String[] f77056b;

    public anll(Context context, rjz rjz, rka rka, String[] strArr) {
        super(context, context.getMainLooper(), 70, sat.m34799a(context), rjz, rka);
        this.f77056b = strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalService");
        if (queryLocalInterface instanceof antq) {
            return (antq) queryLocalInterface;
        }
        return new anto(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.plus.service.internal.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.plus.internal.IPlusInternalService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("skip_oob", true);
        bundle.putStringArray("request_visible_actions", this.f77056b);
        bundle.putString("auth_package", this.f43948r.getPackageName());
        return bundle;
    }
}
