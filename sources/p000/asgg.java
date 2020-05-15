package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: asgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asgg extends aaab {

    /* renamed from: a */
    private final long f88914a;

    /* renamed from: b */
    private final long f88915b;

    /* renamed from: c */
    private final List f88916c;

    /* renamed from: d */
    private final gax f88917d;

    public asgg(gax gax, long j, long j2, List list) {
        super(193, "AppUsage");
        this.f88917d = gax;
        this.f88914a = j;
        this.f88915b = j2;
        this.f88916c = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        List list;
        if (this.f88914a > this.f88915b || ((list = this.f88916c) != null && list.isEmpty())) {
            throw new aaaj(10, "invalid parameters");
        }
        this.f88917d.mo11606a(Status.f30107a, asgy.m74106a(this.f88914a, this.f88915b, this.f88916c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88917d.mo11606a(status, (List) null);
    }
}
