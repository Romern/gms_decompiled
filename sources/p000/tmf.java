package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: tmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tmf implements tjy {

    /* renamed from: a */
    final /* synthetic */ DataHolder f46261a;

    /* renamed from: b */
    final /* synthetic */ Status f46262b;

    /* renamed from: c */
    private final tir f46263c;

    public tmf(DataHolder dataHolder, Status status) {
        this.f46261a = dataHolder;
        this.f46262b = status;
        DataHolder dataHolder2 = this.f46261a;
        this.f46263c = dataHolder2 != null ? new tir(dataHolder2) : null;
    }

    /* renamed from: b */
    public final tir mo26614b() {
        return this.f46263c;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f46262b;
    }
}
