package p000;

import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: adpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adpk extends cazu {

    /* renamed from: b */
    private final cazn f62450b;

    public adpk(cijl cijl, cijl cijl2, cazn cazn) {
        super(cijl2, cbag.m127657a(adpk.class), cijl);
        this.f62450b = cbac.m127643a(cazn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return this.f62450b.mo75201b();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        Uri contentUri = MediaStore.Files.getContentUri("external");
        adro a = adrp.m51071a();
        a.f62578f = 1;
        a.f62575c = contentUri;
        a.f62576d = new String[]{"_id", "media_type"};
        a.f62573a = 0L;
        return bqga.m112775a(((adrq) obj).mo33749a(a.mo33748a()));
    }
}
