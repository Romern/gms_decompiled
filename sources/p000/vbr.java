package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: vbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbr {

    /* renamed from: a */
    public final int f48960a;

    /* renamed from: b */
    public final Exception f48961b;

    /* renamed from: c */
    public final String f48962c;

    /* renamed from: d */
    public final vkw f48963d;

    public vbr(int i, vkw vkw, Exception exc, String str) {
        boolean z;
        boolean z2 = true;
        if (exc != null) {
            if (vkw != null) {
                z = false;
            } else {
                z = str == null;
            }
            sdo.m34974b(z);
        }
        if (vkw != null) {
            if (exc != null) {
                z2 = false;
            } else if (str != null) {
                z2 = false;
            }
            sdo.m34974b(z2);
        }
        this.f48960a = i;
        this.f48963d = vkw;
        this.f48961b = exc;
        this.f48962c = str;
    }

    /* renamed from: a */
    public final boolean mo28203a() {
        return this.f48963d == null && this.f48961b == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            vbr vbr = (vbr) obj;
            return this.f48960a == vbr.f48960a && sdg.m34949a(this.f48963d, vbr.f48963d) && sdg.m34949a(this.f48961b, vbr.f48961b) && sdg.m34949a(this.f48962c, vbr.f48962c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f48960a), this.f48963d, this.f48961b, this.f48962c});
    }

    public final String toString() {
        return String.format(Locale.US, "ResultsQueueItem[id=%d, resultsPage=%s, e=%s, nextPageToken=%s", Integer.valueOf(this.f48960a), this.f48963d, this.f48961b, this.f48962c);
    }
}
