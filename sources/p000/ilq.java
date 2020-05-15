package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.util.Locale;
import java.util.UUID;

/* renamed from: ilq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilq {

    /* renamed from: a */
    public final Context f21306a;

    /* renamed from: b */
    public final PackageManager f21307b;

    /* renamed from: c */
    public final svq f21308c = svr.m36484b(this.f21306a);

    /* renamed from: d */
    public final String f21309d = this.f21306a.getPackageName();

    /* renamed from: e */
    public final int f21310e = stu.m36316b();

    /* renamed from: f */
    public final int f21311f = this.f21306a.getApplicationInfo().uid;

    public ilq(Context context) {
        sdo.m34966a(context, "Context cannot be null!");
        Context applicationContext = context.getApplicationContext();
        this.f21306a = applicationContext;
        this.f21307b = applicationContext.getPackageManager();
    }

    /* renamed from: a */
    public static final String m15665a(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        return pendingIntent.getCreatorPackage();
    }

    /* renamed from: b */
    public final String mo13125b(String str) {
        try {
            return spn.m35882e(this.f21306a, str).toLowerCase(Locale.US);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final int mo13122a(String str) {
        if (str != null) {
            try {
                return this.f21308c.mo26176b(str, 128).applicationInfo.uid;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final AppDescription mo13123a() {
        String uuid = UUID.randomUUID().toString();
        return new AppDescription(this.f21309d, this.f21311f, uuid, uuid);
    }

    /* renamed from: a */
    public final boolean mo13124a(int i) {
        return rfz.m33557a(this.f21306a).mo24608b(i);
    }
}
