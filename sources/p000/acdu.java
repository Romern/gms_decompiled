package p000;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: acdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acdu implements acjh {

    /* renamed from: a */
    private final rnt f59609a;

    /* renamed from: b */
    private final Map f59610b;

    public acdu(rnt rnt, Map map) {
        this.f59609a = rnt;
        this.f59610b = map;
    }

    /* renamed from: a */
    public final void mo32708a() {
        try {
            ((bame) this.f59610b.get("mdh-channelconfig-refresh")).mo55739a(null).get();
            this.f59609a.mo11797a(Status.f30107a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            mo32709a(ackq.m49337a(getClass().getSimpleName(), 14, "Failed to refresh channel config list"));
        } catch (ExecutionException e2) {
            mo32709a(ackq.m49337a(getClass().getSimpleName(), 8, "Failed to refresh channel config list"));
        }
    }

    /* renamed from: a */
    public final void mo32709a(Status status) {
        this.f59609a.mo11797a(status);
    }
}
