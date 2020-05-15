package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ImageAsyncChimeraService extends qkc {

    /* renamed from: i */
    private static final qke f30198i = new qke();

    /* renamed from: a */
    public ryz f30199a;

    public ImageAsyncChimeraService() {
        super("ImageMultiThreadedAsync", f30198i, 500, sne.m35694a(4, 9));
    }

    /* renamed from: a */
    public static void m22583a(Context context, Uri uri, ResultReceiver resultReceiver) {
        f30198i.offer(new ryy(uri, resultReceiver));
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.common.images.ImageAsyncService");
        context.startService(intent);
    }

    public final void onCreate() {
        super.onCreate();
        this.f30199a = ryz.m34694a(this, 5376);
    }
}
