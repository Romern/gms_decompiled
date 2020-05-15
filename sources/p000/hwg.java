package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import java.util.List;

/* renamed from: hwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hwg extends dcj implements hwi {
    public hwg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
    }

    /* renamed from: a */
    public final void mo12580a(hvw hvw, String str, BeginSignInRequest beginSignInRequest, InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hvw);
        bj.writeString(str);
        dcl.m8165a(bj, beginSignInRequest);
        dcl.m8165a(bj, internalSignInCredentialWrapper);
        mo8528b(2, bj);
    }

    /* renamed from: b */
    public final void mo12589b(rnt rnt, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo12581a(hwb hwb, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hwb);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(11, bj);
    }

    /* renamed from: b */
    public final void mo12590b(rnt rnt, String str, String str2, Account account) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        bj.writeString(str2);
        dcl.m8165a(bj, account);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo12582a(hwe hwe, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hwe);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo12583a(hwl hwl, String str, BeginSignInRequest beginSignInRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hwl);
        bj.writeString(str);
        dcl.m8165a(bj, beginSignInRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo12584a(hwo hwo, SavePasswordRequest savePasswordRequest, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hwo);
        dcl.m8165a(bj, savePasswordRequest);
        bj.writeString(str);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo12585a(rnt rnt, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, Account account, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, saveAccountLinkingTokenRequest);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        bj.writeString(str2);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo12586a(rnt rnt, SavePasswordRequest savePasswordRequest, List list, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, savePasswordRequest);
        bj.writeTypedList(list);
        bj.writeString(str);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo12587a(rnt rnt, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo12588a(rnt rnt, String str, String str2, Account account) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        bj.writeString(str2);
        dcl.m8165a(bj, account);
        mo8528b(3, bj);
    }
}
