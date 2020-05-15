package p000;

import java.util.EnumMap;

/* renamed from: bfaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfaq {

    /* renamed from: a */
    public final EnumMap f113255a = new EnumMap(bfav.class);

    /* renamed from: a */
    public final bfar mo61342a() {
        return new bfar(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [bfav, java.lang.Float]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final void mo61343a(bfav bfav, float f) {
        this.f113255a.put((Enum) bfav, (Object) Float.valueOf(f));
    }
}
