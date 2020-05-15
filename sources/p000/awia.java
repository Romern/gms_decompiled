package p000;

import android.accounts.Account;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.activity.OrchestrationDelegatorChimeraActivity;
import com.google.android.gms.wallet.addinstrument.AddInstrumentRootChimeraActivity;
import com.google.android.gms.wallet.analytics.events.CreditCardEntrySubmittedEvent;
import com.google.android.gms.wallet.buyflow.CheckoutChimeraActivity;
import com.google.android.gms.wallet.common.p079ui.PopoverView;
import com.google.android.gms.wallet.embeddedsettings.EmbeddedSettingsChimeraActivity;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.fixinstrument.FixInstrumentRootChimeraActivity;
import com.google.android.gms.wallet.idcredit.IdCreditChimeraActivity;
import com.google.android.gms.wallet.p084ow.ChooseAccountShimChimeraActivity;
import com.google.android.gms.wallet.paymentmethods.PaymentMethodsChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.timelineview.TimelineViewChimeraActivity;
import com.google.android.gms.wallet.usermanagement.UserManagementChimeraActivity;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FifeNetworkImageView;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.creditcard.CreditCardNumberEditText;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: awia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awia {

    /* renamed from: a */
    public static final awhz f94379a = awhp.f94368a;

    /* renamed from: b */
    public static final awhz f94380b = awhq.f94369a;

    /* renamed from: c */
    public static final awhz f94381c = awhr.f94370a;

    /* renamed from: d */
    public static final awhz f94382d = awhs.f94371a;

    /* renamed from: e */
    public static final awhz f94383e = awht.f94372a;

    /* renamed from: f */
    public static final awhz f94384f = awhu.f94373a;

    /* renamed from: g */
    public static final awhz f94385g = awhv.f94374a;

    /* renamed from: h */
    public static final awhz f94386h = awhw.f94375a;

    /* renamed from: i */
    public static final awhz f94387i = awhx.f94376a;

    /* renamed from: j */
    public static final awhz f94388j = awhi.f94361a;

    /* renamed from: k */
    public static final awhz f94389k = awhj.f94362a;

    /* renamed from: l */
    public static final awhz f94390l = awho.f94367a;

    /* renamed from: m */
    static WeakReference f94391m;

    /* renamed from: n */
    private static final awhz f94392n = awhk.f94363a;

    /* renamed from: o */
    private static final awhz f94393o = awhl.f94364a;

    /* renamed from: p */
    private static final awhz f94394p = awhm.f94365a;

    /* renamed from: q */
    private static final awhz f94395q = awhn.f94366a;

    /* renamed from: r */
    private static ImageLoader f94396r;

    /* renamed from: a */
    public static int m79964a(int i) {
        if (i != -1) {
            return i != 0 ? 5 : 4;
        }
        return 2;
    }

    /* renamed from: b */
    public static PopoverView m79995b(Context context) {
        Activity c = m80001c(context);
        if (c != null) {
            return (PopoverView) c.findViewById(C0126R.C0129id.popover);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m79997b(int i) {
        return i == 2 || i == 4;
    }

    /* renamed from: c */
    public static Activity m80001c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return m80001c(((ContextWrapper) context).getBaseContext());
    }

    /* renamed from: d */
    public static Point m80003d(Context context) {
        Display display;
        if (context instanceof Activity) {
            display = ((Activity) context).getWindowManager().getDefaultDisplay();
        } else {
            display = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        }
        Point point = new Point();
        if (display != null) {
            int i = Build.VERSION.SDK_INT;
            display.getSize(point);
        }
        return point;
    }

    /* renamed from: e */
    public static int m80004e(Context context) {
        return (context.getResources().getConfiguration().orientation != 2 || !bkfr.m105581a(context, new int[]{1})) ? 0 : 1;
    }

    /* renamed from: f */
    public static void m80005f(Context context) {
        PopoverView b = m79995b(context);
        if (b != null) {
            b.mo59876b(!m79986a(context.getResources()));
        }
    }

    /* renamed from: a */
    public static int m79965a(BuyFlowConfig buyFlowConfig) {
        int i;
        WalletCustomTheme walletCustomTheme;
        if (buyFlowConfig == null || (walletCustomTheme = buyFlowConfig.f110418b.f110411f) == null) {
            i = 1;
        } else {
            i = walletCustomTheme.f110169b.getInt("windowTransitionsStyle", 1);
        }
        if (i != 1) {
            if (i == 2) {
                return 0;
            }
            if (i != 3) {
                if (i == 4) {
                    return C0126R.anim.wallet_slide_out_to_right;
                }
                Log.w("WalletUiUtils", "Unknown window transition style. Using default animation.");
                return C0126R.anim.wallet_push_down_out;
            }
        }
        return C0126R.anim.wallet_push_down_out;
    }

    /* renamed from: c */
    public static boolean m80002c(bmgk bmgk) {
        if (bmgk == null) {
            return false;
        }
        if (!m79989a(bmgk)) {
            return bmgk.f129258l;
        }
        int a = bmgj.m108003a(bmgk.f129259m);
        if (a == 0 || a != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m79996b(View view, boolean z) {
        view.post(new awhh(view, !z ? C0126R.string.wallet_spinner_gone : C0126R.string.wallet_spinner_visible));
    }

    /* renamed from: a */
    public static Intent m79966a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.removeExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        intent2.removeExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
        intent2.removeExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        return intent2;
    }

    /* renamed from: a */
    public static Intent m79967a(bwiv bwiv, Intent intent, Context context, BuyFlowConfig buyFlowConfig) {
        Intent a = m79966a(intent);
        int a2 = bwix.m122006a(bwiv.f159696b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            awkt awkt = new awkt(a);
            awkt.mo52220a(bwiv.f159697c.mo73780k());
            return AddInstrumentRootChimeraActivity.m93802a(context, awkt.mo52186a(), buyFlowConfig);
        } else if (i == 5) {
            awla awla = new awla(a);
            if ((bwiv.f159695a & 2) != 0) {
                awla.mo52229a(bwiv.f159697c.mo73780k());
            }
            if ((bwiv.f159695a & 4) != 0) {
                awla.mo52230b(bwiv.f159698d.mo73780k());
            }
            return FixInstrumentRootChimeraActivity.m93940a(context, awla.mo52186a(), buyFlowConfig);
        } else if (i == 7) {
            awlb awlb = new awlb(a);
            if ((bwiv.f159695a & 2) != 0) {
                awlb.mo52231a(bwiv.f159697c.mo73780k());
            }
            if ((bwiv.f159695a & 4) != 0) {
                awlb.mo52232b(bwiv.f159698d.mo73780k());
            }
            return IdCreditChimeraActivity.m94004a(context, awlb.mo52186a(), buyFlowConfig);
        } else if (i == 12) {
            awlg awlg = new awlg(a);
            awlg.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bwiv.f159697c.mo73780k());
            if ((bwiv.f159695a & 4) != 0) {
                awlg.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bwiv.f159698d.mo73780k());
            }
            return PaymentMethodsChimeraActivity.m94078a(context, awlg.mo52186a(), buyFlowConfig);
        } else if (i == 16) {
            awlt awlt = new awlt(a);
            if ((bwiv.f159695a & 2) != 0) {
                awlt.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bwiv.f159697c.mo73780k());
            }
            if ((bwiv.f159695a & 4) != 0) {
                awlt.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bwiv.f159698d.mo73780k());
            }
            return UserManagementChimeraActivity.m94303a(context, awlt.mo52186a(), buyFlowConfig);
        } else if (i == 25 || i == 31) {
            awkx awkx = new awkx(a);
            if ((bwiv.f159695a & 2) != 0) {
                awkx.mo52226a(bwiv.f159697c.mo73780k());
            }
            if ((bwiv.f159695a & 4) != 0) {
                awkx.mo52227b(bwiv.f159698d.mo73780k());
            }
            return CheckoutChimeraActivity.m93851a(context, awkx.mo52186a(), buyFlowConfig);
        } else if (i == 19) {
            awkz awkz = new awkz(a);
            if ((bwiv.f159695a & 2) != 0) {
                awkz.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bwiv.f159697c.mo73780k());
            }
            if ((bwiv.f159695a & 4) != 0) {
                awkz.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bwiv.f159698d.mo73780k());
            }
            return EmbeddedSettingsChimeraActivity.m93934a(context, awkz.mo52186a(), buyFlowConfig);
        } else if (i == 20) {
            awlf awlf = new awlf(a);
            if ((bwiv.f159695a & 2) != 0) {
                awlf.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bwiv.f159697c.mo73780k());
            }
            if ((bwiv.f159695a & 4) != 0) {
                awlf.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bwiv.f159698d.mo73780k());
            }
            Intent a3 = OrchestrationDelegatorChimeraActivity.m93799a(context, awlf.mo52186a(), buyFlowConfig);
            a3.setAction("com.google.android.gms.wallet.firstparty.ACTION_INVOICE_SUMMARY");
            return a3;
        } else if (i == 22 || i == 23) {
            awls awls = new awls(a);
            if ((bwiv.f159695a & 2) != 0) {
                awls.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bwiv.f159697c.mo73780k());
            }
            if ((bwiv.f159695a & 4) != 0) {
                awls.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bwiv.f159698d.mo73780k());
            }
            return TimelineViewChimeraActivity.m94187a(context, awls.mo52186a(), buyFlowConfig);
        } else {
            awkv awkv = new awkv(a);
            if ((bwiv.f159695a & 2) != 0) {
                awkv.mo52222b(bwiv.f159697c.mo73780k());
            }
            if ((bwiv.f159695a & 4) != 0) {
                awkv.mo52221a(bwiv.f159698d.mo73780k());
            }
            awkv.mo52223c(1000);
            return ChooseAccountShimChimeraActivity.m94040a(context, awkv.mo52186a(), buyFlowConfig);
        }
    }

    /* renamed from: b */
    public static boolean m79998b(bmgk bmgk) {
        if (!m79989a(bmgk)) {
            return (bmgk.f129247a & 2048) != 0;
        }
        int a = bmgj.m108003a(bmgk.f129259m);
        if (a != 0 && a == 4) {
            return true;
        }
        int a2 = bmgj.m108003a(bmgk.f129259m);
        return (a2 == 0 || a2 != 3 || (bmgk.f129247a & 2048) == 0) ? false : true;
    }

    /* renamed from: b */
    public static boolean m79999b(Activity activity, BuyFlowConfig buyFlowConfig) {
        int i = buyFlowConfig.f110418b.f110410e;
        if (i == 2 || (i == 3 && (activity.getResources().getConfiguration().uiMode & 48) == 32)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m80000b(WalletCustomTheme walletCustomTheme) {
        return m79993a(walletCustomTheme, 3);
    }

    /* renamed from: a */
    public static Spanned m79968a(String str) {
        if (str != null) {
            return Html.fromHtml(str);
        }
        return null;
    }

    /* renamed from: a */
    public static bkdx m79969a(bmfu bmfu, int i, String str, String str2, bpis bpis, LogContext logContext, BuyFlowConfig buyFlowConfig) {
        int i2 = bmfu.f129169a;
        if ((i2 & 1) != 0) {
            bmhy bmhy = bmfu.f129170b;
            if (bmhy == null) {
                bmhy = bmhy.f129503u;
            }
            axbb axbb = new axbb();
            Bundle a = bkdx.m105383a(i, bmhy, logContext);
            a.putString("buyFlowAnalyticsId", str2);
            a.putSerializable("flowTypeArg", bpis);
            axbb.setArguments(a);
            return axbb;
        } else if ((i2 & 32) != 0) {
            bmhi bmhi = bmfu.f129175g;
            if (bmhi == null) {
                bmhi = bmhi.f129409r;
            }
            axax axax = new axax();
            Bundle a2 = bkdx.m105383a(i, bmhi, logContext);
            a2.putString("buyFlowAnalyticsId", str2);
            a2.putSerializable("flowTypeArg", bpis);
            axax.setArguments(a2);
            return axax;
        } else if ((i2 & 2) != 0) {
            bmil bmil = bmfu.f129171c;
            if (bmil == null) {
                bmil = bmil.f129588g;
            }
            bkhr bkhr = new bkhr();
            bkhr.setArguments(bkdx.m105383a(i, bmil, logContext));
            return bkhr;
        } else if ((i2 & 8) != 0) {
            bmeb bmeb = bmfu.f129173e;
            if (bmeb == null) {
                bmeb = bmeb.f128902g;
            }
            return awzs.m81798a(bmeb, i, str2, logContext);
        } else if ((i2 & 4) != 0) {
            bmjb bmjb = bmfu.f129172d;
            if (bmjb == null) {
                bmjb = bmjb.f129661l;
            }
            return axby.m82259a(bmjb, i, logContext);
        } else if ((i2 & 16) != 0) {
            bmgp bmgp = bmfu.f129174f;
            if (bmgp == null) {
                bmgp = bmgp.f129296i;
            }
            bkal bkal = new bkal();
            bkal.setArguments(bkdx.m105383a(i, bmgp, logContext));
            return bkal;
        } else if ((i2 & 64) != 0) {
            bmki bmki = bmfu.f129176h;
            if (bmki == null) {
                bmki = bmki.f129802w;
            }
            bkiz bkiz = new bkiz();
            Bundle a3 = bkdx.m105383a(i, bmki, logContext);
            a3.putString("title", str);
            a3.putParcelable("buyFlowConfig", buyFlowConfig);
            bkiz.setArguments(a3);
            return bkiz;
        } else if ((i2 & 128) != 0) {
            bmio bmio = bmfu.f129177i;
            if (bmio == null) {
                bmio = bmio.f129607e;
            }
            axbi axbi = new axbi();
            Bundle a4 = bkdx.m105383a(i, bmio, logContext);
            a4.putString("analyticsSessionId", str2);
            a4.putParcelable("buyFlowConfig", buyFlowConfig);
            axbi.setArguments(a4);
            return axbi;
        } else {
            throw new IllegalArgumentException("Invalid instrument form");
        }
    }

    /* renamed from: a */
    public static bmaw m79970a(Account account, int i) {
        bxvd da = bmaw.f128509f.mo74144da();
        long j = -bjtc.m104550a(bwgx.ACCOUNT_OPTION, i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmaw bmaw = (bmaw) da.f164949b;
        bmaw.f128511a |= 1;
        bmaw.f128512b = j;
        String str = account.name;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmaw bmaw2 = (bmaw) da.f164949b;
        str.getClass();
        bmaw2.f128511a |= 4;
        bmaw2.f128514d = str;
        return (bmaw) da.mo74062i();
    }

    /* renamed from: a */
    public static bmbd m79971a(Context context, bmbd bmbd) {
        bmaw bmaw;
        if (bmbd == null) {
            return null;
        }
        int a = bmaz.m107852a(bmbd.f128533g);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            int i2 = 0;
            if (i != 2) {
                bxvd bxvd = (bxvd) bmbd.mo74142c(5);
                bxvd.mo73625a((bxvk) bmbd);
                bmba bmba = (bmba) bxvd;
                awec.m79679a();
                Account[] a2 = awec.m79681a(context);
                if (((bmbd) bmba.f164949b).f128531e.size() == 0) {
                    int length = a2.length;
                    if (length > 1 || bmbd.f128532f) {
                        if (bmba.f164950c) {
                            bmba.mo74035c();
                            bmba.f164950c = false;
                        }
                        ((bmbd) bmba.f164949b).f128531e = bxvk.m124030de();
                        while (i2 < length) {
                            bmba.mo66777a(m79970a(a2[i2], i2));
                            i2++;
                        }
                    }
                } else {
                    m79984a(a2, (bmbd) bmba.mo74062i());
                }
                if (((bmbd) bmba.f164949b).f128531e.size() > 0) {
                    return (bmbd) bmba.mo74062i();
                }
            } else {
                bxvd bxvd2 = (bxvd) bmbd.mo74142c(5);
                bxvd2.mo73625a((bxvk) bmbd);
                bmba bmba2 = (bmba) bxvd2;
                List unmodifiableList = Collections.unmodifiableList(((bmbd) bmba2.f164949b).f128531e);
                awec.m79679a();
                Account[] a3 = awec.m79681a(context);
                m79984a(a3, (bmbd) bmba2.mo74062i());
                int length2 = a3.length;
                if (bmba2.f164950c) {
                    bmba2.mo74035c();
                    bmba2.f164950c = false;
                }
                ((bmbd) bmba2.f164949b).f128531e = bxvk.m124030de();
                if (length2 > 1 || ((bmbd) bmba2.f164949b).f128532f) {
                    while (i2 < length2) {
                        Account account = a3[i2];
                        Iterator it = unmodifiableList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                bmaw = null;
                                break;
                            }
                            bmaw = (bmaw) it.next();
                            if (bmaw.f128514d.equals(account.name)) {
                                break;
                            }
                        }
                        if (bmaw == null) {
                            bmaw = m79970a(account, i2);
                        }
                        bmba2.mo66777a(bmaw);
                        i2++;
                    }
                }
                if (((bmbd) bmba2.f164949b).f128531e.size() > 0) {
                    return (bmbd) bmba2.mo74062i();
                }
            }
        } else {
            bxvd bxvd3 = (bxvd) bmbd.mo74142c(5);
            bxvd3.mo73625a((bxvk) bmbd);
            bmbd bmbd2 = (bmbd) ((bmba) bxvd3).mo74062i();
            awec.m79679a();
            m79984a(awec.m79681a(context), bmbd2);
            if (bmbd2.f128531e.size() > 0) {
                return bmbd2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static bmfv m79972a(Fragment fragment, Bundle bundle) {
        int i;
        bmhj bmhj;
        bkbh bkbh;
        bmqf bmqf;
        int i2;
        int i3;
        bmjf bmjf;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        bxvd da = bmfv.f129179c.mo74144da();
        int i4 = 2;
        int i5 = 1;
        boolean z = false;
        if (fragment2 instanceof axbb) {
            axbb axbb = (axbb) fragment2;
            bmhz bmhz = (bmhz) bmia.f129522m.mo74144da();
            bmdn bmdn = ((bmhy) axbb.f124069w).f129506b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            String str = bmdn.f128834b;
            if (bmhz.f164950c) {
                bmhz.mo74035c();
                bmhz.f164950c = false;
            }
            bmia bmia = (bmia) bmhz.f164949b;
            str.getClass();
            int i6 = bmia.f129524a | 1;
            bmia.f129524a = i6;
            bmia.f129525b = str;
            axbe axbe = axbb.f95616a;
            CreditCardNumberEditText creditCardNumberEditText = axbe.f95655b;
            String str2 = creditCardNumberEditText.f152257b;
            str2.getClass();
            bmia.f129524a = 4 | i6;
            bmia.f129527d = str2;
            String g = creditCardNumberEditText.mo66001g();
            bmhu h = axbe.f95655b.mo66002h();
            int h2 = axbe.f95658e.mo66002h();
            if (bmhz.f164950c) {
                bmhz.mo74035c();
                bmhz.f164950c = false;
            }
            bmia bmia2 = (bmia) bmhz.f164949b;
            bmia2.f129524a |= 16;
            bmia2.f129529f = h2;
            int i7 = axbe.f95658e.mo66003i();
            if (bmhz.f164950c) {
                bmhz.mo74035c();
                bmhz.f164950c = false;
            }
            bmia bmia3 = (bmia) bmhz.f164949b;
            int i8 = bmia3.f129524a | 32;
            bmia3.f129524a = i8;
            bmia3.f129530g = i7;
            g.getClass();
            bmia3.f129524a = i8 | 128;
            bmia3.f129532i = g;
            String obj = axbe.f95657d.getText().toString();
            if (bmhz.f164950c) {
                bmhz.mo74035c();
                bmhz.f164950c = false;
            }
            bmia bmia4 = (bmia) bmhz.f164949b;
            obj.getClass();
            int i9 = bmia4.f129524a | 8;
            bmia4.f129524a = i9;
            bmia4.f129528e = obj;
            if (h != null) {
                bxtx bxtx = h.f129495e;
                bxtx.getClass();
                bmia4.f129524a = i9 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bmia4.f129534k = bxtx;
            }
            if (axbe.f95671r) {
                String obj2 = axbe.f95660g.getText().toString();
                if (bmhz.f164950c) {
                    bmhz.mo74035c();
                    bmhz.f164950c = false;
                }
                bmia bmia5 = (bmia) bmhz.f164949b;
                obj2.getClass();
                bmia5.f129524a |= 2;
                bmia5.f129526c = obj2;
            }
            if (axbe.f95668o != null) {
                ((bmia) bmhz.f164949b).f129533j = bxvk.m124030de();
                bmhz.mo66794a(axbe.f95668o);
                bmik bmik = axbe.f95668o;
                int i10 = bmik.f129583e;
                if (i10 != 0) {
                    bmia bmia6 = (bmia) bmhz.f164949b;
                    if (bmia6.f129529f == i10 && bmia6.f129530g == bmik.f129584f) {
                        i2 = 3;
                        i3 = (!TextUtils.isEmpty(bmik.f129582d) || !sdg.m34949a(axbe.f95668o.f129582d, str2)) ? 2 : 3;
                    }
                }
                i2 = 2;
                if (!TextUtils.isEmpty(bmik.f129582d)) {
                }
            } else {
                i3 = 2;
                i2 = 2;
            }
            awqc.m80662a(axbe.getActivity(), new CreditCardEntrySubmittedEvent(i3 - 1, i2 - 1, axbe.f95673t));
            axaz axaz = axbb.f95617b;
            if (axaz != null && !axaz.mo52967m().isEmpty()) {
                String m = axbb.f95617b.mo52967m();
                if (bmhz.f164950c) {
                    bmhz.mo74035c();
                    bmhz.f164950c = false;
                }
                bmia bmia7 = (bmia) bmhz.f164949b;
                m.getClass();
                bmia7.f129524a |= 2;
                bmia7.f129526c = m;
            }
            bmbs a = axbb.f95618c.mo52928a(Bundle.EMPTY);
            if (bmhz.f164950c) {
                bmhz.mo74035c();
                bmhz.f164950c = false;
            }
            bmia bmia8 = (bmia) bmhz.f164949b;
            a.getClass();
            bmia8.f129531h = a;
            int i11 = bmia8.f129524a | 64;
            bmia8.f129524a = i11;
            if ((i11 & 64) != 0) {
                bmbs bmbs = bmia8.f129531h;
                if (bmbs == null) {
                    bmbs = bmbs.f128609j;
                }
                if ((bmbs.f128611a & 8) != 0) {
                    bmbs bmbs2 = ((bmia) bmhz.f164949b).f129531h;
                    if (bmbs2 == null) {
                        bmbs2 = bmbs.f128609j;
                    }
                    bxvd bxvd = (bxvd) bmbs2.mo74142c(5);
                    bxvd.mo73625a((bxvk) bmbs2);
                    bmbs bmbs3 = ((bmia) bmhz.f164949b).f129531h;
                    if (bmbs3 == null) {
                        bmbs3 = bmbs.f128609j;
                    }
                    btwp btwp = bmbs3.f128615e;
                    if (btwp == null) {
                        btwp = btwp.f152728s;
                    }
                    bxvd bxvd2 = (bxvd) btwp.mo74142c(5);
                    bxvd2.mo73625a((bxvk) btwp);
                    btwo btwo = (btwo) bxvd2;
                    String str3 = ((bmia) bmhz.f164949b).f129526c;
                    if (btwo.f164950c) {
                        btwo.mo74035c();
                        btwo.f164950c = false;
                    }
                    btwp btwp2 = (btwp) btwo.f164949b;
                    str3.getClass();
                    btwp2.f152730a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    btwp2.f152747r = str3;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bmbs bmbs4 = (bmbs) bxvd.f164949b;
                    btwp btwp3 = (btwp) btwo.mo74062i();
                    btwp3.getClass();
                    bmbs4.f128615e = btwp3;
                    bmbs4.f128611a |= 8;
                    if (bmhz.f164950c) {
                        bmhz.mo74035c();
                        bmhz.f164950c = false;
                    }
                    bmia bmia9 = (bmia) bmhz.f164949b;
                    bmbs bmbs5 = (bmbs) bxvd.mo74062i();
                    bmbs5.getClass();
                    bmia9.f129531h = bmbs5;
                    bmia9.f129524a |= 64;
                }
            }
            axbt axbt = axbb.f95619d;
            if (!(axbt == null || (bmjf = axbt.f95734b) == null)) {
                String str4 = bmjf.f129693g;
                if (bmhz.f164950c) {
                    bmhz.mo74035c();
                    bmhz.f164950c = false;
                }
                bmia bmia10 = (bmia) bmhz.f164949b;
                str4.getClass();
                bmia10.f129524a |= 512;
                bmia10.f129535l = str4;
            }
            bmia bmia11 = (bmia) bmhz.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv = (bmfv) da.f164949b;
            bmia11.getClass();
            bmfv.f129182b = bmia11;
            bmfv.f129181a = 1;
        } else if (fragment2 instanceof axax) {
            axax axax = (axax) fragment2;
            bxvd da2 = bmhj.f129426h.mo74144da();
            bmdn bmdn2 = ((bmhi) axax.f124069w).f129412b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            if ((bmdn2.f128833a & 1) != 0) {
                bmdn bmdn3 = ((bmhi) axax.f124069w).f129412b;
                if (bmdn3 == null) {
                    bmdn3 = bmdn.f128831k;
                }
                String str5 = bmdn3.f128834b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmhj bmhj2 = (bmhj) da2.f164949b;
                str5.getClass();
                bmhj2.f129428a |= 1;
                bmhj2.f129429b = str5;
            }
            bmdn bmdn4 = ((bmhi) axax.f124069w).f129412b;
            if (bmdn4 == null) {
                bmdn4 = bmdn.f128831k;
            }
            if ((bmdn4.f128833a & 4) != 0) {
                bmdn bmdn5 = ((bmhi) axax.f124069w).f129412b;
                if (bmdn5 == null) {
                    bmdn5 = bmdn.f128831k;
                }
                bxtx bxtx2 = bmdn5.f128836d;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmhj bmhj3 = (bmhj) da2.f164949b;
                bxtx2.getClass();
                bmhj3.f129428a |= 2;
                bmhj3.f129430c = bxtx2;
            }
            if (!axax.f123895v.isEmpty()) {
                List list = axax.f123895v;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmhj bmhj4 = (bmhj) da2.f164949b;
                bmhj4.mo66792b();
                bxsy.m123078a(list, bmhj4.f129433f);
            }
            String str6 = axax.f123876c.f151874a;
            if (str6 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmhj bmhj5 = (bmhj) da2.f164949b;
                str6.getClass();
                bmhj5.f129428a |= 4;
                bmhj5.f129431d = str6;
            }
            bmhq bmhq = axax.f123890q;
            if (bmhq != null) {
                bxtx bxtx3 = bmhq.f129463d;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmhj bmhj6 = (bmhj) da2.f164949b;
                bxtx3.getClass();
                bmhj6.f129428a |= 8;
                bmhj6.f129434g = bxtx3;
                bkbh bkbh2 = axax.f123886m;
                int size = bkbh2.f123934q.f129469j.size();
                bmhl[] bmhlArr = new bmhl[size];
                int i12 = 0;
                while (i12 < size) {
                    int b = bkbh2.f123934q.f129469j.mo74151b(i12);
                    bmhk bmhk = (bmhk) ((bmhi) bkbh2.f124069w).f129414d.get(b);
                    bxvd da3 = bmhl.f129444f.mo74144da();
                    bmdn bmdn6 = bmhk.f129438b;
                    if (bmdn6 == null) {
                        bmdn6 = bmdn.f128831k;
                    }
                    bxtx bxtx4 = bmdn6.f128836d;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = z;
                    }
                    bmhl bmhl = (bmhl) da3.f164949b;
                    bxtx4.getClass();
                    bmhl.f129446a |= i4;
                    bmhl.f129448c = bxtx4;
                    bmdn bmdn7 = bmhk.f129438b;
                    if (bmdn7 == null) {
                        bmdn7 = bmdn.f128831k;
                    }
                    if ((bmdn7.f128833a & i5) != 0) {
                        bmdn bmdn8 = bmhk.f129438b;
                        if (bmdn8 == null) {
                            bmdn8 = bmdn.f128831k;
                        }
                        String str7 = bmdn8.f128834b;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = z;
                        }
                        bmhl bmhl2 = (bmhl) da3.f164949b;
                        str7.getClass();
                        bmhl2.f129446a |= i5;
                        bmhl2.f129447b = str7;
                    }
                    ArrayList arrayList = (ArrayList) bkbh2.f123933p.get(b);
                    int size2 = bmhk.f129440d.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        bkbf bkbf = (bkbf) arrayList.get(i13);
                        bxvd da4 = bmhd.f129402c.mo74144da();
                        int i14 = bkbf.f123914a;
                        if (i14 == i5) {
                            View view = (View) bkbh2.f123921d.get(bkbf.f123915b);
                            bmhc bmhc = (bmhc) bmhk.f129440d.get(i13);
                            bkbh = bkbh2;
                            if (bmhc.f129398a == 1) {
                                bmqf = (bmqf) bmhc.f129399b;
                            } else {
                                bmqf = bmqf.f130370r;
                            }
                            bmqk a2 = bkft.m105631a(view, bmqf);
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bmhd bmhd = (bmhd) da4.f164949b;
                            a2.getClass();
                            bmhd.f129405b = a2;
                            bmhd.f129404a = 1;
                        } else if (i14 == 2) {
                            bmdt a3 = ((bkev) bkbh2.f123923f.get(bkbf.f123915b)).mo65918a(bundle2);
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bmhd bmhd2 = (bmhd) da4.f164949b;
                            a3.getClass();
                            bmhd2.f129405b = a3;
                            bmhd2.f129404a = 3;
                            bkbh = bkbh2;
                        } else if (i14 == 4) {
                            bmbs a4 = ((bjzp) bkbh2.f123922e.get(bkbf.f123915b)).mo52928a(bundle2);
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bmhd bmhd3 = (bmhd) da4.f164949b;
                            a4.getClass();
                            bmhd3.f129405b = a4;
                            bmhd3.f129404a = 2;
                            bkbh = bkbh2;
                        } else {
                            StringBuilder sb = new StringBuilder(45);
                            sb.append("Unknown field type ");
                            sb.append(i14);
                            sb.append(" in SimpleForm.");
                            throw new IllegalStateException(sb.toString());
                        }
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bmhl bmhl3 = (bmhl) da3.f164949b;
                        bmhd bmhd4 = (bmhd) da4.mo74062i();
                        bmhd4.getClass();
                        bmhl3.mo66793a();
                        bmhl3.f129449d.add(bmhd4);
                        i13++;
                        bkbh2 = bkbh;
                        i5 = 1;
                    }
                    bkbh bkbh3 = bkbh2;
                    if ((bmhk.f129437a & 8) != 0) {
                        bmjf bmjf2 = bmhk.f129443g;
                        if (bmjf2 == null) {
                            bmjf2 = bmjf.f129685i;
                        }
                        String str8 = bmjf2.f129693g;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bmhl bmhl4 = (bmhl) da3.f164949b;
                        str8.getClass();
                        bmhl4.f129446a |= 4;
                        bmhl4.f129450e = str8;
                    }
                    bmhlArr[i12] = (bmhl) da3.mo74062i();
                    i12++;
                    bkbh2 = bkbh3;
                    i4 = 2;
                    i5 = 1;
                    z = false;
                }
                List asList = Arrays.asList(bmhlArr);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmhj bmhj7 = (bmhj) da2.f164949b;
                bmhj7.mo66791a();
                bxsy.m123078a(asList, bmhj7.f129432e);
                bmhj = (bmhj) da2.mo74062i();
            } else {
                bmhj = (bmhj) da2.mo74062i();
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv2 = (bmfv) da.f164949b;
            bmhj.getClass();
            bmfv2.f129182b = bmhj;
            bmfv2.f129181a = 12;
        } else if (fragment2 instanceof bkhr) {
            bkhr bkhr = (bkhr) fragment2;
            bxvd da5 = bmim.f129596f.mo74144da();
            bmdn bmdn9 = ((bmil) bkhr.f124069w).f129591b;
            if (bmdn9 == null) {
                bmdn9 = bmdn.f128831k;
            }
            if ((bmdn9.f128833a & 1) != 0) {
                String str9 = bmdn9.f128834b;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bmim bmim = (bmim) da5.f164949b;
                str9.getClass();
                bmim.f129598a |= 1;
                bmim.f129599b = str9;
            }
            if ((bmdn9.f128833a & 4) != 0) {
                bxtx bxtx5 = bmdn9.f128836d;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bmim bmim2 = (bmim) da5.f164949b;
                bxtx5.getClass();
                bmim2.f129598a |= 2;
                bmim2.f129600c = bxtx5;
            }
            bmil bmil = (bmil) bkhr.f124069w;
            if ((bmil.f129590a & 512) != 0) {
                bmjf bmjf3 = bmil.f129595f;
                if (bmjf3 == null) {
                    bmjf3 = bmjf.f129685i;
                }
                String str10 = bmjf3.f129693g;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bmim bmim3 = (bmim) da5.f164949b;
                str10.getClass();
                bmim3.f129598a |= 4;
                bmim3.f129601d = str10;
                i = 0;
            } else {
                i = 0;
            }
            while (i < ((bmil) bkhr.f124069w).f129592c.size()) {
                bmqk a5 = bkft.m105631a(bkhr.f124229b[i], (bmqf) ((bmil) bkhr.f124069w).f129592c.get(i));
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bmim bmim4 = (bmim) da5.f164949b;
                a5.getClass();
                if (!bmim4.f129602e.mo73666a()) {
                    bmim4.f129602e = bxvk.m124021a(bmim4.f129602e);
                }
                bmim4.f129602e.add(a5);
                i++;
            }
            bmim bmim5 = (bmim) da5.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv3 = (bmfv) da.f164949b;
            bmim5.getClass();
            bmfv3.f129182b = bmim5;
            bmfv3.f129181a = 4;
        } else if (fragment2 instanceof awzs) {
            bmed c = ((awzs) fragment2).mo52944a(bundle2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv4 = (bmfv) da.f164949b;
            c.getClass();
            bmfv4.f129182b = c;
            bmfv4.f129181a = 11;
        } else if (fragment2 instanceof axby) {
            bmjc t = ((axby) fragment2).mo66101t();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv5 = (bmfv) da.f164949b;
            t.getClass();
            bmfv5.f129182b = t;
            bmfv5.f129181a = 6;
        } else if (fragment2 instanceof bkal) {
            bkal bkal = (bkal) fragment2;
            bxvd da6 = bmgq.f129306h.mo74144da();
            bmdn bmdn10 = ((bmgp) bkal.f124069w).f129299b;
            if (bmdn10 == null) {
                bmdn10 = bmdn.f128831k;
            }
            if ((bmdn10.f128833a & 1) != 0) {
                bmdn bmdn11 = ((bmgp) bkal.f124069w).f129299b;
                if (bmdn11 == null) {
                    bmdn11 = bmdn.f128831k;
                }
                String str11 = bmdn11.f128834b;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bmgq bmgq = (bmgq) da6.f164949b;
                str11.getClass();
                bmgq.f129308a |= 1;
                bmgq.f129309b = str11;
            }
            bmdn bmdn12 = ((bmgp) bkal.f124069w).f129299b;
            if (bmdn12 == null) {
                bmdn12 = bmdn.f128831k;
            }
            if ((bmdn12.f128833a & 4) != 0) {
                bmdn bmdn13 = ((bmgp) bkal.f124069w).f129299b;
                if (bmdn13 == null) {
                    bmdn13 = bmdn.f128831k;
                }
                bxtx bxtx6 = bmdn13.f128836d;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bmgq bmgq2 = (bmgq) da6.f164949b;
                bxtx6.getClass();
                bmgq2.f129308a |= 2;
                bmgq2.f129310c = bxtx6;
            }
            int size3 = ((bmgp) bkal.f124069w).f129305h.size();
            for (int i15 = 0; i15 < size3; i15++) {
                String str12 = ((bmjf) ((bmgp) bkal.f124069w).f129305h.get(i15)).f129693g;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bmgq bmgq3 = (bmgq) da6.f164949b;
                str12.getClass();
                if (!bmgq3.f129314g.mo73666a()) {
                    bmgq3.f129314g = bxvk.m124021a(bmgq3.f129314g);
                }
                bmgq3.f129314g.add(str12);
            }
            int size4 = bkal.f123807b.size();
            for (int i16 = 0; i16 < size4; i16++) {
                bmqk a6 = bkft.m105631a((View) bkal.f123807b.get(i16), (bmqf) ((bmgp) bkal.f124069w).f129301d.get(i16));
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bmgq bmgq4 = (bmgq) da6.f164949b;
                a6.getClass();
                if (!bmgq4.f129311d.mo73666a()) {
                    bmgq4.f129311d = bxvk.m124021a(bmgq4.f129311d);
                }
                bmgq4.f129311d.add(a6);
            }
            bkag bkag = bkal.f123810e;
            if (bkag != null) {
                bmbs a7 = bkag.mo52928a((Bundle) null);
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bmgq bmgq5 = (bmgq) da6.f164949b;
                a7.getClass();
                bmgq5.f129312e = a7;
                bmgq5.f129308a |= 4;
            }
            bkag bkag2 = bkal.f123811f;
            if (bkag2 != null) {
                bmbs a8 = bkag2.mo52928a((Bundle) null);
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bmgq bmgq6 = (bmgq) da6.f164949b;
                a8.getClass();
                bmgq6.f129313f = a8;
                bmgq6.f129308a |= 8;
            }
            bmgq bmgq7 = (bmgq) da6.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv6 = (bmfv) da.f164949b;
            bmgq7.getClass();
            bmfv6.f129182b = bmgq7;
            bmfv6.f129181a = 7;
        } else if (fragment2 instanceof bkiz) {
            bkiz bkiz = (bkiz) fragment2;
            if (((Boolean) bjwe.f123475J.mo54082a()).booleanValue()) {
                if (bkiz.f124349k == null) {
                    bkiz.f124349k = bkiz.mo66069u();
                }
                bmkj bmkj = bkiz.f124349k;
                bxvd bxvd3 = (bxvd) bmkj.mo74142c(5);
                bxvd3.mo73625a((bxvk) bmkj);
                boolean z2 = bkiz.f124351m;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bmkj bmkj2 = (bmkj) bxvd3.f164949b;
                bmkj bmkj3 = bmkj.f129827l;
                bmkj2.f129829a |= 32;
                bmkj2.f129835g = z2;
                bkiz.f124349k = (bmkj) bxvd3.mo74062i();
            }
            bmkj bmkj4 = bkiz.f124349k;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv7 = (bmfv) da.f164949b;
            bmkj4.getClass();
            bmfv7.f129182b = bmkj4;
            bmfv7.f129181a = 13;
        } else if (fragment2 instanceof axbi) {
            axbi axbi = (axbi) fragment2;
            if (axbi.mo66004t() != null) {
                bmis t2 = axbi.mo66004t();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmfv bmfv8 = (bmfv) da.f164949b;
                t2.getClass();
                bmfv8.f129182b = t2;
                bmfv8.f129181a = 14;
            }
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Fragment=%s is not a valid instrument fragment", fragment2));
        }
        return (bmfv) da.mo74062i();
    }

    /* renamed from: a */
    public static synchronized ImageLoader m79973a() {
        ImageLoader imageLoader;
        synchronized (awia.class) {
            if (f94396r == null) {
                f94396r = new ImageLoader(rpr.m34216b().getRequestQueue(), new bjvc(rpr.m34216b(), ((Integer) awir.f94489b.mo58455c()).intValue()));
            }
            imageLoader = f94396r;
        }
        return imageLoader;
    }

    /* renamed from: a */
    public static void m79974a(Context context, View view) {
        view.animate().cancel();
        view.setVisibility(0);
        view.setAlpha(0.0f);
        view.setPivotY((float) view.getHeight());
        view.setRotationX(1.5f);
        view.setScaleX(0.97f);
        view.setScaleY(0.97f);
        int integer = context.getResources().getInteger(C0126R.integer.wallet_instrument_on_load_anim_duration_ms);
        ViewPropertyAnimator duration = view.animate().setInterpolator(new akc()).scaleX(1.0f).scaleY(1.0f).rotationX(0.0f).setDuration((long) integer);
        ViewPropertyAnimator duration2 = view.animate().alpha(1.0f).setDuration((long) (integer / 2));
        duration.start();
        duration2.start();
    }

    /* renamed from: a */
    public static void m79975a(Context context, View view, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, eoi.f15408t);
        int i2 = obtainStyledAttributes.getInt(0, -1);
        if (i2 >= 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = i2;
                view.setLayoutParams(layoutParams2);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(android.content.Context, android.view.View, int):void
     arg types: [android.content.Context, android.widget.TextView, int]
     candidates:
      awia.a(android.content.Context, android.widget.TextView, int):void
      awia.a(android.content.Context, com.google.android.wallet.ui.common.InfoMessageView, int):void
      awia.a(com.google.android.chimera.Activity, boolean, awhz):void
      awia.a(android.content.Context, android.view.View, int):void */
    /* renamed from: a */
    public static void m79976a(Context context, TextView textView, int i) {
        textView.setTextAppearance(context, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, eoi.f15412x);
        int i2 = obtainStyledAttributes.getInt(0, -1);
        if (i2 >= 0) {
            textView.setGravity(i2);
        }
        m79975a(context, (View) textView, i);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, new int[]{16843039});
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, -1);
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize != -1) {
            textView.setMaxWidth(dimensionPixelSize);
        }
    }

    /* renamed from: a */
    public static void m79977a(Context context, InfoMessageView infoMessageView, int i) {
        TextView[] textViewArr = {infoMessageView.f152078b, infoMessageView.f152079c};
        for (int i2 = 0; i2 < 2; i2++) {
            m79976a(context, textViewArr[i2], i);
        }
    }

    /* renamed from: a */
    public static void m79978a(View view) {
        m79979a(view, ((Boolean) awjl.f94548j.mo58455c()).booleanValue());
    }

    /* renamed from: a */
    public static void m79979a(View view, boolean z) {
        view.setFilterTouchesWhenObscured(z);
        if (view.getFilterTouchesWhenObscured() != z) {
            view.setFilterTouchesWhenObscured(!z);
        }
    }

    /* renamed from: a */
    public static void m79980a(ViewParent viewParent, View view) {
        while (viewParent != null) {
            if (viewParent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) viewParent;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            if (viewParent != view) {
                viewParent = viewParent.getParent();
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, boolean, awhz):void
     arg types: [com.google.android.chimera.Activity, int, awhz]
     candidates:
      awia.a(android.content.Context, android.view.View, int):void
      awia.a(android.content.Context, android.widget.TextView, int):void
      awia.a(android.content.Context, com.google.android.wallet.ui.common.InfoMessageView, int):void
      awia.a(com.google.android.chimera.Activity, boolean, awhz):void */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016e  */
    /* renamed from: a */
    public static void m79981a(Activity activity, BuyFlowConfig buyFlowConfig, awhz awhz, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        boolean z4;
        int i3;
        Context context;
        Activity activity2 = activity;
        BuyFlowConfig buyFlowConfig2 = buyFlowConfig;
        awhz awhz2 = awhz;
        boolean z5 = false;
        if (buyFlowConfig2 != null) {
            boolean a = m79990a(activity, buyFlowConfig);
            WalletCustomTheme walletCustomTheme = buyFlowConfig2.f110418b.f110411f;
            boolean a2 = m79992a(walletCustomTheme);
            z2 = m80000b(walletCustomTheme);
            if (a2) {
                if (awhz2 == f94383e) {
                    awhz2 = f94392n;
                } else if (awhz2 == f94380b) {
                    awhz2 = f94393o;
                } else if (awhz2 == f94381c) {
                    awhz2 = f94394p;
                } else if (awhz2 == f94384f) {
                    awhz2 = f94395q;
                } else {
                    a2 = false;
                }
            } else if (z2 && awhz2 == f94383e) {
                awhz2 = f94390l;
            }
            int i4 = Build.VERSION.SDK_INT;
            if (walletCustomTheme == null || walletCustomTheme.f110168a == 0) {
                m79982a(activity2, a, awhz2);
                if (!a2 && !z2) {
                    z4 = a2;
                    z3 = z4;
                    z5 = a;
                }
            } else {
                WalletCustomTheme walletCustomTheme2 = buyFlowConfig2.f110418b.f110411f;
                String str = !TextUtils.isEmpty(walletCustomTheme2.f110170c) ? walletCustomTheme2.f110170c : buyFlowConfig2.f110419c;
                WeakReference weakReference = f94391m;
                if (weakReference != null) {
                    context = (Context) weakReference.get();
                } else {
                    context = null;
                }
                if (context == null || !context.getPackageName().equals(str)) {
                    try {
                        context = activity2.createPackageContext(str, 0);
                        f94391m = new WeakReference(context);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Could not create client context for packageName=%s", str), e);
                    }
                }
                if (context != null) {
                    Resources.Theme newTheme = context.getResources().newTheme();
                    newTheme.applyStyle(walletCustomTheme2.f110168a, true);
                    activity.getTheme().setTo(newTheme);
                    activity.getTheme().applyStyle(awhz2.mo52171a(m79990a(activity, buyFlowConfig)), false);
                } else {
                    m79982a(activity2, m79990a(activity, buyFlowConfig), awhz2);
                }
                TypedArray obtainStyledAttributes = activity2.obtainStyledAttributes(new int[]{C0126R.attr.colorPrimary});
                int color = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
                activity2.setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, color));
            }
            if (activity.getTheme() != null) {
                int i5 = walletCustomTheme.f110169b.getInt("toolbarTextColorStyle", -1);
                int i6 = walletCustomTheme.f110169b.getInt("customThemeStyle", 0);
                if (i6 == 2 || i6 == 3) {
                    z4 = a2;
                    if (!a) {
                        i5 = 2;
                        if (i5 != 2) {
                            i3 = C0126R.style.ThemeOverlay_Wallet_ActionBar_TextColor_Light;
                        } else {
                            i3 = C0126R.style.ThemeOverlay_Wallet_ActionBar_TextColor_Dark;
                        }
                        activity.getTheme().applyStyle(i3, true);
                    }
                } else {
                    if (i5 == -1) {
                        TypedArray obtainStyledAttributes2 = activity2.obtainStyledAttributes(new int[]{C0126R.attr.colorPrimary});
                        int color2 = obtainStyledAttributes2.getColor(0, 0);
                        obtainStyledAttributes2.recycle();
                        if (color2 != 0) {
                            double red = (double) Color.red(color2);
                            Double.isNaN(red);
                            z4 = a2;
                            double green = (double) Color.green(color2);
                            Double.isNaN(green);
                            double d = (red * 0.299d) + (green * 0.587d);
                            double blue = (double) Color.blue(color2);
                            Double.isNaN(blue);
                            if (1.0d - ((d + (blue * 0.114d)) / 255.0d) < 0.5d) {
                                i5 = 2;
                            }
                        } else {
                            z4 = a2;
                        }
                    } else {
                        z4 = a2;
                    }
                    if (i5 != 2) {
                    }
                    activity.getTheme().applyStyle(i3, true);
                }
                i5 = 1;
                if (i5 != 2) {
                }
                activity.getTheme().applyStyle(i3, true);
            } else {
                z4 = a2;
            }
            z3 = z4;
            z5 = a;
        } else {
            m79982a(activity2, false, awhz2);
            z3 = false;
            z2 = false;
        }
        if (awhz2 == f94379a || awhz2 == f94384f || awhz2 == f94395q) {
            if (!z3) {
                i2 = !z5 ? C0126R.C0127drawable.wallet_dialog_background_light : C0126R.C0127drawable.wallet_dialog_background_dark;
            } else {
                i2 = !z5 ? C0126R.C0127drawable.wallet_uic_dialog_background_gm2 : C0126R.C0127drawable.wallet_dialog_background_gm2_dark;
            }
            activity.getWindow().setBackgroundDrawableResource(i2);
        }
        if (z && !z2) {
            activity.getTheme().applyStyle(!z3 ? C0126R.style.WalletToolbarWithCloseButtonStyle : C0126R.style.WalletGm2ToolbarWithCloseButtonStyle, true);
        }
        if (z3) {
            int i7 = Build.VERSION.SDK_INT;
            if (z5) {
                i = C1133kh.m17843b(activity2, C0126R.color.wallet_background_dark);
            } else {
                i = -1;
            }
            activity2.setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, i));
        }
    }

    /* renamed from: a */
    private static void m79982a(Activity activity, boolean z, awhz awhz) {
        activity.setTheme(awhz.mo52171a(z));
    }

    /* renamed from: a */
    public static void m79983a(FifeNetworkImageView fifeNetworkImageView, bmno bmno) {
        if (bmno == null || bmno.f130142c.isEmpty()) {
            fifeNetworkImageView.setVisibility(8);
            return;
        }
        fifeNetworkImageView.setVisibility(0);
        if (fifeNetworkImageView instanceof ImageWithCaptionView) {
            ((ImageWithCaptionView) fifeNetworkImageView).mo71992a(bmno, m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
            return;
        }
        fifeNetworkImageView.mo71890a(bmno.f130142c, m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue(), bmno.f130143d);
        fifeNetworkImageView.setContentDescription(bmno.f130149j);
    }

    /* renamed from: a */
    private static void m79984a(Account[] accountArr, bmbd bmbd) {
        int length = accountArr.length;
        bxwc bxwc = bmbd.f128531e;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            bmaw bmaw = (bmaw) bxwc.get(i);
            int i2 = 0;
            while (i2 < length) {
                if (!bmaw.f128514d.equals(accountArr[i2].name)) {
                    i2++;
                } else {
                    i++;
                }
            }
            throw new IllegalStateException(String.format(Locale.US, "Invalid account returned from Orch: %s", bmaw.f128514d));
        }
    }

    /* renamed from: a */
    public static boolean m79985a(Context context) {
        return C1710chip.m148790b() && bkfr.m105623i(context);
    }

    /* renamed from: a */
    public static boolean m79986a(Resources resources) {
        return (resources.getConfiguration().screenLayout & 15) >= 3;
    }

    /* renamed from: a */
    public static boolean m79987a(bkdx bkdx, bmfu bmfu) {
        int i = bmfu.f129169a;
        if ((i & 1) != 0) {
            return bkdx instanceof axbb;
        }
        if ((i & 32) != 0) {
            return bkdx instanceof axax;
        }
        if ((i & 2) != 0) {
            return bkdx instanceof bkhr;
        }
        if ((i & 8) != 0) {
            if (bkdx instanceof awzs) {
                awzs awzs = (awzs) bkdx;
                bmeb bmeb = bmfu.f129173e;
                if (bmeb == null) {
                    bmeb = bmeb.f128902g;
                }
                bmdn bmdn = ((bmeb) awzs.f124069w).f128905b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                String str = bmdn.f128834b;
                bmdn bmdn2 = bmeb.f128905b;
                if (bmdn2 == null) {
                    bmdn2 = bmdn.f128831k;
                }
                if (str.equals(bmdn2.f128834b)) {
                    return true;
                }
            }
            return false;
        } else if ((i & 4) != 0) {
            return bkdx instanceof axby;
        } else {
            if ((i & 16) != 0) {
                return bkdx instanceof bkal;
            }
            if ((i & 64) != 0) {
                if (bkdx instanceof bkiz) {
                    bkiz bkiz = (bkiz) bkdx;
                    bmki bmki = bmfu.f129176h;
                    if (bmki == null) {
                        bmki = bmki.f129802w;
                    }
                    bmdn bmdn3 = ((bmki) bkiz.f124069w).f129805b;
                    if (bmdn3 == null) {
                        bmdn3 = bmdn.f128831k;
                    }
                    String str2 = bmdn3.f128834b;
                    bmdn bmdn4 = bmki.f129805b;
                    if (bmdn4 == null) {
                        bmdn4 = bmdn.f128831k;
                    }
                    if (str2.equals(bmdn4.f128834b)) {
                        return true;
                    }
                }
                return false;
            } else if ((i & 128) != 0) {
                return bkdx instanceof axbi;
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static boolean m79988a(bmbr bmbr) {
        return (bmbr.f128584a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || bmbr.f128594k.isEmpty() || bmbr.f128593j;
    }

    /* renamed from: a */
    public static boolean m79989a(bmgk bmgk) {
        int a = bmgj.m108003a(bmgk.f129259m);
        return (a == 0 || a == 1) ? false : true;
    }

    /* renamed from: a */
    public static boolean m79990a(Activity activity, BuyFlowConfig buyFlowConfig) {
        if (chgc.f188580a.mo6606a().mo85208a()) {
            return m79999b(activity, buyFlowConfig);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m79991a(Fragment fragment) {
        return (fragment instanceof axbb) || (fragment instanceof axax) || (fragment instanceof bkhr) || (fragment instanceof awzs) || (fragment instanceof axby) || (fragment instanceof bkal) || (fragment instanceof bkiz);
    }

    /* renamed from: a */
    public static boolean m79992a(WalletCustomTheme walletCustomTheme) {
        return m79993a(walletCustomTheme, 2);
    }

    /* renamed from: a */
    private static boolean m79993a(WalletCustomTheme walletCustomTheme, int i) {
        return walletCustomTheme != null && walletCustomTheme.f110169b.getInt("customThemeStyle", 0) == i;
    }

    /* renamed from: a */
    public static PendingIntent[] m79994a(Parcelable[] parcelableArr) {
        if (parcelableArr == null) {
            return null;
        }
        int length = parcelableArr.length;
        PendingIntent[] pendingIntentArr = new PendingIntent[length];
        for (int i = 0; i < length; i++) {
            pendingIntentArr[i] = (PendingIntent) parcelableArr[i];
        }
        return pendingIntentArr;
    }
}
