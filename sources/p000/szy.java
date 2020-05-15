package p000;

import android.os.Bundle;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;

/* renamed from: szy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class szy extends soa {

    /* renamed from: a */
    final aubq f45537a = new szw(this);

    /* renamed from: b */
    final /* synthetic */ szz f45538b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public szy(szz szz) {
        super(9);
        this.f45538b = szz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26307a(Boolean bool) {
        ApiConsentChimeraActivity.f30509a.mo25412b("setConsent %s", bool);
        if (!bool.booleanValue()) {
            this.f45538b.f45541c.f30512d = 5;
        } else {
            szz szz = this.f45538b;
            if (szz.f45539a) {
                szz.f45541c.f30512d = -1;
            } else {
                szz.f45541c.f30512d = 1;
            }
        }
        this.f45538b.f45541c.finish();
    }

    public final void run() {
        int i;
        gbh gbh = new gbh();
        ApiConsentChimeraActivity apiConsentChimeraActivity = this.f45538b.f45541c;
        int i2 = apiConsentChimeraActivity.f30518j;
        apiConsentChimeraActivity.f30518j = i2 + 1;
        gbh.f17819a = i2;
        gbh.f17820b = 2;
        gbh.f17821c = 3;
        gbh.f17827i = apiConsentChimeraActivity.f30510b;
        gbh.f17828j = apiConsentChimeraActivity.f30519k;
        gbh.f17829k = apiConsentChimeraActivity.f30520l;
        gbh.f17830l = apiConsentChimeraActivity.f30521m;
        gbh.f17822d = Long.valueOf(System.currentTimeMillis());
        gbh.f17823e = this.f45538b.f45540b;
        gbh.f17824f = Bundle.EMPTY;
        gbh.f17825g = 1;
        gbh.f17826h = Integer.toString(201515033);
        try {
            gbd gbd = this.f45538b.f45541c.f30525q;
            int i3 = gbh.f17820b;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("Invalid AsterismClient.");
                }
            }
            int i4 = gbh.f17821c;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("Invalid FlowContext.");
                    }
                }
            }
            int i5 = gbh.f17823e;
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("Invalid ConsentValue.");
                }
            }
            int i6 = gbh.f17825g;
            if (i6 == 0) {
                i = i6;
            } else {
                i = 1;
            }
            SetAsterismConsentRequest setAsterismConsentRequest = new SetAsterismConsentRequest(gbh.f17819a, i3, i4, null, gbh.f17822d, i5, gbh.f17824f, i, gbh.f17826h, gbh.f17827i, gbh.f17828j, gbh.f17829k, gbh.f17830l);
            roz b = rpa.m34196b();
            b.f43472a = new gbc(setAsterismConsentRequest);
            b.f43473b = new Feature[]{sxu.f45398a};
            gbd.mo24701a(b.mo24977a()).mo50371a(this.f45537a);
        } catch (IllegalStateException e) {
            ApiConsentChimeraActivity.f30509a.mo25417e("Couldn't change consent", e, new Object[0]);
            mo26307a(false);
        }
    }
}
