package p000;

import android.os.SystemClock;
import java.util.Collections;

/* renamed from: bgeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgeh implements bgec {

    /* renamed from: a */
    final /* synthetic */ bgei f116233a;

    public bgeh(bgei bgei) {
        this.f116233a = bgei;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgei.a(bgmk, bfnv[], boolean):void
     arg types: [bgmk, ?[OBJECT, ARRAY], int]
     candidates:
      bgei.a(boolean, int, long):void
      bgei.a(bgmk, bfmx, boolean):void
      bgei.a(bgmk, boolean, boolean):void
      bgei.a(bgmk, bfnv[], boolean):void */
    /* renamed from: a */
    public final void mo62705a(bgmk bgmk, bsax bsax) {
        long j;
        bgei bgei = this.f116233a;
        if (!bgei.f116260l) {
            bgei.f116261m = false;
            bgei.mo62712a(bgmk, (bfnv[]) null, true);
            bgeb bgeb = this.f116233a.f116244J;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (bsax == null) {
                bgeb.f116211b = elapsedRealtime;
                if (!bgeb.f116212c) {
                    if (bgeb.f116210a.size() > 3) {
                        bgeb.f116210a.removeFirst();
                    }
                    bgeb.f116210a.add(Long.valueOf(elapsedRealtime));
                    Collections.sort(bgeb.f116210a);
                    if (!bgeb.f116214e) {
                        j = 1800000;
                    } else {
                        j = 600000;
                    }
                    if (bgeb.f116210a.size() >= 3 && elapsedRealtime - ((Long) bgeb.f116210a.getFirst()).longValue() < j) {
                        bgeb.f116212c = true;
                        return;
                    }
                    return;
                }
                return;
            }
            bgeb.mo62702a();
            bgeb.f116211b = 0;
        }
    }
}
