package p000;

import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: abws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abws extends Exception {

    /* renamed from: a */
    public final bpzq f58647a;

    /* renamed from: b */
    public final bpzo f58648b;

    /* renamed from: c */
    public final ActionImpl f58649c;

    public abws(bpzo bpzo, String str, ActionImpl actionImpl, bpzq bpzq) {
        super(str);
        sdo.m34959a(actionImpl);
        this.f58648b = bpzo;
        this.f58649c = actionImpl;
        this.f58647a = bpzq;
    }

    public abws(bpzo bpzo, String str, ActionImpl actionImpl, bpzq bpzq, Throwable th) {
        super(str, th);
        sdo.m34959a(actionImpl);
        this.f58648b = bpzo;
        this.f58649c = actionImpl;
        this.f58647a = bpzq;
    }

    public abws(String str, bpzq bpzq) {
        super(str);
        this.f58648b = bpzo.ACTION_START;
        this.f58649c = null;
        this.f58647a = bpzq;
    }

    public abws(String str, ActionImpl actionImpl, bpzq bpzq) {
        super(str);
        sdo.m34959a(actionImpl);
        this.f58648b = bpzo.ACTION_START;
        this.f58649c = actionImpl;
        this.f58647a = bpzq;
    }
}
