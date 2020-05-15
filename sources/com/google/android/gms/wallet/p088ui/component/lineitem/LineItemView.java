package com.google.android.gms.wallet.p088ui.component.lineitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.FifeNetworkImageView;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: com.google.android.gms.wallet.ui.component.lineitem.LineItemView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LineItemView extends FrameLayout implements awyz {

    /* renamed from: a */
    ViewGroup f110571a;

    /* renamed from: b */
    LinearLayout f110572b;

    /* renamed from: c */
    LinearLayout f110573c;

    /* renamed from: d */
    TextView f110574d;

    /* renamed from: e */
    TextView f110575e;

    /* renamed from: f */
    private ViewGroup f110576f;

    /* renamed from: g */
    private FifeNetworkImageView f110577g;

    /* renamed from: h */
    private bmjy f110578h;

    /* renamed from: i */
    private boolean f110579i;

    public LineItemView(Context context) {
        super(context);
        mo60124a(context, null);
    }

    /* renamed from: a */
    private final int m94274a() {
        int a;
        bmjy bmjy = this.f110578h;
        if (bmjy == null || (a = bmjx.m108104a(bmjy.f129765f)) == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo52803b(Object obj) {
        bmjy bmjy = (bmjy) obj;
        return (bmjy == null || (bmjy.f129760a & 4) == 0) ? false : true;
    }

    public LineItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo60124a(context, attributeSet);
    }

    public LineItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo60124a(context, attributeSet);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.ui.component.lineitem.LineItemView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60124a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_line_item, (ViewGroup) this, true);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0126R.C0129id.line_item_content);
        this.f110576f = (ViewGroup) inflate.findViewById(C0126R.C0129id.line_item_left_column);
        this.f110571a = (ViewGroup) inflate.findViewById(C0126R.C0129id.line_item_right_column);
        this.f110577g = (FifeNetworkImageView) inflate.findViewById(C0126R.C0129id.line_item_image);
        this.f110572b = (LinearLayout) inflate.findViewById(C0126R.C0129id.line_item_sub_values);
        this.f110573c = (LinearLayout) inflate.findViewById(C0126R.C0129id.info_messages);
        this.f110574d = (TextView) inflate.findViewById(C0126R.C0129id.line_item_name);
        this.f110575e = (TextView) inflate.findViewById(C0126R.C0129id.line_item_value);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15409u);
        this.f110579i = obtainStyledAttributes.getBoolean(0, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize >= 0) {
            viewGroup.setMinimumHeight(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public LineItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo60124a(context, attributeSet);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo52802a(Object obj) {
        int i;
        bmjy bmjy = (bmjy) obj;
        this.f110578h = bmjy;
        Context context = getContext();
        if (TextUtils.isEmpty(bmjy.f129761b)) {
            this.f110574d.setVisibility(8);
        } else {
            this.f110574d.setText(awia.m79968a(bmjy.f129761b));
            this.f110574d.setVisibility(0);
        }
        this.f110575e.setText(awia.m79968a(bmjy.f129762c));
        awza.m81597a(context, this.f110572b, bmjy.f129763d, LineItemSubValueView.class);
        this.f110573c.removeAllViews();
        bxwc bxwc = bmjy.f129764e;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            InfoMessageView infoMessageView = new InfoMessageView(context);
            infoMessageView.mo72003a((bmnr) bxwc.get(i2));
            this.f110573c.addView(infoMessageView);
        }
        LinearLayout linearLayout = this.f110573c;
        if (linearLayout.getChildCount() == 0) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (!bmjy.f129767h) {
            this.f110571a.setVisibility(0);
        } else if (!TextUtils.isEmpty(bmjy.f129762c) || bmjy.f129763d.size() != 0) {
            int i3 = spn.f44932a;
            this.f110571a.setVisibility(0);
        } else {
            this.f110571a.setVisibility(8);
        }
        int a = m94274a();
        int i4 = a - 1;
        bmno bmno = null;
        if (a != 0) {
            int i5 = i4 != 1 ? i4 != 6 ? i4 != 8 ? i4 != 3 ? i4 != 4 ? C0126R.style.WalletLineItem : C0126R.style.WalletHeroLineItem : C0126R.style.WalletGeneratedLineItem : C0126R.style.WalletSubSectionLineItem : C0126R.style.WalletSidekickLineItem : C0126R.style.WalletHeaderLineItem;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, eoi.f15408t);
            if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                marginLayoutParams.topMargin = obtainStyledAttributes.getDimensionPixelSize(1, marginLayoutParams.topMargin);
                marginLayoutParams.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(2, marginLayoutParams.bottomMargin);
                setLayoutParams(marginLayoutParams);
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i5, eoi.f15409u);
            awia.m79976a(context, this.f110574d, obtainStyledAttributes2.getResourceId(6, C0126R.style.WalletLineItemText));
            awia.m79976a(context, this.f110575e, obtainStyledAttributes2.getResourceId(7, C0126R.style.WalletLineItemValueText));
            int resourceId = obtainStyledAttributes2.getResourceId(5, C0126R.style.WalletLineItemSubValueText);
            int childCount = this.f110572b.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = this.f110572b.getChildAt(i6);
                if (childAt instanceof TextView) {
                    awia.m79976a(context, (TextView) childAt, resourceId);
                }
            }
            int resourceId2 = obtainStyledAttributes2.getResourceId(2, C0126R.style.UicDisplayTypeDetailInfoText);
            int childCount2 = this.f110573c.getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                awia.m79977a(context, (InfoMessageView) this.f110573c.getChildAt(i7), resourceId2);
            }
            awia.m79975a(context, this.f110576f, obtainStyledAttributes2.getResourceId(3, C0126R.style.WalletLineItemLeftColumn));
            awia.m79975a(context, this.f110571a, obtainStyledAttributes2.getResourceId(4, C0126R.style.WalletLineItemRightColumn));
            if (m94274a() == 7) {
                this.f110577g.getLayoutParams().width = (int) getResources().getDimension(C0126R.dimen.wallet_sidekick_line_item_image_width);
                this.f110577g.getLayoutParams().height = (int) getResources().getDimension(C0126R.dimen.wallet_sidekick_line_item_image_height);
            }
            obtainStyledAttributes2.recycle();
            FifeNetworkImageView fifeNetworkImageView = this.f110577g;
            if (!this.f110579i && (bmno = bmjy.f129766g) == null) {
                bmno = bmno.f130138m;
            }
            awia.m79983a(fifeNetworkImageView, bmno);
            return;
        }
        throw null;
    }
}
