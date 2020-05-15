package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.TimeUnit;

/* renamed from: atah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atah {

    /* renamed from: a */
    private static final srn f89944a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final KeyguardManager f89945b;

    /* renamed from: c */
    private final atkm f89946c;

    /* renamed from: d */
    private final ataj f89947d;

    public atah(Context context) {
        sre.m36089i(context);
        this.f89945b = (KeyguardManager) context.getSystemService("keyguard");
        this.f89946c = new atkm(context);
        this.f89947d = new ataj(false, (SensorManager) context.getSystemService("sensor"));
    }

    /* renamed from: a */
    public static Intent m75275a(Context context) {
        Intent intent;
        if (asjk.m74228b(context)) {
            m75278c();
            intent = new Intent().setClassName(context, "com.google.android.gms.tapandpay.ui.SecureDeviceActivity");
        } else {
            intent = new Intent().setClassName(context, "com.google.android.gms.tapandpay.ui.EnableSecureKeyguardActivity");
        }
        return intent.setFlags(537198592);
    }

    /* renamed from: b */
    public static Intent m75276b(Context context) {
        sre.m36089i(context);
        Intent createConfirmDeviceCredentialIntent = ((KeyguardManager) context.getSystemService("keyguard")).createConfirmDeviceCredentialIntent(context.getString(C0126R.string.tp_screen_lock_desc_android), null);
        if (createConfirmDeviceCredentialIntent == null) {
            return null;
        }
        createConfirmDeviceCredentialIntent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        createConfirmDeviceCredentialIntent.addFlags(536870912);
        return createConfirmDeviceCredentialIntent;
    }

    /* renamed from: d */
    private final boolean m75279d() {
        boolean isDeviceLocked = this.f89945b.isDeviceLocked();
        bnsl a = f89944a.mo26019b(aske.m74275a());
        a.mo68432a("atah", "d", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("isDeviceLockedForLollipopMr1: %b", Boolean.valueOf(isDeviceLocked));
        return isDeviceLocked;
    }

    /* renamed from: c */
    public static void m75278c() {
        int i = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final atae mo49732c(int i) {
        long f = this.f89946c.mo50020f();
        long millis = TimeUnit.SECONDS.toMillis((long) i);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f >= 0 && elapsedRealtime < f + millis) {
            return new atae(6, 3);
        }
        int i2 = Build.VERSION.SDK_INT;
        try {
            if (atak.m75288a(atak.m75286a("android_pay_cdcvm_key", i, false))) {
                bnsl bnsl = (bnsl) f89944a.mo68390d();
                bnsl.mo68432a("atah", "c", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("isRecentlyUnlock keyguard double-check succeeded");
                this.f89946c.mo50011a((elapsedRealtime - millis) + 1000);
                return new atae(6, 2);
            }
        } catch (ataf | atag e) {
            bnsl bnsl2 = (bnsl) f89944a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("atah", "c", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("isRecentlyUnlocked double check error");
        }
        return new atae(3, 2);
    }

    /* renamed from: a */
    public final boolean mo49729a() {
        int i = Build.VERSION.SDK_INT;
        boolean isDeviceLocked = this.f89945b.isDeviceLocked();
        bnsl a = f89944a.mo26019b(aske.m74275a());
        a.mo68432a("atah", "d", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("isDeviceLockedForLollipopMr1: %b", Boolean.valueOf(isDeviceLocked));
        return !isDeviceLocked;
    }

    /* renamed from: b */
    public static void m75277b() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public final boolean mo49730a(int i) {
        return mo49731b(i).mo49728a();
    }

    /* renamed from: b */
    public final atae mo49731b(int i) {
        atae atae;
        int i2 = i;
        ataj ataj = this.f89947d;
        bnsl a = ataj.f89949a.mo26019b(aske.m74275a());
        a.mo68432a("ataj", "a", 30, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68435a("shouldAllowPayments() state. offBodyExperiment=true, isWearable=%b, isOnBody=%b", ataj.f89951c, ataj.f89950b);
        if (ataj.f89951c && !ataj.f89950b) {
            bnsl a2 = f89944a.mo26019b(aske.m74275a());
            a2.mo68432a("atah", "b", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68405a("wearOffBodyDetector not allowing payments");
            return new atae(3, 4);
        } else if (!mo49729a()) {
            return new atae(4, 5);
        } else {
            long f = this.f89946c.mo50020f();
            long millis = TimeUnit.SECONDS.toMillis((long) i2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (f >= 0 && elapsedRealtime < f + millis) {
                atae = new atae(6, 3);
            } else {
                int i3 = Build.VERSION.SDK_INT;
                try {
                    if (atak.m75288a(atak.m75286a("android_pay_cdcvm_key", i2, false))) {
                        bnsl bnsl = (bnsl) f89944a.mo68390d();
                        bnsl.mo68432a("atah", "c", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("isRecentlyUnlock keyguard double-check succeeded");
                        this.f89946c.mo50011a((elapsedRealtime - millis) + 1000);
                        atae = new atae(6, 2);
                    }
                } catch (ataf | atag e) {
                    bnsl bnsl2 = (bnsl) f89944a.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("atah", "c", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("isRecentlyUnlocked double check error");
                }
                atae = new atae(3, 2);
            }
            bnsl a3 = f89944a.mo26019b(aske.m74275a());
            a3.mo68432a("atah", "b", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a3.mo68420a("isRecentlyUnlocked: %b", Boolean.valueOf(atae.mo49728a()));
            return atae;
        }
    }
}
