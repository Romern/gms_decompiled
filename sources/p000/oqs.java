package p000;

import android.content.Context;
import com.google.android.gms.carrierauth.EAPAKARequest;
import com.google.android.gms.common.api.Status;

/* renamed from: oqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oqs extends oqq implements aaai {

    /* renamed from: a */
    private static final Logger f38241a = tea.m36798a("carrier-auth-api-stub");

    /* renamed from: b */
    private final Context f38242b;

    /* renamed from: c */
    private final aaag f38243c;

    /* renamed from: d */
    private final oqk f38244d;

    /* renamed from: e */
    private final String f38245e;

    public oqs(Context context, aaag aaag, oqk oqk, String str) {
        this.f38242b = context;
        this.f38243c = aaag;
        this.f38244d = oqk;
        this.f38245e = str;
    }

    /* renamed from: a */
    public final void mo22518a(oqo oqo, EAPAKARequest eAPAKARequest) {
        if (spn.m35869b()) {
            this.f38243c.mo16658a(new oqt(this.f38242b, this.f38244d, oqo, eAPAKARequest));
        } else {
            if (!rfz.m33557a(this.f38242b.getApplicationContext()).mo24610b(this.f38245e)) {
                f38241a.mo25412b("%s is not a 1P app.", this.f38245e);
            } else {
                for (String str : bmyx.m108640a(',').mo66925c((CharSequence) cdfh.f180647a.mo6606a().mo77389b())) {
                    if (str.equals(this.f38245e)) {
                    }
                }
                f38241a.mo25412b("%s is not allowed to call this API.", this.f38245e);
            }
            oqo.mo22513a(new Status(33002), null);
            return;
        }
        this.f38243c.mo16658a(new oqt(this.f38242b, this.f38244d, oqo, eAPAKARequest));
    }
}
