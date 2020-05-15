package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;

/* renamed from: arfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfx extends aaab {

    /* renamed from: a */
    public final arjf f87623a;

    /* renamed from: b */
    private final arly f87624b;

    /* renamed from: c */
    private final Handler f87625c;

    public arfx(arjf arjf, arly arly, Handler handler) {
        super(76, "GetManagedAccountSetupInfoOperation");
        this.f87624b = arly;
        this.f87625c = handler;
        this.f87623a = arjf;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87624b.mo48622b().mo50378a(new sty(this.f87625c), new arfw(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87623a.mo48599a(status, (ManagedAccountSetupInfo) null);
    }
}
