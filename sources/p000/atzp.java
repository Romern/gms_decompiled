package p000;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: atzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzp {

    /* renamed from: a */
    private static final srn f91283a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final Context f91284b;

    public atzp(Context context) {
        this.f91284b = context;
    }

    /* renamed from: a */
    private static void m76608a(Bundle bundle, String str, String str2) {
        bundle.putParcelable(str2, bundle.getParcelable(str));
        bundle.remove(str);
    }

    /* renamed from: a */
    public final boolean mo50334a(Bundle bundle, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        Bundle bundle2 = bundle;
        int i3 = i;
        int i4 = i2;
        if (i3 == i4) {
            return true;
        }
        String str5 = "tokenization_status";
        int i5 = 5;
        int i6 = 4;
        if (i3 >= i4) {
            int i7 = i3;
            while (i7 > i4) {
                if (i7 != i6) {
                    if (i7 != i5) {
                        if (i7 != 6) {
                            if (i7 != 7) {
                                return false;
                            }
                            if ("proxyRequest".equals(bundle2.getString("type"))) {
                                Bundle bundle3 = bundle2.getBundle("data");
                                if (bundle3 == null) {
                                    bundle3 = new Bundle();
                                }
                                bundle3.putBundle("phenotype_flags", new Bundle());
                                bundle2.putBundle("data", bundle3);
                                str2 = str5;
                            } else {
                                str2 = str5;
                            }
                        }
                    } else if ("proxyRequest".equals(bundle2.getString("type"))) {
                        String string = bundle2.getString("activity");
                        Bundle bundle4 = bundle2.getBundle("data");
                        if (string == null || bundle4 == null) {
                            str2 = str5;
                        } else if (!"com.google.android.gms.tapandpay.tokenization.SummaryActivity".equals(string)) {
                            str2 = str5;
                        } else if (bundle4.getInt(str5) == 3) {
                            boolean z = bundle4.getBoolean("pay_pal_available");
                            bundle2.putString("activity", "com.google.android.gms.tapandpay.tokenization.UnsupportedCardActivity");
                            bundle4.clear();
                            str2 = str5;
                            bundle4.putBoolean("prompt_paypal", z);
                            bundle4.putParcelable("extra_account_info", (AccountInfo) bundle4.getParcelable("extra_account_info"));
                        } else {
                            str2 = str5;
                            bundle.clear();
                            byte[] byteArray = bundle4.getByteArray("api_error");
                            bxvd da = btnf.f149600f.mo74144da();
                            if (byteArray != null) {
                                try {
                                    da.mo73635b(byteArray, bxus.m123744c());
                                } catch (bxwf e) {
                                    bnsl bnsl = (bnsl) f91283a.mo68388c();
                                    bnsl.mo68437a(e);
                                    bnsl.mo68405a("Failed to parse api error");
                                }
                            }
                            if (((btnf) da.f164949b).f149604c.isEmpty()) {
                                str3 = this.f91284b.getString(C0126R.string.tp_summary_cannot_be_added_label);
                            } else {
                                str3 = ((btnf) da.f164949b).f149604c;
                            }
                            if (((btnf) da.f164949b).f149603b.isEmpty()) {
                                str4 = this.f91284b.getString(C0126R.string.tp_summary_cannot_be_tokenized_headline);
                            } else {
                                str4 = ((btnf) da.f164949b).f149603b;
                            }
                            bundle2.putString("type", "errorRequest");
                            bundle2.putString("errorText", str3);
                            bundle2.putString("errorTitle", str4);
                            bundle2.putBoolean("errorIsRetryable", false);
                        }
                    } else {
                        str2 = str5;
                    }
                    i7--;
                    bundle2.putInt("version", i7);
                    str5 = str2;
                    i5 = 5;
                    i6 = 4;
                }
                str2 = str5;
                i7--;
                bundle2.putInt("version", i7);
                str5 = str2;
                i5 = 5;
                i6 = 4;
            }
            return true;
        }
        String str6 = str5;
        while (i3 < i4) {
            if (i3 != 2) {
                if (!(i3 == 3 || i3 == 4)) {
                    if (i3 == 5) {
                        if ("proxyRequest".equals(bundle2.getString("type"))) {
                            String string2 = bundle2.getString("activity");
                            Bundle bundle5 = bundle2.getBundle("data");
                            if (bundle5 == null) {
                                str = str6;
                            } else if ("com.google.android.gms.tapandpay.tokenization.UnsupportedCardActivity".equals(string2)) {
                                bundle2.putString("activity", "com.google.android.gms.tapandpay.tokenization.SummaryActivity");
                                bundle5.clear();
                                bundle5.putParcelable("extra_account_info", (AccountInfo) bundle5.getParcelable("extra_account_info"));
                                str = str6;
                                bundle5.putInt(str, 3);
                                bundle5.putInt("save_status", 0);
                                bundle5.putBoolean("nfc_device", true);
                                bundle5.putBoolean("unsupported_card_compatibility", true);
                            } else {
                                str = str6;
                            }
                        } else {
                            str = str6;
                        }
                        bundle2.putInt("version", 6);
                    } else if (i3 != 6) {
                        return false;
                    }
                }
                str = str6;
            } else {
                str = str6;
                if ("proxyRequest".equals(bundle2.getString("type"))) {
                    bundle2.putInt("version", 3);
                    String string3 = bundle2.getString("activity");
                    Bundle bundle6 = bundle2.getBundle("data");
                    if (!(string3 == null || bundle6 == null)) {
                        if ("com.google.android.gms.tapandpay.tokenization.NameResolutionActivity".equals(string3)) {
                            m76608a(bundle6, "account_info", "extra_account_info");
                        } else if ("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodActivity".equals(string3)) {
                            m76608a(bundle6, "account_info", "extra_account_info");
                            bundle6.putString("extra_calling_package", "com.google.android.apps.walletnfcrel");
                        }
                    }
                }
            }
            i3++;
            str6 = str;
        }
        return true;
    }
}
