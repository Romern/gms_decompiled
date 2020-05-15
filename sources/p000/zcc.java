package p000;

import android.os.IInterface;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;

/* renamed from: zcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface zcc extends IInterface {
    /* renamed from: a */
    void mo30923a(SessionInsertRequest sessionInsertRequest);

    /* renamed from: a */
    void mo30924a(SessionReadRequest sessionReadRequest);

    /* renamed from: a */
    void mo30925a(SessionRegistrationRequest sessionRegistrationRequest);

    /* renamed from: a */
    void mo30926a(SessionStartRequest sessionStartRequest);

    /* renamed from: a */
    void mo30927a(SessionStopRequest sessionStopRequest);

    /* renamed from: a */
    void mo30928a(SessionUnregistrationRequest sessionUnregistrationRequest);
}
