package p000;

import com.google.android.gms.cast.internal.ApplicationStatus;

/* renamed from: ptf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ptf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ pti f40182a;

    /* renamed from: b */
    final /* synthetic */ ApplicationStatus f40183b;

    public ptf(pti pti, ApplicationStatus applicationStatus) {
        this.f40182a = pti;
        this.f40183b = applicationStatus;
    }

    public final void run() {
        boolean z;
        pti pti = this.f40182a;
        String str = this.f40183b.f29887a;
        if (!ptk.m31236a(str, pti.f40199f)) {
            pti.f40199f = str;
            z = true;
        } else {
            z = false;
        }
        pti.f40190a.mo23670a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(pti.f40201h));
        pti.f40201h = false;
    }
}
