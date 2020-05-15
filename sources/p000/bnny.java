package p000;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: bnny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnny implements Comparator {
    protected bnny() {
    }

    /* renamed from: a */
    public static bnny m109908a(Comparator comparator) {
        return comparator instanceof bnny ? (bnny) comparator : new bneq(comparator);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [bnny, java.lang.Iterable]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* renamed from: b */
    public bngx mo67379b(Iterable iterable) {
        return bngx.m109369a((Comparator) this, iterable);
    }

    /* renamed from: c */
    public bnny mo68138c() {
        return new bnnv(this);
    }

    public abstract int compare(Object obj, Object obj2);

    /* renamed from: d */
    public Object mo68168d(Iterable iterable) {
        return mo68165b(iterable.iterator());
    }

    /* renamed from: a */
    public bnny mo67377a() {
        return new bnoq(this);
    }

    /* renamed from: b */
    public bnny mo68137b() {
        return new bnnu(this);
    }

    /* renamed from: c */
    public Object mo68167c(Iterable iterable) {
        return mo68161a(iterable.iterator());
    }

    /* renamed from: a */
    public final bnny mo68159a(bmxj bmxj) {
        return new bndy(bmxj, this);
    }

    /* renamed from: b */
    public final bnny mo68163b(Comparator comparator) {
        bmxy.m108581a(comparator);
        return new bnev(this, comparator);
    }

    /* renamed from: a */
    public Object mo68160a(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }

    /* renamed from: b */
    public Object mo68164b(Object obj, Object obj2) {
        return compare(obj, obj2) >= 0 ? obj : obj2;
    }

    /* renamed from: a */
    public Object mo68161a(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = mo68160a(next, it.next());
        }
        return next;
    }

    /* renamed from: b */
    public Object mo68165b(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = mo68164b(next, it.next());
        }
        return next;
    }

    /* renamed from: a */
    public List mo67378a(Iterable iterable) {
        Object[] c = bnjd.m109593c(iterable);
        Arrays.sort(c, this);
        return bnkn.m109663a((Iterable) Arrays.asList(c));
    }

    /* renamed from: b */
    public final List mo68166b(Iterable iterable, int i) {
        return mo67377a().mo68162a(iterable, i);
    }

    /* renamed from: a */
    public final List mo68162a(Iterable iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            long j = (long) i;
            if (((long) collection.size()) <= j + j) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        Iterator it = iterable.iterator();
        bmxy.m108581a(it);
        bndz.m109113a(i, "k");
        if (i == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i >= 1073741823) {
            ArrayList a = bnkn.m109664a(it);
            Collections.sort(a, this);
            if (a.size() > i) {
                a.subList(i, a.size()).clear();
            }
            a.trimToSize();
            return Collections.unmodifiableList(a);
        }
        bnqm bnqm = new bnqm(this, i);
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i3 = bnqm.f131988a;
            if (i3 != 0) {
                int i4 = bnqm.f131991d;
                if (i4 == 0) {
                    bnqm.f131990c[0] = next;
                    bnqm.f131992e = next;
                    bnqm.f131991d = 1;
                } else if (i4 < i3) {
                    Object[] objArr = bnqm.f131990c;
                    bnqm.f131991d = i4 + 1;
                    objArr[i4] = next;
                    if (bnqm.f131989b.compare(next, bnqm.f131992e) > 0) {
                        bnqm.f131992e = next;
                    }
                } else if (bnqm.f131989b.compare(next, bnqm.f131992e) < 0) {
                    Object[] objArr2 = bnqm.f131990c;
                    int i5 = bnqm.f131991d;
                    int i6 = i5 + 1;
                    bnqm.f131991d = i6;
                    objArr2[i5] = next;
                    int i7 = bnqm.f131988a;
                    int i8 = i7 + i7;
                    if (i6 == i8) {
                        int i9 = i8 - 1;
                        int a2 = bqbr.m112523a(i9, RoundingMode.CEILING) * 3;
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            if (i2 >= i9) {
                                break;
                            }
                            int i12 = ((i2 + i9) + 1) >>> 1;
                            Object[] objArr3 = bnqm.f131990c;
                            Object obj = objArr3[i12];
                            objArr3[i12] = objArr3[i9];
                            int i13 = i2;
                            int i14 = i13;
                            while (i13 < i9) {
                                if (bnqm.f131989b.compare(bnqm.f131990c[i13], obj) < 0) {
                                    Object[] objArr4 = bnqm.f131990c;
                                    Object obj2 = objArr4[i14];
                                    objArr4[i14] = objArr4[i13];
                                    objArr4[i13] = obj2;
                                    i14++;
                                }
                                i13++;
                            }
                            Object[] objArr5 = bnqm.f131990c;
                            objArr5[i9] = objArr5[i14];
                            objArr5[i14] = obj;
                            int i15 = bnqm.f131988a;
                            if (i14 <= i15) {
                                if (i14 >= i15) {
                                    break;
                                }
                                i2 = Math.max(i14, i2 + 1);
                                i10 = i14;
                            } else {
                                i9 = i14 - 1;
                            }
                            i11++;
                            if (i11 >= a2) {
                                Arrays.sort(bnqm.f131990c, i2, i9, bnqm.f131989b);
                                break;
                            }
                        }
                        bnqm.f131991d = bnqm.f131988a;
                        bnqm.f131992e = bnqm.f131990c[i10];
                        for (int i16 = i10 + 1; i16 < bnqm.f131988a; i16++) {
                            if (bnqm.f131989b.compare(bnqm.f131990c[i16], bnqm.f131992e) > 0) {
                                bnqm.f131992e = bnqm.f131990c[i16];
                            }
                        }
                    }
                }
            }
        }
        Arrays.sort(bnqm.f131990c, 0, bnqm.f131991d, bnqm.f131989b);
        int i17 = bnqm.f131991d;
        int i18 = bnqm.f131988a;
        if (i17 > i18) {
            Object[] objArr6 = bnqm.f131990c;
            Arrays.fill(objArr6, i18, objArr6.length, (Object) null);
            i17 = bnqm.f131988a;
            bnqm.f131991d = i17;
            bnqm.f131992e = bnqm.f131990c[i17 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(bnqm.f131990c, i17)));
    }
}
