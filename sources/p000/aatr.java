package p000;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aatr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aatr extends LinearLayout {

    /* renamed from: a */
    private List f56568a;

    public aatr(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo31783a(aavk aavk) {
        if (this.f56568a == null) {
            this.f56568a = new ArrayList();
        }
        this.f56568a.add(aavk);
    }

    public final void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            List list = this.f56568a;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((aavk) list.get(i2)).mo31795e();
                }
            }
        }
    }
}
