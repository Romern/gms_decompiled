package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.location.ActivityRecognitionRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bgbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgbg extends squ {

    /* renamed from: a */
    public String[] f115981a;

    /* renamed from: b */
    public long f115982b = 0;

    /* renamed from: g */
    public final Map f115983g = new ConcurrentHashMap();

    /* renamed from: h */
    public final ssq f115984h = new ssq();

    /* renamed from: i */
    public final List f115985i = new ArrayList();

    /* renamed from: j */
    public bhcv f115986j = new bhcw();

    /* renamed from: k */
    public ActivityRecognitionRequest f115987k;

    /* renamed from: l */
    public boolean f115988l;

    /* renamed from: m */
    public final bhcl f115989m;

    /* renamed from: n */
    public bfor f115990n;

    /* renamed from: o */
    public Map f115991o;

    /* renamed from: p */
    public final List f115992p;

    /* renamed from: q */
    private final rsk f115993q;

    public bgbg(Context context, Handler handler, rsk rsk, bhcl bhcl) {
        super(new String[]{cesb.m138146b()}, context, handler);
        aefy aefy = new aefy();
        aefy.mo34115a(Long.MAX_VALUE);
        this.f115987k = aefy.mo34113a();
        this.f115988l = false;
        this.f115990n = null;
        this.f115991o = new ConcurrentHashMap();
        this.f115993q = rsk;
        this.f115989m = bhcl;
        this.f115992p = new ArrayList();
    }

    /* renamed from: i */
    public static final Intent m98504i() {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.EXTRA_RELEASE_VERSION", 2023);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9714a(int i) {
        mo62371g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9718b(sqt sqt) {
        beue beue = (beue) sqt;
        mo62602a(beue.f112467g, beue.f112465e, beue.f112463c, (ActivityRecognitionRequest) beue.f112464d, beue.f112461a, beue.f112462b);
    }

    /* renamed from: c */
    public final PendingIntent mo62604c(String str) {
        for (PendingIntent pendingIntent : this.f115983g.keySet()) {
            if (str.equals(pendingIntent.getTargetPackage())) {
                return pendingIntent;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final void mo62371g() {
        bhcv bhcv;
        this.f115988l = false;
        this.f115991o = new ConcurrentHashMap();
        this.f115992p.clear();
        Iterator it = this.f115983g.values().iterator();
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            bgbe bgbe = (bgbe) it.next();
            String valueOf = String.valueOf(bgbe);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Still have activity intent receiver ");
            sb.append(valueOf);
            sb.toString();
            if (bgbe.f115977d || bgbe.f116017h.getTargetPackage().equals("com.google.android.apps.activitydatacollection")) {
                this.f115992p.add(bgbe);
            }
            if (!bgbe.f115976c) {
                j = Math.min(j, bgbe.f116051q);
                j2 = Math.min(j2, Math.max(bgbe.f116018i, bgbe.f116051q));
            }
            if (!this.f115988l && !bgbe.f116025p) {
                z = false;
            }
            this.f115988l = z;
            int[] iArr = bgbe.f115975b;
            if (iArr != null) {
                for (int i : iArr) {
                    Map map = this.f115991o;
                    Integer valueOf2 = Integer.valueOf(i);
                    if (!map.containsKey(valueOf2) || ((Long) this.f115991o.get(valueOf2)).longValue() > bgbe.f116051q) {
                        this.f115991o.put(valueOf2, Long.valueOf(bgbe.f116051q));
                    }
                }
            }
        }
        this.f115986j = new bhcw();
        double d = (double) j;
        Double.isNaN(d);
        long j3 = (long) (((d + 1.0d) * 3.0d) / 2.0d);
        for (bgbe bgbe2 : this.f115983g.values()) {
            if (bgbe2.f116051q < j3 && (bhcv = bgbe2.f116023n) != null) {
                this.f115986j.mo63558a(bhcv);
            }
        }
        StringBuilder sb2 = new StringBuilder(130);
        sb2.append("activityListenersChanged. Consolidated request intervalmillis = ");
        sb2.append(j);
        sb2.append(", MaxReportLatencyMilli = ");
        sb2.append(j2);
        sb2.toString();
        aefy aefy = new aefy();
        aefy.mo34115a(j);
        aefy.mo34116b(j2);
        aefy.f63349f = !this.f115992p.isEmpty();
        this.f115987k = aefy.mo34113a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo62605h() {
        return this.f115983g.size();
    }

    /* renamed from: a */
    public final void mo62601a(PendingIntent pendingIntent) {
        bfor bfor = this.f115990n;
        if (bfor != null) {
            bfor.mo62052a(bfos.ACTIVITY_PENDING_INTENT_REMOVED, pendingIntent.hashCode(), pendingIntent.getTargetPackage());
        }
        bgbe bgbe = (bgbe) this.f115983g.remove(pendingIntent);
        if (bgbe == null) {
            String valueOf = String.valueOf(pendingIntent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
            sb.append("Unable to find the activity detection pendingIntent to remove: ");
            sb.append(valueOf);
            sb.toString();
            return;
        }
        bgbe.mo62594a();
        mo62371g();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public final void mo62602a(Context context, bgns bgns, PendingIntent pendingIntent, ActivityRecognitionRequest activityRecognitionRequest, boolean z, boolean z2) {
        boolean z3;
        long j;
        boolean z4;
        ActivityRecognitionRequest activityRecognitionRequest2 = activityRecognitionRequest;
        if (!bero.m95593a(context, pendingIntent)) {
            long j2 = activityRecognitionRequest2.f79292a;
            if (!cese.m138157f()) {
                z3 = false;
            } else {
                z3 = !z2 && j2 < cesh.m138174f();
            }
            if (z3) {
                long f = cesh.m138174f();
                String targetPackage = pendingIntent.getTargetPackage();
                long j3 = activityRecognitionRequest2.f79292a;
                long f2 = cesh.m138174f();
                StringBuilder sb = new StringBuilder(String.valueOf(targetPackage).length() + 109);
                sb.append("throttled period millis for package = ");
                sb.append(targetPackage);
                sb.append(", from interval = ");
                sb.append(j3);
                sb.append(", to interval");
                sb.append(f2);
                sb.toString();
                j = f;
            } else {
                j = j2;
            }
            String str = activityRecognitionRequest2.f79295d;
            if (cese.m138156e()) {
                bewq a = bewq.m95998a(context);
                String targetPackage2 = pendingIntent.getTargetPackage();
                long currentTimeMillis = System.currentTimeMillis();
                bxvd da = btxm.f152814q.mo74144da();
                bxvd da2 = btxs.f152847e.mo74144da();
                btyc a2 = bewq.m95999a(targetPackage2, str);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btxs btxs = (btxs) da2.f164949b;
                a2.getClass();
                btxs.f152850b = a2;
                int i = btxs.f152849a | 1;
                btxs.f152849a = i;
                long j4 = activityRecognitionRequest2.f79292a;
                int i2 = i | 2;
                btxs.f152849a = i2;
                btxs.f152851c = j4;
                btxs.f152849a = i2 | 4;
                btxs.f152852d = currentTimeMillis;
                btxs btxs2 = (btxs) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btxm btxm = (btxm) da.f164949b;
                btxs2.getClass();
                btxm.f152817b = btxs2;
                btxm.f152816a |= 1;
                qwo a3 = a.f112849a.mo24333a((btxm) da.mo74062i());
                a3.mo24328b(1);
                a3.mo24327b();
            }
            String hexString = Integer.toHexString(pendingIntent.hashCode());
            String targetPackage3 = pendingIntent.getTargetPackage();
            long j5 = activityRecognitionRequest2.f79299h;
            boolean z5 = activityRecognitionRequest2.f79293b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA + String.valueOf(targetPackage3).length() + String.valueOf(str).length());
            sb2.append("adding activity pendingIntent=");
            sb2.append(hexString);
            sb2.append(", packageName=");
            sb2.append(targetPackage3);
            sb2.append(", tag=");
            sb2.append(str);
            sb2.append(", periodMillis=");
            sb2.append(j);
            sb2.append(", maxReportLatencyMillis=");
            sb2.append(j5);
            sb2.append(", forceDetectionNow=");
            sb2.append(z5);
            sb2.toString();
            bfor bfor = this.f115990n;
            if (bfor != null) {
                int hashCode = pendingIntent.hashCode();
                String targetPackage4 = pendingIntent.getTargetPackage();
                long j6 = activityRecognitionRequest2.f79299h;
                z4 = z3;
                bfor.mo62047a(new bgdb(bfos.ACTIVITY_PENDING_INTENT_ADDED, bfor.mo62055b(), bfor.mo62045a(targetPackage4), hashCode, (int) Math.min(j / 1000, 2147483647L), (int) Math.min(j6 / 1000, 2147483647L), hashCode, targetPackage4, str, j, j6));
            } else {
                z4 = z3;
            }
            long j7 = j;
            bgbe bgbe = new bgbe(this, pendingIntent, activityRecognitionRequest2.f79292a, activityRecognitionRequest2.f79299h, bgns, new bhcw(activityRecognitionRequest2.f79294c), z, str, activityRecognitionRequest2.f79296e, activityRecognitionRequest2.f79297f);
            bgbe bgbe2 = (bgbe) this.f115983g.put(pendingIntent, bgbe);
            if (bgbe2 != null) {
                bgbe2.mo62594a();
            }
            if (z4) {
                bgbe.mo62595a(j7);
            }
            mo62371g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9717a(sqt sqt) {
        mo62601a(((beue) sqt).f112463c);
    }

    /* renamed from: a */
    public final boolean mo62603a(Context context, Intent intent, bgbe bgbe) {
        if (bgbe.mo62597a(context, intent)) {
            return true;
        }
        String valueOf = String.valueOf(bgbe);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("dropping intent receiver");
        sb.append(valueOf);
        sb.toString();
        Intent intent2 = new Intent();
        intent2.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT", bgbe.f116017h);
        this.f115993q.mo25067b((Parcelable) intent2);
        bfor bfor = this.f115990n;
        if (bfor == null) {
            return false;
        }
        bfor.mo62052a(bfos.ACTIVITY_PENDING_INTENT_DROPPED, bgbe.f116017h.hashCode(), bgbe.f116017h.getTargetPackage());
        return false;
    }
}
