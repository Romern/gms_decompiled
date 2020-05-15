package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Map;
import java.util.Set;

/* renamed from: zzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zzw extends rzu {

    /* renamed from: a */
    final /* synthetic */ zzx f56349a;

    /* renamed from: b */
    private int f56350b = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzw(zzx zzx, Context context, int i, int... iArr) {
        super(context, i, iArr);
        this.f56349a = zzx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return this.f56349a.f56356g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map mo25274b() {
        return this.f56349a.f56357h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16737a(int i, sck sck, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        this.f56349a.mo17600a(bundle, iBinder);
        super.mo16737a(i, sck, i2, str, str2, strArr, bundle, iBinder, str3, str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12163a(String str, int i) {
        this.f56350b = i;
        aaan.m21025a(str, i, this.f56349a.f56359j, this.f43905e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        aaam.m21023a(getServiceRequest, this.f56350b);
        Parcel obtain = Parcel.obtain();
        try {
            sbh.m34831a(getServiceRequest, obtain, 0);
            zzx zzx = this.f56349a;
            aaac aaac = new aaac(sbj, this.f56350b);
            obtain.setDataPosition(0);
            zzx.mo6267a(aaac, (GetServiceRequest) GetServiceRequest.CREATOR.createFromParcel(obtain));
        } finally {
            obtain.recycle();
        }
    }
}
