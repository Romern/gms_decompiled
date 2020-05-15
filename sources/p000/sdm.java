package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Map;
import java.util.Set;

/* renamed from: sdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sdm implements sbg {

    /* renamed from: a */
    private final Context f44067a;

    /* renamed from: b */
    private final int f44068b;

    /* renamed from: c */
    private final sft f44069c;

    /* renamed from: d */
    private final Set f44070d;

    /* renamed from: e */
    private final Map f44071e;

    public sdm(Context context, int i, Set set, Map map) {
        sft sft = sft.f44147a;
        this.f44067a = context;
        this.f44068b = i;
        this.f44070d = set;
        this.f44071e = map;
        this.f44069c = sft;
    }

    /* renamed from: a */
    public final ConnectionResult mo25330a(GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo) {
        if (!"com.google.android.gms".equals(getServiceRequest.f30230d)) {
            Set a = this.f44069c.mo25486a(this.f44070d);
            if (!a.isEmpty()) {
                int i = this.f44068b;
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("API ");
                sb.append(i);
                sb.append(" requires missing permission groups: ");
                sb.append(valueOf);
                Log.w("PermCheckPreProcessor", sb.toString());
                return new ConnectionResult(19, this.f44069c.mo25485a(this.f44067a.getApplicationContext(), this.f44070d, this.f44071e));
            }
        }
        return ConnectionResult.f30063a;
    }
}
