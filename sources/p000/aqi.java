package p000;

import android.app.PendingIntent;
import android.support.p001v4.graphics.drawable.IconCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.slice.SliceItem;

/* renamed from: aqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqi implements aqh {

    /* renamed from: a */
    public PendingIntent f1990a;

    /* renamed from: b */
    public IconCompat f1991b;

    /* renamed from: c */
    public CharSequence f1992c;

    /* renamed from: d */
    public boolean f1993d;

    /* renamed from: e */
    private int f1994e;

    /* renamed from: f */
    private CharSequence f1995f;

    /* renamed from: g */
    private boolean f1996g;

    /* renamed from: h */
    private int f1997h;

    /* renamed from: i */
    private SliceItem f1998i;

    /* renamed from: j */
    private SliceItem f1999j;

    /* renamed from: k */
    private boolean f2000k;

    public aqi(PendingIntent pendingIntent, IconCompat iconCompat, int i, CharSequence charSequence) {
        this.f1997h = -1;
        this.f1990a = pendingIntent;
        this.f1991b = iconCompat;
        this.f1992c = charSequence;
        this.f1994e = i;
    }

    /* renamed from: a */
    public static int m1856a(SliceItem sliceItem) {
        if (sliceItem.mo2049a("no_tint")) {
            return sliceItem.mo2049a("raw") ? sliceItem.mo2049a("large") ? 4 : 3 : !sliceItem.mo2049a("large") ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: b */
    public final String mo2301b() {
        if (this.f1993d) {
            return "toggle";
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo2289c() {
        return this.f1993d;
    }

    public aqi(SliceItem sliceItem) {
        this.f1994e = 5;
        int i = -1;
        this.f1997h = -1;
        this.f1998i = sliceItem;
        SliceItem a = aqq.m1871a(sliceItem, "action");
        if (a != null) {
            this.f1999j = a;
            this.f1990a = a.mo2054d();
            SliceItem a2 = aqq.m1870a(a.mo2056f(), "image", (String[]) null, (String[]) null);
            if (a2 != null) {
                this.f1991b = a2.mo2053c();
                this.f1994e = m1856a(a2);
            }
            SliceItem b = aqq.m1879b(a.mo2056f(), "text", "title");
            if (b != null) {
                if (b.f1660e == null) {
                    CharSequence b2 = b.mo2051b();
                    if (b2 instanceof Spannable) {
                        SliceItem.m1637a((Spannable) b2);
                    } else if (b2 instanceof Spanned) {
                        Spanned spanned = (Spanned) b2;
                        int i2 = 0;
                        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                        int length = spans.length;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            } else if (!SliceItem.m1638a(spans[i2])) {
                                SpannableString spannableString = new SpannableString(b2);
                                SliceItem.m1637a((Spannable) spannableString);
                                b2 = spannableString;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    b.f1660e = b2;
                }
                this.f1992c = b.f1660e;
            }
            SliceItem a3 = aqq.m1868a(a.mo2056f(), "text", "content_description");
            if (a3 != null) {
                this.f1995f = a3.mo2051b();
            }
            boolean equals = "toggle".equals(a.f1658c);
            this.f1993d = equals;
            if (equals) {
                this.f1996g = a.mo2049a("selected");
            }
            this.f2000k = this.f1998i.mo2049a("activity");
            SliceItem a4 = aqq.m1868a(a.mo2056f(), "int", "priority");
            this.f1997h = a4 != null ? a4.mo2055e() : i;
        }
    }

    /* renamed from: a */
    public final PendingIntent mo2299a() {
        PendingIntent pendingIntent = this.f1990a;
        return pendingIntent == null ? this.f1999j.mo2054d() : pendingIntent;
    }

    /* renamed from: a */
    public final apg mo2300a(apg apg) {
        apg apg2 = new apg(apg);
        IconCompat iconCompat = this.f1991b;
        if (iconCompat != null) {
            apg2.mo2262a(iconCompat, (String) null, this.f1994e != 0 ? new String[]{"no_tint"} : new String[0]);
        }
        CharSequence charSequence = this.f1992c;
        if (charSequence != null) {
            apg2.mo2266a(charSequence, (String) null, "title");
        }
        CharSequence charSequence2 = this.f1995f;
        if (charSequence2 != null) {
            apg2.mo2266a(charSequence2, "content_description", new String[0]);
        }
        if (this.f1993d && this.f1996g) {
            apg2.mo2267a("selected");
        }
        int i = this.f1997h;
        if (i != -1) {
            apg2.mo2258a(i, "priority", new String[0]);
        }
        if (this.f2000k) {
            apg.mo2267a("activity");
        }
        return apg2;
    }
}
