package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: hip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hip {

    /* renamed from: a */
    public Account f19832a;

    /* renamed from: b */
    private final Credential f19833b;

    public hip(Credential credential) {
        this.f19833b = credential;
    }

    /* renamed from: a */
    public final InternalCredentialWrapper mo12504a() {
        return new InternalCredentialWrapper(this.f19833b, this.f19832a);
    }
}
