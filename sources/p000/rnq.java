package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: rnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rnq {

    /* renamed from: a */
    public static final Object f43412a = new Object();

    /* renamed from: b */
    public static rnq f43413b;

    /* renamed from: c */
    public final String f43414c;

    /* renamed from: d */
    public final Status f43415d;

    /* renamed from: e */
    public final boolean f43416e;

    public rnq(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C0126R.string.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.f43416e = resources.getInteger(identifier) == 0 ? true : z;
        } else {
            this.f43416e = false;
        }
        synchronized (sde.f44058a) {
            if (!sde.f44059b) {
                sde.f44059b = true;
                try {
                    Bundle bundle = svr.m36484b(context).mo26172a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        sde.f44060c = bundle.getString("com.google.app.id");
                        bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
        String str = sde.f44060c;
        str = str == null ? new sdy(context).mo25405a("google_app_id") : str;
        if (TextUtils.isEmpty(str)) {
            this.f43415d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f43414c = null;
            return;
        }
        this.f43414c = str;
        this.f43415d = Status.f30107a;
    }

    /* renamed from: a */
    public static rnq m34143a(String str) {
        rnq rnq;
        synchronized (f43412a) {
            if (f43413b != null) {
                rnq = f43413b;
            } else {
                StringBuilder sb = new StringBuilder(str.length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return rnq;
    }

    public rnq(String str) {
        this.f43414c = str;
        this.f43415d = Status.f30107a;
        this.f43416e = false;
    }
}
