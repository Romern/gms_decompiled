package com.google.android.places.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.userlocation.SemanticLocation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransformSemanticLocationEventIntentOperation extends IntentOperation {
    public TransformSemanticLocationEventIntentOperation() {
        this(new bifp(), new bidk());
    }

    /* renamed from: a */
    private final void m117736a(Intent intent) {
        avwf avwf;
        aela aela;
        if (intent != null) {
            avwf = avwf.m79457a((SemanticLocation) sef.m35067a(intent, "com.google.android.userlocation.extra.previous_location", SemanticLocation.CREATOR), (SemanticLocation) sef.m35067a(intent, "com.google.android.userlocation.extra.current_location", SemanticLocation.CREATOR));
        } else {
            avwf = null;
        }
        if (avwf != null) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("com.google.android.gms.userlocation.SemanticLocationEvent.LEGACY_CALL_INTENT_EXTRA");
            if (pendingIntent != null) {
                boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.userlocation.SemanticLocationEvent.LEGACY_CALL_USE_HIERARCHIES_EXTRA", true);
                String stringExtra = intent.getStringExtra("com.google.android.userlocation.SemanticLocationEvent.LEGACY_CALL_ACCOUNT_NAME_EXTRA");
                if (booleanExtra) {
                    aela = bidd.m101995a(avwf, true);
                } else {
                    aela = bidd.m101995a(avwf, false);
                }
                Intent intent2 = new Intent();
                aela.mo34289a(intent2);
                aela.mo12460c();
                try {
                    bidk.m102023a(this, intent2, pendingIntent);
                } catch (PendingIntent.CanceledException e) {
                    if (Log.isLoggable("Places", 5)) {
                        String valueOf = String.valueOf(e.getMessage());
                        Log.w("Places", valueOf.length() == 0 ? new String("CanceledException when sending intent: ") : "CanceledException when sending intent: ".concat(valueOf));
                    }
                    bifp.m102273a(this, "com.google.android.gms", stringExtra).mo64583a(pendingIntent);
                }
            } else if (Log.isLoggable("Places", 5)) {
                Log.w("Places", "Received intent has no PendingIntent to use - ignoring it");
            }
        } else if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "Received intent has no event to use - ignoring it");
        }
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.places.service.ACTION_SEMANTIC_LOCATION_EVENT".equals(intent.getAction())) {
            m117736a(intent);
        } else if (Log.isLoggable("Places", 6)) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("Places", valueOf.length() == 0 ? new String("Unable to handle intent with action ") : "Unable to handle intent with action ".concat(valueOf));
        }
    }

    public TransformSemanticLocationEventIntentOperation(bifp bifp, bidk bidk) {
    }
}
