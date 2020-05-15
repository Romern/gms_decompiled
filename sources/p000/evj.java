package p000;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;

/* renamed from: evj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class evj extends RecyclerView {
    public evj(Context context) {
        super(context);
        setLayoutManager(new aah());
    }

    /* renamed from: c */
    public final aah getLayoutManager() {
        aah aah = (aah) super.getLayoutManager();
        if (aah != null) {
            return aah;
        }
        throw new IllegalStateException();
    }

    public final void setLayoutManager(abu abu) {
        bmxy.m108581a(abu);
        bmxy.m108596a(abu instanceof aah, "LinearRecyclerView requires a LinearLayoutManager, but got %s", abu.getClass().getName());
        super.setLayoutManager(abu);
    }

    public evj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutManager(new aah());
    }
}
