package p000;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* renamed from: qlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qlg extends IntentOperation {

    /* renamed from: a */
    private final boolean f41638a;

    public qlg(boolean z) {
        this.f41638a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24071a(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17405a(String str, Intent intent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24072b(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17688c(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo24073d(String str) {
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r0.equals("android.intent.action.PACKAGE_ADDED") != false) goto L_0x0064;
     */
    public void onHandleIntent(Intent intent) {
        String str;
        String action = intent.getAction();
        bmzs.m108696a(action);
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if (str != null && !str.isEmpty()) {
            char c = 0;
            boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            switch (action.hashCode()) {
                case -810471698:
                    if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 172491798:
                    if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 267468725:
                    if (action.equals("android.intent.action.PACKAGE_DATA_CLEARED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 525384130:
                    if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1544582882:
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    mo24072b(str);
                } else if (c == 2) {
                    mo17688c(str);
                } else if (c != 3) {
                    if (c != 4) {
                        String valueOf = String.valueOf(action);
                        Log.w("PackageIntentOp", valueOf.length() == 0 ? new String("Ignoring unexpected intent: ") : "Ignoring unexpected intent: ".concat(valueOf));
                        return;
                    }
                    mo24073d(str);
                } else if (!booleanExtra || this.f41638a) {
                    mo17405a(str, intent);
                }
            } else if (!booleanExtra || this.f41638a) {
                mo24071a(str);
            }
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 42);
            sb.append("Dropping ");
            sb.append(action);
            sb.append(" Intent with missing package name");
            Log.w("PackageIntentOp", sb.toString());
        }
    }
}
