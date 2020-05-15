package p000;

import android.graphics.Bitmap;
import com.google.android.gms.common.api.Status;

/* renamed from: avgu */
final /* synthetic */ class avgu implements rkl {

    /* renamed from: a */
    private final avgw f93158a;

    /* renamed from: b */
    private final Bitmap f93159b;

    public avgu(avgw avgw, Bitmap bitmap) {
        this.f93158a = avgw;
        this.f93159b = bitmap;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        Bitmap bitmap;
        avgw avgw = this.f93158a;
        Bitmap bitmap2 = this.f93159b;
        allh allh = (allh) rkk;
        try {
            Status bo = allh.mo7183bo();
            if (bo.mo17710c()) {
                bitmap = rzl.m34706a(alls.m61238a(allh.mo40486b()));
            } else {
                bnsl bnsl = (bnsl) avgw.f93163a.mo68388c();
                bnsl.mo68432a("avgw", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68413a("Error (%d) loading owner avatar: %s", bo.f30115i, (Object) bo.f30116j);
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap2 = bitmap;
            }
            avgw.f93164b.setImageBitmap(bitmap2);
        } finally {
            allh.mo12460c();
        }
    }
}
