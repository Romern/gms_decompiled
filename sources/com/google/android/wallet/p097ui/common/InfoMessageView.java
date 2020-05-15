package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.wallet.shared.common.ClickSpan;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.wallet.ui.common.InfoMessageView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InfoMessageView extends LinearLayout implements bjer, bjxu, bkdf, bjwm {

    /* renamed from: a */
    protected ViewGroup f152077a;

    /* renamed from: b */
    public TextView f152078b;

    /* renamed from: c */
    public TextView f152079c;

    /* renamed from: d */
    public TextView f152080d;

    /* renamed from: e */
    public boolean f152081e = true;

    /* renamed from: f */
    public int f152082f;

    /* renamed from: g */
    public bmnr f152083g;

    /* renamed from: h */
    public bjxu f152084h;

    /* renamed from: i */
    public bkeo f152085i;

    /* renamed from: j */
    public bkgg f152086j;

    /* renamed from: k */
    public bkgg f152087k;

    /* renamed from: l */
    public ColorStateList f152088l;

    /* renamed from: m */
    public ColorStateList f152089m;

    /* renamed from: n */
    public ColorStateList f152090n;

    /* renamed from: o */
    public ColorStateList f152091o;

    /* renamed from: p */
    public int f152092p;

    /* renamed from: q */
    private boolean f152093q = true;

    /* renamed from: r */
    private boolean f152094r = true;

    /* renamed from: s */
    private bkdw f152095s;

    /* renamed from: t */
    private int f152096t;

    public InfoMessageView(Context context) {
        super(context, null);
        new bjes(1627);
        mo60042a();
    }

    /* renamed from: a */
    private static int m118575a(ColorStateList colorStateList) {
        return colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
    }

    /* renamed from: b */
    private final void m118580b(TextView textView, int i) {
        int i2 = this.f152092p;
        if (i2 == -1) {
            int i3 = i - 1;
            i2 = i3 != 2 ? i3 != 3 ? 8388627 : 17 : 8388629;
        }
        textView.setGravity(i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjvh.a(bkdw, bkeo, boolean):void
     arg types: [bkdw, bkeo, int]
     candidates:
      bjvh.a(bmfs, int, com.google.android.wallet.clientlog.LogContext):bkdx
      bjvh.a(bkdw, bkeo, boolean):void */
    /* renamed from: h */
    private final void m118582h() {
        bmnu bmnu;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        bkdw bkdw;
        bmnr bmnr = this.f152083g;
        int i = 1;
        if (bmnr != null && !bmnr.equals(bmnr.f130153o)) {
            bmnr bmnr2 = this.f152083g;
            if ((bmnr2.f130155a & 2) == 0) {
                m118579a(this.f152078b, bmnr2.f130159e);
                this.f152078b.setVisibility(0);
                if (this.f152083g.f130160f.isEmpty()) {
                    this.f152079c.setText("");
                    this.f152079c.setVisibility(8);
                    this.f152094r = true;
                } else {
                    m118579a(this.f152079c, this.f152083g.f130160f);
                    if (this.f152083g.f130161g.isEmpty()) {
                        this.f152079c.setVisibility(0);
                        this.f152094r = true;
                    } else if (this.f152094r) {
                        this.f152079c.setVisibility(0);
                        this.f152078b.setVisibility(8);
                    } else if (!this.f152093q) {
                        this.f152079c.setVisibility(8);
                    } else if (this.f152081e) {
                        this.f152079c.setVisibility(8);
                        bmnr bmnr3 = this.f152083g;
                        ClickSpan.m118372a(this.f152078b, String.format("%s <a href=\"%s\">%s</a>", bmnr3.f130159e, "expandInfoText", bmnr3.f130161g), this, ((Boolean) bjwe.f123474I.mo54082a()).booleanValue());
                    } else {
                        throw new IllegalArgumentException("InfoMessageView inline expand label can only be used when linkify is true");
                    }
                }
            } else {
                this.f152079c.setText("");
                this.f152079c.setVisibility(8);
                this.f152094r = true;
                if (this.f152085i == null) {
                    bmnw bmnw = this.f152083g.f130158d;
                    if (bmnw == null) {
                        bmnw = bmnw.f130182d;
                    }
                    this.f152085i = new bkeo(bmnw);
                }
                if (!this.f152085i.mo65911a() && (bkdw = this.f152095s) != null) {
                    bjvh.m104701a(bkdw, this.f152085i, true);
                }
                if (this.f152085i.mo65911a()) {
                    m118579a(this.f152078b, this.f152085i.mo65913b());
                }
            }
            TextView textView = this.f152078b;
            int a = bmnq.m108208a(this.f152083g.f130162h);
            if (a == 0) {
                a = 1;
            }
            mo72001a(textView, a);
            TextView textView2 = this.f152079c;
            int a2 = bmnq.m108208a(this.f152083g.f130163i);
            if (a2 != 0) {
                i = a2;
            }
            mo72001a(textView2, i);
            mo72005b();
            if (this.f152083g.f130164j && (marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams()) != null) {
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.bottomMargin = 0;
            }
            Context context = getContext();
            bmnr bmnr4 = this.f152083g;
            if ((bmnr4.f130155a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                bmnu = bmnr4.f130165k;
                if (bmnu == null) {
                    bmnu = bmnu.f130170g;
                }
            } else {
                bmnu = null;
            }
            bkfr.m105561a(context, bmnu, this);
            if (this.f152083g.f130166l) {
                TextView textView3 = this.f152080d;
                if (textView3 == null) {
                    this.f152080d = (TextView) ((ViewStub) findViewById(C0126R.C0129id.bullet)).inflate();
                } else {
                    textView3.setVisibility(0);
                }
                if (!this.f152083g.f130167m.isEmpty()) {
                    this.f152080d.setText(this.f152083g.f130167m);
                }
            } else {
                TextView textView4 = this.f152080d;
                if (textView4 != null) {
                    textView4.setText("");
                    this.f152080d.setVisibility(8);
                }
            }
        } else {
            this.f152078b.setText("");
            this.f152078b.setVisibility(8);
            this.f152079c.setText("");
            this.f152079c.setVisibility(8);
            TextView textView5 = this.f152080d;
            if (textView5 != null) {
                textView5.setText("");
                this.f152080d.setVisibility(8);
            }
            this.f152094r = true;
        }
        setVisibility(this.f152082f);
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return this.f152095s;
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return "";
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bZ */
    public final void mo52779bZ() {
    }

    /* renamed from: c */
    public final String mo72007c() {
        boolean z;
        boolean z2;
        if (this.f152078b.getVisibility() != 0 || TextUtils.isEmpty(this.f152078b.getText())) {
            z = false;
        } else {
            z = true;
        }
        if (this.f152079c.getVisibility() != 0 || TextUtils.isEmpty(this.f152079c.getText())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && z2) {
            return String.format("%s\n%s", this.f152078b.getText(), this.f152079c.getText());
        } else if (z) {
            return this.f152078b.getText().toString();
        } else {
            if (!z2) {
                return "";
            }
            return this.f152079c.getText().toString();
        }
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return true;
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        return true;
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        if (hasFocus() || !requestFocus()) {
            bkfr.m105602c(this);
        }
        return hasFocus();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        bkgg bkgg = this.f152086j;
        if (bkgg == null || this.f152087k == null) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return bkgg.mo15814a(motionEvent) || this.f152087k.mo15814a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* renamed from: g */
    public final float mo72009g() {
        if (this.f152078b.getVisibility() == 0) {
            return this.f152078b.getTextSize();
        }
        return this.f152079c.getTextSize();
    }

    public final int getBaseline() {
        int paddingTop = getPaddingTop();
        return this.f152078b.getVisibility() == 0 ? this.f152078b.getBaseline() + paddingTop : this.f152079c.getVisibility() != 0 ? super.getBaseline() : paddingTop + this.f152079c.getBaseline();
    }

    public final CharSequence getError() {
        return "";
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        bmnw bmnw;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f152083g = (bmnr) bjvp.m104730a(bundle, "infoMessage", (bxxk) bmnr.f130153o.mo74142c(7));
            this.f152094r = bundle.getBoolean("expanded");
            this.f152082f = bundle.getInt("requestedVisibility");
            Bundle bundle2 = bundle.getBundle("messageBuilder");
            bkeo bkeo = null;
            if (!(bundle2 == null || !bundle2.containsKey("messageBuilder.messageTemplate") || (bmnw = (bmnw) bjvp.m104730a(bundle2, "messageBuilder.messageTemplate", (bxxk) bmnw.f130182d.mo74142c(7))) == null)) {
                bkeo = new bkeo(bmnw);
                bkeo.f124096b = bundle2.getStringArray("messageBuilder.componentValues");
                int length = bkeo.f124096b.length;
                for (int i = 0; i < length; i++) {
                    if (bkeo.f124096b[i] != null) {
                        bkeo.f124097c.remove(Long.valueOf(bmnw.f130185b.mo74160a(i)));
                    }
                }
            }
            this.f152085i = bkeo;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            m118582h();
            this.f152088l = (ColorStateList) bundle.getParcelable("messageSavedTextColors");
            this.f152089m = (ColorStateList) bundle.getParcelable("messageSavedLinkTextColors");
            this.f152090n = (ColorStateList) bundle.getParcelable("detailedMessageSavedTextColors");
            this.f152091o = (ColorStateList) bundle.getParcelable("detailedMessageSavedLinkTextColors");
            ColorStateList colorStateList = this.f152088l;
            if (colorStateList != null) {
                m118578a(this.f152078b, colorStateList);
                m118581b(this.f152078b, this.f152089m);
                m118578a(this.f152079c, this.f152090n);
                m118581b(this.f152079c, this.f152091o);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("messageSavedTextColors", this.f152088l);
        bundle.putParcelable("messageSavedLinkTextColors", this.f152089m);
        bundle.putParcelable("detailedMessageSavedTextColors", this.f152090n);
        bundle.putParcelable("detailedMessageSavedLinkTextColors", this.f152091o);
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bjvp.m104736a(bundle, "infoMessage", this.f152083g);
        bundle.putBoolean("expanded", this.f152094r);
        bundle.putInt("requestedVisibility", this.f152082f);
        bkeo bkeo = this.f152085i;
        if (bkeo != null) {
            Bundle bundle2 = new Bundle();
            bjvp.m104736a(bundle2, "messageBuilder.messageTemplate", bkeo.f124095a);
            bundle2.putStringArray("messageBuilder.componentValues", bkeo.f124096b);
            bundle.putBundle("messageBuilder", bundle2);
        }
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView = this.f152080d;
        if (textView != null) {
            textView.setEnabled(z);
        }
        this.f152077a.setEnabled(z);
        this.f152078b.setEnabled(z);
        this.f152079c.setEnabled(z);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f152078b.setOnClickListener(onClickListener);
        this.f152079c.setOnClickListener(onClickListener);
    }

    public final void setVisibility(int i) {
        this.f152082f = i;
        if (!TextUtils.isEmpty(this.f152078b.getText()) || !TextUtils.isEmpty(this.f152079c.getText())) {
            super.setVisibility(i);
        } else {
            super.setVisibility(8);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static InfoMessageView m118576a(LayoutInflater layoutInflater, bmnr bmnr, ViewGroup viewGroup, bjxv bjxv) {
        InfoMessageView infoMessageView = (InfoMessageView) layoutInflater.inflate((int) C0126R.C0128layout.view_info_message_text_basic, viewGroup, false);
        infoMessageView.mo72003a(bmnr);
        infoMessageView.setId(bjxv.mo65614a());
        return infoMessageView;
    }

    /* renamed from: b */
    public static void m118581b(TextView textView, ColorStateList colorStateList) {
        if (colorStateList != null) {
            textView.setLinkTextColor(m118575a(colorStateList));
        }
    }

    /* renamed from: a */
    private final void m118577a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.uicAlwaysInlineExpandLabel});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, bkju.f124470h);
        if (!z) {
            this.f152093q = obtainStyledAttributes2.getBoolean(4, true);
        } else {
            this.f152093q = true;
        }
        this.f152096t = obtainStyledAttributes2.getResourceId(0, -1);
        this.f152092p = obtainStyledAttributes2.getInt(1, -1);
        boolean z2 = obtainStyledAttributes2.getBoolean(2, true);
        this.f152078b.setIncludeFontPadding(z2);
        this.f152079c.setIncludeFontPadding(z2);
        int i = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(3)) {
            float dimension = obtainStyledAttributes2.getDimension(3, 0.0f);
            TextView textView = this.f152078b;
            textView.setLineSpacing(dimension, textView.getLineSpacingMultiplier());
            TextView textView2 = this.f152079c;
            textView2.setLineSpacing(dimension, textView2.getLineSpacingMultiplier());
        }
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: b */
    public final void mo72005b() {
        TextView textView = this.f152078b;
        int a = bmoj.m108229a(this.f152083g.f130168n);
        int i = 2;
        if (a == 0) {
            a = 2;
        }
        m118580b(textView, a);
        TextView textView2 = this.f152079c;
        int a2 = bmoj.m108229a(this.f152083g.f130168n);
        if (a2 != 0) {
            i = a2;
        }
        m118580b(textView2, i);
    }

    public InfoMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new bjes(1627);
        mo60042a();
        m118577a(context, attributeSet);
    }

    public InfoMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new bjes(1627);
        mo60042a();
        m118577a(context, attributeSet);
    }

    /* renamed from: b */
    public final void mo72006b(bmnr bmnr) {
        if (bmnr == null || bmnr.equals(bmnr.f130153o)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        mo72003a(bmnr);
    }

    /* renamed from: a */
    public static void m118578a(TextView textView, ColorStateList colorStateList) {
        textView.setTextColor(m118575a(colorStateList));
    }

    /* renamed from: a */
    private final void m118579a(TextView textView, String str) {
        if (this.f152081e) {
            ClickSpan.m118372a(textView, str, this, ((Boolean) bjwe.f123474I.mo54082a()).booleanValue());
        } else {
            textView.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60042a() {
        setOrientation(0);
        LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.view_info_message_view, this);
        this.f152077a = (ViewGroup) findViewById(C0126R.C0129id.message_views_container);
        this.f152078b = (TextView) findViewById(C0126R.C0129id.message);
        this.f152079c = (TextView) findViewById(C0126R.C0129id.detailed_message);
        setVisibility(getVisibility());
    }

    /* renamed from: a */
    public final void mo72000a(int i) {
        this.f152078b.setTextColor(i);
        this.f152079c.setTextColor(i);
    }

    /* renamed from: a */
    public final void mo52355a(View view, String str) {
        if (!"expandInfoText".equals(str)) {
            bjxu bjxu = this.f152084h;
            if (bjxu == null) {
                getContext().startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
                return;
            }
            bjxu.mo52355a(this, str);
        } else if (!this.f152094r) {
            this.f152094r = true;
            m118582h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo72001a(TextView textView, int i) {
        int i2;
        int i3 = i - 1;
        int i4 = C0126R.attr.internalUicDefaultDisplayType;
        if (!(i3 == 1 || i3 == 16)) {
            if (i3 == 18) {
                i4 = C0126R.attr.internalUicLargeCodeDisplayDisplayType;
            } else if (i3 != 27) {
                if (i3 == 45) {
                    i2 = C0126R.style.UicInfoMessageMaterial1Body4;
                } else if (i3 == 48) {
                    i4 = C0126R.attr.internalUicHeaderRegularDisplayType;
                } else if (i3 != 49) {
                    switch (i3) {
                        case 3:
                            i4 = C0126R.attr.internalUicEmphasisDisplayType;
                            break;
                        case 4:
                            i4 = C0126R.attr.internalUicErrorDisplayType;
                            break;
                        case 5:
                            i4 = C0126R.attr.internalUicHeaderDisplayType;
                            break;
                        case 6:
                            i4 = C0126R.attr.internalUicSubHeaderDisplayType;
                            break;
                        case 7:
                            i4 = C0126R.attr.internalUicDetailDisplayType;
                            break;
                        case 8:
                            i4 = C0126R.attr.internalUicInfoDisplayType;
                            break;
                        case 9:
                            i4 = C0126R.attr.internalUicDetailInfoDisplayType;
                            break;
                        default:
                            switch (i3) {
                                case 12:
                                    i4 = C0126R.attr.internalUicScoreCardDisplayType;
                                    break;
                                case 13:
                                    i4 = C0126R.attr.internalUicPendingDisplayType;
                                    break;
                                case 14:
                                    i4 = C0126R.attr.internalUicInputDisplayType;
                                    break;
                                default:
                                    switch (i3) {
                                        case 33:
                                            i4 = C0126R.attr.internalUicSubHeaderPrimaryDisplayType;
                                            break;
                                        case 34:
                                            i2 = C0126R.style.UicInfoMessageMaterial1Headline1;
                                            break;
                                        case 35:
                                            i2 = C0126R.style.UicInfoMessageMaterial1Headline2;
                                            break;
                                        case 36:
                                            i2 = C0126R.style.UicInfoMessageMaterial1Headline3;
                                            break;
                                        case FelicaException.TYPE_NOT_CLOSED:
                                            i2 = C0126R.style.UicInfoMessageMaterial1Headline3Secondary;
                                            break;
                                        case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                                            i2 = C0126R.style.UicInfoMessageMaterial1Body1;
                                            break;
                                        default:
                                            switch (i3) {
                                                case FelicaException.TYPE_PUSH_FAILED:
                                                    i2 = C0126R.style.UicInfoMessageMaterial1Body2;
                                                    break;
                                                case 41:
                                                    i2 = C0126R.style.UicInfoMessageMaterial1Body2Secondary;
                                                    break;
                                                case FelicaException.TYPE_ALREADY_ACTIVATED:
                                                    i2 = C0126R.style.UicInfoMessageMaterial1Body3;
                                                    break;
                                                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                                    i2 = C0126R.style.UicInfoMessageMaterial1Body3Secondary;
                                                    break;
                                                default:
                                                    i2 = this.f152096t;
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    i4 = C0126R.attr.internalUicSubtitle2DisplayType;
                }
                if (i2 > 0) {
                    C1334rs.m20104a(textView, i2);
                }
                if (i != 17) {
                    C1334rs.m20106b(textView, 1);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = getResources().getDimensionPixelSize(C0126R.dimen.wallet_external_display_auto_size_text_height);
                    return;
                }
                return;
            } else {
                i4 = C0126R.attr.internalUicHeadline5DisplayType;
            }
        }
        TypedValue typedValue = new TypedValue();
        i2 = getContext().getTheme().resolveAttribute(i4, typedValue, true) ? typedValue.data : this.f152096t;
        if (i2 > 0) {
        }
        if (i != 17) {
        }
    }

    /* renamed from: a */
    public final void mo72002a(bkdw bkdw) {
        this.f152095s = bkdw;
        if (this.f152083g != null && this.f152085i != null) {
            m118582h();
        }
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        int i3 = 0;
        if (i2 == 1) {
            setVisibility(0);
        } else if (i2 == 11) {
            setVisibility(8);
        } else if (i2 != 27) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmmb.m108166a(bmmv.f130058d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "Unsupported resulting action type: %s", objArr));
        } else {
            if (getVisibility() == 0) {
                i3 = 8;
            }
            setVisibility(i3);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.InfoMessageView.a(bmnr, boolean):void
     arg types: [bmnr, int]
     candidates:
      com.google.android.wallet.ui.common.InfoMessageView.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.InfoMessageView.a(android.widget.TextView, android.content.res.ColorStateList):void
      com.google.android.wallet.ui.common.InfoMessageView.a(android.widget.TextView, java.lang.String):void
      com.google.android.wallet.ui.common.InfoMessageView.a(android.view.View, java.lang.String):void
      com.google.android.wallet.ui.common.InfoMessageView.a(android.widget.TextView, int):void
      com.google.android.wallet.ui.common.InfoMessageView.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.InfoMessageView.a(java.lang.CharSequence, boolean):void
      bjxu.a(android.view.View, java.lang.String):void
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.InfoMessageView.a(bmnr, boolean):void */
    /* renamed from: a */
    public final void mo72003a(bmnr bmnr) {
        mo72004a(bmnr, true);
    }

    /* renamed from: a */
    public final void mo72004a(bmnr bmnr, boolean z) {
        if (z) {
            bkgg bkgg = new bkgg(this.f152078b);
            this.f152086j = bkgg;
            C1280ps.m19894a(this.f152078b, bkgg);
            bkgg bkgg2 = new bkgg(this.f152079c);
            this.f152087k = bkgg2;
            C1280ps.m19894a(this.f152079c, bkgg2);
        }
        if (bmnr != null && !bmnr.equals(bmnr.f130153o)) {
            boolean z2 = !bmnr.f130159e.isEmpty();
            int i = bmnr.f130155a & 2;
            if (!z2 && i == 0) {
                throw new IllegalArgumentException("Info message must contain a message.");
            } else if (z2 && i != 0) {
                throw new IllegalArgumentException("Info message cannot contain both messageHtml and messageTemplate.");
            }
        }
        this.f152083g = bmnr;
        this.f152094r = false;
        this.f152085i = null;
        m118582h();
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        if (obj instanceof bmnr) {
            bmnr bmnr = (bmnr) obj;
            return TextUtils.equals(bmnr.f130159e, this.f152083g.f130159e) && TextUtils.equals(bmnr.f130160f, this.f152083g.f130160f);
        }
    }
}
