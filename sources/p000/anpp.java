package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anpp extends RelativeLayout {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, anpp, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public anpp(Context context, View.OnClickListener onClickListener) {
        super(context, null);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.plus_audience_selection_list_create_circle, (ViewGroup) this, true);
        if (onClickListener != null) {
            findViewById(C0126R.C0129id.audience_selection_create_circle_view).setOnClickListener(onClickListener);
        }
    }
}
