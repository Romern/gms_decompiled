package p000;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;

/* renamed from: fzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fzc extends RecyclerView {

    /* renamed from: a */
    protected fyt f17726a;

    /* renamed from: b */
    public abz f17727b;

    public fzc(Context context) {
        super(context);
        super.setOnScrollListener(new fzb(this));
    }

    /* renamed from: a */
    public abstract void mo11551a(int i);

    /* renamed from: a */
    public abstract void mo11552a(int i, int i2, int i3);

    public final void setOnScrollListener(abz abz) {
        this.f17727b = abz;
    }
}
