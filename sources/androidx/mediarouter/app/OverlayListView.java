package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class OverlayListView extends ListView {

    /* renamed from: a */
    private final List f1548a = new ArrayList();

    public OverlayListView(Context context) {
        super(context);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1548a.size() > 0) {
            List list = this.f1548a;
            if (list.size() > 0) {
                akk akk = (akk) list.get(0);
                throw null;
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
