package p000;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import java.util.List;

/* renamed from: hwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface hwi extends IInterface {
    /* renamed from: a */
    void mo12580a(hvw hvw, String str, BeginSignInRequest beginSignInRequest, InternalSignInCredentialWrapper internalSignInCredentialWrapper);

    /* renamed from: a */
    void mo12581a(hwb hwb, String str, String str2);

    /* renamed from: a */
    void mo12582a(hwe hwe, String str, String str2);

    /* renamed from: a */
    void mo12583a(hwl hwl, String str, BeginSignInRequest beginSignInRequest);

    /* renamed from: a */
    void mo12584a(hwo hwo, SavePasswordRequest savePasswordRequest, String str);

    /* renamed from: a */
    void mo12585a(rnt rnt, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, Account account, String str2);

    /* renamed from: a */
    void mo12586a(rnt rnt, SavePasswordRequest savePasswordRequest, List list, String str);

    /* renamed from: a */
    void mo12587a(rnt rnt, String str, String str2);

    /* renamed from: a */
    void mo12588a(rnt rnt, String str, String str2, Account account);

    /* renamed from: b */
    void mo12589b(rnt rnt, String str, String str2);

    /* renamed from: b */
    void mo12590b(rnt rnt, String str, String str2, Account account);
}
