package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import java.util.List;

/* renamed from: syk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class syk extends syu implements aaai {

    /* renamed from: a */
    private static final Logger f45434a = tea.m36798a("api-stub");

    /* renamed from: b */
    private final Context f45435b;

    /* renamed from: c */
    private final aaag f45436c;

    /* renamed from: d */
    private final String f45437d;

    public syk(Context context, aaag aaag, String str) {
        this.f45435b = context;
        this.f45436c = aaag;
        this.f45437d = str;
    }

    /* renamed from: a */
    private final boolean m36588a() {
        if (spn.m35869b()) {
            f45434a.mo25412b("%s pass zero party check", this.f45437d);
            return true;
        } else if (!rfz.m33557a(this.f45435b).mo24610b(this.f45437d)) {
            f45434a.mo25412b("%s is not 1P app", this.f45437d);
            return false;
        } else {
            f45434a.mo25412b("%s pass 1st party check", this.f45437d);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo26246b(syy syy, Bundle bundle) {
        f45434a.mo25412b("verifyPhoneNumberSingleUse()", new Object[0]);
        if (!m36588a()) {
            try {
                syy.mo26221a(new Status(5000), (List) null);
            } catch (RemoteException e) {
                f45434a.mo25415d("Remote exception: ", e, new Object[0]);
            }
        } else if (!cdgc.f180745a.mo6606a().mo77493o()) {
            try {
                syy.mo26221a(new Status(5005), (List) null);
            } catch (RemoteException e2) {
                f45434a.mo25415d("Remote exception: ", e2, new Object[0]);
            }
        } else {
            bundle.putString("calling_package", this.f45437d);
            bundle.putString("one_time_verification", "True");
            bundle.putString("calling_api", "verifyPhoneNumberSingleUse");
            this.f45436c.mo16658a(new sym(this.f45435b, syy, bundle));
        }
    }

    /* renamed from: a */
    public final void mo26244a(syy syy, Bundle bundle) {
        f45434a.mo25412b("verifyPhoneNumberV1()", new Object[0]);
        if (!m36588a()) {
            try {
                syy.mo26221a(new Status(5000), (List) null);
            } catch (RemoteException e) {
                f45434a.mo25415d("Remote exception: ", e, new Object[0]);
            }
        } else if (bundle.isEmpty() || TextUtils.isEmpty(bundle.getString("one_time_verification")) || !bundle.getString("one_time_verification").equals("True") || cdgc.m133122c()) {
            bundle.putString("calling_package", this.f45437d);
            bundle.putString("calling_api", "verifyPhoneNumber");
            this.f45436c.mo16658a(new sym(this.f45435b, syy, bundle));
        } else {
            try {
                syy.mo26221a(new Status(5005), (List) null);
            } catch (RemoteException e2) {
                f45434a.mo25415d("Remote exception: ", e2, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo26245a(syy syy, VerifyPhoneNumberRequest verifyPhoneNumberRequest) {
        f45434a.mo25412b("verifyPhoneNumberV2()", new Object[0]);
        if (!m36588a()) {
            try {
                syy.mo26248a(new Status(5000), (VerifyPhoneNumberResponse) null);
            } catch (RemoteException e) {
                f45434a.mo25415d("Remote exception: ", e, new Object[0]);
            }
        } else if (cdgc.f180745a.mo6606a().mo77496r()) {
            Bundle bundle = (Bundle) verifyPhoneNumberRequest.f30489d.clone();
            if (bundle.isEmpty() || TextUtils.isEmpty(bundle.getString("one_time_verification")) || !bundle.getString("one_time_verification").equals("True") || cdgc.m133122c()) {
                bundle.putString("calling_api", "verifyPhoneNumber");
                syg syg = new syg();
                syg.f45429a = verifyPhoneNumberRequest.f30486a;
                long j = verifyPhoneNumberRequest.f30487b;
                syg.f45430b = j;
                syg.f45431c = verifyPhoneNumberRequest.f30488c;
                syg.f45432d = bundle;
                if (j < 0) {
                    syg.f45430b = 0;
                }
                if (syg.f45429a == null) {
                    syg.f45429a = cdgc.f180745a.mo6606a().mo77484f();
                }
                if (syg.f45431c == null) {
                    sxw sxw = new sxw();
                    if (sxw.f45405a == null) {
                        sxw.f45405a = "";
                    }
                    if (sxw.f45406b == null) {
                        sxw.f45406b = "";
                    }
                    syg.f45431c = new IdTokenRequest(sxw.f45405a, sxw.f45406b);
                }
                if (syg.f45432d == null) {
                    syg.f45432d = Bundle.EMPTY;
                }
                this.f45436c.mo16658a(new sym(this.f45435b, syy, new VerifyPhoneNumberRequest(syg.f45429a, syg.f45430b, syg.f45431c, syg.f45432d), this.f45437d));
                return;
            }
            try {
                syy.mo26248a(new Status(5005), (VerifyPhoneNumberResponse) null);
            } catch (RemoteException e2) {
                f45434a.mo25415d("Remote exception: ", e2, new Object[0]);
            }
        } else {
            try {
                syy.mo26248a(new Status(5005), (VerifyPhoneNumberResponse) null);
            } catch (RemoteException e3) {
                f45434a.mo25415d("Remote exception: ", e3, new Object[0]);
            }
        }
    }
}
