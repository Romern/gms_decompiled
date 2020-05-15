package p000;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.images.ImageAsyncChimeraService;
import java.io.IOException;

/* renamed from: ryy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryy implements qkb {

    /* renamed from: a */
    private final Uri f43869a;

    /* renamed from: b */
    private final ResultReceiver f43870b;

    public ryy(Uri uri, ResultReceiver resultReceiver) {
        this.f43869a = uri;
        this.f43870b = resultReceiver;
    }

    /* renamed from: a */
    public final void mo25258a(ParcelFileDescriptor parcelFileDescriptor) {
        if (this.f43870b != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.google.android.gms.extra.fileDescriptor", parcelFileDescriptor);
            this.f43870b.send(0, bundle);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11594a(qkg qkg) {
        ImageAsyncChimeraService imageAsyncChimeraService = (ImageAsyncChimeraService) qkg;
        AssetFileDescriptor a = imageAsyncChimeraService.f30199a.mo25259a(imageAsyncChimeraService, this.f43869a);
        if (a == null) {
            Log.e("ImageMultiThreadedAsync", "Failed LoadImageOperation");
            mo25258a((ParcelFileDescriptor) null);
        } else {
            mo25258a(a.getParcelFileDescriptor());
        }
        if (a != null) {
            try {
                a.close();
            } catch (IOException e) {
                Log.e("ImageMultiThreadedAsync", "Failed to close file", e);
            }
        }
    }
}
