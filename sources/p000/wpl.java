package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.manage.FamilyManagementChimeraActivity;
import com.google.android.gms.family.p042v2.model.PageData;

/* renamed from: wpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wpl implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wpo f51093a;

    /* renamed from: b */
    private final String f51094b;

    /* renamed from: c */
    private final brcm f51095c;

    public wpl(wpo wpo, String str, brcm brcm) {
        this.f51093a = wpo;
        brcm brcm2 = brcm.UNKNOWN_FAMILY_ROLE;
        this.f51094b = str;
        this.f51095c = brcm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f51093a.getActivity();
        wpo wpo = this.f51093a;
        return new wqc(activity, wpo.f51100b, wpo.f51102d.mo18479k(), this.f51093a.f51102d.mo18478j(), this.f51094b, this.f51095c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Object obj2;
        why why = (why) obj;
        this.f51093a.mo29270c();
        wpo wpo = this.f51093a;
        if (wpo.f51102d == null) {
            return;
        }
        if (!why.f50696b || (obj2 = why.f50695a) == null) {
            wpo.mo29272e();
            this.f51093a.mo29271d();
            return;
        }
        bray bray = (bray) obj2;
        if (bray.f142209a) {
            bree bree = bray.f142210b;
            if (bree == null) {
                bree = bree.f142590e;
            }
            this.f51093a.f51102d.mo18512a(new PageData(bree), this.f51094b, this.f51095c.f142395g);
            return;
        }
        bree bree2 = bray.f142211c;
        if (bree2 == null) {
            bree2 = bree.f142590e;
        }
        this.f51093a.mo29272e();
        wgm.m41917a((FamilyManagementChimeraActivity) this.f51093a.getActivity(), new PageData(bree2), this.f51093a.f51100b, new wpk(), null, false).show();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
