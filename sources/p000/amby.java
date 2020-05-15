package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: amby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amby extends alln {

    /* renamed from: a */
    final /* synthetic */ String f74680a;

    /* renamed from: b */
    final /* synthetic */ String f74681b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amby(rkb rkb, String str, String str2) {
        super(rkb);
        this.f74680a = str;
        this.f74681b = str2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amaz.a(rlf, boolean, boolean, java.lang.String, java.lang.String, int):void
     arg types: [amby, int, int, java.lang.String, java.lang.String, int]
     candidates:
      amaz.a(rlf, java.lang.String, java.lang.String, int, java.lang.String, boolean):void
      amaz.a(rlf, boolean, boolean, java.lang.String, java.lang.String, int):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((amaz) rjd).mo41094a((rlf) this, true, true, this.f74680a, this.f74681b, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new ambx(status);
    }
}
