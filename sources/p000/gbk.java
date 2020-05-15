package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: gbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gbk extends gbt implements aaai {

    /* renamed from: a */
    private static final sek f17831a = tea.m36798a("asterism-api-stub");

    /* renamed from: b */
    private final Context f17832b;

    /* renamed from: c */
    private final aaag f17833c;

    /* renamed from: d */
    private final String f17834d;

    public gbk(Context context, aaag aaag, String str) {
        this.f17832b = context;
        this.f17833c = aaag;
        this.f17834d = str;
    }

    /* renamed from: a */
    private final boolean m12880a() {
        if (spn.m35869b()) {
            return true;
        }
        if (!rfz.m33557a(this.f17832b.getApplicationContext()).mo24610b(this.f17834d)) {
            f17831a.mo25412b("%s is not a 1P app.", this.f17834d);
            return false;
        }
        for (String str : bmyx.m108640a(',').mo66925c((CharSequence) cdfb.f180638a.mo6606a().mo77382b())) {
            if (str.equals(this.f17834d)) {
                return true;
            }
        }
        f17831a.mo25412b("%s is not allowed to call this API.", this.f17834d);
        return false;
    }

    /* renamed from: a */
    public final void mo11621a(gbx gbx, GetAsterismConsentRequest getAsterismConsentRequest) {
        f17831a.mo25412b("getAsterismConsent()", new Object[0]);
        if (!m12880a()) {
            try {
                gbf gbf = new gbf();
                gbf.f17817a = getAsterismConsentRequest.f9825a;
                gbf.f17818b = 0;
                gbx.mo11626a(new Status(34501), gbf.mo11614a());
            } catch (RemoteException e) {
                f17831a.mo25415d("Remote exception: ", e, new Object[0]);
            } catch (IllegalStateException e2) {
                f17831a.mo25415d("Illegal state: ", e2, new Object[0]);
            }
        } else {
            this.f17833c.mo16658a(new gbm(this.f17832b, gbx, getAsterismConsentRequest));
        }
    }

    /* renamed from: a */
    public final void mo11622a(gbx gbx, SetAsterismConsentRequest setAsterismConsentRequest) {
        f17831a.mo25412b("setAsterismConsent()", new Object[0]);
        if (!m12880a()) {
            try {
                gbx.mo11611a(new Status(34501), new SetAsterismConsentResponse(setAsterismConsentRequest.f9829a));
            } catch (RemoteException e) {
                f17831a.mo25415d("Remote exception: ", e, new Object[0]);
            }
        } else {
            this.f17833c.mo16658a(new gbq(this.f17832b, gbx, setAsterismConsentRequest));
        }
    }
}
