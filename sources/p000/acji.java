package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: acji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acji extends aaab {

    /* renamed from: a */
    private final acjh f59989a;

    /* renamed from: b */
    private final achw f59990b;

    public acji(achw achw, acjh acjh, String str) {
        super(127, str);
        this.f59990b = achw;
        this.f59989a = acjh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!acbm.m48831a()) {
            this.f59989a.mo32709a(new Status(17, "Delegate aborted"));
        }
        if (!rfy.m33550g(context)) {
            this.f59989a.mo32709a(new Status(13, "Diagnostics API not enabled on this device."));
        } else {
            this.f59989a.mo32708a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f59990b.mo25418e("%s#onFailure: %s", this.f27820m, status);
        this.f59989a.mo32709a(status);
    }
}
