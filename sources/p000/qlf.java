package p000;

import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: qlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qlf extends IntentOperation {

    /* renamed from: a */
    private final boolean f41637a;

    protected qlf() {
        this(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6343a(Intent intent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6344a(Intent intent, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6268a(Intent intent, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17616b(Intent intent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6536b(Intent intent, boolean z) {
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onHandleIntent(Intent intent) {
        char c;
        if (!this.f41637a) {
            int i = spn.f44932a;
        }
        String action = intent.getAction();
        bmzs.m108696a(action);
        int i2 = 0;
        switch (action.hashCode()) {
            case -905063602:
                if (action.equals("android.intent.action.LOCKED_BOOT_COMPLETED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 438946629:
                if (action.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 798292259:
                if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2069809336:
                if (action.equals(IntentOperation.ACTION_NEW_MODULE)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            mo17616b(intent);
            mo6344a(intent, 1);
        } else if (c == 1) {
            int i3 = Build.VERSION.SDK_INT;
            mo6343a(intent);
            int i4 = Build.VERSION.SDK_INT;
            mo6344a(intent, 2);
        } else if (c == 2) {
            boolean booleanExtra = intent.getBooleanExtra(IntentOperation.EXTRA_CONTAINER_UPDATED, false);
            mo6268a(intent, booleanExtra);
            if (booleanExtra) {
                i2 = 8;
            }
            mo6344a(intent, i2 | 4);
        } else if (c != 3) {
            String valueOf = String.valueOf(action);
            Log.w("ModuleInitIntentOp", valueOf.length() == 0 ? new String("Dropping unexpected action ") : "Dropping unexpected action ".concat(valueOf));
        } else {
            boolean equals = ModuleManager.get(this).getCurrentModuleApk().apkPackageName.equals("com.google.android.gms");
            mo6536b(intent, equals);
            if (!equals) {
                mo6344a(intent, 8);
            }
        }
    }

    protected qlf(boolean z) {
        this.f41637a = z;
    }
}
