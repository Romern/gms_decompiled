package p000;

import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.cast.JGCastService;

/* renamed from: akiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akiu {
    /* renamed from: a */
    public static void m59852a(Context context, TextView textView, float f, float f2) {
        float f3 = context.getResources().getDisplayMetrics().scaledDensity;
        float f4 = f / f3;
        float f5 = f2 / f3;
        textView.setTextSize(2, f4);
        float width = (float) ((textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd());
        do {
            double ceil = Math.ceil((double) (textView.getPaint().measureText(textView.getText().toString()) / width));
            textView.setTextSize(2, f4);
            f4 -= 2.0f;
            if (((int) ceil) <= textView.getMaxLines()) {
                return;
            }
        } while (f4 >= f5);
    }

    /* renamed from: a */
    public static void m59853a(MotionEvent motionEvent, View view, View view2) {
        int i;
        int i2;
        if (motionEvent.getX() < 0.0f) {
            i = (int) motionEvent.getX();
        } else if (motionEvent.getX() > ((float) view.getWidth())) {
            i = (((int) motionEvent.getX()) - view.getWidth()) + view2.getWidth();
        } else {
            i = (int) ((motionEvent.getX() / ((float) view.getWidth())) * ((float) view2.getWidth()));
        }
        if (motionEvent.getY() < 0.0f) {
            i2 = (int) motionEvent.getY();
        } else if (motionEvent.getY() > ((float) view.getHeight())) {
            i2 = view2.getHeight() + (((int) motionEvent.getY()) - view.getHeight());
        } else {
            i2 = (int) ((motionEvent.getY() / ((float) view.getHeight())) * ((float) view2.getHeight()));
        }
        motionEvent.setLocation((float) i, (float) i2);
    }

    /* renamed from: a */
    public static void m59854a(View view) {
        Rect rect;
        int i;
        if (view.getParent() == null || !((View) view.getParent()).isLaidOut()) {
            rect = new Rect(0, 0, 1073741823, 1073741823);
        } else {
            View view2 = (View) view.getParent();
            rect = new Rect(0, 0, view2.getWidth(), view2.getHeight());
        }
        if (view.getLayoutParams() != null) {
            int makeMeasureSpec = view.getLayoutParams().width == -2 ? View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE) : view.getLayoutParams().width == -1 ? View.MeasureSpec.makeMeasureSpec(rect.width(), JGCastService.FLAG_PRIVATE_DISPLAY) : View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().width, JGCastService.FLAG_PRIVATE_DISPLAY);
            if (view.getLayoutParams().height == -2) {
                i = View.MeasureSpec.makeMeasureSpec(rect.height(), Integer.MIN_VALUE);
            } else if (view.getLayoutParams().height == -1) {
                i = View.MeasureSpec.makeMeasureSpec(rect.height(), JGCastService.FLAG_PRIVATE_DISPLAY);
            } else {
                i = View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().height, JGCastService.FLAG_PRIVATE_DISPLAY);
            }
            m59856a(view, makeMeasureSpec, i);
            return;
        }
        m59856a(view, View.MeasureSpec.makeMeasureSpec(rect.width(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(rect.height(), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* renamed from: a */
    public static void m59855a(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* renamed from: a */
    private static void m59856a(View view, int i, int i2) {
        view.measure(i, i2);
        view.layout(0, 0, view.getWidth(), view.getHeight());
    }

    /* renamed from: a */
    public static void m59857a(View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        view2.setTranslationX(view2.getTranslationX() - ((float) (iArr2[0] - iArr[0])));
        view2.setTranslationY(view2.getTranslationY() - ((float) (iArr2[1] - iArr[1])));
    }

    /* renamed from: a */
    public static void m59858a(ViewGroup viewGroup, boolean z) {
        try {
            viewGroup.suppressLayout(z);
        } catch (NoSuchMethodError e) {
        }
    }

    /* renamed from: a */
    public static void m59859a(TextView textView, int i, int i2, View.OnClickListener onClickListener) {
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new akit(onClickListener), i, i2, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    public static boolean m59860a(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
