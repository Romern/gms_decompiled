package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientIdentity;
import java.util.List;

/* renamed from: zdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zdn implements zgg {

    /* renamed from: a */
    private final Context f54958a;

    /* renamed from: b */
    private final ClientIdentity f54959b;

    /* renamed from: c */
    private final String f54960c;

    /* renamed from: d */
    private final zgg f54961d;

    /* renamed from: e */
    private final Runnable f54962e;

    /* renamed from: f */
    private final int f54963f;

    public zdn(Context context, ClientIdentity clientIdentity, String str, zgg zgg, Runnable runnable, int i) {
        this.f54958a = context;
        this.f54959b = clientIdentity;
        this.f54960c = str;
        this.f54961d = zgg;
        this.f54962e = runnable;
        this.f54963f = i;
    }

    /* renamed from: a */
    public final void mo30949a(List list) {
        spx a = spx.m35925a(this.f54958a);
        String str = this.f54960c;
        ClientIdentity clientIdentity = this.f54959b;
        int i = clientIdentity.f30221a;
        String str2 = clientIdentity.f30222b;
        bmxy.m108581a(str2);
        int c = a.mo25960c(str, i, str2);
        if (c != 2 && c != 1) {
            this.f54961d.mo30949a(list);
        } else if (this.f54963f - 1 == 0) {
            this.f54962e.run();
        }
    }

    public final String toString() {
        return String.format("CheckOpListener{delegate=%s}", this.f54961d);
    }
}
