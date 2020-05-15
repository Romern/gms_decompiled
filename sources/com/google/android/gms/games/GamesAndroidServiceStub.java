package com.google.android.gms.games;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GamesAndroidServiceStub extends Service {

    /* renamed from: a */
    private static final ArrayList f32504a = new ArrayList();

    /* renamed from: b */
    private static final bnic f32505b = bnic.m109491a("com.google.android.gms.games.service.START", "com.google.android.gms.games.service.START_ASYNC", "com.google.android.play.games.service.START_1P");

    /* renamed from: a */
    static final void m23890a(Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Binding to games service: ");
        sb.append(valueOf);
        aaeg.m21154a("GamesService", sb.toString());
        synchronized (f32504a) {
            int size = f32504a.size();
            int i = 0;
            while (i < size) {
                if (!((Intent) f32504a.get(i)).filterEquals(intent)) {
                    i++;
                } else {
                    return;
                }
            }
            String valueOf2 = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 15);
            sb2.append("Adding intent: ");
            sb2.append(valueOf2);
            aaeg.m21154a("GamesService", sb2.toString());
            f32504a.add(intent);
        }
    }

    public final IBinder onBind(Intent intent) {
        if (!f32505b.contains(intent.getAction())) {
            return null;
        }
        m23890a(intent);
        return new aacx(this);
    }

    public final void onRebind(Intent intent) {
        if ("com.google.android.gms.games.service.START".equals(intent.getAction())) {
            m23890a(intent);
        }
    }

    public final boolean onUnbind(Intent intent) {
        int size;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Unbinding from games service: ");
        sb.append(valueOf);
        aaeg.m21154a("GamesService", sb.toString());
        synchronized (f32504a) {
            int size2 = f32504a.size();
            int i = 0;
            while (true) {
                if (i >= size2) {
                    break;
                }
                Intent intent2 = (Intent) f32504a.get(i);
                if (intent2.filterEquals(intent)) {
                    String valueOf2 = String.valueOf(intent2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
                    sb2.append("Removing intent: ");
                    sb2.append(valueOf2);
                    aaeg.m21154a("GamesService", sb2.toString());
                    f32504a.remove(i);
                    break;
                }
                i++;
            }
            size = f32504a.size();
        }
        if (size != 0) {
            return true;
        }
        aaeg.m21154a("GamesService", "Unbound from all clients. Cleaning up.");
        return true;
    }
}
