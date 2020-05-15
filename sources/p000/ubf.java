package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ubf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ubf {

    /* renamed from: a */
    final Set f47118a = new HashSet();

    /* renamed from: b */
    public final uhn f47119b;

    public ubf(uhn uhn) {
        this.f47119b = uhn;
    }

    /* renamed from: a */
    public final Collection mo27068a() {
        ArrayList arrayList;
        synchronized (this.f47118a) {
            arrayList = new ArrayList(this.f47118a);
        }
        return arrayList;
    }
}
