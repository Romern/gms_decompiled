package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ardg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ardg implements aram {

    /* renamed from: a */
    final /* synthetic */ ardn f87420a;

    public ardg(ardn ardn) {
        this.f87420a = ardn;
    }

    /* renamed from: a */
    public final void mo48338a() {
    }

    /* renamed from: a */
    public final void mo48339a(int i, String str) {
        this.f87420a.mo48437b(i, str);
    }

    /* renamed from: a */
    public final void mo48340a(PendingIntent pendingIntent) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo48341a(MessagePayload messagePayload) {
        this.f87420a.mo48252b(messagePayload);
    }

    /* renamed from: a */
    public final void mo48342a(String str) {
        ardn.f87438h.logVerbose("onTextMessage: ", str);
    }

    /* renamed from: a */
    public final void mo48343a(List list) {
        this.f87420a.f87452p.mo48432b();
        ArrayList arrayList = new ArrayList(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("extraAccountChallengeData", arrayList);
        this.f87420a.f87451o.mo48746a(1010, bundle);
    }
}
