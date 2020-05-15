package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;

/* renamed from: agqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqw implements IBinder.DeathRecipient {

    /* renamed from: f */
    private static final srn f66293f = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    private final Context f66294a;

    /* renamed from: b */
    private final String f66295b;

    /* renamed from: c */
    private AbstractSafeParcelable f66296c;

    /* renamed from: d */
    private IBinder f66297d;

    /* renamed from: e */
    private ServiceConnection f66298e;

    /* renamed from: g */
    private int f66299g;

    public agqw(Context context, String str) {
        this.f66294a = context;
        this.f66295b = str;
    }

    /* renamed from: a */
    public final synchronized void mo35957a() {
        String str = this.f66295b;
        Intent intent = new Intent("com.google.android.gms.mobiledataplan.HANDLE_EVENT");
        intent.setPackage(str);
        this.f66298e = new agqv(this, "mobiledataplan");
        this.f66294a.getClass().getName();
        skh.m35531a().mo25690a(this.f66294a, intent, this.f66298e, 1);
    }

    /* renamed from: b */
    public final synchronized void mo35961b() {
        if (this.f66298e != null) {
            skh.m35531a().mo25689a(this.f66294a, this.f66298e);
            this.f66298e = null;
        }
    }

    public final synchronized void binderDied() {
        IBinder iBinder = this.f66297d;
        if (iBinder != null) {
            iBinder.unlinkToDeath(this, 0);
            mo35963c();
        }
    }

    /* renamed from: c */
    public final synchronized void mo35963c() {
        this.f66297d = null;
        this.f66298e = null;
    }

    /* renamed from: a */
    public final synchronized void mo35958a(IBinder iBinder) {
        agrc agrc;
        try {
            this.f66297d = iBinder;
            iBinder.linkToDeath(this, 0);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66293f.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Unable to link to event service death");
        }
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IEventCallbacks");
            agrc = queryLocalInterface instanceof agrc ? (agrc) queryLocalInterface : new agrc(iBinder);
        } else {
            agrc = null;
        }
        try {
            int i = this.f66299g;
            if (i != 0) {
                if (i != 1) {
                    Status status = Status.f30107a;
                    Parcel bj = agrc.mo8529bj();
                    dcl.m8165a(bj, status);
                    dcl.m8165a(bj, (MdpUpsellOfferResponse) this.f66296c);
                    agrc.mo8530c(2, bj);
                } else {
                    Status status2 = Status.f30107a;
                    Parcel bj2 = agrc.mo8529bj();
                    dcl.m8165a(bj2, status2);
                    dcl.m8165a(bj2, (MdpDataPlanStatusResponse) this.f66296c);
                    agrc.mo8530c(1, bj2);
                }
                mo35961b();
            } else {
                throw null;
            }
        } catch (RemoteException e2) {
            bnsl bnsl2 = (bnsl) f66293f.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68405a("Could not send event");
        }
    }

    /* renamed from: a */
    public final synchronized void mo35959a(MdpDataPlanStatusResponse mdpDataPlanStatusResponse) {
        this.f66296c = mdpDataPlanStatusResponse;
        this.f66299g = 1;
        mo35957a();
    }

    /* renamed from: a */
    public final synchronized void mo35960a(MdpUpsellOfferResponse mdpUpsellOfferResponse) {
        this.f66296c = mdpUpsellOfferResponse;
        this.f66299g = 2;
        mo35957a();
    }
}
