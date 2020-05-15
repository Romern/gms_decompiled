package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;

/* renamed from: aeqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeqn extends sbm {

    /* renamed from: a */
    private final String f63632a;

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return aegm.f63358e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.reporting.internal.IReportingService");
        if (queryLocalInterface instanceof aeql) {
            return (aeql) queryLocalInterface;
        }
        return new aeqj(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.location.reporting.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.location.reporting.internal.IReportingService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f63632a)) {
            bundle.putString("real_client_package_name", this.f63632a);
        }
        return bundle;
    }

    public aeqn(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 22, sat, rjz, rka);
        this.f63632a = sat.f43967e;
    }
}
