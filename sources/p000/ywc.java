package p000;

import com.google.android.gms.fitness.data.Field;
import java.util.Iterator;
import java.util.List;

/* renamed from: ywc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywc {
    /* renamed from: a */
    public static bngx m44932a(List list) {
        bngs b = bngx.m109371b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b.mo67668c(m44933a((Field) it.next()));
        }
        return b.mo67664a();
    }

    /* renamed from: a */
    public static caal m44933a(Field field) {
        return bzzj.m126352a(field.f32130a, caak.m126415a(field.f32131b), field.f32132c);
    }
}
