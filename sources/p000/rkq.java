package p000;

import com.google.android.gms.common.Feature;

/* renamed from: rkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rkq extends UnsupportedOperationException {

    /* renamed from: a */
    private final Feature f43191a;

    public rkq(Feature feature) {
        this.f43191a = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f43191a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
