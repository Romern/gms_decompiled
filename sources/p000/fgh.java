package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.TimeUnit;

/* renamed from: fgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgh {

    /* renamed from: a */
    static final String[] f16500a = {"com.google.android.webview", "com.android.webview"};

    /* renamed from: b */
    public static final Logger f16501b = ffw.m11631a("RequestContextHelper");

    /* renamed from: e */
    private static final bmzi f16502e = bmzn.m108682a(fgf.f16497a, 1, TimeUnit.HOURS);

    /* renamed from: c */
    public final Context f16503c = rpr.m34216b();

    /* renamed from: d */
    public final bmzi f16504d;

    /* renamed from: f */
    private final bmzi f16505f;

    /* renamed from: g */
    private final bmzi f16506g;

    public fgh(ModuleManager moduleManager) {
        bmzi bmzi = f16502e;
        this.f16505f = bmzn.m108682a(new fgg(moduleManager), 1, TimeUnit.HOURS);
        this.f16506g = bmzn.m108682a(new fge(this), cbri.f178135a.mo6606a().mo75275y(), TimeUnit.MILLISECONDS);
        this.f16504d = bmzi;
    }

    /* renamed from: a */
    public final bsvn mo10799a() {
        String str;
        String str2;
        bxvd da = bsvn.f147304i.mo74144da();
        String str3 = Build.VERSION.RELEASE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsvn bsvn = (bsvn) da.f164949b;
        str3.getClass();
        bsvn.f147306a |= 1;
        bsvn.f147307b = str3;
        String num = Integer.toString(Build.VERSION.SDK_INT);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsvn bsvn2 = (bsvn) da.f164949b;
        num.getClass();
        bsvn2.f147306a |= 2;
        bsvn2.f147308c = num;
        String num2 = Integer.toString(201515033);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsvn bsvn3 = (bsvn) da.f164949b;
        num2.getClass();
        bsvn3.f147306a |= 8;
        bsvn3.f147310e = num2;
        if (cbri.m128134d()) {
            int i = Build.VERSION.SDK_INT;
            String str4 = (String) this.f16506g.mo6606a();
            if (str4 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsvn bsvn4 = (bsvn) da.f164949b;
                str4.getClass();
                bsvn4.f147306a |= 4;
                bsvn4.f147309d = str4;
            }
        }
        ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) ((bnhe) this.f16505f.mo6606a()).get("accountsettings");
        if (moduleInfo != null) {
            String num3 = Integer.toString(moduleInfo.moduleVersion);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsvn bsvn5 = (bsvn) da.f164949b;
            num3.getClass();
            int i2 = bsvn5.f147306a | 16;
            bsvn5.f147306a = i2;
            bsvn5.f147311f = num3;
            ModuleManager.ModuleApkInfo moduleApkInfo = moduleInfo.moduleApk;
            if (!(moduleApkInfo == null || (str2 = moduleApkInfo.apkVersionName) == null)) {
                str2.getClass();
                bsvn5.f147306a = i2 | 32;
                bsvn5.f147312g = str2;
            }
        }
        ModuleManager.ModuleInfo moduleInfo2 = (ModuleManager.ModuleInfo) ((bnhe) this.f16505f.mo6606a()).get("octarine");
        if (moduleInfo2 != null) {
            str = Integer.toString(moduleInfo2.moduleVersion);
        } else {
            str = null;
        }
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsvn bsvn6 = (bsvn) da.f164949b;
            str.getClass();
            bsvn6.f147306a |= 64;
            bsvn6.f147313h = str;
        }
        return (bsvn) da.mo74062i();
    }

    /* renamed from: b */
    public final bsvm mo10800b() {
        bsvl bsvl = (bsvl) bsvm.f147292k.mo74144da();
        bngs j = bngx.m109377j();
        j.mo67667b((Object[]) new Integer[]{2, 3, 4, 5, 7, 10});
        bnre i = j.mo67664a().listIterator();
        while (i.hasNext()) {
            int intValue = ((Integer) i.next()).intValue();
            bxvd da = bsyi.f147679c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsyi bsyi = (bsyi) da.f164949b;
            bsyi.f147681a |= 1;
            bsyi.f147682b = intValue;
            if (bsvl.f164950c) {
                bsvl.mo74035c();
                bsvl.f164950c = false;
            }
            bsvm bsvm = (bsvm) bsvl.f164949b;
            bsyi bsyi2 = (bsyi) da.mo74062i();
            bsyi2.getClass();
            if (!bsvm.f147295b.mo73666a()) {
                bsvm.f147295b = GeneratedMessageLite.m124021a(bsvm.f147295b);
            }
            bsvm.f147295b.add(bsyi2);
        }
        bnre i2 = bngx.m109367a(bswg.CHEVRON_RIGHT_ICON, bswg.CHEVRON_LEFT_ICON, bswg.CHEVRON_FORWARD_ICON, bswg.IMAGE_PLACEHOLDER_ICON, bswg.EDIT_ICON, bswg.ACCOUNT_ICON, bswg.SEARCH_ICON, bswg.SUPPORT_ICON, bswg.MENU_ICON, bswg.CLOUD_OFF_ICON, bswg.GENERIC_ERROR_ICON, bswg.OPEN_IN_NEW_ICON, bswg.PHONE_ANDROID_ICON, bswg.GOOGLE_G_COLORED_ICON, bswg.PAYMENT_ICON, bswg.PERM_DEVICE_INFO_ICON, bswg.LOCAL_HOSPITAL_ICON, bswg.GROUP_ICON, bswg.GOOGLE_G_ICON, bswg.PERSONAL_INFO_ICON, bswg.TOGGLE_ON_ICON, bswg.PEOPLE_OUTLINE_ICON, bswg.LOCK_ICON).listIterator();
        while (i2.hasNext()) {
            bxvd da2 = bsyh.f147675c.mo74144da();
            int i3 = ((bswg) i2.next()).f147429H;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsyh bsyh = (bsyh) da2.f164949b;
            bsyh.f147677a |= 1;
            bsyh.f147678b = i3;
            if (bsvl.f164950c) {
                bsvl.mo74035c();
                bsvl.f164950c = false;
            }
            bsvm bsvm2 = (bsvm) bsvl.f164949b;
            bsyh bsyh2 = (bsyh) da2.mo74062i();
            bsyh2.getClass();
            if (!bsvm2.f147296c.mo73666a()) {
                bsvm2.f147296c = GeneratedMessageLite.m124021a(bsvm2.f147296c);
            }
            bsvm2.f147296c.add(bsyh2);
        }
        bngs j2 = bngx.m109377j();
        int i4 = Build.VERSION.SDK_INT;
        j2.mo67667b((Object[]) new Integer[]{6, 8});
        j2.mo67667b((Object[]) new Integer[]{4, 9, 2, 3});
        bnre i5 = j2.mo67664a().listIterator();
        while (i5.hasNext()) {
            int intValue2 = ((Integer) i5.next()).intValue();
            bxvd da3 = bsyg.f147671c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bsyg bsyg = (bsyg) da3.f164949b;
            bsyg.f147673a |= 1;
            bsyg.f147674b = intValue2;
            bsvl.mo70714a(da3);
        }
        if (cbro.m128208l()) {
            if (bsvl.f164950c) {
                bsvl.mo74035c();
                bsvl.f164950c = false;
            }
            bsvm bsvm3 = (bsvm) bsvl.f164949b;
            bsvm3.f147294a |= 128;
            bsvm3.f147303j = true;
        }
        if (cbri.m128134d()) {
            if (((bnhe) this.f16505f.mo6606a()).containsKey("octarine")) {
                int i6 = Build.VERSION.SDK_INT;
                bxvd da4 = bsyg.f147671c.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bsyg bsyg2 = (bsyg) da4.f164949b;
                bsyg2.f147673a |= 1;
                bsyg2.f147674b = 5;
                bsvl.mo70714a(da4);
                bxvd da5 = bsyr.f147703e.mo74144da();
                boolean b = cfrc.m142648b();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bsyr bsyr = (bsyr) da5.f164949b;
                bsyr.f147705a |= 1;
                bsyr.f147706b = b;
                boolean c = cfrc.m142649c();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bsyr bsyr2 = (bsyr) da5.f164949b;
                bsyr2.f147705a |= 2;
                bsyr2.f147707c = c;
                boolean d = cfrc.m142650d();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bsyr bsyr3 = (bsyr) da5.f164949b;
                bsyr3.f147705a |= 4;
                bsyr3.f147708d = d;
                bsyr bsyr4 = (bsyr) da5.mo74062i();
                if (bsvl.f164950c) {
                    bsvl.mo74035c();
                    bsvl.f164950c = false;
                }
                bsvm bsvm4 = (bsvm) bsvl.f164949b;
                bsyr4.getClass();
                bsvm4.f147298e = bsyr4;
                bsvm4.f147294a |= 1;
            }
        }
        bxvd da6 = bsws.f147485c.mo74144da();
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsws bsws = (bsws) da6.f164949b;
        bsws.f147487a |= 1;
        bsws.f147488b = true;
        if (bsvl.f164950c) {
            bsvl.mo74035c();
            bsvl.f164950c = false;
        }
        bsvm bsvm5 = (bsvm) bsvl.f164949b;
        bsws bsws2 = (bsws) da6.mo74062i();
        bsws2.getClass();
        bsvm5.f147302i = bsws2;
        bsvm5.f147294a |= 64;
        bxvd da7 = bsve.f147234m.mo74144da();
        if (da7.f164950c) {
            da7.mo74035c();
            da7.f164950c = false;
        }
        bsve bsve = (bsve) da7.f164949b;
        int i7 = bsve.f147236a | 1;
        bsve.f147236a = i7;
        bsve.f147237b = true;
        int i8 = 2 | i7;
        bsve.f147236a = i8;
        bsve.f147238c = true;
        int i9 = i8 | 4;
        bsve.f147236a = i9;
        bsve.f147239d = true;
        int i10 = i9 | 8;
        bsve.f147236a = i10;
        bsve.f147240e = true;
        int i11 = i10 | 64;
        bsve.f147236a = i11;
        bsve.f147242g = true;
        int i12 = i11 | 128;
        bsve.f147236a = i12;
        bsve.f147243h = true;
        int i13 = i12 | 512;
        bsve.f147236a = i13;
        bsve.f147245j = true;
        int i14 = i13 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bsve.f147236a = i14;
        bsve.f147244i = true;
        int i15 = i14 | 32;
        bsve.f147236a = i15;
        bsve.f147241f = true;
        int i16 = i15 | 1024;
        bsve.f147236a = i16;
        bsve.f147246k = true;
        bsve.f147236a = i16 | 2048;
        bsve.f147247l = true;
        bsve bsve2 = (bsve) da7.mo74062i();
        if (bsvl.f164950c) {
            bsvl.mo74035c();
            bsvl.f164950c = false;
        }
        bsvm bsvm6 = (bsvm) bsvl.f164949b;
        bsve2.getClass();
        bsvm6.f147299f = bsve2;
        int i17 = bsvm6.f147294a | 8;
        bsvm6.f147294a = i17;
        bsvm6.f147294a = i17 | 16;
        bsvm6.f147300g = true;
        if (cbro.m128204h()) {
            bxvd da8 = bsuq.f147170c.mo74144da();
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bsuq bsuq = (bsuq) da8.f164949b;
            bsuq.f147172a |= 1;
            bsuq.f147173b = true;
            if (bsvl.f164950c) {
                bsvl.mo74035c();
                bsvl.f164950c = false;
            }
            bsvm bsvm7 = (bsvm) bsvl.f164949b;
            bsuq bsuq2 = (bsuq) da8.mo74062i();
            bsuq2.getClass();
            bsvm7.f147301h = bsuq2;
            bsvm7.f147294a |= 32;
        }
        return (bsvm) bsvl.mo74062i();
    }

    /* renamed from: c */
    public final void mo10801c() {
        sre.m36087g(this.f16503c);
    }
}
