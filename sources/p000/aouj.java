package p000;

import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.reminders.model.CategoryInfo;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.notification.HandleTriggerIntentOperation;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: aouj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aouj implements aoul {

    /* renamed from: a */
    final /* synthetic */ aoum f83630a;

    public aouj(aoum aoum) {
        this.f83630a = aoum;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final boolean mo46912a(lrk lrk, long j, Task task) {
        char c;
        int i;
        lrk lrk2 = lrk;
        Context context = this.f83630a.f83635c;
        long currentTimeMillis = System.currentTimeMillis();
        Intent startIntent = IntentOperation.getStartIntent(context, HandleTriggerIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_CONTEXT_FENCE_TRIGGERED");
        startIntent.setData(ContentUris.withAppendedId(aosz.f83569a, j));
        startIntent.putExtra("HANDLE_NOTIFICATION_TRIGGER_EXTRA_NOTIFICATION_ID", j);
        startIntent.putExtra("HANDLE_NOTIFICATION_TRIGGER_EXTRA_FENCE_CREATION_MS", currentTimeMillis);
        PendingIntent service = PendingIntent.getService(context, 0, startIntent, 134217728);
        String a = aoum.m69529a(j);
        if (task.mo58714p() != null) {
            Location p = task.mo58714p();
            if (p.mo58660h() != null) {
                int intValue = p.mo58660h().intValue();
                if (intValue == 1) {
                    lrk2.mo15392a(a, lrm.m19592a(null, Collections.singleton("Home"), aoum.f83632a), service);
                    return true;
                } else if (intValue != 2) {
                    return false;
                } else {
                    lrk2.mo15392a(a, lrm.m19592a(null, Collections.singleton("Work"), aoum.f83632a), service);
                    return true;
                }
            } else if (!(p.mo58655c() == null || p.mo58656d() == null || p.mo58659g() == null)) {
                lrk2.mo15392a(a, lrl.m19591a(p.mo58655c().doubleValue(), p.mo58656d().doubleValue(), (double) p.mo58659g().intValue(), aoum.f83632a), service);
                return true;
            }
        }
        if (task.mo58715q() == null) {
            return false;
        }
        LocationGroup q = task.mo58715q();
        if (q.mo58652f() != null) {
            String c2 = q.mo58652f().mo58621c();
            if (!TextUtils.isEmpty(c2)) {
                long j2 = aoum.f83632a;
                tla tla = new tla();
                tla.mo26641b();
                tla.f46234c = c2;
                tla.f46233b = j2;
                lrk2.mo15392a(a, ContextFenceStub.m22862a(tla.mo26640a()), service);
                Object[] objArr = {a, c2};
                return true;
            }
        }
        if (q.mo58653g() == null) {
            return false;
        }
        CategoryInfo g = q.mo58653g();
        if (g.mo58617d() == null || g.mo58617d().isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : g.mo58617d()) {
            switch (str.hashCode()) {
                case -1676983117:
                    if (str.equals("pharmacy")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1648595317:
                    if (str.equals("shopping_mall")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -735873907:
                    if (str.equals("grocery_or_supermarket")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 944808985:
                    if (str.equals("electronics_store")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1040528330:
                    if (str.equals("hardware_store")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2059499969:
                    if (str.equals("pet_store")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                i = c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? 0 : 84 : 72 : 71 : 46 : 43;
            } else {
                i = 32;
            }
            if (i != 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        lrk2.mo15392a(a, lrm.m19592a(arrayList, null, aoum.f83632a), service);
        Object[] objArr2 = {a, TextUtils.join(",", arrayList)};
        return true;
    }
}
