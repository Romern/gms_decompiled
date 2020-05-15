package p000;

import android.content.Context;
import android.graphics.Rect;
import android.support.p002v7.widget.AppCompatEditText;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aauh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aauh extends AppCompatEditText implements aatq {

    /* renamed from: a */
    public final TextView f56591a;

    /* renamed from: b */
    public final boolean f56592b;

    /* renamed from: c */
    public boolean f56593c;

    /* renamed from: d */
    private final aauj f56594d;

    /* renamed from: e */
    private final int f56595e;

    /* renamed from: f */
    private final String f56596f;

    /* renamed from: g */
    private final int f56597g = getTextColors().getDefaultColor();

    /* renamed from: h */
    private final aatr f56598h;

    /* renamed from: i */
    private aave f56599i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aatj.a(android.content.Context, java.lang.String, boolean):android.widget.TextView
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      aatj.a(android.view.View, int, android.view.View$OnClickListener):void
      aatj.a(android.widget.EditText, java.lang.String, boolean):void
      aatj.a(android.widget.TextView, abbi, bzps):void
      aatj.a(android.content.Context, java.lang.String, boolean):android.widget.TextView */
    public aauh(Context context, aatr aatr, bzqi bzqi, aauj aauj, boolean z) {
        super(context);
        String str;
        int i;
        int i2;
        this.f56598h = aatr;
        this.f56594d = aauj;
        this.f56596f = bzqi.f171005k;
        TextView textView = null;
        this.f56599i = null;
        this.f56593c = false;
        if (!TextUtils.isEmpty(this.f56596f)) {
            m47020c();
        }
        if (z) {
            if (!this.f56593c && !bzqi.f171001g.isEmpty()) {
                setText(bzqi.f171001g);
            }
            this.f56592b = bzqi.f170998d;
        } else {
            this.f56592b = false;
        }
        aatj.m46982a(this, stm.m36299a(bzqi.f170997c), this.f56592b);
        int a = bzqh.m126040a(bzqi.f170999e);
        int i3 = 1;
        if (a != 0 && a == 3) {
            setSingleLine(false);
            if ((bzqi.f170995a & 64) != 0) {
                bzqj bzqj = bzqi.f171002h;
                str = (bzqj == null ? bzqj.f171010c : bzqj).f171012a;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                i = Integer.valueOf(str).intValue();
            } else {
                i = 5;
            }
            setLines(i);
            setGravity(51);
            if ((bzqi.f170995a & 64) != 0) {
                bzqj bzqj2 = bzqi.f171002h;
                i2 = (bzqj2 == null ? bzqj.f171010c : bzqj2).f171013b;
            } else {
                i2 = 0;
            }
            this.f56595e = i2;
            if (i2 > 0) {
                setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
                textView = aatj.m46978a(context, String.valueOf(this.f56595e), false);
                textView.setTextColor(context.getResources().getColor(C0126R.color.gh_edit_watcher_text));
                textView.setGravity(5);
            }
            this.f56591a = textView;
        } else {
            setSingleLine();
            this.f56591a = null;
            this.f56595e = 0;
        }
        int a2 = bzqh.m126040a(bzqi.f170999e);
        i3 = a2 != 0 ? a2 : i3;
        if (i3 == 3) {
            setInputType(147457);
        } else if (i3 == 16) {
            setInputType(16417);
        } else if (i3 != 18) {
            setInputType(AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
        } else {
            setInputType(3);
        }
    }

    /* renamed from: c */
    private final void m47020c() {
        this.f56593c = true;
        setText(this.f56596f);
        setTextColor(getContext().getResources().getColor(C0126R.color.gh_placeholder_text));
    }

    /* renamed from: a */
    public final void mo31780a(aave aave) {
        this.f56599i = aave;
    }

    /* renamed from: b */
    public final boolean mo31782b() {
        return this.f56598h.getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            if (!TextUtils.isEmpty(this.f56596f) && TextUtils.isEmpty(getText())) {
                m47020c();
            }
        } else if (this.f56593c) {
            this.f56593c = false;
            setText("");
            setTextColor(this.f56597g);
        }
        super.onFocusChanged(z, i, rect);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aave aave = this.f56599i;
        if (aave != null) {
            aave.mo31824a();
        }
        TextView textView = this.f56591a;
        if (textView != null) {
            textView.setText(String.valueOf(this.f56595e - charSequence.length()));
        }
        aauj aauj = this.f56594d;
        if (aauj != null) {
            aauj.mo31803a();
        }
    }

    /* renamed from: a */
    public final boolean mo31781a() {
        return !getText().toString().trim().isEmpty();
    }
}
