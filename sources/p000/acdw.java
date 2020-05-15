package p000;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Map;

/* renamed from: acdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acdw implements acjh {

    /* renamed from: a */
    private final rnt f59612a;

    /* renamed from: b */
    private final Map f59613b;

    public acdw(rnt rnt, Map map) {
        this.f59612a = rnt;
        this.f59613b = map;
    }

    /* renamed from: a */
    public final void mo32708a() {
        for (babs babs : this.f59613b.values()) {
            try {
                babs.mo55564a();
            } catch (InterruptedException e) {
                this.f59612a.mo11797a(Status.f30108b);
                return;
            } catch (IOException e2) {
                this.f59612a.mo11797a(new Status(8, e2.getMessage()));
                return;
            }
        }
        this.f59612a.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo32709a(Status status) {
        this.f59612a.mo11797a(status);
    }
}
