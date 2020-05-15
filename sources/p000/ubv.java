package p000;

/* renamed from: ubv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ubv implements bkmd {

    /* renamed from: a */
    final /* synthetic */ ubw f47195a;

    public ubv(ubw ubw) {
        this.f47195a = ubw;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ubk.a(com.google.android.gms.drive.DriveId, boolean):com.google.android.gms.drive.metadata.internal.MetadataBundle
     arg types: [com.google.android.gms.drive.DriveId, int]
     candidates:
      ubk.a(boolean, java.lang.String):uaw
      ubk.a(com.google.android.gms.drive.DriveId, ufx):uga
      ubk.a(uey, com.google.android.gms.drive.DriveId):ujx
      ubk.a(com.google.android.gms.drive.DriveId, java.lang.Iterable):void
      ubk.a(com.google.android.gms.drive.DriveId, java.lang.String):void
      ubk.a(vcy, com.google.android.gms.drive.DriveId):void
      ubk.a(com.google.android.gms.drive.DriveId, boolean):com.google.android.gms.drive.metadata.internal.MetadataBundle */
    /* renamed from: a */
    public final void mo27170a(bkwz bkwz) {
        try {
            ubw ubw = this.f47195a;
            boolean z = true;
            ubw.f47198c.mo27071a(ubw.f47200e.f49249a, true);
            vhs vhs = this.f47195a.f47201f;
            if (vhs != null) {
                vif vif = new vif(vhs);
                if (bkwz != bkwz.READ_ONLY) {
                    z = false;
                }
                vif.f49325b = z;
                this.f47195a.f47197b.mo16658a(vif);
            }
        } catch (aaaj e) {
        }
    }
}
