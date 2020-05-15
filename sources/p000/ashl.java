package p000;

import android.net.http.AndroidHttpClient;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* renamed from: ashl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashl extends asho {

    /* renamed from: a */
    final /* synthetic */ camz f88978a;

    /* renamed from: b */
    final /* synthetic */ camp f88979b;

    public ashl(camp camp, camz camz) {
        this.f88979b = camp;
        this.f88978a = camz;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* renamed from: a */
    public final void mo49159a(String str) {
        camp camp = this.f88979b;
        camz camz = this.f88978a;
        if (camz instanceof camz) {
            canc canc = new canc(camz);
            camo camo = camp.f175308a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                canc.mo74679a(byteArrayOutputStream);
                ashz ashz = (ashz) camo;
                AbstractHttpEntity compressedEntity = AndroidHttpClient.getCompressedEntity(byteArrayOutputStream.toByteArray(), ashz.f88999a);
                compressedEntity.setContentType("application/atom+xml");
                camw camw = null;
                InputStream a = ashz.mo49167a(new ashy(null, compressedEntity), "https://android.clients.google.com/gsync/sub", str);
                if (a != null) {
                    try {
                        camw = canb.m126813a(camz.getClass(), a);
                        try {
                            camw.mo74677f();
                            if (camw != null) {
                                camw.mo74675d();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (camw != null) {
                                camw.mo74675d();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (camw != null) {
                        }
                        throw th;
                    }
                } else {
                    throw new IOException("Unable to create entry.");
                }
            } catch (IOException e) {
                Log.e("GDataClient", "Unable to serialize entry.", e);
                throw e;
            } catch (IllegalArgumentException e2) {
                throw new camv("Unable to serialize entry: ", e2);
            }
        } else {
            throw new IllegalArgumentException("Expected SubscribedFeedsEntry!");
        }
    }
}
