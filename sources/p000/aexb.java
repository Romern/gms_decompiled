package p000;

import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.preference.PreferenceManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;

/* renamed from: aexb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexb extends aewz {

    /* renamed from: a */
    final /* synthetic */ UpdateSharesChimeraActivity f63970a;

    /* renamed from: c */
    private final boolean f63971c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aexb(UpdateSharesChimeraActivity updateSharesChimeraActivity, boolean z) {
        super(updateSharesChimeraActivity);
        this.f63970a = updateSharesChimeraActivity;
        this.f63971c = z;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo34634b(Object obj) {
        int i;
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (!this.f63971c) {
            i = 4;
        } else {
            i = 3;
        }
        UpdateSharesChimeraActivity updateSharesChimeraActivity = this.f63970a;
        aetk aetk = updateSharesChimeraActivity.f79755f;
        String str = resolveInfo.activityInfo.applicationInfo.packageName;
        cajl a = aetk.m52536a(updateSharesChimeraActivity.mo43824b());
        bxvd da = cajh.f174820f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajh cajh = (cajh) da.f164949b;
        cajh.f174823b = i - 1;
        int i2 = cajh.f174822a | 1;
        cajh.f174822a = i2;
        str.getClass();
        int i3 = i2 | 4;
        cajh.f174822a = i3;
        cajh.f174825d = str;
        if (a != null) {
            a.getClass();
            cajh.f174824c = a;
            cajh.f174822a = i3 | 2;
        }
        cajh cajh2 = (cajh) da.mo74062i();
        bxvd d = aetk.m52539d(18);
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        caix caix = (caix) d.f164949b;
        caix caix2 = caix.f174776l;
        cajh2.getClass();
        caix.f174786i = cajh2;
        caix.f174778a |= 4096;
        aetk.mo34552a((caix) d.mo74062i());
        String str2 = updateSharesChimeraActivity.f79750a;
        String str3 = resolveInfo.activityInfo.applicationInfo.packageName;
        if (str3 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(updateSharesChimeraActivity).edit();
            String valueOf = String.valueOf(str2);
            edit.putString(valueOf.length() == 0 ? new String("default_share_app:") : "default_share_app:".concat(valueOf), str3);
            edit.apply();
        }
        updateSharesChimeraActivity.f79756g = resolveInfo;
        aexw.m52663a(updateSharesChimeraActivity, C0126R.string.location_sharing_create_link_progress);
        updateSharesChimeraActivity.getSupportLoaderManager().restartLoader(1, null, updateSharesChimeraActivity.f79762m);
    }
}
