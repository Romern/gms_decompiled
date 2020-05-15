package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bnha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bnha {

    /* renamed from: a */
    Object[] f131613a;

    /* renamed from: b */
    int f131614b;

    public bnha() {
        this(4);
    }

    /* renamed from: a */
    private final void m109394a(int i) {
        int i2 = i + i;
        Object[] objArr = this.f131613a;
        int length = objArr.length;
        if (i2 > length) {
            this.f131613a = Arrays.copyOf(objArr, bngl.m109321a(length, i2));
        }
    }

    /* renamed from: b */
    public bnhe mo67618b() {
        return bnoj.m109969a(this.f131614b, this.f131613a);
    }

    public bnha(int i) {
        this.f131613a = new Object[(i + i)];
        this.f131614b = 0;
    }

    /* renamed from: b */
    public void mo67695b(Object obj, Object obj2) {
        m109394a(this.f131614b + 1);
        bndz.m109114a(obj, obj2);
        Object[] objArr = this.f131613a;
        int i = this.f131614b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f131614b = i + 1;
    }

    /* renamed from: a */
    public void mo67693a(Iterable iterable) {
        if (iterable instanceof Collection) {
            m109394a(this.f131614b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mo67695b(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public void mo67694a(Map map) {
        mo67693a(map.entrySet());
    }
}
