package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: out */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class out extends dck implements ouu {

    /* renamed from: a */
    final /* synthetic */ Context f38463a;

    /* renamed from: b */
    final /* synthetic */ AtomicBoolean f38464b;

    /* renamed from: c */
    final /* synthetic */ ozo f38465c;

    public out() {
        super("com.google.android.gms.carsetup.IServiceHandshakeCallback");
    }

    /* renamed from: a */
    public final void mo22658a() {
        try {
            ozo ozo = this.f38465c;
            Context context = this.f38463a;
            ozn ozn = (ozn) ozo.f38666b.mo6606a();
            int callingUid = Binder.getCallingUid();
            if (Process.myUid() == callingUid) {
                bnsn bnsn = ozo.f38665a;
            } else if (!ozn.f38664b.contains(Integer.valueOf(callingUid))) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                rfz a = rfz.m33557a(context);
                if (packagesForUid != null) {
                    int length = packagesForUid.length;
                    int i = 0;
                    while (i < length) {
                        String str = packagesForUid[i];
                        boolean b = a.mo24610b(str);
                        boolean contains = ozn.f38663a.contains(str);
                        bnsn bnsn2 = ozo.f38665a;
                        Integer valueOf = Integer.valueOf(callingUid);
                        if (b && contains) {
                            ozn.f38664b.add(valueOf);
                        } else {
                            i++;
                        }
                    }
                }
                bnsi c = ozo.f38665a.mo68388c();
                c.mo68432a("ozn", "a", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("Call from UID %d is not allowed.", callingUid);
                throw new SecurityException("Caller is not allowed");
            } else {
                bnsn bnsn3 = ozo.f38665a;
            }
            this.f38464b.set(true);
        } catch (SecurityException e) {
            bnsn bnsn4 = ozo.f38665a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public out(ozo ozo, Context context, AtomicBoolean atomicBoolean) {
        super("com.google.android.gms.carsetup.IServiceHandshakeCallback");
        this.f38465c = ozo;
        this.f38463a = context;
        this.f38464b = atomicBoolean;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo22658a();
        parcel2.writeNoException();
        return true;
    }
}
