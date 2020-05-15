package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ImageManager$ImageReceiver extends ResultReceiver {
    /* access modifiers changed from: private */
    public final ArrayList mImageRequestList = new ArrayList();
    private final Uri mUri;
    final /* synthetic */ rzd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ImageManager$ImageReceiver(rzd rzd, Uri uri) {
        super(new adzt(Looper.getMainLooper()));
        this.this$0 = rzd;
        this.mUri = uri;
    }

    public void addImageRequest(rzf rzf) {
        rzz.m34728a("ImageReceiver.addImageRequest() must be called in the main thread");
        this.mImageRequestList.add(rzf);
    }

    public void onReceiveResult(int i, Bundle bundle) {
        rzd rzd = this.this$0;
        int i2 = rzd.f43878f;
        ExecutorService executorService = rzd.f43881c;
        new rzb(rzd, this.mUri, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor"));
        throw null;
    }

    public void removeImageRequest(rzf rzf) {
        rzz.m34728a("ImageReceiver.removeImageRequest() must be called in the main thread");
        this.mImageRequestList.remove(rzf);
    }

    public void sendBroadcast() {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("com.google.android.gms.extras.uri", this.mUri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        rzd rzd = this.this$0;
        int i = rzd.f43878f;
        Context context = rzd.f43879a;
        throw null;
    }
}
