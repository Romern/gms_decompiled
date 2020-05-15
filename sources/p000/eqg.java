package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: eqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eqg implements eqc {

    /* renamed from: d */
    private static final sek f15515d = ffw.m11631a("LocalResourceProducer");

    /* renamed from: a */
    public final ffk f15516a;

    /* renamed from: b */
    public final Context f15517b;

    /* renamed from: c */
    public final esx f15518c;

    /* renamed from: e */
    private final Resources f15519e = rpr.m34216b().getResources();

    /* renamed from: f */
    private final bmzi f15520f;

    /* renamed from: g */
    private final esq f15521g;

    public eqg(Context context, ffk ffk, esx esx) {
        eqd eqd = new eqd(context);
        this.f15516a = ffk;
        this.f15520f = eqd;
        this.f15517b = context;
        this.f15521g = new esq(context);
        this.f15518c = esx;
    }

    /* renamed from: a */
    private static bmxv m10962a(Resources resources, int i) {
        try {
            String string = resources.getString(i);
            return !bmxx.m108577a(string) ? bmxv.m108566b(string) : bmvz.f131120a;
        } catch (Resources.NotFoundException e) {
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    static bsxn m10968b(int i, int i2) {
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        int i3 = i - 1;
        if (bsxl.f164950c) {
            bsxl.mo74035c();
            bsxl.f164950c = false;
        }
        bsxn bsxn = (bsxn) bsxl.f164949b;
        bsxn.f147588a |= 1;
        bsxn.f147589b = i3;
        bsxl.mo70719a("screenFlavor", Integer.toString(i2));
        return (bsxn) bsxl.mo74062i();
    }

    /* renamed from: b */
    public static final boolean m10969b(int i) {
        return i == 2;
    }

    /* renamed from: c */
    static bsxn m10970c(int i) {
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        int i2 = i - 1;
        if (bsxl.f164950c) {
            bsxl.mo74035c();
            bsxl.f164950c = false;
        }
        bsxn bsxn = (bsxn) bsxl.f164949b;
        bsxn.f147588a |= 1;
        bsxn.f147589b = i2;
        return (bsxn) bsxl.mo74062i();
    }

    /* renamed from: d */
    static bsxn m10972d(int i, int i2) {
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        int i3 = i - 1;
        if (bsxl.f164950c) {
            bsxl.mo74035c();
            bsxl.f164950c = false;
        }
        bsxn bsxn = (bsxn) bsxl.f164949b;
        bsxn.f147588a |= 1;
        bsxn.f147589b = i3;
        bsxl.mo70719a("gmscoreSettingsItemId", Integer.toString(i2));
        return (bsxn) bsxl.mo74062i();
    }

    /* renamed from: a */
    static bsum m10963a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            bsum bsum = (bsum) bsuo.f147154j.mo74144da();
            if (parseUri.getComponent() != null) {
                String packageName = parseUri.getComponent().getPackageName();
                if (bsum.f164950c) {
                    bsum.mo74035c();
                    bsum.f164950c = false;
                }
                bsuo bsuo = (bsuo) bsum.f164949b;
                packageName.getClass();
                bsuo.f147156a = 1 | bsuo.f147156a;
                bsuo.f147157b = packageName;
                String className = parseUri.getComponent().getClassName();
                if (bsum.f164950c) {
                    bsum.mo74035c();
                    bsum.f164950c = false;
                }
                bsuo bsuo2 = (bsuo) bsum.f164949b;
                className.getClass();
                bsuo2.f147156a |= 2;
                bsuo2.f147158c = className;
            } else if (!bmxx.m108577a(parseUri.getPackage())) {
                String str2 = parseUri.getPackage();
                if (bsum.f164950c) {
                    bsum.mo74035c();
                    bsum.f164950c = false;
                }
                bsuo bsuo3 = (bsuo) bsum.f164949b;
                str2.getClass();
                bsuo3.f147156a = 1 | bsuo3.f147156a;
                bsuo3.f147157b = str2;
            }
            if (!bmxx.m108577a(parseUri.getAction())) {
                String action = parseUri.getAction();
                if (bsum.f164950c) {
                    bsum.mo74035c();
                    bsum.f164950c = false;
                }
                bsuo bsuo4 = (bsuo) bsum.f164949b;
                action.getClass();
                bsuo4.f147156a |= 4;
                bsuo4.f147159d = action;
            }
            return bsum;
        } catch (URISyntaxException e) {
            f15515d.mo25417e("Invalid intent", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    static bsxn m10971c(int i, int i2) {
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        int i3 = i - 1;
        if (bsxl.f164950c) {
            bsxl.mo74035c();
            bsxl.f164950c = false;
        }
        bsxn bsxn = (bsxn) bsxl.f164949b;
        bsxn.f147588a |= 1;
        bsxn.f147589b = i3;
        bsxl.mo70719a("gmscoreSettingsCategoryId", Integer.toString(i2));
        return (bsxn) bsxl.mo74062i();
    }

    /* renamed from: d */
    public final eqf mo10413d(bsxn bsxn) {
        eqe eqe = new eqe(bmvz.f131120a, bmvz.f131120a);
        if (!bmxx.m108577a(cbri.m128133c())) {
            try {
                Intent parseUri = Intent.parseUri(cbri.m128133c(), 1);
                bmxv bmxv = bmvz.f131120a;
                bmxv bmxv2 = bmvz.f131120a;
                PackageManager packageManager = this.f15517b.getPackageManager();
                ResolveInfo resolveActivity = packageManager.resolveActivity(parseUri, 128);
                if (!(resolveActivity == null || resolveActivity.activityInfo == null)) {
                    try {
                        Resources resourcesForApplication = packageManager.getResourcesForApplication(resolveActivity.activityInfo.packageName);
                        Bundle bundle = resolveActivity.activityInfo.metaData;
                        if (resourcesForApplication != null) {
                            if (bundle != null) {
                                bmxv = m10962a(resourcesForApplication, bundle.getInt("com.google.android.gms.settings.title"));
                                bmxv2 = m10962a(resourcesForApplication, bundle.getInt("com.google.android.gms.settings.summary"));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
                eqe = new eqe(bmxv, bmxv2);
            } catch (URISyntaxException e2) {
            }
        }
        bxvd da = bsxk.f147578f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsxk bsxk = (bsxk) da.f164949b;
        int i = bsxk.f147580a | 2;
        bsxk.f147580a = i;
        bsxk.f147584e = true;
        bsxn.getClass();
        bsxk.f147583d = bsxn;
        bsxk.f147580a = i | 1;
        bsvd a = m10965a((String) eqe.f15511a.mo66812a(mo10408a((int) C0126R.string.as_clp_emergency_info_title)), (String) eqe.f15512b.mo66812a(mo10408a((int) C0126R.string.as_clp_emergency_info_subtitle)), bswg.LOCAL_HOSPITAL_ICON, 1005);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsxk bsxk2 = (bsxk) da.f164949b;
        a.getClass();
        bsxk2.f147582c = a;
        bsxk2.f147581b = 8;
        return eqf.m10961b((bsxk) da.mo74062i());
    }

    /* renamed from: b */
    public final eqf mo10411b(bsxn bsxn) {
        int a = epu.m10942a(bsxn);
        if (a != 1 && !m10969b(a)) {
            return null;
        }
        bsvf bsvf = (bsvf) bsvg.f147248b.mo74144da();
        if (a == 1) {
            bsvf.mo70713a(m10970c(10368));
            bsvf.mo70713a(m10970c(10369));
            bsvf.mo70713a(m10970c(10370));
            if (ffr.m11620a(this.f15516a)) {
                bsvf.mo70713a(m10970c(10372));
            }
        }
        if (a == 2) {
            esx esx = this.f15518c;
            esx.f15656b.await();
            boolean z = true;
            for (esu esu : esx.f15655a.f15653b.values()) {
                if (esu.mo10494a(this.f15517b) && !esu.f15648c) {
                    if (cbro.f178167a.mo6606a().mo75297q() || !z) {
                        bsvf.mo70713a(m10970c(10210));
                    }
                    bsvf.mo70713a(m10971c(2003, esu.f15647b));
                    bnrd a2 = esu.f15649d.iterator();
                    while (a2.hasNext()) {
                        mo10410a(bsvf, (est) a2.next());
                    }
                    z = false;
                }
            }
        }
        bxvd da = bsxk.f147578f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsxk bsxk = (bsxk) da.f164949b;
        int i = 2 | bsxk.f147580a;
        bsxk.f147580a = i;
        bsxk.f147584e = true;
        bsxn.getClass();
        bsxk.f147583d = bsxn;
        bsxk.f147580a = i | 1;
        bsvg bsvg = (bsvg) bsvf.mo74062i();
        bsvg.getClass();
        bsxk.f147582c = bsvg;
        bsxk.f147581b = 6;
        bsxk bsxk2 = (bsxk) da.mo74062i();
        if (cbro.m128207k() && a == 1 && ffr.m11620a(this.f15516a)) {
            return eqf.m10960a(bsxk2);
        }
        return eqf.m10961b(bsxk2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (p000.stm.m36302d(r3) != false) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* renamed from: c */
    public final eqf mo10412c(bsxn bsxn) {
        String str;
        String string;
        bxvd da;
        int i;
        Context context = this.f15517b;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String str2 = null;
        if (telephonyManager != null) {
            int a = C1133kh.m17835a(rpr.m34216b(), "android.permission.READ_PHONE_STATE");
            int a2 = C1133kh.m17835a(rpr.m34216b(), "android.permission.READ_SMS");
            if (a == 0 || a2 == 0) {
                str = telephonyManager.getLine1Number();
                if (!stm.m36302d(str)) {
                    TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                    String simCountryIso = telephonyManager2 != null ? telephonyManager2.getSimCountryIso() : null;
                    if (stm.m36302d(simCountryIso)) {
                        simCountryIso = fgd.m11650a().getCountry();
                    }
                    String upperCase = !stm.m36302d(simCountryIso) ? simCountryIso.toUpperCase(Locale.ROOT) : null;
                    if (!stm.m36302d(upperCase)) {
                        try {
                            beao a3 = beao.m91670a();
                            int b = a3.mo58491b(upperCase);
                            beat a4 = a3.mo58483a(str, upperCase);
                            if (b <= 0 || a4.f106841a != b) {
                                i = 2;
                            } else {
                                i = 3;
                            }
                            str2 = C1211nd.m19661a().mo15492a(beao.m91670a().mo58486a(a4, i), C1220nm.f26744a);
                        } catch (bean e) {
                        }
                    }
                    str2 = str;
                }
                int i2 = Build.VERSION.SDK_INT;
                string = Settings.Global.getString(this.f15517b.getContentResolver(), "device_name");
                if (bmxx.m108577a(string)) {
                    string = Build.MODEL;
                }
                da = bsxk.f147578f.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsxk bsxk = (bsxk) da.f164949b;
                int i3 = bsxk.f147580a | 2;
                bsxk.f147580a = i3;
                bsxk.f147584e = false;
                bsxn.getClass();
                bsxk.f147583d = bsxn;
                bsxk.f147580a = i3 | 1;
                String a5 = mo10408a((int) C0126R.string.as_clp_device_info_title);
                if (!bmxx.m108577a(str2)) {
                    string = this.f15519e.getString(C0126R.string.as_clp_device_info_subtitle, string, str2);
                }
                bsvd a6 = m10965a(a5, string, bswg.PERM_DEVICE_INFO_ICON, 1004);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsxk bsxk2 = (bsxk) da.f164949b;
                a6.getClass();
                bsxk2.f147582c = a6;
                bsxk2.f147581b = 8;
                return eqf.m10961b((bsxk) da.mo74062i());
            }
        }
        str = null;
        if (!stm.m36302d(str)) {
        }
        int i22 = Build.VERSION.SDK_INT;
        string = Settings.Global.getString(this.f15517b.getContentResolver(), "device_name");
        if (bmxx.m108577a(string)) {
        }
        da = bsxk.f147578f.mo74144da();
        if (da.f164950c) {
        }
        bsxk bsxk3 = (bsxk) da.f164949b;
        int i32 = bsxk3.f147580a | 2;
        bsxk3.f147580a = i32;
        bsxk3.f147584e = false;
        bsxn.getClass();
        bsxk3.f147583d = bsxn;
        bsxk3.f147580a = i32 | 1;
        String a52 = mo10408a((int) C0126R.string.as_clp_device_info_title);
        if (!bmxx.m108577a(str2)) {
        }
        bsvd a62 = m10965a(a52, string, bswg.PERM_DEVICE_INFO_ICON, 1004);
        if (da.f164950c) {
        }
        bsxk bsxk22 = (bsxk) da.f164949b;
        a62.getClass();
        bsxk22.f147582c = a62;
        bsxk22.f147581b = 8;
        return eqf.m10961b((bsxk) da.mo74062i());
    }

    /* renamed from: a */
    public static final bsut m10964a(String str, String str2, bswg bswg, bsxn bsxn) {
        bxvd da = bsvt.f147332e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsvt bsvt = (bsvt) da.f164949b;
        str.getClass();
        int i = bsvt.f147334a | 2;
        bsvt.f147334a = i;
        bsvt.f147336c = str;
        if (str2 != null) {
            str2.getClass();
            bsvt.f147334a = i | 4;
            bsvt.f147337d = str2;
        }
        if (bswg != null) {
            bxvd da2 = bswh.f147430g.mo74144da();
            int i2 = bswg.f147429H;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bswh bswh = (bswh) da2.f164949b;
            bswh.f147432a |= 1;
            bswh.f147433b = i2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsvt bsvt2 = (bsvt) da.f164949b;
            bswh bswh2 = (bswh) da2.mo74062i();
            bswh2.getClass();
            bsvt2.f147335b = bswh2;
            bsvt2.f147334a |= 1;
        }
        bxvd da3 = bsut.f147187e.mo74144da();
        bsvt bsvt3 = (bsvt) da.mo74062i();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsut bsut = (bsut) da3.f164949b;
        bsvt3.getClass();
        bsut.f147191c = bsvt3;
        bsut.f147190b = 14;
        bsxn.getClass();
        bsut.f147192d = bsxn;
        bsut.f147189a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        return (bsut) da3.mo74062i();
    }

    /* renamed from: a */
    public static final bsvd m10965a(String str, String str2, bswg bswg, int i) {
        return m10966a(m10964a(str, str2, bswg, m10970c(i)));
    }

    /* renamed from: a */
    public static final bsvd m10966a(bsut... bsutArr) {
        bxvd da = bsvd.f147230c.mo74144da();
        bxvd da2 = bsvo.f147314b.mo74144da();
        bngx a = bngx.m109370a((Object[]) bsutArr);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsvo bsvo = (bsvo) da2.f164949b;
        if (!bsvo.f147316a.mo73666a()) {
            bsvo.f147316a = bxvk.m124021a(bsvo.f147316a);
        }
        bxsy.m123078a(a, bsvo.f147316a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsvd bsvd = (bsvd) da.f164949b;
        bsvo bsvo2 = (bsvo) da2.mo74062i();
        bsvo2.getClass();
        bsvd.f147233b = bsvo2;
        bsvd.f147232a = 3;
        return (bsvd) da.mo74062i();
    }

    /* renamed from: a */
    public static eqf m10967a(bsxn bsxn, int i) {
        bxvd da = bsxk.f147578f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsxk bsxk = (bsxk) da.f164949b;
        int i2 = bsxk.f147580a | 2;
        bsxk.f147580a = i2;
        bsxk.f147584e = true;
        bsxn.getClass();
        bsxk.f147583d = bsxn;
        bsxk.f147580a = i2 | 1;
        bsxq bsxq = (bsxq) bsxr.f147603b.mo74144da();
        bxvd da2 = bsul.f147142j.mo74144da();
        bxvd da3 = bswr.f147479e.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bswr bswr = (bswr) da3.f164949b;
        bswr.f147481a = 1 | bswr.f147481a;
        bswr.f147482b = i;
        bswr bswr2 = (bswr) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsul bsul = (bsul) da2.f164949b;
        bswr2.getClass();
        bsul.f147145b = bswr2;
        bsul.f147144a |= 2;
        bsxq.mo70723a(da2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsxk bsxk2 = (bsxk) da.f164949b;
        bsxr bsxr = (bsxr) bsxq.mo74062i();
        bsxr.getClass();
        bsxk2.f147582c = bsxr;
        bsxk2.f147581b = 3;
        return eqf.m10961b((bsxk) da.mo74062i());
    }

    /* renamed from: a */
    public final bsww mo10406a(int i, int i2) {
        bxvd da = bsww.f147504d.mo74144da();
        String a = mo10408a(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsww bsww = (bsww) da.f164949b;
        a.getClass();
        bsww.f147506a |= 1;
        bsww.f147507b = a;
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        if (bsxl.f164950c) {
            bsxl.mo74035c();
            bsxl.f164950c = false;
        }
        bsxn bsxn = (bsxn) bsxl.f164949b;
        bsxn.f147588a |= 1;
        bsxn.f147589b = i2;
        bsxn bsxn2 = (bsxn) bsxl.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsww bsww2 = (bsww) da.f164949b;
        bsxn2.getClass();
        bsww2.f147508c = bsxn2;
        bsww2.f147506a |= 2;
        return (bsww) da.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b1  */
    /* renamed from: a */
    public final eqf mo10407a(bsxn bsxn) {
        int i;
        int a = epu.m10942a(bsxn);
        alky alky = null;
        if (a != 1 && !m10969b(a)) {
            return null;
        }
        bxvd da = bsys.f147709h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsys bsys = (bsys) da.f164949b;
        bsys.f147711a |= 32;
        bsys.f147716f = false;
        bxvd da2 = bsui.f147128e.mo74144da();
        bxvd da3 = bswh.f147430g.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bswh bswh = (bswh) da3.f164949b;
        bswh.f147432a |= 1;
        bswh.f147433b = 29;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsui bsui = (bsui) da2.f164949b;
        bswh bswh2 = (bswh) da3.mo74062i();
        bswh2.getClass();
        bsui.f147132c = bswh2;
        bsui.f147130a |= 2;
        if (ffr.m11620a(this.f15516a)) {
            if (!cbro.m128204h()) {
                i = 2;
            } else {
                i = 10212;
            }
            String a2 = mo10408a((int) C0126R.string.common_asm_manage_google_account_title);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsui bsui2 = (bsui) da2.f164949b;
            a2.getClass();
            bsui2.f147130a |= 1;
            bsui2.f147131b = a2;
            bsxn c = m10970c(i);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsui bsui3 = (bsui) da2.f164949b;
            c.getClass();
            bsui3.f147133d = c;
            bsui3.f147130a |= 4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsys bsys2 = (bsys) da.f164949b;
            bsui bsui4 = (bsui) da2.mo74062i();
            bsui4.getClass();
            bsys2.f147715e = bsui4;
            bsys2.f147711a |= 16;
        } else {
            String a3 = mo10408a((int) C0126R.string.as_signin_chip_title);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsui bsui5 = (bsui) da2.f164949b;
            a3.getClass();
            bsui5.f147130a |= 1;
            bsui5.f147131b = a3;
            bsxn c2 = m10970c(10048);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsui bsui6 = (bsui) da2.f164949b;
            c2.getClass();
            bsui6.f147133d = c2;
            bsui6.f147130a |= 4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsys bsys3 = (bsys) da.f164949b;
            bsui bsui7 = (bsui) da2.mo74062i();
            bsui7.getClass();
            bsys3.f147715e = bsui7;
            bsys3.f147711a |= 16;
        }
        String str = "";
        if (ffr.m11620a(this.f15516a)) {
            try {
                alky alky2 = (alky) ((rjx) this.f15520f.mo6606a()).mo24710a((alkx) null).mo9456a(cbri.f178135a.mo6606a().mo75264n(), TimeUnit.MILLISECONDS);
                try {
                    if (alky2.mo7183bo().equals(Status.f30107a) && alky2.mo12459b() != null) {
                        Iterator it = alky2.mo12459b().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            alzr alzr = (alzr) it.next();
                            if (alzr.mo41071l() && this.f15516a.f16458a.equals(alzr.mo41063c())) {
                                str = alzr.mo41064d();
                                if (alky2 != null) {
                                    alky2.mo12460c();
                                }
                            }
                        }
                    }
                    if (alky2 != null) {
                        alky2.mo12460c();
                    }
                } catch (Throwable th) {
                    th = th;
                    alky = alky2;
                    if (alky != null) {
                        alky.mo12460c();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (alky != null) {
                }
                throw th;
            }
        } else if (cbro.m128203g()) {
            esq esq = this.f15521g;
            if (esq.f15637b != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (C1133kh.m17835a(esq.f15636a, "android.permission.MANAGE_USERS") == 0) {
                    str = esq.f15637b.getUserName();
                }
            }
        }
        if (!bmxx.m108577a(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsys bsys4 = (bsys) da.f164949b;
            str.getClass();
            bsys4.f147711a |= 2;
            bsys4.f147712b = str;
        }
        if (m10969b(a)) {
            int i3 = Build.VERSION.SDK_INT;
            String a4 = mo10408a((int) C0126R.string.common_google);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsys bsys5 = (bsys) da.f164949b;
            a4.getClass();
            bsys5.f147711a |= 64;
            bsys5.f147717g = a4;
        }
        bxvd da4 = bsxk.f147578f.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsxk bsxk = (bsxk) da4.f164949b;
        int i4 = bsxk.f147580a | 2;
        bsxk.f147580a = i4;
        bsxk.f147584e = false;
        bsxn.getClass();
        bsxk.f147583d = bsxn;
        bsxk.f147580a = i4 | 1;
        bsys bsys6 = (bsys) da.mo74062i();
        bsys6.getClass();
        bsxk.f147582c = bsys6;
        bsxk.f147581b = 4;
        bsxk bsxk2 = (bsxk) da4.mo74062i();
        if (cbro.m128207k() && a == 1 && ffr.m11620a(this.f15516a)) {
            return eqf.m10960a(bsxk2);
        }
        return eqf.m10961b(bsxk2);
    }

    /* renamed from: a */
    public final String mo10408a(int i) {
        return this.f15519e.getString(i);
    }

    /* renamed from: a */
    public final void mo10409a(bsum bsum) {
        if (ffr.m11620a(this.f15516a)) {
            bxvd da = bsvx.f147351c.mo74144da();
            String str = this.f15516a.f16458a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsvx bsvx = (bsvx) da.f164949b;
            str.getClass();
            bsvx.f147353a = 1;
            bsvx.f147354b = str;
            bsum.mo70712a("extra.accountName", (bsvx) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo10410a(bsvf bsvf, est est) {
        if (est.mo10492a(this.f15517b)) {
            GoogleSettingsItem googleSettingsItem = est.f15644a;
            if (googleSettingsItem != null) {
                bsvf.mo70713a(m10972d(2001, googleSettingsItem.f29969o));
            } else {
                bsvf.mo70713a(m10971c(2004, est.f15645b.f15647b));
            }
        }
    }
}
