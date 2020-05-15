package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: scs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class scs extends dck implements sct {

    /* renamed from: a */
    final /* synthetic */ Context f44048a;

    /* renamed from: b */
    public final /* synthetic */ aqpe f44049b;

    public scs() {
        super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
    }

    /* renamed from: a */
    public final void mo25387a(ResolveAccountResponse resolveAccountResponse) {
        if (resolveAccountResponse.f30245c.mo17671b()) {
            aqpg aqpg = this.f44049b.f86471a;
            scb a = resolveAccountResponse.mo17826a();
            bmxy.m108581a(a);
            aqpg.mo48021a(a.mo25275a(), this.f44049b.f86471a.mo48022b());
            try {
                new aqoo(this.f44049b.f86471a, null, new aqpd(this, resolveAccountResponse)).mo6502a(this.f44048a);
            } catch (aaaj e) {
                this.f44049b.f86472b.mo24903a(new SignInResponse());
            }
        } else {
            this.f44049b.f86472b.mo24903a(new SignInResponse(resolveAccountResponse.f30245c, null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public scs(aqpe aqpe, Context context) {
        super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        this.f44049b = aqpe;
        this.f44048a = context;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo25387a((ResolveAccountResponse) dcl.m8163a(parcel, ResolveAccountResponse.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
