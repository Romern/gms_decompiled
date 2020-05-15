package p000;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferChimeraService;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: gsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gsx extends gum implements aaai {

    /* renamed from: a */
    private final aaag f18976a;

    /* renamed from: b */
    private final AccountTransferChimeraService f18977b;

    /* renamed from: c */
    private final GetServiceRequest f18978c;

    public gsx(AccountTransferChimeraService accountTransferChimeraService, aaag aaag, GetServiceRequest getServiceRequest) {
        this.f18977b = accountTransferChimeraService;
        this.f18976a = aaag;
        sdo.m34959a(getServiceRequest);
        this.f18978c = getServiceRequest;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gtv.a(guk, boolean):void
     arg types: [guk, int]
     candidates:
      gtv.a(com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData, android.content.Context):boolean
      gtv.a(guk, boolean):void */
    /* renamed from: a */
    private static final boolean m13841a(guk guk, Object obj) {
        if (obj != null) {
            return true;
        }
        gtv.m13890a(guk, false);
        return false;
    }

    /* renamed from: c */
    private static final boolean m13843c(guk guk, AccountTransferMsg accountTransferMsg) {
        if (accountTransferMsg != null) {
            return true;
        }
        gtv.m13889a(guk);
        return false;
    }

    /* renamed from: b */
    public final void mo12186b(guk guk, AccountTransferMsg accountTransferMsg) {
        if (!spn.m35869b()) {
            AccountTransferChimeraService.f10038a.mo25371b("Invalid call by non-0p");
            return;
        }
        int callingUid = Binder.getCallingUid();
        sbw sbw = AccountTransferChimeraService.f10038a;
        if (m13843c(guk, accountTransferMsg)) {
            Bundle bundle = this.f18978c.f30233g;
            this.f18976a.mo16659a(this.f18977b, new gve(callingUid, guk, accountTransferMsg, AccountTransferChimeraService.m6316a(bundle), AccountTransferChimeraService.m6317b(bundle)));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gtv.a(guk, boolean):void
     arg types: [guk, int]
     candidates:
      gtv.a(com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData, android.content.Context):boolean
      gtv.a(guk, boolean):void */
    /* renamed from: a */
    private static final boolean m13842a(guk guk, Object... objArr) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != null) {
                i++;
            } else {
                gtv.m13890a(guk, false);
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gtv.a(guk, boolean):void
     arg types: [guk, int]
     candidates:
      gtv.a(com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData, android.content.Context):boolean
      gtv.a(guk, boolean):void */
    /* renamed from: c */
    private static final boolean m13844c(guk guk, AuthenticatorTransferInfo authenticatorTransferInfo) {
        if (authenticatorTransferInfo != null) {
            return true;
        }
        gtv.m13890a(guk, true);
        return false;
    }

    /* renamed from: a */
    public final void mo12179a(guk guk, AccountTransferMsg accountTransferMsg) {
        if (!spn.m35869b()) {
            AccountTransferChimeraService.f10038a.mo25371b("Invalid call by non-0p");
            return;
        }
        int callingUid = Binder.getCallingUid();
        sbw sbw = AccountTransferChimeraService.f10038a;
        if (m13843c(guk, accountTransferMsg)) {
            Bundle bundle = this.f18978c.f30233g;
            this.f18976a.mo16659a(this.f18977b, new gvb(callingUid, guk, accountTransferMsg, AccountTransferChimeraService.m6316a(bundle), AccountTransferChimeraService.m6317b(bundle)));
        }
    }

    /* renamed from: b */
    public final void mo12187b(guk guk, AuthenticatorTransferInfo authenticatorTransferInfo) {
        if (m13844c(guk, authenticatorTransferInfo)) {
            int callingUid = Binder.getCallingUid();
            sbw sbw = AccountTransferChimeraService.f10038a;
            this.f18976a.mo16659a(this.f18977b, new gvd(callingUid, guk, authenticatorTransferInfo, true));
        }
    }

    /* renamed from: a */
    public final void mo12180a(guk guk, AuthenticatorTransferInfo authenticatorTransferInfo) {
        if (m13844c(guk, authenticatorTransferInfo)) {
            int callingUid = Binder.getCallingUid();
            sbw sbw = AccountTransferChimeraService.f10038a;
            this.f18976a.mo16659a(this.f18977b, new gva(callingUid, guk, authenticatorTransferInfo, true));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gsx.a(guk, java.lang.Object):boolean
     arg types: [guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest]
     candidates:
      gsx.a(guk, java.lang.Object[]):boolean
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest):void
      gsx.a(guk, java.lang.Object):boolean */
    /* renamed from: a */
    public final void mo12181a(guk guk, DeviceMetaDataRequest deviceMetaDataRequest) {
        if (m13841a(guk, (Object) deviceMetaDataRequest)) {
            if (m13842a(guk, deviceMetaDataRequest.f10080b)) {
                this.f18976a.mo16659a(this.f18977b, new gut(Binder.getCallingUid(), guk, deviceMetaDataRequest.f10080b));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gsx.a(guk, java.lang.Object):boolean
     arg types: [guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest]
     candidates:
      gsx.a(guk, java.lang.Object[]):boolean
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest):void
      gsx.a(guk, java.lang.Object):boolean */
    /* renamed from: a */
    public final void mo12182a(guk guk, NotifyCompletionRequest notifyCompletionRequest) {
        if (m13841a(guk, (Object) notifyCompletionRequest)) {
            if (m13842a(guk, notifyCompletionRequest.f10082b)) {
                this.f18976a.mo16659a(this.f18977b, new guu(Binder.getCallingUid(), guk, notifyCompletionRequest.f10082b, notifyCompletionRequest.f10083c));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gsx.a(guk, java.lang.Object):boolean
     arg types: [guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest]
     candidates:
      gsx.a(guk, java.lang.Object[]):boolean
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest):void
      gsx.a(guk, java.lang.Object):boolean */
    /* renamed from: a */
    public final void mo12183a(guk guk, RetrieveDataRequest retrieveDataRequest) {
        if (m13841a(guk, (Object) retrieveDataRequest)) {
            if (m13842a(guk, retrieveDataRequest.f10085b)) {
                this.f18976a.mo16659a(this.f18977b, new guv(Binder.getCallingUid(), guk, retrieveDataRequest.f10085b));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gsx.a(guk, java.lang.Object):boolean
     arg types: [guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest]
     candidates:
      gsx.a(guk, java.lang.Object[]):boolean
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest):void
      gsx.a(guk, java.lang.Object):boolean */
    /* renamed from: a */
    public final void mo12184a(guk guk, SendDataRequest sendDataRequest) {
        if (m13841a(guk, (Object) sendDataRequest)) {
            if (m13842a(guk, sendDataRequest.f10087b, sendDataRequest.f10088c)) {
                this.f18976a.mo16659a(this.f18977b, new guw(Binder.getCallingUid(), guk, sendDataRequest.f10087b, sendDataRequest.f10088c));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gsx.a(guk, java.lang.Object):boolean
     arg types: [guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest]
     candidates:
      gsx.a(guk, java.lang.Object[]):boolean
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest):void
      gsx.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest):void
      gun.a(guk, com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest):void
      gsx.a(guk, java.lang.Object):boolean */
    /* renamed from: a */
    public final void mo12185a(guk guk, UserChallengeRequest userChallengeRequest) {
        if (m13841a(guk, (Object) userChallengeRequest)) {
            if (m13842a(guk, userChallengeRequest.f10090b, userChallengeRequest.f10091c)) {
                this.f18976a.mo16659a(this.f18977b, new gux(Binder.getCallingUid(), guk, userChallengeRequest.f10090b, userChallengeRequest.f10091c));
            }
        }
    }
}
