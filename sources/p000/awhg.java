package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: awhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awhg extends Fragment {

    /* renamed from: a */
    public awpb f94357a;

    /* renamed from: b */
    public boolean f94358b;

    /* renamed from: a */
    public static awhg m79945a(int i, BuyFlowConfig buyFlowConfig, Account account) {
        awhg awhg = new awhg();
        Bundle bundle = new Bundle();
        bundle.putInt("serviceConnectionFlags", i);
        bundle.putParcelable("buyFlowConfig", buyFlowConfig);
        bundle.putParcelable("account", account);
        awhg.setArguments(bundle);
        return awhg;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.f94357a == null) {
            Bundle arguments = getArguments();
            awou awou = new awou(arguments.getInt("serviceConnectionFlags"), (BuyFlowConfig) arguments.getParcelable("buyFlowConfig"), (Account) arguments.getParcelable("account"), activity);
            this.f94357a = awou;
            awou awou2 = awou;
            if (!awou2.f94783t) {
                if (awou2.mo52430e()) {
                    skh.m35531a().mo25691a(awou2.f94769f, "NetworkPaymentServiceCo", new Intent("com.google.android.gms.wallet.service.ow.IOwInternalService").setPackage("com.google.android.gms"), awou2.f94775l, 1);
                }
                if (awou2.mo52431f()) {
                    skh.m35531a().mo25691a(awou2.f94769f, "NetworkPaymentServiceCo", new Intent("com.google.android.gms.wallet.service.orchestration.IOrchestrationService").setPackage("com.google.android.gms"), awou2.f94777n, 1);
                }
                if (awou2.mo52432g()) {
                    skh.m35531a().mo25691a(awou2.f94769f, "NetworkPaymentServiceCo", new Intent("com.google.android.gms.wallet.service.ib.IIbService").setPackage("com.google.android.gms"), awou2.f94779p, 1);
                }
                if (awou2.mo52433h()) {
                    skh.m35531a().mo25691a(awou2.f94769f, "NetworkPaymentServiceCo", new Intent("com.google.android.gms.wallet.service.reauth.IReauthService").setPackage("com.google.android.gms"), awou2.f94781r, 1);
                }
                awou2.f94783t = true;
            }
        }
        this.f94358b = true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDestroy() {
        int i;
        super.onDestroy();
        awou awou = (awou) this.f94357a;
        if (awou.f94783t) {
            if (awou.mo52430e()) {
                skh.m35531a().mo25689a(awou.f94769f, awou.f94775l);
                i = 2;
            } else {
                i = 0;
            }
            if (awou.mo52431f()) {
                skh.m35531a().mo25689a(awou.f94769f, awou.f94777n);
                i |= 4;
            }
            if (awou.mo52432g()) {
                skh.m35531a().mo25689a(awou.f94769f, awou.f94779p);
                i |= 8;
            }
            if (awou.mo52433h()) {
                skh.m35531a().mo25689a(awou.f94769f, awou.f94781r);
                i |= 16;
            }
            awou.f94784u.mo33957d(awou.f94784u.obtainMessage(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT, Integer.valueOf(i)));
            awou.f94783t = false;
        }
        awou.f94766c.clear();
        awou.f94784u.getLooper().quit();
    }

    /* renamed from: a */
    public static String m79946a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 28);
        sb.append(str);
        sb.append(":TransactionRetainerFragment");
        return sb.toString();
    }
}
