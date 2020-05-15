package p000;

import android.app.PendingIntent;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import java.util.ArrayList;

/* renamed from: lrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lrk {

    /* renamed from: a */
    public final ArrayList f26640a = new ArrayList();

    /* renamed from: a */
    public final FenceUpdateRequestImpl mo15389a() {
        return new FenceUpdateRequestImpl(this.f26640a);
    }

    /* renamed from: a */
    public final void mo15390a(String str) {
        sdo.m34977c(str);
        this.f26640a.add(UpdateFenceOperation.m22879a(str));
    }

    /* renamed from: a */
    public final void mo15391a(String str, long j, AwarenessFence awarenessFence, PendingIntent pendingIntent) {
        sdo.m34977c(str);
        sdo.m34959a(awarenessFence);
        sdo.m34959a(pendingIntent);
        this.f26640a.add(UpdateFenceOperation.m22880a(str, j, (ContextFenceStub) awarenessFence, pendingIntent));
    }

    /* renamed from: a */
    public final void mo15392a(String str, AwarenessFence awarenessFence, PendingIntent pendingIntent) {
        mo15391a(str, 0, awarenessFence, pendingIntent);
    }

    /* renamed from: a */
    public final void mo15393a(String str, AwarenessFence awarenessFence, lrj lrj) {
        sdo.m34977c(str);
        sdo.m34959a(awarenessFence);
        sdo.m34959a(lrj);
        this.f26640a.add(new UpdateFenceOperation(1, ContextFenceRegistrationStub.m22861a(str, 0, (ContextFenceStub) awarenessFence), lrj, (PendingIntent) null, (String) null, -1, -1));
    }

    /* renamed from: a */
    public final void mo15394a(lrj lrj) {
        sdo.m34959a(lrj);
        this.f26640a.add(new UpdateFenceOperation(3, (ContextFenceRegistrationStub) null, lrj, (PendingIntent) null, (String) null, -1, -1));
    }
}
