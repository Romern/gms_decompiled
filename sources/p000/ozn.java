package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: ozn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ozn {

    /* renamed from: a */
    public final bnic f38663a;

    /* renamed from: b */
    public final Set f38664b = new ConcurrentSkipListSet();

    public ozn(List list) {
        this.f38663a = bnic.m109495a((Collection) list);
    }

    /* renamed from: a */
    public final void mo22808a(Context context) {
        int callingUid = Binder.getCallingUid();
        if (Process.myUid() == callingUid) {
            bnsn bnsn = ozo.f38665a;
        } else if (this.f38664b.contains(Integer.valueOf(callingUid))) {
            bnsn bnsn2 = ozo.f38665a;
        } else {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
            rfz a = rfz.m33557a(context);
            if (packagesForUid != null) {
                for (String str : packagesForUid) {
                    boolean b = a.mo24610b(str);
                    boolean contains = this.f38663a.contains(str);
                    bnsn bnsn3 = ozo.f38665a;
                    Integer valueOf = Integer.valueOf(callingUid);
                    if (b && contains) {
                        this.f38664b.add(valueOf);
                        return;
                    }
                }
            }
            bnsi c = ozo.f38665a.mo68388c();
            c.mo68432a("ozn", "a", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68409a("Call from UID %d is not allowed.", callingUid);
            throw new SecurityException("Caller is not allowed");
        }
    }
}
