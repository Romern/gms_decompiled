package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: aqpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqpy implements aqvr {

    /* renamed from: a */
    public List f86568a;

    /* renamed from: b */
    public boolean f86569b;

    /* renamed from: c */
    private final aqpw f86570c;

    /* renamed from: d */
    private boolean f86571d;

    /* renamed from: e */
    private bzjd f86572e;

    public aqpy(aqpw aqpw) {
        this.f86570c = aqpw;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo48055a() {
        boolean z;
        bmxv bmxv;
        int a;
        if (this.f86569b && this.f86571d) {
            aqpw aqpw = this.f86570c;
            List list = this.f86568a;
            bzjd bzjd = this.f86572e;
            boolean z2 = list != null && !list.isEmpty();
            boolean z3 = (bzjd == null || bzjd.f170278a.size() == 0) ? false : true;
            if (cgoo.m146350b()) {
                z = !aqpw.f86547g.contains(3);
            } else {
                z = true;
            }
            if (cgnz.m146325b()) {
                tgh tgh = aqpw.f86530A;
                if (z) {
                    bmxv c = bmxv.m108567c(list);
                    bmxv c2 = bmxv.m108567c(bzjd);
                    List arrayList = new ArrayList();
                    if (c.mo66813a()) {
                        arrayList.addAll((Collection) c.mo66814b());
                    }
                    if (c2.mo66813a()) {
                        bxwc bxwc = ((bzjd) c2.mo66814b()).f170278a;
                        int size = bxwc.size();
                        for (int i = 0; i < size; i++) {
                            bzjc bzjc = (bzjc) bxwc.get(i);
                            if (!((bzjc.f170267a & 1) == 0 || (a = bzjb.m125842a(bzjc.f170268b)) == 0 || a != 3)) {
                                arrayList.add(bzjc);
                            }
                        }
                    }
                    Collections.sort(arrayList, aqpt.f86528a);
                    if (arrayList.size() > 10) {
                        arrayList = arrayList.subList(0, 10);
                    }
                    bmxv = bmxv.m108566b(arrayList);
                } else {
                    bmxv = bmvz.f131120a;
                }
                tgh.mo2511a(bmxv);
            } else if (!aqpw.f86557q && ((z2 || z3) && z)) {
                BaseCardView baseCardView = (BaseCardView) LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.card, aqpw.f86543c, false);
                aqpw.f86545e.add(new aqtx(aqpw.f86541a, baseCardView, list, bzjd, aqpw.f86549i, aqpw.f86551k, aqpw.f86553m, aqpw.f86555o));
                aqpw.f86562v.mo48057a(baseCardView, 0, tin.m37041a(tio.SMART_PROFILE_RECENT_INTERACTIONS_CARD));
            }
            aqpw.f86557q = true;
            aqpw.mo48051c();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0271  */
    /* renamed from: a */
    public final void mo48038a(aqqw aqqw) {
        bzil bzil;
        View view;
        bziw bziw;
        LinearLayout linearLayout;
        String str;
        bmxv bmxv;
        bmxv bmxv2;
        bmxv bmxv3;
        bmxv bmxv4;
        int a;
        bmxv bmxv5;
        bmvz bmvz;
        bmvz bmvz2;
        bmxv bmxv6;
        int size;
        int i;
        int size2;
        int i2;
        int size3;
        int i3;
        int size4;
        int i4;
        int size5;
        int i5;
        bmvz bmvz3;
        bxwc bxwc;
        bxwc bxwc2;
        bxwc bxwc3;
        bxwc bxwc4;
        bzhe bzhe;
        int i6;
        bxwc bxwc5;
        String str2;
        bmxv bmxv7;
        aqqw aqqw2 = aqqw;
        this.f86572e = aqqw2.f86630f;
        this.f86571d = true;
        mo48055a();
        aqpw aqpw = this.f86570c;
        if (cgnz.m146325b()) {
            if (aqqw.mo48087c() && aqqw2.f86628d.f170193e) {
                aqpw.mo48050b();
            }
            tfg tfg = aqpw.f86564x;
            String str3 = "";
            if (aqqw.mo48085a()) {
                bzhe bzhe2 = aqqw2.f86625a;
                if (bzhe2.f170036d.size() <= 0 || ((bzgy) bzhe2.f170036d.get(0)).f170005a.isEmpty()) {
                    bmvz = bmvz.f131120a;
                } else {
                    bmvz = bmxv.m108566b(((bzgy) bzhe2.f170036d.get(0)).f170005a);
                }
                if (bzhe2.f170037e.size() > 0) {
                    bzru bzru = ((bzgu) bzhe2.f170037e.get(0)).f169985b;
                    if (bzru == null) {
                        bzru = bzru.f171201d;
                    }
                    if (thi.m36972a(bzru)) {
                        bzru bzru2 = ((bzgu) bzhe2.f170037e.get(0)).f169985b;
                        if (bzru2 == null) {
                            bzru2 = bzru.f171201d;
                        }
                        bmvz2 = bmxv.m108566b(bzru2);
                        if (bzhe2.f170038f.size() > 0) {
                            bzgw bzgw = (bzgw) bzhe2.f170038f.get(0);
                            if (!bzgw.f169996b.isEmpty()) {
                                bmxv6 = bmxv.m108566b(bzgw.f169996b);
                                bngs j = bngx.m109377j();
                                if (bzhe2.f170033a.size() > 0) {
                                    bxwc bxwc6 = bzhe2.f170033a;
                                    int size6 = bxwc6.size();
                                    for (int i7 = 0; i7 < size6; i7++) {
                                        bzgv bzgv = (bzgv) bxwc6.get(i7);
                                        if ((bzgv.f169989a & 4) != 0) {
                                            bzru bzru3 = bzgv.f169991c;
                                            if (bzru3 == null) {
                                                bzru3 = bzru.f171201d;
                                            }
                                            if (thi.m36972a(bzru3)) {
                                                j.mo67668c(bzgv);
                                            }
                                        }
                                    }
                                }
                                bngx a2 = j.mo67664a();
                                bngs j2 = bngx.m109377j();
                                bxwc bxwc7 = bzhe2.f170040h;
                                size = bxwc7.size();
                                i = 0;
                                while (i < size) {
                                    bzgz bzgz = (bzgz) bxwc7.get(i);
                                    if (!bzgz.f170010b.isEmpty()) {
                                        thr thr = new thr();
                                        bxwc5 = bxwc7;
                                        if (bzgz.f170009a.isEmpty()) {
                                            str2 = bzgz.f170010b;
                                            if (URLUtil.isValidUrl(str2)) {
                                                i6 = size;
                                                str2 = Uri.parse(bzgz.f170010b).getSchemeSpecificPart().substring(2);
                                            } else {
                                                i6 = size;
                                            }
                                        } else {
                                            i6 = size;
                                            str2 = bzgz.f170009a;
                                        }
                                        bzhe = bzhe2;
                                        if (str2.length() > 18) {
                                            str2 = String.valueOf(str2.substring(0, 18)).concat("...");
                                        }
                                        if (str2 != null) {
                                            thr.f46043a = str2;
                                            String str4 = bzgz.f170010b;
                                            if (str4 != null) {
                                                thr.f46044b = str4;
                                                String str5 = str4.length() == 0 ? new String("https://s2.googleusercontent.com/s2/favicons?sz=32&domain_url=") : "https://s2.googleusercontent.com/s2/favicons?sz=32&domain_url=".concat(str4);
                                                if (str5 != null) {
                                                    thr.f46045c = str5;
                                                    String str6 = thr.f46043a == null ? " linkTitle" : str3;
                                                    if (thr.f46044b == null) {
                                                        str6 = str6.concat(" url");
                                                    }
                                                    if (thr.f46045c == null) {
                                                        str6 = String.valueOf(str6).concat(" iconUrl");
                                                    }
                                                    if (str6.isEmpty()) {
                                                        j2.mo67668c(new thl(thr.f46043a, thr.f46044b, thr.f46045c));
                                                    } else {
                                                        String valueOf = String.valueOf(str6);
                                                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                                                    }
                                                } else {
                                                    throw new NullPointerException("Null iconUrl");
                                                }
                                            } else {
                                                throw new NullPointerException("Null url");
                                            }
                                        } else {
                                            throw new NullPointerException("Null linkTitle");
                                        }
                                    } else {
                                        bxwc5 = bxwc7;
                                        i6 = size;
                                        bzhe = bzhe2;
                                    }
                                    i++;
                                    bxwc7 = bxwc5;
                                    size = i6;
                                    bzhe2 = bzhe;
                                }
                                bngx a3 = j2.mo67664a();
                                bngs j3 = bngx.m109377j();
                                bxwc bxwc8 = bzhe2.f170034b;
                                size2 = bxwc8.size();
                                i2 = 0;
                                while (i2 < size2) {
                                    bzhb bzhb = (bzhb) bxwc8.get(i2);
                                    if (!bzhb.f170019b.isEmpty()) {
                                        thx c = thy.m37026c();
                                        bxwc4 = bxwc8;
                                        c.mo26556b(bzhb.f170019b);
                                        if (!bzhb.f170018a.isEmpty()) {
                                            c.mo26555a(bzhb.f170018a);
                                        }
                                        j3.mo67668c(c.mo26554a());
                                    } else {
                                        bxwc4 = bxwc8;
                                    }
                                    i2++;
                                    bxwc8 = bxwc4;
                                }
                                bngx a4 = j3.mo67664a();
                                bngs j4 = bngx.m109377j();
                                bxwc bxwc9 = bzhe2.f170035c;
                                size3 = bxwc9.size();
                                i3 = 0;
                                while (i3 < size3) {
                                    bzgx bzgx = (bzgx) bxwc9.get(i3);
                                    if (!bzgx.f170001b.isEmpty()) {
                                        thx c2 = thy.m37026c();
                                        bxwc3 = bxwc9;
                                        c2.mo26556b(bzgx.f170001b);
                                        if (!bzgx.f170000a.isEmpty()) {
                                            c2.mo26555a(bzgx.f170000a);
                                        }
                                        j4.mo67668c(c2.mo26554a());
                                    } else {
                                        bxwc3 = bxwc9;
                                    }
                                    i3++;
                                    bxwc9 = bxwc3;
                                }
                                bngx a5 = j4.mo67664a();
                                bngs j5 = bngx.m109377j();
                                bxwc bxwc10 = bzhe2.f170042j;
                                size4 = bxwc10.size();
                                i4 = 0;
                                while (i4 < size4) {
                                    bzhc bzhc = (bzhc) bxwc10.get(i4);
                                    if (!bzhc.f170023a.isEmpty()) {
                                        thx c3 = thy.m37026c();
                                        bxwc2 = bxwc10;
                                        c3.mo26556b(bzhc.f170023a);
                                        if (!bzhc.f170024b.isEmpty()) {
                                            c3.mo26555a(bzhc.f170024b);
                                        }
                                        j5.mo67668c(c3.mo26554a());
                                    } else {
                                        bxwc2 = bxwc10;
                                    }
                                    i4++;
                                    bxwc10 = bxwc2;
                                }
                                bngx a6 = j5.mo67664a();
                                bngs j6 = bngx.m109377j();
                                bxwc bxwc11 = bzhe2.f170041i;
                                size5 = bxwc11.size();
                                i5 = 0;
                                while (i5 < size5) {
                                    bzhd bzhd = (bzhd) bxwc11.get(i5);
                                    if (!bzhd.f170029b.isEmpty()) {
                                        thx c4 = thy.m37026c();
                                        bxwc = bxwc11;
                                        c4.mo26556b(bzhd.f170029b);
                                        if (!bzhd.f170028a.isEmpty()) {
                                            c4.mo26555a(bzhd.f170028a);
                                        }
                                        j6.mo67668c(c4.mo26554a());
                                    } else {
                                        bxwc = bxwc11;
                                    }
                                    i5++;
                                    bxwc11 = bxwc;
                                }
                                bngx a7 = j6.mo67664a();
                                if (bzhe2.f170039g.size() > 0 || ((bzha) bzhe2.f170039g.get(0)).f170014a.isEmpty()) {
                                    bmvz3 = bmvz.f131120a;
                                } else {
                                    bmvz3 = bmxv.m108566b(((bzha) bzhe2.f170039g.get(0)).f170014a);
                                }
                                bmxv = bmxv.m108566b(new thj(bmvz, bmvz2, bmxv6, a2, a3, a4, a5, a6, a7, bmvz3));
                            } else if (!bzgw.f169995a.isEmpty()) {
                                bmxv7 = bmxv.m108566b(bzgw.f169995a);
                                bmxv6 = bmxv7;
                                bngs j7 = bngx.m109377j();
                                if (bzhe2.f170033a.size() > 0) {
                                }
                                bngx a22 = j7.mo67664a();
                                bngs j22 = bngx.m109377j();
                                bxwc bxwc72 = bzhe2.f170040h;
                                size = bxwc72.size();
                                i = 0;
                                while (i < size) {
                                }
                                bngx a32 = j22.mo67664a();
                                bngs j32 = bngx.m109377j();
                                bxwc bxwc82 = bzhe2.f170034b;
                                size2 = bxwc82.size();
                                i2 = 0;
                                while (i2 < size2) {
                                }
                                bngx a42 = j32.mo67664a();
                                bngs j42 = bngx.m109377j();
                                bxwc bxwc92 = bzhe2.f170035c;
                                size3 = bxwc92.size();
                                i3 = 0;
                                while (i3 < size3) {
                                }
                                bngx a52 = j42.mo67664a();
                                bngs j52 = bngx.m109377j();
                                bxwc bxwc102 = bzhe2.f170042j;
                                size4 = bxwc102.size();
                                i4 = 0;
                                while (i4 < size4) {
                                }
                                bngx a62 = j52.mo67664a();
                                bngs j62 = bngx.m109377j();
                                bxwc bxwc112 = bzhe2.f170041i;
                                size5 = bxwc112.size();
                                i5 = 0;
                                while (i5 < size5) {
                                }
                                bngx a72 = j62.mo67664a();
                                if (bzhe2.f170039g.size() > 0) {
                                }
                                bmvz3 = bmvz.f131120a;
                                bmxv = bmxv.m108566b(new thj(bmvz, bmvz2, bmxv6, a22, a32, a42, a52, a62, a72, bmvz3));
                            }
                        }
                        bmxv7 = bmvz.f131120a;
                        bmxv6 = bmxv7;
                        bngs j72 = bngx.m109377j();
                        if (bzhe2.f170033a.size() > 0) {
                        }
                        bngx a222 = j72.mo67664a();
                        bngs j222 = bngx.m109377j();
                        bxwc bxwc722 = bzhe2.f170040h;
                        size = bxwc722.size();
                        i = 0;
                        while (i < size) {
                        }
                        bngx a322 = j222.mo67664a();
                        bngs j322 = bngx.m109377j();
                        bxwc bxwc822 = bzhe2.f170034b;
                        size2 = bxwc822.size();
                        i2 = 0;
                        while (i2 < size2) {
                        }
                        bngx a422 = j322.mo67664a();
                        bngs j422 = bngx.m109377j();
                        bxwc bxwc922 = bzhe2.f170035c;
                        size3 = bxwc922.size();
                        i3 = 0;
                        while (i3 < size3) {
                        }
                        bngx a522 = j422.mo67664a();
                        bngs j522 = bngx.m109377j();
                        bxwc bxwc1022 = bzhe2.f170042j;
                        size4 = bxwc1022.size();
                        i4 = 0;
                        while (i4 < size4) {
                        }
                        bngx a622 = j522.mo67664a();
                        bngs j622 = bngx.m109377j();
                        bxwc bxwc1122 = bzhe2.f170041i;
                        size5 = bxwc1122.size();
                        i5 = 0;
                        while (i5 < size5) {
                        }
                        bngx a722 = j622.mo67664a();
                        if (bzhe2.f170039g.size() > 0) {
                        }
                        bmvz3 = bmvz.f131120a;
                        bmxv = bmxv.m108566b(new thj(bmvz, bmvz2, bmxv6, a222, a322, a422, a522, a622, a722, bmvz3));
                    }
                }
                bmvz2 = bmvz.f131120a;
                if (bzhe2.f170038f.size() > 0) {
                }
                bmxv7 = bmvz.f131120a;
                bmxv6 = bmxv7;
                bngs j722 = bngx.m109377j();
                if (bzhe2.f170033a.size() > 0) {
                }
                bngx a2222 = j722.mo67664a();
                bngs j2222 = bngx.m109377j();
                bxwc bxwc7222 = bzhe2.f170040h;
                size = bxwc7222.size();
                i = 0;
                while (i < size) {
                }
                bngx a3222 = j2222.mo67664a();
                bngs j3222 = bngx.m109377j();
                bxwc bxwc8222 = bzhe2.f170034b;
                size2 = bxwc8222.size();
                i2 = 0;
                while (i2 < size2) {
                }
                bngx a4222 = j3222.mo67664a();
                bngs j4222 = bngx.m109377j();
                bxwc bxwc9222 = bzhe2.f170035c;
                size3 = bxwc9222.size();
                i3 = 0;
                while (i3 < size3) {
                }
                bngx a5222 = j4222.mo67664a();
                bngs j5222 = bngx.m109377j();
                bxwc bxwc10222 = bzhe2.f170042j;
                size4 = bxwc10222.size();
                i4 = 0;
                while (i4 < size4) {
                }
                bngx a6222 = j5222.mo67664a();
                bngs j6222 = bngx.m109377j();
                bxwc bxwc11222 = bzhe2.f170041i;
                size5 = bxwc11222.size();
                i5 = 0;
                while (i5 < size5) {
                }
                bngx a7222 = j6222.mo67664a();
                if (bzhe2.f170039g.size() > 0) {
                }
                bmvz3 = bmvz.f131120a;
                bmxv = bmxv.m108566b(new thj(bmvz, bmvz2, bmxv6, a2222, a3222, a4222, a5222, a6222, a7222, bmvz3));
            } else {
                bmxv = bmvz.f131120a;
            }
            tfg.mo2511a(bmxv);
            aqpw.f86533D.mo2511a(bmxv.m108567c(aqqw2.f86635k));
            aqpw.f86532C.mo2511a(bmxv.m108567c(aqqw2.f86634j));
            thv thv = new thv(null);
            bmxv c5 = bmxv.m108567c(aqpw.f86549i);
            if (c5 != null) {
                thv.f46052c = c5;
                bmxv c6 = bmxv.m108567c(aqpw.f86550j);
                if (c6 != null) {
                    thv.f46053d = c6;
                    tht tht = new tht(null);
                    bmxv c7 = bmxv.m108567c(aqpw.f86549i);
                    if (c7 != null) {
                        tht.f46048c = c7;
                        bmxv c8 = bmxv.m108567c(aqpw.f86550j);
                        if (c8 != null) {
                            tht.f46049d = c8;
                            if (aqqw.mo48087c()) {
                                thv.f46051b = bmxv.m108566b(aqqw2.f86628d.f170198j);
                                tht.f46047b = bmxv.m108566b(aqqw2.f86628d.f170198j);
                            }
                            tgd tgd = aqpw.f86566z;
                            if (aqqw.mo48086b()) {
                                bzih bzih = aqqw2.f86627c;
                                bngs j8 = bngx.m109377j();
                                bxwc bxwc12 = bzih.f170181a;
                                int size7 = bxwc12.size();
                                for (int i8 = 0; i8 < size7; i8++) {
                                    bzif bzif = (bzif) bxwc12.get(i8);
                                    if (bzif.f170170b.isEmpty()) {
                                        bzig bzig = bzif.f170171c;
                                        if (bzig == null) {
                                            bzig = bzig.f170175b;
                                        }
                                        if (bzig.f170177a.isEmpty()) {
                                        }
                                    }
                                    j8.mo67668c(bzif);
                                }
                                bngx a8 = j8.mo67664a();
                                if (a8 != null) {
                                    thv.f46050a = a8;
                                    String str7 = thv.f46050a == null ? " posts" : str3;
                                    if (!str7.isEmpty()) {
                                        throw new IllegalStateException(str7.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str7));
                                    }
                                    bmxv2 = bmxv.m108566b(new thn(thv.f46050a, thv.f46051b, thv.f46052c, thv.f46053d));
                                } else {
                                    throw new NullPointerException("Null posts");
                                }
                            } else {
                                bmxv2 = bmvz.f131120a;
                            }
                            tgd.mo2511a(bmxv2);
                            if (!cgoi.m146341b()) {
                                tfy tfy = aqpw.f86565y;
                                if (!aqqw.mo48089e()) {
                                    bmxv5 = bmvz.f131120a;
                                } else {
                                    bzjl bzjl = aqqw2.f86632h;
                                    if (bzjl != null) {
                                        tht.f46046a = bzjl;
                                        if (tht.f46046a == null) {
                                            str3 = " relatedPhotosCard";
                                        }
                                        if (!str3.isEmpty()) {
                                            throw new IllegalStateException(str3.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str3));
                                        }
                                        bmxv5 = bmxv.m108566b(new thm(tht.f46046a, tht.f46047b, tht.f46048c, tht.f46049d));
                                    } else {
                                        throw new NullPointerException("Null relatedPhotosCard");
                                    }
                                }
                                tfy.mo2511a(bmxv5);
                            }
                            if (!cgof.m146336b()) {
                                tgl tgl = aqpw.f86531B;
                                if (!aqqw.mo48088d() || (a = bzjg.m125847a(aqqw2.f86631g.f170287b)) == 0 || a != 2) {
                                    bmxv4 = bmvz.f131120a;
                                } else {
                                    bmxv4 = bmxv.m108566b(aqqw2.f86631g);
                                }
                                tgl.mo2511a(bmxv4);
                            }
                            tgr tgr = aqpw.f86534E;
                            if (aqqw.mo48090f()) {
                                bmxv3 = bmxv.m108566b(aqqw2.f86633i);
                            } else {
                                bmxv3 = bmvz.f131120a;
                            }
                            tgr.mo2511a(bmxv3);
                        } else {
                            throw new NullPointerException("Null viewerPageId");
                        }
                    } else {
                        throw new NullPointerException("Null viewerAccountName");
                    }
                } else {
                    throw new NullPointerException("Null viewerPageId");
                }
            } else {
                throw new NullPointerException("Null viewerAccountName");
            }
        }
        if (!aqpw.f86556p) {
            if (!cgnz.m146325b()) {
                if (aqqw.mo48087c() && aqqw2.f86628d.f170193e) {
                    aqpw.mo48050b();
                }
                if (cgoo.f187401a.mo6606a().mo84189d() && aqqw.mo48090f()) {
                    BaseCardView baseCardView = (BaseCardView) LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.card, aqpw.f86543c, false);
                    aqpw.f86545e.add(new aqud(aqpw.f86552l, aqpw.f86541a, baseCardView, aqqw2.f86633i, aqpw.f86548h, aqpw.f86551k, aqpw.f86553m, aqpw.f86555o));
                    aqpw.f86561u.mo48058a(baseCardView, tin.m37041a(tio.REPORTING_CHAIN_CARD));
                }
                if (aqqw.mo48085a()) {
                    BaseCardView baseCardView2 = (BaseCardView) LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.card, aqpw.f86543c, false);
                    aqpw.f86545e.add(new aqtb(aqpw.f86541a, baseCardView2, aqqw2.f86625a, aqpw.f86548h, aqpw.f86553m, aqpw.f86555o));
                    aqpw.f86561u.mo48058a(baseCardView2, tin.m37041a(tio.SMART_PROFILE_ABOUT_CARD));
                }
                if (aqqw2.f86635k != null) {
                    BaseCardView baseCardView3 = (BaseCardView) LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.card, aqpw.f86543c, false);
                    aqpw.f86545e.add(new aqtl(aqpw.f86541a, baseCardView3, aqqw2.f86635k, aqpw.f86553m, aqpw.f86555o));
                    aqpw.f86561u.mo48058a(baseCardView3, tin.m37041a(tio.SMART_PROFILE_ORGANIZATIONS_CARD));
                }
                if (aqqw.mo48086b() && aqqw.mo48087c()) {
                    BaseCardView baseCardView4 = (BaseCardView) LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.card, aqpw.f86543c, false);
                    new aqts(aqpw.f86541a, baseCardView4, aqqw2.f86627c, aqpw.f86549i, aqpw.f86550j, aqqw2.f86628d.f170198j, aqpw.f86548h, aqpw.f86553m);
                    aqpw.f86561u.mo48058a(baseCardView4, tin.m37041a(tio.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD));
                }
                if (aqqw2.f86634j != null) {
                    BaseCardView baseCardView5 = (BaseCardView) LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.card, aqpw.f86543c, false);
                    new aquj(aqpw.f86541a, baseCardView5, aqqw2.f86634j, aqpw.f86548h, aqpw.f86553m);
                    aqpw.f86562v.mo48058a(baseCardView5, tin.m37041a(tio.SMART_PROFILE_CURRENT_LOCATION_CARD));
                }
                if (!cgoi.m146341b() && aqqw.mo48089e() && aqqw.mo48087c()) {
                    BaseCardView baseCardView6 = (BaseCardView) LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.card, aqpw.f86543c, false);
                    new aqto(aqpw.f86541a, baseCardView6, aqqw2.f86632h, aqpw.f86549i, aqpw.f86550j, aqqw2.f86628d.f170198j, aqpw.f86548h, aqpw.f86553m);
                    aqpw.f86562v.mo48058a(baseCardView6, tin.m37041a(tio.SMART_PROFILE_PHOTOS_CARD));
                }
                if (!cgof.m146336b() && aqqw.mo48088d()) {
                    bzjh bzjh = aqqw2.f86631g;
                    int a9 = bzjg.m125847a(bzjh.f170287b);
                    if (a9 != 0 && a9 == 2) {
                        BaseCardView baseCardView7 = (BaseCardView) LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.card, aqpw.f86543c, false);
                        new aqua(aqpw.f86552l, aqpw.f86541a, baseCardView7, bzjh, aqpw.f86548h, aqpw.f86551k, aqpw.f86553m);
                        aqpw.f86562v.mo48058a(baseCardView7, tin.m37041a(tio.SMART_PROFILE_PEOPLE_IN_COMMON_CARD));
                    }
                }
            }
            if (cgoo.f187401a.mo6606a().mo84188c() && (bzil = aqqw2.f86629e) != null) {
                bziv bziv = bzil.f170205b;
                if (bziv == null) {
                    bziv = bziv.f170244b;
                }
                if (bziv.f170246a.size() > 0) {
                    if (cgnz.m146325b()) {
                        view = LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.gm_merge_card, aqpw.f86543c, false);
                    } else {
                        view = LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.merge_card, aqpw.f86543c, false);
                    }
                    Context context = aqpw.f86541a;
                    bzil bzil2 = aqqw2.f86629e;
                    tie tie = aqpw.f86548h;
                    aqpu aqpu = new aqpu(aqpw);
                    aqrx aqrx = new aqrx(new aqwv(aqpw.f86552l.getSupportLoaderManager(), aqpw.f86542b, aqpw.f86541a));
                    aqsb aqsb = new aqsb(view, aqpw.f86541a);
                    Bundle bundle = aqpw.f86555o;
                    bziv bziv2 = bzil2.f170205b;
                    if (bziv2 == null) {
                        bziv2 = bziv.f170244b;
                    }
                    if (bziv2.f170246a.size() != 0) {
                        bziv bziv3 = bzil2.f170205b;
                        if (bziv3 == null) {
                            bziv3 = bziv.f170244b;
                        }
                        bziw = (bziw) bziv3.f170246a.get(0);
                    } else {
                        bziw = null;
                    }
                    aqsm aqsm = new aqsm(new aqsh(context, view, tie, bziw, aqpu), bziw, aqrx, aqsb);
                    aqsh aqsh = aqsm.f86700c;
                    if (aqsh.f86686d == null) {
                        aqsh.mo48128c();
                    } else {
                        aqsh.f86689g = (Button) aqsh.f86684b.findViewById(C0126R.C0129id.profile_merge_accept_button);
                        aqsh.f86690h = (Button) aqsh.f86684b.findViewById(C0126R.C0129id.profile_merge_dismiss_button);
                        aqsh.f86689g.setOnClickListener(new aqsc(aqsh));
                        aqsh.f86690h.setOnClickListener(new aqsd(aqsh));
                        aqsh.f86691i = aqsh.f86684b.findViewById(C0126R.C0129id.profile_merge_progress_bar);
                        aqsh.f86692j = aqsh.f86684b.findViewById(C0126R.C0129id.profile_merge_outer_container);
                        ViewGroup viewGroup = (ViewGroup) aqsh.f86684b.findViewById(C0126R.C0129id.profile_merge_container);
                        boolean b = cgnz.m146325b();
                        int i9 = C0126R.C0128layout.gm_merge_card_entry_row;
                        int i10 = C0126R.C0128layout.merge_card_entry_row;
                        if (b) {
                            linearLayout = (LinearLayout) LayoutInflater.from(aqsh.f86683a).inflate((int) C0126R.C0128layout.gm_merge_card_entry_row, (ViewGroup) null);
                        } else {
                            linearLayout = (LinearLayout) LayoutInflater.from(aqsh.f86683a).inflate((int) C0126R.C0128layout.merge_card_entry_row, (ViewGroup) null);
                        }
                        int childCount = linearLayout.getChildCount();
                        LinearLayout linearLayout2 = linearLayout;
                        int i11 = 0;
                        int i12 = 100;
                        while (i11 < aqsh.f86686d.f170250b.size()) {
                            if (i11 != 0) {
                                if (i11 % childCount == 0) {
                                    viewGroup.addView(linearLayout2);
                                    linearLayout2 = cgnz.m146325b() ? (LinearLayout) LayoutInflater.from(aqsh.f86683a).inflate(i9, (ViewGroup) null) : (LinearLayout) LayoutInflater.from(aqsh.f86683a).inflate(i10, (ViewGroup) null);
                                }
                            }
                            View childAt = linearLayout2.getChildAt(i11 % childCount);
                            bzit bzit = (bzit) aqsh.f86686d.f170250b.get(i11);
                            aqsf aqsf = new aqsf(aqsh, (ImageView) childAt.findViewById(C0126R.C0129id.profile_merge_entry_photo));
                            if ((bzit.f170235a & 16) == 0) {
                                str = cgnq.m146307b();
                            } else {
                                bziu bziu = bzit.f170239e;
                                if (bziu == null) {
                                    bziu = bziu.f170240b;
                                }
                                str = bziu.f170242a;
                            }
                            aqsh.f86685c.mo26557a(rzi.m34705a(str, aqsh.f86687e.getDimensionPixelSize(C0126R.dimen.profile_card_merge_avatar_diameter)), i12, new aqse(aqsf));
                            if ((bzit.f170235a & 2) != 0) {
                                TextView textView = (TextView) childAt.findViewById(C0126R.C0129id.profile_merge_entry_name);
                                bziu bziu2 = bzit.f170236b;
                                if (bziu2 == null) {
                                    bziu2 = bziu.f170240b;
                                }
                                textView.setText(bziu2.f170242a);
                                textView.setVisibility(0);
                            }
                            ViewGroup viewGroup2 = (ViewGroup) childAt.findViewById(C0126R.C0129id.profile_merge_subentries_container);
                            bxwc bxwc13 = bzit.f170238d;
                            int size8 = bxwc13.size();
                            for (int i13 = 0; i13 < size8; i13++) {
                                aqsh.mo48126a(viewGroup2, ((bziu) bxwc13.get(i13)).f170242a);
                            }
                            bxwc bxwc14 = bzit.f170237c;
                            int size9 = bxwc14.size();
                            for (int i14 = 0; i14 < size9; i14++) {
                                aqsh.mo48126a(viewGroup2, ((bziu) bxwc14.get(i14)).f170242a);
                            }
                            i12++;
                            i11++;
                            i9 = C0126R.C0128layout.gm_merge_card_entry_row;
                            i10 = C0126R.C0128layout.merge_card_entry_row;
                        }
                        viewGroup.addView(linearLayout2);
                    }
                    boolean z = bundle != null && bundle.getBoolean("mergeCardHasDismissed");
                    aqsm.f86699b = z;
                    if (z) {
                        aqsm.f86700c.mo48128c();
                    }
                    aqpw.f86558r = aqsm;
                    aqpw.f86558r.f86702e.add(aqpw);
                    aqpw.f86545e.add(aqpw.f86558r);
                    if (!aqpw.f86558r.f86699b) {
                        aqpw.f86563w.mo48058a(view, tin.m37041a(tio.SMART_PROFILE_MERGE_CARD));
                    }
                }
            }
            aqpw.f86556p = true;
            aqpw.mo48051c();
        }
    }
}
