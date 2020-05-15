package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: poe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class poe {

    /* renamed from: a */
    public final String f39903a;

    /* renamed from: b */
    public long f39904b;

    /* renamed from: c */
    public final List f39905c = new ArrayList();

    public poe(String str) {
        this.f39903a = str;
    }

    /* renamed from: a */
    public final Collection mo23516a() {
        return Collections.unmodifiableCollection(this.f39905c);
    }

    /* renamed from: a */
    public final void mo23517a(pnm pnm) {
        if (!this.f39905c.contains(pnm)) {
            this.f39905c.add(pnm);
            if (!pnm.f39854k.contains(this)) {
                pnm.f39854k.add(this);
                mo23517a(pnm);
            }
        }
    }
}
