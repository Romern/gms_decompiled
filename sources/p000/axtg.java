package p000;

import com.google.android.gms.wearable.internal.PutDataResponse;
import java.util.List;
import java.util.concurrent.FutureTask;

/* renamed from: axtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axtg extends axtc {

    /* renamed from: a */
    private final List f96312a;

    public axtg(rlf rlf, List list) {
        super(rlf);
        this.f96312a = list;
    }

    /* renamed from: a */
    public final void mo53458a(PutDataResponse putDataResponse) {
        mo53529a(new axqo(axsw.m83147a(putDataResponse.f110959a), putDataResponse.f110960b));
        if (putDataResponse.f110959a != 0) {
            List list = this.f96312a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((FutureTask) list.get(i)).cancel(true);
            }
        }
    }
}
