package com.google.android.gms.ads.nonagon.load.service;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.nonagon.util.C0845a;
import java.io.InputStream;

/* renamed from: com.google.android.gms.ads.nonagon.load.service.j */
final /* synthetic */ class C0774j implements bqeh {
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        C0645d.f8973a.execute(new C0845a((InputStream) obj, createPipe[1]));
        return bqga.m112775a(parcelFileDescriptor);
    }
}
