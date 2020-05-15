package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.Route;
import com.google.android.gms.instantapps.internal.RoutingOptions;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Set;
import java.util.regex.Matcher;

/* renamed from: adkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adkd {

    /* renamed from: a */
    private static final adfs f61978a = new adfs("UrlRouter");

    /* renamed from: b */
    private static final adke f61979b = new adke(0, null, 0, 0, null, null, null, null, 1, false);

    /* renamed from: c */
    private static final adke f61980c = new adke(0, null, 0, 0, null, null, null, null, 2, false);

    /* renamed from: d */
    private final Context f61981d;

    /* renamed from: e */
    private final adje f61982e;

    /* renamed from: f */
    private final adik f61983f;

    /* renamed from: g */
    private final adkr f61984g;

    /* renamed from: h */
    private final adkn f61985h;

    /* renamed from: i */
    private final adim f61986i;

    /* renamed from: j */
    private final adfd f61987j;

    /* renamed from: k */
    private final adfm f61988k;

    /* renamed from: l */
    private final adjy f61989l;

    /* renamed from: m */
    private final int f61990m;

    /* renamed from: n */
    private final adem f61991n;

    /* renamed from: o */
    private final adjm f61992o;

    public adkd(Context context, adje adje, adik adik, adkr adkr, adkn adkn, adim adim, adfd adfd, adfm adfm, int i, adjy adjy, adem adem, adjm adjm) {
        this.f61981d = context;
        this.f61982e = adje;
        this.f61983f = adik;
        this.f61984g = adkr;
        this.f61985h = adkn;
        this.f61986i = adim;
        this.f61987j = adfd;
        this.f61988k = adfm;
        this.f61990m = i;
        this.f61989l = adjy;
        this.f61991n = adem;
        this.f61992o = adjm;
    }

    /* renamed from: a */
    private static Route m50684a(AppInfo appInfo, Uri uri) {
        for (Route route : appInfo.f79144c) {
            String str = route.f79189a;
            int i = route.f79190b;
            String str2 = route.f79191c;
            String str3 = route.f79192d;
            String str4 = route.f79193e;
            if (adle.m50789a(str, i, str2, str3, str4, str4, uri)) {
                return route;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022a, code lost:
        if (p000.adfr.m50318a(r1.f61981d, p000.adkd.f61978a) != false) goto L_0x024d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ee  */
    /* renamed from: b */
    private final adke m50685b(String str, boolean z, RoutingOptions routingOptions, adkz adkz, boolean z2) {
        adkb adkb;
        int i;
        adkc adkc;
        int i2;
        String str2;
        adka adka;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        boolean z6;
        adka adka2;
        Route route;
        AppInfo appInfo;
        adkb adkb2;
        int i6;
        adlf adlf;
        int i7;
        int i8;
        String str3;
        String str4 = str;
        RoutingOptions routingOptions2 = routingOptions;
        adkz adkz2 = adkz;
        adfb a = this.f61987j.mo33411a();
        int i9 = 2;
        if (z2) {
            try {
                adjm adjm = this.f61992o;
                adje adje = this.f61982e;
                adfm adfm = this.f61988k;
                if (ceqj.m137858b()) {
                    Uri parse = Uri.parse(str);
                    if (parse == null || TextUtils.isEmpty(parse.getHost())) {
                        throw new IllegalArgumentException("invalid url to fetch intent filters.");
                    }
                    byte[][] a2 = adla.m50784a(parse.getHost(), 5);
                    ArrayList<Integer> arrayList = new ArrayList();
                    int length = a2.length;
                    int i10 = 0;
                    while (i10 < length) {
                        arrayList.add(Integer.valueOf(ByteBuffer.wrap(a2[i10]).asIntBuffer().get(0) & -4096));
                        i10++;
                        i9 = 2;
                    }
                    Object[] objArr = new Object[i9];
                    objArr[0] = parse.getHost();
                    objArr[1] = TextUtils.join(",", arrayList);
                    C1225nr nrVar = new C1225nr();
                    C1225nr nrVar2 = new C1225nr();
                    for (Integer num : arrayList) {
                        int intValue = num.intValue();
                        bmxv a3 = adjm.mo33587a(intValue);
                        if (a3.mo66813a()) {
                            if (((Set) a3.mo66814b()).isEmpty()) {
                                nrVar.add(Integer.valueOf(intValue));
                            } else {
                                nrVar2.add(Integer.valueOf(intValue));
                            }
                        }
                    }
                    if (!nrVar.isEmpty() || !nrVar2.isEmpty()) {
                        if (!nrVar2.isEmpty()) {
                            a.mo33409a("SecondPhaseIntentFilterFetcher.possibleFirstPhaseMatchWithFullUrl");
                        }
                        if (!nrVar.isEmpty()) {
                            a.mo33409a("SecondPhaseIntentFilterFetcher.secondPhaseMatchWithFullUrl");
                        }
                        adfm.mo33419b(nrVar2.f26758b, nrVar.f26758b);
                        adjz.m50680a(nrVar, nrVar2, adje);
                    } else {
                        a.mo33409a("SecondPhaseIntentFilterFetcher.noMatchWithFullUrl");
                    }
                }
            } catch (Exception e) {
                adfu.m50331a(this.f61981d, "Error in scheduling GetIntentFilters.", e, f61978a);
            }
        }
        String str5 = routingOptions2.f79197b;
        if (str5 == null) {
            if (!ceqg.m137853b()) {
                i6 = 0;
            } else if (!adlg.m50790a(str)) {
                i6 = 0;
            } else {
                if (!TextUtils.isEmpty(str)) {
                    Matcher matcher = adlg.f62104a.matcher(str4);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        try {
                            i7 = Integer.parseInt(matcher.group(2));
                        } catch (NumberFormatException e2) {
                            i7 = 0;
                        }
                        try {
                            i8 = Integer.parseInt(matcher.group(3));
                        } catch (NumberFormatException e3) {
                            i8 = 0;
                        }
                        String group2 = matcher.group(4);
                        if (!"-".equals(group2)) {
                            str3 = group2;
                        } else {
                            str3 = "";
                        }
                        adlf = new adlf(str, group, i7, i8, str3, matcher.group(5));
                        adkb2 = adkb.m50682a(adlf.f62099b, adlf.f62100c, adlf.f62101d, adlf.f62102e, adlf.f62103f);
                    }
                }
                adlf = null;
                adkb2 = adkb.m50682a(adlf.f62099b, adlf.f62100c, adlf.f62101d, adlf.f62102e, adlf.f62103f);
            }
            adkz2.mo33627a(1410);
            adjh a4 = this.f61982e.mo33560a(str4, z);
            adkz2.mo33627a(1411);
            int i11 = a4.f61904a;
            Object[] objArr2 = new Object[2];
            objArr2[i6] = Integer.valueOf(i11);
            objArr2[1] = str4;
            if (i11 == 2) {
                if (!routingOptions2.f79199d) {
                    f61978a.mo33429c("No match in domain filter due to mobile holdback", new Object[i6]);
                    this.f61988k.mo26009a(i6);
                    adkb = new adkb(2, null, 0, 0, null, null);
                    i = adkb.f61970a;
                    if (i != 2) {
                        a.mo33409a("UrlRouter.holdback");
                        return f61980c;
                    } else if (i != 1) {
                        String str6 = adkb.f61971b;
                        int i12 = adkb.f61972c;
                        int i13 = adkb.f61973d;
                        String str7 = adkb.f61974e;
                        if (routingOptions2.f79198c) {
                            adkc = adkc.m50683a(1);
                        } else {
                            int a5 = this.f61984g.mo33606a();
                            if (!(a5 == 1 || a5 == 2)) {
                                if (a5 == 3) {
                                    try {
                                        if (cepl.f183185a.mo6606a().mo79530a()) {
                                            if (this.f61990m == 0) {
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException e4) {
                                    }
                                }
                                Account[] d = this.f61985h.mo33604d();
                                if (d == null || d.length == 0) {
                                    this.f61988k.mo26009a(2);
                                } else {
                                    this.f61988k.mo26009a(1);
                                }
                                adkc = new adkc(a5, true);
                            }
                            adkc = adkc.m50683a(a5);
                        }
                        if (!adkc.f61977b) {
                            if (routingOptions2.f79201f) {
                                adka = new adka(true, null, null, null);
                                i2 = i13;
                                str2 = str7;
                            } else {
                                int i14 = adkc.f61976a;
                                boolean a6 = this.f61989l.mo33596a();
                                if (i14 == 1) {
                                    adks i15 = adkt.m50759i();
                                    i15.mo33612a(adkb.f61971b);
                                    i15.mo33614b(adkb.f61972c);
                                    i15.mo33611a(adkb.f61973d);
                                    i15.f62074a = adkz2;
                                    i15.mo33615b(!routingOptions2.f79202g);
                                    if (ceqg.m137853b()) {
                                        i15.f62076c = adkb.f61975f;
                                        i15.f62075b = adkb.f61974e;
                                        i15.mo33613a(adlg.m50790a(str));
                                    }
                                    adkt a7 = i15.mo33610a();
                                    if (routingOptions2.f79196a && a6) {
                                        adkz2.mo33627a(1412);
                                        adfb a8 = this.f61987j.mo33411a();
                                        appInfo = this.f61986i.mo33552a(a7);
                                        a8.mo33409a("UrlRouter.getAppInfo");
                                        adkz2.mo33627a(1413);
                                        if (appInfo == null) {
                                            f61978a.mo33426b("Url resolved to instant app, but no app info is available", new Object[0]);
                                            this.f61988k.mo26009a(6);
                                            a.mo33409a("UrlRouter.noAppInfo");
                                            adka2 = adka.m50681a();
                                            i2 = i13;
                                            str2 = str7;
                                            if (!adka2.f61966a) {
                                                return f61979b;
                                            }
                                            adka = adka2;
                                        } else {
                                            i2 = i13;
                                            str2 = str7;
                                        }
                                    } else {
                                        adfb a9 = this.f61987j.mo33411a();
                                        adim adim = this.f61986i;
                                        str2 = str7;
                                        i2 = i13;
                                        appInfo = adim.mo33553a(a7, adkx.m50779a(adim.f61817a), adim.f61817a.getResources().getDisplayMetrics().densityDpi);
                                        a9.mo33409a("UrlRouter.getAppInfoFromCache");
                                        if (appInfo == null && !a6) {
                                            f61978a.mo33426b("Unable to launch: disallowed network", new Object[0]);
                                            adkz2.mo33627a(1428);
                                            this.f61988k.mo26009a(19);
                                            a.mo33409a("UrlRouter.disallowedNetwork");
                                            adka2 = adka.m50681a();
                                            if (!adka2.f61966a) {
                                            }
                                        }
                                    }
                                    if (this.f61990m != 0) {
                                        route = null;
                                    } else if (appInfo != null) {
                                        route = m50684a(appInfo, Uri.parse(str));
                                        if (route == null) {
                                            f61978a.mo33429c("Path didn't match for instant app %s", adkb.f61971b);
                                            this.f61988k.mo26009a(7);
                                            a.mo33409a("UrlRouter.noPathMatch");
                                            adka2 = adka.m50681a();
                                            if (!adka2.f61966a) {
                                            }
                                        }
                                    } else {
                                        route = null;
                                    }
                                } else {
                                    i2 = i13;
                                    str2 = str7;
                                    if (!a6) {
                                        adkz2.mo33627a(1428);
                                        this.f61988k.mo26009a(19);
                                        a.mo33409a("UrlRouter.disallowedNetwork");
                                        adka2 = adka.m50681a();
                                        if (!adka2.f61966a) {
                                        }
                                    } else {
                                        appInfo = null;
                                        route = null;
                                    }
                                }
                                try {
                                    adka2 = new adka(true, appInfo, route, this.f61982e.mo33566b(adkb.f61971b));
                                } catch (IOException e5) {
                                    Context context = this.f61981d;
                                    String valueOf = String.valueOf(adkb.f61971b);
                                    adfu.m50331a(context, valueOf.length() == 0 ? new String("Unable to fetch domain filter metadata for ") : "Unable to fetch domain filter metadata for ".concat(valueOf), e5, f61978a);
                                    this.f61988k.mo26009a(14);
                                    adka2 = adka.m50681a();
                                }
                                if (!adka2.f61966a) {
                                }
                            }
                            adkz2.mo33627a(1416);
                            boolean a10 = adjk.m50642a(this.f61981d.getPackageManager(), str6);
                            adkz2.mo33627a(1417);
                            if (!a10) {
                                if (routingOptions2.f79200e) {
                                    z3 = false;
                                } else if (str6 != null) {
                                    try {
                                        z6 = this.f61983f.mo33539g(str6);
                                        if (z6) {
                                            try {
                                                new Object[1][0] = str6;
                                            } catch (IOException e6) {
                                                e = e6;
                                            }
                                        }
                                        z3 = z6;
                                    } catch (IOException e7) {
                                        e = e7;
                                        z6 = false;
                                        f61978a.mo33425a(e, "getUserPrefersBrowser", new Object[0]);
                                        z3 = z6;
                                        if (!z3) {
                                        }
                                        if (this.f61990m != 0) {
                                        }
                                        if (this.f61990m == 1) {
                                            if (!z5) {
                                                f61978a.mo33426b("Target destination: Reinstall Runtime", new Object[0]);
                                                this.f61988k.mo26009a(11);
                                                a.mo33409a("UrlRouter.reinstallRuntime");
                                                return new adke(3, null, 0, 0, null, null, null, null, z3 ? 0 : 3, false);
                                            }
                                            f61978a.mo33426b("Target destination: Unavailable Runtime", new Object[0]);
                                            this.f61988k.mo26009a(5);
                                            a.mo33409a("UrlRouter.noRuntime");
                                            return new adke(4, null, 0, 0, null, null, null, null, 1, false);
                                        }
                                        i3 = adkc.f61976a;
                                        if (i3 != 1) {
                                        }
                                    }
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    this.f61988k.mo26009a(3);
                                }
                                if (this.f61990m != 0) {
                                    try {
                                        adkz2.mo33627a(1418);
                                        boolean a11 = adfr.m50318a(this.f61981d, f61978a);
                                        if (!a11 || !adfo.m50310a(this.f61981d, adfo.m50309a(str4, null, 0))) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        if (!z4) {
                                            f61978a.mo33426b("Unable to launch supervisor, compatible = %s", Boolean.valueOf(a11));
                                        }
                                        adkz2.mo33627a(1419);
                                        z5 = true;
                                    } catch (PackageManager.NameNotFoundException e8) {
                                        z5 = false;
                                        z4 = false;
                                    }
                                } else {
                                    z5 = false;
                                    z4 = false;
                                }
                                if (this.f61990m == 1 || z4) {
                                    i3 = adkc.f61976a;
                                    if (i3 != 1) {
                                        this.f61988k.mo26009a(9);
                                        a.mo33409a("UrlRouter.instantApp");
                                        return adke.m50687a(str6, i12, i2, str2, adka.f61969d, adka.f61967b, adka.f61968c, z3);
                                    } else if (i3 != 2) {
                                        f61978a.mo33423a("Target destination: Opt-In Interception", new Object[0]);
                                        this.f61988k.mo26009a(12);
                                        a.mo33409a("UrlRouter.optInIntercept");
                                        byte[] bArr = adka.f61969d;
                                        if (!z3) {
                                            i5 = 0;
                                        } else {
                                            i5 = 3;
                                        }
                                        return new adke(0, str6, i12, i2, str2, bArr, null, null, i5, true);
                                    } else {
                                        f61978a.mo33423a("Target destination: Opt-in", new Object[0]);
                                        this.f61988k.mo26009a(10);
                                        a.mo33409a("UrlRouter.optIn");
                                        byte[] bArr2 = adka.f61969d;
                                        if (!z3) {
                                            i4 = 0;
                                        } else {
                                            i4 = 3;
                                        }
                                        return new adke(1, str6, i12, i2, str2, bArr2, null, null, i4, false);
                                    }
                                } else if (!z5 && ceqa.f183249a.mo6606a().mo79576a()) {
                                    f61978a.mo33426b("Target destination: Reinstall Runtime", new Object[0]);
                                    this.f61988k.mo26009a(11);
                                    a.mo33409a("UrlRouter.reinstallRuntime");
                                    return new adke(3, null, 0, 0, null, null, null, null, z3 ? 0 : 3, false);
                                } else {
                                    f61978a.mo33426b("Target destination: Unavailable Runtime", new Object[0]);
                                    this.f61988k.mo26009a(5);
                                    a.mo33409a("UrlRouter.noRuntime");
                                    return new adke(4, null, 0, 0, null, null, null, null, 1, false);
                                }
                            } else {
                                f61978a.mo33429c("Installed app present: %s", str6);
                                this.f61988k.mo26009a(8);
                                a.mo33409a("UrlRouter.appInstalled");
                                return f61979b;
                            }
                        } else {
                            a.mo33409a("UrlRouter.notOptedIn");
                            return f61979b;
                        }
                    } else {
                        a.mo33409a("UrlRouter.noMatch");
                        return f61979b;
                    }
                }
            } else if (i11 != 0) {
                adkb = new adkb(1, null, 0, 0, null, null);
                i = adkb.f61970a;
                if (i != 2) {
                }
            }
            adkb = adkb.m50682a(a4.mo33577a(), a4.mo33578b(), a4.mo33579c(), a4.mo33580d(), null);
            i = adkb.f61970a;
            if (i != 2) {
            }
        } else {
            adkb2 = adkb.m50682a(str5, 0, 0, "", null);
        }
        adkb = adkb2;
        i = adkb.f61970a;
        if (i != 2) {
        }
    }

    /* renamed from: a */
    public final adke mo33597a(String str, boolean z, RoutingOptions routingOptions, adkz adkz, boolean z2) {
        AppInfo appInfo;
        Route route;
        if (!cepl.f183185a.mo6606a().mo79528L() || !this.f61991n.mo33394a()) {
            return m50685b(str, z, routingOptions, adkz, z2);
        }
        adjh a = this.f61982e.mo33560a(str, z);
        if (!a.f61905b) {
            return m50685b(str, z, routingOptions, adkz, z2);
        }
        String a2 = a.mo33577a();
        int b = a.mo33578b();
        int c = a.mo33579c();
        if (routingOptions.f79196a) {
            adks i = adkt.m50759i();
            i.mo33612a(a2);
            i.mo33614b(b);
            i.mo33611a(c);
            i.f62074a = adkz;
            i.mo33615b(!routingOptions.f79202g);
            AppInfo a3 = this.f61986i.mo33552a(i.mo33610a());
            if (a3 == null) {
                String valueOf = String.valueOf(a2);
                String str2 = valueOf.length() == 0 ? new String("No app info for sideloaded app ") : "No app info for sideloaded app ".concat(valueOf);
                adfu.m50331a(this.f61981d, str2, new IllegalStateException(str2), f61978a);
                this.f61988k.mo26009a(18);
                return f61979b;
            }
            appInfo = a3;
        } else {
            appInfo = null;
        }
        if (appInfo != null) {
            route = m50684a(appInfo, Uri.parse(str));
        } else {
            route = null;
        }
        this.f61988k.mo26009a(17);
        return adke.m50687a(a2, b, c, a.mo33580d(), new byte[0], appInfo, route, false);
    }
}
