package p000;

import android.content.Context;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* renamed from: vvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvp {

    /* renamed from: a */
    private final vxc f50049a;

    public vvp(Context context) {
        bdyx.m91615b(context);
        this.f50049a = new vxc(context);
    }

    /* renamed from: a */
    public static String m41461a(Context context, String str, Map map) {
        return new vvp(context).mo28903a(str, map, (DroidGuardResultsRequest) null);
    }

    /* renamed from: a */
    public static vvq m41462a(Context context, String str) {
        return new vvp(context).mo28904a(str, (DroidGuardResultsRequest) null);
    }

    /* renamed from: a */
    public final String mo28903a(String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
        return (String) new vxa(this.f50049a, str, droidGuardResultsRequest, map).mo28923a();
    }

    /* renamed from: a */
    public final vvq mo28904a(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        return (vvq) new vwz(this.f50049a, str, droidGuardResultsRequest).mo28923a();
    }
}
