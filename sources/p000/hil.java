package p000;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: hil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface hil extends IInterface {
    /* renamed from: a */
    void mo12488a(hih hih);

    /* renamed from: a */
    void mo12489a(hih hih, Account account);

    /* renamed from: a */
    void mo12490a(hih hih, Account account, String str, Credential credential);

    /* renamed from: a */
    void mo12491a(hih hih, Account account, String str, Credential credential, boolean z, String str2, String str3);

    /* renamed from: a */
    void mo12492a(hih hih, Account account, String str, String str2, String str3);

    /* renamed from: a */
    void mo12493a(hih hih, Account account, String str, boolean z);

    /* renamed from: a */
    void mo12494a(hih hih, Account account, boolean z);

    /* renamed from: a */
    void mo12495a(hih hih, HintRequest hintRequest);

    /* renamed from: a */
    void mo12496a(hih hih, String str);

    /* renamed from: a */
    void mo12497a(hih hih, String str, CredentialRequest credentialRequest);

    /* renamed from: a */
    void mo12498a(hih hih, String str, boolean z);

    /* renamed from: b */
    void mo12499b(hih hih, Account account, boolean z);
}
