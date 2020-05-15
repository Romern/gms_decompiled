package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.google.android.chimera.Activity;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: akih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akih {
    /* renamed from: a */
    public static String m59817a(Context context) {
        long j;
        ModuleManager.ModuleApkInfo moduleApkInfo = ModuleManager.get(context).getCurrentModule().moduleApk;
        try {
            j = ((Long) moduleApkInfo.getClass().getDeclaredField("apkTimestamp").get(moduleApkInfo)).longValue();
        } catch (Exception e) {
            j = 0;
        }
        StringBuilder sb = new StringBuilder();
        if (j > 0) {
            sb.append("Build Time: ");
            sb.append(DateFormat.getDateTimeInstance().format(new Date(j)));
            sb.append("\n");
        }
        sb.append("GMSCore Version: ");
        sb.append(moduleApkInfo.apkVersionName);
        sb.append("\nSharing Version: ");
        sb.append(cfov.m142047W());
        sb.append("\nDevice Type: ");
        sb.append(cfov.m142060m());
        sb.append("\nAccount Type: ");
        sb.append(cfov.m142049b());
        return sb.toString();
    }

    /* renamed from: b */
    private static ThemeSettings m59819b(Context context) {
        ThemeSettings themeSettings = new ThemeSettings();
        int i = Build.VERSION.SDK_INT;
        themeSettings.f31623a = (context.getResources().getConfiguration().uiMode & 48) == 32 ? 2 : 0;
        return themeSettings;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: wwu.a(wvd, boolean):void
     arg types: [akig, int]
     candidates:
      wwu.a(java.lang.String, java.lang.String):void
      wwu.a(wvd, boolean):void */
    /* renamed from: c */
    private static FeedbackOptions m59821c(Activity activity, Account account) {
        wwu wwu = new wwu();
        wwu.f51499d = "com.google.android.gms.nearby.sharing.FEEDBACK";
        wwu.f51501f = m59819b(activity);
        wxi wxi = new wxi();
        wxi.f51541a = "NearbySharing:* NearbyConnections:* NearbyMediums:* AudioModem:* Nearby:* AndroidRuntime:* *:S";
        wwu.f51502g = new LogOptions(wxi.f51541a, true);
        wwu.mo29493a("culprit_module", "nearby", !cfov.m142073z());
        if (account != null) {
            wwu.f51496a = account.name;
        }
        Bitmap a = akia.m59778a(activity);
        if (a != null) {
            wwu.mo29497b(a);
        }
        if (cfov.m142073z()) {
            wwu.mo29494a((wvd) new akig(activity, ".chimera.PersistentApiService", ".nearby.connection.service.NearbyConnectionsAndroidService", ".nearby.sharing.SetupActivity", ".nearby.sharing.ConsentsActivity", ".nearby.sharing.ContactSelectActivity", ".nearby.sharing.DirectShareService", ".nearby.sharing.ShareSheetActivity", ".nearby.sharing.InternalShareSheetActivity", ".nearby.sharing.ReceiveSurfaceActivity", ".nearby.sharing.InternalReceiveSurfaceActivity", ".nearby.sharing.ReceiveSurfaceService", ".nearby.sharing.SharingTileService"), false);
        }
        return wwu.mo29490a();
    }

    /* renamed from: b */
    public static void m59820b(Activity activity, Account account) {
        wvu.m42361a(activity).mo29487a(m59821c(activity, account));
    }

    /* renamed from: a */
    public static void m59818a(Activity activity, Account account) {
        if (!cfov.f185185a.mo6606a().mo82303aL()) {
            GoogleHelp googleHelp = new GoogleHelp(cfov.f185185a.mo6606a().mo82327aj());
            googleHelp.f78774q = Uri.parse(bute.m120427a(cfov.m142071x()));
            googleHelp.f78776s = m59819b(activity);
            googleHelp.mo43196a(m59821c(activity, account), activity.getContainerActivity().getCacheDir());
            new aarh(activity).mo31646a(googleHelp.mo43194a());
            return;
        }
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bute.m120427a(cfov.m142071x()))));
    }
}
