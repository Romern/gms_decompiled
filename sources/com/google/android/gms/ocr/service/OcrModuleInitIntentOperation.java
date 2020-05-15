package com.google.android.gms.ocr.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OcrModuleInitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2 = i & 8;
        if ((i & 4) != 0 || i2 != 0) {
            startService(IntentOperation.getStartIntent(this, OcrModelUpdateStateIntentOperation.class, "com.google.android.gms.ocr.MODEL_UPDATE_ACTION"));
        }
    }
}
