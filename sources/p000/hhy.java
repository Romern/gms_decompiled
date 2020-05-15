package p000;

import com.google.android.gms.auth.api.credentials.internal.AccountCredentialSettings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hhy {

    /* renamed from: a */
    public boolean f19817a;

    /* renamed from: b */
    public boolean f19818b;

    /* renamed from: c */
    public ArrayList f19819c = new ArrayList();

    /* renamed from: d */
    public boolean f19820d;

    public hhy() {
    }

    /* renamed from: a */
    public final AccountCredentialSettings mo12477a() {
        return new AccountCredentialSettings(this.f19817a, this.f19818b, this.f19819c, this.f19820d);
    }

    /* renamed from: a */
    public final void mo12478a(List list) {
        this.f19819c.addAll(list);
    }

    public hhy(AccountCredentialSettings accountCredentialSettings) {
        this.f19817a = accountCredentialSettings.f10134a;
        this.f19818b = accountCredentialSettings.f10135b;
        this.f19819c = new ArrayList(accountCredentialSettings.f10136c);
        this.f19820d = accountCredentialSettings.f10137d;
    }
}
