package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: bgbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgbk extends bgdr {

    /* renamed from: i */
    private ActivityTransitionEvent f115996i;

    /* renamed from: j */
    private Bundle f115997j;

    /* renamed from: k */
    private beuf f115998k;

    public bgbk(rsk rsk) {
        super("ActivityTransitionListeners", -1, rsk);
        this.f115996i = null;
        this.f115997j = null;
        this.f115998k = null;
        this.f115998k = new beuf(this.f115996i);
    }

    /* renamed from: a */
    private static final void m98516a(Context context, int i) {
        rjx a = aefo.m51797a(context);
        StringBuilder sb = new StringBuilder(43);
        sb.append("set activity recognition mode = ");
        sb.append(i);
        sb.toString();
        aucb a2 = a.mo24701a((rpa) new aefw(i));
        a2.mo50373a(new bgbh());
        a2.mo50372a(new bgbi());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo62614c(bgcc bgcc) {
        bgbj bgbj = (bgbj) bgcc;
        this.f116172a.mo62052a(bfos.AR_TRANSITION_REQUEST_REMOVED, bgbj.f116017h.hashCode(), bgbj.f116019j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo62615d(bgcc bgcc) {
        bgbj bgbj = (bgbj) bgcc;
        int i = bgbj.f115994b;
        for (ActivityTransition activityTransition : bgbj.f115995a.f79311b) {
            bfor bfor = this.f116172a;
            int hashCode = bgbj.f116017h.hashCode();
            String str = bgbj.f116019j;
            String str2 = bgbj.f116022m;
            int i2 = activityTransition.f79305a;
            int i3 = activityTransition.f79306b;
            bfor.mo62047a(new bgdf(bfos.AR_TRANSITION_REQUEST_ADDED, bfor.mo62055b(), bfor.mo62045a(str), hashCode, i2, i3, hashCode, str, str2, i2, i3));
            bgbj = bgbj;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo62371g() {
        if (!cesh.m138172d()) {
            return "requestActivityTransitionUpdates is not implemented!!";
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo62616h() {
        return 4;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo62617i() {
        TreeSet treeSet = new TreeSet(ActivityTransitionRequest.f79310a);
        for (bgbj bgbj : this.f116175h.values()) {
            int i = bgbj.f115994b;
            treeSet.addAll(bgbj.f115995a.f79311b);
        }
        if (!treeSet.isEmpty()) {
            return new ActivityTransitionRequest(new ArrayList(treeSet));
        }
        return null;
    }

    /* renamed from: a */
    protected static final boolean m98517a(List list, Bundle bundle, bgbj bgbj, Intent intent) {
        int i = bgbj.f115994b;
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) it.next();
            Iterator it2 = bgbj.f115995a.f79311b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityTransition activityTransition = (ActivityTransition) it2.next();
                if (activityTransitionEvent.f79307a == activityTransition.f79305a && activityTransitionEvent.f79308b == activityTransition.f79306b) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(activityTransitionEvent);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        sef.m35071a(new ActivityTransitionResult(arrayList, bundle), intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo62606a(bgcc bgcc) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT", bgcc.f116017h);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bgcc mo62607a(PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, bgns bgns) {
        return new bgbj((ActivityTransitionRequest) obj, pendingIntent, bgns, bhcv, z, str);
    }

    /* renamed from: a */
    public final void mo62608a(PendingIntent pendingIntent, bgjp bgjp) {
        String str;
        if (bgjp != null && cesh.m138170b()) {
            String valueOf = String.valueOf(pendingIntent.getTargetPackage());
            if (valueOf.length() == 0) {
                new String("Logging remove request for package = ");
            } else {
                "Logging remove request for package = ".concat(valueOf);
            }
            bgcc bgcc = (bgcc) this.f116175h.get(pendingIntent);
            Context context = bgjp.f116620a;
            if (context != null) {
                bewq a = bewq.m95998a(context);
                String targetPackage = pendingIntent.getTargetPackage();
                if (bgcc != null) {
                    str = bgcc.f116022m;
                } else {
                    str = null;
                }
                a.mo61205a(targetPackage, str, 3, System.currentTimeMillis());
            }
        }
        super.mo62608a(pendingIntent, bgjp);
        if (this.f116175h.values().isEmpty()) {
            this.f115996i = null;
            this.f115997j = null;
            this.f115998k.f112470a = null;
        }
        if (cesk.m138180c() && bgjp != null) {
            for (bgbj bgbj : this.f116175h.values()) {
                if (bern.m95589a(bgbj.f116019j, bgbj.f116022m)) {
                    return;
                }
            }
            m98516a(bgjp.f116620a, 0);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62609a(Context context, bgns bgns, PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, rnt rnt, bgjp bgjp) {
        ActivityTransitionEvent activityTransitionEvent;
        bgbj bgbj;
        int i;
        String str2;
        PendingIntent pendingIntent2 = pendingIntent;
        super.mo62609a(context, bgns, pendingIntent, (ActivityTransitionRequest) obj, z, bhcv, str, rnt, bgjp);
        if (!bero.m95593a(context, pendingIntent2)) {
            if (cesh.f183401a.mo6606a().arReportTransitionOnClientAdded() && (activityTransitionEvent = this.f115996i) != null && activityTransitionEvent.f79308b == 0 && (bgbj = (bgbj) this.f116175h.get(pendingIntent2)) != null) {
                String valueOf = String.valueOf(this.f115996i);
                Bundle bundle = this.f115997j;
                if (bundle != null) {
                    i = bundle.getInt("location:key:transition_result_source", 0);
                } else {
                    i = 0;
                }
                if (i != 0) {
                    str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unidentified" : "chre_cc_test_gesture" : "chre_audio_fusion" : "gms_transition_filter" : "chre_transition_filter";
                } else {
                    str2 = "unknown";
                }
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75 + str2.length());
                sb.append("Reporting the currently running activity transition to client = ");
                sb.append(valueOf);
                sb.append(", source = ");
                sb.append(str2);
                sb.toString();
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f115996i);
                if (cery.m138142b() && DetectedActivity.m66833b(this.f115996i.f79307a)) {
                    ActivityTransitionEvent activityTransitionEvent2 = this.f115996i;
                    arrayList.add(new ActivityTransitionEvent(0, activityTransitionEvent2.f79308b, activityTransitionEvent2.f79309c));
                }
                int a = mo62686a(context, arrayList, this.f115997j, bgbj);
                StringBuilder sb2 = new StringBuilder(63);
                sb2.append("status of returning result to newly added request = ");
                sb2.append(a);
                sb2.toString();
            }
            if (cesh.m138170b()) {
                String valueOf2 = String.valueOf(pendingIntent.getTargetPackage());
                if (valueOf2.length() == 0) {
                    new String("Logging request added for package = ");
                } else {
                    "Logging request added for package = ".concat(valueOf2);
                }
                bewq.m95998a(context).mo61205a(pendingIntent.getTargetPackage(), str, 2, System.currentTimeMillis());
            }
            if (cesk.m138180c() && z && bern.m95589a(bhcq.m100640a(pendingIntent), str)) {
                m98516a(context, 1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014e A[SYNTHETIC] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62610a(Context context, Object obj, Bundle bundle, bgjp bgjp) {
        ActivityTransitionEvent activityTransitionEvent;
        char c;
        Context context2 = context;
        Bundle bundle2 = bundle;
        bgjp bgjp2 = bgjp;
        List<ActivityTransitionEvent> list = (List) obj;
        if (cesk.m138180c() && list != null && list.size() <= 1 && ((ActivityTransitionEvent) list.get(0)).f79307a == 20) {
            beuf beuf = this.f115998k;
            ActivityTransitionEvent activityTransitionEvent2 = (ActivityTransitionEvent) list.get(0);
            List list2 = null;
            if (activityTransitionEvent2.f79307a == 20) {
                if (activityTransitionEvent2.f79308b == 0) {
                    list2 = new ArrayList();
                    ActivityTransitionEvent activityTransitionEvent3 = beuf.f112470a;
                    if (activityTransitionEvent3 != null) {
                        list2.add(new ActivityTransitionEvent(activityTransitionEvent3.f79307a, 1, activityTransitionEvent2.f79309c));
                    }
                    list2.add(new ActivityTransitionEvent(0, 0, activityTransitionEvent2.f79309c));
                    beuf.f112471b = true;
                } else if (beuf.f112471b && cesk.m138179b()) {
                    beuf.f112471b = false;
                    list2 = Collections.singletonList(new ActivityTransitionEvent(0, 1, activityTransitionEvent2.f79309c));
                }
            }
            if (list2 != null) {
                Iterator it = this.f116175h.entrySet().iterator();
                boolean z = false;
                while (it.hasNext()) {
                    bgbj bgbj = (bgbj) ((Map.Entry) it.next()).getValue();
                    boolean z2 = bgbj.f116025p;
                    String str = bgbj.f116019j;
                    String str2 = bgbj.f116022m;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44 + String.valueOf(str2).length());
                    sb.append("isFromFirstParty = ");
                    sb.append(z2);
                    sb.append(", package = ");
                    sb.append(str);
                    sb.append(", tag = ");
                    sb.append(str2);
                    sb.toString();
                    if (bgbj.f116025p && bern.m95589a(bgbj.f116019j, bgbj.f116022m)) {
                        if (!list2.isEmpty()) {
                            Intent intent = new Intent();
                            intent.putExtra("AR_AUDIO_FUSION_RESULT", ((ActivityTransitionEvent) list2.get(list2.size() + -1)).f79308b == 0 ? 0 : 1);
                            if (m98517a(list2, bundle2, bgbj, intent)) {
                                if (!bgbj.mo62597a(context2, intent)) {
                                    String valueOf = String.valueOf(bgbj);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                                    sb2.append("Dropping intent receiver");
                                    sb2.append(valueOf);
                                    sb2.toString();
                                    this.f116174g.mo25067b((Parcelable) mo62606a((bgcc) bgbj));
                                    if (this.f116172a != null) {
                                        mo62613b(bgbj);
                                        c = 0;
                                    } else {
                                        c = 0;
                                    }
                                } else {
                                    c = 2;
                                }
                                if (c == 0) {
                                    it.remove();
                                    z = true;
                                }
                                if (!z) {
                                    mo62688b(bgjp2);
                                }
                            }
                        }
                        c = 1;
                        if (c == 0) {
                        }
                        if (!z) {
                        }
                    }
                }
                return;
            }
            return;
        }
        super.mo62610a(context2, list, bundle2, bgjp2);
        if (cets.m138236b()) {
            for (ActivityTransitionEvent activityTransitionEvent4 : list) {
                if (activityTransitionEvent4.f79307a == 22) {
                    return;
                }
            }
        }
        if (list != null && !list.isEmpty()) {
            if (cery.m138142b()) {
                activityTransitionEvent = bexn.m96029a(bexn.m96032b(list));
            } else {
                activityTransitionEvent = (ActivityTransitionEvent) list.get(list.size() - 1);
            }
            if (activityTransitionEvent.f79308b == 0) {
                String valueOf2 = String.valueOf(this.f115996i);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                sb3.append("Current Activity Event = ");
                sb3.append(valueOf2);
                sb3.toString();
                if (this.f115996i != null && cese.m138156e()) {
                    bewq a = bewq.m95998a(context);
                    int i = this.f115996i.f79307a;
                    int i2 = activityTransitionEvent.f79307a;
                    long millis = TimeUnit.NANOSECONDS.toMillis(activityTransitionEvent.f79309c) - TimeUnit.NANOSECONDS.toMillis(this.f115996i.f79309c);
                    bxvd da = btxm.f152814q.mo74144da();
                    bxvd da2 = btyd.f152884d.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    btyd btyd = (btyd) da2.f164949b;
                    int i3 = btyd.f152886a | 4;
                    btyd.f152886a = i3;
                    btyd.f152888c = i;
                    btyd.f152886a = i3 | 2;
                    btyd.f152887b = 100.0f;
                    btyd btyd2 = (btyd) da2.mo74062i();
                    bxvd da3 = btyd.f152884d.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    btyd btyd3 = (btyd) da3.f164949b;
                    int i4 = btyd3.f152886a | 4;
                    btyd3.f152886a = i4;
                    btyd3.f152888c = i2;
                    btyd3.f152886a = i4 | 2;
                    btyd3.f152887b = 100.0f;
                    btyd btyd4 = (btyd) da3.mo74062i();
                    bxvd da4 = btxu.f152857e.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    btxu btxu = (btxu) da4.f164949b;
                    btyd2.getClass();
                    btxu.f152860b = btyd2;
                    int i5 = btxu.f152859a | 1;
                    btxu.f152859a = i5;
                    btyd4.getClass();
                    btxu.f152861c = btyd4;
                    int i6 = i5 | 2;
                    btxu.f152859a = i6;
                    btxu.f152859a = i6 | 4;
                    btxu.f152862d = millis;
                    btxu btxu2 = (btxu) da4.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btxm btxm = (btxm) da.f164949b;
                    btxu2.getClass();
                    btxm.f152820e = btxu2;
                    btxm.f152816a |= 8;
                    qwo a2 = a.f112849a.mo24333a((btxm) da.mo74062i());
                    a2.mo24328b(5);
                    a2.mo24327b();
                }
                this.f115996i = activityTransitionEvent;
                this.f115997j = bundle2;
                this.f115998k.f112470a = activityTransitionEvent;
                return;
            }
            String valueOf3 = String.valueOf(activityTransitionEvent);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 74);
            sb4.append("Received a transition without an activity enter state. Transition Event = ");
            sb4.append(valueOf3);
            sb4.toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62613b(bgbj bgbj) {
        this.f116172a.mo62052a(bfos.AR_TRANSITION_REQUEST_DROPPED, bgbj.f116017h.hashCode(), bgbj.f116019j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62612a(Object obj, Bundle bundle, bgcc bgcc, Intent intent) {
        return m98517a((List) obj, bundle, (bgbj) bgcc, intent);
    }
}
