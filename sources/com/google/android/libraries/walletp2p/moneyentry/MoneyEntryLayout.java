package com.google.android.libraries.walletp2p.moneyentry;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MoneyEntryLayout extends FrameLayout {

    /* renamed from: c */
    private static final float[] f150667c = {1.0f, 1.0f, 1.0f, 0.85f, 0.7f};

    /* renamed from: a */
    public String f150668a;

    /* renamed from: b */
    public beqk f150669b;

    /* renamed from: d */
    private Locale f150670d;

    /* renamed from: e */
    private TextView f150671e = ((TextView) findViewById(C0126R.C0129id.integer_part_comma_separator));

    /* renamed from: f */
    private TextView[] f150672f;

    /* renamed from: g */
    private TextView f150673g;

    /* renamed from: h */
    private TextView f150674h;

    /* renamed from: i */
    private beqn f150675i;

    /* renamed from: j */
    private TextView f150676j;

    /* renamed from: k */
    private beqn f150677k;

    /* renamed from: l */
    private beqm f150678l;

    /* renamed from: m */
    private beqm f150679m;

    /* renamed from: n */
    private RelativeLayout f150680n;

    /* renamed from: o */
    private int f150681o;

    /* renamed from: p */
    private final float[] f150682p;

    /* renamed from: q */
    private String f150683q;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.libraries.walletp2p.moneyentry.MoneyEntryLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public MoneyEntryLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.walletp2p_fancy_money_layout_contents, (ViewGroup) this, true);
        setClipChildren(false);
        setClipToPadding(false);
        TextView[] textViewArr = new TextView[4];
        this.f150672f = textViewArr;
        textViewArr[3] = (TextView) findViewById(C0126R.C0129id.integer_part_thousands);
        this.f150672f[2] = (TextView) findViewById(C0126R.C0129id.integer_part_hundreds);
        this.f150672f[1] = (TextView) findViewById(C0126R.C0129id.integer_part_tens);
        this.f150672f[0] = (TextView) findViewById(C0126R.C0129id.integer_part_ones);
        this.f150680n = (RelativeLayout) findViewById(C0126R.C0129id.fancy_money_container);
        this.f150673g = (TextView) findViewById(C0126R.C0129id.fractional_part);
        this.f150674h = (TextView) findViewById(C0126R.C0129id.prefix_money_symbol);
        this.f150676j = (TextView) findViewById(C0126R.C0129id.suffix_money_symbol);
        TextView textView = this.f150674h;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.walletp2p_fancy_money_wide_spacing);
        int integer = getResources().getInteger(17694722);
        this.f150675i = new beqn(textView, (long) dimensionPixelSize, (long) (integer + integer));
        TextView textView2 = this.f150676j;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0126R.dimen.walletp2p_fancy_money_wide_spacing);
        int integer2 = getResources().getInteger(17694722);
        this.f150677k = new beqn(textView2, (long) dimensionPixelSize2, (long) (integer2 + integer2));
        this.f150678l = new beqm(this.f150672f[0], (long) getResources().getDimensionPixelSize(C0126R.dimen.walletp2p_fancy_money_medium_spacing), (long) getResources().getInteger(17694720));
        this.f150679m = new beqm(this.f150671e, (long) getResources().getDimensionPixelSize(C0126R.dimen.walletp2p_fancy_money_medium_spacing), (long) getResources().getInteger(17694720));
        float[] fArr = f150667c;
        this.f150682p = Arrays.copyOf(fArr, fArr.length);
    }

    /* renamed from: a */
    public final long mo70852a() {
        beqk beqk = this.f150669b;
        long j = 0;
        long j2 = 1000000;
        for (int size = beqk.f112051b.size() - 1; size >= 0; size--) {
            j += ((long) ((Integer) beqk.f112051b.get(size)).intValue()) * j2;
            j2 *= 10;
        }
        long j3 = 100000;
        for (int i = 0; i < beqk.f112052c.size(); i++) {
            j += ((long) ((Integer) beqk.f112052c.get(i)).intValue()) * j3;
            j3 /= 10;
        }
        return j;
    }

    /* renamed from: b */
    public final void mo70857b() {
        this.f150675i.mo60937a();
        this.f150677k.mo60937a();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        String string = bundle.getString("a");
        String string2 = bundle.getString("c");
        mo70855a(new Locale(bundle.getString("f"), bundle.getString("e")), string2);
        mo70854a(string2);
        this.f150669b.mo60931a(string);
        mo70856a(false);
        super.onRestoreInstanceState(bundle.getParcelable("s"));
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("s", super.onSaveInstanceState());
        bundle.putString("a", this.f150669b.toString());
        bundle.putString("c", this.f150668a);
        bundle.putString("e", this.f150670d.getCountry());
        bundle.putString("f", this.f150670d.getLanguage());
        return bundle;
    }

    /* renamed from: a */
    public final void mo70853a(long j, String str) {
        String str2;
        mo70854a(str);
        beqk beqk = this.f150669b;
        BigDecimal divide = new BigDecimal(j).divide(beqj.f112049a);
        if (divide.remainder(BigDecimal.ONE).signum() != 0) {
            str2 = "#.00";
        } else {
            str2 = "0";
        }
        DecimalFormat decimalFormat = new DecimalFormat(str2, beqk.f112050a);
        decimalFormat.setGroupingUsed(false);
        beqk.mo60931a(decimalFormat.format(divide));
        mo70856a(false);
    }

    /* renamed from: a */
    public final void mo70854a(String str) {
        beqh a = beqh.m95434a(str);
        this.f150668a = a.f112046b;
        char c = a.f112047c;
        this.f150674h.setText(Character.toString(c));
        this.f150676j.setText(Character.toString(c));
        if (a.f112048d) {
            this.f150674h.setVisibility(0);
            this.f150676j.setVisibility(4);
        } else {
            this.f150674h.setVisibility(4);
            this.f150676j.setVisibility(0);
        }
        mo70856a(false);
    }

    /* renamed from: a */
    public final void mo70855a(Locale locale, String str) {
        this.f150670d = locale;
        DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance(locale);
        this.f150671e.setText(Character.toString(instance.getGroupingSeparator()));
        this.f150683q = Character.toString(instance.getDecimalSeparator());
        this.f150681o = 0;
        this.f150669b = new beqk(instance);
        mo70854a(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(char[], char):void}
     arg types: [char[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(char[], char):void} */
    /* renamed from: a */
    public final void mo70856a(boolean z) {
        CharSequence charSequence;
        List unmodifiableList = Collections.unmodifiableList(this.f150669b.f112051b);
        List<Integer> unmodifiableList2 = Collections.unmodifiableList(this.f150669b.f112052c);
        if (!this.f150669b.f112053d) {
            charSequence = SpannableString.valueOf("");
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f150683q);
            for (Integer num : unmodifiableList2) {
                spannableStringBuilder.append((char) (num.intValue() + 48));
            }
            char[] cArr = new char[(2 - unmodifiableList2.size())];
            Arrays.fill(cArr, '0');
            SpannableString valueOf = SpannableString.valueOf(new String(cArr));
            valueOf.setSpan(new ForegroundColorSpan(azxe.m86324a(getContext(), 16842906)), 0, valueOf.length(), 33);
            spannableStringBuilder.append((CharSequence) valueOf);
            charSequence = spannableStringBuilder;
        }
        this.f150673g.setText(charSequence);
        int i = 8;
        if (!unmodifiableList.isEmpty()) {
            int i2 = 0;
            while (true) {
                TextView[] textViewArr = this.f150672f;
                int length = textViewArr.length;
                if (i2 >= 4) {
                    break;
                }
                TextView textView = textViewArr[i2];
                if (i2 < unmodifiableList.size()) {
                    textView.setText(((Integer) unmodifiableList.get((unmodifiableList.size() - 1) - i2)).toString());
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                i2++;
            }
        } else {
            this.f150672f[0].setText("0");
            this.f150672f[1].setVisibility(8);
            this.f150672f[2].setVisibility(8);
            this.f150672f[3].setVisibility(8);
        }
        TextView textView2 = this.f150671e;
        if (unmodifiableList.size() > 3) {
            i = 0;
        }
        textView2.setVisibility(i);
        float f = this.f150682p[unmodifiableList.size()];
        if (z) {
            int integer = getResources().getInteger(17694720);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f150680n, "scaleX", f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f150680n, "scaleY", f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration((long) integer);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            if (this.f150681o < unmodifiableList.size()) {
                this.f150678l.mo60936a();
                if (this.f150681o == 3 && unmodifiableList.size() == 4) {
                    this.f150679m.mo60936a();
                }
            } else {
                long j = (long) (integer / 2);
                ofFloat.setCurrentPlayTime(j);
                ofFloat2.setCurrentPlayTime(j);
            }
            animatorSet.start();
        } else {
            this.f150680n.setScaleX(f);
            this.f150680n.setScaleY(f);
        }
        this.f150681o = unmodifiableList.size();
        beqh a = beqh.m95434a(this.f150668a);
        if (a.f112048d) {
            char c = a.f112047c;
            String beqk = this.f150669b.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(beqk).length() + 1);
            sb.append(c);
            sb.append(beqk);
            setContentDescription(sb.toString());
            return;
        }
        String beqk2 = this.f150669b.toString();
        char c2 = a.f112047c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(beqk2).length() + 1);
        sb2.append(beqk2);
        sb2.append(c2);
        setContentDescription(sb2.toString());
    }
}
