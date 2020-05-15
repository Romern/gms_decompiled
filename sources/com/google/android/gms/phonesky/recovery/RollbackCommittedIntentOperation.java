package com.google.android.gms.phonesky.recovery;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RollbackCommittedIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final BlockingQueue f82161a = new LinkedBlockingQueue();

    /* renamed from: a */
    public static Intent m68269a() {
        try {
            return (Intent) f82161a.poll(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            return null;
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (!"android.intent.action.ROLLBACK_COMMITTED".equals(intent.getAction())) {
            anjb.m64557b("Invalid rollback committed intent", new Object[0]);
        } else {
            f82161a.add(intent);
        }
    }

    /* renamed from: a */
    public static IntentSender m68270a(Context context) {
        return IntentOperation.getPendingIntent(context, RollbackCommittedIntentOperation.class, new Intent("android.intent.action.ROLLBACK_COMMITTED"), 0, 0).getIntentSender();
    }
}
