package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: aulp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aulp extends sji {

    /* renamed from: a */
    private final Bundle f92047a;

    /* renamed from: f */
    public final auqe f92048f;

    /* renamed from: g */
    public final sce f92049g = new aulo(this);

    public aulp(auqe auqe, Bundle bundle) {
        super(89, "BaseOperation");
        sdo.m34959a(auqe);
        this.f92048f = auqe;
        this.f92047a = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bundle mo50660a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50661a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        this.f92048f.mo50793a(Status.f30107a, mo50660a(this.f92047a));
    }

    /* renamed from: a */
    public void mo11357a(Status status) {
        this.f92048f.mo50793a(status, null);
    }
}
