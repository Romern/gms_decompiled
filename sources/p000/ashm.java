package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ashm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashm extends asho {

    /* renamed from: a */
    final /* synthetic */ camz f88980a;

    /* renamed from: b */
    final /* synthetic */ camp f88981b;

    public ashm(camp camp, camz camz) {
        this.f88981b = camp;
        this.f88980a = camz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49159a(String str) {
        camp camp = this.f88981b;
        String str2 = this.f88980a.f175314c;
        camo camo = camp.f175308a;
        if (!camt.m126794a(str2)) {
            InputStream a = ((ashz) camo).mo49167a(new ashy("DELETE", null), str2, str);
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e) {
                }
            } else {
                throw new IOException("Unable to delete entry.");
            }
        } else {
            throw new IllegalArgumentException("you must specify an non-empty edit url");
        }
    }
}
