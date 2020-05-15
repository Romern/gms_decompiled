package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.chimera.Fragment;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: evu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class evu extends evn {

    /* renamed from: c */
    private static final sek f15902c = ffw.m11631a("IntentLauncher");

    /* renamed from: d */
    private static final Pattern f15903d = Pattern.compile("^((\\d+\\.)*\\d+).*");

    /* renamed from: e */
    private final bsup f15904e;

    /* renamed from: f */
    private final Fragment f15905f;

    public evu(bsup bsup, Fragment fragment, ewh ewh, ewg ewg) {
        super(ewh, ewg);
        this.f15904e = bsup;
        this.f15905f = fragment;
    }

    /* renamed from: a */
    private static int m11203a(List list, List list2) {
        int max = Math.max(list.size(), list2.size());
        int i = 0;
        while (i < max) {
            int intValue = i < list.size() ? ((Integer) list.get(i)).intValue() : 0;
            int intValue2 = i < list2.size() ? ((Integer) list2.get(i)).intValue() : 0;
            if (intValue > intValue2) {
                return 1;
            }
            if (intValue < intValue2) {
                return -1;
            }
            i++;
        }
        return 0;
    }

    /* renamed from: a */
    public static Intent m11204a(bsup bsup) {
        int i;
        String str;
        bsyb bsyb;
        boolean z;
        bsuu bsuu;
        int i2;
        bsvk bsvk;
        int i3;
        bsvc bsvc;
        int i4;
        bsxx bsxx;
        int i5;
        bswj bswj;
        double d;
        bsvw bsvw;
        float f;
        bsvz bsvz;
        long j;
        bswp bswp;
        bsup bsup2 = bsup;
        if (bsup2 == null || (bsup2.f147167a & 1) == 0) {
            return null;
        }
        bsuo bsuo = bsup2.f147169c;
        if (bsuo == null) {
            bsuo = bsuo.f147154j;
        }
        if (stm.m36302d(bsuo.f147157b)) {
            return null;
        }
        bsuo bsuo2 = bsup2.f147169c;
        if (bsuo2 == null) {
            bsuo2 = bsuo.f147154j;
        }
        if (stm.m36302d(bsuo2.f147158c)) {
            bsuo bsuo3 = bsup2.f147169c;
            if (bsuo3 == null) {
                bsuo3 = bsuo.f147154j;
            }
            if (stm.m36302d(bsuo3.f147159d)) {
                return null;
            }
        }
        bsuo bsuo4 = bsup2.f147169c;
        if (bsuo4 == null) {
            bsuo4 = bsuo.f147154j;
        }
        if (!bsuo4.f147164i) {
            rfz a = rfz.m33557a(rpr.m34216b());
            bsuo bsuo5 = bsup2.f147169c;
            if (bsuo5 == null) {
                bsuo5 = bsuo.f147154j;
            }
            if (!a.mo24610b(bsuo5.f147157b)) {
                sek sek = f15902c;
                Object[] objArr = new Object[1];
                bsuo bsuo6 = bsup2.f147169c;
                if (bsuo6 == null) {
                    bsuo6 = bsuo.f147154j;
                }
                objArr[0] = bsuo6.f147157b;
                sek.mo25418e("Signature check failed for %s", objArr);
                return null;
            }
        }
        int size = bsup2.f147168b.size();
        bxwc bxwc = bsup2.f147168b;
        int size2 = bxwc.size();
        int i6 = 0;
        while (true) {
            if (i6 < size2) {
                bsur bsur = (bsur) bxwc.get(i6);
                if (bsur != null) {
                    try {
                        if (!stm.m36302d(bsur.f147176a)) {
                            if (spn.m35892g(rpr.m34216b(), bsur.f147176a)) {
                                if (bsur.f147179d.size() > 0 || bsur.f147180e.size() > 0) {
                                    String a2 = spn.m35848a(rpr.m34216b(), bsur.f147176a);
                                    try {
                                        if (!stm.m36302d(a2)) {
                                            Matcher matcher = f15903d.matcher(a2);
                                            if (matcher.matches()) {
                                                bngs j2 = bngx.m109377j();
                                                for (String str2 : bmyx.m108640a('.').mo66925c((CharSequence) matcher.group(1))) {
                                                    j2.mo67668c(Integer.valueOf(str2));
                                                }
                                                bngx a3 = j2.mo67664a();
                                                if (bsur.f147179d.size() != 0) {
                                                    if (m11203a(a3, bsur.f147179d) < 0) {
                                                        continue;
                                                    }
                                                }
                                                if (bsur.f147180e.size() != 0 && m11203a(a3, bsur.f147180e) >= 0) {
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } catch (NumberFormatException e) {
                                    }
                                }
                                if (bsur.f147177b <= 0) {
                                    if (bsur.f147178c <= 0) {
                                        break;
                                    }
                                }
                                int b = spn.m35864b(rpr.m34216b(), bsur.f147176a);
                                if (b >= bsur.f147177b) {
                                    int i7 = bsur.f147178c;
                                    if (i7 == 0 || b <= i7) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            break;
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                    }
                }
                i6++;
            } else if (size != 0) {
                return null;
            }
        }
        Intent intent = new Intent();
        bsuo bsuo7 = bsup2.f147169c;
        if (bsuo7 == null) {
            bsuo7 = bsuo.f147154j;
        }
        intent.setPackage(bsuo7.f147157b);
        bsuo bsuo8 = bsup2.f147169c;
        if (bsuo8 == null) {
            bsuo8 = bsuo.f147154j;
        }
        if (!stm.m36302d(bsuo8.f147158c)) {
            bsuo bsuo9 = bsup2.f147169c;
            if (bsuo9 == null) {
                bsuo9 = bsuo.f147154j;
            }
            String str3 = bsuo9.f147157b;
            bsuo bsuo10 = bsup2.f147169c;
            if (bsuo10 == null) {
                bsuo10 = bsuo.f147154j;
            }
            intent.setClassName(str3, bsuo10.f147158c);
        }
        bsuo bsuo11 = bsup2.f147169c;
        if (bsuo11 == null) {
            bsuo11 = bsuo.f147154j;
        }
        for (Map.Entry entry : Collections.unmodifiableMap(bsuo11.f147162g).entrySet()) {
            String str4 = (String) entry.getKey();
            bsvx bsvx = (bsvx) entry.getValue();
            int i8 = bsvx.f147353a;
            switch (i8) {
                case 0:
                    i = 19;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
                case 9:
                    i = 9;
                    break;
                case 10:
                    i = 10;
                    break;
                case 11:
                    i = 11;
                    break;
                case 12:
                    i = 12;
                    break;
                case 13:
                    i = 13;
                    break;
                case 14:
                    i = 14;
                    break;
                case 15:
                    i = 15;
                    break;
                case 16:
                    i = 16;
                    break;
                case 17:
                    i = 17;
                    break;
                case 18:
                    i = 18;
                    break;
                default:
                    i = 0;
                    break;
            }
            int i9 = i - 1;
            if (i != 0) {
                switch (i9) {
                    case 0:
                        if (i8 == 1) {
                            str = (String) bsvx.f147354b;
                        } else {
                            str = "";
                        }
                        intent.putExtra(str4, str);
                        break;
                    case 1:
                        if (i8 == 2) {
                            bsyb = (bsyb) bsvx.f147354b;
                        } else {
                            bsyb = bsyb.f147649b;
                        }
                        intent.putExtra(str4, (String[]) bsyb.f147651a.toArray(new String[0]));
                        break;
                    case 2:
                        if (i8 == 3) {
                            z = ((Boolean) bsvx.f147354b).booleanValue();
                        } else {
                            z = false;
                        }
                        intent.putExtra(str4, z);
                        break;
                    case 3:
                        if (i8 == 4) {
                            bsuu = (bsuu) bsvx.f147354b;
                        } else {
                            bsuu = bsuu.f147193b;
                        }
                        intent.putExtra(str4, bqcc.m112558a(bsuu.f147195a));
                        break;
                    case 4:
                        if (i8 == 5) {
                            i2 = ((Integer) bsvx.f147354b).intValue();
                        } else {
                            i2 = 0;
                        }
                        intent.putExtra(str4, (char) i2);
                        break;
                    case 5:
                        if (i8 == 6) {
                            bsvk = (bsvk) bsvx.f147354b;
                        } else {
                            bsvk = bsvk.f147289b;
                        }
                        int[] a4 = bqcn.m112584a(bsvk.f147291a);
                        char[] cArr = new char[a4.length];
                        for (int i10 = 0; i10 < a4.length; i10++) {
                            cArr[i10] = (char) a4[i10];
                        }
                        intent.putExtra(str4, cArr);
                        break;
                    case 6:
                        if (i8 == 7) {
                            i3 = ((Integer) bsvx.f147354b).intValue();
                        } else {
                            i3 = 0;
                        }
                        intent.putExtra(str4, (byte) i3);
                        break;
                    case 7:
                        if (i8 == 8) {
                            bsvc = (bsvc) bsvx.f147354b;
                        } else {
                            bsvc = bsvc.f147227b;
                        }
                        intent.putExtra(str4, bqce.m112561a(bsvc.f147229a));
                        break;
                    case 8:
                        if (i8 == 9) {
                            i4 = ((Integer) bsvx.f147354b).intValue();
                        } else {
                            i4 = 0;
                        }
                        intent.putExtra(str4, (short) i4);
                        break;
                    case 9:
                        if (i8 == 10) {
                            bsxx = (bsxx) bsvx.f147354b;
                        } else {
                            bsxx = bsxx.f147636b;
                        }
                        intent.putExtra(str4, bqct.m112603a(bsxx.f147638a));
                        break;
                    case 10:
                        if (i8 == 11) {
                            i5 = ((Integer) bsvx.f147354b).intValue();
                        } else {
                            i5 = 0;
                        }
                        intent.putExtra(str4, i5);
                        break;
                    case 11:
                        if (i8 == 12) {
                            bswj = (bswj) bsvx.f147354b;
                        } else {
                            bswj = bswj.f147442b;
                        }
                        intent.putExtra(str4, bqcn.m112584a(bswj.f147444a));
                        break;
                    case 12:
                        if (i8 == 13) {
                            d = ((Double) bsvx.f147354b).doubleValue();
                        } else {
                            d = 0.0d;
                        }
                        intent.putExtra(str4, d);
                        break;
                    case 13:
                        if (i8 == 14) {
                            bsvw = (bsvw) bsvx.f147354b;
                        } else {
                            bsvw = bsvw.f147348b;
                        }
                        intent.putExtra(str4, bqci.m112569a(bsvw.f147350a));
                        break;
                    case 14:
                        if (i8 == 15) {
                            f = ((Float) bsvx.f147354b).floatValue();
                        } else {
                            f = 0.0f;
                        }
                        intent.putExtra(str4, f);
                        break;
                    case 15:
                        if (i8 == 16) {
                            bsvz = (bsvz) bsvx.f147354b;
                        } else {
                            bsvz = bsvz.f147360b;
                        }
                        intent.putExtra(str4, bqcl.m112574a(bsvz.f147362a));
                        break;
                    case 16:
                        if (i8 == 17) {
                            j = ((Long) bsvx.f147354b).longValue();
                        } else {
                            j = 0;
                        }
                        intent.putExtra(str4, j);
                        break;
                    case 17:
                        if (i8 == 18) {
                            bswp = (bswp) bsvx.f147354b;
                        } else {
                            bswp = bswp.f147472b;
                        }
                        intent.putExtra(str4, bqcr.m112597a(bswp.f147474a));
                        break;
                }
            } else {
                throw null;
            }
        }
        bsuo bsuo12 = bsup2.f147169c;
        if (bsuo12 == null) {
            bsuo12 = bsuo.f147154j;
        }
        bxwc bxwc2 = bsuo12.f147163h;
        int size3 = bxwc2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            intent.addCategory((String) bxwc2.get(i11));
        }
        bsuo bsuo13 = bsup2.f147169c;
        if (bsuo13 == null) {
            bsuo13 = bsuo.f147154j;
        }
        if (!stm.m36302d(bsuo13.f147159d)) {
            bsuo bsuo14 = bsup2.f147169c;
            if (bsuo14 == null) {
                bsuo14 = bsuo.f147154j;
            }
            intent.setAction(bsuo14.f147159d);
        }
        bsuo bsuo15 = bsup2.f147169c;
        if (bsuo15 == null) {
            bsuo15 = bsuo.f147154j;
        }
        if (!stm.m36302d(bsuo15.f147160e)) {
            bsuo bsuo16 = bsup2.f147169c;
            if (bsuo16 == null) {
                bsuo16 = bsuo.f147154j;
            }
            intent.setData(Uri.parse(bsuo16.f147160e));
        }
        bsuo bsuo17 = bsup2.f147169c;
        if (bsuo17 == null) {
            bsuo17 = bsuo.f147154j;
        }
        if (!stm.m36302d(bsuo17.f147161f)) {
            bsuo bsuo18 = bsup2.f147169c;
            if (bsuo18 == null) {
                bsuo18 = bsuo.f147154j;
            }
            intent.setType(bsuo18.f147161f);
        }
        return intent;
    }

    /* renamed from: a */
    private final void m11205a(Intent intent) {
        try {
            this.f15905f.startActivityForResult(intent, 12);
            this.f15884a.mo10551a(true);
        } catch (ActivityNotFoundException e) {
            this.f15885b.mo10534a(e);
        }
    }

    /* renamed from: a */
    public final void mo10533a() {
        Intent a = m11204a(this.f15904e);
        if (a != null) {
            m11205a(a);
        }
    }
}
