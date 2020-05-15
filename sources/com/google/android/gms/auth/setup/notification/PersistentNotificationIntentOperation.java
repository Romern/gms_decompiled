package com.google.android.gms.auth.setup.notification;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.LinkedList;
import java.util.Map;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersistentNotificationIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f11289a = PersistentNotificationIntentOperation.class.getSimpleName();

    /* renamed from: a */
    public static Intent m6901a(Context context, String str, int i) {
        return IntentOperation.getStartIntent(context, PersistentNotificationIntentOperation.class, "com.google.android.gms.auth.setup.notification.CANCEL").addCategory(str).addCategory(String.valueOf(i)).putExtra("tag", str).putExtra("id", i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    public final void onHandleIntent(Intent intent) {
        char c;
        Intent intent2 = intent;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Received intent: ");
        sb.append(valueOf);
        sb.toString();
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != 798292259) {
            if (hashCode == 855344238 && action.equals("com.google.android.gms.auth.setup.notification.CANCEL")) {
                c = 1;
                if (c == 0) {
                    juv a = m6902a(this);
                    Map<String, ?> all = juv.m17363a().getAll();
                    if (all.size() != 0) {
                        LinkedList<String> linkedList = new LinkedList();
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            String[] split = entry.getKey().split(":", 2);
                            int intValue = Integer.valueOf(split[0]).intValue();
                            String str = split[1];
                            juw a2 = juw.m17367a(rpr.m34216b(), (String) entry.getValue());
                            long currentTimeMillis = System.currentTimeMillis();
                            long b = currentTimeMillis - a2.mo14129b();
                            if (b > a2.mo14133c()) {
                                String valueOf2 = String.valueOf(str);
                                Log.i("Auth", valueOf2.length() == 0 ? new String("Not showing expired notification with tag: ") : "Not showing expired notification with tag: ".concat(valueOf2));
                                linkedList.add(entry.getKey());
                            } else {
                                a2.mo14130b(currentTimeMillis);
                                a2.mo14125a(a2.mo14133c() - b);
                                a.mo14122a(str, intValue, a2);
                            }
                        }
                        for (String str2 : linkedList) {
                            String[] split2 = str2.split(":", 2);
                            a.mo14121a(split2[1], Integer.valueOf(split2[0]).intValue());
                        }
                        return;
                    }
                    return;
                } else if (c == 1) {
                    if (intent2.hasExtra("tag") || intent2.hasExtra("id")) {
                        m6902a(this).mo14121a(intent2.getStringExtra("tag"), intent2.getIntExtra("id", 0));
                        return;
                    } else {
                        Log.w(f11289a, "ACTION_CANCEL_NOTIFICATION intent found without tag or id.");
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (action.equals("android.intent.action.BOOT_COMPLETED")) {
            c = 0;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* renamed from: a */
    private static juv m6902a(Context context) {
        return new juv(sex.m35104a(context), new skc(context));
    }
}
