package p000;

import android.app.job.JobInfo;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.util.Log;

/* renamed from: apjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apjs implements apib {

    /* renamed from: a */
    private final adzi f84559a;

    /* renamed from: b */
    private final apjz f84560b;

    public apjs(adzi adzi, apjz apjz) {
        sdo.checkIfNull(adzi, "no JobScheduler provided");
        this.f84559a = adzi;
        this.f84560b = apjz;
    }

    /* renamed from: b */
    private static final boolean m70495b(apid apid) {
        return apid.mo47279p() || apid.mo47280q();
    }

    /* renamed from: a */
    public final void mo47255a(Handler handler) {
    }

    /* renamed from: a */
    public final void mo47256a(apid apid) {
        int i;
        if (m70495b(apid) && (i = apid.f84439i) >= 0) {
            this.f84559a.mo33955a(i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0136, code lost:
        if (r1 == 1) goto L_0x0138;
     */
    /* renamed from: a */
    public final void mo47257a(apid apid, apid apid2, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int a;
        int a2;
        if (m70495b(apid)) {
            int i3 = 0;
            if (apid.f84439i != -1) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34971a(z, (Object) "JobId was not populated.");
            try {
                adzi adzi = this.f84559a;
                apjz apjz = this.f84560b;
                if (!apid.mo47279p()) {
                    if (!apid.mo47280q()) {
                        int i4 = apid.f84445o;
                        StringBuilder sb = new StringBuilder(30);
                        sb.append("Unknown task type: ");
                        sb.append(i4);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (apid.f84439i >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sdo.m34975b(z2, "jobId needs to be set");
                aeca aeca = apid.f84444n;
                aebo aebo = aeca.f63119l;
                JobInfo.Builder builder = new JobInfo.Builder(apid.f84439i, apjz.f84583a);
                if (aeca.f63123p != 1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                JobInfo.Builder requiresCharging = builder.setRequiresCharging(z3);
                if (!apid.mo47279p() || !apid.f84436f) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                JobInfo.Builder persisted = requiresCharging.setPersisted(z4);
                int i5 = aeca.f63121n;
                if (i5 != 1) {
                    i2 = i5 != 2 ? 1 : 0;
                } else {
                    i2 = 2;
                }
                JobInfo.Builder requiredNetworkType = persisted.setRequiredNetworkType(i2);
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("_nts.tag", apid.mo47266e());
                persistableBundle.putString("_nts.cls", apid.mo47269g());
                persistableBundle.putString("_nts.pkg", apid.f84431a.f28806b);
                persistableBundle.putInt("_nts.usr", (int) apid.f84431a.f28809e);
                JobInfo.Builder extras = requiredNetworkType.setExtras(persistableBundle);
                if (aeca.f63125r != 1) {
                    long j = ((long) aebo.f63079c) * 1000;
                    if (aebo.f63078b != 1) {
                        i3 = 1;
                    }
                    extras.setBackoffCriteria(j, i3);
                } else {
                    extras.setRequiresDeviceIdle(true);
                }
                if (apid.f84445o == 2) {
                    for (aeab aeab : ((aead) apid.f84444n).f62980a) {
                        extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aeab.f62977a, aeab.f62978b));
                    }
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    extras.setMinimumLatency(Math.max(0L, apid.mo47270h() - elapsedRealtime));
                    if (apid.f84443m.f28726b.isEmpty() && (a = aaoz.m21776a(apid.f84443m.f28727c)) != 0 && a == 2 && (a2 = aaov.m21772a(apid.f84443m.f28728d)) != 0 && a2 == 2) {
                        int a3 = aaox.m21774a(apid.f84443m.f28731g);
                        if (a3 == 0) {
                        }
                        extras.setOverrideDeadline(Math.max(0L, apid.mo47272i() - elapsedRealtime));
                    }
                }
                JobInfo build = extras.build();
                aapm aapm = apid.f84431a;
                if (adzi.mo33953a(build, aapm.f28806b, aajg.m21331a((int) aapm.f28809e), apid.mo47266e()) != 1) {
                    Log.e("NetworkScheduler", "Task was not scheduled.");
                }
            } catch (IllegalStateException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("NetworkScheduler", valueOf.length() == 0 ? new String("dropping task because JobScheduler threw exception: ") : "dropping task because JobScheduler threw exception: ".concat(valueOf));
            }
        } else if (apid2 != null) {
            mo47256a(apid2);
        }
    }
}
