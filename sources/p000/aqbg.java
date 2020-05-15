package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.RemoteException;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.security.snet.OperationLauncherIntentOperation;
import com.google.android.gms.security.snet.SafetyNetClientChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;

/* renamed from: aqbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqbg extends apuj {

    /* renamed from: a */
    private final apga f85548a;

    /* renamed from: b */
    private final String f85549b;

    /* renamed from: d */
    private final byte[] f85550d;

    /* renamed from: e */
    private final aqbh f85551e;

    static {
        aqbg.class.getSimpleName();
    }

    public aqbg(Context context, apga apga, String str, byte[] bArr) {
        super(context, "rharesult");
        this.f85548a = apga;
        this.f85549b = str;
        this.f85550d = bArr;
        this.f85551e = aqbh.m71290a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f3, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            if (!SafetyNetClientChimeraService.f107558b.contains(C1240of.m19758a(this.f85549b, new apgr(this.f85550d)))) {
                mo47617b(new Status(12018));
                return;
            }
            synchronized (this.f85551e) {
                this.f85551e.mo47625a(this.f85548a);
                this.f85551e.mo47627c();
                if (!this.f85551e.mo47630f()) {
                    Intent intent = new Intent("com.google.android.vending.verifier.ACTION_REMOVE_HARMFUL_APP");
                    intent.setPackage("com.android.vending");
                    intent.addFlags(268435456);
                    int i = Build.VERSION.SDK_INT;
                    ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE);
                    if (resolveActivity != null) {
                        intent.setClassName("com.android.vending", resolveActivity.activityInfo.name);
                        aqbe a = aqbf.m71285a(context).mo47726a(this.f85550d);
                        if (a != null) {
                            String str = a.f85545c;
                            if (str == null) {
                                str = context.getString(C0126R.string.play_protect_generic_malware);
                            }
                            intent.putExtra("action", 5);
                            intent.putExtra("message", str);
                            intent.putExtra("package_name", this.f85549b);
                            intent.putExtra("digest", this.f85550d);
                            int i2 = aqbi.f85555b;
                            intent.putExtra("pending_result_intent", PendingIntent.getService(context, 0, IntentOperation.getStartIntent(context, OperationLauncherIntentOperation.class, "com.google.android.gms.security.apis.verifyapps.PACKAGE_WARNING_RESULT").putExtra("nonce", aqbh.m71290a(context).mo47628d()), JGCastService.FLAG_PRIVATE_DISPLAY));
                        } else {
                            intent = null;
                        }
                    } else {
                        mo47617b(new Status(12017));
                        intent = null;
                    }
                    if (intent == null) {
                        mo47617b(Status.f30109c);
                    } else if (!this.f85551e.mo47630f()) {
                        this.f85551e.mo47629e();
                        aqbh aqbh = this.f85551e;
                        aqbh.f85553b = this.f85549b;
                        aqbh.f85554c = this.f85550d;
                        apue.m71014a(context).mo47621b(3);
                        context.startActivity(intent);
                    } else {
                        mo47617b(new Status(12015));
                    }
                } else {
                    if (Arrays.equals(this.f85550d, this.f85551e.f85554c)) {
                        if (this.f85549b.equals(this.f85551e.f85553b)) {
                            return;
                        }
                    }
                    mo47617b(new Status(12015));
                }
            }
        } catch (RemoteException e) {
            throw e;
        } catch (Exception e2) {
            mo47617b(Status.f30109c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47617b(Status status) {
        this.f85551e.mo47626a(status, 0);
    }
}
