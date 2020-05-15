package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScreenStateListener$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgqs f150844a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenStateListener$1(bgqs bgqs, String str) {
        super(str);
        this.f150844a = bgqs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        char c;
        if (intent != null && intent.getAction() != null) {
            int i = bgqs.f117305b;
            intent.getAction();
            String action = intent.getAction();
            int hashCode = action.hashCode();
            if (hashCode != -2128145023) {
                if (hashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                    c = 0;
                    if (c == 0) {
                        this.f150844a.f117306a = true;
                        return;
                    } else if (c == 1) {
                        this.f150844a.f117306a = false;
                        return;
                    } else {
                        return;
                    }
                }
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                c = 1;
                if (c == 0) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
        }
    }
}
