package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sdf {

    /* renamed from: a */
    private final List f44061a = new ArrayList();

    /* renamed from: b */
    private final Object f44062b;

    public sdf(Object obj) {
        sdo.m34959a(obj);
        this.f44062b = obj;
    }

    /* renamed from: a */
    public final void mo25395a(Object obj) {
        this.f44061a.add(String.valueOf(obj));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f44062b.getClass().getSimpleName());
        sb.append('{');
        int size = this.f44061a.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.f44061a.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo25396a(String str, Object obj) {
        List list = this.f44061a;
        sdo.m34959a((Object) str);
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }
}
