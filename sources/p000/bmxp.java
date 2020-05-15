package p000;

import java.util.AbstractList;

/* renamed from: bmxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmxp extends AbstractList {

    /* renamed from: a */
    final /* synthetic */ Object[] f131174a;

    /* renamed from: b */
    final /* synthetic */ Object f131175b;

    /* renamed from: c */
    final /* synthetic */ Object f131176c;

    public bmxp(Object[] objArr, Object obj, Object obj2) {
        this.f131174a = objArr;
        this.f131175b = obj;
        this.f131176c = obj2;
    }

    public final Object get(int i) {
        return i != 0 ? i != 1 ? this.f131174a[i - 2] : this.f131176c : this.f131175b;
    }

    public final int size() {
        return this.f131174a.length + 2;
    }
}
