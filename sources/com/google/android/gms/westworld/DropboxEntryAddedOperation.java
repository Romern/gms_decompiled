package com.google.android.gms.westworld;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DropboxEntryAddedOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        rjx rjx;
        if (!aykg.m84157a()) {
            rpr b = rpr.m34216b();
            bymq bymq = null;
            if (chpz.f188967a.mo6606a().mo85513h()) {
                SharedPreferences sharedPreferences = b.getSharedPreferences("WestworldDropboxOp", 0);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - sharedPreferences.getLong("WestworldDropboxOpLastRunMillis", -1) >= chpz.m149331h() || "com.google.android.gms.westworld.action.WESTWORLD_DROPBOX_ALARM".equals(intent.getAction())) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong("WestworldDropboxOpLastRunMillis", currentTimeMillis);
                    if ("com.google.android.gms.westworld.action.WESTWORLD_DROPBOX_ALARM".equals(intent.getAction())) {
                        edit.putBoolean("WestworldDropboxOpAlarmSet", false);
                    }
                    edit.apply();
                } else if (!sharedPreferences.getBoolean("WestworldDropboxOpAlarmSet", false)) {
                    new skc(b).mo25675a("WestworldDropboxOp", 3, SystemClock.elapsedRealtime() + chpz.m149331h(), IntentOperation.getPendingIntent(b, DropboxEntryAddedOperation.class, new Intent("com.google.android.gms.westworld.action.WESTWORLD_DROPBOX_ALARM"), 0, 134217728), (String) null);
                    sharedPreferences.edit().putBoolean("WestworldDropboxOpAlarmSet", true).apply();
                    return;
                } else {
                    return;
                }
            }
            if (choh.m149231b()) {
                rjx = avtz.m79336a(rpr.m34216b(), new avty());
            } else {
                bymq = aykk.m84163a(b);
                rjx = null;
            }
            qxq f = aykk.m84185f(b);
            try {
                if (chpz.m149333j() && chou.f188925a.mo6606a().mo85475a()) {
                    if (aykk.m84175a(bymq, rjx, chou.m149250b())) {
                        aykb.m84141a(b, rjx, bymq, f);
                    }
                }
                if (chpz.m149333j() && chpa.f188932a.mo6606a().mo85480a()) {
                    if (aykk.m84175a(bymq, rjx, chpz.m149339p())) {
                        aykf.m84155a(b, rjx, bymq, f);
                    }
                }
                if (chpz.m149333j() && chok.f188915a.mo6606a().mo85469a()) {
                    if (aykk.m84175a(bymq, rjx, chpz.m149327d())) {
                        ayjz.m84134a(b, rjx, bymq, f);
                    }
                }
            } finally {
                f.mo24388e();
            }
        }
    }
}
