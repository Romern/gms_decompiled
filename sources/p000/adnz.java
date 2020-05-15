package p000;

import android.database.Cursor;
import android.provider.MediaStore;

/* renamed from: adnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adnz {
    /* renamed from: a */
    public static bqgg m50884a(adrl adrl, adrf adrf, int i, int i2, adqo adqo) {
        adrr adrr = null;
        if (i == 10) {
            adro a = adrp.m51071a();
            a.f62578f = 1;
            a.f62573a = 0L;
            a.f62575c = MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI;
            a.f62576d = adrl.f62565a;
            Cursor a2 = adrl.f62568d.mo33749a(a.mo33748a());
            if (a2 != null) {
                adrr = new adrs(a2);
            }
        } else if (i != 11) {
            adro a3 = adrp.m51071a();
            a3.f62578f = 1;
            a3.f62573a = 0L;
            a3.f62575c = MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI;
            a3.f62576d = adrl.f62566b;
            Cursor a4 = adrl.f62568d.mo33749a(a3.mo33748a());
            if (a4 != null) {
                adrr = new adrv(a4);
            }
        } else {
            adro a5 = adrp.m51071a();
            a5.f62578f = 1;
            a5.f62573a = 0L;
            a5.f62575c = MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI;
            a5.f62576d = adrl.f62567c;
            Cursor a6 = adrl.f62568d.mo33749a(a5.mo33748a());
            if (a6 != null) {
                adrr = new adrt(a6);
            }
        }
        if (adrr == null) {
            return bqga.m112775a((Object) false);
        }
        try {
            adqt adqt = new adqt(i2);
            adqt.mo33729c();
            adqo.mo33709a(adqt);
            bqgg a7 = adrf.mo33737a(adrr, adqt);
            adrr.close();
            return a7;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
