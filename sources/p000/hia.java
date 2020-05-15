package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: hia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hia extends sbm {

    /* renamed from: a */
    private final gsp f19825a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof hio) {
            return (hio) queryLocalInterface;
        }
        return new him(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        gsp gsp = this.f19825a;
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", gsp.f18960b);
        bundle.putBoolean("force_save_dialog", gsp.f18961c);
        bundle.putString("log_session_id", gsp.f18962d);
        return bundle;
    }

    public hia(Context context, Looper looper, sat sat, gsp gsp, rjz rjz, rka rka) {
        super(context, looper, 68, sat, rjz, rka);
        gso gso = new gso(gsp == null ? gsp.f18959a : gsp);
        gso.f18958c = adbv.m50143a();
        this.f19825a = gso.mo12173a();
    }
}
