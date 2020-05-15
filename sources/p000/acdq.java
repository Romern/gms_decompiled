package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: acdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acdq implements acjh {

    /* renamed from: a */
    private final bqgg f59602a;

    /* renamed from: b */
    private final afmq f59603b;

    public acdq(afmq afmq, bqgg bqgg) {
        this.f59603b = afmq;
        this.f59602a = bqgg;
    }

    /* renamed from: a */
    public final void mo32708a() {
        try {
            this.f59603b.mo34967a(Status.f30107a, ((bygw) this.f59602a.get()).mo73642k());
        } catch (InterruptedException e) {
            mo32709a(ackq.m49337a(getClass().getSimpleName(), 14, "Failed to get ChannelConfig"));
        } catch (ExecutionException e2) {
            mo32709a(ackq.m49339a(getClass().getSimpleName(), "Failed to get ChannelConfig"));
        }
    }

    /* renamed from: a */
    public final void mo32709a(Status status) {
        this.f59603b.mo34967a(status, (byte[]) null);
    }
}
