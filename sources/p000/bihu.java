package p000;

import android.os.Bundle;
import com.google.android.places.p095ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: bihu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bihu implements rjz {

    /* renamed from: a */
    final /* synthetic */ bije f120639a;

    public bihu(bije bije) {
        this.f120639a = bije;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        bije bije = this.f120639a;
        AliasEditorChimeraActivity aliasEditorChimeraActivity = bije.f120714a;
        if (aliasEditorChimeraActivity.f151378f) {
            aelh aelh = aliasEditorChimeraActivity.f151381i;
            if (aelh != null) {
                aliasEditorChimeraActivity.mo71308b(aelh.mo8007a(), bije.f120714a.f151381i.mo8025r().toString());
            } else {
                aliasEditorChimeraActivity.mo71307b(aliasEditorChimeraActivity.f151380h);
            }
            bije.f120714a.f151378f = false;
        }
    }
}
