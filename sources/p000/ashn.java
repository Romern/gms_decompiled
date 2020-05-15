package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ashn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashn extends asho {

    /* renamed from: a */
    final /* synthetic */ String f88982a;

    /* renamed from: b */
    final /* synthetic */ camw[] f88983b;

    /* renamed from: c */
    final /* synthetic */ camp f88984c;

    public ashn(camp camp, camw[] camwArr, String str) {
        this.f88984c = camp;
        this.f88983b = camwArr;
        this.f88982a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49159a(String str) {
        camw[] camwArr = this.f88983b;
        camp camp = this.f88984c;
        String str2 = this.f88982a;
        InputStream a = ((ashz) camp.f175308a).mo49167a(new ashw(), str2, str);
        if (a != null) {
            camwArr[0] = canb.m126813a(camz.class, a);
            return;
        }
        throw new IOException("Unable to access feed.");
    }
}
