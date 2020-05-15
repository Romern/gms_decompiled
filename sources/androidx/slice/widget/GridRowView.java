package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.slice.SliceItem;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GridRowView extends aqy implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: a */
    public LinearLayout f1676a;

    /* renamed from: b */
    public View f1677b;

    /* renamed from: c */
    private int[] f1678c;

    public GridRowView(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        SliceItem b;
        Pair pair = (Pair) view.getTag();
        SliceItem sliceItem = (SliceItem) pair.first;
        aqr aqr = (aqr) pair.second;
        if (sliceItem != null && (b = aqq.m1880b(sliceItem, "action", (String) null)) != null) {
            try {
                Object obj = ((C1240of) b.f1659d).f26798a;
                if (obj instanceof PendingIntent) {
                    ((PendingIntent) obj).send(null, 0, null, null, null);
                } else {
                    ((C0029api) obj).mo2269a();
                }
            } catch (PendingIntent.CanceledException e) {
                Log.e("GridRowView", "PendingIntent for slice cannot be sent", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        throw null;
    }

    public GridRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1678c = new int[2];
        new aqu(this);
        Resources resources = getContext().getResources();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f1676a = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.f1676a, new FrameLayout.LayoutParams(-1, -1));
        this.f1676a.setGravity(16);
        resources.getDimensionPixelSize(C0126R.dimen.abc_slice_icon_size);
        resources.getDimensionPixelSize(C0126R.dimen.abc_slice_small_image_size);
        resources.getDimensionPixelSize(C0126R.dimen.abc_slice_grid_image_only_height);
        resources.getDimensionPixelSize(C0126R.dimen.abc_slice_grid_image_min_width);
        resources.getDimensionPixelSize(C0126R.dimen.abc_slice_grid_gutter);
        resources.getDimensionPixelSize(C0126R.dimen.abc_slice_grid_text_padding);
        View view = new View(getContext());
        this.f1677b = view;
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        this.f1677b.getLocationOnScreen(this.f1678c);
        this.f1677b.getBackground().setHotspot((float) ((int) (motionEvent.getRawX() - ((float) this.f1678c[0]))), (float) ((int) (motionEvent.getRawY() - ((float) this.f1678c[1]))));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1677b.setPressed(true);
        } else if (actionMasked == 3 || actionMasked == 1 || actionMasked == 2) {
            this.f1677b.setPressed(false);
        }
        return false;
    }
}
