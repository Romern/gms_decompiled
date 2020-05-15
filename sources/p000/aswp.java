package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: aswp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aswp extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return asih.f89034r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayService");
        if (queryLocalInterface instanceof aswj) {
            return (aswj) queryLocalInterface;
        }
        return new aswh(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.tapandpay.service.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.tapandpay.internal.ITapAndPayService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        return new Bundle();
    }

    public aswp(Context context, Looper looper, rjz rjz, rka rka, sat sat) {
        super(context, looper, 79, sat, rjz, rka);
    }
}
