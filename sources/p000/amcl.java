package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.List;

/* renamed from: amcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amcl extends alln {

    /* renamed from: a */
    final /* synthetic */ String f74704a;

    /* renamed from: b */
    final /* synthetic */ String f74705b;

    /* renamed from: c */
    final /* synthetic */ String f74706c;

    /* renamed from: m */
    final /* synthetic */ List f74707m;

    /* renamed from: n */
    final /* synthetic */ List f74708n;

    /* renamed from: o */
    final /* synthetic */ FavaDiagnosticsEntity f74709o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amcl(rkb rkb, String str, String str2, String str3, List list, List list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        super(rkb);
        this.f74704a = str;
        this.f74705b = str2;
        this.f74706c = str3;
        this.f74707m = list;
        this.f74708n = list2;
        this.f74709o = favaDiagnosticsEntity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((amaz) rjd).mo41092a(this, this.f74704a, this.f74705b, this.f74706c, this.f74707m, this.f74708n, this.f74709o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new amck(status);
    }
}
