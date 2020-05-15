package p000;

import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: atzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzr extends atfg implements atze {

    /* renamed from: a */
    public static final srn f91287a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final String f91288b;

    /* renamed from: c */
    private final AccountInfo f91289c;

    /* renamed from: d */
    private final Map f91290d = new HashMap();

    /* renamed from: e */
    private final boolean f91291e;

    /* renamed from: f */
    private int f91292f = 1;

    /* renamed from: g */
    private final rjx f91293g;

    public atzr(rjx rjx, String str, AccountInfo accountInfo, boolean z) {
        this.f91293g = rjx;
        this.f91288b = str;
        this.f91289c = accountInfo;
        this.f91291e = z;
    }

    /* renamed from: a */
    public final void mo49920a(askf askf, String str, bxxc bxxc, bxxc bxxc2, atfd atfd, Object obj) {
        sdo.m34974b(!str.startsWith("e/"));
        atzq atzq = new atzq(atfd, bxxc2);
        int i = this.f91292f;
        this.f91292f = i + 1;
        this.f91290d.put(Integer.valueOf(i), atzq);
        this.f91293g.mo24694a(this.f91288b, "/tapandpay/proxy", auai.m76649a(auaa.m76626a(i, this.f91289c, str, bxxc.serializeToBytes()), this.f91291e));
    }

    /* renamed from: a */
    public final void mo50326a(String str, Bundle bundle) {
        if ("crossbarResponse".equals(str)) {
            int i = bundle.getInt("requestId");
            Map map = this.f91290d;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                atzq atzq = (atzq) this.f91290d.get(valueOf);
                if (bundle.containsKey("message")) {
                    byte[] byteArray = bundle.getByteArray("message");
                    try {
                        atzq.f91285a.onResponse((bxxc) ((bxxk) ((GeneratedMessageLite) atzq.f91286b).mo74142c(7)).mo73657a(byteArray));
                    } catch (bxwf e) {
                        ((bnsl) f91287a.mo68387b()).mo68405a("Error parsing response");
                    }
                } else {
                    atzq.f91285a.onErrorResponse(new VolleyError(bundle.getString("error")));
                }
                this.f91290d.remove(Integer.valueOf(i));
            }
        }
    }
}
