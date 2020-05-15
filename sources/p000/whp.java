package p000;

import android.content.IntentSender;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.chimera.Activity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: whp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whp {

    /* renamed from: a */
    private static final Set f50668a = new HashSet(Arrays.asList("android.permission-group.CONTACTS"));

    /* renamed from: b */
    private static final Set f50669b = new HashSet(Arrays.asList("android.permission-group.CONTACTS", "android.permission-group.PHONE", "android.permission-group.SMS"));

    /* renamed from: c */
    private final Activity f50670c;

    /* renamed from: d */
    private final who f50671d;

    /* renamed from: e */
    private final sft f50672e = sft.f44147a;

    /* renamed from: f */
    private final boolean f50673f;

    public whp(Activity activity, who who, boolean z) {
        this.f50670c = activity;
        this.f50671d = who;
        this.f50673f = z;
    }

    /* renamed from: a */
    public final void mo29106a(boolean z) {
        int i = Build.VERSION.SDK_INT;
        Set a = this.f50672e.mo25486a(f50669b);
        boolean z2 = true;
        boolean z3 = !a.contains("android.permission-group.SMS");
        boolean z4 = !a.contains("android.permission-group.CONTACTS");
        boolean z5 = !a.contains("android.permission-group.PHONE");
        if (!z4 && z) {
            try {
                this.f50670c.startIntentSenderForResult(this.f50672e.mo25484a(this.f50670c, f50668a).getIntentSender(), 2, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                wgn.m41926f("InvitationPermissionHelper", "trouble sending intent for requesting permissions", new Object[0]);
                this.f50671d.mo18407a();
            }
        } else {
            if (this.f50673f) {
                z2 = false;
            } else if (!z3) {
                z2 = false;
            } else if (!z5 || !this.f50670c.getPackageManager().hasSystemFeature("android.hardware.telephony") || ((TelephonyManager) this.f50670c.getSystemService("phone")).getLine1Number() == null) {
                z2 = false;
            }
            this.f50671d.mo18414a(z4, z2);
        }
    }
}
