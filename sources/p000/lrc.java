package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* renamed from: lrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lrc {

    /* renamed from: a */
    private final Resources f26627a;

    private lrc(Resources resources) {
        this.f26627a = resources;
    }

    /* renamed from: a */
    public static lrc m19570a(Context context) {
        Resources resources = context.getResources();
        context.getTheme();
        return new lrc(resources);
    }

    /* renamed from: b */
    public final CharSequence mo15386b(int i) {
        return this.f26627a.getText(i);
    }

    /* renamed from: a */
    public final int mo15383a(int i) {
        return this.f26627a.getDimensionPixelSize(i);
    }

    /* renamed from: a */
    public final Configuration mo15384a() {
        return this.f26627a.getConfiguration();
    }

    /* renamed from: a */
    public final CharSequence mo15385a(int i, CharSequence... charSequenceArr) {
        return TextUtils.expandTemplate(mo15386b(i), charSequenceArr);
    }
}
