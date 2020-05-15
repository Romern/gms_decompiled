package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: ankr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankr extends rle {

    /* renamed from: a */
    final /* synthetic */ String f77027a;

    /* renamed from: b */
    final /* synthetic */ FavaDiagnosticsEntity f77028b;

    /* renamed from: c */
    final /* synthetic */ FavaDiagnosticsEntity f77029c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ankr(rkb rkb, String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        super(ankt.f77034d, rkb);
        this.f77027a = str;
        this.f77028b = favaDiagnosticsEntity;
        this.f77029c = favaDiagnosticsEntity2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        super.mo17716a((rkk) obj);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        anty anty = (anty) rjd;
        String str = this.f77027a;
        FavaDiagnosticsEntity favaDiagnosticsEntity = this.f77028b;
        FavaDiagnosticsEntity favaDiagnosticsEntity2 = this.f77029c;
        anty.mo25288A();
        ((antx) anty.mo25289B()).mo42280a(str, favaDiagnosticsEntity, favaDiagnosticsEntity2);
    }
}
