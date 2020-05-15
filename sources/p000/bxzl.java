package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* renamed from: bxzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxzl {
    /* renamed from: a */
    public static bxxc m124566a(Bundle bundle, String str, bxxc bxxc, bxus bxus) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        try {
            Parcelable parcelable = bundle.getParcelable(str);
            if (parcelable instanceof Bundle) {
                Bundle bundle2 = (Bundle) parcelable;
                bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
            } else {
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
            }
            return m124567a(protoParsers$InternalDontUse, bxxc, bxus);
        } catch (bxwf e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static bxxc m124567a(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, bxxc bxxc, bxus bxus) {
        bxxc j = bxxc.mo74067j();
        if (protoParsers$InternalDontUse.f191793b == null) {
            protoParsers$InternalDontUse.f191793b = j.mo73645aM().mo73624a(protoParsers$InternalDontUse.f191792a, bxus).mo74062i();
        }
        return protoParsers$InternalDontUse.f191793b;
    }

    /* renamed from: a */
    public static void m124568a(Bundle bundle, String str, bxxc bxxc) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, bxxc));
        bundle.putParcelable(str, bundle2);
    }
}
