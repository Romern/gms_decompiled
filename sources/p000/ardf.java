package p000;

import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;

/* renamed from: ardf */
final /* synthetic */ class ardf implements aubw {

    /* renamed from: a */
    private final ardn f87419a;

    public ardf(ardn ardn) {
        this.f87419a = ardn;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ardn ardn = this.f87419a;
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59102b((ArrayList) obj);
        ardn.mo48252b(messagePayload);
    }
}
