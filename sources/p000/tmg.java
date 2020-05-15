package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: tmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tmg implements tjm {

    /* renamed from: a */
    final /* synthetic */ DataHolder f46264a;

    /* renamed from: b */
    final /* synthetic */ Status f46265b;

    /* renamed from: c */
    private final tir f46266c;

    public tmg(DataHolder dataHolder, Status status) {
        this.f46264a = dataHolder;
        this.f46265b = status;
        DataHolder dataHolder2 = this.f46264a;
        this.f46266c = dataHolder2 != null ? new tir(dataHolder2) : null;
    }

    /* renamed from: b */
    public final tir mo26586b() {
        return this.f46266c;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f46265b;
    }
}
