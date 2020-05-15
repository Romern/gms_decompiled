package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.people.p062ui.widget.AvatarReferenceImageView;

/* renamed from: fym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fym extends acm {

    /* renamed from: A */
    public final TextView f17623A;

    /* renamed from: B */
    public final View f17624B;

    /* renamed from: C */
    public final ImageView f17625C;

    /* renamed from: D */
    public final View f17626D;

    /* renamed from: E */
    public final TextView f17627E;

    /* renamed from: t */
    public final View f17628t;

    /* renamed from: u */
    public final View f17629u;

    /* renamed from: v */
    public final AvatarReferenceImageView f17630v;

    /* renamed from: w */
    public final View f17631w;

    /* renamed from: x */
    public final ImageView f17632x;

    /* renamed from: y */
    public final ImageView f17633y;

    /* renamed from: z */
    public final TextView f17634z;

    public fym(View view) {
        super(view);
        this.f17628t = view.findViewById(C0126R.C0129id.container);
        this.f17629u = view.findViewById(C0126R.C0129id.avatar_frame);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0126R.C0129id.avatar_container);
        if (viewGroup != null) {
            if (viewGroup.getChildCount() == 0) {
                AvatarReferenceImageView avatarReferenceImageView = new AvatarReferenceImageView(viewGroup.getContext());
                this.f17630v = avatarReferenceImageView;
                viewGroup.addView(avatarReferenceImageView, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f17630v = (AvatarReferenceImageView) viewGroup.getChildAt(0);
            }
            this.f17630v.mo46481d();
        } else {
            this.f17630v = null;
        }
        this.f17631w = view.findViewById(C0126R.C0129id.selector_container);
        this.f17632x = (ImageView) view.findViewById(C0126R.C0129id.selector);
        this.f17633y = (ImageView) view.findViewById(C0126R.C0129id.contact_method);
        this.f17634z = (TextView) view.findViewById(C0126R.C0129id.name);
        this.f17623A = (TextView) view.findViewById(C0126R.C0129id.selected_name);
        this.f17627E = (TextView) view.findViewById(C0126R.C0129id.contact_detail);
        this.f17624B = view.findViewById(C0126R.C0129id.channel_switcher);
        this.f17625C = (ImageView) view.findViewById(C0126R.C0129id.channel_switcher_icon);
        this.f17626D = view.findViewById(C0126R.C0129id.disabled_overlay);
    }
}
