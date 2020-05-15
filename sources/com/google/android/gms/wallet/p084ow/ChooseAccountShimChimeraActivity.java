package com.google.android.gms.wallet.p084ow;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.DefaultRetryPolicy;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.activity.OrchestrationDelegatorChimeraActivity;
import com.google.android.gms.wallet.addinstrument.AddInstrumentRootChimeraActivity;
import com.google.android.gms.wallet.buyflow.CheckoutChimeraActivity;
import com.google.android.gms.wallet.embeddedsettings.EmbeddedSettingsChimeraActivity;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.fixinstrument.FixInstrumentRootChimeraActivity;
import com.google.android.gms.wallet.idcredit.IdCreditChimeraActivity;
import com.google.android.gms.wallet.p081ib.IbPaymentRequestCompatChimeraActivity;
import com.google.android.gms.wallet.p081ib.LockScreenForFullWalletChimeraActivity;
import com.google.android.gms.wallet.p082im.ImRootChimeraActivity;
import com.google.android.gms.wallet.paymentmethods.PaymentMethodsChimeraActivity;
import com.google.android.gms.wallet.selector.InitializeGenericSelectorRootChimeraActivity;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.timelineview.TimelineViewChimeraActivity;
import com.google.android.gms.wallet.usermanagement.UserManagementChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.gms.wallet.ow.ChooseAccountShimChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChooseAccountShimChimeraActivity extends dnx implements awcl {

    /* renamed from: c */
    private static final Set f110281c = sqw.m36040a("com.google.android.gms.wallet.onlinewallet.ACTION_GET_MASKED_WALLET", "com.google.android.gms.wallet.onlinewallet.ACTION_LOCK_SCREEN_FOR_FULL_WALLET", "com.google.android.gms.identity.REQUEST_USER_ADDRESS", "com.google.android.gms.wallet.onlinewallet.ACTION_CREATE_WALLET_OBJECTS");

    /* renamed from: d */
    private static final Set f110282d = sqw.m36038a("com.google.android.gms.wallet.ib.ACTION_LOCK_SCREEN_FOR_FULL_WALLET", "com.google.android.gms.wallet.ib.ACTION_COMPAT_LOAD_WEB_PAYMENT_DATA");

    /* renamed from: b */
    BuyFlowConfig f110283b;

    /* renamed from: a */
    public static Intent m94040a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.ow.ChooseAccountShimActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction(intent.getAction());
        return intent2;
    }

    /* renamed from: b */
    private final void m94045b() {
        String str;
        bxtx bxtx;
        bxtx bxtx2;
        bxtx bxtx3;
        bxtx bxtx4;
        bxtx bxtx5;
        bxtx bxtx6;
        bxtx bxtx7;
        bxtx bxtx8;
        bxtx bxtx9;
        bxtx bxtx10;
        bxtx bxtx11;
        bxtx bxtx12;
        bxtx bxtx13;
        bxtx bxtx14;
        bxtx bxtx15;
        bxtx bxtx16;
        bxtx bxtx17;
        Intent intent;
        Intent intent2;
        String action = getIntent().getAction();
        if ("com.google.android.gms.identity.REQUEST_USER_ADDRESS".equals(action)) {
            startActivityForResult(InitializeGenericSelectorRootChimeraActivity.m94090a(this, getIntent(), this.f110283b), 600);
        } else if ("com.google.android.gms.wallet.onlinewallet.ACTION_CREATE_WALLET_OBJECTS".equals(action)) {
            startActivityForResult(RootChimeraActivity.m94054a(this, getIntent(), this.f110283b), 700);
        } else if ("com.google.android.gms.wallet.ACTION_CHECKOUT".equals(action)) {
            m94046c();
        } else if ("com.google.android.gms.wallet.ib.ACTION_LOCK_SCREEN_FOR_FULL_WALLET".equals(action)) {
            startActivityForResult(LockScreenForFullWalletChimeraActivity.m93993a(this, getIntent(), this.f110283b), 1100);
        } else if ("com.google.android.gms.wallet.ib.ACTION_COMPAT_LOAD_WEB_PAYMENT_DATA".equals(action)) {
            startActivityForResult(IbPaymentRequestCompatChimeraActivity.m93980a(this, getIntent(), this.f110283b), 1400);
        } else if ("com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_WIDGET".equals(action)) {
            m94047d();
        } else if ("com.google.android.gms.wallet.firstparty.ACTION_FIX_INSTRUMENT".equals(action)) {
            m94048e();
        } else {
            int i = 1;
            if ("com.google.android.gms.wallet.firstparty.ACTION_ALERT_ACTION".equals(action)) {
                Intent intent3 = getIntent();
                blxl blxl = (blxl) bjvp.m104733a(intent3.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), (bxxk) blxl.f128074f.mo74142c(7));
                String str2 = "";
                if (blxl.f128077b == 4) {
                    str = (String) blxl.f128078c;
                } else {
                    str = str2;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (blxl.f128077b == 4) {
                        str2 = (String) blxl.f128078c;
                    }
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                    setResult(-1);
                    finish();
                    return;
                }
                int a = blxk.m107750a(blxl.f128079d);
                if (a != 0 && a != 1) {
                    intent3.removeExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                    int a2 = blxk.m107750a(blxl.f128079d);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i2 = a2 - 1;
                    if (i2 == 1) {
                        awkx awkx = new awkx(intent3);
                        if (blxl.f128077b == 3) {
                            bxtx = (bxtx) blxl.f128078c;
                        } else {
                            bxtx = bxtx.f164797b;
                        }
                        if (bxtx.mo73744a() <= 0) {
                            if (blxl.f128077b == 2) {
                                bxtx3 = (bxtx) blxl.f128078c;
                            } else {
                                bxtx3 = bxtx.f164797b;
                            }
                            if (bxtx3.mo73744a() > 0) {
                                if (blxl.f128077b == 2) {
                                    bxtx4 = (bxtx) blxl.f128078c;
                                } else {
                                    bxtx4 = bxtx.f164797b;
                                }
                                awkx.mo52227b(bxtx4.mo73780k());
                            } else {
                                throw new IllegalArgumentException("BuyFlow Alert Action has no supported uiParameters");
                            }
                        } else {
                            if (blxl.f128077b == 3) {
                                bxtx2 = (bxtx) blxl.f128078c;
                            } else {
                                bxtx2 = bxtx.f164797b;
                            }
                            awkx.mo52226a(bxtx2.mo73780k());
                        }
                        m94043a(awkx.mo52186a());
                        m94046c();
                    } else if (i2 == 4) {
                        awkt awkt = new awkt(intent3);
                        if (blxl.f128077b == 3) {
                            bxtx5 = (bxtx) blxl.f128078c;
                        } else {
                            bxtx5 = bxtx.f164797b;
                        }
                        if (bxtx5.mo73744a() > 0) {
                            if (blxl.f128077b == 3) {
                                bxtx6 = (bxtx) blxl.f128078c;
                            } else {
                                bxtx6 = bxtx.f164797b;
                            }
                            awkt.mo52220a(bxtx6.mo73780k());
                            m94043a(awkt.mo52186a());
                            m94047d();
                            return;
                        }
                        throw new IllegalArgumentException("AddInstrument Alert Action has no supported uiParameters");
                    } else if (i2 == 5) {
                        awla awla = new awla(intent3);
                        if (blxl.f128077b == 3) {
                            bxtx7 = (bxtx) blxl.f128078c;
                        } else {
                            bxtx7 = bxtx.f164797b;
                        }
                        if (bxtx7.mo73744a() <= 0) {
                            if (blxl.f128077b == 2) {
                                bxtx9 = (bxtx) blxl.f128078c;
                            } else {
                                bxtx9 = bxtx.f164797b;
                            }
                            if (bxtx9.mo73744a() > 0) {
                                if (blxl.f128077b == 2) {
                                    bxtx10 = (bxtx) blxl.f128078c;
                                } else {
                                    bxtx10 = bxtx.f164797b;
                                }
                                awla.mo52230b(bxtx10.mo73780k());
                            } else {
                                throw new IllegalArgumentException("FixInstrument Alert Action has no supported uiParameters");
                            }
                        } else {
                            if (blxl.f128077b == 3) {
                                bxtx8 = (bxtx) blxl.f128078c;
                            } else {
                                bxtx8 = bxtx.f164797b;
                            }
                            awla.mo52229a(bxtx8.mo73780k());
                        }
                        m94043a(awla.mo52186a());
                        m94048e();
                    } else if (i2 == 7) {
                        if (blxl.f128077b == 8) {
                            bxtx11 = (bxtx) blxl.f128078c;
                        } else {
                            bxtx11 = bxtx.f164797b;
                        }
                        if (bxtx11.mo73744a() != 0) {
                            if (blxl.f128077b == 8) {
                                bxtx12 = (bxtx) blxl.f128078c;
                            } else {
                                bxtx12 = bxtx.f164797b;
                            }
                            bmsf bmsf = (bmsf) bjvp.m104733a(bxtx12.mo73780k(), (bxxk) bmsf.f130661f.mo74142c(7));
                            if (blxl.f128077b == 8) {
                                bxtx13 = (bxtx) blxl.f128078c;
                            } else {
                                bxtx13 = bxtx.f164797b;
                            }
                            byte[] k = bxtx13.mo73780k();
                            int a3 = bmse.m108335a(bmsf.f130666d);
                            if (a3 == 0) {
                                a3 = 1;
                            }
                            m94043a(m94041a(k, a3, intent3));
                            int a4 = bmse.m108335a(bmsf.f130666d);
                            if (a4 != 0) {
                                i = a4;
                            }
                            m94042a(i);
                            return;
                        }
                        throw new IllegalArgumentException("InstrumentManager Alert Action has no actionToken");
                    } else if (i2 != 8) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        int a5 = blxk.m107750a(blxl.f128079d);
                        if (a5 != 0) {
                            i = a5;
                        }
                        objArr[0] = Integer.toString(i - 1);
                        throw new IllegalArgumentException(String.format(locale, "Unsupported Alert Action widgetType: %s", objArr));
                    } else {
                        awlb awlb = new awlb(intent3);
                        if (blxl.f128077b == 3) {
                            bxtx14 = (bxtx) blxl.f128078c;
                        } else {
                            bxtx14 = bxtx.f164797b;
                        }
                        if (bxtx14.mo73744a() <= 0) {
                            if (blxl.f128077b == 2) {
                                bxtx16 = (bxtx) blxl.f128078c;
                            } else {
                                bxtx16 = bxtx.f164797b;
                            }
                            if (bxtx16.mo73744a() > 0) {
                                if (blxl.f128077b == 2) {
                                    bxtx17 = (bxtx) blxl.f128078c;
                                } else {
                                    bxtx17 = bxtx.f164797b;
                                }
                                awlb.mo52232b(bxtx17.mo73780k());
                            } else {
                                throw new IllegalArgumentException("IDV Alert Action has no supported uiParameters");
                            }
                        } else {
                            if (blxl.f128077b == 3) {
                                bxtx15 = (bxtx) blxl.f128078c;
                            } else {
                                bxtx15 = bxtx.f164797b;
                            }
                            awlb.mo52231a(bxtx15.mo73780k());
                        }
                        m94043a(awlb.mo52186a());
                        m94049f();
                    }
                } else if ((blxl.f128076a & 64) != 0) {
                    bwiv bwiv = blxl.f128080e;
                    if (bwiv == null) {
                        bwiv = bwiv.f159693e;
                    }
                    startActivityForResult(awia.m79967a(bwiv, intent3, this, this.f110283b), 2700);
                }
            } else if ("com.google.android.gms.wallet.firstparty.ACTION_BOOTSTRAP_WIDGET".equals(action)) {
                Intent intent4 = getIntent();
                switch (intent4.getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_TYPE", 1000)) {
                    case 1:
                        m94043a(new awkt(intent4).mo52186a());
                        m94047d();
                        return;
                    case 2:
                        m94043a(CheckoutChimeraActivity.m93851a(this, intent4, this.f110283b));
                        if (((Boolean) awig.f94436b.mo58455c()).booleanValue()) {
                            startActivityForResult(getIntent(), 800);
                            return;
                        } else {
                            startActivityForResult(getIntent(), 2600);
                            return;
                        }
                    case 3:
                        m94043a(InitializeGenericSelectorRootChimeraActivity.m94090a(this, intent4, this.f110283b));
                        startActivityForResult(getIntent(), 1700);
                        return;
                    case 4:
                        BuyFlowConfig buyFlowConfig = this.f110283b;
                        if (((Boolean) awig.f94435a.mo58455c()).booleanValue()) {
                            intent = OrchestrationDelegatorChimeraActivity.m93799a(this, intent4, buyFlowConfig);
                            intent.setAction("com.google.android.gms.wallet.firstparty.ACTION_EMBEDDED_LANDING_PAGE");
                        } else {
                            intent = axdg.m82385a(this, intent4, buyFlowConfig);
                        }
                        m94043a(intent);
                        if (((Boolean) awig.f94435a.mo58455c()).booleanValue()) {
                            startActivityForResult(getIntent(), 1800);
                            return;
                        } else {
                            startActivityForResult(getIntent(), 2600);
                            return;
                        }
                    case 5:
                        m94043a(EmbeddedSettingsChimeraActivity.m93934a(this, intent4, this.f110283b));
                        if (((Boolean) awig.f94439e.mo58455c()).booleanValue()) {
                            startActivityForResult(getIntent(), 1900);
                            return;
                        } else {
                            startActivityForResult(getIntent(), 2600);
                            return;
                        }
                    case 6:
                        m94043a(FixInstrumentRootChimeraActivity.m93940a(this, intent4, this.f110283b));
                        m94048e();
                        return;
                    case 7:
                        m94043a(IdCreditChimeraActivity.m94004a(this, intent4, this.f110283b));
                        m94049f();
                        return;
                    case 8:
                        byte[] byteArrayExtra = intent4.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                        if (byteArrayExtra != null && byteArrayExtra.length > 0) {
                            int a6 = bmse.m108335a(((bmsf) bjvp.m104733a(byteArrayExtra, (bxxk) bmsf.f130661f.mo74142c(7))).f130666d);
                            if (a6 != 0) {
                                i = a6;
                            }
                            intent2 = m94041a(byteArrayExtra, i, intent4);
                        } else {
                            intent2 = ImRootChimeraActivity.m94008a(this, intent4, this.f110283b, "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT");
                        }
                        m94043a(intent2);
                        m94042a(2);
                        return;
                    case 9:
                    case 12:
                    default:
                        Intent a7 = axdg.m82385a(this, getIntent(), this.f110283b);
                        m94043a(a7);
                        startActivityForResult(a7, 2600);
                        return;
                    case 10:
                        m94043a(PaymentMethodsChimeraActivity.m94078a(this, intent4, this.f110283b));
                        startActivityForResult(getIntent(), 2100);
                        return;
                    case 11:
                        BuyFlowConfig buyFlowConfig2 = this.f110283b;
                        Intent intent5 = new Intent();
                        intent5.setClassName(this, "com.google.android.gms.wallet.pm.PmRootActivity");
                        intent5.putExtras(intent4.getExtras());
                        intent5.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig2);
                        intent5.setAction("com.google.android.gms.wallet.firstparty.ACTION_PURCHASE_MANAGER");
                        m94043a(intent5);
                        startActivityForResult(getIntent(), 2200);
                        return;
                    case 13:
                        m94043a(TimelineViewChimeraActivity.m94187a(this, intent4, this.f110283b));
                        if (((Boolean) awig.f94438d.mo58455c()).booleanValue()) {
                            startActivityForResult(getIntent(), 2400);
                            return;
                        } else {
                            startActivityForResult(getIntent(), 2600);
                            return;
                        }
                    case 14:
                        m94043a(UserManagementChimeraActivity.m94303a(this, intent4, this.f110283b));
                        if (((Boolean) awig.f94437c.mo58455c()).booleanValue()) {
                            startActivityForResult(getIntent(), DefaultRetryPolicy.DEFAULT_TIMEOUT_MS);
                            return;
                        } else {
                            startActivityForResult(getIntent(), 2600);
                            return;
                        }
                }
            } else if (m94044a(action)) {
                setResult(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
                Log.w("ChooseAccountShimChimer", "Obsolete API called! Returning ERROR_CODE_SERVICE_UNAVAILABLE.");
                finish();
            } else {
                setResult(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
                Log.w("ChooseAccountShimChimer", "Unknown API called! Returning ERROR_CODE_SERVICE_UNAVAILABLE.");
                finish();
            }
        }
    }

    /* renamed from: c */
    private final void m94046c() {
        startActivityForResult(CheckoutChimeraActivity.m93851a(this, getIntent(), this.f110283b), 800);
    }

    /* renamed from: d */
    private final void m94047d() {
        startActivityForResult(AddInstrumentRootChimeraActivity.m93802a(this, getIntent(), this.f110283b), 1200);
    }

    /* renamed from: e */
    private final void m94048e() {
        startActivityForResult(FixInstrumentRootChimeraActivity.m93940a(this, getIntent(), this.f110283b), 1300);
    }

    /* renamed from: f */
    private final void m94049f() {
        startActivityForResult(IdCreditChimeraActivity.m94004a(this, getIntent(), this.f110283b), 1600);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo59951a() {
        return true;
    }

    /* renamed from: cn */
    public final Account mo51878cn() {
        ApplicationParameters applicationParameters;
        BuyFlowConfig buyFlowConfig = this.f110283b;
        if (buyFlowConfig == null || (applicationParameters = buyFlowConfig.f110418b) == null) {
            return null;
        }
        return applicationParameters.f110407b;
    }

    /* renamed from: h */
    public final BuyFlowConfig mo51881h() {
        return this.f110283b;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
            case 600:
            case 700:
            case 800:
            case 900:
            case 1100:
            case 1200:
            case 1300:
            case 1400:
            case 1500:
            case 1600:
            case 1700:
            case 1800:
            case 1900:
            case 2000:
            case 2100:
            case 2200:
            case 2300:
            case 2400:
            case DefaultRetryPolicy.DEFAULT_TIMEOUT_MS:
            case 2600:
            case 2700:
                setResult(i2, intent);
                finish();
                return;
            case 501:
                if (i2 != -1) {
                    Intent intent2 = new Intent();
                    awbb a = MaskedWallet.m93790a();
                    Intent intent3 = getIntent();
                    MaskedWalletRequest maskedWalletRequest = (MaskedWalletRequest) intent3.getParcelableExtra("com.google.android.gms.wallet.EXTRA_REQUEST");
                    if (maskedWalletRequest != null) {
                        a.mo51809b(maskedWalletRequest.f109856a);
                    }
                    String stringExtra = intent3.getStringExtra("com.google.android.gms.wallet.EXTRA_GOOGLE_TRANSACTION_ID");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        a.mo51808a(stringExtra);
                    }
                    intent2.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", a.f94143a);
                    setResult(0, intent2);
                    finish();
                    return;
                }
                Account account = new Account(intent.getStringExtra("authAccount"), intent.getStringExtra("accountType"));
                awxz a2 = ApplicationParameters.m94174a(this.f110283b.f110418b);
                a2.mo52742a(true);
                a2.mo52739a(account);
                ApplicationParameters applicationParameters = a2.f95270a;
                awyb a3 = BuyFlowConfig.m94176a(this.f110283b);
                a3.mo52749a(applicationParameters);
                this.f110283b = a3.mo52748a();
                m94045b();
                return;
            default:
                StringBuilder sb = new StringBuilder(58);
                sb.append("Unknown request code ");
                sb.append(i);
                sb.append(", result code: ");
                sb.append(i2);
                sb.toString();
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int length;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (!f110281c.contains(action) && !f110282d.contains(action)) {
            awcf.m79641a(this);
        }
        if (!f110282d.contains(action) || !mo59951a()) {
            setTitle("");
            if (bundle != null) {
                this.f110283b = (BuyFlowConfig) bundle.getParcelable("buyFlowConfig");
                return;
            }
            this.f110283b = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
            if ("com.google.android.gms.identity.REQUEST_USER_ADDRESS".equals(action)) {
                this.f110283b = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTA_CONFIG");
            }
            if (this.f110283b != null) {
                String a = spn.m35852a((Activity) this);
                boolean a2 = sdg.m34949a("com.google.android.gms", a);
                boolean a3 = sdg.m34949a(a, this.f110283b.f110419c);
                if (!a2 && !a3) {
                    throw new SecurityException("package name mismatch");
                }
            } else {
                Intent intent2 = getIntent();
                String action2 = intent2.getAction();
                if (!"com.google.android.gms.wallet.onlinewallet.ACTION_GET_MASKED_WALLET".equals(action2)) {
                    String valueOf = String.valueOf(action2);
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unexpected action=") : "Unexpected action=".concat(valueOf));
                }
                ApplicationParameters applicationParameters = awfl.m79846a(intent2.getBundleExtra("com.google.android.gms.wallet.EXTRA_PARAMETERS")).f95270a;
                String a4 = spn.m35852a((Activity) this);
                awyb a5 = BuyFlowConfig.m94175a();
                a5.mo52751b(a4);
                a5.mo52752c("onlinewallet");
                a5.mo52749a(applicationParameters);
                StringBuilder sb = new StringBuilder();
                if (a4 != null) {
                    sb.append(a4);
                }
                a5.mo52750a(sb.toString());
                this.f110283b = a5.mo52748a();
            }
            Account account = this.f110283b.f110418b.f110407b;
            if (!awbw.f94157a.equals(account)) {
                awec.m79679a();
                if (account != null) {
                    Account[] a6 = adyd.m51363a(this).mo33916a(account.type);
                    if (a6 != null) {
                        int length2 = a6.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                if (a6[i2].equals(account)) {
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        }
                    }
                    String valueOf2 = String.valueOf(account.name);
                    Log.w("AndroidAccountManager", valueOf2.length() == 0 ? new String("Specified account does not exist: ") : "Specified account does not exist: ".concat(valueOf2));
                    account = null;
                } else {
                    account = null;
                }
            }
            if (account == null) {
                awec.m79679a();
                Account[] a7 = awec.m79681a(this);
                if (a7 != null && (length = a7.length) > 0 && (length == 1 || "com.google.android.gms.wallet.onlinewallet.ACTION_CREATE_WALLET_OBJECTS".equals(action))) {
                    account = a7[0];
                    awxz a8 = ApplicationParameters.m94174a(this.f110283b.f110418b);
                    a8.mo52742a(true);
                    a8.mo52739a(account);
                    ApplicationParameters applicationParameters2 = a8.f95270a;
                    awyb a9 = BuyFlowConfig.m94176a(this.f110283b);
                    a9.mo52749a(applicationParameters2);
                    this.f110283b = a9.mo52748a();
                }
            }
            if ((account != null || "com.google.android.gms.wallet.ACTION_CHECKOUT".equals(action)) && !m94044a(action)) {
                m94045b();
                return;
            }
            awec.m79679a();
            if (this.f110283b.f110418b.f110410e == 1) {
                i = 1;
            } else {
                i = 0;
            }
            startActivityForResult(rew.m33487a(null, null, new String[]{"com.google"}, false, false, i), 501);
            return;
        }
        throw new SecurityException("This action can't be handled through an exported activity.");
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("buyFlowConfig", this.f110283b);
    }

    public final void startActivityForResult(Intent intent, int i) {
        int i2;
        WalletCustomTheme walletCustomTheme;
        super.startActivityForResult(intent, i);
        if (intent == null || (intent.getFlags() & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 65536) {
            BuyFlowConfig buyFlowConfig = this.f110283b;
            if (buyFlowConfig == null || (walletCustomTheme = buyFlowConfig.f110418b.f110411f) == null) {
                i2 = 1;
            } else {
                i2 = walletCustomTheme.f110169b.getInt("windowTransitionsStyle", 1);
            }
            int i3 = C0126R.anim.wallet_push_up_in;
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 0;
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        Log.w("WalletUiUtils", "Unknown window transition style. Using default animation.");
                    } else {
                        i3 = C0126R.anim.wallet_slide_in_from_right;
                    }
                }
            }
            overridePendingTransition(i3, 0);
            return;
        }
        overridePendingTransition(0, 0);
    }

    /* renamed from: a */
    private static Intent m94041a(byte[] bArr, int i, Intent intent) {
        int i2 = i - 1;
        if (i2 == 1) {
            awlc awlc = new awlc(intent);
            awlc.mo52233a(bArr);
            return awlc.mo52186a();
        } else if (i2 == 2) {
            awle awle = new awle(intent);
            awle.mo52234a(bArr);
            return awle.mo52186a();
        } else if (i2 == 3) {
            awld awld = new awld(intent);
            awld.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
            return awld.mo52186a();
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "InstrumentManager ActionToken has unsupported flowType: %d", Integer.valueOf(i2)));
        }
    }

    /* renamed from: a */
    private final void m94042a(int i) {
        String str;
        int i2 = i - 1;
        if (i2 == 1) {
            str = "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT";
        } else if (i2 == 2) {
            str = "com.google.android.gms.wallet.firstparty.ACTION_UPDATE_INSTRUMENT";
        } else if (i2 == 3) {
            str = "com.google.android.gms.wallet.firstparty.ACTION_DELETE_INSTRUMENT";
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "InstrumentManager ActionToken has unsupported flowType: %d", Integer.valueOf(i2)));
        }
        startActivityForResult(ImRootChimeraActivity.m94008a(this, getIntent(), this.f110283b, str), 1500);
    }

    /* renamed from: a */
    private final void m94043a(Intent intent) {
        setIntent(intent);
        this.f110283b = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
    }

    /* renamed from: a */
    private static final boolean m94044a(String str) {
        return "com.google.android.gms.wallet.ACTION_REVIEW_PURCHASE_OPTIONS".equals(str) || "com.google.android.gms.wallet.onlinewallet.ACTION_GET_MASKED_WALLET".equals(str) || "com.google.android.gms.wallet.onlinewallet.ACTION_LOCK_SCREEN_FOR_FULL_WALLET".equals(str);
    }
}
