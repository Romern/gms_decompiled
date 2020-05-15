package p000;

import android.content.Context;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: aloz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aloz extends aloo {
    public aloz(String str, int i, almp almp, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        super(str, i, almp, avatarReference, parcelableLoadImageOptions, "LoadAvatarByReferenceCp2Focus");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final byte[] mo40621d(Context context) {
        String str;
        String str2;
        AvatarReference avatarReference;
        amig.m62939a();
        if (((Boolean) amgj.f74886a.mo41191a()).booleanValue()) {
            if (this.f73967a.mo46360a()) {
                avatarReference = ameu.m62831c(this.f73967a);
            } else {
                avatarReference = this.f73967a;
            }
            str = avatarReference.f81943e;
            str2 = avatarReference.f81944f;
        } else {
            AvatarReference avatarReference2 = this.f73967a;
            sdo.m34959a(avatarReference2);
            str = ameu.m62834e(avatarReference2.f81939a, avatarReference2.f81940b);
            AvatarReference avatarReference3 = this.f73967a;
            sdo.m34959a(avatarReference3);
            str2 = ameu.m62835f(avatarReference3.f81939a, avatarReference3.f81940b);
        }
        long a = altf.m61750a(context, str, str2);
        if (a >= 0) {
            return altf.m61752a(context, a, !((aloo) this).f73968b.f81930c);
        }
        return null;
    }
}
