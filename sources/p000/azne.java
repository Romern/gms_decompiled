package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: azne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azne implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f99708a;

    /* renamed from: b */
    final /* synthetic */ Context f99709b;

    /* renamed from: c */
    final /* synthetic */ View f99710c;

    /* renamed from: d */
    final /* synthetic */ View f99711d;

    /* renamed from: e */
    final /* synthetic */ String f99712e;

    /* renamed from: f */
    final /* synthetic */ String f99713f;

    /* renamed from: g */
    final /* synthetic */ String f99714g;

    /* renamed from: h */
    final /* synthetic */ aznf f99715h;

    public azne(aznf aznf, ImageView imageView, Context context, View view, View view2, String str, String str2, String str3) {
        this.f99715h = aznf;
        this.f99708a = imageView;
        this.f99709b = context;
        this.f99710c = view;
        this.f99711d = view2;
        this.f99712e = str;
        this.f99713f = str2;
        this.f99714g = str3;
    }

    public void onClick(View view) {
        this.f99708a.setImageDrawable(C1133kh.m17836a(this.f99709b, (int) C0126R.C0127drawable.ms_ic_sending));
        this.f99710c.setVisibility(4);
        this.f99711d.setOnClickListener(null);
        if ("text/plain".equals(this.f99712e)) {
            this.f99715h.f99716a.mo55078a(this.f99713f, this.f99714g);
        }
    }
}
