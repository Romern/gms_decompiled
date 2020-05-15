package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: rlm */
final /* synthetic */ class rlm implements Runnable {

    /* renamed from: a */
    private final rkd f43235a;

    /* renamed from: b */
    private final Status f43236b;

    public rlm(rkd rkd, Status status) {
        this.f43235a = rkd;
        this.f43236b = status;
    }

    public final void run() {
        rkd rkd = this.f43235a;
        Status status = this.f43236b;
        int i = BasePendingResult.f30119l;
        rkd.mo24807a(status);
    }
}
