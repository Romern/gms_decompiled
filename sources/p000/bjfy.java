package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.common.Feature;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

/* renamed from: bjfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjfy extends bjfa {

    /* renamed from: f */
    public bjfx f122632f;

    /* renamed from: b */
    public static bjfy m103327b(Activity activity) {
        return (bjfy) bjfa.m103278a(activity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65075a(bjfc bjfc) {
        return "tokenizeInstrument".equals(bjfc.mo65078a()) || "BiometricAction".equals(bjfc.mo65078a()) || "RequestPermissionsAction".equals(bjfc.mo65078a()) || "LoadO1WidgetAction".equals(bjfc.mo65078a()) || TextUtils.equals(bjfc.mo65078a(), "startActivityForResult");
    }

    public final void onDetach() {
        super.onDetach();
        this.f122632f = null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rjx.<init>(android.content.Context, int[]):void
     arg types: [android.app.Activity, ?[OBJECT, ARRAY]]
     candidates:
      rjx.<init>(android.content.Context, allq):void
      rjx.<init>(android.content.Context, auzy):void
      rjx.<init>(android.content.Context, avty):void
      rjx.<init>(android.content.Context, rjg):void
      rjx.<init>(android.content.Context, rjw):void
      rjx.<init>(android.content.Context, byte[]):void
      rjx.<init>(android.content.Context, char[]):void
      rjx.<init>(android.content.Context, float[]):void
      rjx.<init>(android.content.Context, short[]):void
      rjx.<init>(android.content.Context, boolean[]):void
      rjx.<init>(android.content.Context, int[]):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65077b(bjfc bjfc) {
        char c;
        String a = bjfc.mo65078a();
        switch (a.hashCode()) {
            case -617135358:
                if (a.equals("tokenizeInstrument")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -568726229:
                if (a.equals("RequestPermissionsAction")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1838793474:
                if (a.equals("LoadO1WidgetAction")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2062566638:
                if (a.equals("BiometricAction")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            bjfx bjfx = this.f122632f;
            WidgetConfig b = bjfc.mo65079b();
            byte[] byteArrayExtra = bjfc.f122612a.getByteArrayExtra("tokenizationParams");
            Account account = b.f151760a;
            awef awef = (awef) bjfx;
            rjx rjx = new rjx((Context) awef.f94201b.getContainerActivity(), (int[]) null);
            android.app.Activity containerActivity = awef.f94201b.getContainerActivity();
            roz b2 = rpa.m34196b();
            b2.f43472a = new asna(account, byteArrayExtra, containerActivity);
            b2.f43473b = new Feature[]{asih.f89030n};
            rjx.mo24732b(b2.mo24977a());
        } else if (c == 1) {
            bjfx bjfx2 = this.f122632f;
            String stringExtra = bjfc.f122612a.getStringExtra("biometricTitle");
            String stringExtra2 = bjfc.f122612a.getStringExtra("biometricSubtitle");
            String stringExtra3 = bjfc.f122612a.getStringExtra("biometricDescription");
            String stringExtra4 = bjfc.f122612a.getStringExtra("biometricNegativeButtonText");
            boolean booleanExtra = bjfc.f122612a.getBooleanExtra("biometricDeviceCredentialAllowed", false);
            boolean booleanExtra2 = bjfc.f122612a.getBooleanExtra("biometricConfirmationRequired", false);
            awef awef2 = (awef) bjfx2;
            awef2.f94207h = true;
            awef2.mo52013g();
            bjsh bjsh = new bjsh();
            bjsh.f123221a.putCharSequence("title", stringExtra);
            bjsh.f123221a.putCharSequence("subtitle", stringExtra2);
            bjsh.f123221a.putCharSequence("description", stringExtra3);
            bjsh.f123221a.putBoolean("require_confirmation", booleanExtra2);
            bjsh.f123221a.putBoolean("allow_device_credential", booleanExtra);
            if (!booleanExtra) {
                bjsh.f123221a.putCharSequence("negative_text", stringExtra4);
            }
            bjsj bjsj = awef2.f94206g;
            CharSequence charSequence = bjsh.f123221a.getCharSequence("title");
            CharSequence charSequence2 = bjsh.f123221a.getCharSequence("negative_text");
            boolean z = bjsh.f123221a.getBoolean("allow_device_credential");
            boolean z2 = bjsh.f123221a.getBoolean("handling_device_credential_result");
            if (TextUtils.isEmpty(charSequence)) {
                throw new IllegalArgumentException("Title must be set and non-empty");
            } else if (TextUtils.isEmpty(charSequence2) && !z) {
                throw new IllegalArgumentException("Negative text must be set and non-empty");
            } else if (!TextUtils.isEmpty(charSequence2) && z) {
                throw new IllegalArgumentException("Can't have both negative button behavior and device credential enabled");
            } else if (z2 && !z) {
                throw new IllegalArgumentException("Can't be handling device credential result without device credential enabled");
            } else {
                bjsi bjsi = new bjsi(bjsh.f123221a);
                bjsj.f123230h = bjsi.f123222a.getBoolean("handling_device_credential_result");
                if (bjsi.f123222a.getBoolean("allow_device_credential")) {
                    int i = Build.VERSION.SDK_INT;
                }
                FragmentManager a2 = bjsj.mo65496a();
                Bundle bundle = bjsi.f123222a;
                bjsj.f123229g = false;
                int i2 = Build.VERSION.SDK_INT;
                bjsc bjsc = (bjsc) a2.findFragmentByTag("BiometricFragment");
                if (bjsc == null) {
                    bjsj.f123228f = new bjsc();
                } else {
                    bjsj.f123228f = bjsc;
                }
                bjsj.f123228f.mo65491a(bjsj.f123224b, bjsj.f123231i, bjsj.f123225c);
                bjsc bjsc2 = bjsj.f123228f;
                bjsc2.f123205b = bundle;
                if (bjsc == null) {
                    a2.beginTransaction().add(bjsj.f123228f, "BiometricFragment").commitAllowingStateLoss();
                } else if (bjsc2.isDetached()) {
                    a2.beginTransaction().attach(bjsj.f123228f).commitAllowingStateLoss();
                }
                a2.executePendingTransactions();
            }
        } else if (c == 2) {
            bjfx bjfx3 = this.f122632f;
            ((awef) bjfx3).f94201b.requestPermissions(bjfc.f122612a.getStringArrayExtra("permissionsRequested"), 700);
        } else if (c == 3) {
            bjfc.f122612a.getIntExtra("widgetType", 0);
            bjfc.f122612a.getByteArrayExtra("encryptedParameters");
        } else if (TextUtils.equals(bjfc.mo65078a(), "startActivityForResult")) {
            startActivityForResult((Intent) bjfc.f122612a.getParcelableExtra("launchingIntent"), 1000);
        }
    }
}
