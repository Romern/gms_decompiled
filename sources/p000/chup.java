package p000;

import java.util.Comparator;

/* renamed from: chup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chup implements Comparator {

    /* renamed from: a */
    final /* synthetic */ chuq f189192a;

    public chup(chuq chuq) {
        this.f189192a = chuq;
    }

    public final int compare(Object obj, Object obj2) {
        int a = this.f189192a.mo85620a(obj) - this.f189192a.mo85620a(obj2);
        return a == 0 ? obj.getClass().getName().compareTo(obj2.getClass().getName()) : a;
    }
}
