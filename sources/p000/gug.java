package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: gug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gug extends sbm {

    /* renamed from: a */
    private final Bundle f19042a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        if (queryLocalInterface instanceof gun) {
            return (gun) queryLocalInterface;
        }
        return new gul(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        return this.f19042a;
    }

    public gug(Context context, Looper looper, sat sat, gtt gtt, rjz rjz, rka rka) {
        super(context, looper, 128, sat, rjz, rka);
        this.f19042a = gtt == null ? new Bundle() : gtt.mo12209a();
    }
}
