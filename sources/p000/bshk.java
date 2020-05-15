package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bshk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bshk extends AbstractMap implements Serializable {

    /* renamed from: f */
    private static final Comparator f144567f = new bshd();

    /* renamed from: a */
    final Comparator f144568a;

    /* renamed from: b */
    bshj f144569b;

    /* renamed from: c */
    int f144570c = 0;

    /* renamed from: d */
    int f144571d = 0;

    /* renamed from: e */
    final bshj f144572e = new bshj();

    /* renamed from: g */
    private bshf f144573g;

    /* renamed from: h */
    private bshh f144574h;

    public bshk() {
        Comparator comparator = f144567f;
        this.f144568a = comparator;
    }

    /* renamed from: a */
    private final void m115773a(bshj bshj) {
        int i;
        int i2;
        bshj bshj2 = bshj.f144560b;
        bshj bshj3 = bshj.f144561c;
        bshj bshj4 = bshj3.f144560b;
        bshj bshj5 = bshj3.f144561c;
        bshj.f144561c = bshj4;
        if (bshj4 != null) {
            bshj4.f144559a = bshj;
        }
        m115774a(bshj, bshj3);
        bshj3.f144560b = bshj;
        bshj.f144559a = bshj3;
        int i3 = 0;
        if (bshj2 != null) {
            i = bshj2.f144566h;
        } else {
            i = 0;
        }
        if (bshj4 != null) {
            i2 = bshj4.f144566h;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        bshj.f144566h = max;
        if (bshj5 != null) {
            i3 = bshj5.f144566h;
        }
        bshj3.f144566h = Math.max(max, i3) + 1;
    }

    /* renamed from: b */
    private final void m115775b(bshj bshj) {
        int i;
        int i2;
        bshj bshj2 = bshj.f144560b;
        bshj bshj3 = bshj.f144561c;
        bshj bshj4 = bshj2.f144560b;
        bshj bshj5 = bshj2.f144561c;
        bshj.f144560b = bshj5;
        if (bshj5 != null) {
            bshj5.f144559a = bshj;
        }
        m115774a(bshj, bshj2);
        bshj2.f144561c = bshj;
        bshj.f144559a = bshj2;
        int i3 = 0;
        if (bshj3 != null) {
            i = bshj3.f144566h;
        } else {
            i = 0;
        }
        if (bshj5 != null) {
            i2 = bshj5.f144566h;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        bshj.f144566h = max;
        if (bshj4 != null) {
            i3 = bshj4.f144566h;
        }
        bshj2.f144566h = Math.max(max, i3) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final void clear() {
        this.f144569b = null;
        this.f144570c = 0;
        this.f144571d++;
        bshj bshj = this.f144572e;
        bshj.f144563e = bshj;
        bshj.f144562d = bshj;
    }

    public final boolean containsKey(Object obj) {
        return mo70582a(obj) != null;
    }

    public final Set entrySet() {
        bshf bshf = this.f144573g;
        if (bshf != null) {
            return bshf;
        }
        bshf bshf2 = new bshf(this);
        this.f144573g = bshf2;
        return bshf2;
    }

    public final Object get(Object obj) {
        bshj a = mo70582a(obj);
        if (a != null) {
            return a.f144565g;
        }
        return null;
    }

    public final Set keySet() {
        bshh bshh = this.f144574h;
        if (bshh != null) {
            return bshh;
        }
        bshh bshh2 = new bshh(this);
        this.f144574h = bshh2;
        return bshh2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bshk.a(java.lang.Object, boolean):bshj
     arg types: [java.lang.Object, int]
     candidates:
      bshk.a(bshj, bshj):void
      bshk.a(bshj, boolean):void
      bshk.a(java.lang.Object, boolean):bshj */
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            bshj a = mo70583a(obj, true);
            Object obj3 = a.f144565g;
            a.f144565g = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    public final Object remove(Object obj) {
        bshj b = mo70586b(obj);
        if (b != null) {
            return b.f144565g;
        }
        return null;
    }

    public final int size() {
        return this.f144570c;
    }

    /* renamed from: a */
    private final void m115774a(bshj bshj, bshj bshj2) {
        bshj bshj3 = bshj.f144559a;
        bshj.f144559a = null;
        if (bshj2 != null) {
            bshj2.f144559a = bshj3;
        }
        if (bshj3 == null) {
            this.f144569b = bshj2;
        } else if (bshj3.f144560b == bshj) {
            bshj3.f144560b = bshj2;
        } else {
            bshj3.f144561c = bshj2;
        }
    }

    /* renamed from: b */
    private final void m115776b(bshj bshj, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (bshj != null) {
            bshj bshj2 = bshj.f144560b;
            bshj bshj3 = bshj.f144561c;
            int i5 = 0;
            if (bshj2 != null) {
                i = bshj2.f144566h;
            } else {
                i = 0;
            }
            if (bshj3 != null) {
                i2 = bshj3.f144566h;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                bshj bshj4 = bshj3.f144560b;
                bshj bshj5 = bshj3.f144561c;
                if (bshj5 != null) {
                    i4 = bshj5.f144566h;
                } else {
                    i4 = 0;
                }
                if (bshj4 != null) {
                    i5 = bshj4.f144566h;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    m115775b(bshj3);
                    m115773a(bshj);
                } else {
                    m115773a(bshj);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                bshj bshj6 = bshj2.f144560b;
                bshj bshj7 = bshj2.f144561c;
                if (bshj7 != null) {
                    i3 = bshj7.f144566h;
                } else {
                    i3 = 0;
                }
                if (bshj6 != null) {
                    i5 = bshj6.f144566h;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m115773a(bshj2);
                    m115775b(bshj);
                } else {
                    m115775b(bshj);
                }
                if (z) {
                    return;
                }
            } else if (i6 != 0) {
                bshj.f144566h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            } else {
                bshj.f144566h = i + 1;
                if (z) {
                    return;
                }
            }
            bshj = bshj.f144559a;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bshk.a(java.lang.Object, boolean):bshj
     arg types: [java.lang.Object, int]
     candidates:
      bshk.a(bshj, bshj):void
      bshk.a(bshj, boolean):void
      bshk.a(java.lang.Object, boolean):bshj */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bshj mo70582a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo70583a(obj, false);
        } catch (ClassCastException e) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bshj mo70583a(Object obj, boolean z) {
        int i;
        bshj bshj;
        Comparable comparable;
        Comparator comparator = this.f144568a;
        bshj bshj2 = this.f144569b;
        if (bshj2 == null) {
            i = 0;
        } else {
            if (comparator == f144567f) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                int compare = comparable == null ? comparator.compare(obj, bshj2.f144564f) : comparable.compareTo(bshj2.f144564f);
                if (compare == 0) {
                    return bshj2;
                }
                bshj bshj3 = compare >= 0 ? bshj2.f144561c : bshj2.f144560b;
                if (bshj3 == null) {
                    i = compare;
                    break;
                }
                bshj2 = bshj3;
            }
        }
        if (!z) {
            return null;
        }
        bshj bshj4 = this.f144572e;
        if (bshj2 != null) {
            bshj = new bshj(bshj2, obj, bshj4, bshj4.f144563e);
            if (i < 0) {
                bshj2.f144560b = bshj;
            } else {
                bshj2.f144561c = bshj;
            }
            m115776b(bshj2, true);
        } else if (comparator == f144567f && !(obj instanceof Comparable)) {
            throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
        } else {
            bshj = new bshj(bshj2, obj, bshj4, bshj4.f144563e);
            this.f144569b = bshj;
        }
        this.f144570c++;
        this.f144571d++;
        return bshj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bshk.a(bshj, boolean):void
     arg types: [bshj, int]
     candidates:
      bshk.a(bshj, bshj):void
      bshk.a(java.lang.Object, boolean):bshj
      bshk.a(bshj, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bshj mo70586b(Object obj) {
        bshj a = mo70582a(obj);
        if (a != null) {
            mo70585a(a, true);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bshj mo70584a(Map.Entry entry) {
        bshj a = mo70582a(entry.getKey());
        if (a == null) {
            return null;
        }
        Object obj = a.f144565g;
        Object value = entry.getValue();
        if (obj == value || (obj != null && obj.equals(value))) {
            return a;
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bshk.a(bshj, boolean):void
     arg types: [bshj, int]
     candidates:
      bshk.a(bshj, bshj):void
      bshk.a(java.lang.Object, boolean):bshj
      bshk.a(bshj, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70585a(bshj bshj, boolean z) {
        bshj bshj2;
        int i;
        if (z) {
            bshj bshj3 = bshj.f144563e;
            bshj3.f144562d = bshj.f144562d;
            bshj.f144562d.f144563e = bshj3;
        }
        bshj bshj4 = bshj.f144560b;
        bshj bshj5 = bshj.f144561c;
        bshj bshj6 = bshj.f144559a;
        int i2 = 0;
        if (bshj4 == null || bshj5 == null) {
            if (bshj4 != null) {
                m115774a(bshj, bshj4);
                bshj.f144560b = null;
            } else if (bshj5 != null) {
                m115774a(bshj, bshj5);
                bshj.f144561c = null;
            } else {
                m115774a(bshj, (bshj) null);
            }
            m115776b(bshj6, false);
            this.f144570c--;
            this.f144571d++;
            return;
        }
        if (bshj4.f144566h <= bshj5.f144566h) {
            bshj bshj7 = bshj5.f144560b;
            bshj2 = bshj5;
            while (bshj7 != null) {
                bshj7 = bshj7.f144560b;
                bshj2 = bshj7;
            }
        } else {
            bshj bshj8 = bshj4;
            for (bshj bshj9 = bshj4.f144561c; bshj9 != null; bshj9 = bshj9.f144561c) {
                bshj8 = bshj9;
            }
            bshj2 = bshj8;
        }
        mo70585a(bshj2, false);
        bshj bshj10 = bshj.f144560b;
        if (bshj10 != null) {
            i = bshj10.f144566h;
            bshj2.f144560b = bshj10;
            bshj10.f144559a = bshj2;
            bshj.f144560b = null;
        } else {
            i = 0;
        }
        bshj bshj11 = bshj.f144561c;
        if (bshj11 != null) {
            i2 = bshj11.f144566h;
            bshj2.f144561c = bshj11;
            bshj11.f144559a = bshj2;
            bshj.f144561c = null;
        }
        bshj2.f144566h = Math.max(i, i2) + 1;
        m115774a(bshj, bshj2);
    }
}
