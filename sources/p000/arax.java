package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;
import java.util.List;

/* renamed from: arax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arax implements aram {

    /* renamed from: a */
    final /* synthetic */ aray f87240a;

    public arax(aray aray) {
        this.f87240a = aray;
    }

    /* renamed from: a */
    public final void mo48338a() {
        this.f87240a.f87245h = true;
    }

    /* renamed from: a */
    public final void mo48339a(int i, String str) {
        this.f87240a.mo48238d(i);
        this.f87240a.mo48232b(i);
    }

    /* renamed from: a */
    public final void mo48340a(PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("pendingIntent", pendingIntent);
        this.f87240a.f87062c.mo48226a(new BootstrapProgressResult(1, bundle));
    }

    /* renamed from: a */
    public final void mo48341a(MessagePayload messagePayload) {
        this.f87240a.mo48233b(messagePayload);
    }

    /* renamed from: a */
    public final void mo48342a(String str) {
        this.f87240a.f87062c.mo48225a(str);
    }

    /* renamed from: a */
    public final void mo48343a(List list) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accounts", new ArrayList(list));
        this.f87240a.f87062c.mo48226a(new BootstrapProgressResult(1, bundle));
    }
}
