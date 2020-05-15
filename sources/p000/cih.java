package p000;

import android.content.res.AssetManager;
import android.net.Uri;

/* renamed from: cih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cih implements cjq {

    /* renamed from: a */
    private final AssetManager f6908a;

    /* renamed from: b */
    private final cie f6909b;

    public cih(AssetManager assetManager, cie cie) {
        this.f6908a = assetManager;
        this.f6909b = cie;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cjp mo3930a(Object obj, int i, int i2, cdk cdk) {
        Uri uri = (Uri) obj;
        return new cjp(new cqm(uri), this.f6909b.mo3928a(this.f6908a, uri.toString().substring(22)));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3931a(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
