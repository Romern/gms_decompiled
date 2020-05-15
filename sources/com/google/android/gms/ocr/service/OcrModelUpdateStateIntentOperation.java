package com.google.android.gms.ocr.service;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.download.DownloadDetails;
import java.io.File;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OcrModelUpdateStateIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f81343a = ssv.m36267a("com.google.android.gms.ocr");

    public OcrModelUpdateStateIntentOperation() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44749a(DownloadDetails downloadDetails) {
        rkb rkb = rxl.m34617a(getApplicationContext()).f43165D;
        ryg ryg = new ryg(rkb, downloadDetails);
        rkb.mo24795b(ryg);
        sdl.m34954a(ryg);
    }

    public OcrModelUpdateStateIntentOperation(Context context) {
        attachBaseContext(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.ocr.service.OcrModelUpdateStateIntentOperation, java.lang.String, boolean]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6 A[SYNTHETIC, Splitter:B:31:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00cf A[SYNTHETIC] */
    public final void onHandleIntent(Intent intent) {
        int i;
        int i2;
        boolean z;
        String str;
        String action = intent.getAction();
        if ("com.google.android.gms.ocr.MODEL_UPDATE_ACTION".equals(action) || "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || (("com.google.android.gms.phenotype.COMMITTED".equals(action) || f81343a.equals(action)) && "com.google.android.gms.ocr".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
            akua akua = new akua();
            boolean z2 = akua.f72820b;
            boolean d = sre.m36084d(this);
            akut akut = new akut(Build.VERSION.SDK_INT, getPackageManager());
            int i3 = akut.f72916b;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Build version: ");
            sb.append(i3);
            sb.toString();
            List list = akut.f72915a;
            String valueOf = String.valueOf(Build.CPU_ABI);
            if (valueOf.length() == 0) {
                new String("CPU_ABI: ");
            } else {
                "CPU_ABI: ".concat(valueOf);
            }
            String valueOf2 = String.valueOf(Build.CPU_ABI2);
            if (valueOf2.length() == 0) {
                new String("CPU_ABI2: ");
            } else {
                "CPU_ABI2: ".concat(valueOf2);
            }
            if (list.contains(Build.CPU_ABI)) {
                i = 0;
                while (true) {
                    i2 = Camera.getNumberOfCameras();
                    if (i < i2) {
                    }
                    i++;
                }
            } else if (!list.contains(Build.CPU_ABI2)) {
                Log.w("PrereqChecker", String.format("CPU ABIs [%s, %s] are not supported.", Build.CPU_ABI, Build.CPU_ABI2));
                z = false;
            } else {
                i = 0;
                while (true) {
                    try {
                        i2 = Camera.getNumberOfCameras();
                    } catch (RuntimeException e) {
                        Log.e("PrereqChecker", "Exception getting camera count", e);
                        akut.m60519a(e);
                        i2 = 0;
                    }
                    if (i < i2) {
                        Log.w("PrereqChecker", "No rear-facing camera detected.");
                        z = false;
                        break;
                    }
                    try {
                        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                        Camera.getCameraInfo(i, cameraInfo);
                        if (cameraInfo.facing != 0) {
                            str = "forward-";
                        } else {
                            str = "rear-";
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + 39);
                        sb2.append("Camera #");
                        sb2.append(i);
                        sb2.append(" is a ");
                        sb2.append(str);
                        sb2.append("facing camera.");
                        sb2.toString();
                        if (cameraInfo.facing == 0) {
                            z = akut.f72917c.hasSystemFeature("android.hardware.screen.portrait");
                        } else {
                            i++;
                        }
                    } catch (RuntimeException e2) {
                        StringBuilder sb3 = new StringBuilder(50);
                        sb3.append("Unable to query camera info for camera ");
                        sb3.append(i);
                        Log.e("PrereqChecker", sb3.toString(), e2);
                        akut.m60519a(e2);
                    }
                }
            }
            boolean z3 = !z2 ? false : !d && z;
            StringBuilder sb4 = new StringBuilder(96);
            sb4.append("Updating ocr activity enabled=");
            sb4.append(z3);
            sb4.append(" (phenotypeFlag=");
            sb4.append(z2);
            sb4.append(", lowRamDevice=");
            sb4.append(d);
            sb4.append(", prereqCheck=");
            sb4.append(z);
            sb4.append(")");
            Log.i("OcrModelUpStIntentOp", sb4.toString());
            spn.m35856a((Context) this, "com.google.android.gms.ocr.SecuredCreditCardOcrActivity", z3);
            spn.m35856a((Context) this, "com.google.android.gms.ocr.CardCaptureActivity", z3);
            if (z3 && cfqn.f185465a.mo6606a().mo82529a()) {
                z3 = new avzu(this).mo51763a().mo51712b();
            }
            spn.m35856a((Context) this, "com.google.android.gms.ocr.GiftCardOcrActivity", z3);
            if (akua.f72820b) {
                if (akua.f72821c) {
                    mo44749a(aktw.f72789a);
                }
                if (akua.f72822d) {
                    int i4 = akua.f72823e;
                    if (i4 == 0) {
                        mo44749a(aktw.f72790b);
                    } else if (i4 == 1 || i4 == 2 || i4 == 3) {
                        mo44749a(aktw.f72791c);
                    } else {
                        StringBuilder sb5 = new StringBuilder(39);
                        sb5.append("Unknown optimization level: ");
                        sb5.append(i4);
                        throw new IllegalStateException(sb5.toString());
                    }
                }
                if (akua.f72824f && akua.f72827i) {
                    Log.i("OcrModelUpStIntentOp", "Downloading text recognizer");
                    sendBroadcast(new Intent("com.google.android.gms.vision.DEPENDENCY").setPackage("com.google.android.gms").putExtra("com.google.android.gms.vision.DEPENDENCIES", "ocr"));
                }
            }
            File[] listFiles = new File(getApplicationContext().getFilesDir(), "commerce_ocr").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    String name = file.getName();
                    if (!aktw.f72789a.f30175a.equals(name) && !aktw.f72790b.f30175a.equals(name)) {
                        String valueOf3 = String.valueOf(file.getName());
                        Log.i("OcrModelUpStIntentOp", valueOf3.length() == 0 ? new String("Deleting ") : "Deleting ".concat(valueOf3));
                        String name2 = file.getName();
                        rkb rkb = rxl.m34617a(getApplicationContext()).f43165D;
                        ryh ryh = new ryh(rkb, name2);
                        rkb.mo24795b(ryh);
                        sdl.m34954a(ryh);
                        file.delete();
                    }
                }
            }
        }
    }
}
