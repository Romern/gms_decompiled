package p000;

/* renamed from: abxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxl {
    /* renamed from: a */
    public static int m48464a(Object[] objArr) {
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m48465a(abrv abrv, String str) {
        if (cemz.m137437c() != -1) {
            int a = abrv.f58073i.mo32350a(abrv.f58078n.mo43412g());
            if (((long) bpzk.m112432a(a)) > cemz.m137437c()) {
                absg.m48207e("Device in low storage mode (%s); not accept %s request.", abvc.m48307a(a), str);
                abrv.f58083s.mo32453b(14006);
                throw new brhm("Indexable rejected in device low storage condition.");
            }
        }
    }
}
