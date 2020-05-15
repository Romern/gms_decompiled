package p000;

import android.text.TextUtils;
import java.net.InetSocketAddress;
import java.util.Arrays;

/* renamed from: pib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pib {

    /* renamed from: a */
    public String f39180a;

    /* renamed from: b */
    public String f39181b;

    /* renamed from: c */
    public boolean f39182c;

    /* renamed from: d */
    public InetSocketAddress f39183d;

    /* renamed from: e */
    public InetSocketAddress f39184e;

    /* renamed from: f */
    public boolean f39185f;

    /* renamed from: g */
    public boolean f39186g;

    /* renamed from: h */
    public boolean f39187h;

    /* renamed from: i */
    public boolean f39188i;

    /* renamed from: j */
    public boolean f39189j;

    /* renamed from: k */
    public bpes f39190k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pib) {
            pib pib = (pib) obj;
            return TextUtils.equals(this.f39180a, pib.f39180a) && TextUtils.equals(this.f39181b, pib.f39181b) && this.f39182c == pib.f39182c && sdg.m34949a(this.f39183d, pib.f39183d) && sdg.m34949a(this.f39184e, pib.f39184e) && this.f39185f == pib.f39185f && this.f39186g == pib.f39186g && this.f39187h == pib.f39187h && this.f39188i == pib.f39188i && this.f39189j == pib.f39189j && sdg.m34949a(this.f39190k, pib.f39190k);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39180a, this.f39181b, Boolean.valueOf(this.f39182c), this.f39183d, this.f39184e, Boolean.valueOf(this.f39185f), Boolean.valueOf(this.f39186g), Boolean.valueOf(this.f39187h), Boolean.valueOf(this.f39188i), Boolean.valueOf(this.f39189j), this.f39190k});
    }
}
