package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.audience.AudienceSelectionListCircleView;
import com.google.android.gms.plus.audience.FaclSelectionChimeraActivity;
import java.util.HashSet;

/* renamed from: anqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anqv extends anpb {

    /* renamed from: a */
    final /* synthetic */ anqw f77476a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anqv(anqw anqw, Context context, anqg anqg, String str, String str2) {
        super(context, anqg, str, str2, false);
        this.f77476a = anqw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo42038a(View view, ViewGroup viewGroup, boolean z) {
        View a = super.mo42038a(view, viewGroup, z);
        anqw anqw = this.f77476a;
        int i = anqw.f77477c;
        if (anqw.f77478a != null && anqw.mo42090b().f82306D) {
            a.setVisibility(8);
        } else if (!this.f77476a.mo42090b().f82306D) {
            a.setVisibility(0);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AudienceSelectionListCircleView mo42039a(alzj alzj, View view, ViewGroup viewGroup, boolean z) {
        AudienceSelectionListCircleView a = super.mo42039a(alzj, view, viewGroup, z);
        if (alzj.mo41059g() == 1) {
            a.mo46549c();
        } else {
            a.f82280c.setText((int) C0126R.string.plus_audience_selection_hidden_circle);
            a.f82280c.setVisibility(0);
        }
        anqw anqw = this.f77476a;
        int i = anqw.f77477c;
        if (anqw.f77478a != null && anqw.mo42090b().f82306D) {
            a.setVisibility(8);
        } else if (!this.f77476a.mo42090b().f82306D) {
            a.setVisibility(0);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo42062a(rtp rtp) {
        super.mo42062a((rtp) new rub(rtp, FaclSelectionChimeraActivity.f82302x));
        anqw anqw = this.f77476a;
        HashSet hashSet = new HashSet();
        int i = anqw.f77477c;
        anqw.f77479b = hashSet;
        for (int i2 = 0; i2 < rtp.mo24660a(); i2++) {
            alzj b = ((amev) rtp).mo24661a(i2);
            this.f77476a.f77479b.add(AudienceMember.m22640b(b.mo41056c(), b.mo41057d()));
        }
        this.f77476a.mo42148j();
    }
}
