package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: zzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzc extends aaab {

    /* renamed from: a */
    public static final FontFetchResult f56240a = FontFetchResult.m23827a(Status.f30109c);

    /* renamed from: b */
    public static final FontFetchResult f56241b = FontFetchResult.m23827a(Status.f30111e);

    /* renamed from: c */
    public final FontMatchSpec f56242c;

    /* renamed from: d */
    public final zyc f56243d;

    /* renamed from: e */
    private final zyn f56244e;

    /* renamed from: f */
    private final String f56245f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public zzc(zyc zyc, FontMatchSpec fontMatchSpec, zyn zyn, String str) {
        super(132, "GetFont");
        sdo.checkIfNull(zyc, "callback");
        this.f56243d = zyc;
        sdo.checkIfNull(fontMatchSpec, "fontMatchSpec");
        this.f56242c = fontMatchSpec;
        sdo.checkIfNull(zyn, "server");
        this.f56244e = zyn;
        sdo.checkIfNull((Object) str, (Object) "requestingPackage");
        this.f56245f = str;
        zyh.m46683c("GetFontOperation", "ctor; requestingPackage=%s", str);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        zyh.m46682b("GetFontOperation", "Attempting to fetch %s", this.f56242c);
        bqgg a = this.f56244e.mo31600a(this.f56242c, this.f56245f);
        a.mo741a(new zzb(this, a), zzi.f56267a.mo31624b());
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        zyh.m46680a("GetFontOperation", "%s failed: %s", this.f56242c, status);
        try {
            this.f56243d.mo31584a(FontFetchResult.m23827a(status));
        } catch (RemoteException e) {
            zyh.m46680a("GetFontOperation", "Lost remote: %s", e.getMessage());
        }
    }
}
