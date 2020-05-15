package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;

/* renamed from: akjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjb extends abr {

    /* renamed from: a */
    public int f72071a = 0;

    /* renamed from: b */
    private final Context f72072b;

    /* renamed from: c */
    private final int f72073c;

    /* renamed from: d */
    private View f72074d;

    public akjb(Context context, int i) {
        this.f72072b = context;
        this.f72073c = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.support.v7.widget.RecyclerView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m59868a(RecyclerView recyclerView) {
        View inflate = LayoutInflater.from(this.f72072b).inflate((int) C0126R.C0128layout.sharing_list_item_contact_decor, (ViewGroup) recyclerView, false);
        this.f72074d = inflate;
        ((TextView) inflate.findViewById(C0126R.C0129id.decor_text)).setText(this.f72073c);
        this.f72074d.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), recyclerView.getPaddingStart() + recyclerView.getPaddingEnd(), this.f72074d.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), this.f72074d.getLayoutParams().height));
        View view = this.f72074d;
        view.layout(0, 0, view.getMeasuredWidth(), this.f72074d.getMeasuredHeight());
    }

    /* renamed from: b */
    public final void mo212b(Canvas canvas, RecyclerView recyclerView) {
        View childAt;
        int childCount = recyclerView.getChildCount();
        int i = this.f72071a;
        if (childCount > i && (childAt = recyclerView.getChildAt(i)) != null && recyclerView.getChildAdapterPosition(childAt) == this.f72071a) {
            if (this.f72074d == null) {
                m59868a(recyclerView);
            }
            if (cfov.m142070w()) {
                canvas.save();
            }
            canvas.translate(0.0f, (float) (childAt.getTop() - this.f72074d.getHeight()));
            this.f72074d.draw(canvas);
            if (cfov.m142070w()) {
                canvas.restore();
            }
        }
    }

    /* renamed from: a */
    public final void mo211a(Rect rect, View view, RecyclerView recyclerView, acj acj) {
        super.mo211a(rect, view, recyclerView, acj);
        if (this.f72074d == null) {
            m59868a(recyclerView);
        }
        if (recyclerView.getChildAdapterPosition(view) == this.f72071a) {
            rect.set(0, this.f72074d.getMeasuredHeight(), 0, 0);
        }
    }
}
