package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: pst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class pst extends BasePendingResult {

    /* renamed from: c */
    pue f40157c;

    /* renamed from: d */
    public final boolean f40158d;

    /* renamed from: e */
    final /* synthetic */ psx f40159e;

    public pst(psx psx) {
        this(psx, false);
    }

    /* renamed from: a */
    public static final psu m31165a(Status status) {
        return new pss(status);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return m31165a(status);
    }

    /* renamed from: d */
    public abstract void mo23598d();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pst(psx psx, boolean z) {
        super((rkb) null);
        this.f40159e = psx;
        this.f40158d = z;
        this.f40157c = new psr(this);
    }
}
