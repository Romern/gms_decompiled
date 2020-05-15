package com.google.android.location.bluesky;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.ActivityTransitionResult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnFootActivityRecognition extends aacn {

    /* renamed from: a */
    public final Context f150685a;

    /* renamed from: b */
    public final bfci f150686b;

    /* renamed from: c */
    public PendingIntent f150687c;

    /* renamed from: d */
    public final rjx f150688d;

    public OnFootActivityRecognition(rjx rjx, Context context, bfci bfci) {
        super("OnFootActivityRecognition");
        this.f150688d = rjx;
        this.f150685a = context;
        this.f150686b = bfci;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent != null && ActivityTransitionResult.m66829a(intent)) {
            this.f150686b.mo61383a(ActivityTransitionResult.m66830b(intent));
        }
    }
}
