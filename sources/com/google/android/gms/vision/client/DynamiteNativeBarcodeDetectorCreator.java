package com.google.android.gms.vision.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DynamiteNativeBarcodeDetectorCreator extends avyy {
    public avyw newBarcodeDetector$ar$class_merging(vzr vzr, BarcodeDetectorOptions barcodeDetectorOptions) {
        Context a = qls.m32403a((Context) vzs.m41641a(vzr), "com.google.android.gms.vision.dynamite");
        if (a != null) {
            avyz asInterface = avyy.asInterface(qls.m32404a(a.getClassLoader(), "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"));
            if (asInterface != null) {
                return asInterface.newBarcodeDetector$ar$class_merging(vzr, barcodeDetectorOptions);
            }
            avxz.m79525a("Could not load Chimera native barcode detector creator.", new Object[0]);
            throw new RemoteException();
        }
        avxz.m79525a("%s could not be loaded.", "com.google.android.gms.vision.dynamite");
        throw new RemoteException();
    }
}
