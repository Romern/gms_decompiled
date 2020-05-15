package android.support.wearable.complications.rendering;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationData;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.felicanetworks.mfc.C0126R;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ComplicationDrawable extends Drawable implements Parcelable {
    public static final int BORDER_STYLE_DASHED = 2;
    public static final int BORDER_STYLE_NONE = 0;
    public static final int BORDER_STYLE_SOLID = 1;
    public static final Parcelable.Creator CREATOR = new aeu();
    private static final String FIELD_ACTIVE_STYLE_BUILDER = "active_style_builder";
    private static final String FIELD_AMBIENT_STYLE_BUILDER = "ambient_style_builder";
    private static final String FIELD_BOUNDS = "bounds";
    private static final String FIELD_HIGHLIGHT_DURATION = "highlight_duration";
    private static final String FIELD_NO_DATA_TEXT = "no_data_text";
    private static final String FIELD_RANGED_VALUE_PROGRESS_HIDDEN = "ranged_value_progress_hidden";
    private static final String TAG = "ComplicationDrawable";
    private final ComplicationStyle$Builder mActiveStyleBuilder;
    private boolean mAlreadyStyled;
    private final ComplicationStyle$Builder mAmbientStyleBuilder;
    private boolean mBurnInProtection;
    private afe mComplicationRenderer;
    private Context mContext;
    private long mCurrentTimeMillis;
    private long mHighlightDuration;
    private boolean mInAmbientMode;
    private boolean mIsHighlighted;
    private boolean mIsInflatedFromXml;
    private boolean mIsStyleUpToDate;
    private boolean mLowBitAmbient;
    private final Handler mMainThreadHandler;
    private CharSequence mNoDataText;
    private boolean mRangedValueProgressHidden;
    private final afc mRendererInvalidateListener;
    private final Runnable mUnhighlightRunnable;

    public ComplicationDrawable() {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new aev(this);
        this.mRendererInvalidateListener = new aew(this);
        this.mActiveStyleBuilder = new ComplicationStyle$Builder();
        this.mAmbientStyleBuilder = new ComplicationStyle$Builder();
    }

    private void assertInitialized() {
        if (this.mContext == null) {
            throw new IllegalStateException("ComplicationDrawable does not have a context. Use setContext(Context) to set it first.");
        }
    }

    private ComplicationStyle$Builder getComplicationStyleBuilder(boolean z) {
        return !z ? this.mActiveStyleBuilder : this.mAmbientStyleBuilder;
    }

    private void inflateAttributes(Resources resources, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), aem.f344e);
        setRangedValueProgressHidden(obtainAttributes.getBoolean(11, false));
        obtainAttributes.recycle();
    }

    private void inflateStyle(boolean z, Resources resources, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), aem.f344e);
        ComplicationStyle$Builder complicationStyleBuilder = getComplicationStyleBuilder(z);
        if (obtainAttributes.hasValue(0)) {
            complicationStyleBuilder.f1388a = obtainAttributes.getColor(0, resources.getColor(C0126R.color.complicationDrawable_backgroundColor, null));
        }
        if (obtainAttributes.hasValue(1)) {
            complicationStyleBuilder.f1389b = obtainAttributes.getDrawable(1);
        }
        if (obtainAttributes.hasValue(14)) {
            complicationStyleBuilder.f1390c = obtainAttributes.getColor(14, resources.getColor(C0126R.color.complicationDrawable_textColor, null));
        }
        if (obtainAttributes.hasValue(17)) {
            complicationStyleBuilder.f1391d = obtainAttributes.getColor(17, resources.getColor(C0126R.color.complicationDrawable_titleColor, null));
        }
        if (obtainAttributes.hasValue(16)) {
            complicationStyleBuilder.f1392e = Typeface.create(obtainAttributes.getString(16), 0);
        }
        if (obtainAttributes.hasValue(19)) {
            complicationStyleBuilder.f1393f = Typeface.create(obtainAttributes.getString(19), 0);
        }
        if (obtainAttributes.hasValue(15)) {
            complicationStyleBuilder.f1394g = obtainAttributes.getDimensionPixelSize(15, resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_textSize));
        }
        if (obtainAttributes.hasValue(18)) {
            complicationStyleBuilder.f1395h = obtainAttributes.getDimensionPixelSize(18, resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_titleSize));
        }
        if (obtainAttributes.hasValue(9)) {
            complicationStyleBuilder.f1397j = obtainAttributes.getColor(9, resources.getColor(C0126R.color.complicationDrawable_iconColor, null));
        }
        if (obtainAttributes.hasValue(2)) {
            complicationStyleBuilder.f1398k = obtainAttributes.getColor(2, resources.getColor(C0126R.color.complicationDrawable_borderColor, null));
        }
        if (obtainAttributes.hasValue(5)) {
            complicationStyleBuilder.f1401n = obtainAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_borderRadius));
        }
        if (obtainAttributes.hasValue(6)) {
            complicationStyleBuilder.mo1811a(obtainAttributes.getInt(6, resources.getInteger(C0126R.integer.complicationDrawable_borderStyle)));
        }
        if (obtainAttributes.hasValue(4)) {
            complicationStyleBuilder.f1399l = obtainAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_borderDashWidth));
        }
        if (obtainAttributes.hasValue(3)) {
            complicationStyleBuilder.f1400m = obtainAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_borderDashGap));
        }
        if (obtainAttributes.hasValue(7)) {
            complicationStyleBuilder.f1402o = obtainAttributes.getDimensionPixelSize(7, resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_borderWidth));
        }
        if (obtainAttributes.hasValue(12)) {
            complicationStyleBuilder.f1403p = obtainAttributes.getDimensionPixelSize(12, resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_rangedValueRingWidth));
        }
        if (obtainAttributes.hasValue(10)) {
            complicationStyleBuilder.f1404q = obtainAttributes.getColor(10, resources.getColor(C0126R.color.complicationDrawable_rangedValuePrimaryColor, null));
        }
        if (obtainAttributes.hasValue(13)) {
            complicationStyleBuilder.f1405r = obtainAttributes.getColor(13, resources.getColor(C0126R.color.complicationDrawable_rangedValueSecondaryColor, null));
        }
        if (obtainAttributes.hasValue(8)) {
            complicationStyleBuilder.f1406s = obtainAttributes.getColor(8, resources.getColor(C0126R.color.complicationDrawable_highlightColor, null));
        }
        obtainAttributes.recycle();
    }

    private static void setStyleToDefaultValues(ComplicationStyle$Builder complicationStyle$Builder, Resources resources) {
        complicationStyle$Builder.f1388a = resources.getColor(C0126R.color.complicationDrawable_backgroundColor, null);
        complicationStyle$Builder.f1390c = resources.getColor(C0126R.color.complicationDrawable_textColor, null);
        complicationStyle$Builder.f1391d = resources.getColor(C0126R.color.complicationDrawable_titleColor, null);
        complicationStyle$Builder.f1392e = Typeface.create(resources.getString(C0126R.string.complicationDrawable_textTypeface), 0);
        complicationStyle$Builder.f1393f = Typeface.create(resources.getString(C0126R.string.complicationDrawable_titleTypeface), 0);
        complicationStyle$Builder.f1394g = resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_textSize);
        complicationStyle$Builder.f1395h = resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_titleSize);
        complicationStyle$Builder.f1397j = resources.getColor(C0126R.color.complicationDrawable_iconColor, null);
        complicationStyle$Builder.f1398k = resources.getColor(C0126R.color.complicationDrawable_borderColor, null);
        complicationStyle$Builder.f1402o = resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_borderWidth);
        complicationStyle$Builder.f1401n = resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_borderRadius);
        complicationStyle$Builder.mo1811a(resources.getInteger(C0126R.integer.complicationDrawable_borderStyle));
        complicationStyle$Builder.f1399l = resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_borderDashWidth);
        complicationStyle$Builder.f1400m = resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_borderDashGap);
        complicationStyle$Builder.f1403p = resources.getDimensionPixelSize(C0126R.dimen.complicationDrawable_rangedValueRingWidth);
        complicationStyle$Builder.f1404q = resources.getColor(C0126R.color.complicationDrawable_rangedValuePrimaryColor, null);
        complicationStyle$Builder.f1405r = resources.getColor(C0126R.color.complicationDrawable_rangedValueSecondaryColor, null);
        complicationStyle$Builder.f1406s = resources.getColor(C0126R.color.complicationDrawable_highlightColor, null);
    }

    private void updateStyleIfRequired() {
        if (!this.mIsStyleUpToDate) {
            this.mComplicationRenderer.mo565a(this.mActiveStyleBuilder.mo1810a(), this.mAmbientStyleBuilder.mo1810a());
            this.mIsStyleUpToDate = true;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017e, code lost:
        if (r8.f382f != null) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018a, code lost:
        if (r8.f383g == null) goto L_0x01c1;
     */
    public void draw(Canvas canvas) {
        int i;
        afd afd;
        Drawable drawable;
        Drawable drawable2;
        Canvas canvas2 = canvas;
        assertInitialized();
        updateStyleIfRequired();
        afe afe = this.mComplicationRenderer;
        long j = this.mCurrentTimeMillis;
        boolean z = this.mInAmbientMode;
        boolean z2 = this.mLowBitAmbient;
        boolean z3 = this.mBurnInProtection;
        boolean z4 = this.mIsHighlighted;
        ComplicationData complicationData = afe.f378b;
        if (complicationData != null && (i = complicationData.f1369b) != 2 && i != 1 && j >= complicationData.f1370c.getLong("START_TIME", 0) && j <= complicationData.f1370c.getLong("END_TIME", Long.MAX_VALUE) && !afe.f379c.isEmpty()) {
            if (z) {
                afd afd2 = afe.f399w;
                if (!(afd2.f368j == z2 && afd2.f369k == z3)) {
                    afe.f399w = new afd(afe.f402z, true, z2, z3);
                }
                afd = afe.f399w;
            } else {
                afd = afe.f398v;
            }
            if (afe.f378b.mo1724b() != null) {
                afe.f388l.mo586b(1);
                afe.f388l.mo583a(afe.f378b.mo1724b().mo1734a(afe.f377a, j));
                if (afe.f378b.mo1723a() != null) {
                    afe.f389m.mo583a(afe.f378b.mo1723a().mo1734a(afe.f377a, j));
                } else {
                    afe.f389m.mo583a("");
                }
            }
            if (afe.f378b.mo1726d() != null) {
                afe.f388l.mo583a(afe.f378b.mo1726d().mo1734a(afe.f377a, j));
                if (afe.f378b.mo1725c() != null) {
                    afe.f389m.mo583a(afe.f378b.mo1725c().mo1734a(afe.f377a, j));
                    afe.f388l.mo586b(1);
                } else {
                    afe.f389m.mo583a("");
                    afe.f388l.mo586b(2);
                }
            }
            canvas.save();
            canvas2.translate((float) afe.f379c.left, (float) afe.f379c.top);
            int a = afe.mo562a(afd.f366h);
            float f = (float) a;
            canvas2.drawRoundRect(afe.f391o, f, f, afd.f364f);
            if (afd.f366h.f405c != null && !afd.mo561a()) {
                afe.f385i.mo572a(afd.f366h.f405c);
                afi afi = afe.f385i;
                afi.f427b = a;
                afi.setBounds(afe.f390n);
                afe.f385i.draw(canvas2);
            }
            if (!afe.f392p.isEmpty() && (drawable = afe.f380d) != null) {
                if (afd.mo561a() && (drawable2 = afe.f381e) != null) {
                    drawable = drawable2;
                }
                drawable.setColorFilter(afd.f370l);
                Rect rect = afe.f392p;
                drawable.setBounds(0, 0, rect.width(), rect.height());
                canvas.save();
                canvas2.translate((float) rect.left, (float) rect.top);
                drawable.draw(canvas2);
                canvas.restore();
            }
            if (!afe.f393q.isEmpty()) {
                if (!afd.mo561a()) {
                    afe.f387k.mo572a(afe.f382f);
                } else {
                    afe.f387k.mo572a(afe.f383g);
                }
                if (afe.f378b.mo1730g() == 2) {
                    afe.f387k.setColorFilter(null);
                    afe.f387k.f427b = 0;
                } else {
                    afe.f387k.setColorFilter(afd.f366h.f412j);
                    afe.f387k.f427b = afe.mo563a(afd.f366h, afe.f393q);
                }
                afe.f387k.setBounds(afe.f393q);
                afe.f387k.draw(canvas2);
            }
            if (!afe.f394r.isEmpty() && !afd.mo561a()) {
                afe.f386j.mo572a(afe.f384h);
                afe.f386j.f427b = afe.mo563a(afd.f366h, afe.f394r);
                afe.f386j.setBounds(afe.f394r);
                afe.f386j.setColorFilter(afd.f366h.f412j);
                afe.f386j.draw(canvas2);
            }
            if (!afe.f397u.isEmpty()) {
                ComplicationData complicationData2 = afe.f378b;
                ComplicationData.m1402a("MAX_VALUE", complicationData2.f1369b);
                float f2 = complicationData2.f1370c.getFloat("MAX_VALUE");
                ComplicationData complicationData3 = afe.f378b;
                ComplicationData.m1402a("MIN_VALUE", complicationData3.f1369b);
                float f3 = f2 - complicationData3.f1370c.getFloat("MIN_VALUE");
                float f4 = 0.0f;
                if (f3 > 0.0f) {
                    ComplicationData complicationData4 = afe.f378b;
                    ComplicationData.m1402a("VALUE", complicationData4.f1369b);
                    f4 = complicationData4.f1370c.getFloat("VALUE") / f3;
                }
                float f5 = f4 * 352.0f;
                int ceil = (int) Math.ceil((double) afd.f361c.getStrokeWidth());
                float f6 = (float) ceil;
                afe.f397u.inset(f6, f6);
                canvas.drawArc(afe.f397u, -88.0f, f5, false, afd.f361c);
                canvas.drawArc(afe.f397u, 4.0f + -88.0f + f5, 352.0f - f5, false, afd.f362d);
                float f7 = (float) (-ceil);
                afe.f397u.inset(f7, f7);
            }
            if (!afe.f395s.isEmpty()) {
                TextPaint textPaint = afe.f400x;
                TextPaint textPaint2 = afd.f359a;
                if (textPaint != textPaint2) {
                    afe.f400x = textPaint2;
                    afe.f388l.mo582a(afe.f400x);
                    afe.f388l.mo584a(afd.f367i);
                }
                afe.f388l.mo580a(canvas2, afe.f395s);
            }
            if (!afe.f396t.isEmpty()) {
                TextPaint textPaint3 = afe.f401y;
                TextPaint textPaint4 = afd.f360b;
                if (textPaint3 != textPaint4) {
                    afe.f401y = textPaint4;
                    afe.f389m.mo582a(afe.f401y);
                    afe.f389m.mo584a(afd.f367i);
                }
                afe.f389m.mo580a(canvas2, afe.f396t);
            }
            if (z4 && !afd.f367i) {
                float a2 = (float) afe.mo562a(afd.f366h);
                canvas2.drawRoundRect(afe.f391o, a2, a2, afd.f365g);
            }
            afg afg = afd.f366h;
            if (afg.f415m != 0) {
                float a3 = (float) afe.mo562a(afg);
                canvas2.drawRoundRect(afe.f391o, a3, a3, afd.f363e);
            }
            canvas.restore();
        }
    }

    /* access modifiers changed from: package-private */
    public afg getActiveStyle() {
        return this.mActiveStyleBuilder.mo1810a();
    }

    /* access modifiers changed from: package-private */
    public afg getAmbientStyle() {
        return this.mAmbientStyleBuilder.mo1810a();
    }

    /* access modifiers changed from: package-private */
    public afe getComplicationRenderer() {
        return this.mComplicationRenderer;
    }

    public long getHighlightDuration() {
        return this.mHighlightDuration;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getNoDataText() {
        return this.mNoDataText;
    }

    public int getOpacity() {
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        this.mIsInflatedFromXml = true;
        int depth = xmlPullParser.getDepth();
        inflateAttributes(resources, xmlPullParser);
        setStyleToDefaultValues(this.mActiveStyleBuilder, resources);
        setStyleToDefaultValues(this.mAmbientStyleBuilder, resources);
        inflateStyle(false, resources, xmlPullParser);
        inflateStyle(true, resources, xmlPullParser);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            } else if (next != 3) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (TextUtils.equals(name, "ambient")) {
                        inflateStyle(true, resources, xmlPullParser);
                    } else {
                        String valueOf = String.valueOf(this);
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 43 + String.valueOf(valueOf).length());
                        sb.append("Unknown element: ");
                        sb.append(name);
                        sb.append(" for ComplicationDrawable ");
                        sb.append(valueOf);
                        Log.w(TAG, sb.toString());
                    }
                }
            } else if (xmlPullParser.getDepth() <= depth) {
                break;
            }
        }
        this.mIsStyleUpToDate = false;
    }

    public boolean isHighlighted() {
        return this.mIsHighlighted;
    }

    public boolean isRangedValueProgressHidden() {
        return this.mRangedValueProgressHidden;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        afe afe = this.mComplicationRenderer;
        if (afe != null) {
            afe.mo566a(rect);
        }
    }

    public boolean onTap(int i, int i2) {
        ComplicationData complicationData;
        afe afe = this.mComplicationRenderer;
        if (!(afe == null || (complicationData = afe.f378b) == null || ((complicationData.mo1731h() == null && complicationData.f1369b != 9) || !getBounds().contains(i, i2)))) {
            if (complicationData.f1369b == 9) {
                Context context = this.mContext;
                if (!(context instanceof age)) {
                    return false;
                }
                ComponentName componentName = new ComponentName(context, context.getClass());
                Intent intent = new Intent(context, aep.class);
                intent.setAction("android.support.wearable.complications.ACTION_PERMISSION_REQUEST_ONLY");
                intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", componentName);
                context.startActivity(intent.addFlags(268435456));
            } else {
                try {
                    complicationData.mo1731h().send();
                } catch (PendingIntent.CanceledException e) {
                }
            }
            if (getHighlightDuration() > 0) {
                setIsHighlighted(true);
                invalidateSelf();
                this.mMainThreadHandler.removeCallbacks(this.mUnhighlightRunnable);
                this.mMainThreadHandler.postDelayed(this.mUnhighlightRunnable, getHighlightDuration());
            }
            return true;
        }
        return false;
    }

    public void setAlpha(int i) {
    }

    public void setBackgroundColorActive(int i) {
        getComplicationStyleBuilder(false).f1388a = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1388a = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundDrawableActive(Drawable drawable) {
        getComplicationStyleBuilder(false).f1389b = drawable;
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundDrawableAmbient(Drawable drawable) {
        getComplicationStyleBuilder(true).f1389b = drawable;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderColorActive(int i) {
        getComplicationStyleBuilder(false).f1398k = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1398k = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashGapActive(int i) {
        getComplicationStyleBuilder(false).f1400m = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashGapAmbient(int i) {
        getComplicationStyleBuilder(true).f1400m = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashWidthActive(int i) {
        getComplicationStyleBuilder(false).f1399l = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashWidthAmbient(int i) {
        getComplicationStyleBuilder(true).f1399l = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderRadiusActive(int i) {
        getComplicationStyleBuilder(false).f1401n = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderRadiusAmbient(int i) {
        getComplicationStyleBuilder(true).f1401n = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderStyleActive(int i) {
        getComplicationStyleBuilder(false).mo1811a(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderStyleAmbient(int i) {
        getComplicationStyleBuilder(true).mo1811a(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderWidthActive(int i) {
        getComplicationStyleBuilder(false).f1402o = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderWidthAmbient(int i) {
        getComplicationStyleBuilder(true).f1402o = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBurnInProtection(boolean z) {
        this.mBurnInProtection = z;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setComplicationData(ComplicationData complicationData) {
        assertInitialized();
        this.mComplicationRenderer.mo567a(complicationData);
    }

    public void setContext(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Argument \"context\" should not be null.");
        } else if (!Objects.equals(context, this.mContext)) {
            this.mContext = context;
            if (!this.mIsInflatedFromXml && !this.mAlreadyStyled) {
                setStyleToDefaultValues(this.mActiveStyleBuilder, context.getResources());
                setStyleToDefaultValues(this.mAmbientStyleBuilder, context.getResources());
            }
            if (!this.mAlreadyStyled) {
                this.mHighlightDuration = (long) context.getResources().getInteger(C0126R.integer.complicationDrawable_highlightDurationMs);
            }
            afe afe = new afe(this.mContext, this.mActiveStyleBuilder.mo1810a(), this.mAmbientStyleBuilder.mo1810a());
            this.mComplicationRenderer = afe;
            afe.f371A = this.mRendererInvalidateListener;
            CharSequence charSequence = this.mNoDataText;
            if (charSequence == null) {
                setNoDataText(context.getString(C0126R.string.complicationDrawable_noDataText));
            } else {
                afe.mo568a(charSequence);
            }
            this.mComplicationRenderer.mo569a(this.mRangedValueProgressHidden);
            this.mComplicationRenderer.mo566a(getBounds());
            this.mIsStyleUpToDate = true;
        }
    }

    public void setCurrentTimeMillis(long j) {
        this.mCurrentTimeMillis = j;
    }

    public void setHighlightColorActive(int i) {
        getComplicationStyleBuilder(false).f1406s = i;
        this.mIsStyleUpToDate = false;
    }

    public void setHighlightColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1406s = i;
        this.mIsStyleUpToDate = false;
    }

    public void setHighlightDuration(long j) {
        if (j >= 0) {
            this.mHighlightDuration = j;
            return;
        }
        throw new IllegalArgumentException("Highlight duration should be non-negative.");
    }

    public void setIconColorActive(int i) {
        getComplicationStyleBuilder(false).f1397j = i;
        this.mIsStyleUpToDate = false;
    }

    public void setIconColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1397j = i;
        this.mIsStyleUpToDate = false;
    }

    public void setImageColorFilterActive(ColorFilter colorFilter) {
        getComplicationStyleBuilder(false).f1396i = colorFilter;
        this.mIsStyleUpToDate = false;
    }

    public void setImageColorFilterAmbient(ColorFilter colorFilter) {
        getComplicationStyleBuilder(true).f1396i = colorFilter;
        this.mIsStyleUpToDate = false;
    }

    public void setInAmbientMode(boolean z) {
        this.mInAmbientMode = z;
    }

    public void setIsHighlighted(boolean z) {
        this.mIsHighlighted = z;
    }

    public void setLowBitAmbient(boolean z) {
        this.mLowBitAmbient = z;
    }

    public void setNoDataText(CharSequence charSequence) {
        if (charSequence != null) {
            this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        } else {
            this.mNoDataText = "";
        }
        afe afe = this.mComplicationRenderer;
        if (afe != null) {
            afe.mo568a(this.mNoDataText);
        }
    }

    public void setRangedValuePrimaryColorActive(int i) {
        getComplicationStyleBuilder(false).f1404q = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValuePrimaryColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1404q = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueProgressHidden(boolean z) {
        this.mRangedValueProgressHidden = z;
        afe afe = this.mComplicationRenderer;
        if (afe != null) {
            afe.mo569a(z);
        }
    }

    public void setRangedValueRingWidthActive(int i) {
        getComplicationStyleBuilder(false).f1403p = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueRingWidthAmbient(int i) {
        getComplicationStyleBuilder(true).f1403p = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueSecondaryColorActive(int i) {
        getComplicationStyleBuilder(false).f1405r = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueSecondaryColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1405r = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextColorActive(int i) {
        getComplicationStyleBuilder(false).f1390c = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1390c = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextSizeActive(int i) {
        getComplicationStyleBuilder(false).f1394g = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextSizeAmbient(int i) {
        getComplicationStyleBuilder(true).f1394g = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextTypefaceActive(Typeface typeface) {
        getComplicationStyleBuilder(false).f1392e = typeface;
        this.mIsStyleUpToDate = false;
    }

    public void setTextTypefaceAmbient(Typeface typeface) {
        getComplicationStyleBuilder(true).f1392e = typeface;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleColorActive(int i) {
        getComplicationStyleBuilder(false).f1391d = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleColorAmbient(int i) {
        getComplicationStyleBuilder(true).f1391d = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleSizeActive(int i) {
        getComplicationStyleBuilder(false).f1395h = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleSizeAmbient(int i) {
        getComplicationStyleBuilder(true).f1395h = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleTypefaceActive(Typeface typeface) {
        getComplicationStyleBuilder(false).f1393f = typeface;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleTypefaceAmbient(Typeface typeface) {
        getComplicationStyleBuilder(true).f1393f = typeface;
        this.mIsStyleUpToDate = false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(FIELD_ACTIVE_STYLE_BUILDER, this.mActiveStyleBuilder);
        bundle.putParcelable(FIELD_AMBIENT_STYLE_BUILDER, this.mAmbientStyleBuilder);
        bundle.putCharSequence(FIELD_NO_DATA_TEXT, this.mNoDataText);
        bundle.putLong(FIELD_HIGHLIGHT_DURATION, this.mHighlightDuration);
        bundle.putBoolean(FIELD_RANGED_VALUE_PROGRESS_HIDDEN, this.mRangedValueProgressHidden);
        bundle.putParcelable(FIELD_BOUNDS, getBounds());
        parcel.writeBundle(bundle);
    }

    public ComplicationDrawable(Context context) {
        this();
        setContext(context);
    }

    private ComplicationDrawable(Parcel parcel) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new aev(this);
        this.mRendererInvalidateListener = new aew(this);
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.mActiveStyleBuilder = (ComplicationStyle$Builder) readBundle.getParcelable(FIELD_ACTIVE_STYLE_BUILDER);
        this.mAmbientStyleBuilder = (ComplicationStyle$Builder) readBundle.getParcelable(FIELD_AMBIENT_STYLE_BUILDER);
        this.mNoDataText = readBundle.getCharSequence(FIELD_NO_DATA_TEXT);
        this.mHighlightDuration = readBundle.getLong(FIELD_HIGHLIGHT_DURATION);
        this.mRangedValueProgressHidden = readBundle.getBoolean(FIELD_RANGED_VALUE_PROGRESS_HIDDEN);
        setBounds((Rect) readBundle.getParcelable(FIELD_BOUNDS));
        this.mAlreadyStyled = true;
    }

    @Deprecated
    public boolean onTap(int i, int i2, long j) {
        return onTap(i, i2);
    }

    public /* synthetic */ ComplicationDrawable(Parcel parcel, aeu aeu) {
        this(parcel);
    }

    public ComplicationDrawable(ComplicationDrawable complicationDrawable) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new aev(this);
        this.mRendererInvalidateListener = new aew(this);
        this.mActiveStyleBuilder = new ComplicationStyle$Builder(complicationDrawable.mActiveStyleBuilder);
        this.mAmbientStyleBuilder = new ComplicationStyle$Builder(complicationDrawable.mAmbientStyleBuilder);
        CharSequence charSequence = complicationDrawable.mNoDataText;
        this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        this.mHighlightDuration = complicationDrawable.mHighlightDuration;
        this.mRangedValueProgressHidden = complicationDrawable.mRangedValueProgressHidden;
        setBounds(complicationDrawable.getBounds());
        this.mAlreadyStyled = true;
    }

    public void draw(Canvas canvas, long j) {
        assertInitialized();
        setCurrentTimeMillis(j);
        draw(canvas);
    }
}
