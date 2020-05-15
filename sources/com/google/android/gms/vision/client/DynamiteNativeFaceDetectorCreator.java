package com.google.android.gms.vision.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DynamiteNativeFaceDetectorCreator extends avzi {
    public avzg newFaceDetector$ar$class_merging(vzr vzr, FaceSettingsParcel faceSettingsParcel) {
        Context a = qls.m32403a((Context) vzs.m41641a(vzr), "com.google.android.gms.vision.dynamite");
        if (a != null) {
            avzj asInterface = avzi.asInterface(qls.m32404a(a.getClassLoader(), "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            if (asInterface != null) {
                return asInterface.newFaceDetector$ar$class_merging(vzr, faceSettingsParcel);
            }
            avxz.m79525a("Could not load Chimera native face detector creator.", new Object[0]);
            throw new RemoteException();
        }
        avxz.m79525a("%s could not be loaded.", "com.google.android.gms.vision.dynamite");
        throw new RemoteException();
    }
}
