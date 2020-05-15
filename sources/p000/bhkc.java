package p000;

import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: bhkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhkc {

    /* renamed from: a */
    public CharSequence f118892a;

    /* renamed from: b */
    public final TextPaint f118893b;

    /* renamed from: c */
    public final int f118894c;

    /* renamed from: d */
    public int f118895d;

    /* renamed from: e */
    public Layout.Alignment f118896e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f118897f = Integer.MAX_VALUE;

    /* renamed from: g */
    public boolean f118898g = true;

    /* renamed from: h */
    public boolean f118899h;

    /* renamed from: i */
    public TextUtils.TruncateAt f118900i = null;

    public bhkc(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f118892a = charSequence;
        this.f118893b = textPaint;
        this.f118894c = i;
        this.f118895d = charSequence.length();
    }
}
