package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;

/* renamed from: aieg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aieg extends aigt {

    /* renamed from: a */
    private final rlf f68828a;

    public aieg(rlf rlf) {
        sdo.m34959a(rlf);
        this.f68828a = rlf;
    }

    /* renamed from: a */
    public final void mo36573a(OnStartAdvertisingResultParams onStartAdvertisingResultParams) {
        Status c = aieh.m57074c(onStartAdvertisingResultParams.f80601a);
        if (c.mo17710c()) {
            this.f68828a.mo9482a(new aief(c));
        } else {
            this.f68828a.mo9481a(c);
        }
    }
}
