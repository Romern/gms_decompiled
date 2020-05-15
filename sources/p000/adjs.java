package p000;

import android.os.Bundle;
import com.google.android.gms.instantapps.routing.InstantAppsChimeraContentProvider;
import java.io.IOException;

/* renamed from: adjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjs extends adfj {

    /* renamed from: b */
    final /* synthetic */ InstantAppsChimeraContentProvider f61948b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adjs(InstantAppsChimeraContentProvider instantAppsChimeraContentProvider) {
        super("getDomainFilterPackageMetadata");
        this.f61948b = instantAppsChimeraContentProvider;
    }

    /* renamed from: a */
    public final Bundle mo33418a(adfi adfi, String str, Bundle bundle) {
        String string;
        if (!this.f61948b.mo43455a(adfi.f61555a) || (string = bundle.getString("packageName")) == null) {
            return null;
        }
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putByteArray("result", this.f61948b.f79230e.mo33566b(string));
            return bundle2;
        } catch (IOException e) {
            adfu.m50331a(this.f61948b.getContext(), e.getMessage(), e, InstantAppsChimeraContentProvider.f79225a);
            return null;
        }
    }
}
