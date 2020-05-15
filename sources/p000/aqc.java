package p000;

import android.support.p001v4.graphics.drawable.IconCompat;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;

/* renamed from: aqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqc extends aqf implements aqb {

    /* renamed from: a */
    private CharSequence f1975a;

    /* renamed from: b */
    private CharSequence f1976b;

    /* renamed from: c */
    private apz f1977c;

    /* renamed from: d */
    private IconCompat f1978d;

    public aqc(apg apg, SliceSpec sliceSpec) {
        super(apg, sliceSpec);
    }

    /* renamed from: a */
    public final void mo2292a() {
        this.f1988f.mo2258a(-1, "color", new String[0]);
    }

    /* renamed from: a */
    public final void mo2293a(apx apx) {
        IconCompat iconCompat;
        apz apz;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (this.f1975a == null && (charSequence2 = apx.f1964d) != null) {
            this.f1975a = charSequence2;
        }
        if (this.f1976b == null && (charSequence = apx.f1965e) != null) {
            this.f1976b = charSequence;
        }
        if (this.f1977c == null && (apz = apx.f1963c) != null) {
            this.f1977c = apz;
        }
        if (this.f1978d == null && (iconCompat = apx.f1962b) != null) {
            this.f1978d = iconCompat;
        }
    }

    /* renamed from: b */
    public final void mo2294b() {
        this.f1988f.mo2268b(-1, "millis", "ttl");
    }

    /* renamed from: a */
    public final void mo2295a(apg apg) {
        apg apg2 = new apg(this.f1988f);
        apz apz = this.f1977c;
        if (apz != null) {
            if (this.f1975a == null && apz.mo2288b() != null) {
                this.f1975a = this.f1977c.mo2288b();
            }
            if (this.f1978d == null && this.f1977c.mo2286a() != null) {
                this.f1978d = this.f1977c.mo2286a();
            }
            this.f1977c.mo2287a(apg2);
        }
        CharSequence charSequence = this.f1975a;
        if (charSequence != null) {
            apg2.mo2265a(new SliceItem(charSequence, "text", null, new String[]{"title"}));
        }
        CharSequence charSequence2 = this.f1976b;
        if (charSequence2 != null) {
            apg2.mo2265a(new SliceItem(charSequence2, "text", null, new String[0]));
        }
        IconCompat iconCompat = this.f1978d;
        if (iconCompat != null) {
            apg.mo2262a(iconCompat, (String) null, "title");
        }
        apg.mo2263a(apg2.mo2257a());
    }
}
