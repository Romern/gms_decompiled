package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.SleepClassifyEvent;
import com.google.android.gms.location.SleepSegmentEvent;
import com.google.android.gms.location.SleepSegmentRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bgds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgds extends bgdr {
    public bgds(rsk rsk) {
        super("SleepSegmentListeners", -1, rsk);
    }

    /* renamed from: a */
    protected static final bgcc m98652a(PendingIntent pendingIntent, boolean z, bhcv bhcv, String str, bgns bgns) {
        return new bgcc(pendingIntent, 0, bgns, bhcv, z, false, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62613b(bgcc bgcc) {
        bfor bfor = this.f116172a;
        if (bfor != null) {
            bfor.mo62052a(bfos.SLEEP_SEGMENT_REQUEST_DROPPED, bgcc.f116017h.hashCode(), bgcc.f116019j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62614c(bgcc bgcc) {
        bfor bfor = this.f116172a;
        if (bfor != null) {
            bfor.mo62052a(bfos.SLEEP_SEGMENT_REQUEST_REMOVED, bgcc.f116017h.hashCode(), bhcq.m100640a(bgcc.f116017h));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo62615d(bgcc bgcc) {
        bfor bfor = this.f116172a;
        if (bfor != null) {
            int hashCode = bgcc.f116017h.hashCode();
            String a = bhcq.m100640a(bgcc.f116017h);
            bfor.mo62047a(new bgde(bfos.SLEEP_SEGMENT_REQUEST_ADDED, bfor.mo62055b(), bfor.mo62045a(a), hashCode, hashCode, a, bgcc.f116022m));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo62616h() {
        return 3;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo62617i() {
        if (this.f116175h.isEmpty()) {
            return null;
        }
        return SleepSegmentRequest.m66874a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo62606a(bgcc bgcc) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT", bgcc.f116017h);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bgcc mo62607a(PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, bgns bgns) {
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return m98652a(pendingIntent, z, bhcv, str, bgns);
    }

    /* renamed from: a */
    public final void mo62608a(PendingIntent pendingIntent, bgjp bgjp) {
        if (cfam.m138532b()) {
            mo62687b(pendingIntent, this.f116173b);
        } else {
            super.mo62608a(pendingIntent, bgjp);
        }
        if (bgjp != null && bgjp.f116620a != null && cfam.m138536f()) {
            bewq a = bewq.m95998a(bgjp.f116620a);
            bxvd da = btzg.f153106g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btzg btzg = (btzg) da.f164949b;
            btzg.f153109b = 2;
            btzg.f153108a |= 1;
            String a2 = bhcq.m100640a(pendingIntent);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btzg btzg2 = (btzg) da.f164949b;
            a2.getClass();
            btzg2.f153108a |= 2;
            btzg2.f153110c = a2;
            a.mo61204a((btzg) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62609a(Context context, bgns bgns, PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, rnt rnt, bgjp bgjp) {
        String str2 = str;
        bgjp bgjp2 = bgjp;
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        if (!cfam.m138532b()) {
            super.mo62609a(context, bgns, pendingIntent, sleepSegmentRequest, z, bhcv, str, rnt, bgjp);
        } else {
            this.f116173b = bgjp2;
            String hexString = Integer.toHexString(pendingIntent.hashCode());
            String targetPackage = pendingIntent.getTargetPackage();
            int length = String.valueOf(hexString).length();
            StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(targetPackage).length() + String.valueOf(str).length());
            sb.append("adding SleepSegmentListeners pendingIntent=");
            sb.append(hexString);
            sb.append(", packageName=");
            sb.append(targetPackage);
            sb.append(", tag=");
            sb.append(str2);
            sb.toString();
            bgcc a = m98652a(pendingIntent, z, bhcv, str2, bgns);
            this.f116175h.put(pendingIntent, a);
            if (this.f116172a != null) {
                mo62615d(a);
            }
            mo62688b(bgjp2);
            m98629a(rnt, Status.f30107a);
        }
        if (cfam.m138536f()) {
            String a2 = bhcq.m100640a(pendingIntent);
            bewq a3 = bewq.m95998a(context);
            bxvd da = btzg.f153106g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btzg btzg = (btzg) da.f164949b;
            btzg.f153109b = 1;
            int i = 1 | btzg.f153108a;
            btzg.f153108a = i;
            a2.getClass();
            btzg.f153108a = i | 2;
            btzg.f153110c = a2;
            a3.mo61204a((btzg) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62610a(Context context, Object obj, Bundle bundle, bgjp bgjp) {
        Iterator it;
        bfnn bfnn;
        bevo bevo;
        Context context2 = context;
        bgjp bgjp2 = bgjp;
        bfnn bfnn2 = (bfnn) obj;
        Iterator it2 = this.f116175h.entrySet().iterator();
        boolean z = false;
        boolean z2 = false;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!cfam.m138532b() && cesb.m138150f()) {
                bero.m95594b(context2, (PendingIntent) entry.getKey());
            }
            int a = mo62686a(context2, bfnn2, bundle, (bgcc) entry.getValue());
            int i = 2;
            if (a == 0) {
                it2.remove();
                if (cfam.m138536f()) {
                    String a2 = bhcq.m100640a((PendingIntent) entry.getKey());
                    bewq a3 = bewq.m95998a(context);
                    bxvd da = btzg.f153106g.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z;
                    }
                    btzg btzg = (btzg) da.f164949b;
                    btzg.f153109b = 9;
                    int i2 = btzg.f153108a | 1;
                    btzg.f153108a = i2;
                    a2.getClass();
                    btzg.f153108a = i2 | 2;
                    btzg.f153110c = a2;
                    a3.mo61204a((btzg) da.mo74062i());
                    z2 = true;
                } else {
                    z2 = true;
                }
            } else if (!(a == 1 || a == 2)) {
                StringBuilder sb = new StringBuilder(76);
                sb.append("Invalid return value received while reporting result to client = ");
                sb.append(a);
                sb.toString();
            }
            bgcc bgcc = (bgcc) entry.getValue();
            if (bfnn2.f114493a == null) {
                bfnn = bfnn2;
                it = it2;
            } else if (cfam.m138536f()) {
                List<SleepSegmentEvent> list = bfnn2.f114493a;
                if (bgjp2 != null) {
                    bevo = bgjp.mo62770cy();
                } else {
                    bevo = null;
                }
                String a4 = bhcq.m100640a(bgcc.f116017h);
                long currentTimeMillis = System.currentTimeMillis();
                bxvd da2 = btzg.f153106g.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = z;
                }
                btzg btzg2 = (btzg) da2.f164949b;
                a4.getClass();
                btzg2.f153108a |= 2;
                btzg2.f153110c = a4;
                int i3 = 7;
                for (SleepSegmentEvent sleepSegmentEvent : list) {
                    int i4 = sleepSegmentEvent.f79392c;
                    if (i4 == i) {
                        i3 = 8;
                    } else if (i4 == 1) {
                        i3 = 9;
                    }
                    bxvd da3 = btzh.f153114d.mo74144da();
                    bfnn bfnn3 = bfnn2;
                    Iterator it3 = it2;
                    bxyk a5 = bxzt.m124580a(sleepSegmentEvent.f79390a);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    btzh btzh = (btzh) da3.f164949b;
                    a5.getClass();
                    btzh.f153117b = a5;
                    btzh.f153116a |= 1;
                    bxyk a6 = bxzt.m124580a(sleepSegmentEvent.f79391b);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    btzh btzh2 = (btzh) da3.f164949b;
                    a6.getClass();
                    btzh2.f153118c = a6;
                    btzh2.f153116a |= 2;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    btzg btzg3 = (btzg) da2.f164949b;
                    btzh btzh3 = (btzh) da3.mo74062i();
                    btzh3.getClass();
                    if (!btzg3.f153111d.mo73666a()) {
                        btzg3.f153111d = bxvk.m124021a(btzg3.f153111d);
                    }
                    btzg3.f153111d.add(btzh3);
                    bfnn2 = bfnn3;
                    it2 = it3;
                    i = 2;
                }
                bfnn = bfnn2;
                it = it2;
                if (bevo != null) {
                    bfne a7 = bevo.mo61183a(currentTimeMillis);
                    bxvd da4 = btzh.f153114d.mo74144da();
                    bxyk a8 = bxzt.m124580a(((Long) a7.f114467a).longValue());
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    btzh btzh4 = (btzh) da4.f164949b;
                    a8.getClass();
                    btzh4.f153117b = a8;
                    btzh4.f153116a |= 1;
                    bxyk a9 = bxzt.m124580a(((Long) a7.f114468b).longValue());
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    btzh btzh5 = (btzh) da4.f164949b;
                    a9.getClass();
                    btzh5.f153118c = a9;
                    btzh5.f153116a |= 2;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    btzg btzg4 = (btzg) da2.f164949b;
                    btzh btzh6 = (btzh) da4.mo74062i();
                    btzh6.getClass();
                    btzg4.f153112e = btzh6;
                    btzg4.f153108a |= 4;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btzg btzg5 = (btzg) da2.f164949b;
                btzg5.f153109b = i3 - 1;
                btzg5.f153108a |= 1;
                bxyk a10 = bxzt.m124580a(System.currentTimeMillis());
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btzg btzg6 = (btzg) da2.f164949b;
                a10.getClass();
                btzg6.f153113f = a10;
                btzg6.f153108a |= 8;
                bewq.m95998a(context).mo61204a((btzg) da2.mo74062i());
            } else {
                bfnn = bfnn2;
                it = it2;
            }
            bfnn2 = bfnn;
            it2 = it;
            z = false;
        }
        if (z2) {
            mo62688b(bgjp2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62612a(Object obj, Bundle bundle, bgcc bgcc, Intent intent) {
        bfnn bfnn = (bfnn) obj;
        List<SleepSegmentEvent> list = bfnn.f114493a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (SleepSegmentEvent sleepSegmentEvent : list) {
                arrayList.add(sef.m35074a(sleepSegmentEvent));
            }
            intent.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT", arrayList);
            return true;
        }
        List list2 = bfnn.f114494b;
        if (list2 == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(sef.m35074a((SleepClassifyEvent) list2.get(i)));
        }
        intent.putExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT", arrayList2);
        return true;
    }
}
