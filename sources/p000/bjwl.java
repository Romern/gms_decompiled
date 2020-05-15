package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: bjwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjwl {
    /* renamed from: a */
    private static bjwp m104780a(Object obj) {
        if (obj instanceof bjwp) {
            return (bjwp) obj;
        }
        if (!(obj instanceof bjwg)) {
            return null;
        }
        return ((bjwg) obj).mo60054ch();
    }

    /* renamed from: b */
    private static bjwm m104789b(Object obj) {
        if (obj instanceof bjwm) {
            return (bjwm) obj;
        }
        if (!(obj instanceof bjwo)) {
            return null;
        }
        return ((bjwo) obj).mo60055ci();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public static bmmw m104792c(bmne bmne) {
        bmnc bmnc;
        bmnd bmnd;
        bmnd bmnd2;
        bmnb bmnb;
        bmnb bmnb2;
        bmmx bmmx;
        bmmx bmmx2;
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
                if ((bmnc.f130082a & 1) == 0) {
                    return null;
                }
                bmmw bmmw = (bmne.f130091a == 2 ? (bmnc) bmne.f130092b : bmnc.f130080d).f130083b;
                if (bmmw == null) {
                    return bmmw.f130060c;
                }
                return bmmw;
            case 2:
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
            case 3:
                if (bmne.f130091a == 5) {
                    bmnd = (bmnd) bmne.f130092b;
                } else {
                    bmnd = bmnd.f130085c;
                }
                if ((bmnd.f130087a & 1) != 0) {
                    if (bmne.f130091a == 5) {
                        bmnd2 = (bmnd) bmne.f130092b;
                    } else {
                        bmnd2 = bmnd.f130085c;
                    }
                    bmmw bmmw2 = bmnd2.f130088b;
                    if (bmmw2 == null) {
                        return bmmw.f130060c;
                    }
                    return bmmw2;
                }
                break;
            case 4:
                if (bmne.f130091a == 6) {
                    bmnb = (bmnb) bmne.f130092b;
                } else {
                    bmnb = bmnb.f130075d;
                }
                if ((bmnb.f130077a & 1) == 0) {
                    return null;
                }
                if (bmne.f130091a == 6) {
                    bmnb2 = (bmnb) bmne.f130092b;
                } else {
                    bmnb2 = bmnb.f130075d;
                }
                bmmw bmmw3 = bmnb2.f130078b;
                return bmmw3 == null ? bmmw.f130060c : bmmw3;
            case 7:
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unknown trigger type for trigger on component %s", Long.valueOf(bmne.f130093c)));
            case 18:
                if (bmne.f130091a == 8) {
                    bmmx = (bmmx) bmne.f130092b;
                } else {
                    bmmx = bmmx.f130065d;
                }
                if ((bmmx.f130067a & 1) == 0) {
                    return null;
                }
                if (bmne.f130091a == 8) {
                    bmmx2 = (bmmx) bmne.f130092b;
                } else {
                    bmmx2 = bmmx.f130065d;
                }
                bmmw bmmw4 = bmmx2.f130068b;
                return bmmw4 == null ? bmmw.f130060c : bmmw4;
        }
        return null;
    }

    /* renamed from: a */
    public static void m104781a(bjwk bjwk, List list) {
        m104783a(bjwk, list, (String) null);
    }

    /* renamed from: b */
    public static void m104790b(Object obj, long j, bjwk bjwk) {
        if (bjwk != null) {
            if (obj instanceof View) {
                obj = bkft.m105641b((View) obj);
            }
            if (m104780a(obj) != null) {
                bjwk.f123511a.mo15539b(j);
            }
            if (m104789b(obj) != null) {
                bjwk.mo65588a(j);
            }
        }
    }

    /* renamed from: a */
    public static void m104782a(bjwk bjwk, List list, long j) {
        bmmw c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) list.get(i);
            if (m104785a(bjwj.f123509a) && ((c = m104792c(bjwj.f123509a)) == null || c.f130062a.contains(Long.valueOf(j)))) {
                bjwk.mo65590a(bjwj);
            }
        }
    }

    /* renamed from: a */
    public static void m104783a(bjwk bjwk, List list, String str) {
        bmmw c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) list.get(i);
            if (m104785a(bjwj.f123509a) && ((c = m104792c(bjwj.f123509a)) == null || c.f130063b.isEmpty() || (str != null && Pattern.matches(c.f130063b, str)))) {
                bjwk.mo65590a(bjwj);
            }
        }
    }

    /* renamed from: b */
    public static boolean m104791b(bmne bmne) {
        int a = bmna.m108191a(bmne.f130094d);
        if (a != 0 && a == 4) {
            return true;
        }
        int a2 = bmna.m108191a(bmne.f130094d);
        if (a2 != 0 && a2 == 5) {
            return true;
        }
        int a3 = bmna.m108191a(bmne.f130094d);
        return a3 != 0 && a3 == 19;
    }

    /* renamed from: a */
    public static void m104784a(Object obj, long j, bjwk bjwk) {
        Boolean bool;
        if (bjwk != null) {
            if (obj instanceof View) {
                obj = bkft.m105641b((View) obj);
            }
            ArrayList arrayList = (ArrayList) bjwk.f123512b.mo15534a(j);
            bjwp a = m104780a(obj);
            if (!(arrayList == null || a == null)) {
                bjwk.f123511a.mo15540b(j, a);
                a.mo52946a(bjwk);
                a.mo52771a(arrayList);
            }
            bjwm b = m104789b(obj);
            if (b != null && (bool = (Boolean) bjwk.f123514d.mo15534a(j)) != null && bool.booleanValue()) {
                bjwk.mo65589a(j, b);
            }
        }
    }

    /* renamed from: a */
    public static boolean m104785a(bmne bmne) {
        int a = bmna.m108191a(bmne.f130094d);
        if (a != 0 && a == 2) {
            return true;
        }
        int a2 = bmna.m108191a(bmne.f130094d);
        if (a2 != 0 && a2 == 5) {
            return true;
        }
        int a3 = bmna.m108191a(bmne.f130094d);
        return a3 != 0 && a3 == 19;
    }

    /* renamed from: a */
    public static boolean m104786a(bmne bmne, long j) {
        if (m104791b(bmne)) {
            bmmw c = m104792c(bmne);
            if (c != null && c.f130062a.size() != 0) {
                return c.f130062a.contains(Long.valueOf(j));
            }
            throw new IllegalStateException("Trigger needs set of values to check against.");
        }
        int a = bmna.m108191a(bmne.f130094d);
        if (a == 0) {
            a = 1;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unsupported trigger type: ");
        sb.append(a - 1);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static boolean m104787a(bmne bmne, bmne bmne2) {
        bmmy bmmy;
        bmmy bmmy2;
        if (bmne.f130093c == bmne2.f130093c) {
            int a = bmna.m108191a(bmne.f130094d);
            if (a == 0) {
                a = 1;
            }
            int a2 = bmna.m108191a(bmne2.f130094d);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a == a2) {
                int a3 = bmna.m108191a(bmne.f130094d);
                if (a3 == 0) {
                    a3 = 1;
                }
                switch (a3 - 1) {
                    case 1:
                    case 3:
                    case 4:
                    case 18:
                        bmmw c = m104792c(bmne);
                        bmmw c2 = m104792c(bmne2);
                        if (c == null || c2 == null) {
                            if (c != c2) {
                                return false;
                            }
                            return true;
                        } else if (c.f130062a.size() > 0) {
                            return c.f130062a.equals(c2.f130062a);
                        } else {
                            if (!c.f130063b.isEmpty()) {
                                return c.f130063b.equals(c2.f130063b);
                            }
                            throw new IllegalArgumentException("ComponentValue has unexpected value.");
                        }
                    case 2:
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
                    case 24:
                        return true;
                    case 7:
                    default:
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[2];
                        int a4 = bmna.m108191a(bmne.f130094d);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        objArr[0] = Integer.valueOf(a4 - 1);
                        objArr[1] = Long.valueOf(bmne.f130093c);
                        throw new IllegalArgumentException(String.format(locale, "Unknown trigger type %s for trigger on component %s", objArr));
                    case 23:
                        if (bmne.f130091a == 9) {
                            bmmy = (bmmy) bmne.f130092b;
                        } else {
                            bmmy = bmmy.f130070b;
                        }
                        boolean z = bmmy.f130072a;
                        if (bmne2.f130091a == 9) {
                            bmmy2 = (bmmy) bmne2.f130092b;
                        } else {
                            bmmy2 = bmmy.f130070b;
                        }
                        if (z == bmmy2.f130072a) {
                            return true;
                        }
                        return false;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m104788a(bmne bmne, String str) {
        if (m104791b(bmne)) {
            bmmw c = m104792c(bmne);
            if (c != null && !c.f130063b.isEmpty()) {
                return Pattern.matches(c.f130063b, str);
            }
            throw new IllegalStateException("Trigger needs set of values to check against.");
        }
        int a = bmna.m108191a(bmne.f130094d);
        if (a == 0) {
            a = 1;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unsupported trigger type: ");
        sb.append(a - 1);
        throw new IllegalArgumentException(sb.toString());
    }
}
