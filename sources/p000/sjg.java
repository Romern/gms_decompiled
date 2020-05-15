package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Map;
import java.util.Set;

/* renamed from: sjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sjg extends rzu {

    /* renamed from: a */
    final /* synthetic */ sjh f44561a;

    /* renamed from: b */
    private int f44562b = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sjg(sjh sjh, Context context, int i, int... iArr) {
        super(context, i, iArr);
        this.f44561a = sjh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return this.f44561a.f44567e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map mo25274b() {
        return this.f44561a.f44568f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12163a(String str, int i) {
        this.f44562b = i;
        aaan.m21025a(str, i, this.f44561a.f44570h, this.f43905e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        aaam.m21023a(getServiceRequest, this.f44562b);
        Parcel obtain = Parcel.obtain();
        sbh.m34831a(getServiceRequest, obtain, 0);
        sjh sjh = this.f44561a;
        sjj sjj = new sjj(sbj);
        obtain.setDataPosition(0);
        sjh.mo7277a(sjj, (GetServiceRequest) GetServiceRequest.CREATOR.createFromParcel(obtain));
        obtain.recycle();
    }
}
