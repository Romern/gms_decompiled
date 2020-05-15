package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;

/* renamed from: aewq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewq extends aewz {

    /* renamed from: a */
    final /* synthetic */ UpdateSharesChimeraActivity f63955a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aewq(UpdateSharesChimeraActivity updateSharesChimeraActivity) {
        super(updateSharesChimeraActivity);
        this.f63955a = updateSharesChimeraActivity;
    }

    /* renamed from: a */
    public final void mo34635a() {
        UpdateSharesChimeraActivity updateSharesChimeraActivity = this.f63955a;
        if (updateSharesChimeraActivity.mo43824b().mo43781c() != 2) {
            updateSharesChimeraActivity.mo43825b(1);
            return;
        }
        updateSharesChimeraActivity.f79761l = new aewd(updateSharesChimeraActivity, updateSharesChimeraActivity.f79752c, updateSharesChimeraActivity.f79753d, updateSharesChimeraActivity.findViewById(C0126R.C0129id.filler).getMeasuredHeight());
        updateSharesChimeraActivity.f79760k.setLayoutManager(new aab(updateSharesChimeraActivity.f79753d, null));
        updateSharesChimeraActivity.f79760k.setAdapter(updateSharesChimeraActivity.f79761l);
        updateSharesChimeraActivity.f79757h.showNext();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo34634b(Object obj) {
        Void voidR = (Void) obj;
        mo34635a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo34619a(Object obj) {
        Void voidR = (Void) obj;
        if (this.f63955a.mo43824b().mo43781c() == 2) {
            mo34635a();
        } else {
            super.mo34619a(voidR);
        }
    }
}
