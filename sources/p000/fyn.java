package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: fyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fyn extends acm {

    /* renamed from: s */
    public final TextView f17635s;

    /* renamed from: t */
    public final EditText f17636t;

    /* renamed from: u */
    public final View f17637u;

    /* renamed from: v */
    public final TextView f17638v;

    /* renamed from: w */
    public final ImageView f17639w;

    /* renamed from: x */
    public final View f17640x;

    /* renamed from: y */
    public final View f17641y;

    public fyn(View view) {
        super(view);
        this.f17635s = (TextView) view.findViewById(C0126R.C0129id.message_header);
        this.f17636t = (EditText) view.findViewById(C0126R.C0129id.message);
        this.f17637u = view.findViewById(C0126R.C0129id.message_separator);
        this.f17638v = (TextView) view.findViewById(C0126R.C0129id.message_limit);
        this.f17639w = (ImageView) view.findViewById(C0126R.C0129id.image_thumbnail);
        this.f17640x = view.findViewById(C0126R.C0129id.thumbnail_frame);
        view.findViewById(C0126R.C0129id.separator);
        this.f17641y = view.findViewById(C0126R.C0129id.preview_message);
    }
}
