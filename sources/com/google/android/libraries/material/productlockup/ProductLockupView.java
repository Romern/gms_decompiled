package com.google.android.libraries.material.productlockup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClient;
import com.google.android.cast.JGCastService;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProductLockupView extends ViewGroup {

    /* renamed from: h */
    private static final Pattern f111287h = Pattern.compile(String.format(" %1$s|%1$s ", MfiClient.ACCOUNT_ISSUER_GOOGLE));

    /* renamed from: i */
    private static final int[] f111288i = {1};

    /* renamed from: j */
    private static final int[] f111289j = {2};

    /* renamed from: k */
    private static final int[] f111290k = {1, 2};

    /* renamed from: l */
    private static Typeface f111291l;

    /* renamed from: a */
    final ImageView f111292a;

    /* renamed from: b */
    public final TextView f111293b;

    /* renamed from: c */
    azyq f111294c;

    /* renamed from: d */
    public Drawable f111295d;

    /* renamed from: e */
    public int f111296e;

    /* renamed from: f */
    public azyq f111297f;

    /* renamed from: g */
    public int[] f111298g;

    /* renamed from: m */
    private final azyq f111299m;

    /* renamed from: n */
    private final azyq f111300n;

    /* renamed from: o */
    private int f111301o;

    /* renamed from: p */
    private String f111302p;

    /* renamed from: q */
    private boolean f111303q;

    /* renamed from: r */
    private boolean f111304r;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new azyp();

        /* renamed from: a */
        String f111305a;

        /* renamed from: b */
        boolean f111306b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f111305a = parcel.readString();
            this.f111306b = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f111305a);
            parcel.writeInt(this.f111306b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ProductLockupView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final int m94766a(azyq azyq) {
        return Math.round(((float) azyq.f100219e) * (!this.f111303q ? 0.15f : 1.0f));
    }

    /* renamed from: b */
    private final void m94769b() {
        this.f111292a.measure(View.MeasureSpec.makeMeasureSpec(this.f111294c.f100217c, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(this.f111294c.f100218d, JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* renamed from: c */
    private final void m94770c() {
        this.f111293b.setTextSize(0, this.f111294c.f100215a);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f111293b.measure(makeMeasureSpec, makeMeasureSpec);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f111292a.getVisibility() != 8) {
            if (this.f111293b.getVisibility() == 8 || this.f111304r) {
                i6 = 0;
            } else {
                i6 = this.f111293b.getMeasuredWidth() + m94766a(this.f111294c);
            }
            int i7 = this.f111294c.f100216b;
            m94767a(this.f111292a, i6, i7, i6 + this.f111292a.getMeasuredWidth(), i7 + this.f111292a.getMeasuredHeight());
        }
        if (this.f111293b.getVisibility() != 8) {
            if (this.f111292a.getVisibility() == 8 || !this.f111304r) {
                i5 = 0;
            } else {
                i5 = m94766a(this.f111294c) + this.f111292a.getMeasuredWidth();
            }
            int measuredWidth = this.f111293b.getMeasuredWidth();
            m94767a(this.f111293b, i5, 0, i5 + measuredWidth, this.f111293b.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int[] iArr;
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        this.f111292a.setVisibility(0);
        this.f111293b.setVisibility(0);
        this.f111304r = this.f111302p.startsWith(MfiClient.ACCOUNT_ISSUER_GOOGLE);
        boolean endsWith = this.f111302p.endsWith(MfiClient.ACCOUNT_ISSUER_GOOGLE);
        int i4 = this.f111296e;
        if (i4 == -1) {
            iArr = this.f111298g;
        } else if (i4 == 0) {
            iArr = f111290k;
        } else if (i4 == 1) {
            iArr = f111288i;
        } else if (i4 == 2) {
            iArr = f111289j;
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unrecognized sizingMode: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f111304r || endsWith) {
            int length = iArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                m94771c(iArr[i5]);
                if (m94768a(size, true)) {
                    m94769b();
                    m94770c();
                    break;
                }
                i5++;
            }
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (true) {
            if (i6 < length2) {
                m94771c(iArr[i6]);
                if (m94768a(size, false)) {
                    m94770c();
                    this.f111292a.setVisibility(8);
                    break;
                }
                i6++;
            } else {
                m94771c(1);
                this.f111304r = true;
                m94769b();
                this.f111293b.setVisibility(8);
                break;
            }
        }
        int visibility = this.f111292a.getVisibility();
        int visibility2 = this.f111293b.getVisibility();
        if (visibility == 0) {
            i3 = this.f111292a.getMeasuredWidth();
        }
        if (visibility2 == 0) {
            i3 += this.f111293b.getMeasuredWidth();
        }
        if (visibility == 0 && visibility2 == 0) {
            i3 += m94766a(this.f111294c);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(Math.max(this.f111292a.getMeasuredHeight() + this.f111294c.f100216b, this.f111293b.getMeasuredHeight()), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f111302p = savedState.f111305a;
        this.f111303q = savedState.f111306b;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f111305a = this.f111302p;
        savedState.f111306b = this.f111303q;
        return savedState;
    }

    public ProductLockupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.productLockupViewStyle);
    }

    /* renamed from: a */
    private final void m94767a(View view, int i, int i2, int i3, int i4) {
        int i5;
        int h = C1280ps.m19923h(this);
        if (h == 1) {
            i5 = getMeasuredWidth() - i3;
        } else {
            i5 = i;
        }
        if (h == 1) {
            i3 = getMeasuredWidth() - i;
        }
        view.layout(i5, i2, i3, i4);
    }

    /* renamed from: c */
    private final void m94771c(int i) {
        azyq azyq;
        if (i == -1) {
            azyq = this.f111297f;
        } else if (i == 0 || i == 1) {
            azyq = this.f111299m;
        } else if (i == 2) {
            azyq = this.f111300n;
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unrecognized sizingMode: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        this.f111294c = azyq;
    }

    /* renamed from: b */
    public final void mo60465b(int i) {
        this.f111301o = i;
        mo60462a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.libraries.material.productlockup.ProductLockupView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductLockupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        if (f111291l == null) {
            f111291l = Typeface.createFromAsset(context.getAssets(), "ProductSans-Regular.ttf");
        }
        this.f111299m = new azyq(getResources(), C0126R.dimen.product_name_text_size, C0126R.dimen.logo_margin_top, C0126R.dimen.logo_width, C0126R.dimen.logo_height, C0126R.dimen.separation_margin);
        this.f111300n = new azyq(getResources(), C0126R.dimen.product_name_text_size_small, C0126R.dimen.logo_margin_top_small, C0126R.dimen.logo_width_small, C0126R.dimen.logo_height_small, C0126R.dimen.separation_margin_small);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.product_lockup_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.logo);
        beek.m91851a(imageView);
        this.f111292a = imageView;
        TextView textView = (TextView) findViewById(C0126R.C0129id.product_name);
        beek.m91851a(textView);
        this.f111293b = textView;
        textView.setTypeface(f111291l);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, azyr.f100220a, i, 2132019423);
        if (obtainStyledAttributes.hasValue(2)) {
            this.f111295d = obtainStyledAttributes.getDrawable(2);
        } else {
            this.f111295d = C1391tv.m20459b(context2, C0126R.C0127drawable.googlelogo_standard_color_74x24);
        }
        int i2 = obtainStyledAttributes.getInt(1, 0);
        this.f111296e = i2;
        m94771c(i2);
        mo60463a(obtainStyledAttributes.getColor(4, 0));
        mo60464a(obtainStyledAttributes.getString(0));
        mo60465b(obtainStyledAttributes.getInt(3, 0));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final boolean m94768a(int i, boolean z) {
        int i2;
        if (z) {
            azyq azyq = this.f111294c;
            i2 = azyq.f100217c + m94766a(azyq);
        } else {
            i2 = 0;
        }
        m94770c();
        if (i2 + this.f111293b.getMeasuredWidth() <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo60462a() {
        int i;
        int i2 = this.f111301o;
        if (i2 != 0) {
            ImageView imageView = this.f111292a;
            if (i2 == 1) {
                i = C0126R.color.google_black;
            } else if (i2 == 2) {
                i = C0126R.color.google_white;
            } else if (i2 == 3) {
                i = C0126R.color.google_grey700;
            } else {
                StringBuilder sb = new StringBuilder(35);
                sb.append("Unrecognized logoColor: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
            Drawable drawable = this.f111295d;
            int i3 = Build.VERSION.SDK_INT;
            Drawable mutate = drawable.mutate();
            C1173lt.m19599a(mutate, C1133kh.m17843b(getContext(), i));
            imageView.setImageDrawable(mutate);
            return;
        }
        this.f111292a.setImageDrawable(this.f111295d);
    }

    /* renamed from: a */
    public final void mo60463a(int i) {
        this.f111293b.setTextColor(i);
    }

    /* renamed from: a */
    public final void mo60464a(String str) {
        String str2;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        this.f111302p = trim;
        this.f111303q = f111287h.matcher(trim).find();
        TextView textView = this.f111293b;
        String str3 = this.f111302p;
        String str4 = MfiClient.ACCOUNT_ISSUER_GOOGLE;
        if (str3.startsWith(str4)) {
            str2 = this.f111302p.substring(6).trim();
        } else if (this.f111302p.endsWith(str4)) {
            String str5 = this.f111302p;
            str2 = str5.substring(0, str5.length() - 6).trim();
        } else {
            str2 = this.f111302p;
        }
        textView.setText(str2);
        if (!this.f111302p.isEmpty()) {
            str4 = this.f111302p;
        }
        setContentDescription(str4);
        requestLayout();
    }
}
