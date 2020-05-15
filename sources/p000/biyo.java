package p000;

import android.content.Context;
import android.view.View;

/* renamed from: biyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biyo {

    /* renamed from: a */
    public String f122326a = "";

    /* renamed from: b */
    public View.OnClickListener f122327b = null;

    /* renamed from: c */
    public int f122328c = 0;

    /* renamed from: d */
    public int f122329d = 0;

    /* renamed from: e */
    private final Context f122330e;

    public biyo(Context context) {
        this.f122330e = context;
    }

    /* renamed from: a */
    public final biyp mo64882a() {
        return new biyp(this.f122326a, this.f122327b, this.f122328c, this.f122329d);
    }

    /* renamed from: a */
    public final void mo64883a(int i) {
        this.f122326a = this.f122330e.getString(i);
    }
}
