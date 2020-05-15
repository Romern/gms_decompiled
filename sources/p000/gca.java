package p000;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: gca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gca {

    /* renamed from: a */
    public final HashSet f17869a = new HashSet();

    /* renamed from: b */
    private final HashMap f17870b = new HashMap();

    /* renamed from: a */
    public final synchronized gbz mo11631a(gdt gdt, IBinder iBinder) {
        gbz gbz = (gbz) this.f17870b.get(gdt);
        if (gbz == null) {
            try {
                gbz gbz2 = new gbz(this, gdt);
                gbz2.mo11628a(iBinder);
                this.f17870b.put(gdt, gbz2);
                return gbz2;
            } catch (RemoteException e) {
                return null;
            }
        } else {
            gbz.mo11628a(iBinder);
            return gbz;
        }
    }

    /* renamed from: a */
    public final synchronized void mo11632a() {
        this.f17870b.size();
    }

    /* renamed from: a */
    public final synchronized void mo11633a(gby gby) {
        sdo.m34959a(gby);
        this.f17869a.add(gby);
    }

    /* renamed from: a */
    public final synchronized void mo11634a(gdt gdt) {
        gbz gbz = (gbz) this.f17870b.remove(gdt);
        if (gbz != null) {
            gbz.f17866c = false;
            Iterator it = gbz.f17865b.iterator();
            while (it.hasNext()) {
                ((IBinder) it.next()).unlinkToDeath(gbz, 0);
            }
        }
    }
}
