package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeepStillListener$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgpi f150840a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeepStillListener$1(bgpi bgpi, String str) {
        super(str);
        this.f150840a = bgpi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038 A[ADDED_TO_REGION] */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        char c;
        if (intent != null && intent.getAction() != null) {
            int i = bgpi.f117196a;
            intent.getAction();
            String action = intent.getAction();
            int hashCode = action.hashCode();
            if (hashCode != 702756315) {
                if (hashCode == 1729471458 && action.equals("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED")) {
                    c = 1;
                    if (c != 0 || c == 1) {
                        this.f150840a.f117474g.mo63137a();
                    }
                    return;
                }
            } else if (action.equals("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED")) {
                c = 0;
                if (c != 0) {
                }
                this.f150840a.f117474g.mo63137a();
            }
            c = 65535;
            if (c != 0) {
            }
            this.f150840a.f117474g.mo63137a();
        }
    }
}
