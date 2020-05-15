package p000;

import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

/* renamed from: arde */
final /* synthetic */ class arde implements aubw {

    /* renamed from: a */
    private final ardn f87418a;

    public arde(ardn ardn) {
        this.f87418a = ardn;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ardn ardn = this.f87418a;
        WorkProfilePayload workProfilePayload = (WorkProfilePayload) obj;
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59099a(workProfilePayload);
        ardn.mo48252b(messagePayload);
        ardn.f87446j.mo48654g(workProfilePayload.mo59107b());
    }
}
