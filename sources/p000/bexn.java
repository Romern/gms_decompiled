package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bexn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexn implements bfms {

    /* renamed from: a */
    public static final Object f112953a = new Object();

    /* renamed from: b */
    public static bexn f112954b;

    /* renamed from: c */
    private static final List f112955c = Arrays.asList(5, 4);

    /* renamed from: d */
    private final btxe f112956d = new btxe();

    /* renamed from: e */
    private bexq f112957e;

    /* renamed from: f */
    private bexy f112958f;

    /* renamed from: g */
    private ActivityTransitionEvent f112959g;

    /* renamed from: h */
    private final bgmk f112960h;

    /* renamed from: i */
    private final bfmd f112961i;

    /* renamed from: j */
    private final bfor f112962j;

    /* renamed from: k */
    private boolean f112963k = false;

    public bexn(bgmk bgmk, bfmd bfmd, bfor bfor) {
        this.f112960h = bgmk;
        this.f112961i = bfmd;
        this.f112962j = bfor;
    }

    /* renamed from: a */
    static int m96027a(List list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((ActivityTransitionEvent) list.get(i2)).f79308b == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static List m96032b(List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            int i = ((ActivityTransitionEvent) list.get(list.size() - 1)).f79308b;
            int size = list.size() - 1;
            while (size >= 0 && ((ActivityTransitionEvent) list.get(size)).f79308b == i) {
                arrayList.add((ActivityTransitionEvent) list.get(size));
                size--;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private final void m96033c(List list) {
        boolean z;
        if (this.f112962j == null || list == null || list.isEmpty()) {
            boolean z2 = true;
            int i = 0;
            if (this.f112962j == null) {
                z = true;
            } else {
                z = false;
            }
            if (list != null) {
                z2 = false;
            }
            if (list != null) {
                i = list.size();
            }
            StringBuilder sb = new StringBuilder(94);
            sb.append("Not writing eventlog. eventLog is null? ");
            sb.append(z);
            sb.append(", events is null? ");
            sb.append(z2);
            sb.append(", events size= ");
            sb.append(i);
            sb.toString();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) it.next();
            this.f112962j.mo62050a(bfos.AR_TRANSITION_RESPONSE, activityTransitionEvent.f79307a, activityTransitionEvent.f79308b);
        }
    }

    /* renamed from: a */
    private static ActivityTransitionEvent m96028a(ActivityTransitionEvent activityTransitionEvent, long j) {
        return new ActivityTransitionEvent(activityTransitionEvent.f79307a, activityTransitionEvent.f79308b == 0 ? 1 : 0, j);
    }

    /* renamed from: a */
    public static ActivityTransitionEvent m96029a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (ActivityTransitionEvent) list.get(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) it.next();
            if (DetectedActivity.m66833b(activityTransitionEvent.f79307a)) {
                return activityTransitionEvent;
            }
        }
        String valueOf = String.valueOf(list.get(0));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 108);
        sb.append("Could not find the most exclusive activity from the list;  returning first item from list to avoid crashes: ");
        sb.append(valueOf);
        sb.toString();
        return (ActivityTransitionEvent) list.get(0);
    }

    /* renamed from: a */
    private final void m96030a() {
        if (this.f112959g == null) {
            bfmd bfmd = this.f112961i;
            int i = bfmd.f114388a.getInt("current_activity_key", -1);
            long j = bfmd.f114388a.getLong("current_activity_epoch_time_key", -1);
            StringBuilder sb = new StringBuilder(84);
            sb.append("getCurrentActivity: activity = ");
            sb.append(i);
            sb.append(", epoch time millis = ");
            sb.append(j);
            sb.toString();
            bfmc bfmc = null;
            if (!(i == -1 || j == -1)) {
                bfmc = new bfmc(i, j);
            }
            if (bfmc != null) {
                int i2 = bfmc.f114386a;
                long currentTimeMillis = System.currentTimeMillis() - bfmc.f114387b;
                StringBuilder sb2 = new StringBuilder(76);
                sb2.append("createCurrentTransitionEvent elapsedTimeApproximation = ");
                sb2.append(currentTimeMillis);
                sb2.toString();
                ActivityTransitionEvent activityTransitionEvent = new ActivityTransitionEvent(i2, 0, TimeUnit.MILLISECONDS.toNanos(currentTimeMillis));
                this.f112959g = activityTransitionEvent;
                String valueOf = String.valueOf(activityTransitionEvent);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb3.append("Initialized the current activity transition from cache = ");
                sb3.append(valueOf);
                sb3.toString();
            }
        }
    }

    /* renamed from: a */
    private final void m96031a(int i) {
        bfmd bfmd = this.f112961i;
        bfmc bfmc = new bfmc(i, System.currentTimeMillis());
        String valueOf = String.valueOf(bfmc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
        sb.append("Adding the current activity to persistent store. Data = ");
        sb.append(valueOf);
        sb.toString();
        boolean z = false;
        if (bfmc.f114386a >= 0 && bfmc.f114387b > 0) {
            z = true;
        }
        bxbm.m122545b(z, "Invalid activity and epoch time.");
        bfmd.f114388a.edit().putInt("current_activity_key", bfmc.f114386a).putLong("current_activity_epoch_time_key", bfmc.f114387b).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d8, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c0  */
    /* renamed from: a */
    public final synchronized List mo61231a(ActivityRecognitionResult activityRecognitionResult, boolean z, boolean z2) {
        List list;
        btwq btwq;
        List list2;
        ActivityTransitionEvent activityTransitionEvent;
        String valueOf = String.valueOf(activityRecognitionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("current activity recognition result = ");
        sb.append(valueOf);
        sb.toString();
        if (activityRecognitionResult == null) {
            return null;
        }
        m96030a();
        if (this.f112957e == null) {
            ActivityTransitionEvent activityTransitionEvent2 = this.f112959g;
            this.f112957e = new bexq(activityTransitionEvent2 != null ? activityTransitionEvent2.f79307a : -1);
        }
        int i = 1;
        if (cesh.f183401a.mo6606a().arTransitionFilteringEnabled()) {
            bexp a = this.f112957e.mo61238a(activityRecognitionResult, z2, this.f112963k, z);
            String valueOf2 = String.valueOf(a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
            sb2.append("Activity filter response = ");
            sb2.append(valueOf2);
            sb2.toString();
            list = a.f112968b != 1 ? mo61232a(new ActivityTransitionEvent(a.f112967a, 0, TimeUnit.MILLISECONDS.toNanos(activityRecognitionResult.f79302c))) : null;
        } else {
            List<DetectedActivity> list3 = activityRecognitionResult.f79300a;
            ArrayList arrayList = new ArrayList();
            for (DetectedActivity detectedActivity : list3) {
                arrayList.add(new btxa(detectedActivity.mo43513a(), detectedActivity.f79320e));
            }
            btxc btxc = new btxc(new btxb(arrayList, activityRecognitionResult.f79302c), null);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(btxc);
            btxe btxe = this.f112956d;
            boolean z3 = this.f112963k;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!arrayList2.isEmpty()) {
                if (z) {
                    btxe.mo72470a(arrayList2);
                    btwq = new btwq(elapsedRealtime, 6, 100.0f);
                } else if (z3) {
                    btwq = new btwq(elapsedRealtime, 0, 100.0f);
                } else if (!arrayList2.isEmpty()) {
                    btxe.mo72470a(arrayList2);
                    List a2 = btxe.f152794b.mo72452a(btxe.f152793a);
                    if (!a2.isEmpty()) {
                        Collections.sort(a2, Collections.reverseOrder(new btxd()));
                        btwq = (btwq) a2.get(0);
                        if (btwq.f152749b != 7) {
                            if (btwq != null) {
                                if (z2 && btwq.f152749b == 0) {
                                }
                            }
                            btwq = null;
                        }
                    }
                    btwq = null;
                    if (btwq != null) {
                    }
                    btwq = null;
                } else {
                    throw new IllegalArgumentException("Need at least 1 observation");
                }
                if (btwq != null) {
                    int i2 = btwq.f152749b;
                    switch (i2) {
                        case 0:
                        case 1:
                            i = 0;
                            break;
                        case 2:
                        case 3:
                            break;
                        case 4:
                            i = 7;
                            break;
                        case 5:
                            i = 8;
                            break;
                        case 6:
                            i = 3;
                            break;
                        case 7:
                            i = 4;
                            break;
                        default:
                            StringBuilder sb3 = new StringBuilder(51);
                            sb3.append("Received an unrecognised filter state = ");
                            sb3.append(i2);
                            sb3.toString();
                            i = -1;
                            break;
                    }
                    StringBuilder sb4 = new StringBuilder(36);
                    sb4.append("detectedActivity State = ");
                    sb4.append(i);
                    sb4.toString();
                    if (i != -1 && !f112955c.contains(Integer.valueOf(i))) {
                        list2 = mo61232a(new ActivityTransitionEvent(i, 0, TimeUnit.MILLISECONDS.toNanos(btwq.f152748a)));
                        if (list2 != null) {
                            ActivityTransitionEvent activityTransitionEvent3 = new ActivityTransitionEvent(bexu.m96064a(activityRecognitionResult).mo43513a(), 0, TimeUnit.MILLISECONDS.toNanos(activityRecognitionResult.f79302c));
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(activityTransitionEvent3);
                            int size = arrayList3.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    activityTransitionEvent = (ActivityTransitionEvent) arrayList3.get(size);
                                    if (f112955c.contains(Integer.valueOf(activityTransitionEvent.f79307a))) {
                                        size--;
                                    }
                                } else {
                                    activityTransitionEvent = null;
                                }
                            }
                            list = mo61232a(activityTransitionEvent);
                        } else {
                            list = list2;
                        }
                    }
                }
                list2 = null;
                if (list2 != null) {
                }
            } else {
                throw new IllegalArgumentException("Need at least 1 observation");
            }
        }
        if (list != null && !list.isEmpty()) {
            ActivityTransitionEvent activityTransitionEvent4 = this.f112959g;
            if (activityTransitionEvent4 != null) {
                m96031a(activityTransitionEvent4.f79307a);
            }
            m96033c(list);
            return list;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo61232a(ActivityTransitionEvent activityTransitionEvent) {
        String valueOf = String.valueOf(activityTransitionEvent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("transitionEvents: detectedActivityTransition State = ");
        sb.append(valueOf);
        sb.toString();
        bexm bexm = new bexm();
        if (activityTransitionEvent != null) {
            ActivityTransitionEvent activityTransitionEvent2 = this.f112959g;
            if (activityTransitionEvent2 == null) {
                this.f112959g = activityTransitionEvent;
                bexm.add(activityTransitionEvent);
                return bexm;
            } else if (activityTransitionEvent2.f79307a != activityTransitionEvent.f79307a) {
                ActivityTransitionEvent a = m96028a(activityTransitionEvent2, activityTransitionEvent.f79309c);
                this.f112959g = activityTransitionEvent;
                bexm.add(a);
                bexm.add(activityTransitionEvent);
            }
        }
        return bexm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0299  */
    /* renamed from: a */
    public final synchronized List mo61233a(List list, boolean z) {
        List<ActivityTransitionEvent> list2;
        List emptyList;
        List list3;
        List list4;
        ActivityTransitionEvent activityTransitionEvent;
        ActivityTransitionEvent activityTransitionEvent2;
        boolean z2 = z;
        synchronized (this) {
            String valueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("transition events = ");
            sb.append(valueOf);
            sb.toString();
            m96030a();
            if (this.f112958f == null) {
                this.f112958f = new bexy(this.f112960h);
            }
            String valueOf2 = String.valueOf(list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
            sb2.append("transition events before filter = ");
            sb2.append(valueOf2);
            sb2.toString();
            bexy bexy = this.f112958f;
            boolean z3 = this.f112963k;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (bexu.f112986a.contains(Integer.valueOf(((ActivityTransitionEvent) it.next()).f79307a))) {
                    it.remove();
                }
            }
            if (!cesh.m138173e()) {
                boolean e = cesh.m138173e();
                StringBuilder sb3 = new StringBuilder(67);
                sb3.append("Skipping hardware transition filtering. Flag is not enabled = ");
                sb3.append(e);
                sb3.toString();
                list4 = list;
            } else {
                String valueOf3 = String.valueOf(list);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 83);
                sb4.append("run filter. events = ");
                sb4.append(valueOf3);
                sb4.append(", isWifiConnected = ");
                sb4.append(z2);
                sb4.append(", isVehicleBluetoothConnected = ");
                sb4.append(z3);
                sb4.toString();
                if (!list.isEmpty()) {
                    list4 = list;
                    ActivityTransitionEvent activityTransitionEvent3 = (ActivityTransitionEvent) list4.get(list.size() - 1);
                    if (activityTransitionEvent3.f79308b == 0) {
                        activityTransitionEvent = activityTransitionEvent3;
                        if (activityTransitionEvent != null) {
                            String valueOf4 = String.valueOf((Object) null);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 92);
                            sb5.append("Found no latest enter event = ");
                            sb5.append(valueOf4);
                            sb5.append(", isWifiConnected = ");
                            sb5.append(z2);
                            sb5.append(", isVehicleBluetoothConnected = ");
                            sb5.append(z3);
                            sb5.toString();
                        } else if (bexy.f112994b && bexu.m96066a(activityTransitionEvent.f79307a)) {
                            bgmk bgmk = bexy.f112993a;
                            bexy.f112996d = SystemClock.elapsedRealtime();
                            list2 = Collections.emptyList();
                            String valueOf5 = String.valueOf(list2);
                            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 33);
                            sb6.append("transition events after filter = ");
                            sb6.append(valueOf5);
                            sb6.toString();
                            emptyList = Collections.emptyList();
                            if (!list2.isEmpty()) {
                            }
                            m96033c(emptyList);
                        } else if (!z3 || bexy.f112994b) {
                            if (bexy.f112994b) {
                                if (bexu.m96067a(activityTransitionEvent)) {
                                    activityTransitionEvent2 = activityTransitionEvent;
                                    bexy.f112994b = false;
                                    list2 = new ArrayList();
                                    list2.add(bexy.m96075a(0, 1, activityTransitionEvent2.f79309c));
                                    list2.add(activityTransitionEvent2);
                                    String valueOf6 = String.valueOf(list2);
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf6).length() + 26);
                                    sb7.append("Exiting vehicle. Events = ");
                                    sb7.append(valueOf6);
                                    sb7.toString();
                                    String valueOf52 = String.valueOf(list2);
                                    StringBuilder sb62 = new StringBuilder(String.valueOf(valueOf52).length() + 33);
                                    sb62.append("transition events after filter = ");
                                    sb62.append(valueOf52);
                                    sb62.toString();
                                    emptyList = Collections.emptyList();
                                    if (!list2.isEmpty()) {
                                        if (cesh.m138171c()) {
                                            ActivityTransitionEvent activityTransitionEvent4 = this.f112959g;
                                            if (activityTransitionEvent4 != null) {
                                                if (!list2.isEmpty()) {
                                                    list3 = new ArrayList();
                                                    int i = ((ActivityTransitionEvent) list2.get(0)).f79308b;
                                                    for (ActivityTransitionEvent activityTransitionEvent5 : list2) {
                                                        if (activityTransitionEvent5.f79308b != i) {
                                                            break;
                                                        }
                                                        list3.add(activityTransitionEvent5);
                                                    }
                                                } else {
                                                    list3 = list2;
                                                }
                                                ActivityTransitionEvent a = m96029a(list3);
                                                if (activityTransitionEvent4.f79307a == a.f79307a) {
                                                    if (activityTransitionEvent4.f79308b == a.f79308b) {
                                                    }
                                                } else if (activityTransitionEvent4.f79308b == 1 && a.f79308b == 0) {
                                                }
                                                ActivityTransitionEvent activityTransitionEvent6 = this.f112959g;
                                                ActivityTransitionEvent activityTransitionEvent7 = (ActivityTransitionEvent) list2.get(0);
                                                ArrayList arrayList = new ArrayList();
                                                int i2 = activityTransitionEvent6.f79307a;
                                                int i3 = activityTransitionEvent7.f79307a;
                                                if (i2 == i3 && activityTransitionEvent7.f79308b == 0) {
                                                    int a2 = m96027a(list2, 1);
                                                    if (a2 != -1) {
                                                        arrayList.addAll(list2.subList(a2, list2.size()));
                                                    }
                                                } else {
                                                    if (i2 != i3) {
                                                        if (activityTransitionEvent6.f79308b == 0) {
                                                            ActivityTransitionEvent a3 = m96028a(activityTransitionEvent6, activityTransitionEvent7.f79309c);
                                                            arrayList.add(a3);
                                                            if (DetectedActivity.m66833b(a3.f79307a)) {
                                                                arrayList.add(new ActivityTransitionEvent(0, a3.f79308b, a3.f79309c));
                                                            }
                                                        }
                                                    }
                                                    int a4 = m96027a(list2, 0);
                                                    if (a4 != -1) {
                                                        arrayList.addAll(list2.subList(a4, list2.size()));
                                                    }
                                                }
                                                String valueOf7 = String.valueOf(this.f112959g);
                                                String valueOf8 = String.valueOf(list2);
                                                String valueOf9 = String.valueOf(this.f112959g);
                                                String valueOf10 = String.valueOf(arrayList);
                                                int length = String.valueOf(valueOf7).length();
                                                StringBuilder sb8 = new StringBuilder(length + 92 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
                                                sb8.append("Transitions received are not a valid transition from current state: ");
                                                sb8.append(valueOf7);
                                                sb8.append(" -> ");
                                                sb8.append(valueOf8);
                                                sb8.append(". Corrected to: ");
                                                sb8.append(valueOf9);
                                                sb8.append(" -> ");
                                                sb8.append(valueOf10);
                                                sb8.toString();
                                                list2 = arrayList;
                                            }
                                        }
                                        if (!list2.isEmpty()) {
                                            ActivityTransitionEvent activityTransitionEvent8 = (ActivityTransitionEvent) list2.get(list2.size() - 1);
                                            if (activityTransitionEvent8.f79308b == 0) {
                                                if (cery.m138142b()) {
                                                    this.f112959g = m96029a(m96032b(list2));
                                                } else {
                                                    this.f112959g = activityTransitionEvent8;
                                                }
                                                m96031a(this.f112959g.f79307a);
                                            } else {
                                                String valueOf11 = String.valueOf(activityTransitionEvent8);
                                                StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf11).length() + 75);
                                                sb9.append("received an transition event which is not of type enter new state. Event = ");
                                                sb9.append(valueOf11);
                                                sb9.toString();
                                                this.f112959g = null;
                                            }
                                        }
                                        emptyList = list2;
                                    }
                                    m96033c(emptyList);
                                }
                            }
                            if (bexy.f112994b) {
                                bexz bexz = bexy.f112997e;
                                long j = bexy.f112996d;
                                bgmk bgmk2 = bexy.f112993a;
                                activityTransitionEvent2 = activityTransitionEvent;
                                if (!bexz.mo61245a(0, j, SystemClock.elapsedRealtime(), z3, bexy.f112994b)) {
                                }
                                bexy.f112994b = false;
                                list2 = new ArrayList();
                                list2.add(bexy.m96075a(0, 1, activityTransitionEvent2.f79309c));
                                list2.add(activityTransitionEvent2);
                                String valueOf62 = String.valueOf(list2);
                                StringBuilder sb72 = new StringBuilder(String.valueOf(valueOf62).length() + 26);
                                sb72.append("Exiting vehicle. Events = ");
                                sb72.append(valueOf62);
                                sb72.toString();
                                String valueOf522 = String.valueOf(list2);
                                StringBuilder sb622 = new StringBuilder(String.valueOf(valueOf522).length() + 33);
                                sb622.append("transition events after filter = ");
                                sb622.append(valueOf522);
                                sb622.toString();
                                emptyList = Collections.emptyList();
                                if (!list2.isEmpty()) {
                                }
                                m96033c(emptyList);
                            } else {
                                activityTransitionEvent2 = activityTransitionEvent;
                            }
                            if (bexu.m96066a(activityTransitionEvent2.f79307a)) {
                                if (z2) {
                                    bexy.f112995c = true;
                                    ActivityTransitionEvent a5 = bexy.m96076a(list);
                                    if (a5.f79307a != 3) {
                                        ArrayList arrayList2 = new ArrayList();
                                        if (a5 != null) {
                                            arrayList2.add(a5);
                                        } else {
                                            String valueOf12 = String.valueOf(list);
                                            StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf12).length() + 63);
                                            sb10.append("Found no exit events during vehicle short circuiting. Events = ");
                                            sb10.append(valueOf12);
                                            sb10.toString();
                                        }
                                        arrayList2.add(bexy.m96075a(3, 0, bexy.f112993a.mo62774a()));
                                        list2 = arrayList2;
                                    } else {
                                        list2 = null;
                                    }
                                    String valueOf5222 = String.valueOf(list2);
                                    StringBuilder sb6222 = new StringBuilder(String.valueOf(valueOf5222).length() + 33);
                                    sb6222.append("transition events after filter = ");
                                    sb6222.append(valueOf5222);
                                    sb6222.toString();
                                    emptyList = Collections.emptyList();
                                    if (!list2.isEmpty()) {
                                    }
                                    m96033c(emptyList);
                                }
                            }
                            if (bexy.f112995c) {
                                bexy.f112995c = false;
                                list2 = new ArrayList();
                                list2.add(bexy.m96075a(3, 1, activityTransitionEvent2.f79309c));
                                list2.add(activityTransitionEvent2);
                                String valueOf52222 = String.valueOf(list2);
                                StringBuilder sb62222 = new StringBuilder(String.valueOf(valueOf52222).length() + 33);
                                sb62222.append("transition events after filter = ");
                                sb62222.append(valueOf52222);
                                sb62222.toString();
                                emptyList = Collections.emptyList();
                                if (!list2.isEmpty()) {
                                }
                                m96033c(emptyList);
                            }
                        } else if (bexu.m96066a(activityTransitionEvent.f79307a)) {
                            StringBuilder sb11 = new StringBuilder(99);
                            sb11.append("isVehicleBluetoothConnected = true, found latest event with vehicle. No short circuiting required.");
                            sb11.toString();
                            bgmk bgmk3 = bexy.f112993a;
                            bexy.f112996d = SystemClock.elapsedRealtime();
                        } else {
                            StringBuilder sb12 = new StringBuilder(79);
                            sb12.append("isVehicleBluetoothConnected = true, Short circuit for the connected bluetooth.");
                            sb12.toString();
                            bexy.f112994b = true;
                            bgmk bgmk4 = bexy.f112993a;
                            bexy.f112996d = SystemClock.elapsedRealtime();
                            list2 = new ArrayList();
                            ActivityTransitionEvent a6 = bexy.m96076a(list);
                            if (a6 != null) {
                                list2.add(a6);
                            } else {
                                String valueOf13 = String.valueOf(list);
                                StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf13).length() + 63);
                                sb13.append("Found no exit events during vehicle short circuiting. Events = ");
                                sb13.append(valueOf13);
                                sb13.toString();
                            }
                            list2.add(bexy.m96075a(0, 0, bexy.f112993a.mo62774a()));
                            String valueOf522222 = String.valueOf(list2);
                            StringBuilder sb622222 = new StringBuilder(String.valueOf(valueOf522222).length() + 33);
                            sb622222.append("transition events after filter = ");
                            sb622222.append(valueOf522222);
                            sb622222.toString();
                            emptyList = Collections.emptyList();
                            if (!list2.isEmpty()) {
                            }
                            m96033c(emptyList);
                        }
                    }
                } else {
                    list4 = list;
                }
                activityTransitionEvent = null;
                if (activityTransitionEvent != null) {
                }
            }
            list2 = list4;
            String valueOf5222222 = String.valueOf(list2);
            StringBuilder sb6222222 = new StringBuilder(String.valueOf(valueOf5222222).length() + 33);
            sb6222222.append("transition events after filter = ");
            sb6222222.append(valueOf5222222);
            sb6222222.toString();
            emptyList = Collections.emptyList();
            if (!list2.isEmpty()) {
            }
            m96033c(emptyList);
        }
        return emptyList;
    }

    /* renamed from: a */
    public final synchronized void mo60973a(boolean z, int i, bfmj bfmj) {
        String str;
        String str2;
        Object[] objArr = new Object[2];
        if (i != 1) {
            str = "not inveh";
        } else {
            str = "inveh";
        }
        objArr[0] = str;
        if (!z) {
            str2 = "disconnect";
        } else {
            str2 = "connect";
        }
        objArr[1] = str2;
        if (cesh.f183401a.mo6606a().arTransitionVehicleBluetoothFilteringEnabled()) {
            if (i == 1 && z) {
                boolean z2 = this.f112963k;
                StringBuilder sb = new StringBuilder(57);
                sb.append("Changing the bluetooth connected from = ");
                sb.append(z2);
                sb.append(", to = true");
                sb.toString();
                this.f112963k = true;
                return;
            }
        }
        boolean z3 = this.f112963k;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Changing the bluetooth connected from = ");
        sb2.append(z3);
        sb2.append(", to false");
        sb2.toString();
        this.f112963k = false;
    }
}
