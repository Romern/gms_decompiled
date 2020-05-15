package p000;

import android.text.TextUtils;
import java.util.Comparator;

/* renamed from: bjtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtj {

    /* renamed from: a */
    public static final char[] f123272a = {'R'};

    /* renamed from: b */
    static final Comparator f123273b = new bjti();

    /* renamed from: c */
    public final String f123274c;

    /* renamed from: d */
    public final btwp f123275d;

    /* renamed from: e */
    public final CharSequence f123276e;

    /* renamed from: f */
    public final String f123277f;

    /* renamed from: g */
    public final String f123278g;

    public bjtj(String str, btwp btwp, CharSequence charSequence, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f123274c = str;
            this.f123275d = btwp;
            this.f123276e = charSequence;
            this.f123277f = str2;
            this.f123278g = null;
            return;
        }
        throw new IllegalArgumentException("source name should not be empty");
    }

    public bjtj(String str, CharSequence charSequence, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            this.f123274c = str;
            this.f123275d = null;
            this.f123276e = charSequence;
            this.f123277f = str2;
            this.f123278g = str3;
            return;
        }
        throw new IllegalArgumentException("source name should not be empty");
    }
}
