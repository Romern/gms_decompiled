package p000;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* renamed from: mgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mgo {

    /* renamed from: a */
    public final Context f33648a;

    /* renamed from: b */
    public boolean f33649b;

    public mgo(Context context) {
        this.f33648a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Notification mo19995a() {
        int i;
        int i2;
        int a = qkj.m32287a(this.f33648a, C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_48);
        boolean z = this.f33649b;
        if (!z) {
            i = C0126R.string.source_notification_title;
        } else {
            i = C0126R.string.source_wifi_d2d_disconnected_title;
        }
        if (!z) {
            i2 = C0126R.string.source_notification_device_disconnected;
        } else {
            i2 = C0126R.string.source_wifi_d2d_disconnected_notification_text;
        }
        C1102je jeVar = new C1102je(this.f33648a);
        jeVar.mo13630b(a);
        jeVar.f22271w = C1133kh.m17843b(this.f33648a, C0126R.color.quantum_googred);
        jeVar.mo13640e(this.f33648a.getString(i));
        jeVar.mo13632b(this.f33648a.getString(i2));
        jeVar.f22270v = mo19996b();
        return sex.m35104a(this.f33648a).mo25436a(jeVar.mo13629b());
    }

    /* renamed from: b */
    public final Bundle mo19996b() {
        Bundle bundle = new Bundle();
        if (ccod.f179611a.mo6606a().mo76523c()) {
            int i = Build.VERSION.SDK_INT;
            bundle.putString("android.substName", this.f33648a.getString(C0126R.string.source_notification_app_name));
        }
        return bundle;
    }
}
