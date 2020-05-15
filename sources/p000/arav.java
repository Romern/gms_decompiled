package p000;

import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

/* renamed from: arav */
final /* synthetic */ class arav implements aubw {

    /* renamed from: a */
    private final aray f87238a;

    public arav(aray aray) {
        this.f87238a = aray;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        aray aray = this.f87238a;
        WorkProfilePayload workProfilePayload = (WorkProfilePayload) obj;
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59099a(workProfilePayload);
        aray.mo48233b(messagePayload);
        aray.f87242e.mo48654g(workProfilePayload.mo59107b());
    }
}
