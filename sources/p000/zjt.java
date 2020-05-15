package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: zjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zjt implements aesf {

    /* renamed from: a */
    private final bqgy f55246a;

    public zjt(bqgy bqgy) {
        this.f55246a = bqgy;
    }

    /* renamed from: a */
    public final void mo31177a(Status status) {
        if (!status.mo17710c()) {
            bnsl bnsl = (bnsl) zjv.f55250a.mo68388c();
            bnsl.mo68432a("zjt", "a", 285, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Location flush failed: %s", status);
        }
        this.f55246a.mo69138b(status);
    }
}
