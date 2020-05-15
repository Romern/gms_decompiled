package p000;

import android.content.IntentFilter;
import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$4;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* renamed from: akga */
final /* synthetic */ class akga implements Runnable {

    /* renamed from: a */
    private final akgy f71846a;

    /* renamed from: b */
    private final ajsn f71847b;

    /* renamed from: c */
    private final akbz f71848c;

    public akga(akgy akgy, ajsn ajsn, akbz akbz) {
        this.f71846a = akgy;
        this.f71847b = ajsn;
        this.f71848c = akbz;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akgy.a(java.lang.String, byte[], boolean):void
     arg types: [java.lang.String, byte[], int]
     candidates:
      akgy.a(akdd, ajnv, long):ajnw
      akgy.a(java.io.File, java.io.File, com.google.android.gms.nearby.sharing.FileAttachment):android.net.Uri
      akgy.a(int, int, java.lang.String[]):void
      akgy.a(akbw, java.lang.String, ajud):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, ajud, java.lang.String):void
      akgy.a(java.lang.String, ajud, akbw):void
      akgy.a(java.lang.String, com.google.android.gms.nearby.sharing.ShareTarget, ajud):void
      akgy.a(java.lang.String, byte[], akdd):void
      akgy.a(byte[], akdd, java.lang.String):void
      akcd.a(java.lang.String, ajud, akbw):void
      akcd.a(java.lang.String, com.google.android.gms.nearby.sharing.ShareTarget, ajud):void
      akds.a(java.lang.String, byte[], akdd):void
      akgy.a(java.lang.String, byte[], boolean):void */
    public final void run() {
        int i;
        akgy akgy = this.f71846a;
        ajsn ajsn = this.f71847b;
        akbz akbz = this.f71848c;
        akgy.mo38796g();
        akgy.f71950q.f71636b = new akfr(akgy);
        akgy.mo39414j();
        akgy.mo39419m();
        int a = akgy.f71940g.mo39277a(akgy);
        int i2 = 3;
        if (a != 0) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "b", 951, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to discover over Nearby Connections: %s", ahih.m55828a(a));
            i = 3;
        } else {
            akgy.f71934a.clear();
            akgy.f71959z = new NearbySharingProvider$4(akgy, "nearby");
            ahhd.m55767a(akgy.f71939f, akgy.f71959z, new IntentFilter("com.google.android.gms.nearby.sharing.CERTIFICATES_DOWNLOAD"));
            akgy.f71941h = ajsn;
            akgy.f71944k = akbz.f71573a;
            ScheduledFuture scheduledFuture = akgy.f71958y;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            akgy.f71950q.mo39244b();
            List a2 = akgy.f71950q.mo39240a();
            int size = a2.size();
            for (int i3 = 0; i3 < size; i3++) {
                akcz akcz = (akcz) a2.get(i3);
                akgy.mo39387a(akcz.f71631a, akcz.f71632b, false);
                srn srn = ajvp.f71371a;
                String str = akcz.f71631a;
            }
            akgy.f71956w = SystemClock.uptimeMillis();
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "b", 948, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Successfully started discovery over Nearby Connections");
            i = 2;
        }
        akgy.f71948o.f71350a = ajvg.m59094a();
        long a3 = (long) ajvg.m59094a();
        akgy.f71951r = a3;
        ajvg ajvg = akgy.f71948o;
        int i4 = akbz.f71574b.f71348a;
        bxvd d = ajvh.m59107d(6);
        bxvd da = bvfs.f155910e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfs bvfs = (bvfs) da.f164949b;
        int i5 = bvfs.f155912a | 1;
        bvfs.f155912a = i5;
        bvfs.f155913b = a3;
        bvfs.f155914c = i - 1;
        bvfs.f155912a = i5 | 2;
        if (cfov.f185185a.mo6606a().mo82381e()) {
            if (i4 == 1) {
                i2 = 2;
            } else if (i4 == 2) {
                i2 = 4;
            } else if (i4 != 3) {
                i2 = 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvfs bvfs2 = (bvfs) da.f164949b;
            bvfs2.f155915d = i2 - 1;
            bvfs2.f155912a = 4 | bvfs2.f155912a;
        }
        bvfs bvfs3 = (bvfs) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfs3.getClass();
        bvgd.f155970g = bvfs3;
        bvgd.f155964a |= 64;
        ajvg.mo38957a(new ajva((bvgd) d.mo74062i()));
    }
}
