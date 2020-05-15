package p000;

import com.google.android.gms.auth.api.accounttransfer.DeviceAuthInfo;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gud {

    /* renamed from: a */
    public boolean f19039a;

    /* renamed from: b */
    public long f19040b;

    /* renamed from: c */
    public final Set f19041c = new HashSet(2);

    /* renamed from: a */
    public final DeviceAuthInfo mo12231a() {
        return new DeviceAuthInfo(this.f19041c, 1, this.f19039a, this.f19040b);
    }

    /* renamed from: a */
    public final void mo12232a(long j) {
        this.f19040b = j;
        this.f19041c.add(3);
    }

    /* renamed from: a */
    public final void mo12233a(boolean z) {
        this.f19039a = z;
        this.f19041c.add(2);
    }
}
