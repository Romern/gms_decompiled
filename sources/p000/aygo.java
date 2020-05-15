package p000;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;

/* renamed from: aygo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygo extends aygz {

    /* renamed from: a */
    final /* synthetic */ CapabilityInfoParcelable f97541a;

    /* renamed from: b */
    final /* synthetic */ axxb f97542b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aygo(String str, Intent intent, CapabilityInfoParcelable capabilityInfoParcelable, axxb axxb) {
        super(str, intent);
        this.f97541a = capabilityInfoParcelable;
        this.f97542b = axxb;
    }

    /* renamed from: a */
    public final String mo53988a() {
        return this.f97542b.toString();
    }

    /* renamed from: a */
    public final void mo53989a(aygk aygk, axrv axrv) {
        axrv.mo53369a(this.f97541a);
    }

    /* renamed from: a */
    public final boolean mo53997a(IntentFilter[] intentFilterArr, boolean z, String str, String str2) {
        if (intentFilterArr != null) {
            return super.mo53997a(intentFilterArr, z, str, str2);
        }
        return str2 == null || str2.equals(this.f97542b.f96636b);
    }
}
