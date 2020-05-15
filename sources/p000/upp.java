package p000;

import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: upp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class upp implements upr {

    /* renamed from: a */
    final /* synthetic */ upq f48491a;

    public upp(upq upq) {
        this.f48491a = upq;
    }

    /* renamed from: a */
    public final void mo27832a(ChangesAvailableEvent changesAvailableEvent) {
        this.f48491a.f48535b.mo27248a(new OnEventResponse(changesAvailableEvent));
    }
}
