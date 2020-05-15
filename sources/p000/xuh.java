package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.cast.JGCastService;
import com.google.android.gms.fido.fido2.pollux.UserApprovalPromptController$2;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: xuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xuh {

    /* renamed from: i */
    public static final sek f53152i = new sek(new String[]{"UserApprovalPromptController"}, (short[]) null);

    /* renamed from: a */
    public final xwj f53153a;

    /* renamed from: b */
    public final Context f53154b;

    /* renamed from: c */
    public final xug f53155c;

    /* renamed from: d */
    public final String f53156d;

    /* renamed from: e */
    public final xwn f53157e;

    /* renamed from: f */
    public BroadcastReceiver f53158f;

    /* renamed from: g */
    public int f53159g = 1;

    /* renamed from: h */
    public final xtb f53160h;

    /* renamed from: j */
    private final boolean f53161j;

    public xuh(xwj xwj, Context context, xtb xtb, String str, xug xug, boolean z, xwn xwn) {
        this.f53153a = xwj;
        this.f53154b = context;
        sdo.m34959a(xtb);
        this.f53160h = xtb;
        sdo.m34959a((Object) str);
        this.f53156d = str;
        sdo.m34959a(xug);
        this.f53155c = xug;
        this.f53161j = z;
        sdo.m34959a(xwn);
        this.f53157e = xwn;
    }

    /* renamed from: a */
    public final void mo30153a() {
        if (this.f53158f != null) {
            f53152i.mo25414c("Unregistering screenUnlockReceiver.", new Object[0]);
            this.f53154b.unregisterReceiver(this.f53158f);
            this.f53158f = null;
        }
    }

    /* renamed from: b */
    public final void mo30155b() {
        adzt adzt = new adzt(Looper.getMainLooper());
        Context context = this.f53154b;
        UserApprovalPromptController$2 userApprovalPromptController$2 = new UserApprovalPromptController$2(this, adzt);
        int i = this.f53153a.f53295a;
        boolean z = this.f53161j;
        String str = this.f53156d;
        sdo.m34959a(userApprovalPromptController$2);
        sdo.m34959a((Object) str);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.fido.fido2.ui.PolluxActivity");
        intent.putExtra("ResultReceiverExtra", userApprovalPromptController$2);
        intent.putExtra("AccountNameExtra", str);
        intent.putExtra("LoggerRequestIdExtra", i);
        intent.putExtra("ShowStrongBoxUiExtra", z);
        intent.addFlags(268435456).addFlags(8388608).addFlags(JGCastService.FLAG_PRIVATE_DISPLAY).addFlags(4).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        this.f53154b.startActivity(intent);
        this.f53155c.mo30152a();
        this.f53159g = 3;
        mo30153a();
    }

    /* renamed from: a */
    public final void mo30154a(boolean z) {
        boolean z2;
        if (this.f53159g == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34970a(z2);
        f53152i.mo25414c("Setting authentication result: %s", Boolean.valueOf(z));
        this.f53154b.sendBroadcast(new Intent("updatePolluxChimeraActivity").putExtra("AuthenticationResultExtra", z));
        this.f53159g = 5;
    }
}
