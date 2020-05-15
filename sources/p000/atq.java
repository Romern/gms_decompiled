package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: atq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atq {

    /* renamed from: a */
    public final Map f2215a = new HashMap();

    /* renamed from: b */
    public View f2216b;

    /* renamed from: c */
    final ArrayList f2217c = new ArrayList();

    @Deprecated
    public atq() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof atq)) {
            return false;
        }
        atq atq = (atq) obj;
        return this.f2216b == atq.f2216b && this.f2215a.equals(atq.f2215a);
    }

    public final int hashCode() {
        return (this.f2216b.hashCode() * 31) + this.f2215a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2216b + "\n") + "    values:";
        for (String str2 : this.f2215a.keySet()) {
            str = str + "    " + str2 + ": " + this.f2215a.get(str2) + "\n";
        }
        return str;
    }

    public atq(View view) {
        this.f2216b = view;
    }
}
