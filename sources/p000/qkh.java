package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: qkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qkh extends deu {

    /* renamed from: g */
    public sug f41601g;

    /* renamed from: h */
    public boolean f41602h;

    /* renamed from: i */
    public boolean f41603i;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static boolean m32281a(Context context, String str, String str2) {
        Account[] accountArr;
        adyd a = adyd.m51363a(context);
        if (str == null || str.equals(context.getPackageName())) {
            accountArr = a.mo33916a(str2);
        } else {
            accountArr = a.mo33917a(str2, str);
        }
        return accountArr.length > 0;
    }

    /* renamed from: b */
    public static final sui m32282b(Context context) {
        return new svk(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7102a(sug sug, Bundle bundle);

    /* renamed from: i */
    public abstract void mo7107i();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.common_settings_screen);
        mo7107i();
        svi svi = new svi(this, null);
        this.f41601g = svi;
        mo7102a(svi, bundle);
        this.f41601g.mo26096a(getWindow());
    }

    /* renamed from: b */
    public final boolean mo24060b(Intent intent) {
        return getPackageManager().resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null;
    }
}
