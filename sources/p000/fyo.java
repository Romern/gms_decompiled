package p000;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: fyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fyo extends acm {

    /* renamed from: s */
    public final AutoCompleteTextView f17642s;

    /* renamed from: t */
    public final TextView f17643t;

    /* renamed from: u */
    public final TextView f17644u;

    /* renamed from: v */
    public final ImageView f17645v;

    public fyo(View view) {
        super(view);
        this.f17642s = (AutoCompleteTextView) view.findViewById(C0126R.C0129id.search);
        this.f17643t = (TextView) view.findViewById(C0126R.C0129id.search_text);
        this.f17644u = (TextView) view.findViewById(C0126R.C0129id.recipient_count);
        this.f17645v = (ImageView) view.findViewById(C0126R.C0129id.cancel);
    }
}
