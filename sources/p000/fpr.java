package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* renamed from: fpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fpr {

    /* renamed from: a */
    public final Context f17101a;

    /* renamed from: b */
    public final GoogleSettingsItem f17102b;

    /* renamed from: c */
    public String f17103c;

    /* renamed from: d */
    public String f17104d;

    /* renamed from: e */
    public String f17105e;

    /* renamed from: f */
    boolean f17106f = true;

    public fpr(Context context, GoogleSettingsItem googleSettingsItem) {
        sdo.m34959a(context);
        this.f17101a = context;
        sdo.m34959a(googleSettingsItem);
        this.f17102b = googleSettingsItem;
        Intent intent = googleSettingsItem.f29956b;
        if (intent == null) {
            Log.w("IndexableItem", "intent is null");
            this.f17106f = false;
            return;
        }
        PackageManager packageManager = this.f17101a.getPackageManager();
        if (packageManager == null) {
            Log.w("IndexableItem", "pm is null");
            this.f17106f = false;
            return;
        }
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(packageManager, 0);
        if (resolveActivityInfo == null) {
            Log.w("IndexableItem", "info is null");
            this.f17106f = false;
        } else if (!resolveActivityInfo.exported) {
            String valueOf = String.valueOf(intent);
            String str = this.f17102b.f29958d;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(str).length());
            sb.append("target is not exported: ");
            sb.append(valueOf);
            sb.append(", title:");
            sb.append(str);
            Log.e("IndexableItem", sb.toString());
            this.f17106f = false;
        } else {
            this.f17104d = resolveActivityInfo.packageName;
            String action = intent.getAction();
            if (action != null) {
                this.f17103c = action;
            }
            if (this.f17103c == null) {
                this.f17103c = "android.intent.action.MAIN";
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                this.f17105e = component.getClassName();
            }
            if (this.f17104d == null) {
                this.f17106f = false;
                String valueOf2 = String.valueOf(this.f17102b.f29956b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb2.append("targetPackageName is null:");
                sb2.append(valueOf2);
                Log.e("IndexableItem", sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final String mo11114a() {
        return this.f17102b.f29958d;
    }

    /* renamed from: b */
    public final String mo11115b() {
        if (!TextUtils.isEmpty(this.f17102b.f29968n)) {
            return this.f17102b.f29968n;
        }
        String valueOf = String.valueOf(this.f17102b.f29956b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("indexing key is not set:");
        sb.append(valueOf);
        Log.w("IndexableItem", sb.toString());
        return mo11114a();
    }
}
