package p000;

import android.content.res.Resources;
import android.util.Pair;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: acbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbf {

    /* renamed from: a */
    private final String f59425a;

    /* renamed from: b */
    private final String f59426b;

    /* renamed from: c */
    private final int[] f59427c;

    /* renamed from: d */
    private final Map f59428d;

    /* renamed from: e */
    private final Resources f59429e;

    /* renamed from: f */
    private boolean f59430f;

    /* renamed from: g */
    private List f59431g;

    public acbf(absr absr, Resources resources) {
        this.f59425a = absr.f58140e;
        this.f59426b = absr.f58138c;
        this.f59427c = new int[fro.m12228a()];
        bxwc bxwc = absr.f58146k;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            abut abut = (abut) bxwc.get(i);
            this.f59427c[abut.f58466b] = abut.f58468d;
        }
        int size2 = absr.f58145j.size();
        HashMap hashMap = new HashMap(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            hashMap.put(((abqo) absr.f58145j.get(i2)).f57978b, Integer.valueOf(i2));
        }
        this.f59428d = hashMap;
        this.f59429e = resources;
    }

    /* renamed from: a */
    public static abur m48805a(int i) {
        bxvd da = abur.f58453f.mo74144da();
        bxvd da2 = abup.f58444f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abup abup = (abup) da2.f164949b;
        abup.f58446a |= 1;
        abup.f58447b = i;
        abup abup2 = (abup) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abur abur = (abur) da.f164949b;
        abup2.getClass();
        abur.f58457c = abup2;
        abur.f58455a |= 2;
        return (abur) da.mo74062i();
    }

    /* renamed from: b */
    public final List mo32604b() {
        if (this.f59431g == null && !this.f59430f) {
            try {
                mo32603a();
            } catch (acar e) {
                return null;
            }
        }
        return this.f59431g;
    }

    public acbf(String str, RegisterCorpusInfo registerCorpusInfo, Resources resources) {
        this.f59425a = str;
        this.f59426b = registerCorpusInfo.f9635a;
        GlobalSearchCorpusConfig globalSearchCorpusConfig = registerCorpusInfo.f9639e;
        if (globalSearchCorpusConfig != null) {
            this.f59427c = globalSearchCorpusConfig.f9570a;
        } else {
            this.f59427c = null;
        }
        HashMap hashMap = new HashMap(registerCorpusInfo.f9638d.length);
        int i = 0;
        while (true) {
            RegisterSectionInfo[] registerSectionInfoArr = registerCorpusInfo.f9638d;
            if (i < registerSectionInfoArr.length) {
                hashMap.put(registerSectionInfoArr[i].f9646a, Integer.valueOf(i));
                i++;
            } else {
                this.f59428d = hashMap;
                this.f59429e = resources;
                return;
            }
        }
    }

    /* renamed from: a */
    public static abur m48806a(String str) {
        bxvd da = abur.f58453f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abur abur = (abur) da.f164949b;
        str.getClass();
        abur.f58455a |= 1;
        abur.f58456b = str;
        return (abur) da.mo74062i();
    }

    /* renamed from: a */
    private static abur m48807a(Map map, String str) {
        Integer num = (Integer) map.get(str);
        if (num != null) {
            return m48805a(num.intValue());
        }
        throw new IllegalArgumentException(String.format("Section %s does not exist in section mapping!", str));
    }

    /* renamed from: a */
    private static abut m48808a(int i, int i2, abur[] aburArr) {
        bxvd da = abut.f58463e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abut abut = (abut) da.f164949b;
        int i3 = abut.f58465a | 4;
        abut.f58465a = i3;
        abut.f58468d = i;
        abut.f58465a = i3 | 1;
        abut.f58466b = i2;
        bxvd da2 = abus.f58460b.mo74144da();
        List asList = Arrays.asList(aburArr);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abus abus = (abus) da2.f164949b;
        if (!abus.f58462a.mo73666a()) {
            abus.f58462a = bxvk.m124021a(abus.f58462a);
        }
        bxsy.m123078a(asList, abus.f58462a);
        abus abus2 = (abus) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abut abut2 = (abut) da.f164949b;
        abus2.getClass();
        abut2.f58467c = abus2;
        abut2.f58465a |= 2;
        return (abut) da.mo74062i();
    }

    /* renamed from: a */
    public static abut m48809a(int i, abur[] aburArr) {
        return m48808a(0, i, aburArr);
    }

    /* renamed from: a */
    public final void mo32603a() {
        acbe[] acbeArr;
        int i;
        abut abut;
        acbe acbe;
        acbe[] acbeArr2;
        int i2;
        abur abur;
        List<Pair> list;
        acbf acbf = this;
        boolean z = true;
        if (acbf.f59427c != null) {
            int i3 = 0;
            if (abww.m48413a(acbf.f59426b)) {
                abut[] abutArr = new abut[4];
                abutArr[0] = m48809a(fro.m12229a("text1"), new abur[]{m48807a(acbf.f59428d, "name")});
                abutArr[1] = m48809a(fro.m12229a("intent_action"), new abur[]{m48806a("android.intent.action.VIEW")});
                int a = fro.m12229a("intent_data");
                abur[] aburArr = new abur[1];
                bxvd da = abur.f58453f.mo74144da();
                abuq abuq = abuq.f58451a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abur abur2 = (abur) da.f164949b;
                abuq.getClass();
                abur2.f58459e = abuq;
                abur2.f58455a |= 8;
                aburArr[0] = (abur) da.mo74062i();
                abutArr[2] = m48809a(a, aburArr);
                abutArr[3] = m48809a(fro.m12229a("thing_proto"), new abur[]{m48807a(acbf.f59428d, "thing_proto")});
                acbf.f59431g = Arrays.asList(abutArr);
                acbf.f59430f = true;
            } else if (acbf.f59429e == null) {
                String valueOf = String.valueOf(acbf.f59425a);
                throw new acat(valueOf.length() == 0 ? new String("Failed to get resources for ") : "Failed to get resources for ".concat(valueOf));
            } else {
                int length = acbf.f59427c.length;
                acbe[] acbeArr3 = new acbe[length];
                int i4 = 0;
                while (true) {
                    int[] iArr = acbf.f59427c;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    int i5 = iArr[i4];
                    if (i5 != 0) {
                        try {
                            acbeArr3[i4] = new acbe(i5, acbf.f59429e.getString(i5));
                        } catch (Resources.NotFoundException e) {
                            String a2 = fro.m12230a(i4);
                            String hexString = Integer.toHexString(acbf.f59427c[i4]);
                            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 28 + String.valueOf(hexString).length());
                            sb.append("Invalid resource ID for ");
                            sb.append(a2);
                            sb.append(": 0x");
                            sb.append(hexString);
                            throw new acaq(sb.toString(), e);
                        }
                    }
                    i4++;
                }
                ArrayList arrayList = new ArrayList(length);
                int i6 = 0;
                while (i6 < length) {
                    char c = '$';
                    try {
                        acbe acbe2 = acbeArr3[i6];
                        Object obj = null;
                        if (acbe2 != null) {
                            acbk acbk = new acbk(acbe2.f59424b, acbf.f59428d);
                            ArrayList arrayList2 = new ArrayList();
                            while (!acbk.mo32608a()) {
                                acbk.mo32609b();
                                if (acbk.mo32612e() != '%') {
                                    while (!acbk.mo32608a() && acbk.mo32612e() != '%') {
                                        acbk.mo32611d();
                                    }
                                    i2 = length;
                                    abur = acbk.m48822b((String) acbk.mo32610c().f59435b);
                                    acbeArr2 = acbeArr3;
                                    acbe = acbe2;
                                } else {
                                    acbk.mo32611d();
                                    if (acbk.mo32608a()) {
                                        throw acbk.mo32606a("Expected % or a section name");
                                    } else if (acbk.mo32612e() == '%') {
                                        acbk.mo32611d();
                                        i2 = length;
                                        abur = acbk.m48822b("%");
                                        acbeArr2 = acbeArr3;
                                        acbe = acbe2;
                                    } else {
                                        char e2 = acbk.mo32612e();
                                        if (e2 != c) {
                                            if (!acbk.m48823b(e2)) {
                                                throw acbk.mo32606a("Expected a section name or special section name");
                                            }
                                        }
                                        acbh g = acbk.mo32617g();
                                        if (acbk.mo32608a() || acbk.mo32612e() != '(') {
                                            list = Collections.emptyList();
                                        } else {
                                            acbk.mo32611d();
                                            list = new ArrayList();
                                            while (!acbk.mo32608a() && acbk.mo32612e() != ')') {
                                                char e3 = acbk.mo32612e();
                                                if (Character.isWhitespace(e3)) {
                                                    acbk.mo32611d();
                                                } else {
                                                    if (e3 != c) {
                                                        if (!acbk.m48823b(e3)) {
                                                            throw acbk.mo32606a("Expected a name");
                                                        }
                                                    }
                                                    acbh g2 = acbk.mo32617g();
                                                    acbk.mo32613f();
                                                    if (!acbk.mo32608a()) {
                                                        if (acbk.mo32612e() == ':') {
                                                            acbk.mo32611d();
                                                            list.add(Pair.create(g2, acbk.mo32618h()));
                                                        } else {
                                                            list.add(Pair.create(g2, obj));
                                                        }
                                                        acbk.mo32613f();
                                                        if (!acbk.mo32608a()) {
                                                            char e4 = acbk.mo32612e();
                                                            if (e4 == ',') {
                                                                acbk.mo32611d();
                                                            } else if (e4 != ')') {
                                                                throw acbk.mo32606a("Expected a , or )");
                                                            }
                                                            c = '$';
                                                        } else {
                                                            throw acbk.mo32606a("Expected a , or )");
                                                        }
                                                    } else {
                                                        throw acbk.mo32606a("Expected a ) or :");
                                                    }
                                                }
                                            }
                                            if (!acbk.mo32608a()) {
                                                acbk.mo32611d();
                                            } else {
                                                throw acbk.mo32606a("Expected a )");
                                            }
                                        }
                                        HashSet hashSet = new HashSet();
                                        for (Pair pair : list) {
                                            acbh acbh = (acbh) pair.first;
                                            if (!hashSet.contains(((acbj) acbh.f59435b).f59439a)) {
                                                hashSet.add(((acbj) acbh.f59435b).f59439a);
                                            } else {
                                                throw acbk.mo32607a(String.valueOf(((acbj) acbh.f59435b).f59439a).concat(" has already been specified"), acbh.f59434a);
                                            }
                                        }
                                        bxvd da2 = abur.f58453f.mo74144da();
                                        i2 = length;
                                        String str = "snippeted";
                                        acbeArr2 = acbeArr3;
                                        acbe = acbe2;
                                        if (((acbj) g.f59435b).f59439a.charAt(0) != '$') {
                                            int a3 = acbk.mo32614a(g);
                                            bxvd da3 = abup.f58444f.mo74144da();
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                Pair pair2 = (Pair) it.next();
                                                Iterator it2 = it;
                                                String str2 = ((acbj) ((acbh) pair2.first).f59435b).f59439a;
                                                if ("length".equals(str2)) {
                                                    String str3 = str;
                                                    int a4 = acbk.mo32615a(pair2);
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    abup abup = (abup) da3.f164949b;
                                                    abup.f58446a |= 2;
                                                    abup.f58448c = a4;
                                                    it = it2;
                                                    str = str3;
                                                } else if (str.equals(str2)) {
                                                    boolean b = acbk.mo32616b((acbh) pair2.second);
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    abup abup2 = (abup) da3.f164949b;
                                                    abup2.f58446a |= 4;
                                                    abup2.f58449d = b;
                                                    it = it2;
                                                    str = str;
                                                } else {
                                                    String str4 = str;
                                                    if (!"default".equals(str2)) {
                                                        throw acbk.mo32607a("Unknown key", ((acbh) pair2.first).f59434a);
                                                    } else if (pair2.second == null) {
                                                        throw acbk.mo32607a("default must specify a value", ((acbh) pair2.first).f59434a);
                                                    } else if (((acbh) pair2.second).f59435b instanceof String) {
                                                        String str5 = (String) ((acbh) pair2.second).f59435b;
                                                        if (da3.f164950c) {
                                                            da3.mo74035c();
                                                            da3.f164950c = false;
                                                        }
                                                        abup abup3 = (abup) da3.f164949b;
                                                        str5.getClass();
                                                        abup3.f58446a |= 8;
                                                        abup3.f58450e = str5;
                                                        it = it2;
                                                        str = str4;
                                                    } else {
                                                        throw acbk.mo32607a("Expected string literal", ((acbh) pair2.second).f59434a);
                                                    }
                                                }
                                            }
                                            abup abup4 = (abup) da3.mo74062i();
                                            bxvd bxvd = (bxvd) abup4.mo74142c(5);
                                            bxvd.mo73625a((bxvk) abup4);
                                            if (bxvd.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd.f164950c = false;
                                            }
                                            abup abup5 = (abup) bxvd.f164949b;
                                            abup5.f58446a |= 1;
                                            abup5.f58447b = a3;
                                            abup abup6 = (abup) bxvd.mo74062i();
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            abur abur3 = (abur) da2.f164949b;
                                            abup6.getClass();
                                            abur3.f58457c = abup6;
                                            abur3.f58455a |= 2;
                                        } else if (!"$uri".equals(((acbj) g.f59435b).f59439a)) {
                                            if ("$bestmatch".equals(((acbj) g.f59435b).f59439a)) {
                                                bxvd da4 = abuo.f58437f.mo74144da();
                                                Iterator it3 = list.iterator();
                                                while (it3.hasNext()) {
                                                    Pair pair3 = (Pair) it3.next();
                                                    String str6 = ((acbj) ((acbh) pair3.first).f59435b).f59439a;
                                                    if ("length".equals(str6)) {
                                                        Iterator it4 = it3;
                                                        int a5 = acbk.mo32615a(pair3);
                                                        if (da4.f164950c) {
                                                            da4.mo74035c();
                                                            da4.f164950c = false;
                                                        }
                                                        abuo abuo = (abuo) da4.f164949b;
                                                        abuo.f58439a |= 2;
                                                        abuo.f58441c = a5;
                                                        it3 = it4;
                                                    } else if (str.equals(str6)) {
                                                        boolean b2 = acbk.mo32616b((acbh) pair3.second);
                                                        if (da4.f164950c) {
                                                            da4.mo74035c();
                                                            da4.f164950c = false;
                                                        }
                                                        abuo abuo2 = (abuo) da4.f164949b;
                                                        abuo2.f58439a |= 4;
                                                        abuo2.f58442d = b2;
                                                        it3 = it3;
                                                    } else {
                                                        Iterator it5 = it3;
                                                        if (!"default".equals(str6)) {
                                                            if (!"except".equals(str6)) {
                                                                throw acbk.mo32607a("Unknown key", ((acbh) pair3.first).f59434a);
                                                            } else if (pair3.second == null) {
                                                                throw acbk.mo32607a("except must specify a value", ((acbh) pair3.first).f59434a);
                                                            } else if (((acbh) pair3.second).f59435b instanceof acbj) {
                                                                int a6 = 1 << acbk.mo32614a((acbh) pair3.second);
                                                                if (da4.f164950c) {
                                                                    da4.mo74035c();
                                                                    da4.f164950c = false;
                                                                }
                                                                abuo abuo3 = (abuo) da4.f164949b;
                                                                abuo3.f58439a |= 8;
                                                                abuo3.f58443e = a6;
                                                                it3 = it5;
                                                            } else if (((acbh) pair3.second).f59435b instanceof List) {
                                                                Iterator it6 = ((List) ((acbh) pair3.second).f59435b).iterator();
                                                                int i7 = 0;
                                                                while (it6.hasNext()) {
                                                                    acbh acbh2 = (acbh) it6.next();
                                                                    Iterator it7 = it6;
                                                                    if (acbh2.f59435b instanceof acbj) {
                                                                        i7 |= 1 << acbk.mo32614a(acbh2);
                                                                        it6 = it7;
                                                                    } else {
                                                                        throw acbk.mo32607a("Expected section name", acbh2.f59434a);
                                                                    }
                                                                }
                                                                if (da4.f164950c) {
                                                                    da4.mo74035c();
                                                                    da4.f164950c = false;
                                                                }
                                                                abuo abuo4 = (abuo) da4.f164949b;
                                                                abuo4.f58439a |= 8;
                                                                abuo4.f58443e = i7;
                                                                it3 = it5;
                                                            } else {
                                                                throw acbk.mo32607a("Expected name or list of values", ((acbh) pair3.second).f59434a);
                                                            }
                                                        } else if (pair3.second == null) {
                                                            throw acbk.mo32607a("default must specify a value", ((acbh) pair3.first).f59434a);
                                                        } else if (((acbh) pair3.second).f59435b instanceof String) {
                                                            String str7 = (String) ((acbh) pair3.second).f59435b;
                                                            if (da4.f164950c) {
                                                                da4.mo74035c();
                                                                da4.f164950c = false;
                                                            }
                                                            abuo abuo5 = (abuo) da4.f164949b;
                                                            str7.getClass();
                                                            abuo5.f58439a |= 1;
                                                            abuo5.f58440b = str7;
                                                            it3 = it5;
                                                        } else {
                                                            throw acbk.mo32607a("Expected string literal", ((acbh) pair3.second).f59434a);
                                                        }
                                                    }
                                                }
                                                abuo abuo6 = (abuo) da4.mo74062i();
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                abur abur4 = (abur) da2.f164949b;
                                                abuo6.getClass();
                                                abur4.f58458d = abuo6;
                                                abur4.f58455a |= 4;
                                            } else {
                                                throw acbk.mo32607a("Not a valid special section name", g.f59434a);
                                            }
                                        } else if (list.isEmpty()) {
                                            abuq abuq2 = abuq.f58451a;
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            abur abur5 = (abur) da2.f164949b;
                                            abuq2.getClass();
                                            abur5.f58459e = abuq2;
                                            abur5.f58455a |= 8;
                                        } else {
                                            throw acbk.mo32607a("Unknown key", ((acbh) ((Pair) list.get(0)).first).f59434a);
                                        }
                                        abur = (abur) da2.mo74062i();
                                    }
                                }
                                arrayList2.add(abur);
                                length = i2;
                                acbeArr3 = acbeArr2;
                                acbe2 = acbe;
                                i3 = 0;
                                c = '$';
                                obj = null;
                            }
                            abut = m48808a(acbe2.f59423a, i6, (abur[]) arrayList2.toArray(new abur[i3]));
                            i = length;
                            acbeArr = acbeArr3;
                        } else {
                            i = length;
                            acbeArr = acbeArr3;
                            abut = null;
                        }
                        if (abut != null) {
                            arrayList.add(abut);
                        }
                        i6++;
                        length = i;
                        acbeArr3 = acbeArr;
                        z = true;
                        i3 = 0;
                        acbf = this;
                    } catch (acbg e5) {
                        acbg acbg = e5;
                        String a7 = fro.m12230a(i6);
                        String a8 = acbg.mo32605a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a7).length() + 36 + String.valueOf(a8).length());
                        sb2.append("In global search section spec for ");
                        sb2.append(a7);
                        sb2.append(":\n");
                        sb2.append(a8);
                        throw new acaq(sb2.toString());
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        this.f59430f = true;
                        throw th2;
                    }
                }
                acbf.f59431g = arrayList;
                acbf.f59430f = z;
            }
        } else {
            acbf.f59430f = true;
        }
    }
}
