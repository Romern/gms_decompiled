package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: dfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dfw {

    /* renamed from: a */
    public final dky f13025a;

    /* renamed from: b */
    public final dky f13026b;

    /* renamed from: c */
    public final List f13027c;

    /* renamed from: d */
    public final List f13028d;

    /* renamed from: e */
    public final List f13029e;

    /* renamed from: f */
    public final Map f13030f;

    public dfw(dky dky, dky dky2, Collection collection, Collection collection2, Collection collection3, Map map) {
        this.f13025a = dky;
        this.f13026b = dky2;
        this.f13027c = m8326a(collection);
        this.f13028d = m8326a(collection2);
        this.f13029e = m8326a(collection3);
        this.f13030f = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
    }

    /* renamed from: a */
    private static List m8326a(Collection collection) {
        if (collection != null) {
            return new ArrayList(collection);
        }
        return Collections.emptyList();
    }

    public final String toString() {
        return "ModuleSet Info " + dhz.m8548a(this.f13025a) + " Container APKs " + this.f13027c.toString() + " Required APKs " + this.f13028d.toString() + " Optional APKs " + this.f13029e.toString();
    }
}
