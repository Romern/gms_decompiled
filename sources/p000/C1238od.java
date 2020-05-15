package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: od */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1238od {

    /* renamed from: b */
    C1233nz f26795b;

    /* renamed from: c */
    C1235oa f26796c;

    /* renamed from: d */
    C1237oc f26797d;

    /* renamed from: a */
    public static boolean m19743a(Map map, Collection collection) {
        int size = map.size();
        for (Object obj : collection) {
            map.remove(obj);
        }
        return size != map.size();
    }

    /* renamed from: b */
    public static boolean m19745b(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo15496a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo15497a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo15498a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo15499a(int i, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15500a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15501a(Object obj, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo15502b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map mo15503b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo15504c();

    /* renamed from: a */
    public static boolean m19744a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (NullPointerException e) {
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final Object[] mo15611b(int i) {
        int a = mo15496a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo15498a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public final Object[] mo15610a(Object[] objArr, int i) {
        int a = mo15496a();
        if (objArr.length < a) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo15498a(i2, i);
        }
        if (objArr.length > a) {
            objArr[a] = null;
        }
        return objArr;
    }
}
