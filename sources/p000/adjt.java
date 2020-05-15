package p000;

import android.os.Bundle;
import com.google.android.gms.instantapps.InstantAppIntentData;

/* renamed from: adjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjt extends adfj {

    /* renamed from: b */
    final /* synthetic */ adjv f61949b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adjt(adjv adjv) {
        super("method_getInstantAppIntent");
        this.f61949b = adjv;
    }

    /* renamed from: a */
    public final Bundle mo33418a(adfi adfi, String str, Bundle bundle) {
        adkz adkz = new adkz();
        adkz.mo33627a(1404);
        try {
            InstantAppIntentData a = this.f61949b.mo33593a(adfi, str, bundle, adkz);
            if (a.f79135c == 3 || a.f79134b == null) {
                return null;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("key_instantAppIntent", a.f79134b);
            return bundle2;
        } catch (adfn e) {
            adjv.f61951a.mo33424a(e);
            return null;
        }
    }
}
