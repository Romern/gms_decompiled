package p000;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aicx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aicx extends C1102je {

    /* renamed from: G */
    private final Context f68743G;

    public aicx(Context context) {
        super(context);
        this.f68743G = context;
    }

    /* renamed from: d */
    public final void mo37422d(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("android.substName", z ? this.f68743G.getResources().getString(C0126R.string.common_devices) : this.f68743G.getResources().getString(C0126R.string.common_nearby_title));
        mo13623a(bundle);
    }

    /* renamed from: a */
    static Uri m57008a(Context context) {
        Resources resources = context.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(C0126R.raw.discovery_silence)).appendPath(resources.getResourceTypeName(C0126R.raw.discovery_silence)).appendPath(resources.getResourceEntryName(C0126R.raw.discovery_silence)).build();
    }

    /* renamed from: b */
    public final void mo37421b(String str) {
        int i = Build.VERSION.SDK_INT;
        mo13639d(str);
    }

    /* renamed from: a */
    public final void mo37420a(String str) {
        if (!aidc.m57026a()) {
            int a = aidc.m57025a(str);
            this.f22258j = a;
            if (a > 0) {
                mo13622a(m57008a(this.f22249a));
                mo13628a(new long[0]);
                return;
            }
            return;
        }
        this.f22244B = str;
    }
}
