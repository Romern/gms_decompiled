package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bilx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bilx extends acm {

    /* renamed from: s */
    public final TextView f120869s;

    /* renamed from: t */
    public final TextView f120870t;

    /* renamed from: u */
    public final ImageView f120871u;

    /* renamed from: v */
    public aelh f120872v;

    /* renamed from: w */
    final /* synthetic */ bilz f120873w;

    /* renamed from: x */
    private final View f120874x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bilx(bilz bilz, View view) {
        super(view);
        this.f120873w = bilz;
        this.f120874x = view;
        view.setOnClickListener(new bilw(this));
        this.f120869s = (TextView) view.findViewById(C0126R.C0129id.place_name);
        this.f120870t = (TextView) view.findViewById(C0126R.C0129id.place_address);
        this.f120871u = (ImageView) view.findViewById(C0126R.C0129id.place_icon);
    }
}
