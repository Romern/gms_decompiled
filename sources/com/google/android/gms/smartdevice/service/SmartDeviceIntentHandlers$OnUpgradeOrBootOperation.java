package com.google.android.gms.smartdevice.service;

import android.content.Intent;
import com.google.android.gms.smartdevice.notification.SerializableNotification;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmartDeviceIntentHandlers$OnUpgradeOrBootOperation extends qlf {
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0096, code lost:
        if (r12 > r9.f108086c) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c2, code lost:
        r9.f108084a = r10;
        r1 = r9.f108086c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ca, code lost:
        if (r1 <= 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cc, code lost:
        r1 = r1 - r12;
        r9.f108086c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d1, code lost:
        r14 = r9.f108085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d5, code lost:
        if (r14 <= 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d9, code lost:
        if (r1 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00db, code lost:
        r9.f108085b = r14 + r1;
        r9.f108086c = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e1, code lost:
        r9.f108085b = r14 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e4, code lost:
        r0.mo48787a(r7, r8, r9);
        r2 = r17;
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008d, code lost:
        if (r12 > (r9.f108085b + r9.f108086c)) goto L_0x0098;
     */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        Iterator<Map.Entry<String, ?>> it;
        int i2 = 2;
        artn.f88281a.mo25409a("OnUpgradeOrBootOperation got intent: %s with flag %d", intent, Integer.valueOf(i));
        arsd a = arsd.m73370a(getBaseContext());
        Map<String, ?> all = arsd.m73369a().getAll();
        if (all.size() != 0) {
            arsd.f88223a.mo25409a("Found %s notifications.", Integer.valueOf(all.size()));
            LinkedList<String> linkedList = new LinkedList();
            Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, ?> next = it2.next();
                String[] split = next.getKey().split(":", i2);
                int intValue = Integer.valueOf(split[0]).intValue();
                String str = split[1];
                SerializableNotification a2 = SerializableNotification.m92794a((String) next.getValue());
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - a2.f108084a;
                if (a2.f108091h) {
                    it = it2;
                } else {
                    it = it2;
                }
                sek sek = arsd.f88223a;
                String valueOf = String.valueOf(str);
                sek.mo25414c(valueOf.length() == 0 ? new String("Not showing expired notification with tag: ") : "Not showing expired notification with tag: ".concat(valueOf), new Object[0]);
                linkedList.add(next.getKey());
                it2 = it;
                i2 = 2;
            }
            for (String str2 : linkedList) {
                String[] split2 = str2.split(":", 2);
                a.mo48788b(split2[1], Integer.valueOf(split2[0]).intValue());
            }
        }
    }
}
