package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: arzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arzu extends ArrayAdapter {

    /* renamed from: a */
    private final int f88543a;

    public arzu(Context context, int i) {
        super(context, i, new ArrayList());
        this.f88543a = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(this.f88543a, viewGroup, false);
        }
        arzv arzv = (arzv) getItem(i);
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.title);
        boolean z = !TextUtils.isEmpty(arzv.f88545b) && !arzv.f88545b.equalsIgnoreCase(arzv.f88544a);
        textView.setVisibility(!z ? 8 : 0);
        if (z) {
            textView.setText(arzv.f88545b);
            if (arzv.f88547d) {
                textView.setAlpha(0.5f);
            }
        }
        TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.subtitle);
        textView2.setText(arzv.f88544a);
        textView2.setVisibility(0);
        if (arzv.f88547d) {
            textView2.setAlpha(0.5f);
        }
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.image);
        Bitmap bitmap = arzv.f88546c;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(C0126R.C0127drawable.product_logo_avatar_circle_blue_color_36);
        }
        if (arzv.f88547d) {
            imageView.setAlpha(0.5f);
        }
        return view;
    }
}
