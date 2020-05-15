package p000;

import android.os.Build;
import android.support.p002v7.widget.AppCompatTextView;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.wallet.bender3.framework.view.clickspan.TextInfoClickSpan;

/* renamed from: bjrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjrr extends bjjm implements bjxu {

    /* renamed from: m */
    AppCompatTextView f123190m;

    public bjrr(bjgv bjgv) {
        super(bjgv, bjrq.class);
    }

    /* renamed from: E */
    private final void m104469E() {
        AppCompatTextView appCompatTextView = this.f123190m;
        boab boab = ((bjrq) ((bjjm) this).f122830n).f123189l.f161752a;
        if (boab == null) {
            boab = boab.f132441b;
        }
        SpannableString spannableString = new SpannableString(Html.fromHtml(boac.m110961a(boab).f132440a));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            URLSpan uRLSpan = uRLSpanArr[i];
            String url = uRLSpan.getURL();
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            int spanFlags = spannableString.getSpanFlags(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            if (((UnderlineSpan[]) spannableString.getSpans(spanStart, spanEnd, UnderlineSpan.class)).length == 0) {
                z = false;
            }
            spannableString.setSpan(new TextInfoClickSpan(url, this, z), spanStart, spanEnd, spanFlags);
            i++;
        }
        appCompatTextView.setText(spannableString);
        if (uRLSpanArr.length > 0) {
            if (!(appCompatTextView.getMovementMethod() instanceof LinkMovementMethod)) {
                appCompatTextView.setMovementMethod(bjkv.m103801a());
            }
            appCompatTextView.setClickable(false);
            appCompatTextView.setLongClickable(false);
            int i2 = Build.VERSION.SDK_INT;
            appCompatTextView.setImportantForAccessibility(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final int mo65154A() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104469E();
    }

    /* renamed from: a */
    public final void mo52355a(View view, String str) {
        this.f122676a.f122692a.f122731h.mo65226a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        bjkn.m103783a(this.f122686k, (TextView) view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        mo65177j(this.f123190m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        mo65192w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        int i;
        TextUtils.TruncateAt truncateAt;
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bxax.f161756e;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bxax bxax = (bxax) b;
        this.f123190m = new AppCompatTextView(this.f122676a.f122692a.f122732i);
        if ((bxax.f161758a & 2) != 0) {
            i = bxax.f161759b;
        } else {
            i = Integer.MAX_VALUE;
        }
        this.f123190m.setMaxLines(i);
        AppCompatTextView appCompatTextView = this.f123190m;
        int a = bxaw.m122505a(bxax.f161760c);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 0 || i2 == 1) {
            truncateAt = null;
        } else if (i2 == 2) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i2 != 3) {
            truncateAt = TextUtils.TruncateAt.END;
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        appCompatTextView.setEllipsize(truncateAt);
        m104469E();
    }
}
