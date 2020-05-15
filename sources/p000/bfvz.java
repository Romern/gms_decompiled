package p000;

import android.location.Location;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bfvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvz implements bfwe {

    /* renamed from: c */
    private Location f115475c = null;

    /* renamed from: d */
    private final ArrayList f115476d = new ArrayList();

    /* renamed from: a */
    private final List m98022a(Iterable iterable, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                for (bfwf bfwf : (Iterable) it.next()) {
                    arrayList.add(bfwf);
                }
            }
            return arrayList;
        }
        if (this.f115476d.size() == 0) {
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                for (bfwf bfwf2 : (Iterable) it2.next()) {
                    if (bfwf2.mo62354b() != Double.MAX_VALUE) {
                        this.f115476d.add(bfwf2);
                    }
                }
            }
        }
        return this.f115476d;
    }

    /* renamed from: a */
    public final List mo62338a(Iterable iterable, double d, int i) {
        throw null;
    }

    /* renamed from: a */
    public final void mo62341a(PrintWriter printWriter) {
        throw null;
    }

    /* renamed from: a */
    public final void mo62342a(Iterable iterable, int i) {
        throw null;
    }

    /* renamed from: b */
    public final List mo62343b(Iterable iterable, int i) {
        throw null;
    }

    /* renamed from: c */
    public final List mo62344c(Iterable iterable, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            for (bfwf bfwf : (Iterable) it.next()) {
                if (bfwf.mo62355c()) {
                    arrayList.add(bfwf);
                }
            }
        }
        if (arrayList.size() != 0) {
            return bnny.m109908a(f115482b).mo68162a(arrayList, i);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* renamed from: a */
    public final bfwc mo62336a(Iterable iterable, int i, long j, Location location, double d, Map map) {
        Map map2;
        Iterator it;
        byte b;
        Iterator it2;
        long j2 = j;
        Location location2 = location;
        Map map3 = map;
        mo62340a();
        Iterator it3 = iterable.iterator();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (it3.hasNext()) {
            for (bfwf bfwf : (Iterable) it3.next()) {
                if (bfwf.mo62354b() != Double.MAX_VALUE && this.f115475c == location2) {
                    map2 = map;
                } else {
                    if (map2 == null) {
                        it2 = it3;
                    } else if (map2.containsKey(bfwf)) {
                        byte byteValue = ((Byte) map2.get(bfwf)).byteValue();
                        bfwf.f115488f = true;
                        bfwf.f115493k.mo62378a(location2);
                        if (byteValue != 1) {
                            it = it3;
                            if (byteValue == 2) {
                                bfwf.f115487e = 2;
                                bfwf.f115491i = true;
                                bfwf.f115489g = -1;
                                bfwf.f115490h = false;
                            } else if (byteValue == 4) {
                                bfwf.f115490h = true;
                                bfwf.f115489g = -1;
                            }
                        } else {
                            it = it3;
                            bfwf.f115487e = 1;
                            bfwf.f115489g = j2;
                        }
                        b = bfwf.mo62348a(byteValue);
                        if (b != 1) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(bfwf);
                        } else if (b == 2) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(bfwf);
                        } else if (b == 4) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(bfwf);
                        }
                        it3 = it;
                        map2 = map;
                    } else {
                        it2 = it3;
                    }
                    b = bfwf.mo62349a(j2, location2);
                    if (b != 1) {
                    }
                    it3 = it;
                    map2 = map;
                }
            }
            map3 = map;
        }
        this.f115475c = location2;
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            return null;
        }
        return new bfwc(arrayList, arrayList2, arrayList3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfvz.a(java.lang.Iterable, boolean):java.util.List
     arg types: [java.lang.Iterable, int]
     candidates:
      bfvz.a(java.lang.Iterable, int):void
      bfwe.a(java.lang.Iterable, int):void
      bfvz.a(java.lang.Iterable, boolean):java.util.List */
    /* renamed from: a */
    public final List mo62337a(Iterable iterable) {
        List a = m98022a(iterable, true);
        if (a.size() == 0) {
            return null;
        }
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfvz.a(java.lang.Iterable, boolean):java.util.List
     arg types: [java.lang.Iterable, int]
     candidates:
      bfvz.a(java.lang.Iterable, int):void
      bfwe.a(java.lang.Iterable, int):void
      bfvz.a(java.lang.Iterable, boolean):java.util.List */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo62339a(Iterable iterable, int i, Comparator comparator) {
        m98022a(iterable, false);
        if (this.f115476d.size() != 0) {
            return bnny.m109908a(comparator).mo68162a(this.f115476d, i);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo62340a() {
        this.f115476d.clear();
    }
}
