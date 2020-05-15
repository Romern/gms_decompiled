package p000;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* renamed from: unx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class unx {

    /* renamed from: a */
    public final String f48357a;

    /* renamed from: b */
    public final boolean f48358b;

    /* renamed from: c */
    public final unp f48359c;

    /* renamed from: d */
    public final boolean f48360d;

    /* renamed from: e */
    public final Set f48361e;

    /* renamed from: f */
    public final Object f48362f;

    /* renamed from: g */
    public final boolean f48363g;

    /* renamed from: h */
    public final unv f48364h;

    /* renamed from: i */
    public final int f48365i;

    public unx(String str, int i, boolean z, boolean z2, Set set, boolean z3, Object obj, unp unp, unv unv) {
        sdo.m34959a(unv);
        this.f48357a = str;
        this.f48365i = i;
        this.f48361e = set != null ? Collections.unmodifiableSet(set) : null;
        this.f48363g = z3;
        this.f48358b = z;
        this.f48362f = obj;
        this.f48359c = unp;
        this.f48364h = unv;
        this.f48360d = z2;
    }

    public final String toString() {
        return String.format(Locale.US, "FieldDefinition[%s, %s]", this.f48357a, unw.m39036a(this.f48365i));
    }
}
