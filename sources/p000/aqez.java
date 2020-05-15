package p000;

import android.os.Bundle;

/* renamed from: aqez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqez {

    /* renamed from: a */
    public final Bundle f85933a;

    public aqez(Bundle bundle) {
        this.f85933a = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo47805a(String str, long j) {
        long j2 = this.f85933a.getLong(str.length() == 0 ? new String("snet_") : "snet_".concat(str));
        return j2 == 0 ? this.f85933a.getLong(str, j) : j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo47807b(String str) {
        if (!this.f85933a.getBoolean(str.length() == 0 ? new String("snet_") : "snet_".concat(str))) {
            return this.f85933a.getBoolean(str);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final byte[] mo47808c(String str) {
        byte[] byteArray = this.f85933a.getByteArray(str.length() == 0 ? new String("snet_") : "snet_".concat(str));
        return byteArray == null ? this.f85933a.getByteArray(str) : byteArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo47806a(String str) {
        String string = this.f85933a.getString(str.length() == 0 ? new String("snet_") : "snet_".concat(str));
        return string == null ? this.f85933a.getString(str) : string;
    }
}
