package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: idm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class idm extends idl {

    /* renamed from: e */
    private final shj f20765e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public idm(ide ide, GoogleSignInOptions googleSignInOptions, String str, shj shj) {
        super(ide, googleSignInOptions, str, "GoogleRevokeAccess");
        sdo.m34959a(googleSignInOptions);
        this.f20765e = shj;
    }

    /* renamed from: a */
    private final void m15283a() {
        this.f20764d.mo12921b(new Status(4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Account account;
        ClientContext clientContext;
        try {
            int i = svr.m36484b(context).mo26176b(this.f20762b, 0).applicationInfo.uid;
            GoogleSignInOptions googleSignInOptions = this.f20763c;
            String str = this.f20762b;
            Account account2 = googleSignInOptions.f10336i;
            if (account2 == null) {
                account = soz.m35793b(context, str);
            } else {
                account = account2;
            }
            if (account != null) {
                clientContext = new ClientContext(i, account, account, str, str);
                Set hashSet = new HashSet(googleSignInOptions.mo7526a());
                if (hashSet.size() != 0) {
                    if (idx.m15309a(googleSignInOptions)) {
                        hashSet = idx.m15308a(hashSet);
                    }
                    clientContext.mo17799a(stc.m36283a(hashSet));
                    if (clientContext == null) {
                        clientContext.mo17804b(context);
                        String a = new sie(clientContext).mo25585a(context);
                        if (a != null) {
                            try {
                                this.f20765e.mo25539a(clientContext, 0, a.length() == 0 ? new String("/revoke?token=") : "/revoke?token=".concat(a), null);
                            } catch (VolleyError | gid e) {
                                Logger Logger = f20761a;
                                String valueOf = String.valueOf(e.toString());
                                Logger.mo25416d(valueOf.length() == 0 ? new String("Revoke access request failed when calling LSO: ") : "Revoke access request failed when calling LSO: ".concat(valueOf), new Object[0]);
                            }
                            try {
                                gie.m13196b(context, a);
                            } catch (gid | IOException e2) {
                                Logger logger2 = f20761a;
                                String valueOf2 = String.valueOf(e2.toString());
                                logger2.mo25416d(valueOf2.length() == 0 ? new String("Error clearing the tokens locally: ") : "Error clearing the tokens locally: ".concat(valueOf2), new Object[0]);
                            }
                            new idn(new idq(), this.f20762b).mo6502a(context);
                            this.f20764d.mo12921b(Status.f30107a);
                            return;
                        }
                        m15283a();
                        return;
                    }
                    m15283a();
                    return;
                }
            }
            clientContext = null;
            if (clientContext == null) {
            }
        } catch (PackageManager.NameNotFoundException e3) {
            f20761a.mo25416d(String.valueOf(this.f20762b).concat(" from ServiceBroker not recognized by BrokerService"), new Object[0]);
            mo6503a(Status.f30109c);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f20764d.mo12921b(status);
    }
}
