package p000;

import android.os.Bundle;
import com.google.android.gms.instantapps.InstantAppIntentData;

/* renamed from: adju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adju extends adfj {

    /* renamed from: b */
    final /* synthetic */ adjv f61950b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adju(adjv adjv) {
        super("method_getInstantAppIntentData");
        this.f61950b = adjv;
    }

    /* renamed from: a */
    public final Bundle mo33418a(adfi adfi, String str, Bundle bundle) {
        Bundle bundle2;
        adkz adkz = new adkz();
        adkz.mo33627a(1404);
        try {
            InstantAppIntentData a = this.f61950b.mo33593a(adfi, str, bundle, adkz);
            if (a.f79135c == 1) {
                if (a.f79134b == null) {
                    return null;
                }
            }
            bundle2 = new Bundle();
            if (bundle != null) {
                if (bundle.getBoolean("key_preferParcelableIntentData")) {
                    bundle2.putParcelable("key_instantAppIntentDataParcelable", a);
                }
            }
            bundle2.putByteArray("key_instantAppIntentData", sef.m35074a(a));
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class) {
                adjv.f61951a.mo33427b(e, "Ignoring extra that could not be marshalled.", new Object[0]);
            } else {
                throw e;
            }
        } catch (adfn e2) {
            adjv.f61951a.mo33424a(e2);
            return null;
        }
        return bundle2;
    }
}
