package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;

/* renamed from: zca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zca extends dcj implements zcc {
    public zca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
    }

    /* renamed from: a */
    public final void mo30923a(SessionInsertRequest sessionInsertRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sessionInsertRequest);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo30924a(SessionReadRequest sessionReadRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sessionReadRequest);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo30925a(SessionRegistrationRequest sessionRegistrationRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sessionRegistrationRequest);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo30926a(SessionStartRequest sessionStartRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sessionStartRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo30927a(SessionStopRequest sessionStopRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sessionStopRequest);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo30928a(SessionUnregistrationRequest sessionUnregistrationRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sessionUnregistrationRequest);
        mo8528b(6, bj);
    }
}
