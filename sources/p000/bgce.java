package p000;

import android.app.PendingIntent;

/* renamed from: bgce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgce extends bgck {

    /* renamed from: a */
    final boolean f116026a;

    /* renamed from: b */
    final /* synthetic */ bgcg f116027b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgce(bgcg bgcg, PendingIntent pendingIntent, long j, long j2, bgns bgns, boolean z, bhcv bhcv, boolean z2, String str) {
        super(pendingIntent, j, j2, bgns, bhcv, false, z2, str);
        boolean z3 = z;
        this.f116027b = bgcg;
        this.f116026a = z3;
        String str2 = this.f116022m;
        this.f116027b.f116031b.mo26056a(new bgcf(this.f116023n, str2 == null ? "" : str2, z3, this.f116021l), this.f116051q);
    }

    /* renamed from: a */
    public final void mo62594a() {
        String str = this.f116022m;
        if (str == null) {
            str = "";
        }
        this.f116027b.f116031b.mo26057b(new bgcf(this.f116023n, str, this.f116026a, this.f116021l), this.f116051q);
    }
}
