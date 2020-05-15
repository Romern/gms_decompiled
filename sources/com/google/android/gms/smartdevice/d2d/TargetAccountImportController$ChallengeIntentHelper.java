package com.google.android.gms.smartdevice.d2d;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TargetAccountImportController$ChallengeIntentHelper extends ResultReceiver {

    /* renamed from: a */
    public final Context f107930a;

    /* renamed from: b */
    public final Queue f107931b = new ArrayDeque();

    /* renamed from: c */
    public final arqm f107932c;

    /* renamed from: d */
    public final ardz f107933d;

    /* renamed from: e */
    public boolean f107934e;

    public TargetAccountImportController$ChallengeIntentHelper(Context context, Handler handler, arqm arqm, ardz ardz) {
        super(handler);
        this.f107930a = context;
        this.f107932c = arqm;
        this.f107933d = ardz;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        ardy.f87480a.mo25409a("Received result from challenge %d", Integer.valueOf(i));
        PendingIntent pendingIntent = (PendingIntent) this.f107931b.poll();
        if (pendingIntent == null) {
            this.f107932c.mo48750a();
            this.f107934e = false;
            return;
        }
        this.f107933d.mo48455a(pendingIntent);
    }
}
