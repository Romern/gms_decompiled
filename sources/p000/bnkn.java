package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bnkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnkn {
    /* renamed from: a */
    public static ArrayList m109661a() {
        return new ArrayList();
    }

    /* renamed from: a */
    public static ArrayList m109662a(int i) {
        bndz.m109113a(i, "initialArraySize");
        return new ArrayList(i);
    }

    /* renamed from: a */
    public static ArrayList m109663a(Iterable iterable) {
        bmxy.m108581a(iterable);
        if (!(iterable instanceof Collection)) {
            return m109664a(iterable.iterator());
        }
        return new ArrayList((Collection) iterable);
    }

    /* renamed from: a */
    public static ArrayList m109664a(Iterator it) {
        ArrayList a = m109661a();
        bnjr.m109612a(a, it);
        return a;
    }

    @SafeVarargs
    /* renamed from: a */
    public static ArrayList m109665a(Object... objArr) {
        bmxy.m108581a(objArr);
        int length = objArr.length;
        bndz.m109113a(length, "arraySize");
        ArrayList arrayList = new ArrayList(bqcn.m112585b(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* renamed from: a */
    public static List m109666a(List list) {
        if (list instanceof bngx) {
            return ((bngx) list).mo67670d();
        }
        if (list instanceof bnki) {
            return ((bnki) list).f131762a;
        }
        if (list instanceof RandomAccess) {
            return new bnkg(list);
        }
        return new bnki(list);
    }

    /* renamed from: a */
    public static List m109667a(List list, int i) {
        bmxy.m108581a(list);
        bmxy.m108588a(true);
        return list instanceof RandomAccess ? new bnkf(list, i) : new bnke(list, i);
    }

    /* renamed from: a */
    public static List m109668a(List list, bmxj bmxj) {
        return list instanceof RandomAccess ? new bnkk(list, bmxj) : new bnkm(list, bmxj);
    }

    /* renamed from: a */
    public static boolean m109669a(List list, Object obj) {
        bmxy.m108581a(list);
        if (obj == list) {
            return true;
        }
        if (obj instanceof List) {
            List list2 = (List) obj;
            int size = list.size();
            if (size == list2.size()) {
                if (!(list2 instanceof RandomAccess)) {
                    Iterator it = list.iterator();
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it2.hasNext()) {
                                if (!bmxi.m108538a(it.next(), it2.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else if (!it2.hasNext()) {
                            return true;
                        }
                    }
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (!bmxi.m108538a(list.get(i), list2.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
