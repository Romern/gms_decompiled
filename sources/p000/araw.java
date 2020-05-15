package p000;

import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;

/* renamed from: araw */
final /* synthetic */ class araw implements aubw {

    /* renamed from: a */
    private final aray f87239a;

    public araw(aray aray) {
        this.f87239a = aray;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        aray aray = this.f87239a;
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59102b((ArrayList) obj);
        aray.mo48233b(messagePayload);
    }
}
