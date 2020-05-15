package p000;

import android.net.Uri;
import java.io.IOException;

/* renamed from: bbfa */
final /* synthetic */ class bbfa implements bmxj {

    /* renamed from: a */
    private final bbfc f102527a;

    public bbfa(bbfc bbfc) {
        this.f102527a = bbfc;
    }

    public final Object apply(Object obj) {
        bbfc bbfc = this.f102527a;
        Uri uri = (Uri) obj;
        if (uri != null) {
            try {
                return Long.valueOf(bbfc.f102532c.mo60649e(uri));
            } catch (IOException e) {
                bbev.m87908a(e, "%s: Failed to call mobstore fileSize on uri %s!", "StorageLogger", uri);
            }
        }
        return 0L;
    }
}
