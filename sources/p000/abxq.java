package p000;

import com.google.firebase.appindexing.internal.Thing;

/* renamed from: abxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxq extends Exception {

    /* renamed from: a */
    public final bpzq f58694a;

    /* renamed from: b */
    public final Thing f58695b;

    public abxq(String str, bpzq bpzq) {
        super(str);
        this.f58695b = null;
        this.f58694a = bpzq;
    }

    public abxq(String str, Thing thing, bpzq bpzq) {
        super(str);
        sdo.m34959a(thing);
        this.f58695b = thing;
        this.f58694a = bpzq;
    }

    public abxq(String str, Thing thing, bpzq bpzq, Throwable th) {
        super(str, th);
        sdo.m34959a(thing);
        this.f58695b = thing;
        this.f58694a = bpzq;
    }
}
