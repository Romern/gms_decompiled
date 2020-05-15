package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: bext */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bext implements bgmq, berm, beud {

    /* renamed from: a */
    public static final Object f112974a = new Object();

    /* renamed from: b */
    public static bext f112975b;

    /* renamed from: c */
    public final bgmk f112976c;

    /* renamed from: d */
    public boolean f112977d = false;

    /* renamed from: e */
    public long f112978e = -1;

    /* renamed from: f */
    public long f112979f = cese.m138162k();

    /* renamed from: g */
    public ActivityTransitionRequest f112980g;

    /* renamed from: h */
    public boolean f112981h = false;

    /* renamed from: i */
    public final bgiz f112982i;

    /* renamed from: j */
    private final berg f112983j;

    /* renamed from: k */
    private final bexs f112984k;

    /* renamed from: l */
    private final bexn f112985l;

    public bext(bgmk bgmk, berg berg, bgiz bgiz, bexs bexs, bexn bexn) {
        this.f112976c = bgmk;
        this.f112983j = berg;
        this.f112982i = bgiz;
        this.f112984k = bexs;
        this.f112985l = bexn;
    }

    /* renamed from: a */
    private static List m96052a(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) it.next();
            Iterator it2 = list2.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                ActivityTransition activityTransition = (ActivityTransition) it2.next();
                if (activityTransitionEvent.f79307a == activityTransition.f79305a && activityTransitionEvent.f79308b == activityTransition.f79306b) {
                    arrayList.add(activityTransitionEvent);
                    z = true;
                }
            }
            if (!z) {
                String valueOf = String.valueOf(activityTransitionEvent);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Not an interested transition: ");
                sb.append(valueOf);
                sb.toString();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo60966a(bgmv bgmv) {
    }

    /* renamed from: a */
    public final void mo60970a(List list, int[] iArr) {
    }

    /* renamed from: b */
    public final void mo60978b(int i) {
    }

    /* renamed from: c */
    public final synchronized void mo60986c(boolean z) {
        boolean z2 = this.f112977d;
        StringBuilder sb = new StringBuilder(52);
        sb.append("Changing the wifi connected from = ");
        sb.append(z2);
        sb.append(", to = ");
        sb.append(z);
        sb.toString();
        this.f112977d = z;
        this.f112978e = z ? System.currentTimeMillis() : -1;
    }

    /* renamed from: s */
    public final void mo61003s() {
    }

    /* renamed from: a */
    public final void mo60965a(bgmu bgmu) {
        if (bgmu.f116827b != 0) {
            return;
        }
        if (!this.f112977d || !cesk.f183403a.mo6606a().enableConnectedWifiFilterAudioFusion() || bgmu.f116826a != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ActivityTransitionEvent(20, bgmu.f116826a, bgmu.f116828c * 1000000));
            this.f112983j.mo61012a(arrayList, 3);
        }
    }

    /* renamed from: a */
    public final void mo61240a(ActivityRecognitionResult activityRecognitionResult, boolean z) {
        if (this.f112981h) {
            bexn bexn = this.f112985l;
            boolean z2 = false;
            if (cesh.f183401a.mo6606a().arTransitionWifiFilteringEnabled() && this.f112977d) {
                z2 = true;
            }
            List a = bexn.mo61231a(activityRecognitionResult, z, z2);
            if (a == null || a.isEmpty()) {
                StringBuilder sb = new StringBuilder(55);
                sb.append("No valid transitions found. Deep still mode was = ");
                sb.append(z);
                sb.toString();
                return;
            }
            List a2 = m96052a(a, this.f112980g.f79311b);
            if (!a2.isEmpty()) {
                this.f112983j.mo61012a(a2, 2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo61241a(ActivityTransitionRequest activityTransitionRequest) {
        if (activityTransitionRequest != null) {
            if (!activityTransitionRequest.f79311b.isEmpty()) {
                if (this.f112984k.mo61005u()) {
                    this.f112980g = activityTransitionRequest;
                    HashMap hashMap = new HashMap();
                    for (ActivityTransition activityTransition : activityTransitionRequest.f79311b) {
                        hashMap.put(activityTransition, 0);
                    }
                    if (cesh.m138171c()) {
                        this.f112982i.mo62875a();
                        this.f112981h = false;
                    }
                    this.f112984k.mo60971a(hashMap);
                    return;
                } else if (cesh.m138175g()) {
                    bgiz bgiz = this.f112982i;
                    this.f112980g = activityTransitionRequest;
                    if (!this.f112981h) {
                        bgiz.mo62876a(cese.m138162k());
                        this.f112981h = true;
                    }
                    if (cesh.m138171c()) {
                        this.f112984k.mo60971a(null);
                    }
                }
            }
        }
        this.f112980g = null;
        if (this.f112984k.mo61005u()) {
            this.f112984k.mo60971a(null);
        }
        if (this.f112981h) {
            this.f112982i.mo62875a();
            this.f112981h = false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnic.a(java.lang.Object, java.lang.Object):bnic
     arg types: [int, int]
     candidates:
      bnic.a(int, java.lang.Object[]):bnic
      bnic.a(int, int):boolean
      bngm.a(java.lang.Object[], int):int
      bnic.a(java.lang.Object, java.lang.Object):bnic */
    /* renamed from: a */
    public final synchronized void mo60969a(List list) {
        if (this.f112984k.mo61005u()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bgmt bgmt = (bgmt) it.next();
                String a = DetectedActivity.m66831a(bgmt.f116824b);
                int i = bgmt.f116825c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = bgmt.f116823a;
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 70);
                sb.append("Received event: [");
                sb.append(a);
                sb.append(", ");
                sb.append(i);
                sb.append("] happened ");
                double d = (double) elapsedRealtime;
                Double.isNaN(d);
                double d2 = (double) j;
                Double.isNaN(d2);
                sb.append((d / 1000.0d) - (d2 / 1000.0d));
                sb.append("s ago");
                sb.toString();
            }
            if (this.f112980g != null && !list.isEmpty()) {
                List arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    bgmt bgmt2 = (bgmt) it2.next();
                    try {
                        arrayList.add(new ActivityTransitionEvent(bgmt2.f116824b, bgmt2.f116825c, bgmt2.f116823a * 1000000));
                    } catch (Exception e) {
                        int i2 = bgmt2.f116825c;
                        int i3 = bgmt2.f116824b;
                        StringBuilder sb2 = new StringBuilder(70);
                        sb2.append("Received invalid transition type = ");
                        sb2.append(i2);
                        sb2.append(", Activity = ");
                        sb2.append(i3);
                        sb2.toString();
                    }
                }
                if (!cery.m138142b()) {
                    arrayList = bexu.m96065a(arrayList, bnic.m109490a((Object) 16, (Object) 17));
                }
                List a2 = m96052a(this.f112985l.mo61233a(arrayList, this.f112977d), this.f112980g.f79311b);
                if (!a2.isEmpty()) {
                    this.f112983j.mo61012a(a2, 1);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bext.a(com.google.android.gms.location.ActivityRecognitionResult, boolean):void
     arg types: [com.google.android.gms.location.ActivityRecognitionResult, int]
     candidates:
      bext.a(java.util.List, java.util.List):java.util.List
      bext.a(java.util.List, int[]):void
      bgmq.a(java.util.List, int[]):void
      bext.a(com.google.android.gms.location.ActivityRecognitionResult, boolean):void */
    /* renamed from: a */
    public final void mo61057a(boolean z) {
        StringBuilder sb = new StringBuilder(71);
        sb.append("Activity recognition deep still mode has changed. deepStillMode = ");
        sb.append(z);
        sb.toString();
        if (z && this.f112981h && cesh.f183401a.mo6606a().arDeepStillTransitioningEnabled()) {
            mo61240a(new ActivityRecognitionResult(new DetectedActivity(3, 100), System.currentTimeMillis(), SystemClock.elapsedRealtime(), 0, (Bundle) null), true);
        }
    }

    /* renamed from: a */
    public final boolean mo61242a() {
        return this.f112979f == cese.m138155d();
    }
}
