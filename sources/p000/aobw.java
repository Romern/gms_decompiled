package p000;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.service.ImageChimeraIntentService;
import java.io.IOException;

/* renamed from: aobw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobw implements qkb {

    /* renamed from: a */
    private final ryz f78138a;

    /* renamed from: b */
    private final Uri f78139b;

    /* renamed from: c */
    private final int f78140c;

    /* renamed from: d */
    private final antk f78141d;

    public aobw(ryz ryz, Uri uri, int i, antk antk) {
        this.f78138a = ryz;
        this.f78139b = uri;
        this.f78140c = i;
        this.f78141d = antk;
    }

    /* renamed from: a */
    private final void m65770a(int i, ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.f78141d.mo42231a(i, (Bundle) null, parcelFileDescriptor);
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e) {
                    Log.e("LoadImageOperation", "Failed close", e);
                }
            }
        } catch (Throwable th) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e2) {
                    Log.e("LoadImageOperation", "Failed close", e2);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antk antk = this.f78141d;
        if (antk != null) {
            antk.mo42231a(8, (Bundle) null, (ParcelFileDescriptor) null);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11594a(qkg qkg) {
        ImageChimeraIntentService imageChimeraIntentService = (ImageChimeraIntentService) qkg;
        Uri uri = this.f78139b;
        int i = this.f78140c;
        if (i != 0) {
            uri = uri.buildUpon().appendQueryParameter("bounding_box", Integer.toString(i)).build();
        }
        AssetFileDescriptor a = this.f78138a.mo25259a(imageChimeraIntentService, uri);
        if (a == null) {
            m65770a(8, null);
        } else {
            m65770a(0, a.getParcelFileDescriptor());
        }
    }
}
