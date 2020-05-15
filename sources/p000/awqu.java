package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: awqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awqu {

    /* renamed from: j */
    public long f94875j;

    /* renamed from: k */
    public bpje f94876k;

    /* renamed from: l */
    public String f94877l;

    protected awqu() {
        this.f94876k = bpje.f137845k;
        this.f94875j = 0;
    }

    /* renamed from: a */
    public abstract void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52460a(bjwa bjwa) {
        bjwa.mo65581a(this.f94876k);
        bjwa.mo65582a(this.f94877l);
    }

    /* renamed from: a */
    public abstract void mo52461a(bxvd bxvd);

    /* renamed from: a */
    public abstract boolean mo52462a();

    /* renamed from: b */
    public String mo52463b() {
        return null;
    }

    /* renamed from: c */
    public ArrayList mo52466c() {
        return new ArrayList();
    }

    public final String toString() {
        bjwa a = bjwb.m104764a();
        a.mo65580a(this.f94875j);
        mo52460a(a);
        return a.toString();
    }

    protected awqu(bjvz bjvz) {
        this.f94875j = bjvz.mo65575a(-1);
        this.f94876k = (bpje) bjvz.mo65576a((bxxk) bpje.f137845k.mo74142c(7), bpje.f137845k);
        this.f94877l = bjvz.mo65579b();
    }

    /* renamed from: a */
    public final void mo52467a(BuyFlowConfig buyFlowConfig, Context context) {
        bpje bpje = this.f94876k;
        bxvd bxvd = (bxvd) bpje.mo74142c(5);
        bxvd.mo73625a((bxvk) bpje);
        String str = buyFlowConfig.f110419c;
        if (buyFlowConfig.mo60046b() != null) {
            String b = buyFlowConfig.mo60046b();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpje bpje2 = (bpje) bxvd.f164949b;
            bpje bpje3 = bpje.f137845k;
            b.getClass();
            bpje2.f137847a |= 2;
            bpje2.f137849c = b;
        }
        PackageInfo b2 = sqr.m35999b(context, str);
        if (b2 != null) {
            int i = b2.versionCode;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpje bpje4 = (bpje) bxvd.f164949b;
            bpje bpje5 = bpje.f137845k;
            bpje4.f137847a |= 4;
            bpje4.f137850d = i;
            if (!TextUtils.isEmpty(b2.versionName)) {
                String str2 = b2.versionName;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpje bpje6 = (bpje) bxvd.f164949b;
                str2.getClass();
                bpje6.f137847a |= 8;
                bpje6.f137851e = str2;
            }
            int a = sqr.m35997a(b2);
            if (a != -1) {
                String num = Integer.toString(a);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpje bpje7 = (bpje) bxvd.f164949b;
                num.getClass();
                bpje7.f137847a |= 1;
                bpje7.f137848b = num;
            }
        } else {
            String valueOf = String.valueOf(str);
            Log.w("SessionState", valueOf.length() == 0 ? new String("Unable to retrieve package info for requestInfo for: ") : "Unable to retrieve package info for requestInfo for: ".concat(valueOf));
        }
        ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
        if (applicationParameters != null) {
            int i2 = applicationParameters.f110406a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpje bpje8 = (bpje) bxvd.f164949b;
            bpje bpje9 = bpje.f137845k;
            bpje8.f137847a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bpje8.f137856j = i2;
            Bundle bundle = applicationParameters.f110408c;
            if (bundle != null) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("com.google.android.gms.wallet.EXPERIMENT_NAMES");
                if (stringArrayList != null) {
                    Collections.sort(stringArrayList);
                    String a2 = bmxr.m108544a(",").mo66874a((Iterable) stringArrayList);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpje bpje10 = (bpje) bxvd.f164949b;
                    a2.getClass();
                    bpje10.f137847a |= 128;
                    bpje10.f137855i = a2;
                }
                String string = bundle.getString("com.google.android.gms.wallet.EXTRA_ANALYTICS_TRANSACTION_ID_OVERRIDE");
                if (string != null) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpje bpje11 = (bpje) bxvd.f164949b;
                    string.getClass();
                    bpje11.f137847a |= 64;
                    bpje11.f137854h = string;
                }
            }
        }
        String str3 = buyFlowConfig.f110420d;
        if (str3 != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpje bpje12 = (bpje) bxvd.f164949b;
            bpje bpje13 = bpje.f137845k;
            str3.getClass();
            bpje12.f137847a |= 16;
            bpje12.f137852f = str3;
        }
        this.f94876k = (bpje) bxvd.mo74062i();
    }
}
