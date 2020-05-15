package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: hsv */
public final /* synthetic */ class hsv implements bmxz {

    /* renamed from: a */
    private final Credential f20384a;

    public hsv(Credential credential) {
        this.f20384a = credential;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        return ((Account) obj).name.equals(this.f20384a.f10092a);
    }
}
