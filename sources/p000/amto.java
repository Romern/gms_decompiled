package p000;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: amto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class amto extends adcf {

    /* renamed from: g */
    protected amuh f75917g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: wwu.a(wvd, boolean):void
     arg types: [amui, int]
     candidates:
      wwu.a(java.lang.String, java.lang.String):void
      wwu.a(wvd, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41330a(String str) {
        GoogleHelp a = GoogleHelp.m66336a(str);
        ThemeSettings themeSettings = new ThemeSettings();
        int i = Build.VERSION.SDK_INT;
        themeSettings.f31623a = 3;
        a.f78776s = themeSettings;
        wwu wwu = new wwu(getActivity());
        wwu.f51499d = "com.google.android.gms.contacts_sync_core.USER_INITIATED_FEEDBACK_REPORT";
        wwu.mo29497b(wwr.m42392a(getActivity().getContainerActivity()));
        if (cfuz.f185757a.mo6606a().mo82758a()) {
            allp a2 = allq.m61232a();
            a2.f73626a = 80;
            wwu.mo29494a((wvd) new amui(mo41312b(), alsk.m61691a(getActivity(), a2.mo40491a())), true);
        }
        a.mo43196a(wwu.mo29490a(), getActivity().getCacheDir());
        aarh aarh = new aarh(getActivity());
        this.f75917g.mo41350a(8, mo41312b(), (String) null);
        aarh.mo31646a(a.mo43194a());
    }

    /* renamed from: b */
    public abstract int mo41312b();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo41331d() {
        mo41330a("contacts_sync");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final amuq mo41332e() {
        return amuq.m63320a((adcc) getActivity());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo41333f() {
        String str;
        int i;
        amuh amuh = this.f75917g;
        int b = mo41312b();
        Activity containerActivity = getActivity().getContainerActivity();
        int i2 = Build.VERSION.SDK_INT;
        if (containerActivity.getReferrer() != null) {
            String valueOf = String.valueOf(containerActivity.getReferrer());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("getting referrer from getReferrer: ");
            sb.append(valueOf);
            sb.toString();
            str = containerActivity.getReferrer().getAuthority();
        } else {
            str = null;
        }
        if (str == null) {
            str = containerActivity.getCallingPackage();
        }
        if (!TextUtils.isEmpty(str)) {
            i = !str.contains("com.google.android.contacts") ? !str.contains("com.google.android.gms.settings") ? !str.contains("com.google.android.gms.people.notification") ? 1 : 3 : 2 : 4;
        } else {
            i = 1;
        }
        almk almk = amuh.f75945a;
        bxvd da = ammn.f75312h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammn ammn = (ammn) da.f164949b;
        ammn.f75315b = 13;
        int i3 = 1 | ammn.f75314a;
        ammn.f75314a = i3;
        int i4 = b - 1;
        if (b != 0) {
            ammn.f75317d = i4;
            int i5 = i3 | 4;
            ammn.f75314a = i5;
            ammn.f75319f = i - 1;
            ammn.f75314a = i5 | 16;
            almk.mo40519a((ammn) da.mo74062i(), (String) null);
            return;
        }
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f75917g = new amuh();
    }
}
