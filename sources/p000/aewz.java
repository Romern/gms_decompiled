package p000;

import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;

/* renamed from: aewz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aewz implements aevy {

    /* renamed from: b */
    final /* synthetic */ UpdateSharesChimeraActivity f63966b;

    public aewz(UpdateSharesChimeraActivity updateSharesChimeraActivity) {
        this.f63966b = updateSharesChimeraActivity;
    }

    /* renamed from: a */
    public void mo34619a(Object obj) {
        this.f63966b.f79763n = new aewy(this, obj);
        if (this.f63966b.mo43829d()) {
            this.f63966b.f79763n.run();
            this.f63966b.f79763n = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo34634b(Object obj);
}
