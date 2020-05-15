package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* renamed from: ida */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ida extends dck implements idb {

    /* renamed from: a */
    private final Context f20755a;

    public ida() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* renamed from: b */
    private final void m15256b() {
        if (!str.m36310a(this.f20755a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    public final void mo12931a() {
        ict ict;
        icr icr;
        m15256b();
        idk a = idk.m15277a(this.f20755a);
        GoogleSignInAccount a2 = a.mo12942a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f10332f;
        if (a2 != null) {
            googleSignInOptions = a.mo12945b();
        }
        Context context = this.f20755a;
        sdo.m34959a(googleSignInOptions);
        icf icf = new icf(context, googleSignInOptions);
        if (a2 == null) {
            rkb rkb = icf.f43165D;
            Context context2 = icf.f43168w;
            int a3 = icf.mo12910a();
            icv.f20750a.mo25412b("Signing out", new Object[0]);
            icv.m15248a(context2);
            if (a3 == 3) {
                icr = rkg.m33851a(Status.f30107a, rkb);
            } else {
                icr icr2 = new icr(rkb);
                rkb.mo24795b(icr2);
                icr = icr2;
            }
            sdl.m34954a(icr);
            return;
        }
        rkb rkb2 = icf.f43165D;
        Context context3 = icf.f43168w;
        int a4 = icf.mo12910a();
        icv.f20750a.mo25412b("Revoking access", new Object[0]);
        String a5 = idk.m15277a(context3).mo12943a("refreshToken");
        icv.m15248a(context3);
        if (a4 == 3) {
            ict = icn.m15234a(a5);
        } else {
            ict ict2 = new ict(rkb2);
            rkb2.mo24795b(ict2);
            ict = ict2;
        }
        sdl.m34954a(ict);
    }

    public ida(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f20755a = context;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo12931a();
        } else if (i != 2) {
            return false;
        } else {
            m15256b();
            icx.m15249a(this.f20755a).mo12927a();
        }
        return true;
    }
}
