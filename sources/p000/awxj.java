package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.analytics.events.GetClientTokenEvent;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* renamed from: awxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxj {
    private awxj() {
    }

    /* renamed from: a */
    public static BuyFlowConfig m81398a(Bundle bundle) {
        return m81399a(bundle, "onlinewallet");
    }

    /* renamed from: b */
    public static BuyFlowConfig m81404b(Bundle bundle) {
        return m81399a(bundle, "unknown");
    }

    /* renamed from: c */
    public static boolean m81405c(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", false)) {
            return true;
        }
        String str = (String) awie.f94412h.mo58455c();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return sqc.m35963b(str.split(","), bundle.getString("androidPackageName"));
    }

    /* renamed from: a */
    private static BuyFlowConfig m81399a(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.setClassLoader(awxj.class.getClassLoader());
        String string = bundle2.getString("androidPackageName");
        bundle2.putBoolean("com.google.android.gms.wallet.EXTRA_ALLOW_ACCOUNT_SELECTION", true);
        ApplicationParameters applicationParameters = awfl.m79846a(bundle2).f95270a;
        awyb a = BuyFlowConfig.m94175a();
        a.mo52751b(string);
        a.mo52750a(string);
        a.mo52749a(applicationParameters);
        a.mo52752c(str);
        return a.mo52748a();
    }

    /* renamed from: a */
    static CommonWalletObject m81400a(CreateWalletObjectsRequest createWalletObjectsRequest) {
        LoyaltyWalletObject loyaltyWalletObject = createWalletObjectsRequest.f109780a;
        if (loyaltyWalletObject != null) {
            return loyaltyWalletObject.mo59760a();
        }
        OfferWalletObject offerWalletObject = createWalletObjectsRequest.f109781b;
        if (offerWalletObject != null) {
            return offerWalletObject.f109875c;
        }
        GiftCardWalletObject giftCardWalletObject = createWalletObjectsRequest.f109782c;
        if (giftCardWalletObject != null) {
            return giftCardWalletObject.f109798a;
        }
        return null;
    }

    /* renamed from: a */
    public static void m81401a(Context context, int i, String str, String str2, Bundle bundle) {
        if (awfl.m79847b(bundle) == 1 && ((Boolean) awiu.f94494a.mo58455c()).booleanValue()) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                bxvd da = bolu.f133582h.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bolu bolu = (bolu) da.f164949b;
                str2.getClass();
                int i2 = bolu.f133584a | 2;
                bolu.f133584a = i2;
                bolu.f133586c = str2;
                int i3 = i2 | 16;
                bolu.f133584a = i3;
                bolu.f133589f = i;
                str.getClass();
                bolu.f133584a = i3 | 32;
                bolu.f133590g = str;
                PackageInfo b = sqr.m35999b(context, str2);
                if (b == null) {
                    String valueOf = String.valueOf(str2);
                    Log.w("OwServiceUtils", valueOf.length() == 0 ? new String("Unable to retrieve package info to log merchant error for: ") : "Unable to retrieve package info to log merchant error for: ".concat(valueOf));
                } else {
                    int i4 = b.versionCode;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bolu bolu2 = (bolu) da.f164949b;
                    bolu2.f133584a |= 4;
                    bolu2.f133587d = i4;
                    if (!TextUtils.isEmpty(b.versionName)) {
                        String str3 = b.versionName;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bolu bolu3 = (bolu) da.f164949b;
                        str3.getClass();
                        bolu3.f133584a |= 8;
                        bolu3.f133588e = str3;
                    }
                    int a = sqr.m35997a(b);
                    if (a != -1) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bolu bolu4 = (bolu) da.f164949b;
                        bolu4.f133584a |= 1;
                        bolu4.f133585b = a;
                    }
                }
                awqd.m80663a(context, "GMS_CORE_WALLET_MERCHANT_ERROR", da.mo74062i(), null);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: a */
    public static void m81402a(Context context, BuyFlowConfig buyFlowConfig, bxvd bxvd, int i, long j) {
        if (((Boolean) awiu.f94496c.mo58455c()).booleanValue()) {
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - j);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpic bpic = (bpic) bxvd.f164949b;
            bpic bpic2 = bpic.f137715f;
            int i2 = bpic.f137717a | 2;
            bpic.f137717a = i2;
            bpic.f137719c = elapsedRealtime;
            bpic.f137718b = i - 1;
            bpic.f137717a = i2 | 1;
            awqc.m80662a(context, new GetClientTokenEvent(buyFlowConfig, (bpic) bxvd.mo74062i()));
        }
    }

    /* renamed from: a */
    public static boolean m81403a(BuyFlowConfig buyFlowConfig) {
        return m81405c(buyFlowConfig.f110418b.f110408c);
    }
}
