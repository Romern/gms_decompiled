package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: axvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvt {

    /* renamed from: a */
    public final Map f96509a = new HashMap();

    /* renamed from: b */
    public final Random f96510b;

    public axvt(Random random) {
        sdo.m34959a(random);
        this.f96510b = random;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo53628a(axvz axvz) {
        return this.f96509a.get(axvs.m83323a(axvz));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object mo53632b(axvz axvz) {
        return this.f96509a.remove(axvs.m83323a(axvz));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo53629a(String str, long j, boolean z) {
        return this.f96509a.get(new axvs(str, j, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Collection mo53630a() {
        return this.f96509a.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53631a(axvz axvz, Object obj) {
        axvs a = axvs.m83323a(axvz);
        if (!this.f96509a.containsKey(a)) {
            Map map = this.f96509a;
            sdo.m34959a(obj);
            map.put(a, obj);
            return;
        }
        String valueOf = String.valueOf(axvz);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Channel already exists: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
