package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: bnid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnid extends bnhp {
    /* renamed from: a */
    public final bnig mo67757a() {
        Set<Map.Entry> entrySet = this.f131637a.entrySet();
        if (entrySet.isEmpty()) {
            return bnfc.f131553a;
        }
        bnha bnha = new bnha(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            bnic a = bnic.m109495a((Collection) entry.getValue());
            if (!a.isEmpty()) {
                bnha.mo67695b(key, a);
                i += a.size();
            }
        }
        return new bnig(bnha.mo67618b(), i);
    }

    /* renamed from: b */
    public final Collection mo67729b() {
        return bnen.m109149a();
    }

    /* renamed from: b */
    public final void mo67760b(Object obj, Iterable iterable) {
        super.mo67728a(obj, iterable);
    }

    /* renamed from: a */
    public final void mo67758a(Object obj, Object obj2) {
        super.mo67730b(obj, obj2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnhp.a(java.lang.Object, java.lang.Iterable):void
     arg types: [java.lang.Object, java.util.List]
     candidates:
      bnid.a(java.lang.Object, java.lang.Object):void
      bnid.a(java.lang.Object, java.lang.Object[]):void
      bnhp.a(java.lang.Object, java.lang.Iterable):void */
    /* renamed from: a */
    public final void mo67759a(Object obj, Object... objArr) {
        super.mo67728a(obj, (Iterable) Arrays.asList(objArr));
    }
}
