package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.measurement.module.Analytics;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import java.util.Locale;

/* renamed from: wae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wae extends aaab {

    /* renamed from: a */
    private final String f50341a;

    /* renamed from: b */
    private final ClientContext f50342b;

    /* renamed from: c */
    private final vzz f50343c;

    /* renamed from: d */
    private final int f50344d;

    /* renamed from: e */
    private Analytics f50345e = null;

    /* renamed from: f */
    private vzv f50346f = null;

    /* renamed from: g */
    private final brsm f50347g;

    /* renamed from: a */
    private static Bundle m41658a(wad wad, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        m41659a("dynamic_link_link_id", wad.f50334o, bundle2);
        m41659a("dynamic_link_link_name", wad.f50335p, bundle2);
        bundle2.putLong("dynamic_link_accept_time", wad.f50326g);
        return bundle2;
    }

    public wae(brsm brsm, String str, ClientContext clientContext, vzz vzz, int i) {
        super(131, "GetDynamicLink");
        this.f50347g = brsm;
        this.f50341a = str;
        this.f50342b = clientContext;
        this.f50343c = vzz;
        this.f50344d = i;
    }

    /* renamed from: a */
    private static void m41659a(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x076b  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0359  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        wad wad;
        Bundle bundle;
        int i;
        Analytics analytics;
        String str;
        bzex bzex;
        bzet bzet;
        String str2;
        vzx vzx;
        Context context2 = context;
        vzv vzv = this.f50346f;
        if (vzv == null) {
            vzv = new vzv(context.getApplicationContext());
        }
        this.f50346f = vzv;
        String str3 = this.f50342b.f30215e;
        rtj a = waa.m41648a(context2, str3);
        if (!a.contains("Existence Indicator") || !"Existence Indicator".equalsIgnoreCase(a.getString("Existence Indicator", null))) {
            if (!TextUtils.isEmpty(this.f50341a)) {
                Uri parse = Uri.parse(this.f50341a);
                if (!cdrt.f181617a.mo6606a().mo78226b() || "http".equals(parse.getScheme()) || "https".equals(parse.getScheme())) {
                    wad wad2 = new wad();
                    vzz vzz = this.f50343c;
                    ClientContext clientContext = this.f50342b;
                    String str4 = this.f50341a;
                    vzy vzy = vzz.f50310a;
                    String str5 = clientContext.f30215e;
                    bxvd da = bzes.f169712e.mo74144da();
                    try {
                        byte[] f = spn.getSHA1OfPackage(vzy.f50307a, str5);
                        if (f != null) {
                            bxvd da2 = bzex.f169737g.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bzex bzex2 = (bzex) da2.f164949b;
                            str5.getClass();
                            bzex2.f169739a |= 4;
                            bzex2.f169742d = str5;
                            String encodeToString = Base64.encodeToString(f, 2);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bzex bzex3 = (bzex) da2.f164949b;
                            encodeToString.getClass();
                            int i2 = bzex3.f169739a | 8;
                            bzex3.f169739a = i2;
                            bzex3.f169743e = encodeToString;
                            bzex3.f169740b = 1;
                            bzex3.f169739a = i2 | 1;
                            String language = Locale.getDefault().getLanguage();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bzex bzex4 = (bzex) da2.f164949b;
                            language.getClass();
                            bzex4.f169739a |= 32;
                            bzex4.f169744f = language;
                            bzex = (bzex) da2.mo74062i();
                        } else {
                            bzex = null;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("AppInviteAgent", "Caller Package Name not found", e);
                        bzex = null;
                    }
                    if (bzex == null) {
                        Log.e("AppInviteAgent", "Error creating ClientIdInfo");
                        bzet = null;
                    } else {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzes bzes = (bzes) da.f164949b;
                        bzex.getClass();
                        bzes.f169716b = bzex;
                        bzes.f169715a |= 1;
                        bxvd da3 = bzfx.f169887d.mo74144da();
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzfx bzfx = (bzfx) da3.f164949b;
                        str4.getClass();
                        int i3 = bzfx.f169889a | 2;
                        bzfx.f169889a = i3;
                        bzfx.f169891c = str4;
                        "".getClass();
                        bzfx.f169889a = i3 | 1;
                        bzfx.f169890b = "";
                        bzfx bzfx2 = (bzfx) da3.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzes bzes2 = (bzes) da.f164949b;
                        bzfx2.getClass();
                        bzes2.f169717c = bzfx2;
                        bzes2.f169715a |= 4;
                        bxvd da4 = bzev.f169732c.mo74144da();
                        rfi rfi = rfi.f42868a;
                        int j = rfy.m33553j(vzy.f50307a);
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzev bzev = (bzev) da4.f164949b;
                        bzev.f169734a |= 1;
                        bzev.f169735b = j;
                        bzev bzev2 = (bzev) da4.mo74062i();
                        bxvd da5 = bzgm.f169948c.mo74144da();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bzgm bzgm = (bzgm) da5.f164949b;
                        bzev2.getClass();
                        bzgm.f169951b = bzev2;
                        bzgm.f169950a |= 1;
                        bzgm bzgm2 = (bzgm) da5.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzes bzes3 = (bzes) da.f164949b;
                        bzgm2.getClass();
                        bzes3.f169718d = bzgm2;
                        bzes3.f169715a |= 8;
                        vzx = new vzx(vzy.f50308b, clientContext, bzes.f169713f, (bzes) da.mo74062i());
                        try {
                            vzw vzw = vzx.f50303a;
                            ClientContext clientContext2 = vzx.f50304b;
                            blcf blcf = vzx.f50305c;
                            String str6 = clientContext2.f30216f;
                            String h = spn.m35895h(vzw.f50302a.f44453i, str6);
                            vzx.f50306d = (blce) vzw.f50302a.mo25516a("/mutateonekey?alt=proto", blcf.serializeToBytes(), blce.f125910d, str6, h);
                            bzet = (bzet) vzx.mo29001a(bzet.f169720g);
                            blce blce = vzx.f50306d;
                            if (!(blce == null || (blce.f125912a & 2) == 0)) {
                                bxbg bxbg = blce.f125914c;
                                if (bxbg == null) {
                                    bxbg = bxbg.f161808c;
                                }
                                int i4 = bxbg.f161810a;
                                StringBuilder sb = new StringBuilder(55);
                                sb.append("Accept invitation failed due to error code: ");
                                sb.append(i4);
                                Log.e("AppInviteAgent", sb.toString());
                                bzet = null;
                            }
                        } catch (gid e2) {
                            Log.e("AppInviteAgent", "Authentication Failed ", e2);
                        } catch (VolleyError e3) {
                            String valueOf = String.valueOf(e3);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
                            sb2.append("Error communicating with server ");
                            sb2.append(valueOf);
                            Log.e("AppInviteAgent", sb2.toString());
                        } catch (Throwable th) {
                            bzet bzet2 = (bzet) vzx.mo29001a(bzet.f169720g);
                            throw th;
                        }
                    }
                    if (bzet == null) {
                        bzgd bzgd = bzet.f169723b;
                        if (bzgd == null) {
                            bzgd = bzgd.f169911g;
                        }
                        if ((bzgd.f169913a & 8) != 0) {
                            bzgd bzgd2 = bzet.f169723b;
                            if (bzgd2 == null) {
                                bzgd2 = bzgd.f169911g;
                            }
                            bzeu bzeu = bzgd2.f169917e;
                            if (bzeu == null) {
                                bzeu = bzeu.f169727d;
                            }
                            if ((bzeu.f169729a & 2) != 0) {
                                wad2.f50320a = bzeu.f169731c;
                            }
                            wad2.f50321b = bzgd2.f169915c;
                            if ((bzgd2.f169913a & 1) != 0) {
                                wad2.f50322c = Uri.parse(bzgd2.f169914b);
                            }
                            bzfh bzfh = bzet.f169725d;
                            if (bzfh == null) {
                                bzfh = bzfh.f169799l;
                            }
                            if (!((bzet.f169722a & 4) == 0 || (bzfh.f169801a & 32) == 0)) {
                                wad2.f50323d = bzfh.f169806f;
                                wad2.f50324e = bzfh.f169809i;
                                wad2.f50325f = bzfh.f169808h;
                                bzgt bzgt = bzfh.f169807g;
                                if (bzgt == null) {
                                    bzgt = bzgt.f169976d;
                                }
                                wad2.f50336q = bzgt.f169979b;
                                bzgt bzgt2 = bzfh.f169807g;
                                if (bzgt2 == null) {
                                    bzgt2 = bzgt.f169976d;
                                }
                                int a2 = bzgs.m125778a(bzgt2.f169978a);
                                if (a2 == 0) {
                                    a2 = 1;
                                }
                                wad2.f50340u = a2;
                                if (a2 == 2 || a2 == 3) {
                                    wad2.f50329j = bzfh.f169802b;
                                    wad2.f50331l = bzfh.f169804d;
                                    if (cbwa.m128706e()) {
                                        wad2.f50333n = bzfh.f169810j;
                                        wad2.f50332m = bzfh.f169811k;
                                    }
                                    wad2.f50330k = bzfh.f169803c;
                                    wad2.f50334o = bzfh.f169805e;
                                    bzgt bzgt3 = bzfh.f169807g;
                                    if (bzgt3 == null) {
                                        bzgt3 = bzgt.f169976d;
                                    }
                                    wad2.f50335p = bzgt3.f169980c;
                                }
                            }
                            bzft bzft = bzet.f169724c;
                            if (bzft == null) {
                                bzft = bzft.f169867c;
                            }
                            bzfm bzfm = bzft.f169870b;
                            if (bzfm == null) {
                                bzfm = bzfm.f169831c;
                            }
                            if (!bzfm.f169834b.isEmpty()) {
                                bzft bzft2 = bzet.f169724c;
                                if (bzft2 == null) {
                                    bzft2 = bzft.f169867c;
                                }
                                bzfm bzfm2 = bzft2.f169870b;
                                if (bzfm2 == null) {
                                    bzfm2 = bzfm.f169831c;
                                }
                                if (!((bzfn) bzfm2.f169834b.get(0)).f169843f.isEmpty()) {
                                    bzft bzft3 = bzet.f169724c;
                                    if (bzft3 == null) {
                                        bzft3 = bzft.f169867c;
                                    }
                                    bzfm bzfm3 = bzft3.f169870b;
                                    if (bzfm3 == null) {
                                        bzfm3 = bzfm.f169831c;
                                    }
                                    String str7 = ((bzfl) ((bzfn) bzfm3.f169834b.get(0)).f169843f.get(0)).f169829b;
                                    if ("Email".equals(str7)) {
                                        wad2.f50339t = 3;
                                    } else if ("Sms".equals(str7)) {
                                        wad2.f50339t = 4;
                                    }
                                }
                            }
                            wad2.f50327h = false;
                            wad2.f50328i = false;
                            if ((bzgd2.f169913a & 4) != 0) {
                                bzfx bzfx3 = bzgd2.f169916d;
                                if (bzfx3 == null) {
                                    bzfx3 = bzfx.f169887d;
                                }
                                str2 = bzfx3.f169890b;
                            } else {
                                str2 = null;
                            }
                            wad2.f50338s = str2;
                            wad = wad2;
                        } else {
                            wad = null;
                        }
                    } else {
                        wad = null;
                    }
                } else {
                    wad = null;
                }
            } else {
                wad = null;
            }
            if (wad == null) {
                this.f50347g.mo69837a(Status.f30107a, (DynamicLinkData) null);
                return;
            }
        } else {
            wad = new wad();
            wad.f50323d = waa.m41647a("appCode", context2, str3);
            wad.f50324e = waa.m41647a("domainUriPrefix", context2, str3);
            wad.f50325f = waa.m41647a("sessionId", context2, str3);
            wad.f50321b = waa.m41647a("deepLink", context2, str3);
            wad.f50326g = Long.valueOf(waa.m41648a(context2, str3).getLong("creationTimestamp", 0)).longValue();
            wad.f50320a = waa.m41650b("minVersionCode", context2, str3);
            wad.f50336q = waa.m41647a("requestedLink", context2, str3);
            wad.f50337r = waa.m41649a("scionInstallEvent", true, context2, str3);
            wad.f50328i = waa.m41649a("isNewInstall", false, context2, str3);
            wad.f50327h = waa.m41649a("isUpgradeInstall", false, context2, str3);
            wad.f50331l = waa.m41647a("scionCampaign", context2, str3);
            if (cbwa.m128706e()) {
                wad.f50333n = waa.m41647a("scionContent", context2, str3);
                wad.f50332m = waa.m41647a("scionTerm", context2, str3);
            }
            wad.f50329j = waa.m41647a("scionSource", context2, str3);
            wad.f50330k = waa.m41647a("scionMedium", context2, str3);
            wad.f50334o = waa.m41647a("scionLinkId", context2, str3);
            wad.f50335p = waa.m41647a("scionLinkName", context2, str3);
            int a3 = bojd.m111251a(waa.m41650b("invitationChannel", context2, str3));
            if (a3 == 0) {
                a3 = 1;
            }
            wad.f50339t = a3;
            wad.f50340u = bzgs.m125778a(waa.m41650b("requestedLinkType", context2, str3));
            wad.f50338s = waa.m41647a("invitationId", context2, str3);
            waa.m41652c("hasReturnedInvitation", context2, str3);
        }
        DynamicLinkData dynamicLinkData = new DynamicLinkData(this.f50341a, wad.f50321b, wad.f50320a, wad.f50326g, null, wad.f50322c);
        if (wad.f50338s != null) {
            Bundle a4 = dynamicLinkData.mo72425a();
            a4.putString("com.google.firebase.appinvite.fdl.extension.InvitationId", wad.f50338s);
            dynamicLinkData.f152585e = a4;
        }
        String str8 = "dynamic_link_app_open";
        if (!wad.f50337r || wad.f50331l == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            m41659a("source", wad.f50329j, bundle);
            m41659a("medium", wad.f50330k, bundle);
            m41659a("campaign", wad.f50331l, bundle);
            if (cbwa.m128706e()) {
                m41659a("content", wad.f50333n, bundle);
                m41659a("term", wad.f50332m, bundle);
            }
            if (cdrt.f181617a.mo6606a().mo78225a() && this.f50344d >= 11200000) {
                waa.m41651b(context2, str3);
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("_cmp", bundle);
                if (!wad.f50328i) {
                    str = str8;
                } else {
                    str = "dynamic_link_first_open";
                }
                bundle2.putBundle(str, m41658a(wad, bundle));
                if (wad.f50327h) {
                    bundle2.putBundle("dynamic_link_app_update", m41658a(wad, bundle));
                }
                Bundle a5 = dynamicLinkData.mo72425a();
                a5.putBundle("scionData", bundle2);
                dynamicLinkData.f152585e = a5;
                wad.f50337r = true;
            }
        }
        this.f50347g.mo69837a(Status.f30107a, dynamicLinkData);
        if (!wad.f50337r && wad.f50331l != null) {
            waa.m41651b(context2, str3);
            analytics = this.f50345e;
            if (analytics == null) {
                analytics = Analytics.getInstance(context);
            }
            this.f50345e = analytics;
            analytics.mo44018a("fdl", "_cmp", bundle, str3);
            Bundle a6 = m41658a(wad, bundle);
            Analytics analytics2 = this.f50345e;
            if (wad.f50328i) {
                str8 = "dynamic_link_first_open";
            }
            analytics2.mo44018a("fdl", str8, a6, str3);
            if (wad.f50327h) {
                this.f50345e.mo44018a("fdl", "dynamic_link_app_update", a6, str3);
            }
        }
        vzv vzv2 = this.f50346f;
        int i5 = wad.f50339t;
        boolean z = wad.f50328i;
        boolean z2 = wad.f50327h;
        String str9 = wad.f50336q;
        int i6 = wad.f50340u;
        String str10 = wad.f50323d;
        String str11 = wad.f50324e;
        String str12 = wad.f50325f;
        bxvd da6 = boiu.f133232f.mo74144da();
        if (!TextUtils.isEmpty(str3)) {
            bxvd da7 = boje.f133263c.mo74144da();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            boje boje = (boje) da7.f164949b;
            str3.getClass();
            boje.f133265a |= 2;
            boje.f133266b = str3;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            boiu boiu = (boiu) da6.f164949b;
            boje boje2 = (boje) da7.mo74062i();
            boje2.getClass();
            boiu.f133235b = boje2;
            boiu.f133234a |= 1;
        }
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        boiu boiu2 = (boiu) da6.f164949b;
        int i7 = i5 - 1;
        if (i5 == 0) {
            boiu2.f133236c = i7;
            boiu2.f133234a |= 2;
            if (!TextUtils.isEmpty(str10) || !TextUtils.isEmpty(str11)) {
                bxvd da8 = boiz.f133248g.mo74144da();
                if (!TextUtils.isEmpty(str10)) {
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    boiz boiz = (boiz) da8.f164949b;
                    str10.getClass();
                    boiz.f133250a |= 1;
                    boiz.f133251b = str10;
                }
                if (!TextUtils.isEmpty(str11)) {
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    boiz boiz2 = (boiz) da8.f164949b;
                    str11.getClass();
                    boiz2.f133250a |= 64;
                    boiz2.f133255f = str11;
                }
                if (str9 != null) {
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    boiz boiz3 = (boiz) da8.f164949b;
                    str9.getClass();
                    boiz3.f133250a |= 2;
                    boiz3.f133252c = str9;
                }
                if (i6 != 0) {
                    int i8 = i6 - 1;
                    int i9 = i8 != 0 ? i8 != 1 ? i8 != 2 ? 2 : 3 : 4 : 1;
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    boiz boiz4 = (boiz) da8.f164949b;
                    boiz4.f133253d = i9 - 1;
                    boiz4.f133250a |= 4;
                }
                if (!TextUtils.isEmpty("")) {
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    boiz boiz5 = (boiz) da8.f164949b;
                    "".getClass();
                    boiz5.f133250a |= 16;
                    boiz5.f133254e = "";
                }
                boiz boiz6 = (boiz) da8.mo74062i();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                boiu boiu3 = (boiu) da6.f164949b;
                boiz6.getClass();
                boiu3.f133237d = boiz6;
                boiu3.f133234a |= 4;
            }
            if (z2) {
                i = 3;
            } else {
                i = z ? 4 : 2;
            }
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            boiu boiu4 = (boiu) da6.f164949b;
            boiu4.f133238e = i - 1;
            boiu4.f133234a |= 8;
            boiu boiu5 = (boiu) da6.mo74062i();
            if (vzv.f50300a && boiu5 != null) {
                bxvd da9 = boir.f133211o.mo74144da();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                boir boir = (boir) da9.f164949b;
                boir.f133215c = 11;
                int i10 = boir.f133213a | 2;
                boir.f133213a = i10;
                boiu5.getClass();
                boir.f133226n = boiu5;
                int i11 = i10 | 4096;
                boir.f133213a = i11;
                if (str12 != null) {
                    str12.getClass();
                    boir.f133213a = i11 | 1;
                    boir.f133214b = str12;
                }
                qwo a7 = vzv2.f50301b.mo24335a(((boir) da9.mo74062i()).serializeToBytes());
                a7.mo24328b(11);
                a7.mo24327b();
            }
            SharedPreferences.Editor edit = waa.m41648a(context2, str3).edit();
            edit.clear();
            edit.commit();
            return;
        }
        throw null;
        bzet bzet3 = (bzet) vzx.mo29001a(bzet.f169720g);
        bzet = null;
        if (bzet == null) {
        }
        if (wad == null) {
        }
        DynamicLinkData dynamicLinkData2 = new DynamicLinkData(this.f50341a, wad.f50321b, wad.f50320a, wad.f50326g, null, wad.f50322c);
        if (wad.f50338s != null) {
        }
        String str82 = "dynamic_link_app_open";
        if (!wad.f50337r) {
        }
        bundle = null;
        this.f50347g.mo69837a(Status.f30107a, dynamicLinkData2);
        waa.m41651b(context2, str3);
        analytics = this.f50345e;
        if (analytics == null) {
        }
        this.f50345e = analytics;
        analytics.mo44018a("fdl", "_cmp", bundle, str3);
        Bundle a62 = m41658a(wad, bundle);
        Analytics analytics22 = this.f50345e;
        if (wad.f50328i) {
        }
        analytics22.mo44018a("fdl", str82, a62, str3);
        if (wad.f50327h) {
        }
        vzv vzv22 = this.f50346f;
        int i52 = wad.f50339t;
        boolean z3 = wad.f50328i;
        boolean z22 = wad.f50327h;
        String str92 = wad.f50336q;
        int i62 = wad.f50340u;
        String str102 = wad.f50323d;
        String str112 = wad.f50324e;
        String str122 = wad.f50325f;
        bxvd da62 = boiu.f133232f.mo74144da();
        if (!TextUtils.isEmpty(str3)) {
        }
        if (da62.f164950c) {
        }
        boiu boiu22 = (boiu) da62.f164949b;
        int i72 = i52 - 1;
        if (i52 == 0) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f50347g.mo69837a(status, (DynamicLinkData) null);
    }
}
