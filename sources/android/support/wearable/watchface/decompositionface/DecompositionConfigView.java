package android.support.wearable.watchface.decompositionface;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DecompositionConfigView extends ImageView {

    /* renamed from: a */
    public ArrayList f1466a;

    /* renamed from: b */
    private final GestureDetector.SimpleOnGestureListener f1467b = new agg(this);

    /* renamed from: c */
    private final GestureDetector f1468c = new GestureDetector(getContext(), this.f1467b);

    public DecompositionConfigView(Context context) {
        super(context);
        getContext();
        new agi();
        new agf();
        new Rect();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f1468c.onTouchEvent(motionEvent);
    }

    public DecompositionConfigView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        new agi();
        new agf();
        new Rect();
    }
}
