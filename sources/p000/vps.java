package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: vps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vps {

    /* renamed from: a */
    private final vpq f49733a;

    /* renamed from: b */
    private final Set f49734b;

    public vps(boolean z) {
        vpq vpq;
        if (z) {
            vpq = new vpq(this);
        } else {
            vpq = null;
        }
        this.f49733a = vpq;
        this.f49734b = new HashSet();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    private final void m41026a(ujx ujx, boolean z) {
        ukk a = ujx.mo27551a();
        boolean contains = this.f49734b.contains(a);
        if (!contains) {
            if (!mo26930a(ujx)) {
                return;
            }
        } else if (z && this.f49733a.f49730a.contains(a)) {
            return;
        }
        if (z) {
            vpq vpq = this.f49733a;
            sdo.m34971a(vpq.f49730a.add(ujx.mo27551a()), (Object) "Entry has already been considered before");
            boolean c = vpq.f49732c.mo26950c(ujx);
            if (c) {
                vpq.f49731b.add(ujx);
            }
            z = c;
        }
        if (!contains || z) {
            this.f49734b.add(a);
            uig b = mo26931b(ujx);
            if (b != null) {
                try {
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        m41026a((ujx) it.next(), z);
                    }
                } finally {
                    b.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo26930a(ujx ujx);

    /* renamed from: b */
    public final Set mo28729b() {
        return Collections.unmodifiableSet(this.f49734b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract uig mo26931b(ujx ujx);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo26950c(ujx ujx) {
        return false;
    }

    /* renamed from: d */
    public final void mo28730d(ujx ujx) {
        vpq vpq = this.f49733a;
        if (vpq != null) {
            vpq.f49730a.clear();
            vpq.f49731b.clear();
        }
        this.f49734b.clear();
        m41026a(ujx, this.f49733a != null);
    }

    /* renamed from: a */
    public final Set mo28728a() {
        return Collections.unmodifiableSet(this.f49733a.f49731b);
    }
}
