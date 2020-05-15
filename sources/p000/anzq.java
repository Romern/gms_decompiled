package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.plus.data.internal.PlusImageView;

/* renamed from: anzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anzq extends LinearLayout implements View.OnClickListener {

    /* renamed from: i */
    private static final int f77942i = Color.parseColor("#666666");

    /* renamed from: a */
    public boolean f77943a;

    /* renamed from: b */
    protected final FrameLayout f77944b;

    /* renamed from: c */
    final CompoundButton f77945c;

    /* renamed from: d */
    public final ProgressBar f77946d;

    /* renamed from: e */
    final anwm f77947e;

    /* renamed from: f */
    int f77948f = 1;

    /* renamed from: g */
    protected String f77949g;

    /* renamed from: h */
    protected View.OnClickListener f77950h;

    /* renamed from: j */
    private final Resources f77951j;

    /* renamed from: k */
    private final LayoutInflater f77952k;

    /* renamed from: l */
    private final LinearLayout f77953l;

    /* renamed from: m */
    private final PlusImageView[] f77954m = new PlusImageView[4];

    /* renamed from: n */
    private int f77955n = 2;

    /* renamed from: o */
    private int f77956o = 3;

    /* renamed from: p */
    private Uri[] f77957p;

    /* renamed from: q */
    private String[] f77958q;

    /* renamed from: r */
    private String[] f77959r;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public anzq(Context context, int i, int i2, String str) {
        super(context, null);
        Context context2;
        sdo.m34966a(context, "Context must not be null.");
        sdo.m34966a((Object) str, (Object) "URL must not be null.");
        this.f77956o = i;
        this.f77955n = i2;
        this.f77949g = str;
        int i3 = rfx.f42891a;
        try {
            context2 = getContext().createPackageContext("com.google.android.gms", 4);
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("PlusOneButtonView", 5)) {
                Log.w("PlusOneButtonView", "Google Play services is not installed");
            }
            context2 = null;
        }
        this.f77951j = context2.getResources();
        this.f77952k = (LayoutInflater) context2.getSystemService("layout_inflater");
        Point h = m65657h();
        if (isInEditMode()) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText("[ +1 ]");
            addView(textView, new LinearLayout.LayoutParams(h.x, h.y));
            this.f77947e = null;
            this.f77946d = null;
            this.f77945c = null;
            this.f77944b = null;
            this.f77953l = null;
            return;
        }
        setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f77953l = linearLayout;
        linearLayout.setGravity(17);
        this.f77953l.setOrientation(0);
        addView(this.f77953l);
        anzp anzp = new anzp(this, context);
        this.f77945c = anzp;
        anzp.setBackgroundDrawable(null);
        anwm anwm = new anwm(context);
        anwm.setFocusable(false);
        anwm.f77827b.setGravity(17);
        anwm.f77827b.setSingleLine();
        anwm.mo42338a(TypedValue.applyDimension(2, (float) m65652a(this.f77956o, this.f77955n), context.getResources().getDisplayMetrics()));
        anwm.f77827b.setTextColor(f77942i);
        anwm.setVisibility(0);
        this.f77947e = anwm;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setFocusable(false);
        this.f77944b = frameLayout;
        frameLayout.addView(this.f77945c, new FrameLayout.LayoutParams(h.x, h.y, 17));
        m65653a(h);
        ProgressBar progressBar = new ProgressBar(context, null, 16843400);
        progressBar.setFocusable(false);
        progressBar.setIndeterminate(true);
        this.f77946d = progressBar;
        progressBar.setVisibility(4);
        this.f77944b.addView(this.f77946d, new FrameLayout.LayoutParams(h.x, h.y, 17));
        int length = this.f77954m.length;
        for (int i4 = 0; i4 < 4; i4++) {
            PlusImageView[] plusImageViewArr = this.f77954m;
            PlusImageView plusImageView = new PlusImageView(getContext());
            plusImageView.setVisibility(8);
            plusImageViewArr[i4] = plusImageView;
        }
        mo42499c();
    }

    /* renamed from: a */
    private static int m65652a(int i, int i2) {
        if (i != 0) {
            return (i == 2 && i2 != 2) ? 15 : 13;
        }
        return 11;
    }

    /* renamed from: b */
    private final String m65654b(String str) {
        Resources resources = this.f77951j;
        if (resources == null) {
            return null;
        }
        return resources.getString(resources.getIdentifier(str, "string", "com.google.android.gms"), "");
    }

    /* renamed from: f */
    private final void mo42508f() {
        int i = this.f77955n;
        if (i == 1) {
            anwm anwm = this.f77947e;
            anwm.f77826a = this.f77959r;
            anwm.setVisibility(0);
        } else if (i != 2) {
            anwm anwm2 = this.f77947e;
            anwm2.f77826a = null;
            anwm2.setVisibility(8);
        } else {
            anwm anwm3 = this.f77947e;
            anwm3.f77826a = this.f77958q;
            anwm3.setVisibility(0);
        }
    }

    /* renamed from: g */
    private final void m65656g() {
        Uri uri;
        if (this.f77957p != null && this.f77955n == 2) {
            Point h = m65657h();
            h.x = h.y;
            int length = this.f77954m.length;
            int length2 = this.f77957p.length;
            for (int i = 0; i < 4; i++) {
                if (i < length2) {
                    uri = this.f77957p[i];
                } else {
                    uri = null;
                }
                if (uri != null) {
                    this.f77954m[i].setLayoutParams(new LinearLayout.LayoutParams(h.x, h.y));
                    this.f77954m[i].mo46569a(uri, h.y);
                    this.f77954m[i].setVisibility(0);
                } else {
                    this.f77954m[i].setVisibility(8);
                }
            }
        } else {
            int length3 = this.f77954m.length;
            for (int i2 = 0; i2 < 4; i2++) {
                this.f77954m[i2].setVisibility(8);
            }
        }
        boolean z = true;
        int applyDimension = (int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, getContext().getResources().getDisplayMetrics());
        int length4 = this.f77954m.length;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.f77954m[i3].getVisibility() == 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f77954m[i3].getLayoutParams());
                if (z) {
                    layoutParams.setMargins(applyDimension, 0, applyDimension2, 0);
                } else {
                    layoutParams.setMargins(applyDimension2, 0, applyDimension2, 0);
                }
                this.f77954m[i3].setLayoutParams(layoutParams);
                z = false;
            }
        }
    }

    /* renamed from: h */
    private final Point m65657h() {
        int i = this.f77956o;
        int i2 = 20;
        int i3 = 24;
        if (i == 0) {
            i2 = 14;
        } else if (i == 1) {
            i3 = 32;
        } else if (i != 2) {
            i2 = 24;
            i3 = 38;
        } else {
            i3 = 50;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        double d = (double) applyDimension;
        Double.isNaN(d);
        double d2 = (double) applyDimension2;
        Double.isNaN(d2);
        return new Point((int) (d + 0.5d), (int) (d2 + 0.5d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo42499c() {
        mo42498b(1);
        this.f77946d.setVisibility(4);
        mo42501e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo42500d() {
        mo42498b(0);
        this.f77946d.setVisibility(4);
        mo42501e();
    }

    /* renamed from: e */
    public final void mo42501e() {
        Drawable drawable;
        String str;
        CompoundButton compoundButton = this.f77945c;
        Resources resources = this.f77951j;
        if (resources != null) {
            int i = this.f77956o;
            if (i != 0) {
                str = i != 1 ? i != 2 ? "ic_plusone_standard" : "ic_plusone_tall" : "ic_plusone_medium";
            } else {
                str = "ic_plusone_small";
            }
            drawable = resources.getDrawable(resources.getIdentifier(str, "drawable", "com.google.android.gms"));
        } else {
            drawable = null;
        }
        compoundButton.setButtonDrawable(drawable);
        int i2 = this.f77948f;
        if (i2 == 0) {
            this.f77945c.setEnabled(true);
            this.f77945c.setChecked(true);
            this.f77945c.setContentDescription(m65654b("plus_one_description_remove"));
        } else if (i2 == 1) {
            this.f77945c.setEnabled(true);
            this.f77945c.setChecked(false);
            this.f77945c.setContentDescription(m65654b("plus_one_description"));
        } else if (i2 != 2) {
            this.f77945c.setEnabled(false);
            this.f77945c.setChecked(false);
            this.f77945c.setContentDescription(m65654b("plus_one_description_standard"));
        } else {
            this.f77945c.setEnabled(false);
            this.f77945c.setChecked(true);
            this.f77945c.setContentDescription(m65654b("plus_one_description_standard"));
        }
    }

    public void onClick(View view) {
        if (this.f77950h != null) {
            this.f77945c.performClick();
            this.f77947e.performClick();
            this.f77950h.onClick(view);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f77950h = onClickListener;
        super.setOnClickListener(this);
    }

    /* renamed from: a */
    private final void m65653a(Point point) {
        point.y = (int) (((float) point.y) - TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
        point.x = point.y;
    }

    /* renamed from: b */
    public void mo42497b() {
        mo42498b(3);
        this.f77946d.setVisibility(4);
        mo42501e();
    }

    /* renamed from: b */
    public final void mo42498b(int i) {
        this.f77948f = i;
        mo42494a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo42493a(String str) {
        return this.f77952k.inflate(this.f77951j.getLayout(this.f77951j.getIdentifier(str, "layout", "com.google.android.gms")), (ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42494a() {
        LinearLayout.LayoutParams layoutParams;
        String str;
        if (!isInEditMode()) {
            this.f77953l.removeAllViews();
            Point h = m65657h();
            this.f77945c.setLayoutParams(new FrameLayout.LayoutParams(h.x, h.y, 17));
            m65653a(h);
            this.f77946d.setLayoutParams(new FrameLayout.LayoutParams(h.x, h.y, 17));
            if (this.f77955n == 1) {
                anwm anwm = this.f77947e;
                int i = this.f77956o;
                if (i != 0) {
                    str = i != 1 ? i != 2 ? "global_count_bubble_standard" : "global_count_bubble_tall" : "global_count_bubble_medium";
                } else {
                    str = "global_count_bubble_small";
                }
                anwm.mo42339a(sds.m34979a(str));
            } else {
                this.f77947e.mo42339a((Uri) null);
            }
            m65656g();
            anwm anwm2 = this.f77947e;
            int i2 = this.f77955n;
            if (i2 == 1) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            } else if (i2 != 2) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            } else {
                layoutParams = new LinearLayout.LayoutParams(-2, -1);
            }
            layoutParams.bottomMargin = this.f77956o == 2 ? 1 : 0;
            layoutParams.leftMargin = this.f77956o == 2 ? 0 : 1;
            anwm2.setLayoutParams(layoutParams);
            this.f77947e.mo42338a(TypedValue.applyDimension(2, (float) m65652a(this.f77956o, this.f77955n), getContext().getResources().getDisplayMetrics()));
            anwm anwm3 = this.f77947e;
            int applyDimension = (int) TypedValue.applyDimension(1, 3.0f, getContext().getResources().getDisplayMetrics());
            int applyDimension2 = (int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
            int i3 = this.f77955n;
            if (i3 != 2) {
                applyDimension2 = 0;
            }
            if (this.f77956o != 2) {
                applyDimension = 0;
            } else if (i3 != 1) {
                applyDimension = 0;
            }
            anwm3.setPadding(applyDimension2, 0, 0, applyDimension);
            if (this.f77956o == 2 && this.f77955n == 1) {
                this.f77953l.setOrientation(1);
                this.f77953l.addView(this.f77947e);
                this.f77953l.addView(this.f77944b);
            } else {
                this.f77953l.setOrientation(0);
                this.f77953l.addView(this.f77944b);
                int length = this.f77954m.length;
                for (int i4 = 0; i4 < 4; i4++) {
                    this.f77953l.addView(this.f77954m[i4]);
                }
                this.f77953l.addView(this.f77947e);
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo42495a(anta anta) {
        Uri[] uriArr;
        if (anta != null) {
            this.f77958q = anta.f77709a.getStringArray("inline_annotations");
            mo42508f();
            this.f77959r = new String[]{anta.f77709a.getString("bubble_text")};
            mo42508f();
            Parcelable[] parcelableArray = anta.f77709a.getParcelableArray("profile_photo_uris");
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                uriArr = new Uri[length];
                System.arraycopy(parcelableArray, 0, uriArr, 0, length);
            } else {
                uriArr = null;
            }
            this.f77957p = uriArr;
            m65656g();
            if (anta.mo42211a()) {
                mo42500d();
            } else {
                mo42499c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42496a(anuy anuy) {
        int length = this.f77954m.length;
        for (int i = 0; i < 4; i++) {
            this.f77954m[i].mo46570a(anuy);
        }
    }
}
