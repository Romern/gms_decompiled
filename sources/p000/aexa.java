package p000;

import android.view.View;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;
import java.util.Iterator;

/* renamed from: aexa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexa extends aewz {

    /* renamed from: a */
    final /* synthetic */ UpdateSharesChimeraActivity f63967a;

    /* renamed from: c */
    private final int f63968c;

    /* renamed from: d */
    private final boolean f63969d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aexa(UpdateSharesChimeraActivity updateSharesChimeraActivity, int i, boolean z) {
        super(updateSharesChimeraActivity);
        this.f63967a = updateSharesChimeraActivity;
        this.f63968c = i;
        this.f63969d = z;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo34634b(Object obj) {
        AudienceMember audienceMember = (AudienceMember) obj;
        aetk aetk = this.f63967a.f79755f;
        int i = this.f63968c;
        bxvd da = cajh.f174820f.mo74144da();
        int i2 = 0;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajh cajh = (cajh) da.f164949b;
        cajh.f174823b = 4;
        boolean z = true;
        int i3 = cajh.f174822a | 1;
        cajh.f174822a = i3;
        int i4 = 8;
        cajh.f174822a = i3 | 8;
        cajh.f174826e = i;
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
        if (!this.f63969d) {
            this.f63967a.mo43823a(bnkn.m109665a(audienceMember));
            return;
        }
        if (!this.f63967a.f79754e.contains(audienceMember)) {
            this.f63967a.f79754e.add(audienceMember);
        } else {
            this.f63967a.f79754e.remove(audienceMember);
        }
        UpdateSharesChimeraActivity updateSharesChimeraActivity = this.f63967a;
        View view = updateSharesChimeraActivity.f79758i;
        if (!updateSharesChimeraActivity.f79754e.isEmpty()) {
            i4 = 0;
        }
        view.setVisibility(i4);
        Iterator it = this.f63967a.f79754e.iterator();
        while (true) {
            if (it.hasNext()) {
                if (aexk.m52648c((AudienceMember) it.next())) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        View view2 = this.f63967a.f79759j;
        if (!z) {
            i2 = 4;
        }
        view2.setVisibility(i2);
    }
}
