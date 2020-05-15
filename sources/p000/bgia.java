package p000;

import android.location.Location;
import android.os.SystemClock;

/* renamed from: bgia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgia extends adzy {

    /* renamed from: a */
    final /* synthetic */ bgib f116474a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgia(bgib bgib, String str, String str2) {
        super(str, str2);
        this.f116474a = bgib;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9927a(Location location) {
        bgid bgid;
        if ("gps".equals(location.getProvider())) {
            long a = bgkx.f116729g.mo62941a(location);
            if (a == 0) {
                a = SystemClock.elapsedRealtime();
            }
            if (!bfkm.m97133a(location) && (bgid = (bgid) this.f116474a.f116475a.get()) != null && !location.isFromMockProvider()) {
                bgid.mo62846a(this.f116474a.f116476b, 0, new bgjm(location, a, bgid.f116484e.mo62832a()), false);
            }
        }
    }
}
