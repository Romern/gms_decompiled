package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: azmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azmf extends FrameLayout {

    /* renamed from: a */
    public cbit f99638a;

    /* renamed from: b */
    public final View f99639b = findViewById(C0126R.C0129id.suggestion_button_internal);

    /* renamed from: c */
    public final TextView f99640c = ((TextView) findViewById(C0126R.C0129id.suggestion_button_label));

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, azmf, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public azmf(Context context) {
        super(context);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.ms_suggestion_button, (ViewGroup) this, true);
    }

    /* renamed from: a */
    public final void mo55046a(String str) {
        this.f99640c.setText(str);
    }
}
