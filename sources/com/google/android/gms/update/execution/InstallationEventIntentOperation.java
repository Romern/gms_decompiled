package com.google.android.gms.update.execution;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstallationEventIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final sek f109495a = avpq.m79018e("InstallationEventIntentOperation");

    /* JADX INFO: finally extract failed */
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.update.INSTALLATION_EVENT".equals(intent.getAction()) && avma.m78773a(this)) {
            avms avms = (avms) avms.f93422b.mo51589b();
            bmxj bmxj = avno.f93525a;
            synchronized (avms.f93424d) {
                while (!avms.f93425e.isEmpty()) {
                    try {
                        bmxj.apply(Integer.valueOf(((Integer) avms.f93425e.getFirst()).intValue()));
                        avms.f93425e.removeFirst();
                        avms.f93423c.mo51605a(avms.f93421a.mo51602b(bngx.m109368a((Collection) avms.f93425e)));
                    } catch (Throwable th) {
                        avms.f93425e.removeFirst();
                        avms.f93423c.mo51605a(avms.f93421a.mo51602b(bngx.m109368a((Collection) avms.f93425e)));
                        throw th;
                    }
                }
            }
        }
    }
}
