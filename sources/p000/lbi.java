package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.service.autofill.InlinePresentation;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.inline.InlinePresentationSpec;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: lbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lbi {
    /* renamed from: a */
    public static Icon m18880a(kcz kcz, Context context) {
        int b = kcz.mo14380b();
        String a = kcz.mo14379a();
        if (a.equals("com.google.android.gms")) {
            b = qkj.m32287a(context, b);
        }
        return Icon.createWithResource(a, b);
    }

    /* renamed from: a */
    public static InlinePresentation m18881a(Context context, CharSequence charSequence, CharSequence charSequence2, kcz kcz, int i, InlinePresentationSpec inlinePresentationSpec) {
        Context context2 = context;
        CharSequence charSequence3 = charSequence2;
        kcz kcz2 = kcz;
        agx agx = new agx(charSequence);
        if (kcz2 != null) {
            double height = (double) inlinePresentationSpec.getMaxSize().getHeight();
            Double.isNaN(height);
            double ceil = Math.ceil(height * 0.6d);
            Icon a = m18880a(kcz2, context2);
            int i2 = (int) ceil;
            Drawable loadDrawable = a.loadDrawable(context2);
            if (loadDrawable != null) {
                Bitmap createBitmap = Bitmap.createBitmap(loadDrawable.getIntrinsicWidth(), loadDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                loadDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                loadDrawable.draw(canvas);
                a = Icon.createWithBitmap(Bitmap.createScaledBitmap(createBitmap, i2, i2, false));
            }
            int layoutDirection = m18883a(context).mo15384a().getLayoutDirection();
            if (i != 1) {
                if (layoutDirection != 1) {
                    agx.mo692a(a);
                } else {
                    agx.mo694b(a);
                }
            } else if (layoutDirection != 1) {
                agx.mo694b(a);
            } else {
                agx.mo692a(a);
            }
        }
        if (charSequence3 != null) {
            agx.mo693b();
            C1244oj.m19767a(charSequence3, "Subtitle should not be null");
            agx.f530a = charSequence2.toString();
        }
        PendingIntent a2 = lio.m19188a(context);
        if (a2 != null) {
            agx.mo691a(a2);
        }
        Slice a3 = agx.mo690a();
        Resources.Theme newTheme = context.getResources().newTheme();
        newTheme.applyStyle(2132018579, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, newTheme);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate((int) C0126R.C0128layout.autofill_inline_suggestion, (ViewGroup) null);
        ImageView imageView = (ImageView) viewGroup.findViewById(C0126R.C0129id.autofill_inline_suggestion_start_icon);
        TextView textView = (TextView) viewGroup.findViewById(C0126R.C0129id.autofill_inline_suggestion_title);
        TextView textView2 = (TextView) viewGroup.findViewById(C0126R.C0129id.autofill_inline_suggestion_subtitle);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(C0126R.C0129id.autofill_inline_suggestion_end_icon);
        List<SliceItem> items = a3.getItems();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < items.size(); i5++) {
            SliceItem sliceItem = items.get(i5);
            List<String> hints = sliceItem.getHints();
            String format = sliceItem.getFormat();
            if (format.equals("image")) {
                Icon icon = sliceItem.getIcon();
                if (hints.contains("inline_start_icon")) {
                    imageView.setImageIcon(icon);
                    imageView.setVisibility(0);
                    i3++;
                } else if (hints.contains("inline_end_icon")) {
                    imageView2.setImageIcon(icon);
                    imageView2.setVisibility(0);
                    i3++;
                } else {
                    throw new IllegalStateException("Unrecognized Image SliceItem in Inline Presentation");
                }
            } else if (format.equals("text")) {
                String charSequence4 = sliceItem.getText().toString();
                if (hints.contains("inline_title")) {
                    textView.setText(charSequence4);
                    textView.setVisibility(0);
                    i4++;
                } else if (hints.contains("inline_subtitle")) {
                    textView2.setText(charSequence4);
                    textView2.setVisibility(0);
                    i4++;
                } else {
                    throw new IllegalStateException("Unrecognized Text SliceItem in Inline Presentation");
                }
            } else if (!format.equals("action")) {
                continue;
            } else if (hints.contains("inline_attribution")) {
                viewGroup.setOnLongClickListener(new agy(sliceItem.getAction()));
            } else {
                throw new IllegalStateException("Unrecognized Action SliceItem in Inline Presentation");
            }
        }
        if (i3 == 1 && i4 == 0 && imageView.getVisibility() == 0) {
            viewGroup.setBackgroundColor(0);
            viewGroup.setPadding(0, 0, 0, 0);
            imageView.setMaxWidth(contextThemeWrapper.getResources().getDimensionPixelSize(C0126R.dimen.autofill_inline_suggestion_single_icon_size));
        }
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(inlinePresentationSpec.getMaxSize().getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(inlinePresentationSpec.getMaxSize().getHeight(), Integer.MIN_VALUE));
        Size size = new Size(viewGroup.getMeasuredWidth(), inlinePresentationSpec.getMaxSize().getHeight());
        return new InlinePresentation(a3, new InlinePresentationSpec.Builder(size, size).build(), false);
    }

    /* renamed from: a */
    public static InlinePresentation m18882a(Context context, CharSequence charSequence, CharSequence charSequence2, kcz kcz, InlinePresentationSpec inlinePresentationSpec) {
        return m18881a(context, charSequence, charSequence2, kcz, 1, inlinePresentationSpec);
    }

    /* renamed from: a */
    public static lrc m18883a(Context context) {
        return lrc.m19570a(new ContextThemeWrapper(context, 2132019641));
    }
}
