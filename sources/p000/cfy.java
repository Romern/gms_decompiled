package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: cfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cfy implements Iterable {

    /* renamed from: a */
    public final List f6741a;

    cfy() {
        this(new ArrayList(2));
    }

    /* renamed from: b */
    public static cfx m4150b(cpx cpx) {
        return new cfx(cpx, cqv.f11865b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3828a() {
        return this.f6741a.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final cfy mo3831c() {
        return new cfy(new ArrayList(this.f6741a));
    }

    public final Iterator iterator() {
        return this.f6741a.iterator();
    }

    public cfy(List list) {
        this.f6741a = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3829a(cpx cpx) {
        return this.f6741a.contains(m4150b(cpx));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo3830b() {
        return this.f6741a.size();
    }
}
