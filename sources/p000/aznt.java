package p000;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: aznt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aznt extends aznc {
    public aznt(Activity activity, azcb azcb, azmy azmy, aznz aznz, azmz azmz, aznd aznd, azni azni, aznf aznf, azng azng) {
        super(activity, azcb, azmy, aznz, azmz, null, aznd, azni, aznf, azng);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo55095a(ViewGroup viewGroup, Cursor cursor) {
        return LayoutInflater.from(this.f99695b).inflate((int) C0126R.C0128layout.ms_message_item, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo55090b(View view, Cursor cursor) {
        View view2 = view;
        Cursor cursor2 = cursor;
        TextView textView = (TextView) view2.findViewById(C0126R.C0129id.message_text_view);
        String a = azpi.m86066a(cursor2.getBlob(7));
        new Object[1][0] = a;
        textView.setText(a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, this.f99694a.getResources().getDimensionPixelSize(C0126R.dimen.read_receipt_size), 0);
        int i = 11;
        if (azdd.m85390c(cursor2.getInt(12))) {
            ((LinearLayout) view2.findViewById(C0126R.C0129id.message_horizontal_container)).setGravity(8388613);
            ((LinearLayout) view2.findViewById(C0126R.C0129id.message_text_container)).setGravity(8388613);
            Integer num = this.f99696c.f98955e;
            if (num != null) {
                textView.setTextColor(num.intValue());
                textView.setLinkTextColor(num.intValue());
            } else {
                int color = this.f99694a.getResources().getColor(C0126R.color.ms_default_theme_font_color);
                textView.setTextColor(color);
                textView.setLinkTextColor(color);
            }
            GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
            int color2 = this.f99694a.getResources().getColor(C0126R.color.ms_default_outgoing_message_background_color);
            Integer num2 = this.f99696c.f98954d;
            if (num2 != null) {
                color2 = num2.intValue();
            }
            if (gradientDrawable != null) {
                gradientDrawable.setColor(color2);
            }
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.addRule(21);
            layoutParams.addRule(11);
        } else {
            ((LinearLayout) view2.findViewById(C0126R.C0129id.message_horizontal_container)).setGravity(8388611);
            ((LinearLayout) view2.findViewById(C0126R.C0129id.message_text_container)).setGravity(8388611);
            Integer num3 = this.f99696c.f98953c;
            if (num3 != null) {
                textView.setTextColor(num3.intValue());
                textView.setLinkTextColor(num3.intValue());
            } else {
                int color3 = this.f99694a.getResources().getColor(C0126R.color.ms_default_theme_font_color);
                textView.setTextColor(color3);
                textView.setLinkTextColor(color3);
            }
            GradientDrawable gradientDrawable2 = (GradientDrawable) textView.getBackground();
            if (gradientDrawable2 != null) {
                Integer num4 = this.f99696c.f98952b;
                if (num4 != null) {
                    gradientDrawable2.setColor(num4.intValue());
                } else {
                    gradientDrawable2.setColor(this.f99694a.getResources().getColor(C0126R.color.ms_default_app_theme_color));
                }
            }
            int i3 = Build.VERSION.SDK_INT;
            layoutParams.addRule(20);
            if (!azpi.m86084c(this.f99694a)) {
                i = 9;
            }
            layoutParams.addRule(i);
        }
        textView.setLayoutParams(layoutParams);
        aznf aznf = this.f99702i;
        if (aznf != null) {
            Context context = this.f99694a;
            TextView textView2 = (TextView) view2.findViewById(C0126R.C0129id.message_text_sender);
            textView2.setVisibility(0);
            View findViewById = view2.findViewById(C0126R.C0129id.ms_message_status);
            int i4 = cursor2.getInt(12);
            String string = cursor2.getString(9);
            ImageView imageView = (ImageView) view2.findViewById(C0126R.C0129id.ms_read_receipt);
            if (azdd.m85390c(i4)) {
                imageView.setVisibility(0);
                view2.findViewById(C0126R.C0129id.message_text_separator).setVisibility(8);
                if (i4 == 32) {
                    TextView textView3 = (TextView) view2.findViewById(C0126R.C0129id.ms_status_text);
                    findViewById.setVisibility(0);
                    textView2.setVisibility(4);
                    boolean r = aznf.f99716a.mo55080r();
                    textView3.setText(context.getString(C0126R.string.message_send_failure_notification_text));
                    textView3.setTextColor(context.getResources().getColor(C0126R.color.material_google_red_500));
                    if (!r) {
                        view2.setOnClickListener(new azne(aznf, imageView, context, findViewById, view, string, cursor2.getString(13), cursor2.getString(1)));
                    }
                } else {
                    textView2.setVisibility(8);
                    findViewById.setVisibility(8);
                }
                imageView.setImageDrawable(azpi.m86060a(i4, aznf.f99717b, context));
            } else {
                imageView.setVisibility(8);
            }
        }
        mo55091c(view, cursor);
        mo55092d(view, cursor);
    }
}
