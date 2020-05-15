package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.ApplicationInformation;

/* renamed from: gic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gic {

    /* renamed from: a */
    public final Bundle f18284a;

    public gic(Bundle bundle) {
        this.f18284a = bundle;
    }

    /* renamed from: a */
    public static gic m13182a(Bundle bundle) {
        sdo.m34959a(bundle);
        return new gic(bundle);
    }

    /* renamed from: b */
    public final ApplicationInformation mo11903b() {
        Parcelable parcelable;
        if (this.f18284a.containsKey("keyApplicationInformationAuthExtrasBundle")) {
            Bundle bundle = this.f18284a.getBundle("keyApplicationInformationAuthExtrasBundle");
            bundle.setClassLoader(ApplicationInformation.class.getClassLoader());
            parcelable = bundle.getParcelable("keyApplicationInformationWrapperBundle");
        } else {
            parcelable = null;
        }
        return (ApplicationInformation) parcelable;
    }

    /* renamed from: c */
    public final String mo11904c() {
        return this.f18284a.getString("keyRemoteApplicationLabelString");
    }

    /* renamed from: d */
    public final boolean mo11905d() {
        return mo11903b() == null;
    }

    /* renamed from: a */
    public final bsoa mo11902a() {
        if (!this.f18284a.containsKey("keyTokenRequestOptionsAuthExtrasBundle")) {
            return null;
        }
        Bundle bundle = this.f18284a.getBundle("keyTokenRequestOptionsAuthExtrasBundle");
        if (!bundle.containsKey("keyTokenRequestOptionsWrapperBundle")) {
            return null;
        }
        try {
            return (bsoa) bxvk.m124016a(bsoa.f146351k, bundle.getByteArray("keyTokenRequestOptionsWrapperBundle"), bxus.m123744c());
        } catch (bxwf e) {
            throw new IllegalStateException(e);
        }
    }
}
