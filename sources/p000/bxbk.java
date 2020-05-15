package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bxbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbk {

    /* renamed from: a */
    private final List f161816a = new ArrayList();

    /* renamed from: b */
    private final Object f161817b;

    public bxbk(Object obj) {
        bxbm.m122539a(obj);
        this.f161817b = obj;
    }

    /* renamed from: a */
    public final void mo73559a(String str, Object obj) {
        List list = this.f161816a;
        bxbm.m122539a(str);
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f161817b.getClass().getSimpleName());
        sb.append('{');
        int size = this.f161816a.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.f161816a.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
