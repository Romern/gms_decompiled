package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;
import com.google.android.gms.fitness.result.SessionReadResult;

/* renamed from: zcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zcb extends dck implements zcc {

    /* renamed from: a */
    private final Context f54911a;

    /* renamed from: b */
    private final ytu f54912b;

    public zcb() {
        super("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
    }

    /* renamed from: a */
    public final void mo30923a(SessionInsertRequest sessionInsertRequest) {
        this.f54912b.mo30771a(2, sessionInsertRequest);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final void mo30924a(SessionReadRequest sessionReadRequest) {
        try {
            Context context = this.f54911a;
            bnia j = bnic.m109500j();
            j.mo67752b(bnjd.m109575a((Iterable) sessionReadRequest.f32296e, zoo.f55617a));
            j.mo67752b(bnjd.m109575a((Iterable) sessionReadRequest.f32297f, zop.f55618a));
            zdk.m45325a(context, j.mo67751a(), this.f54912b.f54621a);
            this.f54912b.mo30771a(3, sessionReadRequest);
        } catch (zdj e) {
            zch zch = sessionReadRequest.f32301j;
            sdo.m34959a(zch);
            zch.mo30931a(SessionReadResult.m23728a(new Status(5025)));
        }
    }

    public zcb(Context context, ytu ytu) {
        super("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
        this.f54911a = context;
        this.f54912b = ytu;
    }

    /* renamed from: a */
    public final void mo30925a(SessionRegistrationRequest sessionRegistrationRequest) {
        this.f54912b.mo30771a(4, sessionRegistrationRequest);
    }

    /* renamed from: a */
    public final void mo30926a(SessionStartRequest sessionStartRequest) {
        this.f54912b.mo30771a(0, sessionStartRequest);
    }

    /* renamed from: a */
    public final void mo30927a(SessionStopRequest sessionStopRequest) {
        this.f54912b.mo30771a(1, sessionStopRequest);
    }

    /* renamed from: a */
    public final void mo30928a(SessionUnregistrationRequest sessionUnregistrationRequest) {
        this.f54912b.mo30771a(5, sessionUnregistrationRequest);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo30926a((SessionStartRequest) dcl.m8163a(parcel, SessionStartRequest.CREATOR));
                break;
            case 2:
                mo30927a((SessionStopRequest) dcl.m8163a(parcel, SessionStopRequest.CREATOR));
                break;
            case 3:
                mo30923a((SessionInsertRequest) dcl.m8163a(parcel, SessionInsertRequest.CREATOR));
                break;
            case 4:
                mo30924a((SessionReadRequest) dcl.m8163a(parcel, SessionReadRequest.CREATOR));
                break;
            case 5:
                mo30925a((SessionRegistrationRequest) dcl.m8163a(parcel, SessionRegistrationRequest.CREATOR));
                break;
            case 6:
                mo30928a((SessionUnregistrationRequest) dcl.m8163a(parcel, SessionUnregistrationRequest.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
