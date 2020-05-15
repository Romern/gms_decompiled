package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import java.util.Collections;

/* renamed from: agx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agx {

    /* renamed from: a */
    public String f530a;

    /* renamed from: b */
    private Icon f531b;

    /* renamed from: c */
    private Icon f532c;

    /* renamed from: d */
    private String f533d;

    /* renamed from: e */
    private PendingIntent f534e;

    /* renamed from: f */
    private boolean f535f;

    public agx() {
    }

    /* renamed from: a */
    public final Slice mo690a() {
        mo693b();
        this.f535f = true;
        String str = this.f533d;
        if (str == null && this.f531b == null && this.f532c == null && this.f530a == null) {
            throw new IllegalStateException("Title, subtitle, start icon, end icon are all null. Please set value for at least one of them");
        } else if (str == null && this.f530a != null) {
            throw new IllegalStateException("Cannot set the subtitle without setting the title.");
        } else {
            Slice.Builder builder = new Slice.Builder(Uri.parse("inline.slice"), new SliceSpec("InlinePresentation", 1));
            Icon icon = this.f531b;
            if (icon != null) {
                builder.addIcon(icon, null, Collections.singletonList("inline_start_icon"));
            }
            String str2 = this.f533d;
            if (str2 != null) {
                builder.addText(str2, null, Collections.singletonList("inline_title"));
            }
            String str3 = this.f530a;
            if (str3 != null) {
                builder.addText(str3, null, Collections.singletonList("inline_subtitle"));
            }
            Icon icon2 = this.f532c;
            if (icon2 != null) {
                builder.addIcon(icon2, null, Collections.singletonList("inline_end_icon"));
            }
            PendingIntent pendingIntent = this.f534e;
            if (pendingIntent != null) {
                builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList("inline_attribution")).build(), null);
            }
            return builder.build();
        }
    }

    /* renamed from: b */
    public final void mo693b() {
        if (this.f535f) {
            throw new IllegalStateException("Already called #build()");
        }
    }

    public agx(CharSequence charSequence) {
        C1244oj.m19767a(charSequence, "Title must not be null");
        this.f533d = charSequence.toString();
    }

    /* renamed from: b */
    public final void mo694b(Icon icon) {
        mo693b();
        C1244oj.m19767a(icon, "StartIcon should not be null");
        this.f531b = icon;
    }

    /* renamed from: a */
    public final void mo691a(PendingIntent pendingIntent) {
        mo693b();
        C1244oj.m19767a(pendingIntent, "Attribution should not be null");
        this.f534e = pendingIntent;
    }

    /* renamed from: a */
    public final void mo692a(Icon icon) {
        mo693b();
        C1244oj.m19767a(icon, "EndIcon should not be null");
        this.f532c = icon;
    }
}
