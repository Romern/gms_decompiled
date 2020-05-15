package p000;

import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* renamed from: bjce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjce {

    /* renamed from: a */
    public acc f122508a;

    /* renamed from: b */
    public acj f122509b;

    /* renamed from: c */
    public int f122510c;

    /* renamed from: d */
    public int f122511d;

    /* renamed from: e */
    public int f122512e;

    /* renamed from: f */
    public boolean f122513f;

    /* renamed from: g */
    public boolean f122514g;

    /* renamed from: h */
    public boolean f122515h;

    /* renamed from: i */
    public final /* synthetic */ SpannedGridLayoutManager f122516i;

    public bjce(SpannedGridLayoutManager spannedGridLayoutManager) {
        this.f122516i = spannedGridLayoutManager;
    }

    /* renamed from: a */
    public final boolean mo64988a() {
        int i;
        if (!this.f122513f) {
            bjcf bjcf = this.f122516i.f151569a;
            i = this.f122510c;
            int d = bjcf.mo64992d(i);
            while (i > 0 && bjcf.mo64992d(i) == d) {
                i--;
            }
            if (bjcf.mo64992d(i) == d) {
                i = -1;
            }
            this.f122510c = i;
        } else {
            i = this.f122516i.f151569a.mo64993e(this.f122510c);
            this.f122510c = i;
        }
        return this.f122516i.f151569a.mo64991c(i);
    }
}
