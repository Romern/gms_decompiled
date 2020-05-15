package p000;

import android.text.TextUtils;

/* renamed from: ancr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ancr {

    /* renamed from: a */
    private final StringBuilder f76641a = new StringBuilder();

    /* renamed from: b */
    private boolean f76642b = false;

    /* renamed from: a */
    public final void mo41707a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f76641a.append(str);
        }
    }

    /* renamed from: b */
    public final void mo41708b(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f76642b) {
                this.f76641a.append(" AND ");
            }
            this.f76641a.append(str);
            this.f76642b = true;
        }
    }

    public final String toString() {
        return this.f76641a.toString();
    }
}
