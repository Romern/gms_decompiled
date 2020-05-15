package p000;

import com.google.android.ulr.FeatureIdProto;

/* renamed from: bjcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcp {
    /* renamed from: a */
    public static byel m103199a(FeatureIdProto featureIdProto) {
        if (featureIdProto == null) {
            return null;
        }
        bxvd da = byel.f165914c.mo74144da();
        if (((String) featureIdProto.f44540b.get("cellId")) != null) {
            throw new IllegalArgumentException("Json2LiteBadNotNull location.unified.FeatureIdProto.cell_id");
        } else if (((String) featureIdProto.f44540b.get("fprint")) == null) {
            return (byel) da.mo74062i();
        } else {
            throw new IllegalArgumentException("Json2LiteBadNotNull location.unified.FeatureIdProto.fprint");
        }
    }
}
