package p000;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* renamed from: vxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxa extends vxb {

    /* renamed from: a */
    final /* synthetic */ Map f50174a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vxa(vxc vxc, String str, DroidGuardResultsRequest droidGuardResultsRequest, Map map) {
        super(vxc, str, droidGuardResultsRequest);
        this.f50174a = map;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28922a(vvq vvq) {
        String a = vvq.mo28905a(this.f50174a);
        vvq.mo28907b();
        return a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28921a(String str) {
        String valueOf = String.valueOf(str);
        return vxv.m41564b(valueOf.length() == 0 ? new String("getResults ") : "getResults ".concat(valueOf));
    }
}
