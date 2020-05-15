package p000;

import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uts extends dck implements IInterface {

    /* renamed from: a */
    public final /* synthetic */ umd f48631a;

    /* renamed from: b */
    public final /* synthetic */ upx f48632b;

    /* renamed from: c */
    public final /* synthetic */ uqe f48633c;

    /* renamed from: d */
    private final AtomicBoolean f48634d;

    public uts() {
        super("com.google.android.gms.drive.internal.IEventReleaseCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        String str;
        if (i != 1) {
            return false;
        }
        boolean a = dcl.m8167a(parcel);
        if (!a) {
            str = "dismiss";
        } else {
            str = "snooze";
        }
        if (this.f48634d.getAndSet(true)) {
            uqe.f48514a.mo25374b("EventDistributor", "Event released multiple times: %s", str);
        } else {
            uqe.f48514a.mo25369a("Event released remotely: %s", str);
            this.f48633c.f48521h.execute(new uqd(this, a));
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uts(uqe uqe, umd umd, upx upx) {
        super("com.google.android.gms.drive.internal.IEventReleaseCallback");
        this.f48633c = uqe;
        this.f48631a = umd;
        this.f48632b = upx;
        this.f48634d = new AtomicBoolean(false);
    }
}
