package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.manage.FamilyManagementChimeraActivity;
import com.google.android.gms.family.p042v2.model.PageData;

/* renamed from: wom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wom implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wot f51036a;

    /* renamed from: b */
    private final String f51037b;

    /* renamed from: c */
    private final brcm f51038c;

    public wom(wot wot, String str, brcm brcm) {
        this.f51036a = wot;
        this.f51037b = str;
        this.f51038c = brcm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f51036a.getActivity();
        wot wot = this.f51036a;
        return new wqc(activity, wot.f51049d, wot.f51048c.mo18479k(), this.f51036a.f51048c.mo18478j(), this.f51037b, this.f51038c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        this.f51036a.mo29254g();
        if (why.f50696b) {
            Object obj2 = why.f50695a;
            if (obj2 != null) {
                bray bray = (bray) obj2;
                if (bray.f142209a) {
                    bree bree = bray.f142210b;
                    if (bree == null) {
                        bree = bree.f142590e;
                    }
                    PageData pageData = new PageData(bree);
                    wor wor = this.f51036a.f51048c;
                    if (wor != null) {
                        wor.mo18512a(pageData, this.f51037b, this.f51038c.f142395g);
                        return;
                    }
                    return;
                }
            }
            bree bree2 = ((bray) obj2).f142211c;
            if (bree2 == null) {
                bree2 = bree.f142590e;
            }
            wgm.m41917a((FamilyManagementChimeraActivity) this.f51036a.getActivity(), new PageData(bree2), this.f51036a.f51049d, new wol(), null, false).show();
            return;
        }
        this.f51036a.mo29252e();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
