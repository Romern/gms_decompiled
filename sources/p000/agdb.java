package p000;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: agdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class agdb {

    /* renamed from: b */
    final String f65279b;

    /* renamed from: c */
    final int f65280c;

    /* renamed from: d */
    Boolean f65281d;

    /* renamed from: e */
    Boolean f65282e;

    /* renamed from: f */
    Long f65283f;

    /* renamed from: g */
    Long f65284g;

    public agdb(String str, int i) {
        this.f65279b = str;
        this.f65280c = i;
    }

    /* renamed from: a */
    static Boolean m54019a(double d, agmy agmy) {
        try {
            return m54025a(new BigDecimal(d), agmy, Math.ulp(d));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: a */
    public abstract int mo35301a();

    /* renamed from: b */
    public abstract boolean mo35303b();

    /* renamed from: a */
    static Boolean m54020a(long j, agmy agmy) {
        try {
            return m54025a(new BigDecimal(j), agmy, 0.0d);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: a */
    static Boolean m54021a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    private static Boolean m54022a(String str, int i, boolean z, String str2, List list, String str3, agid agid) {
        int i2;
        if (i != 7) {
            if (str2 == null) {
                return null;
            }
        } else if (list == null || list.size() == 0) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (!z) {
                    i2 = 66;
                } else {
                    i2 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i2).matcher(str).matches());
                } catch (PatternSyntaxException e) {
                    if (agid != null) {
                        agid.f65567f.mo35436a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: a */
    static Boolean m54023a(String str, agmy agmy) {
        if (agmp.m54572a(str)) {
            try {
                return m54025a(new BigDecimal(str), agmy, 0.0d);
            } catch (NumberFormatException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    static Boolean m54024a(String str, agnc agnc, agid agid) {
        int a;
        int i;
        String str2;
        bxwc bxwc;
        String str3;
        sdo.m34959a(agnc);
        if (str == null || (agnc.f66026a & 1) == 0 || (a = agnb.m54645a(agnc.f66027b)) == 0 || a == 1) {
            return null;
        }
        int a2 = agnb.m54645a(agnc.f66027b);
        if (a2 != 0 && a2 == 7) {
            if (agnc.f66030e.size() == 0) {
                return null;
            }
        } else if ((agnc.f66026a & 2) == 0) {
            return null;
        }
        int a3 = agnb.m54645a(agnc.f66027b);
        if (a3 != 0) {
            i = a3;
        } else {
            i = 1;
        }
        boolean z = agnc.f66029d;
        if (z || i == 2 || i == 7) {
            str2 = agnc.f66028c;
        } else {
            str2 = agnc.f66028c.toUpperCase(Locale.ENGLISH);
        }
        if (agnc.f66030e.size() != 0) {
            bxwc bxwc2 = agnc.f66030e;
            if (!z) {
                ArrayList arrayList = new ArrayList(bxwc2.size());
                int size = bxwc2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((String) bxwc2.get(i2)).toUpperCase(Locale.ENGLISH));
                }
                bxwc = Collections.unmodifiableList(arrayList);
            } else {
                bxwc = bxwc2;
            }
        } else {
            bxwc = null;
        }
        if (i == 2) {
            str3 = str2;
        } else {
            str3 = null;
        }
        return m54022a(str, i, z, str2, bxwc, str3, agid);
    }

    /* renamed from: a */
    static Boolean m54025a(BigDecimal bigDecimal, agmy agmy, double d) {
        int a;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        sdo.m34959a(agmy);
        boolean z = true;
        if ((agmy.f66008a & 1) == 0 || (a = agmx.m54641a(agmy.f66009b)) == 0 || a == 1) {
            return null;
        }
        int a2 = agmx.m54641a(agmy.f66009b);
        if (a2 != 0 && a2 == 5) {
            int i = agmy.f66008a;
            if ((i & 8) == 0 || (i & 16) == 0) {
                return null;
            }
        } else if ((agmy.f66008a & 4) == 0) {
            return null;
        }
        int a3 = agmx.m54641a(agmy.f66009b);
        if (a3 == 0) {
            a3 = 1;
        }
        int a4 = agmx.m54641a(agmy.f66009b);
        if (a4 != 0 && a4 == 5) {
            if (!agmp.m54572a(agmy.f66012e) || !agmp.m54572a(agmy.f66013f)) {
                return null;
            }
            try {
                bigDecimal4 = new BigDecimal(agmy.f66012e);
                bigDecimal3 = new BigDecimal(agmy.f66013f);
                bigDecimal2 = null;
            } catch (NumberFormatException e) {
                return null;
            }
        } else if (!agmp.m54572a(agmy.f66011d)) {
            return null;
        } else {
            try {
                bigDecimal3 = null;
                bigDecimal2 = new BigDecimal(agmy.f66011d);
                bigDecimal4 = null;
            } catch (NumberFormatException e2) {
                return null;
            }
        }
        if (a3 != 5) {
            if (bigDecimal2 == null) {
                return null;
            }
        } else if (bigDecimal4 == null) {
            return null;
        }
        int i2 = a3 - 1;
        if (i2 == 1) {
            if (bigDecimal.compareTo(bigDecimal2) != -1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i2 == 2) {
            if (bigDecimal.compareTo(bigDecimal2) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i2 != 3) {
            if (i2 != 4) {
                return null;
            }
            if (bigDecimal.compareTo(bigDecimal4) == -1 || bigDecimal.compareTo(bigDecimal3) == 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (d != 0.0d) {
            if (!(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) == -1)) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else {
            if (bigDecimal.compareTo(bigDecimal2) != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
