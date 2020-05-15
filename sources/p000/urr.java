package p000;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: urr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class urr extends twz {

    /* renamed from: a */
    private final MetadataBundle f48577a;

    public urr(MetadataBundle metadataBundle) {
        this.f48577a = metadataBundle;
    }

    /* renamed from: a */
    public final Object mo26855a(uvy uvy) {
        return this.f48577a.mo18269a(uvy);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new urr(this.f48577a.mo18271b());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48577a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Metadata [mImpl=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
