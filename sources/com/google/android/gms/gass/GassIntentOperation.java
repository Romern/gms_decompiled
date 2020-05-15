package com.google.android.gms.gass;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GassIntentOperation extends IntentOperation {

    /* renamed from: a */
    protected static final String f32751a = GassIntentOperation.class.getSimpleName();

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                aaip aaip = (aaip) GeneratedMessageLite.m124014a(aaip.f28209d, intent.getExtras().getByteArray("IntentParameter"));
                aahl a = aahm.m21261a(aaip);
                if (a == null) {
                    Log.w(f32751a, "Failed to create task");
                } else {
                    a.mo16868a(this, aaip);
                }
            } catch (IOException e) {
                Log.w(f32751a, "Failed to parse task info");
            }
        } else {
            Log.w(f32751a, "Intent cannot be null.");
        }
    }
}
