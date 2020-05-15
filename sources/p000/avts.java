package p000;

import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: avts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avts {

    /* renamed from: a */
    public boolean f93900a;

    /* renamed from: b */
    public boolean f93901b;

    /* renamed from: c */
    private final List f93902c = new ArrayList();

    /* renamed from: a */
    public final ConsentInformation mo51610a() {
        return new ConsentInformation(this.f93902c, this.f93900a, this.f93901b);
    }

    /* renamed from: a */
    public final void mo51611a(ConsentInformation.AccountConsentInformation accountConsentInformation) {
        sdo.m34966a(accountConsentInformation, "Account Consents cannot be null.");
        this.f93902c.add(accountConsentInformation);
    }
}
