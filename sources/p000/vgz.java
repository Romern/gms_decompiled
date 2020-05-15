package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: vgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vgz {

    /* renamed from: a */
    private final Set f49240a = new HashSet();

    /* renamed from: a */
    public final synchronized void mo28437a(vhb vhb) {
        if (!mo28439c(vhb)) {
            this.f49240a.add(vhb);
        } else {
            throw new IllegalStateException("This document is already open.");
        }
    }

    /* renamed from: b */
    public final synchronized void mo28438b(vhb vhb) {
        this.f49240a.remove(vhb);
    }

    /* renamed from: c */
    public final synchronized boolean mo28439c(vhb vhb) {
        return this.f49240a.contains(vhb);
    }
}
