package p000;

import com.google.android.gms.beacon.BleSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ngw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngw {

    /* renamed from: a */
    public final Map f35553a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    public final Map f35554b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    final HashMap f35555c = new HashMap();

    /* renamed from: a */
    public final boolean mo20630a() {
        return !this.f35553a.isEmpty() || !this.f35554b.isEmpty();
    }

    /* renamed from: b */
    public final Collection mo20631b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f35553a.values());
        arrayList.addAll(this.f35554b.values());
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection], assign insn: 0x0000: INVOKE  (r0v0 ? I:java.util.Collection) = (r8v0 'this' ngw A[THIS]) type: VIRTUAL call: ngw.b():java.util.Collection */
    /* renamed from: c */
    public final int mo20632c() {
        ? b = mo20631b();
        int size = b.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            ngr ngr = (ngr) b.get(i2);
            if (i == -1 || BleSettings.m22043a(ngr.f35541e.f29265a) > BleSettings.m22043a(i)) {
                i = ngr.f35541e.f29265a;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo20633d() {
        return new ArrayList(this.f35553a.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final List mo20634e() {
        return new ArrayList(this.f35554b.values());
    }
}
