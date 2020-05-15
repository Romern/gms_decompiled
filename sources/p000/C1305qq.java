package p000;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: qq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1305qq {

    /* renamed from: a */
    private final AccessibilityRecord f26882a;

    @Deprecated
    public C1305qq(Object obj) {
        this.f26882a = (AccessibilityRecord) obj;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo15795a(View view) {
        this.f26882a.setSource(view);
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1305qq)) {
            return false;
        }
        C1305qq qqVar = (C1305qq) obj;
        AccessibilityRecord accessibilityRecord = this.f26882a;
        if (accessibilityRecord == null) {
            if (qqVar.f26882a != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(qqVar.f26882a)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f26882a;
        if (accessibilityRecord != null) {
            return accessibilityRecord.hashCode();
        }
        return 0;
    }
}
