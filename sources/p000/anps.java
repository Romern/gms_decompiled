package p000;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anps extends anpr {

    /* renamed from: a */
    public final TextView f77421a = ((TextView) findViewById(C0126R.C0129id.audience_selection_circle_name));

    /* renamed from: b */
    public View.OnClickListener f77422b;

    /* renamed from: c */
    public boolean f77423c;

    public void onClick(View view) {
        super.onClick(view);
        View.OnClickListener onClickListener = this.f77422b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, anps, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public anps(Context context) {
        super(context, null);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.plus_audience_selection_list_update_circle, (ViewGroup) this, true);
        findViewById(C0126R.C0129id.audience_selection_update_circle_view).setOnClickListener(this);
        this.f77418e = (CheckBox) findViewById(C0126R.C0129id.audience_selection_checkbox);
        this.f77418e.setOnCheckedChangeListener(this);
        this.f77418e.setOnClickListener(this);
        int i = Build.VERSION.SDK_INT;
        if (sse.m36204a()) {
            this.f77423c = true;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((LinearLayout) this.f77418e.getParent()).getLayoutParams();
        if (this.f77423c) {
            layoutParams.addRule(9, -1);
        } else {
            layoutParams.addRule(11, -1);
        }
        ((LinearLayout) this.f77418e.getParent()).setLayoutParams(layoutParams);
    }
}
