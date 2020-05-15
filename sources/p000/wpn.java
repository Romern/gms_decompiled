package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.model.MemberDataModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wpn implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wpo f51096a;

    /* renamed from: b */
    private final String f51097b;

    /* renamed from: c */
    private final brcm f51098c;

    public wpn(wpo wpo, String str, brcm brcm) {
        this.f51096a = wpo;
        brcm brcm2 = brcm.UNKNOWN_FAMILY_ROLE;
        this.f51097b = str;
        this.f51098c = brcm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f51096a.getActivity();
        wpo wpo = this.f51096a;
        return new wqi(activity, wpo.f51100b, wpo.f51102d.mo18479k(), this.f51096a.f51102d.mo18478j(), this.f51097b, this.f51098c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        this.f51096a.mo29270c();
        wpo wpo = this.f51096a;
        wpm wpm = wpo.f51102d;
        if (wpm != null) {
            if (why.f50696b) {
                wpm.mo18526h();
                ArrayList arrayList = this.f51096a.f51101c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    MemberDataModel memberDataModel = (MemberDataModel) arrayList.get(i);
                    if (memberDataModel.f31350a.equals(this.f51097b)) {
                        memberDataModel.f31356g = this.f51098c.f142395g;
                    } else if (this.f51098c == brcm.PARENT && memberDataModel.f31356g == 2) {
                        memberDataModel.f31356g = 3;
                    }
                }
            } else {
                wpo.mo29272e();
                this.f51096a.mo29271d();
            }
            this.f51096a.f51099a.mo29267c();
            wpo wpo2 = this.f51096a;
            wpj wpj = wpo2.f51099a;
            wpj.f51087a = wpo2.f51101c;
            wpj.f51090f = null;
            List list = wpj.f51087a;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                MemberDataModel memberDataModel2 = (MemberDataModel) list.get(i2);
                if (memberDataModel2.f31356g == 2) {
                    wpj.f51090f = memberDataModel2;
                    String valueOf = String.valueOf(memberDataModel2.f31352c);
                    wgn.m41923c("ManageParentsAdapter", valueOf.length() == 0 ? new String("Updating currentParent to ") : "Updating currentParent to ".concat(valueOf), new Object[0]);
                }
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
