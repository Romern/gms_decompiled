package p000;

import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import java.util.List;

/* renamed from: zgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zgi {
    /* renamed from: a */
    public static WorkSource m45374a(zgh zgh) {
        List<ClientIdentity> list = zgh.f55018h;
        WorkSource workSource = new WorkSource();
        for (ClientIdentity clientIdentity : list) {
            stx.m36338a(workSource, clientIdentity.f30221a, clientIdentity.f30222b);
        }
        return workSource;
    }
}
