package p000;

import android.net.Uri;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: wsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wsd {
    /* renamed from: a */
    public static void m42208a(Activity activity) {
        String a = bute.m120427a(cfog.f184854a.mo6606a().mo81950L());
        GoogleHelp googleHelp = new GoogleHelp(cfod.f184793a.mo6606a().mo81929r());
        googleHelp.f78774q = Uri.parse(a);
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.f31623a = 1;
        googleHelp.f78776s = themeSettings;
        wwu wwu = new wwu();
        wwu.mo29493a("culprit_module", "nearby", true);
        googleHelp.mo43196a(wwu.mo29490a(), activity.getContainerActivity().getCacheDir());
        new aarh(activity).mo31646a(googleHelp.mo43194a());
    }
}
