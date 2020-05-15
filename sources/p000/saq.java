package p000;

import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: saq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class saq {
    /* renamed from: a */
    public static WorkSource m34797a(Collection collection) {
        WorkSource workSource = new WorkSource();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ClientIdentity clientIdentity = (ClientIdentity) it.next();
            stx.m36338a(workSource, clientIdentity.f30221a, clientIdentity.f30222b);
        }
        return workSource;
    }
}
