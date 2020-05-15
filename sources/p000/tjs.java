package p000;

import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.Arrays;

/* renamed from: tjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tjs {

    /* renamed from: a */
    public final int f46212a;

    /* renamed from: b */
    public final TimeFilterImpl f46213b;

    /* renamed from: c */
    public final KeyFilterImpl f46214c;

    public tjs(int i, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
        this.f46212a = i;
        sdo.m34959a(timeFilterImpl);
        this.f46213b = timeFilterImpl;
        this.f46214c = keyFilterImpl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tjs) {
            tjs tjs = (tjs) obj;
            if (this.f46212a == tjs.f46212a && this.f46213b.equals(tjs.f46213b)) {
                KeyFilterImpl keyFilterImpl = this.f46214c;
                return keyFilterImpl == null || keyFilterImpl.equals(tjs.f46214c);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46212a), this.f46213b, this.f46214c});
    }
}
