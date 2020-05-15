package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: bjwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjwk implements bjwm {

    /* renamed from: a */
    final C1230nw f123511a;

    /* renamed from: b */
    final C1230nw f123512b;

    /* renamed from: c */
    final C1230nw f123513c;

    /* renamed from: d */
    final C1230nw f123514d;

    /* renamed from: e */
    final C1230nw f123515e;

    /* renamed from: f */
    final C1245ok f123516f;

    /* renamed from: g */
    final ArrayDeque f123517g = new ArrayDeque();

    /* renamed from: h */
    public boolean f123518h = false;

    /* renamed from: i */
    public bjwi f123519i;

    /* renamed from: j */
    private final boolean f123520j;

    public bjwk(bmlz bmlz, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        bxwc bxwc;
        bmlz bmlz2 = bmlz;
        this.f123520j = z;
        boolean z2 = true;
        if (bmlz2 == null) {
            z2 = false;
        } else if (bmlz2.f129995a.size() == 0) {
            z2 = false;
        }
        int size = z2 ? bmlz2.f129995a.size() : 0;
        this.f123511a = new C1230nw(size);
        this.f123512b = new C1230nw(size);
        this.f123513c = new C1230nw(size);
        this.f123514d = new C1230nw(size);
        this.f123516f = new C1245ok(size);
        if (bmlz2 != null) {
            i = bmlz2.f129996b.size();
        } else {
            i = 0;
        }
        this.f123515e = new C1230nw(i);
        if (z2) {
            bxwc bxwc2 = bmlz2.f129995a;
            int size2 = bxwc2.size();
            int i5 = 0;
            int i6 = 0;
            while (i5 < size2) {
                bmly bmly = (bmly) bxwc2.get(i5);
                bxwc bxwc3 = bmly.f129991a;
                int size3 = bxwc3.size();
                int i7 = 0;
                while (i7 < size3) {
                    bmne bmne = (bmne) bxwc3.get(i7);
                    bjwj bjwj = new bjwj(bmne, i6);
                    if (!this.f123516f.containsKey(bjwj)) {
                        this.f123516f.put(bjwj, bmly);
                        bxwc bxwc4 = bxwc2;
                        ArrayList arrayList = (ArrayList) this.f123512b.mo15534a(bmne.f130093c);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            bxwc = bxwc3;
                            i4 = size3;
                            this.f123512b.mo15540b(bmne.f130093c, arrayList);
                        } else {
                            bxwc = bxwc3;
                            i4 = size3;
                        }
                        arrayList.add(bjwj);
                        i6++;
                        i7++;
                        bxwc2 = bxwc4;
                        bxwc3 = bxwc;
                        size3 = i4;
                    } else {
                        throw new IllegalStateException("TriggerValueKey already exists");
                    }
                }
                bxwc bxwc5 = bxwc2;
                bxwc bxwc6 = bmly.f129992b;
                int size4 = bxwc6.size();
                int i8 = 0;
                while (true) {
                    i3 = i5 + 1;
                    if (i8 >= size4) {
                        break;
                    }
                    this.f123514d.mo15540b(((bmmv) bxwc6.get(i8)).f130059e, true);
                    i8++;
                }
                bxwc2 = bxwc5;
                i5 = i3;
            }
            bxwc bxwc7 = bmlz2.f129996b;
            int size5 = bxwc7.size();
            int i9 = 0;
            while (i9 < size5) {
                bmnf bmnf = (bmnf) bxwc7.get(i9);
                this.f123514d.mo15540b(bmnf.f130099a, true);
                this.f123515e.mo15540b(bmnf.f130099a, bmnf);
                mo65589a(bmnf.f130099a, this);
                bxvw bxvw = bmnf.f130100b;
                int size6 = bxvw.size();
                int i10 = 0;
                while (true) {
                    i2 = i9 + 1;
                    if (i10 >= size6) {
                        break;
                    }
                    this.f123514d.mo15540b(((Long) bxvw.get(i10)).longValue(), true);
                    i10++;
                }
                i9 = i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo65588a(long j) {
        this.f123513c.mo15539b(j);
    }

    /* renamed from: b */
    public final boolean mo65593b(bjwj bjwj) {
        bjwp bjwp;
        if (!this.f123518h) {
            bmly bmly = (bmly) this.f123516f.get(bjwj);
            bxwc bxwc = bmly.f129991a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bmne bmne = (bmne) bxwc.get(i);
                if (!bjwl.m104787a(bmne, bjwj.f123509a) && ((bjwp = (bjwp) this.f123511a.mo15534a(bmne.f130093c)) == null || !bjwp.mo52055a(bmne))) {
                    return false;
                }
            }
            bxwc bxwc2 = bmly.f129992b;
            int size2 = bxwc2.size();
            int i2 = 0;
            while (i2 < size2) {
                bmmv bmmv = (bmmv) bxwc2.get(i2);
                bjwm bjwm = (bjwm) this.f123513c.mo15534a(bmmv.f130059e);
                if (bjwm != null) {
                    bjwm.mo51910a(bmmv, bmly.f129991a);
                    i2++;
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Resulting action component not found: %d", Long.valueOf(bmmv.f130059e)));
                }
            }
            bjwi bjwi = this.f123519i;
            if (bjwi != null) {
                bjwi.mo52883ap();
            }
            return true;
        }
        throw new IllegalStateException("Triggers for result cannot occur before graph is initialized.");
    }

    /* renamed from: a */
    public final void mo65589a(long j, bjwm bjwm) {
        this.f123513c.mo15540b(j, bjwm);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[RETURN] */
    /* renamed from: a */
    public final void mo65590a(bjwj bjwj) {
        boolean z;
        bmnc bmnc;
        bmnb bmnb;
        bmmx bmmx;
        if (this.f123518h) {
            if (this.f123520j) {
                bmne bmne = bjwj.f123509a;
                int a = bmna.m108191a(bmne.f130094d);
                if (a == 0) {
                    a = 1;
                }
                switch (a - 1) {
                    case 1:
                        if (bmne.f130091a == 2) {
                            bmnc = (bmnc) bmne.f130092b;
                        } else {
                            bmnc = bmnc.f130080d;
                        }
                        z = bmnc.f130084c;
                        if (z) {
                            return;
                        }
                        break;
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        break;
                    case 4:
                        if (bmne.f130091a == 6) {
                            bmnb = (bmnb) bmne.f130092b;
                        } else {
                            bmnb = bmnb.f130075d;
                        }
                        z = bmnb.f130079c;
                        if (z) {
                        }
                        break;
                    case 7:
                    default:
                        throw new IllegalArgumentException(String.format(Locale.US, "Unknown trigger type for trigger on component %s", Long.valueOf(bmne.f130093c)));
                    case 18:
                        if (bmne.f130091a == 8) {
                            bmmx = (bmmx) bmne.f130092b;
                        } else {
                            bmmx = bmmx.f130065d;
                        }
                        z = bmmx.f130069c;
                        if (z) {
                        }
                        break;
                }
            }
            this.f123517g.add(bjwj);
            return;
        }
        mo65593b(bjwj);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmo bmmo;
        bmnf bmnf = (bmnf) this.f123515e.mo15534a(bmmv.f130059e);
        if (bmnf != null) {
            int a = bmmb.m108166a(bmmv.f130058d);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            if (a - 1 != 12) {
                Object[] objArr = new Object[1];
                int a2 = bmmb.m108166a(bmmv.f130058d);
                if (a2 != 0) {
                    i = a2;
                }
                objArr[0] = Integer.valueOf(i - 1);
                throw new IllegalArgumentException(String.format("Unsupported resulting action type: %s", objArr));
            }
            bxvw bxvw = bmnf.f130100b;
            if (bmmv.f130056b == 9) {
                bmmo = (bmmo) bmmv.f130057c;
            } else {
                bmmo = bmmo.f130026d;
            }
            mo65591a(bxvw, bmmo, list);
            return;
        }
        long j = bmmv.f130059e;
        StringBuilder sb = new StringBuilder(66);
        sb.append("Can not handle resulting action for component ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo65591a(List list, bmmo bmmo, List list2) {
        int a;
        int a2;
        int a3 = bmml.m108176a(bmmo.f130030c);
        int i = 1;
        if ((a3 != 0 && a3 == 3) || ((a2 = bmml.m108176a(bmmo.f130030c)) != 0 && a2 == 2)) {
            int a4 = bmmn.m108178a(bmmo.f130029b);
            if ((a4 != 0 && a4 == 2) || ((a = bmmn.m108178a(bmmo.f130029b)) != 0 && a == 3)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    boolean contains = bmmo.f130028a.contains(Long.valueOf(longValue));
                    int a5 = bmml.m108176a(bmmo.f130030c);
                    if (a5 == 0 || a5 != 2 || contains) {
                        bjwm bjwm = (bjwm) this.f123513c.mo15534a(longValue);
                        bxvd da = bmmv.f130053f.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmmv bmmv = (bmmv) da.f164949b;
                        bmmv.f130055a |= 2;
                        bmmv.f130059e = longValue;
                        int i2 = 12;
                        if (!contains) {
                            int a6 = bmmn.m108178a(bmmo.f130029b);
                            if (a6 == 0) {
                                i2 = 2;
                            } else if (a6 != 2) {
                                i2 = 2;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmmv bmmv2 = (bmmv) da.f164949b;
                            bmmv2.f130058d = i2 - 1;
                            bmmv2.f130055a |= 1;
                        } else {
                            int a7 = bmmn.m108178a(bmmo.f130029b);
                            if (a7 != 0 && a7 == 2) {
                                i2 = 2;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmmv bmmv3 = (bmmv) da.f164949b;
                            bmmv3.f130058d = i2 - 1;
                            bmmv3.f130055a |= 1;
                        }
                        bjwm.mo51910a((bmmv) da.mo74062i(), list2);
                    }
                }
                return;
            }
            Object[] objArr = new Object[1];
            int a8 = bmmn.m108178a(bmmo.f130029b);
            if (a8 != 0) {
                i = a8;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format("Unsupported modify type %s", objArr));
        }
        Object[] objArr2 = new Object[1];
        int a9 = bmml.m108176a(bmmo.f130030c);
        if (a9 != 0) {
            i = a9;
        }
        objArr2[0] = Integer.valueOf(i - 1);
        throw new IllegalArgumentException(String.format("Unsupported modify component list type %s", objArr2));
    }

    /* renamed from: a */
    public final void mo65592a(boolean z) {
        if (this.f123518h != z) {
            this.f123518h = z;
            if (!z) {
                while (!this.f123517g.isEmpty()) {
                    mo65590a((bjwj) this.f123517g.poll());
                }
            }
        }
    }
}
