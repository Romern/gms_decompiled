package p000;

import android.os.Bundle;
import android.util.Pair;
import java.util.LinkedList;
import java.util.List;

/* renamed from: gny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gny {

    /* renamed from: a */
    public final List f18756a = new LinkedList();

    /* renamed from: a */
    public static gny m13584a() {
        return new gny();
    }

    /* renamed from: b */
    public final Bundle mo12084b() {
        Bundle bundle = new Bundle();
        for (Pair pair : this.f18756a) {
            gnz gnz = (gnz) pair.first;
            bundle.putString(gnz.mo12087a(), gnz.mo12088a(pair.second));
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo12083a(gnz gnz, Object obj) {
        this.f18756a.add(Pair.create(gnz, obj));
    }
}
