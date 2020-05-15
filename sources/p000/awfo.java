package p000;

import android.text.TextUtils;
import com.google.android.gms.payse.SecureElementStoredValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: awfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfo {
    /* renamed from: a */
    public static int m79853a(bmgn bmgn) {
        Object a;
        if (bmgn != null) {
            bxwc bxwc = bmgn.f129278d;
            int size = bxwc.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                bmfy bmfy = ((bmgk) bxwc.get(i)).f129262p;
                if (bmfy == null) {
                    bmfy = bmfy.f129189l;
                }
                if (bmfy.f129192b == 10) {
                    z = true;
                }
            }
            bxwc bxwc2 = bmgn.f129279e;
            int size2 = bxwc2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bmfy bmfy2 = ((bmgd) bxwc2.get(i2)).f129222h;
                if (bmfy2 == null) {
                    bmfy2 = bmfy.f129189l;
                }
                if (bmfy2.f129192b == 11) {
                    z = true;
                }
            }
            if (z) {
                if (chgo.f188594a.mo6606a().mo85220c() && !bmgn.f129283i && (a = awev.m79818a(bmgn)) != null) {
                    if (a instanceof bmgd) {
                        bmfy bmfy3 = ((bmgd) a).f129222h;
                        if (bmfy3 == null) {
                            bmfy3 = bmfy.f129189l;
                        }
                        if (bmfy3.f129192b != 11) {
                            return 2;
                        }
                    } else if (!(a instanceof bmgk)) {
                        return 2;
                    } else {
                        bmfy bmfy4 = ((bmgk) a).f129262p;
                        if (bmfy4 == null) {
                            bmfy4 = bmfy.f129189l;
                        }
                        if (bmfy4.f129192b == 10) {
                            return 1;
                        }
                        return 2;
                    }
                }
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static bmgn m79854a(bmgn bmgn, SecureElementStoredValue[] secureElementStoredValueArr) {
        return m79855a(bmgn, secureElementStoredValueArr, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02f4, code lost:
        r0 = r1.f129248b;
     */
    /* renamed from: a */
    public static bmgn m79855a(bmgn bmgn, SecureElementStoredValue[] secureElementStoredValueArr, C1225nr nrVar) {
        long j;
        bmga bmga;
        bxwc bxwc;
        SecureElementStoredValue secureElementStoredValue;
        bmgn bmgn2 = bmgn;
        SecureElementStoredValue[] secureElementStoredValueArr2 = secureElementStoredValueArr;
        C1225nr nrVar2 = nrVar;
        int i = 5;
        bxvd bxvd = (bxvd) bmgn2.mo74142c(5);
        bxvd.mo73625a((bxvk) bmgn2);
        bmgm bmgm = (bmgm) bxvd;
        int i2 = 0;
        if (bmgm.f164950c) {
            bmgm.mo74035c();
            bmgm.f164950c = false;
        }
        bmgn bmgn3 = bmgn.f129273o;
        ((bmgn) bmgm.f164949b).f129278d = bxvk.m124030de();
        bxwc bxwc2 = bmgn2.f129278d;
        int size = bxwc2.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        while (i3 < size) {
            bmgk bmgk = (bmgk) bxwc2.get(i3);
            bxvd bxvd2 = (bxvd) bmgk.mo74142c(i);
            bxvd2.mo73625a((bxvk) bmgk);
            bmfy bmfy = ((bmgk) bxvd2.f164949b).f129262p;
            if (bmfy == null) {
                bmfy = bmfy.f129189l;
            }
            if (bmfy == null) {
                bxwc = bxwc2;
            } else if (bmfy.f129192b == 10) {
                bmfz bmfz = (bmfz) bmfy.f129193c;
                int i4 = bmfz.f129205b;
                String str = bmfz.f129206c;
                int length = secureElementStoredValueArr2.length;
                while (true) {
                    if (i2 >= length) {
                        bxwc = bxwc2;
                        secureElementStoredValue = null;
                        break;
                    }
                    secureElementStoredValue = secureElementStoredValueArr2[i2];
                    bxwc = bxwc2;
                    if (secureElementStoredValue.f81677b == i4 && TextUtils.equals(secureElementStoredValue.f81678c, str)) {
                        break;
                    }
                    i2++;
                    bxwc2 = bxwc;
                }
                if (secureElementStoredValue == null || secureElementStoredValue.f81681f == 0) {
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bmgk bmgk2 = (bmgk) bxvd2.f164949b;
                    bmgk bmgk3 = bmgk.f129245r;
                    bmgk2.f129259m = 5;
                    bmgk2.f129247a |= 1024;
                } else {
                    long longValue = secureElementStoredValue.f81679d.longValue();
                    blwj blwj = bmfy.f129195e;
                    if (blwj == null) {
                        blwj = blwj.f127945d;
                    }
                    if ((bmfy.f129191a & 2) == 0) {
                        bxvd da = blwj.f127945d.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        blwj blwj2 = (blwj) da.f164949b;
                        int i5 = blwj2.f127947a | 1;
                        blwj2.f127947a = i5;
                        blwj2.f127948b = 0;
                        String str2 = secureElementStoredValue.f81680e;
                        str2.getClass();
                        blwj2.f127947a = 2 | i5;
                        blwj2.f127949c = str2;
                        blwj = (blwj) da.mo74062i();
                    }
                    if (!TextUtils.equals(blwj.f127949c, secureElementStoredValue.f81680e)) {
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        bmgk bmgk4 = (bmgk) bxvd2.f164949b;
                        bmgk bmgk5 = bmgk.f129245r;
                        bmgk4.f129259m = 5;
                        bmgk4.f129247a |= 1024;
                    } else {
                        String format = String.format(Locale.getDefault(), bmfy.f129201k, bjvk.m104704a().mo65563a().mo65566a(secureElementStoredValue.f81679d.movePointLeft(6), secureElementStoredValue.f81680e));
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        bmgk bmgk6 = (bmgk) bxvd2.f164949b;
                        bmgk bmgk7 = bmgk.f129245r;
                        format.getClass();
                        int i6 = bmgk6.f129247a | 8;
                        bmgk6.f129247a = i6;
                        bmgk6.f129251e = format;
                        if (longValue < blwj.f127948b) {
                            bmgk6.f129259m = 1;
                            bmgk6.f129247a = i6 | 1024;
                            bmgk6.f129252f = bxvk.m124030de();
                            String str3 = bmfz.f129204a;
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bmgk bmgk8 = (bmgk) bxvd2.f164949b;
                            str3.getClass();
                            if (!bmgk8.f129252f.mo73666a()) {
                                bmgk8.f129252f = bxvk.m124021a(bmgk8.f129252f);
                            }
                            bmgk8.f129252f.add(str3);
                        }
                    }
                }
                if (nrVar2 != null) {
                    nrVar2.add(Long.valueOf(((bmgk) bxvd2.f164949b).f129248b));
                }
            } else {
                bxwc = bxwc2;
            }
            arrayList.add(bxvd2);
            i3++;
            secureElementStoredValueArr2 = secureElementStoredValueArr;
            bxwc2 = bxwc;
            i = 5;
            i2 = 0;
        }
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            bxvd bxvd3 = (bxvd) arrayList.get(i7);
            if (bmgm.f164950c) {
                bmgm.mo74035c();
                bmgm.f164950c = false;
            }
            bmgn bmgn4 = (bmgn) bmgm.f164949b;
            bmgk bmgk9 = (bmgk) bxvd3.mo74062i();
            bmgk9.getClass();
            bmgn4.mo66789a();
            bmgn4.f129278d.add(bmgk9);
        }
        if (bmgm.f164950c) {
            bmgm.mo74035c();
            bmgm.f164950c = false;
        }
        ((bmgn) bmgm.f164949b).f129279e = bxvk.m124030de();
        bmgn bmgn5 = bmgn;
        bxwc bxwc3 = bmgn5.f129279e;
        int size3 = bxwc3.size();
        ArrayList arrayList2 = new ArrayList(size3);
        for (int i8 = 0; i8 < size3; i8++) {
            bmgd bmgd = (bmgd) bxwc3.get(i8);
            bxvd bxvd4 = (bxvd) bmgd.mo74142c(5);
            bxvd4.mo73625a((bxvk) bmgd);
            bmfy bmfy2 = ((bmgd) bxvd4.f164949b).f129222h;
            if (bmfy2 == null) {
                bmfy2 = bmfy.f129189l;
            }
            if (bmfy2 != null) {
                if (bmfy2.f129192b == 11) {
                    bmfy bmfy3 = ((bmgd) bxvd4.f164949b).f129222h;
                    if (bmfy3 == null) {
                        bmfy3 = bmfy.f129189l;
                    }
                    if (bmfy3.f129192b == 11) {
                        bmga = (bmga) bmfy3.f129193c;
                    } else {
                        bmga = bmga.f129208b;
                    }
                    SecureElementStoredValue a = bjyd.m104884a(secureElementStoredValueArr, bmga.f129210a);
                    if (a == null || a.f81681f != 2) {
                        if (bxvd4.f164950c) {
                            bxvd4.mo74035c();
                            bxvd4.f164950c = false;
                        }
                        bmgd bmgd2 = (bmgd) bxvd4.f164949b;
                        bmgd bmgd3 = bmgd.f129213j;
                        bmgd2.f129223i = 1;
                        bmgd2.f129215a |= 128;
                    }
                    if (nrVar2 != null) {
                        nrVar2.add(Long.valueOf(((bmgd) bxvd4.f164949b).f129216b));
                    }
                }
            }
            arrayList2.add(bxvd4);
        }
        int size4 = arrayList2.size();
        for (int i9 = 0; i9 < size4; i9++) {
            bxvd bxvd5 = (bxvd) arrayList2.get(i9);
            if (bmgm.f164950c) {
                bmgm.mo74035c();
                bmgm.f164950c = false;
            }
            bmgn bmgn6 = (bmgn) bmgm.f164949b;
            bmgd bmgd4 = (bmgd) bxvd5.mo74062i();
            bmgd4.getClass();
            bmgn6.mo66790b();
            bmgn6.f129279e.add(bmgd4);
        }
        if (!m79856a(bmgm, bmgn5.f129284j)) {
            if (!m79856a(bmgm, bmgn5.f129285k)) {
                Iterator it = Collections.unmodifiableList(((bmgn) bmgm.f164949b).f129278d).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 0;
                        break;
                    }
                    bmgk bmgk10 = (bmgk) it.next();
                    int a2 = bmgj.m108003a(bmgk10.f129259m);
                    if (a2 != 0) {
                        if (a2 == 6) {
                        }
                    }
                    int a3 = bmgj.m108003a(bmgk10.f129259m);
                    if (a3 != 0 && a3 == 2) {
                    }
                }
                if (j != 0) {
                    if (bmgm.f164950c) {
                        bmgm.mo74035c();
                        bmgm.f164950c = false;
                    }
                    bmgn bmgn7 = (bmgn) bmgm.f164949b;
                    bmgn7.f129275a |= 32;
                    bmgn7.f129284j = j;
                } else {
                    if (bmgm.f164950c) {
                        bmgm.mo74035c();
                        bmgm.f164950c = false;
                    }
                    bmgn bmgn8 = (bmgn) bmgm.f164949b;
                    int i10 = bmgn8.f129275a & -33;
                    bmgn8.f129275a = i10;
                    bmgn8.f129284j = 0;
                    bmgn8.f129275a = i10 & -5;
                    bmgn8.f129281g = -1;
                }
            } else {
                long j2 = ((bmgn) bmgm.f164949b).f129285k;
                if (bmgm.f164950c) {
                    bmgm.mo74035c();
                    bmgm.f164950c = false;
                }
                bmgn bmgn9 = (bmgn) bmgm.f164949b;
                bmgn9.f129275a |= 32;
                bmgn9.f129284j = j2;
            }
        }
        return (bmgn) bmgm.mo74062i();
    }

    /* renamed from: a */
    private static boolean m79856a(bmgm bmgm, long j) {
        boolean z;
        boolean z2;
        if (j == 0) {
            return false;
        }
        Iterator it = Collections.unmodifiableList(((bmgn) bmgm.f164949b).f129278d).iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z2 = true;
                z = false;
                break;
            }
            bmgk bmgk = (bmgk) it.next();
            if (bmgk.f129248b == j) {
                int a = bmgj.m108003a(bmgk.f129259m);
                if (a != 0 && a == 2) {
                    z2 = false;
                } else {
                    int a2 = bmgj.m108003a(bmgk.f129259m);
                    z2 = a2 == 0 || a2 != 6;
                }
            }
        }
        if (!z) {
            Iterator it2 = Collections.unmodifiableList(((bmgn) bmgm.f164949b).f129279e).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                bmgd bmgd = (bmgd) it2.next();
                if (bmgd.f129216b == j) {
                    int a3 = bmgc.m107996a(bmgd.f129223i);
                    if (a3 != 0 && a3 == 2) {
                        return false;
                    }
                }
            }
        }
        return z2;
    }
}
